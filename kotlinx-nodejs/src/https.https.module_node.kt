@file:JsModule("https")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
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
import http.RequestListener
import tls.SecureContextOptions
import http.HttpBase
import http.RequestOptions
import http.IncomingMessage
import http.ClientRequest

external open class Agent(options: AgentOptions = definedExternally) : http.Agent {
    open var options: AgentOptions
}

external open class Server : tls.Server, HttpBase {
    override fun setTimeout(msecs: Number, callback: () -> Unit): Server /* this */
    override fun setTimeout(callback: () -> Unit): Server /* this */
    override var maxHeadersCount: Number?
    override var timeout: Number
    override var headersTimeout: Number
    override var keepAliveTimeout: Number
    constructor(requestListener: RequestListener = definedExternally)
    constructor(options: SecureContextOptions, requestListener: RequestListener = definedExternally)
}

external fun createServer(requestListener: RequestListener = definedExternally): Server

external fun createServer(options: SecureContextOptions /* tls.SecureContextOptions & tls.TlsOptions & http.ServerOptions */, requestListener: RequestListener = definedExternally): Server

external fun request(options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$59` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(options: String, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(options: URL, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(url: String, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$59` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(url: URL, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$59` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$59` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(options: String, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(options: URL, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(url: String, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$59` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(url: URL, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$59` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external var globalAgent: Agent