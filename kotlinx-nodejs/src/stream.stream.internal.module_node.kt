@file:JsModule("stream")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")
package stream

import AsyncIterable
import NodeJS.ReadableStream
import NodeJS.WritableStream
import events.EventEmitter.EventEmitter
import org.khronos.webgl.Uint8Array
import tsstdlib.Iterable

external open class Stream(opts: ReadableOptions = definedExternally) : internal
external interface ReadableOptions {
    var highWaterMark: Number?
        get() = definedExternally
        set(value) = definedExternally
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var objectMode: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    val read: ((size: Number) -> Unit)?
        get() = definedExternally
    val destroy: ((error: Error?, callback: (error: Error?) -> Unit) -> Unit)?
        get() = definedExternally
    var autoDestroy: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}
external open class Readable(opts: ReadableOptions = definedExternally) : Stream, ReadableStream {
    override var readable: Boolean
    open var readableHighWaterMark: Number
    open var readableLength: Number
    open var readableObjectMode: Boolean
    open var destroyed: Boolean
    open fun _read(size: Number)
    override fun read(size: Number): Any
    override fun setEncoding(encoding: String): Readable /* this */
    override fun pause(): Readable /* this */
    override fun resume(): Readable /* this */
    override fun isPaused(): Boolean
    override fun unpipe(destination: WritableStream): Readable /* this */
    open fun unshift(chunk: Any, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */ = definedExternally)
    override fun wrap(oldStream: ReadableStream): Readable /* this */
    open fun push(chunk: Any, encoding: String = definedExternally): Boolean
    open fun _destroy(error: Error?, callback: (error: Error?) -> Unit)
    open fun destroy(error: Error = definedExternally)
    open fun addListener(event: String, listener: () -> Unit): Readable /* this */
    open fun addListener(event: String /* "data" */, listener: (chunk: Any) -> Unit): Readable /* this */
    open fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */
    override fun addListener(event: String, listener: (args: Array<Any>) -> Unit): Readable /* this */
    override fun addListener(event: Any, listener: (args: Array<Any>) -> Unit): Readable /* this */
    open fun emit(event: String): Boolean
    open fun emit(event: String /* "data" */, chunk: Any): Boolean
    open fun emit(event: String /* "error" */, err: Error): Boolean
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun on(event: String, listener: () -> Unit): Readable /* this */
    open fun on(event: String /* "data" */, listener: (chunk: Any) -> Unit): Readable /* this */
    open fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */
    override fun on(event: String, listener: (args: Array<Any>) -> Unit): Readable /* this */
    override fun on(event: Any, listener: (args: Array<Any>) -> Unit): Readable /* this */
    open fun once(event: String, listener: () -> Unit): Readable /* this */
    open fun once(event: String /* "data" */, listener: (chunk: Any) -> Unit): Readable /* this */
    open fun once(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */
    override fun once(event: String, listener: (args: Array<Any>) -> Unit): Readable /* this */
    override fun once(event: Any, listener: (args: Array<Any>) -> Unit): Readable /* this */
    open fun prependListener(event: String, listener: () -> Unit): Readable /* this */
    open fun prependListener(event: String /* "data" */, listener: (chunk: Any) -> Unit): Readable /* this */
    open fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */
    override fun prependListener(event: String, listener: (args: Array<Any>) -> Unit): Readable /* this */
    override fun prependListener(event: Any, listener: (args: Array<Any>) -> Unit): Readable /* this */
    open fun prependOnceListener(event: String, listener: () -> Unit): Readable /* this */
    open fun prependOnceListener(event: String /* "data" */, listener: (chunk: Any) -> Unit): Readable /* this */
    open fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */
    override fun prependOnceListener(event: String, listener: (args: Array<Any>) -> Unit): Readable /* this */
    override fun prependOnceListener(event: Any, listener: (args: Array<Any>) -> Unit): Readable /* this */
    open fun removeListener(event: String, listener: () -> Unit): Readable /* this */
    open fun removeListener(event: String /* "data" */, listener: (chunk: Any) -> Unit): Readable /* this */
    open fun removeListener(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */
    override fun removeListener(event: String, listener: (args: Array<Any>) -> Unit): Readable /* this */
    override fun removeListener(event: Any, listener: (args: Array<Any>) -> Unit): Readable /* this */
    override fun unshift(chunk: String, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */)
    override fun unshift(chunk: Uint8Array, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */)
    override fun off(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun off(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun removeAllListeners(event: String): EventEmitter
    override fun removeAllListeners(event: Any): EventEmitter
    override fun removeAllListeners(): EventEmitter

    companion object {
        fun from(iterable: Iterable<Any>, options: ReadableOptions = definedExternally): Readable
        fun from(iterable: AsyncIterable<Any>, options: ReadableOptions = definedExternally): Readable
    }
}
external interface `T$10` {
    var chunk: Any
    var encoding: String
}
external interface WritableOptions {
    var highWaterMark: Number?
        get() = definedExternally
        set(value) = definedExternally
    var decodeStrings: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var defaultEncoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var objectMode: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var emitClose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    val write: ((chunk: Any, encoding: String, callback: (error: Error?) -> Unit) -> Unit)?
        get() = definedExternally
    val writev: ((chunks: Array<`T$10`>, callback: (error: Error?) -> Unit) -> Unit)?
        get() = definedExternally
    val destroy: ((error: Error?, callback: (error: Error?) -> Unit) -> Unit)?
        get() = definedExternally
    val final: ((callback: (error: Error?) -> Unit) -> Unit)?
        get() = definedExternally
    var autoDestroy: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}
external open class Writable(opts: WritableOptions = definedExternally) : Stream, WritableStream {
    override var writable: Boolean
    open var writableEnded: Boolean
    open var writableFinished: Boolean
    open var writableHighWaterMark: Number
    open var writableLength: Number
    open var writableObjectMode: Boolean
    open var writableCorked: Number
    open var destroyed: Boolean
    open fun _write(chunk: Any, encoding: String, callback: (error: Error?) -> Unit)
    open fun _writev(chunks: Array<`T$10`>, callback: (error: Error?) -> Unit)
    open fun _destroy(error: Error?, callback: (error: Error?) -> Unit)
    open fun _final(callback: (error: Error?) -> Unit)
    open fun write(chunk: Any, cb: (error: Error?) -> Unit = definedExternally): Boolean
    override fun write(buffer: Uint8Array, cb: (err: Error?) -> Unit): Boolean
    open fun write(chunk: Any, encoding: String, cb: (error: Error?) -> Unit = definedExternally): Boolean
    override fun write(str: String, encoding: String, cb: (err: Error?) -> Unit): Boolean
    open fun setDefaultEncoding(encoding: String): Writable /* this */
    override fun end(cb: () -> Unit)
    open fun end(chunk: Any, cb: () -> Unit = definedExternally)
    override fun end(data: String, cb: () -> Unit)
    open fun end(chunk: Any, encoding: String, cb: () -> Unit = definedExternally)
    override fun end(str: String, encoding: String, cb: () -> Unit)
    open fun cork()
    open fun uncork()
    open fun destroy(error: Error = definedExternally)
    open fun addListener(event: String, listener: () -> Unit): Writable /* this */
    open fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */
    open fun addListener(event: String, listener: (src: Readable) -> Unit): Writable /* this */
    override fun addListener(event: String, listener: (args: Array<Any>) -> Unit): Writable /* this */
    override fun addListener(event: Any, listener: (args: Array<Any>) -> Unit): Writable /* this */
    open fun emit(event: String): Boolean
    open fun emit(event: String /* "error" */, err: Error): Boolean
    open fun emit(event: String, src: Readable): Boolean
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun on(event: String, listener: () -> Unit): Writable /* this */
    open fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */
    open fun on(event: String, listener: (src: Readable) -> Unit): Writable /* this */
    override fun on(event: String, listener: (args: Array<Any>) -> Unit): Writable /* this */
    override fun on(event: Any, listener: (args: Array<Any>) -> Unit): Writable /* this */
    open fun once(event: String, listener: () -> Unit): Writable /* this */
    open fun once(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */
    open fun once(event: String, listener: (src: Readable) -> Unit): Writable /* this */
    override fun once(event: String, listener: (args: Array<Any>) -> Unit): Writable /* this */
    override fun once(event: Any, listener: (args: Array<Any>) -> Unit): Writable /* this */
    open fun prependListener(event: String, listener: () -> Unit): Writable /* this */
    open fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */
    open fun prependListener(event: String, listener: (src: Readable) -> Unit): Writable /* this */
    override fun prependListener(event: String, listener: (args: Array<Any>) -> Unit): Writable /* this */
    override fun prependListener(event: Any, listener: (args: Array<Any>) -> Unit): Writable /* this */
    open fun prependOnceListener(event: String, listener: () -> Unit): Writable /* this */
    open fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */
    open fun prependOnceListener(event: String, listener: (src: Readable) -> Unit): Writable /* this */
    override fun prependOnceListener(event: String, listener: (args: Array<Any>) -> Unit): Writable /* this */
    override fun prependOnceListener(event: Any, listener: (args: Array<Any>) -> Unit): Writable /* this */
    open fun removeListener(event: String, listener: () -> Unit): Writable /* this */
    open fun removeListener(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */
    open fun removeListener(event: String, listener: (src: Readable) -> Unit): Writable /* this */
    override fun removeListener(event: String, listener: (args: Array<Any>) -> Unit): Writable /* this */
    override fun removeListener(event: Any, listener: (args: Array<Any>) -> Unit): Writable /* this */
    override fun write(buffer: String, cb: (err: Error?) -> Unit): Boolean
    override fun end(data: Uint8Array, cb: () -> Unit)
    override fun off(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun off(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun removeAllListeners(event: String): EventEmitter
    override fun removeAllListeners(event: Any): EventEmitter
    override fun removeAllListeners(): EventEmitter
}

external interface DuplexOptions : ReadableOptions, WritableOptions {
    var allowHalfOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var readableObjectMode: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var writableObjectMode: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var readableHighWaterMark: Number?
        get() = definedExternally
        set(value) = definedExternally
    var writableHighWaterMark: Number?
        get() = definedExternally
        set(value) = definedExternally
    var writableCorked: Number?
        get() = definedExternally
        set(value) = definedExternally
    override val read: ((size: Number) -> Unit)?
        get() = definedExternally
    override val write: ((chunk: Any, encoding: String, callback: (error: Error?) -> Unit) -> Unit)?
        get() = definedExternally
    override val writev: ((chunks: Array<`T$10`>, callback: (error: Error?) -> Unit) -> Unit)?
        get() = definedExternally
    override val final: ((callback: (error: Error?) -> Unit) -> Unit)?
        get() = definedExternally
    override val destroy: ((error: Error?, callback: (error: Error?) -> Unit) -> Unit)?
        get() = definedExternally
    override var highWaterMark: Number?
        get() = definedExternally
        set(value) = definedExternally;
    override var objectMode: Boolean?
        get() = definedExternally
        set(value) = definedExternally;
    override var autoDestroy: Boolean?
        get() = definedExternally
        set(value) = definedExternally;
}
external open class Duplex(opts: DuplexOptions = definedExternally) : Readable {
    open var writable: Boolean
    open var writableEnded: Boolean
    open var writableFinished: Boolean
    open var writableHighWaterMark: Number
    open var writableLength: Number
    open var writableObjectMode: Boolean
    open var writableCorked: Number
    open fun _write(chunk: Any, encoding: String, callback: (error: Error?) -> Unit)
    open fun _writev(chunks: Array<`T$10`>, callback: (error: Error?) -> Unit)
    override fun _destroy(error: Error?, callback: (error: Error?) -> Unit)
    open fun _final(callback: (error: Error?) -> Unit)
    open fun write(chunk: Any, encoding: String = definedExternally, cb: (error: Error?) -> Unit = definedExternally): Boolean
    open fun write(chunk: Any, cb: (error: Error?) -> Unit = definedExternally): Boolean
    open fun setDefaultEncoding(encoding: String): Duplex /* this */
    open fun end(cb: () -> Unit = definedExternally)
    open fun end(chunk: Any, cb: () -> Unit = definedExternally)
    open fun end(chunk: Any, encoding: String = definedExternally, cb: () -> Unit = definedExternally)
    open fun cork()
    open fun uncork()
}
external interface TransformOptions : DuplexOptions {
    override val read: ((size: Number) -> Unit)?
        get() = definedExternally
    override val write: ((chunk: Any, encoding: String, callback: (error: Error?) -> Unit) -> Unit)?
        get() = definedExternally
    override val writev: ((chunks: Array<`T$10`>, callback: (error: Error?) -> Unit) -> Unit)?
        get() = definedExternally
    override val final: ((callback: (error: Error?) -> Unit) -> Unit)?
        get() = definedExternally
    override val destroy: ((error: Error?, callback: (error: Error?) -> Unit) -> Unit)?
        get() = definedExternally
    val transform: ((chunk: Any, encoding: String, callback: TransformCallback) -> Unit)?
        get() = definedExternally
    val flush: ((callback: TransformCallback) -> Unit)?
        get() = definedExternally
}
external open class Transform(opts: TransformOptions = definedExternally) : Duplex {
    open fun _transform(chunk: Any, encoding: String, callback: TransformCallback)
    open fun _flush(callback: TransformCallback)
}
external open class PassThrough : Transform
external interface FinishedOptions {
    var error: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var readable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var writable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}
external interface Pipe {
    fun close()
    fun hasRef(): Boolean
    fun ref()
    fun unref()
}