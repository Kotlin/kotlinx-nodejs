@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package async_hooks

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

external interface HookCallbacks {
    val init: ((asyncId: Number, type: String, triggerAsyncId: Number, resource: Any?) -> Unit)?
        get() = definedExternally
    val before: ((asyncId: Number) -> Unit)?
        get() = definedExternally
    val after: ((asyncId: Number) -> Unit)?
        get() = definedExternally
    val promiseResolve: ((asyncId: Number) -> Unit)?
        get() = definedExternally
    val destroy: ((asyncId: Number) -> Unit)?
        get() = definedExternally
}

external interface AsyncHook {
    fun enable(): AsyncHook /* this */
    fun disable(): AsyncHook /* this */
}

external interface AsyncResourceOptions {
    var triggerAsyncId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var requireManualDestroy: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}