@file:JsModule("cluster")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package cluster

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
import child_process.ChildProcess
import net.Socket
import net.Server
import events.EventEmitter.EventEmitter
import NodeJS.Dict

external open class Worker : EventEmitter {
    open var id: Number
    open var process: ChildProcess
    open fun send(message: String?, sendHandle: Socket = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    open fun send(message: String?, sendHandle: Server = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    open fun send(message: Any?, sendHandle: Socket = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    open fun send(message: Any?, sendHandle: Server = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    open fun send(message: Number?, sendHandle: Socket = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    open fun send(message: Number?, sendHandle: Server = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    open fun send(message: Boolean?, sendHandle: Socket = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    open fun send(message: Boolean?, sendHandle: Server = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    open fun kill(signal: String = definedExternally)
    open fun destroy(signal: String = definedExternally)
    open fun disconnect()
    open fun isConnected(): Boolean
    open fun isDead(): Boolean
    open var exitedAfterDisconnect: Boolean
    override fun addListener(event: String, listener: (args: Any) -> Unit): Worker /* this */
    open fun addListener(event: String /* "disconnect" | "online" */, listener: () -> Unit): Worker /* this */
    open fun addListener(event: String /* "error" */, listener: (error: Error) -> Unit): Worker /* this */
    open fun addListener(event: String /* "exit" */, listener: (code: Number, signal: String) -> Unit): Worker /* this */
    open fun addListener(event: String /* "listening" */, listener: (address: Address) -> Unit): Worker /* this */
    open fun addListener(event: String /* "message" */, listener: (message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Worker /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "disconnect" | "online" */): Boolean
    open fun emit(event: String /* "error" */, error: Error): Boolean
    open fun emit(event: String /* "exit" */, code: Number, signal: String): Boolean
    open fun emit(event: String /* "listening" */, address: Address): Boolean
    open fun emit(event: String /* "message" */, message: Any, handle: Socket): Boolean
    open fun emit(event: String /* "message" */, message: Any, handle: Server): Boolean
    override fun on(event: String, listener: (args: Any) -> Unit): Worker /* this */
    open fun on(event: String /* "disconnect" | "online" */, listener: () -> Unit): Worker /* this */
    open fun on(event: String /* "error" */, listener: (error: Error) -> Unit): Worker /* this */
    open fun on(event: String /* "exit" */, listener: (code: Number, signal: String) -> Unit): Worker /* this */
    open fun on(event: String /* "listening" */, listener: (address: Address) -> Unit): Worker /* this */
    open fun on(event: String /* "message" */, listener: (message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Worker /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Worker /* this */
    open fun once(event: String /* "disconnect" | "online" */, listener: () -> Unit): Worker /* this */
    open fun once(event: String /* "error" */, listener: (error: Error) -> Unit): Worker /* this */
    open fun once(event: String /* "exit" */, listener: (code: Number, signal: String) -> Unit): Worker /* this */
    open fun once(event: String /* "listening" */, listener: (address: Address) -> Unit): Worker /* this */
    open fun once(event: String /* "message" */, listener: (message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Worker /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): Worker /* this */
    open fun prependListener(event: String /* "disconnect" | "online" */, listener: () -> Unit): Worker /* this */
    open fun prependListener(event: String /* "error" */, listener: (error: Error) -> Unit): Worker /* this */
    open fun prependListener(event: String /* "exit" */, listener: (code: Number, signal: String) -> Unit): Worker /* this */
    open fun prependListener(event: String /* "listening" */, listener: (address: Address) -> Unit): Worker /* this */
    open fun prependListener(event: String /* "message" */, listener: (message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Worker /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Worker /* this */
    open fun prependOnceListener(event: String /* "disconnect" | "online" */, listener: () -> Unit): Worker /* this */
    open fun prependOnceListener(event: String /* "error" */, listener: (error: Error) -> Unit): Worker /* this */
    open fun prependOnceListener(event: String /* "exit" */, listener: (code: Number, signal: String) -> Unit): Worker /* this */
    open fun prependOnceListener(event: String /* "listening" */, listener: (address: Address) -> Unit): Worker /* this */
    open fun prependOnceListener(event: String /* "message" */, listener: (message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Worker /* this */
}

external var SCHED_NONE: Number

external var SCHED_RR: Number

external fun disconnect(callback: () -> Unit = definedExternally)

external fun fork(env: Any = definedExternally): Worker

external var isMaster: Boolean

external var isWorker: Boolean

external var schedulingPolicy: Number

external var settings: ClusterSettings

external fun setupMaster(settings: ClusterSettings = definedExternally)

external var worker: Worker

external var workers: Dict<Worker>

external fun addListener(event: String, listener: (args: Any) -> Unit): Cluster

external fun addListener(event: String /* "disconnect" | "fork" | "online" */, listener: (worker: Worker) -> Unit): Cluster

external fun addListener(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster

external fun addListener(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster

external fun addListener(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster

external fun addListener(event: String /* "setup" */, listener: (settings: ClusterSettings) -> Unit): Cluster

external fun emit(event: String, vararg args: Any): Boolean

external fun emit(event: Any, vararg args: Any): Boolean

external fun emit(event: String /* "disconnect" | "fork" | "online" */, worker: Worker): Boolean

external fun emit(event: String /* "exit" */, worker: Worker, code: Number, signal: String): Boolean

external fun emit(event: String /* "listening" */, worker: Worker, address: Address): Boolean

external fun emit(event: String /* "message" */, worker: Worker, message: Any, handle: Socket): Boolean

external fun emit(event: String /* "message" */, worker: Worker, message: Any, handle: Server): Boolean

external fun emit(event: String /* "setup" */, settings: ClusterSettings): Boolean

external fun on(event: String, listener: (args: Any) -> Unit): Cluster

external fun on(event: String /* "disconnect" | "fork" | "online" */, listener: (worker: Worker) -> Unit): Cluster

external fun on(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster

external fun on(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster

external fun on(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster

external fun on(event: String /* "setup" */, listener: (settings: ClusterSettings) -> Unit): Cluster

external fun once(event: String, listener: (args: Any) -> Unit): Cluster

external fun once(event: String /* "disconnect" | "fork" | "online" */, listener: (worker: Worker) -> Unit): Cluster

external fun once(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster

external fun once(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster

external fun once(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster

external fun once(event: String /* "setup" */, listener: (settings: ClusterSettings) -> Unit): Cluster

external fun removeListener(event: String, listener: (args: Any) -> Unit): Cluster

external fun removeAllListeners(event: String = definedExternally): Cluster

external fun setMaxListeners(n: Number): Cluster

external fun getMaxListeners(): Number

external fun listeners(event: String): Array<Function<*>>

external fun listenerCount(type: String): Number

external fun prependListener(event: String, listener: (args: Any) -> Unit): Cluster

external fun prependListener(event: String /* "disconnect" | "fork" | "online" */, listener: (worker: Worker) -> Unit): Cluster

external fun prependListener(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster

external fun prependListener(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster

external fun prependListener(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster

external fun prependListener(event: String /* "setup" */, listener: (settings: ClusterSettings) -> Unit): Cluster

external fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Cluster

external fun prependOnceListener(event: String /* "disconnect" | "fork" | "online" */, listener: (worker: Worker) -> Unit): Cluster

external fun prependOnceListener(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster

external fun prependOnceListener(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster

external fun prependOnceListener(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster

external fun prependOnceListener(event: String /* "setup" */, listener: (settings: ClusterSettings) -> Unit): Cluster

external fun eventNames(): Array<String>