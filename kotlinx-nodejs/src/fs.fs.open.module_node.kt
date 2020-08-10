@file:JsQualifier("fs.open")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package fs.open

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

external fun __promisify__(path: String, flags: String, mode: String? = definedExternally): Promise<Number>

external fun __promisify__(path: String, flags: String, mode: Number? = definedExternally): Promise<Number>

external fun __promisify__(path: String, flags: Number, mode: String? = definedExternally): Promise<Number>

external fun __promisify__(path: String, flags: Number, mode: Number? = definedExternally): Promise<Number>

external fun __promisify__(path: Buffer, flags: String, mode: String? = definedExternally): Promise<Number>

external fun __promisify__(path: Buffer, flags: String, mode: Number? = definedExternally): Promise<Number>

external fun __promisify__(path: Buffer, flags: Number, mode: String? = definedExternally): Promise<Number>

external fun __promisify__(path: Buffer, flags: Number, mode: Number? = definedExternally): Promise<Number>

external fun __promisify__(path: URL, flags: String, mode: String? = definedExternally): Promise<Number>

external fun __promisify__(path: URL, flags: String, mode: Number? = definedExternally): Promise<Number>

external fun __promisify__(path: URL, flags: Number, mode: String? = definedExternally): Promise<Number>

external fun __promisify__(path: URL, flags: Number, mode: Number? = definedExternally): Promise<Number>