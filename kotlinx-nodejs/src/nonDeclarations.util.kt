@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package util

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

external interface InspectOptions : NodeJS.InspectOptions

typealias CustomInspectFunction = (depth: Number, options: InspectOptionsStylized) -> String

external interface InspectOptionsStylized : InspectOptions {
    fun stylize(text: String, styleType: String /* "special" | "number" | "bigint" | "boolean" | "undefined" | "null" | "string" | "symbol" | "date" | "regexp" | "module" */): String
}

typealias CustomPromisifyLegacy<TCustom> = Function<*>

typealias CustomPromisifySymbol<TCustom> = Function<*>

external interface `T$64` {
    var fatal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ignoreBOM: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$65` {
    var stream: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EncodeIntoResult {
    var read: Number
    var written: Number
}