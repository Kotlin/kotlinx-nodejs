@file:JsQualifier("fs.mkdtemp")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package fs.mkdtemp

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
import fs.`T$32`
import os.`T$21`
import Buffer
import child_process.`T$16`

external fun __promisify__(prefix: String, options: `T$32`? = definedExternally): Promise<String>

external fun __promisify__(prefix: String, options: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" | "buffer" */ = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(prefix: String, options: `T$21`): Promise<Buffer>

external fun __promisify__(prefix: String, options: `T$16`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(prefix: String, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>