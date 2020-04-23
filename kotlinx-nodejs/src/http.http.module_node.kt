@file:JsModule("http")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
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
import net.Server as NetServer

external interface IncomingHttpHeaders {
    operator fun get(key: String): Any?
    operator fun set(key: String, value: Any?)
    var accept: String?
        get() = definedExternally
        set(value) = definedExternally
    var age: String?
        get() = definedExternally
        set(value) = definedExternally
    var allow: String?
        get() = definedExternally
        set(value) = definedExternally
    var authorization: String?
        get() = definedExternally
        set(value) = definedExternally
    var connection: String?
        get() = definedExternally
        set(value) = definedExternally
    var cookie: String?
        get() = definedExternally
        set(value) = definedExternally
    var date: String?
        get() = definedExternally
        set(value) = definedExternally
    var expect: String?
        get() = definedExternally
        set(value) = definedExternally
    var expires: String?
        get() = definedExternally
        set(value) = definedExternally
    var forwarded: String?
        get() = definedExternally
        set(value) = definedExternally
    var from: String?
        get() = definedExternally
        set(value) = definedExternally
    var host: String?
        get() = definedExternally
        set(value) = definedExternally
    var location: String?
        get() = definedExternally
        set(value) = definedExternally
    var pragma: String?
        get() = definedExternally
        set(value) = definedExternally
    var range: String?
        get() = definedExternally
        set(value) = definedExternally
    var referer: String?
        get() = definedExternally
        set(value) = definedExternally
    var tk: String?
        get() = definedExternally
        set(value) = definedExternally
    var trailer: String?
        get() = definedExternally
        set(value) = definedExternally
    var upgrade: String?
        get() = definedExternally
        set(value) = definedExternally
    var vary: String?
        get() = definedExternally
        set(value) = definedExternally
    var via: String?
        get() = definedExternally
        set(value) = definedExternally
    var warning: String?
        get() = definedExternally
        set(value) = definedExternally
    @nativeGetter
    operator fun get(header: String): dynamic /* String? | Array<String>? */
    @nativeSetter
    operator fun set(header: String, value: String?)
    @nativeSetter
    operator fun set(header: String, value: Array<String>?)
}

external interface OutgoingHttpHeaders {
    @nativeGetter
    operator fun get(header: String): dynamic /* Number? | String? | Array<String>? */
    @nativeSetter
    operator fun set(header: String, value: Number?)
    @nativeSetter
    operator fun set(header: String, value: String?)
    @nativeSetter
    operator fun set(header: String, value: Array<String>?)
}

external interface ClientRequestArgs {
    var protocol: String?
        get() = definedExternally
        set(value) = definedExternally
    var host: String?
        get() = definedExternally
        set(value) = definedExternally
    var hostname: String?
        get() = definedExternally
        set(value) = definedExternally
    var family: Number?
        get() = definedExternally
        set(value) = definedExternally
    var port: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var defaultPort: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var localAddress: String?
        get() = definedExternally
        set(value) = definedExternally
    var socketPath: String?
        get() = definedExternally
        set(value) = definedExternally
    var method: String?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var headers: OutgoingHttpHeaders?
        get() = definedExternally
        set(value) = definedExternally
    var auth: String?
        get() = definedExternally
        set(value) = definedExternally
    var agent: dynamic /* Agent? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var _defaultAgent: Agent?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var setHost: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var createConnection: ((options: ClientRequestArgs, oncreate: (err: Error, socket: Socket) -> Unit) -> Socket)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ServerOptions {
    var IncomingMessage: Any?
        get() = definedExternally
        set(value) = definedExternally
    var ServerResponse: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Server(requestListener: RequestListener = definedExternally) : NetServer {
    constructor(options: ServerOptions, requestListener: RequestListener)
    open fun setTimeout(msecs: Number = definedExternally, callback: () -> Unit = definedExternally): Server /* this */
    open fun setTimeout(callback: () -> Unit): Server /* this */
    open var maxHeadersCount: Number?
    open var timeout: Number
    open var headersTimeout: Number
    open var keepAliveTimeout: Number
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
    override var writableFinished: Boolean
    open fun assignSocket(socket: Socket)
    open fun detachSocket(socket: Socket)
    open fun writeContinue(callback: () -> Unit = definedExternally)
    open fun writeHead(statusCode: Number, reasonPhrase: String = definedExternally, headers: OutgoingHttpHeaders = definedExternally): ServerResponse /* this */
    open fun writeHead(statusCode: Number, headers: OutgoingHttpHeaders = definedExternally): ServerResponse /* this */
}

