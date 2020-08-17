@file:JsModule("dgram")
@file:JsNonModule
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
import Buffer
import net.AddressInfo
import events.EventEmitter.EventEmitter

external fun createSocket(type: String /* "udp4" | "udp6" */, callback: (msg: Buffer, rinfo: RemoteInfo) -> Unit = definedExternally): Socket

external fun createSocket(options: SocketOptions, callback: (msg: Buffer, rinfo: RemoteInfo) -> Unit = definedExternally): Socket

external open class Socket : EventEmitter {
    open fun addMembership(multicastAddress: String, multicastInterface: String = definedExternally)
    open fun address(): AddressInfo
    open fun bind(port: Number = definedExternally, address: String = definedExternally, callback: () -> Unit = definedExternally)
    open fun bind(port: Number = definedExternally, callback: () -> Unit = definedExternally)
    open fun bind(callback: () -> Unit = definedExternally)
    open fun bind(options: BindOptions, callback: () -> Unit = definedExternally)
    open fun close(callback: () -> Unit = definedExternally)
    open fun connect(port: Number, address: String = definedExternally, callback: () -> Unit = definedExternally)
    open fun connect(port: Number, callback: () -> Unit)
    open fun disconnect()
    open fun dropMembership(multicastAddress: String, multicastInterface: String = definedExternally)
    open fun getRecvBufferSize(): Number
    open fun getSendBufferSize(): Number
    open fun ref(): Socket /* this */
    open fun remoteAddress(): AddressInfo
    open fun send(msg: String, port: Number = definedExternally, address: String = definedExternally, callback: (error: Error?, bytes: Number) -> Unit = definedExternally)
    open fun send(msg: Uint8Array, port: Number = definedExternally, address: String = definedExternally, callback: (error: Error?, bytes: Number) -> Unit = definedExternally)
    open fun send(msg: Array<Any>, port: Number = definedExternally, address: String = definedExternally, callback: (error: Error?, bytes: Number) -> Unit = definedExternally)
    open fun send(msg: String, port: Number = definedExternally, callback: (error: Error?, bytes: Number) -> Unit = definedExternally)
    open fun send(msg: Uint8Array, port: Number = definedExternally, callback: (error: Error?, bytes: Number) -> Unit = definedExternally)
    open fun send(msg: Array<Any>, port: Number = definedExternally, callback: (error: Error?, bytes: Number) -> Unit = definedExternally)
    open fun send(msg: String, callback: (error: Error?, bytes: Number) -> Unit = definedExternally)
    open fun send(msg: Uint8Array, callback: (error: Error?, bytes: Number) -> Unit = definedExternally)
    open fun send(msg: Array<Any>, callback: (error: Error?, bytes: Number) -> Unit = definedExternally)
    open fun send(msg: String, offset: Number, length: Number, port: Number = definedExternally, address: String = definedExternally, callback: (error: Error?, bytes: Number) -> Unit = definedExternally)
    open fun send(msg: Uint8Array, offset: Number, length: Number, port: Number = definedExternally, address: String = definedExternally, callback: (error: Error?, bytes: Number) -> Unit = definedExternally)
    open fun send(msg: String, offset: Number, length: Number, port: Number = definedExternally, callback: (error: Error?, bytes: Number) -> Unit = definedExternally)
    open fun send(msg: Uint8Array, offset: Number, length: Number, port: Number = definedExternally, callback: (error: Error?, bytes: Number) -> Unit = definedExternally)
    open fun send(msg: String, offset: Number, length: Number, callback: (error: Error?, bytes: Number) -> Unit = definedExternally)
    open fun send(msg: Uint8Array, offset: Number, length: Number, callback: (error: Error?, bytes: Number) -> Unit = definedExternally)
    open fun setBroadcast(flag: Boolean)
    open fun setMulticastInterface(multicastInterface: String)
    open fun setMulticastLoopback(flag: Boolean)
    open fun setMulticastTTL(ttl: Number)
    open fun setRecvBufferSize(size: Number)
    open fun setSendBufferSize(size: Number)
    open fun setTTL(ttl: Number)
    open fun unref(): Socket /* this */
    open fun addSourceSpecificMembership(sourceAddress: String, groupAddress: String, multicastInterface: String = definedExternally)
    open fun dropSourceSpecificMembership(sourceAddress: String, groupAddress: String, multicastInterface: String = definedExternally)
    override fun addListener(event: String, listener: (args: Any) -> Unit): Socket /* this */
    open fun addListener(event: String /* "close" | "connect" | "listening" */, listener: () -> Unit): Socket /* this */
    open fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): Socket /* this */
    open fun addListener(event: String /* "message" */, listener: (msg: Buffer, rinfo: RemoteInfo) -> Unit): Socket /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "close" | "connect" | "listening" */): Boolean
    open fun emit(event: String /* "error" */, err: Error): Boolean
    open fun emit(event: String /* "message" */, msg: Buffer, rinfo: RemoteInfo): Boolean
    override fun on(event: String, listener: (args: Any) -> Unit): Socket /* this */
    open fun on(event: String /* "close" | "connect" | "listening" */, listener: () -> Unit): Socket /* this */
    open fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Socket /* this */
    open fun on(event: String /* "message" */, listener: (msg: Buffer, rinfo: RemoteInfo) -> Unit): Socket /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Socket /* this */
    open fun once(event: String /* "close" | "connect" | "listening" */, listener: () -> Unit): Socket /* this */
    open fun once(event: String /* "error" */, listener: (err: Error) -> Unit): Socket /* this */
    open fun once(event: String /* "message" */, listener: (msg: Buffer, rinfo: RemoteInfo) -> Unit): Socket /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): Socket /* this */
    open fun prependListener(event: String /* "close" | "connect" | "listening" */, listener: () -> Unit): Socket /* this */
    open fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): Socket /* this */
    open fun prependListener(event: String /* "message" */, listener: (msg: Buffer, rinfo: RemoteInfo) -> Unit): Socket /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Socket /* this */
    open fun prependOnceListener(event: String /* "close" | "connect" | "listening" */, listener: () -> Unit): Socket /* this */
    open fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): Socket /* this */
    open fun prependOnceListener(event: String /* "message" */, listener: (msg: Buffer, rinfo: RemoteInfo) -> Unit): Socket /* this */
}