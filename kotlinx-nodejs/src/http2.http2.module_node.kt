@file:JsModule("http2")
@file:JsNonModule
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
import stream.internal.ReadableOptions
import Buffer
import stream.internal.Readable
import http.OutgoingHttpHeaders
import stream.internal.Stream
import http.IncomingHttpHeaders as Http1IncomingHttpHeaders

external open class Http2ServerRequest(stream: ServerHttp2Stream, headers: IncomingHttpHeaders, options: ReadableOptions, rawHeaders: Array<String>) : Readable {
    open var aborted: Boolean
    open var authority: String
    open var headers: IncomingHttpHeaders
    open var httpVersion: String
    open var method: String
    open var rawHeaders: Array<String>
    open var rawTrailers: Array<String>
    open var scheme: String
    open var socket: dynamic /* net.Socket | tls.TLSSocket */
    open var stream: ServerHttp2Stream
    open var trailers: IncomingHttpHeaders
    open var url: String
    open fun setTimeout(msecs: Number, callback: () -> Unit = definedExternally)
    override fun read(size: Number): dynamic /* Buffer? | String? */
    open fun addListener(event: String /* "aborted" */, listener: (hadError: Boolean, code: Number) -> Unit): Http2ServerRequest /* this */
    override fun addListener(event: String /* "close" | "end" | "readable" */, listener: () -> Unit): Http2ServerRequest /* this */
    override fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): Http2ServerRequest /* this */
    override fun addListener(event: String, listener: (args: Any) -> Unit): Http2ServerRequest /* this */
    override fun addListener(event: Any, listener: (args: Any) -> Unit): Http2ServerRequest /* this */
    open fun emit(event: String /* "aborted" */, hadError: Boolean, code: Number): Boolean
    override fun emit(event: String /* "close" | "end" | "readable" */): Boolean
    open fun emit(event: String /* "data" */, chunk: Buffer): Boolean
    override fun emit(event: String /* "data" */, chunk: Any): Boolean
    open fun emit(event: String /* "data" */, chunk: String): Boolean
    override fun emit(event: String /* "error" */, err: Error): Boolean
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun on(event: String /* "aborted" */, listener: (hadError: Boolean, code: Number) -> Unit): Http2ServerRequest /* this */
    override fun on(event: String /* "close" | "end" | "readable" */, listener: () -> Unit): Http2ServerRequest /* this */
    override fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Http2ServerRequest /* this */
    override fun on(event: String, listener: (args: Any) -> Unit): Http2ServerRequest /* this */
    override fun on(event: Any, listener: (args: Any) -> Unit): Http2ServerRequest /* this */
    open fun once(event: String /* "aborted" */, listener: (hadError: Boolean, code: Number) -> Unit): Http2ServerRequest /* this */
    override fun once(event: String /* "close" | "end" | "readable" */, listener: () -> Unit): Http2ServerRequest /* this */
    override fun once(event: String /* "error" */, listener: (err: Error) -> Unit): Http2ServerRequest /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Http2ServerRequest /* this */
    override fun once(event: Any, listener: (args: Any) -> Unit): Http2ServerRequest /* this */
    open fun prependListener(event: String /* "aborted" */, listener: (hadError: Boolean, code: Number) -> Unit): Http2ServerRequest /* this */
    override fun prependListener(event: String /* "close" | "end" | "readable" */, listener: () -> Unit): Http2ServerRequest /* this */
    override fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): Http2ServerRequest /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): Http2ServerRequest /* this */
    override fun prependListener(event: Any, listener: (args: Any) -> Unit): Http2ServerRequest /* this */
    open fun prependOnceListener(event: String /* "aborted" */, listener: (hadError: Boolean, code: Number) -> Unit): Http2ServerRequest /* this */
    override fun prependOnceListener(event: String /* "close" | "end" | "readable" */, listener: () -> Unit): Http2ServerRequest /* this */
    override fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): Http2ServerRequest /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Http2ServerRequest /* this */
    override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): Http2ServerRequest /* this */
}

