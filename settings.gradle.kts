pluginManagement {
    repositories {
        maven("https://kotlin.bintray.com/kotlin-bootstrap/")
        gradlePluginPortal()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "kotlin2js") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
        }
    }
}

include(":nodejs")

rootProject.name = "kotlinx-nodejs"
