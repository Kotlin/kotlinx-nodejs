plugins {
    id("org.jetbrains.kotlin.js")
    `maven-publish`
    id("signing")
}

group = "org.jetbrains.kotlinx"
version = "0.0.7"

kotlin {
    js {
        nodejs()
    }
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
    publications {
        register("maven", MavenPublication::class) {
            from(components["kotlin"])
            artifact(sourcesJar.get())

            pom {
                // Project name missing, Project description missing, Project URL missing, License information missing, SCM URL missing, Developer information missing
                name.set("kotlinx.nodejs")
                description.set("Kotlin nodejs API")
                url.set("https://github.com/Kotlin/kotlinx-nodejs")
                licenses {
                    license {
                        url.set("https://github.com/Kotlin/kotlinx-nodejs/blob/master/LICENSE")
                        name.set("Apache-2.0")
                    }
                }
                scm {
                    url.set("https://github.com/Kotlin/kotlinx-nodejs")
                }
                developers {
                    developer {
                        name.set("kotlin")
                    }
                }
            }
        }
    }
    repositories {
        maven {
            name = "ossSnapshots"
            url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
            credentials {
                username = System.getenv("SONATYPE_USER")
                password = System.getenv("SONATYPE_PASSWORD")
            }
        }

        maven {
            name = "ossStaging"
            setUrl {
                uri("https://oss.sonatype.org/service/local/staging/deploy/maven2/")
            }
            credentials {
                username = System.getenv("SONATYPE_USER")
                password = System.getenv("SONATYPE_PASSWORD")
            }
        }
    }
}

signing {
    // GPG_PRIVATE_KEY should contain the armoured private key that starts with -----BEGIN PGP PRIVATE KEY BLOCK-----
    // It can be obtained with gpg --armour --export-secret-keys KEY_ID
    useInMemoryPgpKeys(System.getenv("GPG_PRIVATE_KEY"), System.getenv("GPG_PRIVATE_KEY_PASSWORD"))
    sign(publishing.publications)
}
tasks.withType(Sign::class.java).configureEach {
    isEnabled = !System.getenv("GPG_PRIVATE_KEY").isNullOrBlank()
}
