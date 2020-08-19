# kotlinx-nodejs

[![kotlinx-nodejs on Bintray](https://img.shields.io/bintray/v/kotlin/kotlinx/kotlinx.nodejs)](https://bintray.com/kotlin/kotlinx/kotlinx.nodejs)
[![JetBrains incubator project](https://jb.gg/badges/incubator.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+Gi^tHub)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0)

`kotlinx-nodejs` provides Kotlin [external declarations](https://kotlinlang.org/docs/reference/js-interop.html) for using the [Node.js API](https://nodejs.org/docs/latest/api/) from Kotlin code targeting JavaScript. 

## We're currently [experimental](https://kotlinlang.org/docs/reference/evolution/components-stability.html)!
**Right now the only thing we guarantee is that the provided source set is compiling.** There can be, unfortunately, 
some inconsistent, missing, redundant, or even unusable declarations.
 
Feel free to submit [issues and bug reports](https://github.com/Kotlin/kotlinx-nodejs/issues) as you encounter them. We will do our best to address them as soon as possible.


Keep in mind that these sources are generated with [Dukat](https://github.com/Kotlin/dukat) and **are not supposed to be edited manually**. Please do not send pull requests to this repository directly. Instead, please file an issue about the improvements you have in mind – we can then adjust the generator tool accordingly.

## Setup
To add `kotlinx-nodejs` to your project, make sure you have bintray added to your repositories. You can then add a dependency:

```kotlin
repositories {
    // . . .
    jcenter()
}

dependencies {
    // . . .
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.6")
}
```

