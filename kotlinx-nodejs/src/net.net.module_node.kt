@file:JsModule("net")
@file:JsNonModule
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
import Buffer
import stream.internal.Duplex
import events.EventEmitter.EventEmitter

external open class Socket(options: SocketConstructorOpts = definedExternally) : Duplex {
    open fun write(buffer: Uint8Array, cb: (err: Error) -> Unit = definedExternally): Boolean
    override fun write(chunk: Any, cb: (error: Error?) -> Unit): Boolean
    open fun write(buffer: String, cb: (err: Error) -> Unit = definedExternally): Boolean
    open fun write(str: Uint8Array, encoding: String = definedExternally, cb: (err: Error) -> Unit = definedExternally): Boolean
    override fun write(chunk: Any, encoding: String, cb: (error: Error?) -> Unit): Boolean
    open fun write(str: String, encoding: String = definedExternally, cb: (err: Error) -> Unit = definedExternally): Boolean
    open fun connect(options: TcpSocketConnectOpts, connectionListener: () -> Unit = definedExternally): Socket /* this */
    open fun connect(options: IpcSocketConnectOpts, connectionListener: () -> Unit = definedExternally): Socket /* this */
    open fun connect(port: Number, host: String, connectionListener: () -> Unit = definedExternally): Socket /* this */
    open fun connect(port: Number, connectionListener: () -> Unit = definedExternally): Socket /* this */
    open fun connect(path: String, connectionListener: () -> Unit = definedExternally): Socket /* this */
    override fun setEncoding(encoding: String): Socket /* this */
    override fun pause(): Socket /* this */
    override fun resume(): Socket /* this */
    open fun setTimeout(timeout: Number, callback: () -> Unit = definedExternally): Socket /* this */
    open fun setNoDelay(noDelay: Boolean = definedExternally): Socket /* this */
    open fun setKeepAlive(enable: Boolean = definedExternally, initialDelay: Number = definedExternally): Socket /* this */
    open fun address(): dynamic /* AddressInfo | String */
    open fun unref(): Socket /* this */
    open fun ref(): Socket /* this */
    open var bufferSize: Number
    open var bytesRead: Number
    open var bytesWritten: Number
    open var connecting: Boolean
    override var destroyed: Boolean
    open var localAddress: String
    open var localPort: Number
    open var remoteAddress: String
    open var remoteFamily: String
    open var remotePort: Number
    override fun end(cb: () -> Unit)
    open fun end(buffer: Uint8Array, cb: () -> Unit = definedExternally)
    override fun end(chunk: Any, cb: () -> Unit)
    open fun end(buffer: String, cb: () -> Unit = definedExternally)
    open fun end(str: Uint8Array, encoding: String = definedExternally, cb: () -> Unit = definedExternally)
    override fun end(chunk: Any, encoding: String, cb: () -> Unit)
    open fun end(str: String, encoding: String = definedExternally, cb: () -> Unit = definedExternally)
    override fun addListener(event: String, listener: (args: Any) -> Unit): Socket /* this */
    open fun addListener(event: String /* "close" */, listener: (had_error: Boolean) -> Unit): Socket /* this */
    override fun addListener(event: String /* "connect" | "drain" | "end" | "timeout" */, listener: () -> Unit): Socket /* this */
    open fun addListener(event: String /* "data" */, listener: (data: Buffer) -> Unit): Socket /* this */
    override fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): Socket /* this */
    open fun addListener(event: String /* "lookup" */, listener: (err: Error, address: String, family: dynamic /* String | Number */, host: String) -> Unit): Socket /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "close" */, had_error: Boolean): Boolean
    override fun emit(event: String /* "data" */, chunk: Any): Boolean
    override fun emit(event: String /* "connect" | "drain" | "end" | "timeout" */): Boolean
    open fun emit(event: String /* "data" */, data: Buffer): Boolean
    override fun emit(event: String /* "error" */, err: Error): Boolean
    open fun emit(event: String /* "lookup" */, err: Error, address: String, family: String, host: String): Boolean
    open fun emit(event: String /* "lookup" */, err: Error, address: String, family: Number, host: String): Boolean
    override fun on(event: String, listener: (args: Any) -> Unit): Socket /* this */
    open fun on(event: String /* "close" */, listener: (had_error: Boolean) -> Unit): Socket /* this */
    override fun on(event: String /* "connect" | "drain" | "end" | "timeout" */, listener: () -> Unit): Socket /* this */
    open fun on(event: String /* "data" */, listener: (data: Buffer) -> Unit): Socket /* this */
    override fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Socket /* this */
    open fun on(event: String /* "lookup" */, listener: (err: Error, address: String, family: dynamic /* String | Number */, host: String) -> Unit): Socket /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Socket /* this */
    open fun once(event: String /* "close" */, listener: (had_error: Boolean) -> Unit): Socket /* this */
    override fun once(event: String /* "connect" | "drain" | "end" | "timeout" */, listener: () -> Unit): Socket /* this */
    open fun once(event: String /* "data" */, listener: (data: Buffer) -> Unit): Socket /* this */
    override fun once(event: String /* "error" */, listener: (err: Error) -> Unit): Socket /* this */
    open fun once(event: String /* "lookup" */, listener: (err: Error, address: String, family: dynamic /* String | Number */, host: String) -> Unit): Socket /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): Socket /* this */
    open fun prependListener(event: String /* "close" */, listener: (had_error: Boolean) -> Unit): Socket /* this */
    override fun prependListener(event: String /* "connect" | "drain" | "end" | "timeout" */, listener: () -> Unit): Socket /* this */
    open fun prependListener(event: String /* "data" */, listener: (data: Buffer) -> Unit): Socket /* this */
    override fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): Socket /* this */
    open fun prependListener(event: String /* "lookup" */, listener: (err: Error, address: String, family: dynamic /* String | Number */, host: String) -> Unit): Socket /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Socket /* this */
    open fun prependOnceListener(event: String /* "close" */, listener: (had_error: Boolean) -> Unit): Socket /* this */
    override fun prependOnceListener(event: String /* "connect" | "drain" | "end" | "timeout" */, listener: () -> Unit): Socket /* this */
    open fun prependOnceListener(event: String /* "data" */, listener: (data: Buffer) -> Unit): Socket /* this */
    override fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): Socket /* this */
    open fun prependOnceListener(event: String /* "lookup" */, listener: (err: Error, address: String, family: dynamic /* String | Number */, host: String) -> Unit): Socket /* this */
}

