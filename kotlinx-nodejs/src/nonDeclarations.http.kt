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
import NodeJS.Dict
import net.Socket
import net.Server as NetServer

external interface IncomingHttpHeaders : Dict<dynamic /* String | Array<String> */> {
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
    var origin: String?
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
}

public inline operator fun http.IncomingHttpHeaders.get(key: String): Any? = this.asDynamic()[key]

public inline operator fun http.IncomingHttpHeaders.set(key: String, value: String?) { this.asDynamic()[key] = value }

public inline operator fun http.IncomingHttpHeaders.set(key: String, value: Array<String>?) { this.asDynamic()[key] = value }

external interface OutgoingHttpHeaders : Dict<dynamic /* Number | String | Array<String> */>

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
    var maxHeaderSize: Number?
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
    var maxHeaderSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var insecureHTTPParser: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

typealias RequestListener = (req: IncomingMessage, res: ServerResponse) -> Unit

external interface HttpBase {
    fun setTimeout(msecs: Number = definedExternally, callback: () -> Unit = definedExternally): HttpBase /* this */
    fun setTimeout(callback: () -> Unit): HttpBase /* this */
    var maxHeadersCount: Number?
    var timeout: Number
    var headersTimeout: Number
    var keepAliveTimeout: Number
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

external interface RequestOptions : ClientRequestArgs