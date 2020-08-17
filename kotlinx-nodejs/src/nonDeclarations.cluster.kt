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
import NodeJS.Dict
import net.Socket
import net.Server
import events.EventEmitter.EventEmitter

external interface ClusterSettings {
    var execArgv: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var exec: String?
        get() = definedExternally
        set(value) = definedExternally
    var args: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stdio: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var uid: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gid: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inspectPort: dynamic /* Number? | (() -> Number)? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface Address {
    var address: String
    var port: Number
    var addressType: dynamic /* Number | "udp4" | "udp6" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface Cluster : EventEmitter {
    var Worker: Worker
    fun disconnect(callback: () -> Unit = definedExternally)
    fun fork(env: Any = definedExternally): Worker
    var isMaster: Boolean
    var isWorker: Boolean
    var schedulingPolicy: Number
    var settings: ClusterSettings
    fun setupMaster(settings: ClusterSettings = definedExternally)
    var worker: Worker?
        get() = definedExternally
        set(value) = definedExternally
    var workers: Dict<Worker>?
        get() = definedExternally
        set(value) = definedExternally
    var SCHED_NONE: Number
    var SCHED_RR: Number
    override fun addListener(event: String, listener: (args: Any) -> Unit): Cluster /* this */
    fun addListener(event: String /* "disconnect" | "fork" | "online" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun addListener(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster /* this */
    fun addListener(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster /* this */
    fun addListener(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster /* this */
    fun addListener(event: String /* "setup" */, listener: (settings: ClusterSettings) -> Unit): Cluster /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    fun emit(event: String /* "disconnect" | "fork" | "online" */, worker: Worker): Boolean
    fun emit(event: String /* "exit" */, worker: Worker, code: Number, signal: String): Boolean
    fun emit(event: String /* "listening" */, worker: Worker, address: Address): Boolean
    fun emit(event: String /* "message" */, worker: Worker, message: Any, handle: Socket): Boolean
    fun emit(event: String /* "message" */, worker: Worker, message: Any, handle: Server): Boolean
    fun emit(event: String /* "setup" */, settings: ClusterSettings): Boolean
    override fun on(event: String, listener: (args: Any) -> Unit): Cluster /* this */
    fun on(event: String /* "disconnect" | "fork" | "online" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun on(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster /* this */
    fun on(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster /* this */
    fun on(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster /* this */
    fun on(event: String /* "setup" */, listener: (settings: ClusterSettings) -> Unit): Cluster /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Cluster /* this */
    fun once(event: String /* "disconnect" | "fork" | "online" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun once(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster /* this */
    fun once(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster /* this */
    fun once(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster /* this */
    fun once(event: String /* "setup" */, listener: (settings: ClusterSettings) -> Unit): Cluster /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): Cluster /* this */
    fun prependListener(event: String /* "disconnect" | "fork" | "online" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun prependListener(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster /* this */
    fun prependListener(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster /* this */
    fun prependListener(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster /* this */
    fun prependListener(event: String /* "setup" */, listener: (settings: ClusterSettings) -> Unit): Cluster /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Cluster /* this */
    fun prependOnceListener(event: String /* "disconnect" | "fork" | "online" */, listener: (worker: Worker) -> Unit): Cluster /* this */
    fun prependOnceListener(event: String /* "exit" */, listener: (worker: Worker, code: Number, signal: String) -> Unit): Cluster /* this */
    fun prependOnceListener(event: String /* "listening" */, listener: (worker: Worker, address: Address) -> Unit): Cluster /* this */
    fun prependOnceListener(event: String /* "message" */, listener: (worker: Worker, message: Any, handle: dynamic /* net.Socket | net.Server */) -> Unit): Cluster /* this */
    fun prependOnceListener(event: String /* "setup" */, listener: (settings: ClusterSettings) -> Unit): Cluster /* this */
}