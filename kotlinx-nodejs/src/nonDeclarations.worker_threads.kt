@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package worker_threads

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface WorkerOptions {
    var argv: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var env: dynamic /* NodeJS.Dict<String>? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var eval: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var workerData: Any?
        get() = definedExternally
        set(value) = definedExternally
    var stdin: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stdout: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stderr: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var execArgv: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var resourceLimits: ResourceLimits?
        get() = definedExternally
        set(value) = definedExternally
    var transferList: Array<dynamic /* ArrayBuffer | MessagePort */>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ResourceLimits {
    var maxYoungGenerationSizeMb: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxOldGenerationSizeMb: Number?
        get() = definedExternally
        set(value) = definedExternally
    var codeRangeSizeMb: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$66` {
    var message: Any
}