@file:JsModule("timers")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package timers

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
import NodeJS.Timeout
import NodeJS.Immediate

external fun setTimeout(callback: (args: Any) -> Unit, ms: Number, vararg args: Any): Timeout

external fun clearTimeout(timeoutId: Timeout)

external fun setInterval(callback: (args: Any) -> Unit, ms: Number, vararg args: Any): Timeout

external fun clearInterval(intervalId: Timeout)

external fun setImmediate(callback: (args: Any) -> Unit, vararg args: Any): Immediate

external fun clearImmediate(immediateId: Immediate)