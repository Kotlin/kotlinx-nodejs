@file:JsModule("tty")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package tty

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
import net.SocketConstructorOpts
import net.Socket

external fun isatty(fd: Number): Boolean

external open class ReadStream(fd: Number, options: SocketConstructorOpts = definedExternally) : Socket {
    open var isRaw: Boolean
    open fun setRawMode(mode: Boolean): ReadStream /* this */
    open var isTTY: Boolean
}

external open class WriteStream(fd: Number) : Socket {
    override fun addListener(event: String, listener: (args: Any) -> Unit): WriteStream /* this */
    override fun addListener(event: String /* "resize" */, listener: () -> Unit): WriteStream /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    override fun emit(event: String /* "resize" */): Boolean
    override fun on(event: String, listener: (args: Any) -> Unit): WriteStream /* this */
    override fun on(event: String /* "resize" */, listener: () -> Unit): WriteStream /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): WriteStream /* this */
    override fun once(event: String /* "resize" */, listener: () -> Unit): WriteStream /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): WriteStream /* this */
    override fun prependListener(event: String /* "resize" */, listener: () -> Unit): WriteStream /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): WriteStream /* this */
    override fun prependOnceListener(event: String /* "resize" */, listener: () -> Unit): WriteStream /* this */
    open fun clearLine(dir: String /* "-1" */, callback: () -> Unit = definedExternally): Boolean
    open fun clearLine(dir: Number /* 0 | 1 */, callback: () -> Unit = definedExternally): Boolean
    open fun clearScreenDown(callback: () -> Unit = definedExternally): Boolean
    open fun cursorTo(x: Number, y: Number = definedExternally, callback: () -> Unit = definedExternally): Boolean
    open fun cursorTo(x: Number, callback: () -> Unit): Boolean
    open fun moveCursor(dx: Number, dy: Number, callback: () -> Unit = definedExternally): Boolean
    open fun getColorDepth(env: Any = definedExternally): Number
    open fun hasColors(depth: Number = definedExternally): Boolean
    open fun hasColors(env: Any = definedExternally): Boolean
    open fun hasColors(depth: Number, env: Any = definedExternally): Boolean
    open fun getWindowSize(): dynamic /* JsTuple<Number, Number> */
    open var columns: Number
    open var rows: Number
    open var isTTY: Boolean
}