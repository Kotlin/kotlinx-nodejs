@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package net

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

typealias LookupFunction = (hostname: String, options: LookupOneOptions, callback: (err: ErrnoException?, address: String, family: Number) -> Unit) -> Unit

external interface AddressInfo {
    var address: String
    var family: String
    var port: Number
}

external interface SocketConstructorOpts {
    var fd: Number?
        get() = definedExternally
        set(value) = definedExternally
    var allowHalfOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var readable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var writable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OnReadOpts {
    var buffer: dynamic /* Uint8Array | () -> Uint8Array */
        get() = definedExternally
        set(value) = definedExternally
    fun callback(bytesWritten: Number, buf: Uint8Array): Boolean
}

external interface ConnectOpts {
    var onread: OnReadOpts?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TcpSocketConnectOpts : ConnectOpts {
    var port: Number
    var host: String?
        get() = definedExternally
        set(value) = definedExternally
    var localAddress: String?
        get() = definedExternally
        set(value) = definedExternally
    var localPort: Number?
        get() = definedExternally
        set(value) = definedExternally
    var hints: Number?
        get() = definedExternally
        set(value) = definedExternally
    var family: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lookup: LookupFunction?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IpcSocketConnectOpts : ConnectOpts {
    var path: String
}

external interface ListenOptions {
    var port: Number?
        get() = definedExternally
        set(value) = definedExternally
    var host: String?
        get() = definedExternally
        set(value) = definedExternally
    var backlog: Number?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var exclusive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var readableAll: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var writableAll: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ipv6Only: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$9` {
    var allowHalfOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var pauseOnConnect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TcpNetConnectOpts : TcpSocketConnectOpts, SocketConstructorOpts {
    var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IpcNetConnectOpts : IpcSocketConnectOpts, SocketConstructorOpts {
    var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
}