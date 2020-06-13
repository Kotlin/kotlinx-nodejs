@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")
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
import NodeJS.ReadableStream
import tsstdlib.Iterable
import AsyncIterable
import events.EventEmitter.EventEmitter
import NodeJS.ErrnoException
import NodeJS.ReadWriteStream

typealias TransformCallback = (error: Error?, data: Any) -> Unit

@JsModule("stream")
external open class internal : EventEmitter {
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
        fun pipeline(stream1: ReadableStream, stream2: ReadWriteStream, vararg streams: ReadWriteStream): WritableStream
        fun pipeline(stream1: ReadableStream, stream2: ReadWriteStream, vararg streams: WritableStream): WritableStream
        fun pipeline(stream1: ReadableStream, stream2: ReadWriteStream, vararg streams: (err: ErrnoException?) -> Unit): WritableStream
        fun pipeline(stream1: ReadableStream, stream2: WritableStream, vararg streams: ReadWriteStream): WritableStream
        fun pipeline(stream1: ReadableStream, stream2: WritableStream, vararg streams: WritableStream): WritableStream
        fun pipeline(stream1: ReadableStream, stream2: WritableStream, vararg streams: (err: ErrnoException?) -> Unit): WritableStream
    }
}
