@file:JsModule("readline")
@file:JsNonModule
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
import Buffer
import events.EventEmitter.EventEmitter

external open class Interface : EventEmitter {
    open var terminal: Boolean
    open var line: String
    open var cursor: Number
    constructor(input: ReadableStream, output: WritableStream = definedExternally, completer: Completer = definedExternally, terminal: Boolean = definedExternally)
    constructor(input: ReadableStream, output: WritableStream = definedExternally, completer: AsyncCompleter = definedExternally, terminal: Boolean = definedExternally)
    constructor(options: ReadLineOptions)
    open fun setPrompt(prompt: String)
    open fun prompt(preserveCursor: Boolean = definedExternally)
    open fun question(query: String, callback: (answer: String) -> Unit)
    open fun pause(): Interface /* this */
    open fun resume(): Interface /* this */
    open fun close()
    open fun write(data: String, key: Key = definedExternally)
    open fun write(data: Buffer, key: Key = definedExternally)
    open fun getCursorPos(): CursorPos
    override fun addListener(event: String, listener: (args: Any) -> Unit): Interface /* this */
    open fun addListener(event: String /* "close" | "pause" | "resume" | "SIGCONT" | "SIGINT" | "SIGTSTP" */, listener: () -> Unit): Interface /* this */
    open fun addListener(event: String /* "line" */, listener: (input: String) -> Unit): Interface /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "close" | "pause" | "resume" | "SIGCONT" | "SIGINT" | "SIGTSTP" */): Boolean
    open fun emit(event: String /* "line" */, input: String): Boolean
    override fun on(event: String, listener: (args: Any) -> Unit): Interface /* this */
    open fun on(event: String /* "close" | "pause" | "resume" | "SIGCONT" | "SIGINT" | "SIGTSTP" */, listener: () -> Unit): Interface /* this */
    open fun on(event: String /* "line" */, listener: (input: String) -> Unit): Interface /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Interface /* this */
    open fun once(event: String /* "close" | "pause" | "resume" | "SIGCONT" | "SIGINT" | "SIGTSTP" */, listener: () -> Unit): Interface /* this */
    open fun once(event: String /* "line" */, listener: (input: String) -> Unit): Interface /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): Interface /* this */
    open fun prependListener(event: String /* "close" | "pause" | "resume" | "SIGCONT" | "SIGINT" | "SIGTSTP" */, listener: () -> Unit): Interface /* this */
    open fun prependListener(event: String /* "line" */, listener: (input: String) -> Unit): Interface /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Interface /* this */
    open fun prependOnceListener(event: String /* "close" | "pause" | "resume" | "SIGCONT" | "SIGINT" | "SIGTSTP" */, listener: () -> Unit): Interface /* this */
    open fun prependOnceListener(event: String /* "line" */, listener: (input: String) -> Unit): Interface /* this */
}

external fun createInterface(input: ReadableStream, output: WritableStream = definedExternally, completer: Completer = definedExternally, terminal: Boolean = definedExternally): Interface

external fun createInterface(input: ReadableStream, output: WritableStream = definedExternally, completer: AsyncCompleter = definedExternally, terminal: Boolean = definedExternally): Interface

external fun createInterface(options: ReadLineOptions): Interface

external fun emitKeypressEvents(stream: ReadableStream, readlineInterface: Interface = definedExternally)

external fun clearLine(stream: WritableStream, dir: String /* "-1" */, callback: () -> Unit = definedExternally): Boolean

external fun clearLine(stream: WritableStream, dir: Number /* 0 | 1 */, callback: () -> Unit = definedExternally): Boolean

external fun clearScreenDown(stream: WritableStream, callback: () -> Unit = definedExternally): Boolean

external fun cursorTo(stream: WritableStream, x: Number, y: Number = definedExternally, callback: () -> Unit = definedExternally): Boolean

external fun moveCursor(stream: WritableStream, dx: Number, dy: Number, callback: () -> Unit = definedExternally): Boolean