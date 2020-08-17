@file:JsModule("worker_threads")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package worker_threads

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
import events.EventEmitter.EventEmitter
import stream.internal.Writable
import stream.internal.Readable
import vm.Context

external var isMainThread: Boolean

external var parentPort: MessagePort?

external var SHARE_ENV: Any

external var threadId: Number

external var workerData: Any

external open class MessageChannel {
    open var port1: MessagePort
    open var port2: MessagePort
}

external open class MessagePort : EventEmitter {
    open fun close()
    open fun postMessage(value: Any, transferList: Array<dynamic /* ArrayBuffer | MessagePort */> = definedExternally)
    open fun ref()
    open fun unref()
    open fun start()
    open fun addListener(event: String /* "close" */, listener: () -> Unit): MessagePort /* this */
    override fun addListener(event: String /* "message" */, listener: (value: Any) -> Unit): MessagePort /* this */
    override fun addListener(event: Any, listener: (args: Any) -> Unit): MessagePort /* this */
    open fun emit(event: String /* "close" */): Boolean
    open fun emit(event: String /* "message" */, value: Any): Boolean
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun on(event: String /* "close" */, listener: () -> Unit): MessagePort /* this */
    override fun on(event: String /* "message" */, listener: (value: Any) -> Unit): MessagePort /* this */
    override fun on(event: Any, listener: (args: Any) -> Unit): MessagePort /* this */
    open fun once(event: String /* "close" */, listener: () -> Unit): MessagePort /* this */
    override fun once(event: String /* "message" */, listener: (value: Any) -> Unit): MessagePort /* this */
    override fun once(event: Any, listener: (args: Any) -> Unit): MessagePort /* this */
    open fun prependListener(event: String /* "close" */, listener: () -> Unit): MessagePort /* this */
    override fun prependListener(event: String /* "message" */, listener: (value: Any) -> Unit): MessagePort /* this */
    override fun prependListener(event: Any, listener: (args: Any) -> Unit): MessagePort /* this */
    open fun prependOnceListener(event: String /* "close" */, listener: () -> Unit): MessagePort /* this */
    override fun prependOnceListener(event: String /* "message" */, listener: (value: Any) -> Unit): MessagePort /* this */
    override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): MessagePort /* this */
    open fun removeListener(event: String /* "close" */, listener: () -> Unit): MessagePort /* this */
    override fun removeListener(event: String /* "message" */, listener: (value: Any) -> Unit): MessagePort /* this */
    override fun removeListener(event: Any, listener: (args: Any) -> Unit): MessagePort /* this */
    open fun off(event: String /* "close" */, listener: () -> Unit): MessagePort /* this */
    override fun off(event: String /* "message" */, listener: (value: Any) -> Unit): MessagePort /* this */
    override fun off(event: Any, listener: (args: Any) -> Unit): MessagePort /* this */
}

external open class Worker : EventEmitter {
    open var stdin: Writable?
    open var stdout: Readable
    open var stderr: Readable
    open var threadId: Number
    open var resourceLimits: ResourceLimits
    constructor(filename: String, options: WorkerOptions = definedExternally)
    constructor(filename: URL, options: WorkerOptions = definedExternally)
    open fun postMessage(value: Any, transferList: Array<dynamic /* ArrayBuffer | MessagePort */> = definedExternally)
    open fun ref()
    open fun unref()
    open fun terminate(): Promise<Number>
    open fun getHeapSnapshot(): Promise<Readable>
    open fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): Worker /* this */
    open fun addListener(event: String /* "exit" */, listener: (exitCode: Number) -> Unit): Worker /* this */
    override fun addListener(event: String /* "message" */, listener: (value: Any) -> Unit): Worker /* this */
    open fun addListener(event: String /* "online" */, listener: () -> Unit): Worker /* this */
    override fun addListener(event: Any, listener: (args: Any) -> Unit): Worker /* this */
    open fun emit(event: String /* "error" */, err: Error): Boolean
    override fun emit(event: String, vararg args: Any): Boolean
    open fun emit(event: String /* "exit" */, exitCode: Number): Boolean
    open fun emit(event: String /* "message" */, value: Any): Boolean
    open fun emit(event: String /* "online" */): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Worker /* this */
    open fun on(event: String /* "exit" */, listener: (exitCode: Number) -> Unit): Worker /* this */
    override fun on(event: String /* "message" */, listener: (value: Any) -> Unit): Worker /* this */
    open fun on(event: String /* "online" */, listener: () -> Unit): Worker /* this */
    override fun on(event: Any, listener: (args: Any) -> Unit): Worker /* this */
    open fun once(event: String /* "error" */, listener: (err: Error) -> Unit): Worker /* this */
    open fun once(event: String /* "exit" */, listener: (exitCode: Number) -> Unit): Worker /* this */
    override fun once(event: String /* "message" */, listener: (value: Any) -> Unit): Worker /* this */
    open fun once(event: String /* "online" */, listener: () -> Unit): Worker /* this */
    override fun once(event: Any, listener: (args: Any) -> Unit): Worker /* this */
    open fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): Worker /* this */
    open fun prependListener(event: String /* "exit" */, listener: (exitCode: Number) -> Unit): Worker /* this */
    override fun prependListener(event: String /* "message" */, listener: (value: Any) -> Unit): Worker /* this */
    open fun prependListener(event: String /* "online" */, listener: () -> Unit): Worker /* this */
    override fun prependListener(event: Any, listener: (args: Any) -> Unit): Worker /* this */
    open fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): Worker /* this */
    open fun prependOnceListener(event: String /* "exit" */, listener: (exitCode: Number) -> Unit): Worker /* this */
    override fun prependOnceListener(event: String /* "message" */, listener: (value: Any) -> Unit): Worker /* this */
    open fun prependOnceListener(event: String /* "online" */, listener: () -> Unit): Worker /* this */
    override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): Worker /* this */
    open fun removeListener(event: String /* "error" */, listener: (err: Error) -> Unit): Worker /* this */
    open fun removeListener(event: String /* "exit" */, listener: (exitCode: Number) -> Unit): Worker /* this */
    override fun removeListener(event: String /* "message" */, listener: (value: Any) -> Unit): Worker /* this */
    open fun removeListener(event: String /* "online" */, listener: () -> Unit): Worker /* this */
    override fun removeListener(event: Any, listener: (args: Any) -> Unit): Worker /* this */
    open fun off(event: String /* "error" */, listener: (err: Error) -> Unit): Worker /* this */
    open fun off(event: String /* "exit" */, listener: (exitCode: Number) -> Unit): Worker /* this */
    override fun off(event: String /* "message" */, listener: (value: Any) -> Unit): Worker /* this */
    open fun off(event: String /* "online" */, listener: () -> Unit): Worker /* this */
    override fun off(event: Any, listener: (args: Any) -> Unit): Worker /* this */
}

external fun moveMessagePortToContext(port: MessagePort, context: Context): MessagePort

external fun receiveMessageOnPort(port: MessagePort): `T$66`?