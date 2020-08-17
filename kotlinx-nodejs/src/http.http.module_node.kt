@file:JsModule("http")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package http

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
import net.Socket
import stream.internal.Writable
import Buffer
import stream.internal.Readable
import NodeJS.Dict
import NodeJS.ReadOnlyDict
import net.Server as NetServer

external open class Server : NetServer, HttpBase {
    override fun setTimeout(msecs: Number, callback: () -> Unit): Server /* this */
    override fun setTimeout(callback: () -> Unit): Server /* this */
    override var maxHeadersCount: Number?
    override var timeout: Number
    override var headersTimeout: Number
    override var keepAliveTimeout: Number
    constructor(requestListener: RequestListener = definedExternally)
    constructor(options: ServerOptions, requestListener: RequestListener = definedExternally)
}

external open class OutgoingMessage : Writable {
    open var upgrading: Boolean
    open var chunkedEncoding: Boolean
    open var shouldKeepAlive: Boolean
    open var useChunkedEncodingByDefault: Boolean
    open var sendDate: Boolean
    open var finished: Boolean
    open var headersSent: Boolean
    open var connection: Socket
    open var socket: Socket
    open fun setTimeout(msecs: Number, callback: () -> Unit = definedExternally): OutgoingMessage /* this */
    open fun setHeader(name: String, value: Number)
    open fun setHeader(name: String, value: String)
    open fun setHeader(name: String, value: Array<String>)
    open fun getHeader(name: String): dynamic /* Number? | String? | Array<String>? */
    open fun getHeaders(): OutgoingHttpHeaders
    open fun getHeaderNames(): Array<String>
    open fun hasHeader(name: String): Boolean
    open fun removeHeader(name: String)
    open fun addTrailers(headers: OutgoingHttpHeaders)
    open fun addTrailers(headers: Array<dynamic /* JsTuple<String, String> */>)
    open fun flushHeaders()
}

external open class ServerResponse(req: IncomingMessage) : OutgoingMessage {
    open var statusCode: Number
    open var statusMessage: String
    open fun assignSocket(socket: Socket)
    open fun detachSocket(socket: Socket)
    open fun writeContinue(callback: () -> Unit = definedExternally)
    open fun writeHead(statusCode: Number, reasonPhrase: String = definedExternally, headers: OutgoingHttpHeaders = definedExternally): ServerResponse /* this */
    open fun writeHead(statusCode: Number, headers: OutgoingHttpHeaders = definedExternally): ServerResponse /* this */
    open fun writeProcessing()
}