external interface InformationEvent {
    var statusCode: Number
    var statusMessage: String
    var httpVersion: String
    var httpVersionMajor: Number
    var httpVersionMinor: Number
    var headers: IncomingHttpHeaders
    var rawHeaders: Array<String>
}

external open class ClientRequest : OutgoingMessage {
    constructor(url: String, cb: (res: IncomingMessage) -> Unit)
    constructor(url: URL, cb: (res: IncomingMessage) -> Unit)
    constructor(url: ClientRequestArgs, cb: (res: IncomingMessage) -> Unit)
    override var connection: Socket
    open var socket: Socket
    open var aborted: Number
    open var path: String
    open fun abort()
    open fun onSocket(socket: Socket)
    override fun setTimeout(timeout: Number, callback: () -> Unit): ClientRequest /* this */
    open fun setNoDelay(noDelay: Boolean = definedExternally)
    open fun setSocketKeepAlive(enable: Boolean = definedExternally, initialDelay: Number = definedExternally)
    override fun addListener(event: String, listener: () -> Unit): ClientRequest /* this */
    open fun addListener(event: String, listener: (response: IncomingMessage, socket: Socket, head: Buffer) -> Unit): ClientRequest /* this */
    open fun addListener(event: String /* 'information' */, listener: (info: InformationEvent) -> Unit): ClientRequest /* this */
    open fun addListener(event: String /* 'response' */, listener: (response: IncomingMessage) -> Unit): ClientRequest /* this */
    open fun addListener(event: String /* 'socket' */, listener: (socket: Socket) -> Unit): ClientRequest /* this */
    override fun addListener(event: String /* 'error' */, listener: (err: Error) -> Unit): ClientRequest /* this */
    override fun addListener(event: String, listener: (src: Readable) -> Unit): ClientRequest /* this */
    override fun addListener(event: String, listener: (args: Array<Any>) -> Unit): ClientRequest /* this */
    override fun addListener(event: Any, listener: (args: Array<Any>) -> Unit): ClientRequest /* this */
    override fun on(event: String, listener: () -> Unit): ClientRequest /* this */
    open fun on(event: String, listener: (response: IncomingMessage, socket: Socket, head: Buffer) -> Unit): ClientRequest /* this */
    open fun on(event: String /* 'information' */, listener: (info: InformationEvent) -> Unit): ClientRequest /* this */
    open fun on(event: String /* 'response' */, listener: (response: IncomingMessage) -> Unit): ClientRequest /* this */
    open fun on(event: String /* 'socket' */, listener: (socket: Socket) -> Unit): ClientRequest /* this */
    override fun on(event: String /* 'error' */, listener: (err: Error) -> Unit): ClientRequest /* this */
    override fun on(event: String, listener: (src: Readable) -> Unit): ClientRequest /* this */
    override fun on(event: String, listener: (args: Array<Any>) -> Unit): ClientRequest /* this */
    override fun on(event: Any, listener: (args: Array<Any>) -> Unit): ClientRequest /* this */
    override fun once(event: String, listener: () -> Unit): ClientRequest /* this */
    open fun once(event: String, listener: (response: IncomingMessage, socket: Socket, head: Buffer) -> Unit): ClientRequest /* this */
    open fun once(event: String /* 'information' */, listener: (info: InformationEvent) -> Unit): ClientRequest /* this */
    open fun once(event: String /* 'response' */, listener: (response: IncomingMessage) -> Unit): ClientRequest /* this */
    open fun once(event: String /* 'socket' */, listener: (socket: Socket) -> Unit): ClientRequest /* this */
    override fun once(event: String /* 'error' */, listener: (err: Error) -> Unit): ClientRequest /* this */
    override fun once(event: String, listener: (src: Readable) -> Unit): ClientRequest /* this */
    override fun once(event: String, listener: (args: Array<Any>) -> Unit): ClientRequest /* this */
    override fun once(event: Any, listener: (args: Array<Any>) -> Unit): ClientRequest /* this */
    override fun prependListener(event: String, listener: () -> Unit): ClientRequest /* this */
    open fun prependListener(event: String, listener: (response: IncomingMessage, socket: Socket, head: Buffer) -> Unit): ClientRequest /* this */
    open fun prependListener(event: String /* 'information' */, listener: (info: InformationEvent) -> Unit): ClientRequest /* this */
    open fun prependListener(event: String /* 'response' */, listener: (response: IncomingMessage) -> Unit): ClientRequest /* this */
    open fun prependListener(event: String /* 'socket' */, listener: (socket: Socket) -> Unit): ClientRequest /* this */
    override fun prependListener(event: String /* 'error' */, listener: (err: Error) -> Unit): ClientRequest /* this */
    override fun prependListener(event: String, listener: (src: Readable) -> Unit): ClientRequest /* this */
    override fun prependListener(event: String, listener: (args: Array<Any>) -> Unit): ClientRequest /* this */
    override fun prependListener(event: Any, listener: (args: Array<Any>) -> Unit): ClientRequest /* this */
    override fun prependOnceListener(event: String, listener: () -> Unit): ClientRequest /* this */
    open fun prependOnceListener(event: String, listener: (response: IncomingMessage, socket: Socket, head: Buffer) -> Unit): ClientRequest /* this */
    open fun prependOnceListener(event: String /* 'information' */, listener: (info: InformationEvent) -> Unit): ClientRequest /* this */
    open fun prependOnceListener(event: String /* 'response' */, listener: (response: IncomingMessage) -> Unit): ClientRequest /* this */
    open fun prependOnceListener(event: String /* 'socket' */, listener: (socket: Socket) -> Unit): ClientRequest /* this */
    override fun prependOnceListener(event: String /* 'error' */, listener: (err: Error) -> Unit): ClientRequest /* this */
    override fun prependOnceListener(event: String, listener: (src: Readable) -> Unit): ClientRequest /* this */
    override fun prependOnceListener(event: String, listener: (args: Array<Any>) -> Unit): ClientRequest /* this */
    override fun prependOnceListener(event: Any, listener: (args: Array<Any>) -> Unit): ClientRequest /* this */
}

