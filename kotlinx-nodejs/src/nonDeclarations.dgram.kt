@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package dgram

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
import dns.LookupOneOptions
import NodeJS.ErrnoException

external interface RemoteInfo {
    var address: String
    var family: String /* "IPv4" | "IPv6" */
    var port: Number
    var size: Number
}

external interface BindOptions {
    var port: Number?
        get() = definedExternally
        set(value) = definedExternally
    var address: String?
        get() = definedExternally
        set(value) = definedExternally
    var exclusive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fd: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SocketOptions {
    var type: String /* "udp4" | "udp6" */
    var reuseAddr: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ipv6Only: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var recvBufferSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sendBufferSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lookup: ((hostname: String, options: LookupOneOptions, callback: (err: ErrnoException?, address: String, family: Number) -> Unit) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}