@file:JsQualifier("fs.write")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")
package fs.write

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

external interface `T$37`<TBuffer> {
    var bytesWritten: Number
    var buffer: TBuffer
}

external fun <TBuffer> __promisify__(fd: Number, buffer: TBuffer = definedExternally, offset: Number = definedExternally, length: Number = definedExternally, position: Number? = definedExternally): Promise<`T$37`<TBuffer>>

external interface `T$38` {
    var bytesWritten: Number
    var buffer: String
}

external fun __promisify__(fd: Number, string: Any, position: Number? = definedExternally, encoding: String? = definedExternally): Promise<`T$38`>
