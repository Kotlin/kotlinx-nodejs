@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package stream

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
import NodeJS.`T$2`
import NodeJS.WritableStream
import stream.internal.ReadableOptions
import stream.internal.Readable
import NodeJS.ReadableStream
import stream.internal.Stream
import tsstdlib.Iterable
import AsyncIterable
import stream.internal.`T$10`
import stream.internal.WritableOptions
import stream.internal.Writable
import stream.internal.DuplexOptions
import stream.internal.Duplex
import stream.internal.TransformOptions
import stream.internal.Transform
import events.EventEmitter.EventEmitter
import stream.internal.FinishedOptions
import NodeJS.ErrnoException
import NodeJS.ReadWriteStream

typealias TransformCallback = (error: Error?, data: Any) -> Unit

@JsModule("stream")
external open class internal : EventEmitter {
    open fun <T : WritableStream> pipe(destination: T, options: `T$2` = definedExternally): T
    open class Stream(opts: ReadableOptions = definedExternally) : internal
    interface ReadableOptions {
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
    open class Readable(opts: ReadableOptions = definedExternally) : Stream, ReadableStream {
        override var readable: Boolean
        open var readableEncoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */
        open var readableEnded: Boolean
        open var readableFlowing: Boolean?
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
        override fun unshift(chunk: String, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */)
        override fun wrap(oldStream: ReadableStream): Readable /* this */
        open fun push(chunk: Any, encoding: String = definedExternally): Boolean
        open fun _destroy(error: Error?, callback: (error: Error?) -> Unit)
        open fun destroy(error: Error = definedExternally)
        open fun addListener(event: String /* "close" | "end" | "pause" | "readable" | "resume" */, listener: () -> Unit): Readable /* this */
        override fun addListener(event: String /* "data" */, listener: (chunk: Any) -> Unit): Readable /* this */
        open fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */
        override fun addListener(event: Any, listener: (args: Any) -> Unit): Readable /* this */
        open fun emit(event: String /* "close" | "end" | "pause" | "readable" | "resume" */): Boolean
        open fun emit(event: String /* "data" */, chunk: Any): Boolean
        override fun emit(event: String, vararg args: Any): Boolean
        open fun emit(event: String /* "error" */, err: Error): Boolean
        override fun emit(event: Any, vararg args: Any): Boolean
        open fun on(event: String /* "close" | "end" | "pause" | "readable" | "resume" */, listener: () -> Unit): Readable /* this */
        override fun on(event: String /* "data" */, listener: (chunk: Any) -> Unit): Readable /* this */
        open fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */
        override fun on(event: Any, listener: (args: Any) -> Unit): Readable /* this */
        open fun once(event: String /* "close" | "end" | "pause" | "readable" | "resume" */, listener: () -> Unit): Readable /* this */
        override fun once(event: String /* "data" */, listener: (chunk: Any) -> Unit): Readable /* this */
        open fun once(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */
        override fun once(event: Any, listener: (args: Any) -> Unit): Readable /* this */
        open fun prependListener(event: String /* "close" | "end" | "pause" | "readable" | "resume" */, listener: () -> Unit): Readable /* this */
        override fun prependListener(event: String /* "data" */, listener: (chunk: Any) -> Unit): Readable /* this */
        open fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */
        override fun prependListener(event: Any, listener: (args: Any) -> Unit): Readable /* this */
        open fun prependOnceListener(event: String /* "close" | "end" | "pause" | "readable" | "resume" */, listener: () -> Unit): Readable /* this */
        override fun prependOnceListener(event: String /* "data" */, listener: (chunk: Any) -> Unit): Readable /* this */
        open fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */
        override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): Readable /* this */
        open fun removeListener(event: String /* "close" | "end" | "pause" | "readable" | "resume" */, listener: () -> Unit): Readable /* this */
        override fun removeListener(event: String /* "data" */, listener: (chunk: Any) -> Unit): Readable /* this */
        open fun removeListener(event: String /* "error" */, listener: (err: Error) -> Unit): Readable /* this */
        override fun removeListener(event: Any, listener: (args: Any) -> Unit): Readable /* this */
        override fun unshift(chunk: Uint8Array, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */)

        companion object {
            fun from(iterable: Iterable<Any>, options: ReadableOptions = definedExternally): Readable
            fun from(iterable: AsyncIterable<Any>, options: ReadableOptions = definedExternally): Readable
        }
    }
    interface `T$10` {
        var chunk: Any
        var encoding: String
    }
    interface WritableOptions {
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
    open class Writable(opts: WritableOptions = definedExternally) : Stream, WritableStream {
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
        open fun addListener(event: String /* "close" | "drain" | "finish" */, listener: () -> Unit): Writable /* this */
        open fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */
        open fun addListener(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Writable /* this */
        override fun addListener(event: String, listener: (args: Any) -> Unit): Writable /* this */
        override fun addListener(event: Any, listener: (args: Any) -> Unit): Writable /* this */
        open fun emit(event: String /* "close" | "drain" | "finish" */): Boolean
        open fun emit(event: String /* "error" */, err: Error): Boolean
        override fun emit(event: String, vararg args: Any): Boolean
        open fun emit(event: String /* "pipe" | "unpipe" */, src: Readable): Boolean
        override fun emit(event: Any, vararg args: Any): Boolean
        open fun on(event: String /* "close" | "drain" | "finish" */, listener: () -> Unit): Writable /* this */
        open fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */
        open fun on(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Writable /* this */
        override fun on(event: String, listener: (args: Any) -> Unit): Writable /* this */
        override fun on(event: Any, listener: (args: Any) -> Unit): Writable /* this */
        open fun once(event: String /* "close" | "drain" | "finish" */, listener: () -> Unit): Writable /* this */
        open fun once(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */
        open fun once(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Writable /* this */
        override fun once(event: String, listener: (args: Any) -> Unit): Writable /* this */
        override fun once(event: Any, listener: (args: Any) -> Unit): Writable /* this */
        open fun prependListener(event: String /* "close" | "drain" | "finish" */, listener: () -> Unit): Writable /* this */
        open fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */
        open fun prependListener(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Writable /* this */
        override fun prependListener(event: String, listener: (args: Any) -> Unit): Writable /* this */
        override fun prependListener(event: Any, listener: (args: Any) -> Unit): Writable /* this */
        open fun prependOnceListener(event: String /* "close" | "drain" | "finish" */, listener: () -> Unit): Writable /* this */
        open fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */
        open fun prependOnceListener(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Writable /* this */
        override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Writable /* this */
        override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): Writable /* this */
        open fun removeListener(event: String /* "close" | "drain" | "finish" */, listener: () -> Unit): Writable /* this */
        open fun removeListener(event: String /* "error" */, listener: (err: Error) -> Unit): Writable /* this */
        open fun removeListener(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Writable /* this */
        override fun removeListener(event: String, listener: (args: Any) -> Unit): Writable /* this */
        override fun removeListener(event: Any, listener: (args: Any) -> Unit): Writable /* this */
        override fun write(buffer: String, cb: (err: Error?) -> Unit): Boolean
        override fun end(data: Uint8Array, cb: () -> Unit)
    }
    interface DuplexOptions : ReadableOptions, WritableOptions {
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
            set(value) = definedExternally
        override var objectMode: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        override var autoDestroy: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    open class Duplex(opts: DuplexOptions = definedExternally) : Readable {
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
    interface TransformOptions : DuplexOptions {
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
    open class Transform(opts: TransformOptions = definedExternally) : Duplex {
        open fun _transform(chunk: Any, encoding: String, callback: TransformCallback)
        open fun _flush(callback: TransformCallback)
    }
    open class PassThrough : Transform
    interface FinishedOptions {
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
    interface Pipe {
        fun close()
        fun hasRef(): Boolean
        fun ref()
        fun unref()
    }

    companion object {
        fun finished(stream: ReadableStream, options: FinishedOptions, callback: (err: ErrnoException?) -> Unit): () -> Unit
        fun finished(stream: WritableStream, options: FinishedOptions, callback: (err: ErrnoException?) -> Unit): () -> Unit
        fun finished(stream: ReadWriteStream, options: FinishedOptions, callback: (err: ErrnoException?) -> Unit): () -> Unit
        fun finished(stream: ReadableStream, callback: (err: ErrnoException?) -> Unit): () -> Unit
        fun finished(stream: WritableStream, callback: (err: ErrnoException?) -> Unit): () -> Unit
        fun finished(stream: ReadWriteStream, callback: (err: ErrnoException?) -> Unit): () -> Unit
        fun <T : WritableStream> pipeline(stream1: ReadableStream, stream2: T, callback: (err: ErrnoException?) -> Unit = definedExternally): T
        fun <T : WritableStream> pipeline(stream1: ReadableStream, stream2: ReadWriteStream, stream3: T, callback: (err: ErrnoException?) -> Unit = definedExternally): T
        fun <T : WritableStream> pipeline(stream1: ReadableStream, stream2: ReadWriteStream, stream3: ReadWriteStream, stream4: T, callback: (err: ErrnoException?) -> Unit = definedExternally): T
        fun <T : WritableStream> pipeline(stream1: ReadableStream, stream2: ReadWriteStream, stream3: ReadWriteStream, stream4: ReadWriteStream, stream5: T, callback: (err: ErrnoException?) -> Unit = definedExternally): T
        fun pipeline(streams: Array<dynamic /* NodeJS.ReadableStream | NodeJS.WritableStream | NodeJS.ReadWriteStream */>, callback: (err: ErrnoException?) -> Unit = definedExternally): WritableStream
        fun pipeline(stream1: ReadableStream, stream2: ReadWriteStream, vararg streams: dynamic /* NodeJS.ReadWriteStream | NodeJS.WritableStream | (err: NodeJS.ErrnoException?) -> Unit */): WritableStream
        fun pipeline(stream1: ReadableStream, stream2: WritableStream, vararg streams: dynamic /* NodeJS.ReadWriteStream | NodeJS.WritableStream | (err: NodeJS.ErrnoException?) -> Unit */): WritableStream
    }
}