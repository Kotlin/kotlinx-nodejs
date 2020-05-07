@file:JsModule("domain")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")
package domain

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
import NodeJS.Timer

external open class Domain : EventEmitter, NodeJS.Domain {
    override fun <T> run(fn: (args: Array<Any>) -> T, vararg args: Any): T
    open fun add(emitter: EventEmitter)
    open fun remove(emitter: EventEmitter)
    override fun <T : Function<*>> bind(cb: T): T
    override fun <T : Function<*>> intercept(cb: T): T
    open var members: Array<dynamic /* EventEmitter | NodeJS.Timer */>
    open fun enter()
    open fun exit()
    override fun add(emitter: Timer)
    override fun remove(emitter: Timer)
    override fun add(emitter: NodeJS.EventEmitter)
    override fun remove(emitter: NodeJS.EventEmitter)
    override fun addListener(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun addListener(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun on(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun on(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun once(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun once(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun removeListener(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun removeListener(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun off(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun off(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun removeAllListeners(event: String): EventEmitter
    override fun removeAllListeners(event: Any): EventEmitter
    override fun prependListener(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun prependListener(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun prependOnceListener(event: String, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun prependOnceListener(event: Any, listener: (args: Array<Any>) -> Unit): EventEmitter
    override fun removeAllListeners(): EventEmitter
}

external fun create(): Domain
