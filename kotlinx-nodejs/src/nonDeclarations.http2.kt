@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package http2

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
import fs.Stats
import http.OutgoingHttpHeaders
import NodeJS.ErrnoException
import stream.internal.Readable
import Buffer
import stream.internal.Duplex
import fs.promises.FileHandle
import events.EventEmitter.EventEmitter
import net.Socket
import tls.TLSSocket
import tls.ConnectionOptions
import tls.TlsOptions
import net.Server
import tls.Server as _tls_Server
import http.IncomingHttpHeaders as Http1IncomingHttpHeaders

external interface IncomingHttpStatusHeader

public inline operator fun http2.IncomingHttpStatusHeader.get(key: String): Number? = this.asDynamic()[key]

public inline operator fun http2.IncomingHttpStatusHeader.set(key: String, value: Number?) { this.asDynamic()[key] = value }

external interface IncomingHttpHeaders : Http1IncomingHttpHeaders

public inline operator fun http2.IncomingHttpHeaders.get(key: String): String? = this.asDynamic()[key]

public inline operator fun http2.IncomingHttpHeaders.set(key: String, value: String?) { this.asDynamic()[key] = value }

external interface StreamPriorityOptions {
    var exclusive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var parent: Number?
        get() = definedExternally
        set(value) = definedExternally
    var weight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface StreamState {
    var localWindowSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var state: Number?
        get() = definedExternally
        set(value) = definedExternally
    var localClose: Number?
        get() = definedExternally
        set(value) = definedExternally
    var remoteClose: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sumDependencyWeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var weight: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ServerStreamResponseOptions {
    var endStream: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var waitForTrailers: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface StatOptions {
    var offset: Number
    var length: Number
}

external interface ServerStreamFileResponseOptions {
    val statCheck: ((stats: Stats, headers: OutgoingHttpHeaders, statOptions: StatOptions) -> dynamic)?
        get() = definedExternally
    var waitForTrailers: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var offset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var length: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ServerStreamFileResponseOptionsWithError : ServerStreamFileResponseOptions {
    val onError: ((err: ErrnoException) -> Unit)?
        get() = definedExternally
}

external interface Http2Stream : Duplex {
    var aborted: Boolean
    var bufferSize: Number
    var closed: Boolean
    override var destroyed: Boolean
    var endAfterHeaders: Boolean
    var id: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pending: Boolean
    var rstCode: Number
    var sentHeaders: OutgoingHttpHeaders
    var sentInfoHeaders: Array<OutgoingHttpHeaders>?
        get() = definedExternally
        set(value) = definedExternally
    var sentTrailers: OutgoingHttpHeaders?
        get() = definedExternally
        set(value) = definedExternally
    var session: Http2Session
    var state: StreamState
    fun close(code: Number = definedExternally, callback: () -> Unit = definedExternally)
    fun priority(options: StreamPriorityOptions)
    fun setTimeout(msecs: Number, callback: () -> Unit = definedExternally)
    fun sendTrailers(headers: OutgoingHttpHeaders)
    override fun addListener(event: String /* "aborted" | "close" | "drain" | "end" | "finish" | "timeout" | "wantTrailers" */, listener: () -> Unit): Http2Stream /* this */
    override fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number) -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "streamClosed" */, listener: (code: Number) -> Unit): Http2Stream /* this */
    fun addListener(event: String /* "trailers" */, listener: (trailers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Stream /* this */
    override fun addListener(event: String, listener: (args: Any) -> Unit): Http2Stream /* this */
    override fun addListener(event: Any, listener: (args: Any) -> Unit): Http2Stream /* this */
    override fun emit(event: String /* "aborted" | "close" | "drain" | "end" | "finish" | "timeout" | "wantTrailers" */): Boolean
    fun emit(event: String /* "data" */, chunk: Buffer): Boolean
    override fun emit(event: String /* "data" */, chunk: Any): Boolean
    fun emit(event: String /* "data" */, chunk: String): Boolean
    override fun emit(event: String /* "error" */, err: Error): Boolean
    fun emit(event: String /* "frameError" */, frameType: Number, errorCode: Number): Boolean
    fun emit(event: String /* "pipe" | "unpipe" */, src: Readable): Boolean
    fun emit(event: String /* "streamClosed" */, code: Number): Boolean
    fun emit(event: String /* "trailers" */, trailers: IncomingHttpHeaders, flags: Number): Boolean
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    override fun on(event: String /* "aborted" | "close" | "drain" | "end" | "finish" | "timeout" | "wantTrailers" */, listener: () -> Unit): Http2Stream /* this */
    override fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Stream /* this */
    fun on(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number) -> Unit): Http2Stream /* this */
    fun on(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Http2Stream /* this */
    fun on(event: String /* "streamClosed" */, listener: (code: Number) -> Unit): Http2Stream /* this */
    fun on(event: String /* "trailers" */, listener: (trailers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Stream /* this */
    override fun on(event: String, listener: (args: Any) -> Unit): Http2Stream /* this */
    override fun on(event: Any, listener: (args: Any) -> Unit): Http2Stream /* this */
    override fun once(event: String /* "aborted" | "close" | "drain" | "end" | "finish" | "timeout" | "wantTrailers" */, listener: () -> Unit): Http2Stream /* this */
    override fun once(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Stream /* this */
    fun once(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number) -> Unit): Http2Stream /* this */
    fun once(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Http2Stream /* this */
    fun once(event: String /* "streamClosed" */, listener: (code: Number) -> Unit): Http2Stream /* this */
    fun once(event: String /* "trailers" */, listener: (trailers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Stream /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Http2Stream /* this */
    override fun once(event: Any, listener: (args: Any) -> Unit): Http2Stream /* this */
    override fun prependListener(event: String /* "aborted" | "close" | "drain" | "end" | "finish" | "timeout" | "wantTrailers" */, listener: () -> Unit): Http2Stream /* this */
    override fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number) -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "streamClosed" */, listener: (code: Number) -> Unit): Http2Stream /* this */
    fun prependListener(event: String /* "trailers" */, listener: (trailers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Stream /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): Http2Stream /* this */
    override fun prependListener(event: Any, listener: (args: Any) -> Unit): Http2Stream /* this */
    override fun prependOnceListener(event: String /* "aborted" | "close" | "drain" | "end" | "finish" | "timeout" | "wantTrailers" */, listener: () -> Unit): Http2Stream /* this */
    override fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number) -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "streamClosed" */, listener: (code: Number) -> Unit): Http2Stream /* this */
    fun prependOnceListener(event: String /* "trailers" */, listener: (trailers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Stream /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Http2Stream /* this */
    override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): Http2Stream /* this */
}

external interface ClientHttp2Stream : Http2Stream {
    fun addListener(event: String /* "continue" */, listener: () -> Any): ClientHttp2Stream /* this */
    override fun addListener(event: String /* "headers" | "push" | "response" */, listener: (headers: IncomingHttpHeaders /* IncomingHttpHeaders & IncomingHttpStatusHeader */, flags: Number) -> Unit): ClientHttp2Stream /* this */
    override fun addListener(event: String, listener: (args: Any) -> Unit): ClientHttp2Stream /* this */
    override fun addListener(event: Any, listener: (args: Any) -> Unit): ClientHttp2Stream /* this */
    override fun emit(event: String /* "continue" */): Boolean
    override fun emit(event: String /* "headers" | "push" | "response" */, headers: IncomingHttpHeaders /* IncomingHttpHeaders & IncomingHttpStatusHeader */, flags: Number): Boolean
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    fun on(event: String /* "continue" */, listener: () -> Any): ClientHttp2Stream /* this */
    override fun on(event: String /* "headers" | "push" | "response" */, listener: (headers: IncomingHttpHeaders /* IncomingHttpHeaders & IncomingHttpStatusHeader */, flags: Number) -> Unit): ClientHttp2Stream /* this */
    override fun on(event: String, listener: (args: Any) -> Unit): ClientHttp2Stream /* this */
    override fun on(event: Any, listener: (args: Any) -> Unit): ClientHttp2Stream /* this */
    fun once(event: String /* "continue" */, listener: () -> Any): ClientHttp2Stream /* this */
    override fun once(event: String /* "headers" | "push" | "response" */, listener: (headers: IncomingHttpHeaders /* IncomingHttpHeaders & IncomingHttpStatusHeader */, flags: Number) -> Unit): ClientHttp2Stream /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): ClientHttp2Stream /* this */
    override fun once(event: Any, listener: (args: Any) -> Unit): ClientHttp2Stream /* this */
    fun prependListener(event: String /* "continue" */, listener: () -> Any): ClientHttp2Stream /* this */
    override fun prependListener(event: String /* "headers" | "push" | "response" */, listener: (headers: IncomingHttpHeaders /* IncomingHttpHeaders & IncomingHttpStatusHeader */, flags: Number) -> Unit): ClientHttp2Stream /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): ClientHttp2Stream /* this */
    override fun prependListener(event: Any, listener: (args: Any) -> Unit): ClientHttp2Stream /* this */
    fun prependOnceListener(event: String /* "continue" */, listener: () -> Any): ClientHttp2Stream /* this */
    override fun prependOnceListener(event: String /* "headers" | "push" | "response" */, listener: (headers: IncomingHttpHeaders /* IncomingHttpHeaders & IncomingHttpStatusHeader */, flags: Number) -> Unit): ClientHttp2Stream /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): ClientHttp2Stream /* this */
    override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): ClientHttp2Stream /* this */
}

external interface ServerHttp2Stream : Http2Stream {
    var headersSent: Boolean
    var pushAllowed: Boolean
    fun additionalHeaders(headers: OutgoingHttpHeaders)
    fun pushStream(headers: OutgoingHttpHeaders, callback: (err: Error?, pushStream: ServerHttp2Stream, headers: OutgoingHttpHeaders) -> Unit = definedExternally)
    fun pushStream(headers: OutgoingHttpHeaders, options: StreamPriorityOptions = definedExternally, callback: (err: Error?, pushStream: ServerHttp2Stream, headers: OutgoingHttpHeaders) -> Unit = definedExternally)
    fun respond(headers: OutgoingHttpHeaders = definedExternally, options: ServerStreamResponseOptions = definedExternally)
    fun respondWithFD(fd: Number, headers: OutgoingHttpHeaders = definedExternally, options: ServerStreamFileResponseOptions = definedExternally)
    fun respondWithFD(fd: FileHandle, headers: OutgoingHttpHeaders = definedExternally, options: ServerStreamFileResponseOptions = definedExternally)
    fun respondWithFile(path: String, headers: OutgoingHttpHeaders = definedExternally, options: ServerStreamFileResponseOptionsWithError = definedExternally)
}

external interface Settings {
    var headerTableSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var enablePush: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var initialWindowSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxFrameSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxConcurrentStreams: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxHeaderListSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var enableConnectProtocol: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ClientSessionRequestOptions {
    var endStream: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var exclusive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var parent: Number?
        get() = definedExternally
        set(value) = definedExternally
    var weight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var waitForTrailers: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SessionState {
    var effectiveLocalWindowSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var effectiveRecvDataLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var nextStreamID: Number?
        get() = definedExternally
        set(value) = definedExternally
    var localWindowSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lastProcStreamID: Number?
        get() = definedExternally
        set(value) = definedExternally
    var remoteWindowSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var outboundQueueSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var deflateDynamicTableSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inflateDynamicTableSize: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Http2Session : EventEmitter {
    var alpnProtocol: String?
        get() = definedExternally
        set(value) = definedExternally
    var closed: Boolean
    var connecting: Boolean
    var destroyed: Boolean
    var encrypted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var localSettings: Settings
    var originSet: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var pendingSettingsAck: Boolean
    var remoteSettings: Settings
    var socket: dynamic /* net.Socket | tls.TLSSocket */
        get() = definedExternally
        set(value) = definedExternally
    var state: SessionState
    var type: Number
    fun close(callback: () -> Unit = definedExternally)
    fun destroy(error: Error = definedExternally, code: Number = definedExternally)
    fun goaway(code: Number = definedExternally, lastStreamID: Number = definedExternally, opaqueData: Uint8Array = definedExternally)
    fun goaway(code: Number = definedExternally, lastStreamID: Number = definedExternally, opaqueData: Uint8ClampedArray = definedExternally)
    fun goaway(code: Number = definedExternally, lastStreamID: Number = definedExternally, opaqueData: Uint16Array = definedExternally)
    fun goaway(code: Number = definedExternally, lastStreamID: Number = definedExternally, opaqueData: Uint32Array = definedExternally)
    fun goaway(code: Number = definedExternally, lastStreamID: Number = definedExternally, opaqueData: Int8Array = definedExternally)
    fun goaway(code: Number = definedExternally, lastStreamID: Number = definedExternally, opaqueData: Int16Array = definedExternally)
    fun goaway(code: Number = definedExternally, lastStreamID: Number = definedExternally, opaqueData: Int32Array = definedExternally)
    fun goaway(code: Number = definedExternally, lastStreamID: Number = definedExternally, opaqueData: Float32Array = definedExternally)
    fun goaway(code: Number = definedExternally, lastStreamID: Number = definedExternally, opaqueData: Float64Array = definedExternally)
    fun goaway(code: Number = definedExternally, lastStreamID: Number = definedExternally, opaqueData: DataView = definedExternally)
    fun ping(callback: (err: Error?, duration: Number, payload: Buffer) -> Unit): Boolean
    fun ping(payload: Uint8Array, callback: (err: Error?, duration: Number, payload: Buffer) -> Unit): Boolean
    fun ping(payload: Uint8ClampedArray, callback: (err: Error?, duration: Number, payload: Buffer) -> Unit): Boolean
    fun ping(payload: Uint16Array, callback: (err: Error?, duration: Number, payload: Buffer) -> Unit): Boolean
    fun ping(payload: Uint32Array, callback: (err: Error?, duration: Number, payload: Buffer) -> Unit): Boolean
    fun ping(payload: Int8Array, callback: (err: Error?, duration: Number, payload: Buffer) -> Unit): Boolean
    fun ping(payload: Int16Array, callback: (err: Error?, duration: Number, payload: Buffer) -> Unit): Boolean
    fun ping(payload: Int32Array, callback: (err: Error?, duration: Number, payload: Buffer) -> Unit): Boolean
    fun ping(payload: Float32Array, callback: (err: Error?, duration: Number, payload: Buffer) -> Unit): Boolean
    fun ping(payload: Float64Array, callback: (err: Error?, duration: Number, payload: Buffer) -> Unit): Boolean
    fun ping(payload: DataView, callback: (err: Error?, duration: Number, payload: Buffer) -> Unit): Boolean
    fun ref()
    fun setTimeout(msecs: Number, callback: () -> Unit = definedExternally)
    fun settings(settings: Settings)
    fun unref()
    fun addListener(event: String /* "close" | "ping" | "timeout" */, listener: () -> Unit): Http2Session /* this */
    fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Session /* this */
    fun addListener(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number, streamID: Number) -> Unit): Http2Session /* this */
    fun addListener(event: String /* "goaway" */, listener: (errorCode: Number, lastStreamID: Number, opaqueData: Buffer) -> Unit): Http2Session /* this */
    fun addListener(event: String /* "localSettings" | "remoteSettings" */, listener: (settings: Settings) -> Unit): Http2Session /* this */
    override fun addListener(event: String, listener: (args: Any) -> Unit): Http2Session /* this */
    override fun addListener(event: Any, listener: (args: Any) -> Unit): Http2Session /* this */
    fun emit(event: String /* "close" | "ping" | "timeout" */): Boolean
    fun emit(event: String /* "error" */, err: Error): Boolean
    override fun emit(event: String, vararg args: Any): Boolean
    fun emit(event: String /* "frameError" */, frameType: Number, errorCode: Number, streamID: Number): Boolean
    fun emit(event: String /* "goaway" */, errorCode: Number, lastStreamID: Number, opaqueData: Buffer): Boolean
    fun emit(event: String /* "localSettings" | "remoteSettings" */, settings: Settings): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    fun on(event: String /* "close" | "ping" | "timeout" */, listener: () -> Unit): Http2Session /* this */
    fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Session /* this */
    fun on(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number, streamID: Number) -> Unit): Http2Session /* this */
    fun on(event: String /* "goaway" */, listener: (errorCode: Number, lastStreamID: Number, opaqueData: Buffer) -> Unit): Http2Session /* this */
    fun on(event: String /* "localSettings" | "remoteSettings" */, listener: (settings: Settings) -> Unit): Http2Session /* this */
    override fun on(event: String, listener: (args: Any) -> Unit): Http2Session /* this */
    override fun on(event: Any, listener: (args: Any) -> Unit): Http2Session /* this */
    fun once(event: String /* "close" | "ping" | "timeout" */, listener: () -> Unit): Http2Session /* this */
    fun once(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Session /* this */
    fun once(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number, streamID: Number) -> Unit): Http2Session /* this */
    fun once(event: String /* "goaway" */, listener: (errorCode: Number, lastStreamID: Number, opaqueData: Buffer) -> Unit): Http2Session /* this */
    fun once(event: String /* "localSettings" | "remoteSettings" */, listener: (settings: Settings) -> Unit): Http2Session /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Http2Session /* this */
    override fun once(event: Any, listener: (args: Any) -> Unit): Http2Session /* this */
    fun prependListener(event: String /* "close" | "ping" | "timeout" */, listener: () -> Unit): Http2Session /* this */
    fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Session /* this */
    fun prependListener(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number, streamID: Number) -> Unit): Http2Session /* this */
    fun prependListener(event: String /* "goaway" */, listener: (errorCode: Number, lastStreamID: Number, opaqueData: Buffer) -> Unit): Http2Session /* this */
    fun prependListener(event: String /* "localSettings" | "remoteSettings" */, listener: (settings: Settings) -> Unit): Http2Session /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): Http2Session /* this */
    override fun prependListener(event: Any, listener: (args: Any) -> Unit): Http2Session /* this */
    fun prependOnceListener(event: String /* "close" | "ping" | "timeout" */, listener: () -> Unit): Http2Session /* this */
    fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): Http2Session /* this */
    fun prependOnceListener(event: String /* "frameError" */, listener: (frameType: Number, errorCode: Number, streamID: Number) -> Unit): Http2Session /* this */
    fun prependOnceListener(event: String /* "goaway" */, listener: (errorCode: Number, lastStreamID: Number, opaqueData: Buffer) -> Unit): Http2Session /* this */
    fun prependOnceListener(event: String /* "localSettings" | "remoteSettings" */, listener: (settings: Settings) -> Unit): Http2Session /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Http2Session /* this */
    override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): Http2Session /* this */
}

