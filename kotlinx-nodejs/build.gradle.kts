import com.jfrog.bintray.gradle.BintrayExtension

plugins {
    id("org.jetbrains.kotlin.js")
    `maven-publish`
    id("com.jfrog.bintray") version "1.8.4"
}

group = "org.jetbrains.kotlinx"
version = "0.0.1"

kotlin {
    sourceSets {
        main {
            kotlin.srcDir("src")
        }
    }
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile>().configureEach {
    kotlinOptions {
        moduleKind = "commonjs"
    }
}


val sourcesJar by tasks.registering(Jar::class) {
    classifier = "sources"
    from(kotlin.sourceSets["main"].kotlin.srcDirs)
}

publishing {
    publications.invoke {
        register("maven", MavenPublication::class) {
            from(components["kotlin"])
            artifact(sourcesJar.get())
        }
    }
}

bintray {
    apiUrl = "https://kotlin.bintray.com/kotlin-dev"
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
        description = "Kotlin nodejs API"
        setLabels("kotlin", "kotlinjs", "nodejs", "kotlinx")
        desc = description
    })
}