external interface `T$56` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String?)
}

external open class IncomingMessage(socket: Socket) : Readable {
    open var httpVersion: String
    open var httpVersionMajor: Number
    open var httpVersionMinor: Number
    open var complete: Boolean
    open var connection: Socket
    open var headers: IncomingHttpHeaders
    open var rawHeaders: Array<String>
    open var trailers: `T$56`
    open var rawTrailers: Array<String>
    open fun setTimeout(msecs: Number, callback: () -> Unit = definedExternally): IncomingMessage /* this */
    open var method: String
    open var url: String
    open var statusCode: Number
    open var statusMessage: String
    open var socket: Socket
    override fun destroy(error: Error)
}

external interface AgentOptions {
    var keepAlive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var keepAliveMsecs: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxSockets: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxFreeSockets: Number?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$57` {
    @nativeGetter
    operator fun get(key: String): Array<Socket>?
    @nativeSetter
    operator fun set(key: String, value: Array<Socket>)
}

external interface `T$58` {
    @nativeGetter
    operator fun get(key: String): Array<IncomingMessage>?
    @nativeSetter
    operator fun set(key: String, value: Array<IncomingMessage>)
}

external open class Agent(opts: AgentOptions = definedExternally) {
    open var maxFreeSockets: Number
    open var maxSockets: Number
    open var sockets: `T$57`
    open var requests: `T$58`
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

external interface RequestOptions : ClientRequestArgs

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