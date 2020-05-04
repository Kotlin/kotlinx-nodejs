pluginManagement {
    repositories {
        maven("https://kotlin.bintray.com/kotlin-bootstrap/")
        maven("https://kotlin.bintray.com/kotlin-dev/")
        maven("https://kotlin.bintray.com/kotlin-eap/")
        gradlePluginPortal()
    }
    resolutionStrategy {
        val kotlinVersion: String? by settings
        val kotlinVersionResolved = kotlinVersion ?:  ("1.3.72").also {
            println("building with kotlin version ${it}")
            println("use -PkotlinVersion for setting non-default version")
        }

        eachPlugin {
            if (requested.id.id == "kotlin2js") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersionResolved")
            }
        }
    }
}

include(":kotlinx-nodejs")