external open class ClientRequest : OutgoingMessage {
    override var connection: Socket
    override var socket: Socket
    open var aborted: Number
    constructor(url: String, cb: (res: IncomingMessage) -> Unit = definedExternally)
    constructor(url: URL, cb: (res: IncomingMessage) -> Unit = definedExternally)
    constructor(url: ClientRequestArgs, cb: (res: IncomingMessage) -> Unit = definedExternally)
    open var method: String
    open var path: String
    open fun abort()
    open fun onSocket(socket: Socket)
    override fun setTimeout(timeout: Number, callback: () -> Unit): ClientRequest /* this */
    open fun setNoDelay(noDelay: Boolean = definedExternally)
    open fun setSocketKeepAlive(enable: Boolean = definedExternally, initialDelay: Number = definedExternally)
    override fun addListener(event: String /* "abort" | "continue" | "timeout" | "close" | "drain" | "finish" */, listener: () -> Unit): ClientRequest /* this */
    open fun addListener(event: String /* "connect" | "upgrade" */, listener: (response: IncomingMessage, socket: Socket, head: Buffer) -> Unit): ClientRequest /* this */
    open fun addListener(event: String /* "information" */, listener: (info: InformationEvent) -> Unit): ClientRequest /* this */
    open fun addListener(event: String /* "response" */, listener: (response: IncomingMessage) -> Unit): ClientRequest /* this */
    open fun addListener(event: String /* "socket" */, listener: (socket: Socket) -> Unit): ClientRequest /* this */
    override fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): ClientRequest /* this */
    override fun addListener(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): ClientRequest /* this */
    override fun addListener(event: String, listener: (args: Any) -> Unit): ClientRequest /* this */
    override fun addListener(event: Any, listener: (args: Any) -> Unit): ClientRequest /* this */
    override fun on(event: String /* "abort" | "continue" | "timeout" | "close" | "drain" | "finish" */, listener: () -> Unit): ClientRequest /* this */
    open fun on(event: String /* "connect" | "upgrade" */, listener: (response: IncomingMessage, socket: Socket, head: Buffer) -> Unit): ClientRequest /* this */
    open fun on(event: String /* "information" */, listener: (info: InformationEvent) -> Unit): ClientRequest /* this */
    open fun on(event: String /* "response" */, listener: (response: IncomingMessage) -> Unit): ClientRequest /* this */
    open fun on(event: String /* "socket" */, listener: (socket: Socket) -> Unit): ClientRequest /* this */
    override fun on(event: String /* "error" */, listener: (err: Error) -> Unit): ClientRequest /* this */
    override fun on(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): ClientRequest /* this */
    override fun on(event: String, listener: (args: Any) -> Unit): ClientRequest /* this */
    override fun on(event: Any, listener: (args: Any) -> Unit): ClientRequest /* this */
    override fun once(event: String /* "abort" | "continue" | "timeout" | "close" | "drain" | "finish" */, listener: () -> Unit): ClientRequest /* this */
    open fun once(event: String /* "connect" | "upgrade" */, listener: (response: IncomingMessage, socket: Socket, head: Buffer) -> Unit): ClientRequest /* this */
    open fun once(event: String /* "information" */, listener: (info: InformationEvent) -> Unit): ClientRequest /* this */
    open fun once(event: String /* "response" */, listener: (response: IncomingMessage) -> Unit): ClientRequest /* this */
    open fun once(event: String /* "socket" */, listener: (socket: Socket) -> Unit): ClientRequest /* this */
    override fun once(event: String /* "error" */, listener: (err: Error) -> Unit): ClientRequest /* this */
    override fun once(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): ClientRequest /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): ClientRequest /* this */
    override fun once(event: Any, listener: (args: Any) -> Unit): ClientRequest /* this */
    override fun prependListener(event: String /* "abort" | "continue" | "timeout" | "close" | "drain" | "finish" */, listener: () -> Unit): ClientRequest /* this */
    open fun prependListener(event: String /* "connect" | "upgrade" */, listener: (response: IncomingMessage, socket: Socket, head: Buffer) -> Unit): ClientRequest /* this */
    open fun prependListener(event: String /* "information" */, listener: (info: InformationEvent) -> Unit): ClientRequest /* this */
    open fun prependListener(event: String /* "response" */, listener: (response: IncomingMessage) -> Unit): ClientRequest /* this */
    open fun prependListener(event: String /* "socket" */, listener: (socket: Socket) -> Unit): ClientRequest /* this */
    override fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): ClientRequest /* this */
    override fun prependListener(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): ClientRequest /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): ClientRequest /* this */
    override fun prependListener(event: Any, listener: (args: Any) -> Unit): ClientRequest /* this */
    override fun prependOnceListener(event: String /* "abort" | "continue" | "timeout" | "close" | "drain" | "finish" */, listener: () -> Unit): ClientRequest /* this */
    open fun prependOnceListener(event: String /* "connect" | "upgrade" */, listener: (response: IncomingMessage, socket: Socket, head: Buffer) -> Unit): ClientRequest /* this */
    open fun prependOnceListener(event: String /* "information" */, listener: (info: InformationEvent) -> Unit): ClientRequest /* this */
    open fun prependOnceListener(event: String /* "response" */, listener: (response: IncomingMessage) -> Unit): ClientRequest /* this */
    open fun prependOnceListener(event: String /* "socket" */, listener: (socket: Socket) -> Unit): ClientRequest /* this */
    override fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): ClientRequest /* this */
    override fun prependOnceListener(event: String /* "pipe" | "unpipe" */, listener: (src: Readable) -> Unit): ClientRequest /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): ClientRequest /* this */
    override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): ClientRequest /* this */
}

external open class IncomingMessage(socket: Socket) : Readable {
    open var aborted: Boolean
    open var httpVersion: String
    open var httpVersionMajor: Number
    open var httpVersionMinor: Number
    open var complete: Boolean
    open var connection: Socket
    open var socket: Socket
    open var headers: IncomingHttpHeaders
    open var rawHeaders: Array<String>
    open var trailers: Dict<String>
    open var rawTrailers: Array<String>
    open fun setTimeout(msecs: Number, callback: () -> Unit = definedExternally): IncomingMessage /* this */
    open var method: String
    open var url: String
    open var statusCode: Number
    open var statusMessage: String
    override fun destroy(error: Error)
}

external open class Agent(opts: AgentOptions = definedExternally) {
    open var maxFreeSockets: Number
    open var maxSockets: Number
    open var sockets: ReadOnlyDict<Array<Socket>>
    open var requests: ReadOnlyDict<Array<IncomingMessage>>
    open fun destroy()
}

external var METHODS: Array<String>

external object STATUS_CODES {
    @nativeGetter
    operator fun get(errorCode: Number): String?
    @nativeSetter
    operator fun set(errorCode: Number, value: String?)
    @nativeGetter
    operator fun get(errorCode: String): String?
    @nativeSetter
    operator fun set(errorCode: String, value: String?)
}

external fun createServer(requestListener: RequestListener = definedExternally): Server

external fun createServer(options: ServerOptions, requestListener: RequestListener = definedExternally): Server

external fun request(options: RequestOptions, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(options: String, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(options: URL, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(url: String, options: RequestOptions, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(url: URL, options: RequestOptions, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(options: RequestOptions, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(options: String, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(options: URL, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(url: String, options: RequestOptions, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(url: URL, options: RequestOptions, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external var globalAgent: Agent

external var maxHeaderSize: Number