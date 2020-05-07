@file:JsQualifier("child_process.exec")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")
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
import Buffer

external interface `T$17` {
    var stdout: String
    var stderr: String
}

external fun __promisify__(command: String): child_process.PromiseWithChild<`T$17`>

external interface `T$18` {
    var stdout: Buffer
    var stderr: Buffer
}

external fun __promisify__(command: String, options: child_process.`T$13`): child_process.PromiseWithChild<`T$18`>

external fun __promisify__(command: String, options: child_process.`T$14`): child_process.PromiseWithChild<`T$17`>

external fun __promisify__(command: String, options: child_process.ExecOptions): child_process.PromiseWithChild<`T$17`>

external interface `T$19` {
    var stdout: dynamic /* String | Buffer */
        get() = definedExternally
        set(value) = definedExternally
    var stderr: dynamic /* String | Buffer */
        get() = definedExternally
        set(value) = definedExternally
}

external fun __promisify__(command: String, options: child_process.`T$16` = definedExternally): child_process.PromiseWithChild<`T$19`>
