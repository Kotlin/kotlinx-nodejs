@file:JsQualifier("child_process.exec")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package child_process.exec

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
import child_process.PromiseWithChild
import Buffer
import child_process.`T$13`
import child_process.`T$14`
import child_process.ExecOptions
import child_process.`T$16`

external interface `T$17` {
    var stdout: String
    var stderr: String
}

external fun __promisify__(command: String): PromiseWithChild<`T$17`>

external interface `T$18` {
    var stdout: Buffer
    var stderr: Buffer
}

external fun __promisify__(command: String, options: `T$13` /* `T$13` & ExecOptions */): PromiseWithChild<`T$18`>

external fun __promisify__(command: String, options: `T$14` /* `T$14` & ExecOptions */): PromiseWithChild<`T$17`>

external fun __promisify__(command: String, options: ExecOptions): PromiseWithChild<`T$17`>

external interface `T$19` {
    var stdout: dynamic /* String | Buffer */
        get() = definedExternally
        set(value) = definedExternally
    var stderr: dynamic /* String | Buffer */
        get() = definedExternally
        set(value) = definedExternally
}

external fun __promisify__(command: String, options: `T$16` /* `T$16` & ExecOptions */ = definedExternally): PromiseWithChild<`T$19`>