pluginManagement {
    repositories {
        maven("https://kotlin.bintray.com/kotlin-bootstrap/")
        maven("https://kotlin.bintray.com/kotlin-dev/")
        maven("https://kotlin.bintray.com/kotlin-eap/")
        gradlePluginPortal()
    }
    resolutionStrategy {
        val kotlinVersion: String? by settings
        val kotlinVersionResolved = kotlinVersion ?:  ("1.4-M1").also {
            println("building with kotlin version ${it}")
            println("use -PkotlinVersion for setting non-default version")
        }

        eachPlugin {
            if (requested.id.id == "org.jetbrains.kotlin.js") {
                useModule("org.jetbrains.kotlin.js:org.jetbrains.kotlin.js.gradle.plugin:$kotlinVersionResolved")
            }
        }
    }
}

include(":kotlinx-nodejs")

