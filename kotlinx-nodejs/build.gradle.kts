import com.jfrog.bintray.gradle.BintrayExtension

plugins {
    id("kotlin2js")
    `maven-publish`
    id("com.jfrog.bintray") version "1.8.4"
}

group = "org.jetbrains.kotlinx"
version = "0.0.1"
val artifactId = "kotlinx-nodejs"

sourceSets["main"].withConvention(org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet::class) {
    kotlin.srcDir("src")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile>().configureEach {
    kotlinOptions {
        moduleKind = "commonjs"
        freeCompilerArgs += listOf("-Xir-produce-klib-dir", "-Xir-only")
    }
}

val sourcesJar by tasks.registering(Jar::class) {
    classifier = "sources"
    from(project.the<SourceSetContainer>()["main"].allSource)
}


dependencies {
    implementation(kotlin("stdlib-js"))
}


tasks.jar {
    from("${project(":kotlinx-nodejs").buildDir}/classes/kotlin/main/")
    dependsOn("::kotlinx-nodejs:classes")
}

publishing {
    publications.invoke {
        register("maven", MavenPublication::class) {
            artifactId = artifactId
            artifact(tasks.
            jar.get())
            artifact(sourcesJar.get())
        }
    }
}

bintray {
    user = System.getenv("BINTRAY_USER")
    key = System.getenv("BINTRAY_API_KEY")
    publish = true
    setPublications("maven")
    pkg(delegateClosureOf<com.jfrog.bintray.gradle.BintrayExtension.PackageConfig> {
        repo = "kotlinx"
        name = "kotlinx.nodejs"
        userOrg = "kotlin"
        setLicenses("Apache-2.0")
        githubRepo = "Kotlin/kotlinx-nodejs"
        websiteUrl = "https://github.com/Kotlin/kotlinx-nodejs"
        issueTrackerUrl = "https://github.com/Kotlin/kotlinx-nodejs/issues"
        vcsUrl = "https://github.com/Kotlin/kotlinx-nodejs.git"
        description = "Kotlin browser API"
        setLabels("kotlin", "nodejs", "kotlinx")
        desc = description
    })
}
