@file:JsModule("async_hooks")
@file:JsNonModule
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

external fun executionAsyncId(): Number

external fun executionAsyncResource(): Any?

external fun triggerAsyncId(): Number

external fun createHook(options: HookCallbacks): AsyncHook

external open class AsyncResource {
    constructor(type: String, triggerAsyncId: Number = definedExternally)
    constructor(type: String, triggerAsyncId: AsyncResourceOptions = definedExternally)
    open fun <This, Result> runInAsyncScope(fn: (self: This, args: Any) -> Result, thisArg: This = definedExternally, vararg args: Any): Result
    open fun emitDestroy()
    open fun asyncId(): Number
    open fun triggerAsyncId(): Number
}

external open class AsyncLocalStorage<T> {
    open fun disable()
    open fun getStore(): T?
    open fun run(store: T, callback: (args: Any) -> Unit, vararg args: Any)
    open fun exit(callback: (args: Any) -> Unit, vararg args: Any)
    open fun <R> runSyncAndReturn(store: T, callback: (args: Any) -> R, vararg args: Any): R
    open fun <R> exitSyncAndReturn(callback: (args: Any) -> R, vararg args: Any): R
    open fun enterWith(store: T)
}