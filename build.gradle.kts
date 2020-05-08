plugins {
    id("org.jetbrains.kotlin.js")
}

allprojects {
    repositories {
        maven("https://kotlin.bintray.com/kotlin-bootstrap/")
        maven("https://kotlin.bintray.com/kotlin-dev/")
        maven("https://kotlin.bintray.com/kotlin-eap/")
        mavenCentral()
    }
}

