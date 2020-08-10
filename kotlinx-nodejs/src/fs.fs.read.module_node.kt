@file:JsQualifier("fs.read")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package fs.read

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

external interface `T$41`<TBuffer> {
    var bytesRead: Number
    var buffer: TBuffer
}

external fun <TBuffer> __promisify__(fd: Number, buffer: TBuffer, offset: Number, length: Number, position: Number?): Promise<`T$41`<TBuffer>>