external interface ClientHttp2Session : Http2Session {
    fun request(headers: OutgoingHttpHeaders = definedExternally, options: ClientSessionRequestOptions = definedExternally): ClientHttp2Stream
    fun addListener(event: String /* "altsvc" */, listener: (alt: String, origin: String, stream: Number) -> Unit): ClientHttp2Session /* this */
    fun addListener(event: String /* "origin" */, listener: (origins: Array<String>) -> Unit): ClientHttp2Session /* this */
    fun addListener(event: String /* "connect" */, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ClientHttp2Session /* this */
    fun addListener(event: String /* "stream" */, listener: (stream: ClientHttp2Stream, headers: IncomingHttpHeaders /* IncomingHttpHeaders & IncomingHttpStatusHeader */, flags: Number) -> Unit): ClientHttp2Session /* this */
    override fun addListener(event: String, listener: (args: Any) -> Unit): ClientHttp2Session /* this */
    override fun addListener(event: Any, listener: (args: Any) -> Unit): ClientHttp2Session /* this */
    fun emit(event: String /* "altsvc" */, alt: String, origin: String, stream: Number): Boolean
    fun emit(event: String /* "origin" */, origins: Array<String>): Boolean
    override fun emit(event: String, vararg args: Any): Boolean
    fun emit(event: String /* "connect" */, session: ClientHttp2Session, socket: Socket): Boolean
    fun emit(event: String /* "connect" */, session: ClientHttp2Session, socket: TLSSocket): Boolean
    fun emit(event: String /* "stream" */, stream: ClientHttp2Stream, headers: IncomingHttpHeaders /* IncomingHttpHeaders & IncomingHttpStatusHeader */, flags: Number): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    fun on(event: String /* "altsvc" */, listener: (alt: String, origin: String, stream: Number) -> Unit): ClientHttp2Session /* this */
    fun on(event: String /* "origin" */, listener: (origins: Array<String>) -> Unit): ClientHttp2Session /* this */
    fun on(event: String /* "connect" */, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ClientHttp2Session /* this */
    fun on(event: String /* "stream" */, listener: (stream: ClientHttp2Stream, headers: IncomingHttpHeaders /* IncomingHttpHeaders & IncomingHttpStatusHeader */, flags: Number) -> Unit): ClientHttp2Session /* this */
    override fun on(event: String, listener: (args: Any) -> Unit): ClientHttp2Session /* this */
    override fun on(event: Any, listener: (args: Any) -> Unit): ClientHttp2Session /* this */
    fun once(event: String /* "altsvc" */, listener: (alt: String, origin: String, stream: Number) -> Unit): ClientHttp2Session /* this */
    fun once(event: String /* "origin" */, listener: (origins: Array<String>) -> Unit): ClientHttp2Session /* this */
    fun once(event: String /* "connect" */, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ClientHttp2Session /* this */
    fun once(event: String /* "stream" */, listener: (stream: ClientHttp2Stream, headers: IncomingHttpHeaders /* IncomingHttpHeaders & IncomingHttpStatusHeader */, flags: Number) -> Unit): ClientHttp2Session /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): ClientHttp2Session /* this */
    override fun once(event: Any, listener: (args: Any) -> Unit): ClientHttp2Session /* this */
    fun prependListener(event: String /* "altsvc" */, listener: (alt: String, origin: String, stream: Number) -> Unit): ClientHttp2Session /* this */
    fun prependListener(event: String /* "origin" */, listener: (origins: Array<String>) -> Unit): ClientHttp2Session /* this */
    fun prependListener(event: String /* "connect" */, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ClientHttp2Session /* this */
    fun prependListener(event: String /* "stream" */, listener: (stream: ClientHttp2Stream, headers: IncomingHttpHeaders /* IncomingHttpHeaders & IncomingHttpStatusHeader */, flags: Number) -> Unit): ClientHttp2Session /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): ClientHttp2Session /* this */
    override fun prependListener(event: Any, listener: (args: Any) -> Unit): ClientHttp2Session /* this */
    fun prependOnceListener(event: String /* "altsvc" */, listener: (alt: String, origin: String, stream: Number) -> Unit): ClientHttp2Session /* this */
    fun prependOnceListener(event: String /* "origin" */, listener: (origins: Array<String>) -> Unit): ClientHttp2Session /* this */
    fun prependOnceListener(event: String /* "connect" */, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ClientHttp2Session /* this */
    fun prependOnceListener(event: String /* "stream" */, listener: (stream: ClientHttp2Stream, headers: IncomingHttpHeaders /* IncomingHttpHeaders & IncomingHttpStatusHeader */, flags: Number) -> Unit): ClientHttp2Session /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): ClientHttp2Session /* this */
    override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): ClientHttp2Session /* this */
}

external interface AlternativeServiceOptions {
    var origin: dynamic /* Number | String | url.URL */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$57` {
    var origin: String
}

external interface ServerHttp2Session : Http2Session {
    var server: dynamic /* Http2Server | Http2SecureServer */
        get() = definedExternally
        set(value) = definedExternally
    fun altsvc(alt: String, originOrStream: Number)
    fun altsvc(alt: String, originOrStream: String)
    fun altsvc(alt: String, originOrStream: URL)
    fun altsvc(alt: String, originOrStream: AlternativeServiceOptions)
    fun origin(vararg args: dynamic /* String | url.URL | `T$57` */)
    fun addListener(event: String /* "connect" */, listener: (session: ServerHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ServerHttp2Session /* this */
    fun addListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): ServerHttp2Session /* this */
    override fun addListener(event: String, listener: (args: Any) -> Unit): ServerHttp2Session /* this */
    override fun addListener(event: Any, listener: (args: Any) -> Unit): ServerHttp2Session /* this */
    fun emit(event: String /* "connect" */, session: ServerHttp2Session, socket: Socket): Boolean
    fun emit(event: String /* "connect" */, session: ServerHttp2Session, socket: TLSSocket): Boolean
    fun emit(event: String /* "stream" */, stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number): Boolean
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    fun on(event: String /* "connect" */, listener: (session: ServerHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ServerHttp2Session /* this */
    fun on(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): ServerHttp2Session /* this */
    override fun on(event: String, listener: (args: Any) -> Unit): ServerHttp2Session /* this */
    override fun on(event: Any, listener: (args: Any) -> Unit): ServerHttp2Session /* this */
    fun once(event: String /* "connect" */, listener: (session: ServerHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ServerHttp2Session /* this */
    fun once(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): ServerHttp2Session /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): ServerHttp2Session /* this */
    override fun once(event: Any, listener: (args: Any) -> Unit): ServerHttp2Session /* this */
    fun prependListener(event: String /* "connect" */, listener: (session: ServerHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ServerHttp2Session /* this */
    fun prependListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): ServerHttp2Session /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): ServerHttp2Session /* this */
    override fun prependListener(event: Any, listener: (args: Any) -> Unit): ServerHttp2Session /* this */
    fun prependOnceListener(event: String /* "connect" */, listener: (session: ServerHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ServerHttp2Session /* this */
    fun prependOnceListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): ServerHttp2Session /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): ServerHttp2Session /* this */
    override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): ServerHttp2Session /* this */
}

external interface SessionOptions {
    var maxDeflateDynamicTableSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxSessionMemory: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxHeaderListPairs: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxOutstandingPings: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxSendHeaderBlockLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var paddingStrategy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var peerMaxConcurrentStreams: Number?
        get() = definedExternally
        set(value) = definedExternally
    var settings: Settings?
        get() = definedExternally
        set(value) = definedExternally
    val selectPadding: ((frameLen: Number, maxFrameLen: Number) -> Number)?
        get() = definedExternally
    val createConnection: ((authority: URL, option: SessionOptions) -> Duplex)?
        get() = definedExternally
}

external interface ClientSessionOptions : SessionOptions {
    var maxReservedRemoteStreams: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var createConnection: ((authority: URL, option: SessionOptions) -> Duplex)?
        get() = definedExternally
        set(value) = definedExternally
    var protocol: String? /* "http:" | "https:" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ServerSessionOptions : SessionOptions {
    var Http1IncomingMessage: Any?
        get() = definedExternally
        set(value) = definedExternally
    var Http1ServerResponse: Any?
        get() = definedExternally
        set(value) = definedExternally
    var Http2ServerRequest: Any?
        get() = definedExternally
        set(value) = definedExternally
    var Http2ServerResponse: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SecureClientSessionOptions : ClientSessionOptions, ConnectionOptions

external interface SecureServerSessionOptions : ServerSessionOptions, TlsOptions

external interface ServerOptions : ServerSessionOptions

external interface SecureServerOptions : SecureServerSessionOptions {
    var allowHTTP1: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var origins: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Http2Server : Server {
    fun addListener(event: String /* "checkContinue" | "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2Server /* this */
    fun addListener(event: String /* "session" */, listener: (session: ServerHttp2Session) -> Unit): Http2Server /* this */
    override fun addListener(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2Server /* this */
    fun addListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Server /* this */
    override fun addListener(event: String /* "timeout" */, listener: () -> Unit): Http2Server /* this */
    override fun addListener(event: String, listener: (args: Any) -> Unit): Http2Server /* this */
    override fun addListener(event: Any, listener: (args: Any) -> Unit): Http2Server /* this */
    fun emit(event: String /* "checkContinue" | "request" */, request: Http2ServerRequest, response: Http2ServerResponse): Boolean
    fun emit(event: String /* "session" */, session: ServerHttp2Session): Boolean
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: String /* "sessionError" */, err: Error): Boolean
    fun emit(event: String /* "stream" */, stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number): Boolean
    override fun emit(event: String /* "timeout" */): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    fun on(event: String /* "checkContinue" | "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2Server /* this */
    fun on(event: String /* "session" */, listener: (session: ServerHttp2Session) -> Unit): Http2Server /* this */
    override fun on(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2Server /* this */
    fun on(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Server /* this */
    override fun on(event: String /* "timeout" */, listener: () -> Unit): Http2Server /* this */
    override fun on(event: String, listener: (args: Any) -> Unit): Http2Server /* this */
    override fun on(event: Any, listener: (args: Any) -> Unit): Http2Server /* this */
    fun once(event: String /* "checkContinue" | "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2Server /* this */
    fun once(event: String /* "session" */, listener: (session: ServerHttp2Session) -> Unit): Http2Server /* this */
    override fun once(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2Server /* this */
    fun once(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Server /* this */
    override fun once(event: String /* "timeout" */, listener: () -> Unit): Http2Server /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Http2Server /* this */
    override fun once(event: Any, listener: (args: Any) -> Unit): Http2Server /* this */
    fun prependListener(event: String /* "checkContinue" | "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2Server /* this */
    fun prependListener(event: String /* "session" */, listener: (session: ServerHttp2Session) -> Unit): Http2Server /* this */
    override fun prependListener(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2Server /* this */
    fun prependListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Server /* this */
    override fun prependListener(event: String /* "timeout" */, listener: () -> Unit): Http2Server /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): Http2Server /* this */
    override fun prependListener(event: Any, listener: (args: Any) -> Unit): Http2Server /* this */
    fun prependOnceListener(event: String /* "checkContinue" | "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2Server /* this */
    fun prependOnceListener(event: String /* "session" */, listener: (session: ServerHttp2Session) -> Unit): Http2Server /* this */
    override fun prependOnceListener(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2Server /* this */
    fun prependOnceListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2Server /* this */
    override fun prependOnceListener(event: String /* "timeout" */, listener: () -> Unit): Http2Server /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Http2Server /* this */
    override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): Http2Server /* this */
    fun setTimeout(msec: Number = definedExternally, callback: () -> Unit = definedExternally): Http2Server /* this */
}

external interface Http2SecureServer : _tls_Server {
    fun addListener(event: String /* "checkContinue" | "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2SecureServer /* this */
    fun addListener(event: String /* "session" */, listener: (session: ServerHttp2Session) -> Unit): Http2SecureServer /* this */
    override fun addListener(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2SecureServer /* this */
    fun addListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2SecureServer /* this */
    override fun addListener(event: String /* "timeout" */, listener: () -> Unit): Http2SecureServer /* this */
    override fun addListener(event: String /* "unknownProtocol" */, listener: (socket: TLSSocket) -> Unit): Http2SecureServer /* this */
    override fun addListener(event: String, listener: (args: Any) -> Unit): Http2SecureServer /* this */
    override fun addListener(event: Any, listener: (args: Any) -> Unit): Http2SecureServer /* this */
    fun emit(event: String /* "checkContinue" | "request" */, request: Http2ServerRequest, response: Http2ServerResponse): Boolean
    fun emit(event: String /* "session" */, session: ServerHttp2Session): Boolean
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: String /* "sessionError" */, err: Error): Boolean
    fun emit(event: String /* "stream" */, stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number): Boolean
    override fun emit(event: String /* "timeout" */): Boolean
    override fun emit(event: String /* "unknownProtocol" */, socket: TLSSocket): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    fun on(event: String /* "checkContinue" | "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2SecureServer /* this */
    fun on(event: String /* "session" */, listener: (session: ServerHttp2Session) -> Unit): Http2SecureServer /* this */
    override fun on(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2SecureServer /* this */
    fun on(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2SecureServer /* this */
    override fun on(event: String /* "timeout" */, listener: () -> Unit): Http2SecureServer /* this */
    override fun on(event: String /* "unknownProtocol" */, listener: (socket: TLSSocket) -> Unit): Http2SecureServer /* this */
    override fun on(event: String, listener: (args: Any) -> Unit): Http2SecureServer /* this */
    override fun on(event: Any, listener: (args: Any) -> Unit): Http2SecureServer /* this */
    fun once(event: String /* "checkContinue" | "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2SecureServer /* this */
    fun once(event: String /* "session" */, listener: (session: ServerHttp2Session) -> Unit): Http2SecureServer /* this */
    override fun once(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2SecureServer /* this */
    fun once(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2SecureServer /* this */
    override fun once(event: String /* "timeout" */, listener: () -> Unit): Http2SecureServer /* this */
    override fun once(event: String /* "unknownProtocol" */, listener: (socket: TLSSocket) -> Unit): Http2SecureServer /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Http2SecureServer /* this */
    override fun once(event: Any, listener: (args: Any) -> Unit): Http2SecureServer /* this */
    fun prependListener(event: String /* "checkContinue" | "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2SecureServer /* this */
    fun prependListener(event: String /* "session" */, listener: (session: ServerHttp2Session) -> Unit): Http2SecureServer /* this */
    override fun prependListener(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2SecureServer /* this */
    fun prependListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2SecureServer /* this */
    override fun prependListener(event: String /* "timeout" */, listener: () -> Unit): Http2SecureServer /* this */
    override fun prependListener(event: String /* "unknownProtocol" */, listener: (socket: TLSSocket) -> Unit): Http2SecureServer /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): Http2SecureServer /* this */
    override fun prependListener(event: Any, listener: (args: Any) -> Unit): Http2SecureServer /* this */
    fun prependOnceListener(event: String /* "checkContinue" | "request" */, listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit): Http2SecureServer /* this */
    fun prependOnceListener(event: String /* "session" */, listener: (session: ServerHttp2Session) -> Unit): Http2SecureServer /* this */
    override fun prependOnceListener(event: String /* "sessionError" */, listener: (err: Error) -> Unit): Http2SecureServer /* this */
    fun prependOnceListener(event: String /* "stream" */, listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Number) -> Unit): Http2SecureServer /* this */
    override fun prependOnceListener(event: String /* "timeout" */, listener: () -> Unit): Http2SecureServer /* this */
    override fun prependOnceListener(event: String /* "unknownProtocol" */, listener: (socket: TLSSocket) -> Unit): Http2SecureServer /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Http2SecureServer /* this */
    override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): Http2SecureServer /* this */
    fun setTimeout(msec: Number = definedExternally, callback: () -> Unit = definedExternally): Http2SecureServer /* this */
}