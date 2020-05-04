pluginManagement {
    repositories {
        maven("https://kotlin.bintray.com/kotlin-eap/")
        maven("https://kotlin.bintray.com/kotlin-bootstrap/")
        gradlePluginPortal()
    }
    resolutionStrategy {
        val kotlinVersionFromSettings: String? by settings
        val kotlinVersion = kotlinVersionFromSettings ?:  ("1.3.72").also {
            println("building with kotlin version ${it}")
            println("use -PkotlinVersion for setting non-default version")
        }

        eachPlugin {
            if (requested.id.id == "kotlin2js") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
            }
        }
    }
}

include(":kotlinx-nodejs")

