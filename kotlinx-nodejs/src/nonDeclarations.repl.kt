@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package repl

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
import vm.Context
import util.InspectOptions
import tsstdlib.SyntaxError

external interface ReplOptions {
    var prompt: String?
        get() = definedExternally
        set(value) = definedExternally
    var input: ReadableStream?
        get() = definedExternally
        set(value) = definedExternally
    var output: WritableStream?
        get() = definedExternally
        set(value) = definedExternally
    var terminal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var eval: REPLEval?
        get() = definedExternally
        set(value) = definedExternally
    var preview: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useColors: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useGlobal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ignoreUndefined: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var writer: REPLWriter?
        get() = definedExternally
        set(value) = definedExternally
    var completer: dynamic /* Completer? | AsyncCompleter? */
        get() = definedExternally
        set(value) = definedExternally
    var replMode: Any?
        get() = definedExternally
        set(value) = definedExternally
    var breakEvalOnSigint: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

typealias REPLEval = (self: REPLServer, evalCmd: String, context: Context, file: String, cb: (err: Error?, result: Any) -> Unit) -> Unit

typealias REPLWriter = (self: REPLServer, obj: Any) -> String

external interface `T$61` {
    var options: InspectOptions
}

typealias REPLCommandAction = (self: REPLServer, text: String) -> Unit

external interface REPLCommand {
    var help: String?
        get() = definedExternally
        set(value) = definedExternally
    var action: REPLCommandAction
}

typealias Recoverable = SyntaxError