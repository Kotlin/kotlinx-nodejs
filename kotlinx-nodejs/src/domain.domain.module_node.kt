@file:JsModule("domain")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
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
import NodeJS.EventEmitter as _NodeJS_EventEmitter
import NodeJS.Timer

external open class Domain : EventEmitter, NodeJS.Domain {
    override fun <T> run(fn: (args: Any) -> T, vararg args: Any): T
    open fun add(emitter: EventEmitter)
    override fun add(emitter: _NodeJS_EventEmitter)
    override fun add(emitter: Timer)
    open fun remove(emitter: EventEmitter)
    override fun remove(emitter: _NodeJS_EventEmitter)
    override fun remove(emitter: Timer)
    override fun <T : Function<*>> bind(cb: T): T
    override fun <T : Function<*>> intercept(cb: T): T
    open var members: Array<dynamic /* EventEmitter | NodeJS.Timer */>
    open fun enter()
    open fun exit()
}

external fun create(): Domain