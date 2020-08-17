@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package events

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

external interface EventEmitterOptions {
    var captureRejections: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface NodeEventTarget {
    fun once(event: String, listener: (args: Any) -> Unit): NodeEventTarget /* this */
    fun once(event: Any, listener: (args: Any) -> Unit): NodeEventTarget /* this */
}

external interface `T$11` {
    var once: Boolean
}

external interface DOMEventTarget {
    fun addEventListener(event: String, listener: (args: Any) -> Unit, opts: `T$11` = definedExternally): Any
}