@file:JsModule("https")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")
package https

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
import tls.ConnectionOptions
import tls.SecureContextOptions
import http.RequestListener
import http.RequestOptions
import http.IncomingMessage
import http.ClientRequest

external interface AgentOptions : http.AgentOptions, ConnectionOptions {
    override var rejectUnauthorized: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxCachedSessions: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Agent(options: AgentOptions = definedExternally) : http.Agent {
    open var options: AgentOptions
}

external open class Server(requestListener: http.RequestListener = definedExternally) : tls.Server {
    constructor(options: SecureContextOptions, requestListener: RequestListener)
    open fun setTimeout(callback: () -> Unit): Server /* this */
    open fun setTimeout(msecs: Number = definedExternally, callback: () -> Unit = definedExternally): Server /* this */
    open var maxHeadersCount: Number?
    open var timeout: Number
    open var headersTimeout: Number
    open var keepAliveTimeout: Number
}

external fun createServer(requestListener: RequestListener = definedExternally): Server

external fun createServer(options: SecureContextOptions /* tls.SecureContextOptions & tls.TlsOptions & http.ServerOptions */, requestListener: RequestListener = definedExternally): Server

external fun request(options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$62` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(options: String, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(options: URL, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(url: String, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$62` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(url: URL, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$62` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$62` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(options: String, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(options: URL, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(url: String, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$62` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(url: URL, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$62` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external var globalAgent: Agent
