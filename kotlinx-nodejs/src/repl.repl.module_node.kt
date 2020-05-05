@file:JsModule("repl")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")
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
import readline.Interface

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
    var replMode: dynamic /* Any? */
        get() = definedExternally
        set(value) = definedExternally
    var breakEvalOnSigint: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external var writer: REPLWriter /* REPLWriter & `T$70` */

external interface REPLCommand {
    var help: String?
        get() = definedExternally
        set(value) = definedExternally
    var action: REPLCommandAction
}

external interface `T$71` {
    @nativeGetter
    operator fun get(name: String): REPLCommand?
    @nativeSetter
    operator fun set(name: String, value: REPLCommand?)
}

external open class REPLServer : Interface {
    open var context: Context
    open var inputStream: ReadableStream
    open var outputStream: WritableStream
    open var commands: `T$71`
    open var editorMode: Boolean
    open var underscoreAssigned: Boolean
    open var last: Any
    open var underscoreErrAssigned: Boolean
    open var lastError: Any
    open var eval: REPLEval
    open var useColors: Boolean
    open var useGlobal: Boolean
    open var ignoreUndefined: Boolean
    open var writer: REPLWriter
    open var completer: dynamic /* Completer | AsyncCompleter */
    open var replMode: dynamic /* Any */
    open fun defineCommand(keyword: String, cmd: REPLCommandAction)
    open fun defineCommand(keyword: String, cmd: REPLCommand)
    open fun displayPrompt(preserveCursor: Boolean = definedExternally)
    open fun clearBufferedCommand()
    open fun setupHistory(path: String, cb: (err: Error?, repl: REPLServer /* this */) -> Unit)
    override fun addListener(event: String, listener: (args: Array<Any>) -> Unit): REPLServer /* this */
    override fun addListener(event: String, listener: () -> Unit): REPLServer /* this */
    override fun addListener(event: String /* "line" */, listener: (input: String) -> Unit): REPLServer /* this */
    open fun addListener(event: String /* "reset" */, listener: (context: Context) -> Unit): REPLServer /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    override fun emit(event: String): Boolean
    override fun emit(event: String /* "line" */, input: String): Boolean
    open fun emit(event: String /* "reset" */, context: Context): Boolean
    override fun on(event: String, listener: (args: Array<Any>) -> Unit): REPLServer /* this */
    override fun on(event: String, listener: () -> Unit): REPLServer /* this */
    override fun on(event: String /* "line" */, listener: (input: String) -> Unit): REPLServer /* this */
    open fun on(event: String /* "reset" */, listener: (context: Context) -> Unit): REPLServer /* this */
    override fun once(event: String, listener: (args: Array<Any>) -> Unit): REPLServer /* this */
    override fun once(event: String, listener: () -> Unit): REPLServer /* this */
    override fun once(event: String /* "line" */, listener: (input: String) -> Unit): REPLServer /* this */
    open fun once(event: String /* "reset" */, listener: (context: Context) -> Unit): REPLServer /* this */
    override fun prependListener(event: String, listener: (args: Array<Any>) -> Unit): REPLServer /* this */
    override fun prependListener(event: String, listener: () -> Unit): REPLServer /* this */
    override fun prependListener(event: String /* "line" */, listener: (input: String) -> Unit): REPLServer /* this */
    open fun prependListener(event: String /* "reset" */, listener: (context: Context) -> Unit): REPLServer /* this */
    override fun prependOnceListener(event: String, listener: (args: Array<Any>) -> Unit): REPLServer /* this */
    override fun prependOnceListener(event: String, listener: () -> Unit): REPLServer /* this */
    override fun prependOnceListener(event: String /* "line" */, listener: (input: String) -> Unit): REPLServer /* this */
    open fun prependOnceListener(event: String /* "reset" */, listener: (context: Context) -> Unit): REPLServer /* this */
}

external var REPL_MODE_SLOPPY: Any

external var REPL_MODE_STRICT: Any

external fun start(options: String = definedExternally): REPLServer

external fun start(options: ReplOptions = definedExternally): REPLServer

external fun start(): REPLServer
