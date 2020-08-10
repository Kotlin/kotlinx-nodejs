@file:JsQualifier("child_process.execFile")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package child_process.execFile

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
import child_process.exec.`T$17`
import child_process.ExecFileOptionsWithBufferEncoding
import child_process.exec.`T$18`
import child_process.ExecFileOptionsWithStringEncoding
import child_process.ExecFileOptionsWithOtherEncoding
import child_process.exec.`T$19`
import child_process.ExecFileOptions
import child_process.`T$16`

external fun __promisify__(file: String): PromiseWithChild<`T$17`>

external fun __promisify__(file: String, args: Array<String>?): PromiseWithChild<`T$17`>

external fun __promisify__(file: String, options: ExecFileOptionsWithBufferEncoding): PromiseWithChild<`T$18`>

external fun __promisify__(file: String, args: Array<String>?, options: ExecFileOptionsWithBufferEncoding): PromiseWithChild<`T$18`>

external fun __promisify__(file: String, options: ExecFileOptionsWithStringEncoding): PromiseWithChild<`T$17`>

external fun __promisify__(file: String, args: Array<String>?, options: ExecFileOptionsWithStringEncoding): PromiseWithChild<`T$17`>

external fun __promisify__(file: String, options: ExecFileOptionsWithOtherEncoding): PromiseWithChild<`T$19`>

external fun __promisify__(file: String, args: Array<String>?, options: ExecFileOptionsWithOtherEncoding): PromiseWithChild<`T$19`>

external fun __promisify__(file: String, options: ExecFileOptions): PromiseWithChild<`T$17`>

external fun __promisify__(file: String, args: Array<String>?, options: ExecFileOptions): PromiseWithChild<`T$17`>

external fun __promisify__(file: String, options: `T$16` /* `T$16` & ExecFileOptions */): PromiseWithChild<`T$19`>

external fun __promisify__(file: String, args: Array<String>?, options: `T$16` /* `T$16` & ExecFileOptions */): PromiseWithChild<`T$19`>