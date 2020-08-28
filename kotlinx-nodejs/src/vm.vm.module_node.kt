@file:JsModule("vm")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package vm

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

external open class Script(code: String, options: ScriptOptions = definedExternally) {
    open fun runInContext(contextifiedSandbox: Context, options: RunningScriptOptions = definedExternally): Any
    open fun runInNewContext(sandbox: Context = definedExternally, options: RunningScriptOptions = definedExternally): Any
    open fun runInThisContext(options: RunningScriptOptions = definedExternally): Any
    open fun createCachedData(): Buffer
}

external fun createContext(sandbox: Context = definedExternally, options: CreateContextOptions = definedExternally): Context

external fun isContext(sandbox: Context): Boolean

external fun runInContext(code: String, contextifiedSandbox: Context, options: RunningScriptOptions = definedExternally): Any

external fun runInContext(code: String, contextifiedSandbox: Context, options: String = definedExternally): Any

external fun runInNewContext(code: String, sandbox: Context = definedExternally, options: RunningScriptOptions = definedExternally): Any

external fun runInNewContext(code: String, sandbox: Context = definedExternally, options: String = definedExternally): Any

external fun runInThisContext(code: String, options: RunningScriptOptions = definedExternally): Any

external fun runInThisContext(code: String, options: String = definedExternally): Any

external fun compileFunction(code: String, params: Array<String> = definedExternally, options: CompileFunctionOptions = definedExternally): Function<*>

external fun measureMemory(options: MeasureMemoryOptions = definedExternally): Promise<MemoryMeasurement>