external open class Http2ServerResponse(stream: ServerHttp2Stream) : Stream {
    open var connection: dynamic /* net.Socket | tls.TLSSocket */
    open var finished: Boolean
    open var headersSent: Boolean
    open var socket: dynamic /* net.Socket | tls.TLSSocket */
    open var stream: ServerHttp2Stream
    open var sendDate: Boolean
    open var statusCode: Number
    open var statusMessage: String /* "" */
    open fun addTrailers(trailers: OutgoingHttpHeaders)
    open fun end(callback: () -> Unit = definedExternally)
    open fun end(data: String, callback: () -> Unit = definedExternally)
    open fun end(data: Uint8Array, callback: () -> Unit = definedExternally)
    open fun end(data: String, encoding: String, callback: () -> Unit = definedExternally)
    open fun end(data: Uint8Array, encoding: String, callback: () -> Unit = definedExternally)
    open fun getHeader(name: String): String
    open fun getHeaderNames(): Array<String>
    open fun getHeaders(): OutgoingHttpHeaders
    open fun hasHeader(name: String): Boolean
    open fun removeHeader(name: String)
    open fun setHeader(name: String, value: Number)
    open fun setHeader(name: String, value: String)
    open fun setHeader(name: String, value: Array<String>)
    open fun setTimeout(msecs: Number, callback: () -> Unit = definedExternally)
    open fun write(chunk: String, callback: (err: Error) -> Unit = definedExternally): Boolean
    open fun write(chunk: Uint8Array, callback: (err: Error) -> Unit = definedExternally): Boolean
    open fun write(chunk: String, encoding: String, callback: (err: Error) -> Unit = definedExternally): Boolean
    open fun write(chunk: Uint8Array, encoding: String, callback: (err: Error) -> Unit = definedExternally): Boolean
    open fun writeContinue()
    open fun writeHead(statusCode: Number, headers: OutgoingHttpHeaders = definedExternally): Http2ServerResponse /* this */
    open fun writeHead(statusCode: Number, statusMessage: String, headers: OutgoingHttpHeaders = definedExternally): Http2ServerResponse /* this */
    open fun createPushResponse(headers: OutgoingHttpHeaders, callback: (err: Error?, res: Http2ServerResponse) -> Unit)
    open fun addListener(event: String /* "close" | "drain" | "finish" */, listener: () -> Unit): Http2ServerResponse /* this */
    open fun addListener(event: String /* "error" */, listener: (error: Error) -> Unit): Http2ServerResponse /* this */
    open fun addListener(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Http2ServerResponse /* this */
    override fun addListener(event: String, listener: (args: Any) -> Unit): Http2ServerResponse /* this */
    override fun addListener(event: Any, listener: (args: Any) -> Unit): Http2ServerResponse /* this */
    open fun emit(event: String /* "close" | "drain" | "finish" */): Boolean
    open fun emit(event: String /* "error" */, error: Error): Boolean
    override fun emit(event: String, vararg args: Any): Boolean
    open fun emit(event: String /* "pipe" | "unpipe" */, src: Readable): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun on(event: String /* "close" | "drain" | "finish" */, listener: () -> Unit): Http2ServerResponse /* this */
    open fun on(event: String /* "error" */, listener: (error: Error) -> Unit): Http2ServerResponse /* this */
    open fun on(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Http2ServerResponse /* this */
    override fun on(event: String, listener: (args: Any) -> Unit): Http2ServerResponse /* this */
    override fun on(event: Any, listener: (args: Any) -> Unit): Http2ServerResponse /* this */
    open fun once(event: String /* "close" | "drain" | "finish" */, listener: () -> Unit): Http2ServerResponse /* this */
    open fun once(event: String /* "error" */, listener: (error: Error) -> Unit): Http2ServerResponse /* this */
    open fun once(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Http2ServerResponse /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Http2ServerResponse /* this */
    override fun once(event: Any, listener: (args: Any) -> Unit): Http2ServerResponse /* this */
    open fun prependListener(event: String /* "close" | "drain" | "finish" */, listener: () -> Unit): Http2ServerResponse /* this */
    open fun prependListener(event: String /* "error" */, listener: (error: Error) -> Unit): Http2ServerResponse /* this */
    open fun prependListener(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Http2ServerResponse /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): Http2ServerResponse /* this */
    override fun prependListener(event: Any, listener: (args: Any) -> Unit): Http2ServerResponse /* this */
    open fun prependOnceListener(event: String /* "close" | "drain" | "finish" */, listener: () -> Unit): Http2ServerResponse /* this */
    open fun prependOnceListener(event: String /* "error" */, listener: (error: Error) -> Unit): Http2ServerResponse /* this */
    open fun prependOnceListener(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): Http2ServerResponse /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Http2ServerResponse /* this */
    override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): Http2ServerResponse /* this */
}

external fun getDefaultSettings(): Settings

external fun getPackedSettings(settings: Settings): Buffer

external fun getUnpackedSettings(buf: Uint8Array): Settings

external fun createServer(onRequestHandler: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit = definedExternally): Http2Server

external fun createServer(options: ServerOptions, onRequestHandler: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit = definedExternally): Http2Server

external fun createSecureServer(onRequestHandler: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit = definedExternally): Http2SecureServer

external fun createSecureServer(options: SecureServerOptions, onRequestHandler: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit = definedExternally): Http2SecureServer

external fun connect(authority: String, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ClientHttp2Session

external fun connect(authority: URL, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit): ClientHttp2Session

external fun connect(authority: String, options: ClientSessionOptions = definedExternally, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit = definedExternally): ClientHttp2Session

external fun connect(authority: String, options: SecureClientSessionOptions = definedExternally, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit = definedExternally): ClientHttp2Session

external fun connect(authority: URL, options: ClientSessionOptions = definedExternally, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit = definedExternally): ClientHttp2Session

external fun connect(authority: URL, options: SecureClientSessionOptions = definedExternally, listener: (session: ClientHttp2Session, socket: dynamic /* net.Socket | tls.TLSSocket */) -> Unit = definedExternally): ClientHttp2Session