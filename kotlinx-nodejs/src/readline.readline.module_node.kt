@file:JsModule("readline")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")
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
import events.EventEmitter

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

external open class Interface(options: ReadLineOptions) : EventEmitter {
    constructor(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean)
    constructor(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean)
    open var terminal: Boolean
    open fun setPrompt(prompt: String)
    open fun prompt(preserveCursor: Boolean = definedExternally)
    open fun question(query: String, callback: (answer: String) -> Unit)
    open fun pause(): Interface /* this */
    open fun resume(): Interface /* this */
    open fun close()
    open fun write(data: String, key: Key = definedExternally)
    open fun write(data: Buffer, key: Key = definedExternally)
    override fun addListener(event: String, listener: (args: Array<Any>) -> Unit): Interface /* this */
    open fun addListener(event: String, listener: () -> Unit): Interface /* this */
    open fun addListener(event: String /* "line" */, listener: (input: String) -> Unit): Interface /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String): Boolean
    open fun emit(event: String /* "line" */, input: String): Boolean
    override fun on(event: String, listener: (args: Array<Any>) -> Unit): Interface /* this */
    open fun on(event: String, listener: () -> Unit): Interface /* this */
    open fun on(event: String /* "line" */, listener: (input: String) -> Unit): Interface /* this */
    override fun once(event: String, listener: (args: Array<Any>) -> Unit): Interface /* this */
    open fun once(event: String, listener: () -> Unit): Interface /* this */
    open fun once(event: String /* "line" */, listener: (input: String) -> Unit): Interface /* this */
    override fun prependListener(event: String, listener: (args: Array<Any>) -> Unit): Interface /* this */
    open fun prependListener(event: String, listener: () -> Unit): Interface /* this */
    open fun prependListener(event: String /* "line" */, listener: (input: String) -> Unit): Interface /* this */
    override fun prependOnceListener(event: String, listener: (args: Array<Any>) -> Unit): Interface /* this */
    open fun prependOnceListener(event: String, listener: () -> Unit): Interface /* this */
    open fun prependOnceListener(event: String /* "line" */, listener: (input: String) -> Unit): Interface /* this */
}

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
}

external fun createInterface(input: ReadableStream, output: WritableStream = definedExternally, completer: Completer = definedExternally, terminal: Boolean = definedExternally): Interface

external fun createInterface(input: ReadableStream, output: WritableStream = definedExternally, completer: AsyncCompleter = definedExternally, terminal: Boolean = definedExternally): Interface

external fun createInterface(options: ReadLineOptions): Interface

external fun emitKeypressEvents(stream: ReadableStream, readlineInterface: Interface = definedExternally)

external fun clearLine(stream: WritableStream, dir: String /* -1 | 0 | 1 */, callback: () -> Unit = definedExternally): Boolean

external fun clearScreenDown(stream: WritableStream, callback: () -> Unit = definedExternally): Boolean

external fun cursorTo(stream: WritableStream, x: Number, y: Number = definedExternally, callback: () -> Unit = definedExternally): Boolean

external fun moveCursor(stream: WritableStream, dx: Number, dy: Number, callback: () -> Unit = definedExternally): Boolean

external fun createInterface(input: ReadableStream): Interface
