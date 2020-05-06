@file:JsModule("events")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package events.EventEmitter

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
import AsyncIterableIterator

external fun once(emitter: events.NodeEventTarget, event: String): Promise<Array<Any>>

external fun once(emitter: events.NodeEventTarget, event: Any): Promise<Array<Any>>

external fun once(emitter: events.DOMEventTarget, event: String): Promise<Array<Any>>

external fun on(emitter: EventEmitter, event: String): AsyncIterableIterator<Any>

external var captureRejectionSymbol: Any

external var errorMonitor: Any

external var captureRejections: Boolean

external open class EventEmitter(options: events.EventEmitterOptions = definedExternally) : NodeJS.EventEmitter {
    override fun addListener(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun addListener(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun on(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun on(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun once(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun once(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun removeListener(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun removeListener(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun off(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun off(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun removeAllListeners(event: String): EventEmitter /* this */
    override fun removeAllListeners(event: Any): EventEmitter /* this */
    override fun setMaxListeners(n: Number): EventEmitter /* this */
    override fun getMaxListeners(): Number
    override fun listeners(event: String): Array<Function<*>>
    override fun listeners(event: Any): Array<Function<*>>
    override fun rawListeners(event: String): Array<Function<*>>
    override fun rawListeners(event: Any): Array<Function<*>>
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    override fun listenerCount(type: String): Number
    override fun listenerCount(type: Any): Number
    override fun prependListener(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun prependListener(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun prependOnceListener(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun prependOnceListener(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun eventNames(): Array<dynamic /* String | Any */>
    override fun removeAllListeners(): EventEmitter /* this */
    override fun addListener(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun addListener(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun on(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun on(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun once(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun once(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun removeListener(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun removeListener(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun off(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun off(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun removeAllListeners(event: String): EventEmitter /* this */
    override fun removeAllListeners(event: Any): EventEmitter /* this */
    override fun prependListener(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun prependListener(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun prependOnceListener(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun prependOnceListener(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter /* this */
    override fun removeAllListeners(): EventEmitter /* this */

    companion object {
        fun listenerCount(emitter: EventEmitter, event: String): Number
        fun listenerCount(emitter: EventEmitter, event: Any): Number
        var defaultMaxListeners: Number
    }
}