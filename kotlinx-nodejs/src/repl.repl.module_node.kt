@file:JsModule("repl")
@file:JsNonModule
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
import vm.Context
import NodeJS.ReadableStream
import NodeJS.WritableStream
import NodeJS.ReadOnlyDict
import readline.Interface

external var writer: REPLWriter /* REPLWriter & `T$61` */

external open class REPLServer : Interface {
    open var context: Context
    open var inputStream: ReadableStream
    open var outputStream: WritableStream
    open var commands: ReadOnlyDict<REPLCommand>
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
    open var replMode: Any
    open fun defineCommand(keyword: String, cmd: REPLCommandAction)
    open fun defineCommand(keyword: String, cmd: REPLCommand)
    open fun displayPrompt(preserveCursor: Boolean = definedExternally)
    open fun clearBufferedCommand()
    open fun setupHistory(path: String, cb: (err: Error?, repl: REPLServer /* this */) -> Unit)
    override fun addListener(event: String, listener: (args: Any) -> Unit): REPLServer /* this */
    override fun addListener(event: String /* "close" | "pause" | "resume" | "SIGCONT" | "SIGINT" | "SIGTSTP" | "exit" */, listener: () -> Unit): REPLServer /* this */
    override fun addListener(event: String /* "line" */, listener: (input: String) -> Unit): REPLServer /* this */
    open fun addListener(event: String /* "reset" */, listener: (context: Context) -> Unit): REPLServer /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    override fun emit(event: String /* "close" | "pause" | "resume" | "SIGCONT" | "SIGINT" | "SIGTSTP" | "exit" */): Boolean
    override fun emit(event: String /* "line" */, input: String): Boolean
    open fun emit(event: String /* "reset" */, context: Context): Boolean
    override fun on(event: String, listener: (args: Any) -> Unit): REPLServer /* this */
    override fun on(event: String /* "close" | "pause" | "resume" | "SIGCONT" | "SIGINT" | "SIGTSTP" | "exit" */, listener: () -> Unit): REPLServer /* this */
    override fun on(event: String /* "line" */, listener: (input: String) -> Unit): REPLServer /* this */
    open fun on(event: String /* "reset" */, listener: (context: Context) -> Unit): REPLServer /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): REPLServer /* this */
    override fun once(event: String /* "close" | "pause" | "resume" | "SIGCONT" | "SIGINT" | "SIGTSTP" | "exit" */, listener: () -> Unit): REPLServer /* this */
    override fun once(event: String /* "line" */, listener: (input: String) -> Unit): REPLServer /* this */
    open fun once(event: String /* "reset" */, listener: (context: Context) -> Unit): REPLServer /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): REPLServer /* this */
    override fun prependListener(event: String /* "close" | "pause" | "resume" | "SIGCONT" | "SIGINT" | "SIGTSTP" | "exit" */, listener: () -> Unit): REPLServer /* this */
    override fun prependListener(event: String /* "line" */, listener: (input: String) -> Unit): REPLServer /* this */
    open fun prependListener(event: String /* "reset" */, listener: (context: Context) -> Unit): REPLServer /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): REPLServer /* this */
    override fun prependOnceListener(event: String /* "close" | "pause" | "resume" | "SIGCONT" | "SIGINT" | "SIGTSTP" | "exit" */, listener: () -> Unit): REPLServer /* this */
    override fun prependOnceListener(event: String /* "line" */, listener: (input: String) -> Unit): REPLServer /* this */
    open fun prependOnceListener(event: String /* "reset" */, listener: (context: Context) -> Unit): REPLServer /* this */
}

external var REPL_MODE_SLOPPY: Any

external var REPL_MODE_STRICT: Any

external fun start(options: String = definedExternally): REPLServer

external fun start(options: ReplOptions = definedExternally): REPLServer