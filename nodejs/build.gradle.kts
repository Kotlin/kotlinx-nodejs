plugins {
    id("kotlin2js")
}

repositories {
    mavenCentral()
    maven("https://kotlin.bintray.com/kotlin-bootstrap/")
}

sourceSets["main"].withConvention(org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet::class) {
    kotlin.srcDir("src")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile>().configureEach {
    kotlinOptions {
        moduleKind = "commonjs"
    }
}


dependencies {
    implementation(kotlin("stdlib-js"))
}