external open class Server : EventEmitter {
    constructor(connectionListener: (socket: Socket) -> Unit = definedExternally)
    constructor(options: `T$9` = definedExternally, connectionListener: (socket: Socket) -> Unit = definedExternally)
    open fun listen(port: Number = definedExternally, hostname: String = definedExternally, backlog: Number = definedExternally, listeningListener: () -> Unit = definedExternally): Server /* this */
    open fun listen(port: Number = definedExternally, hostname: String = definedExternally, listeningListener: () -> Unit = definedExternally): Server /* this */
    open fun listen(port: Number = definedExternally, backlog: Number = definedExternally, listeningListener: () -> Unit = definedExternally): Server /* this */
    open fun listen(port: Number = definedExternally, listeningListener: () -> Unit = definedExternally): Server /* this */
    open fun listen(path: String, backlog: Number = definedExternally, listeningListener: () -> Unit = definedExternally): Server /* this */
    open fun listen(path: String, listeningListener: () -> Unit = definedExternally): Server /* this */
    open fun listen(options: ListenOptions, listeningListener: () -> Unit = definedExternally): Server /* this */
    open fun listen(handle: Any, backlog: Number = definedExternally, listeningListener: () -> Unit = definedExternally): Server /* this */
    open fun listen(handle: Any, listeningListener: () -> Unit = definedExternally): Server /* this */
    open fun close(callback: (err: Error) -> Unit = definedExternally): Server /* this */
    open fun address(): dynamic /* AddressInfo? | String? */
    open fun getConnections(cb: (error: Error?, count: Number) -> Unit)
    open fun ref(): Server /* this */
    open fun unref(): Server /* this */
    open var maxConnections: Number
    open var connections: Number
    open var listening: Boolean
    override fun addListener(event: String, listener: (args: Any) -> Unit): Server /* this */
    open fun addListener(event: String /* "close" | "listening" */, listener: () -> Unit): Server /* this */
    open fun addListener(event: String /* "connection" */, listener: (socket: Socket) -> Unit): Server /* this */
    open fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): Server /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "close" | "listening" */): Boolean
    open fun emit(event: String /* "connection" */, socket: Socket): Boolean
    open fun emit(event: String /* "error" */, err: Error): Boolean
    override fun on(event: String, listener: (args: Any) -> Unit): Server /* this */
    open fun on(event: String /* "close" | "listening" */, listener: () -> Unit): Server /* this */
    open fun on(event: String /* "connection" */, listener: (socket: Socket) -> Unit): Server /* this */
    open fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Server /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Server /* this */
    open fun once(event: String /* "close" | "listening" */, listener: () -> Unit): Server /* this */
    open fun once(event: String /* "connection" */, listener: (socket: Socket) -> Unit): Server /* this */
    open fun once(event: String /* "error" */, listener: (err: Error) -> Unit): Server /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): Server /* this */
    open fun prependListener(event: String /* "close" | "listening" */, listener: () -> Unit): Server /* this */
    open fun prependListener(event: String /* "connection" */, listener: (socket: Socket) -> Unit): Server /* this */
    open fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): Server /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Server /* this */
    open fun prependOnceListener(event: String /* "close" | "listening" */, listener: () -> Unit): Server /* this */
    open fun prependOnceListener(event: String /* "connection" */, listener: (socket: Socket) -> Unit): Server /* this */
    open fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): Server /* this */
}

external fun createServer(connectionListener: (socket: Socket) -> Unit = definedExternally): Server

external fun createServer(options: `T$9` = definedExternally, connectionListener: (socket: Socket) -> Unit = definedExternally): Server

external fun connect(options: TcpNetConnectOpts, connectionListener: () -> Unit = definedExternally): Socket

external fun connect(options: IpcNetConnectOpts, connectionListener: () -> Unit = definedExternally): Socket

external fun connect(port: Number, host: String = definedExternally, connectionListener: () -> Unit = definedExternally): Socket

external fun connect(path: String, connectionListener: () -> Unit = definedExternally): Socket

external fun createConnection(options: TcpNetConnectOpts, connectionListener: () -> Unit = definedExternally): Socket

external fun createConnection(options: IpcNetConnectOpts, connectionListener: () -> Unit = definedExternally): Socket

external fun createConnection(port: Number, host: String = definedExternally, connectionListener: () -> Unit = definedExternally): Socket

external fun createConnection(path: String, connectionListener: () -> Unit = definedExternally): Socket

external fun isIP(input: String): Number

external fun isIPv4(input: String): Boolean

external fun isIPv6(input: String): Boolean