@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package readline

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
import NodeJS.ReadableStream
import NodeJS.WritableStream

external interface Key {
    var sequence: String?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var ctrl: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var meta: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var shift: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

typealias ReadLine = Interface

typealias Completer = (line: String) -> dynamic

typealias AsyncCompleter = (line: String, callback: (err: Error?, result: dynamic /* JsTuple<Array<String>, String> */) -> Unit) -> Any

external interface ReadLineOptions {
    var input: ReadableStream
    var output: WritableStream?
        get() = definedExternally
        set(value) = definedExternally
    var completer: dynamic /* Completer? | AsyncCompleter? */
        get() = definedExternally
        set(value) = definedExternally
    var terminal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var historySize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var prompt: String?
        get() = definedExternally
        set(value) = definedExternally
    var crlfDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var removeHistoryDuplicates: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var escapeCodeTimeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tabSize: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CursorPos {
    var rows: Number
    var cols: Number
}