import com.jfrog.bintray.gradle.BintrayExtension

plugins {
    id("kotlin2js") version "1.3.71"
    `maven-publish`
    id("com.jfrog.bintray") version "1.8.4"
}

repositories {
    maven("https://kotlin.bintray.com/kotlin-bootstrap/")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

group = "org.jetbrains.kotlinx"
val artifactId = "kotlinx-nodejs"
version = "0.0.1"

val sourcesJar by tasks.registering(Jar::class) {
    classifier = "sources"
    from(project.the<SourceSetContainer>()["main"].allSource)
}

tasks.jar {
    from("${project(":nodejs").buildDir}/classes/kotlin/main/")
    dependsOn(":nodejs:classes")
}

publishing {
    publications.invoke {
        register("maven", MavenPublication::class) {
            artifactId = artifactId
            artifact(tasks.jar.get())
            artifact(sourcesJar.get())
        }
    }
}

bintray {
    user = System.getenv("BINTRAY_USER")
    key = System.getenv("BINTRAY_API_KEY")
    publish = true
    setPublications("maven")
    pkg(delegateClosureOf<BintrayExtension.PackageConfig> {
        repo = "kotlinx"
        name = "kotlinx.browser"
        userOrg = "kotlin"
        setLicenses("Apache-2.0")
        githubRepo = "Kotlin/kotlinx-nodejs"
        websiteUrl = "https://github.com/Kotlin/kotlinx-nodejs"
        issueTrackerUrl = "https://github.com/Kotlin/kotlinx-nodejs/issues"
        vcsUrl = "https://github.com/Kotlin/kotlinx-nodejs.git"
        description = "Kotlin browser API"
        setLabels("kotlin", "browser", "kotlinx", "document-object-model")
        desc = description
    })
}
