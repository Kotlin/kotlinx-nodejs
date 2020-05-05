@file:JsQualifier("fs.readFile")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")
package fs.readFile

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

external fun __promisify__(path: String, options: fs.`T$40` = definedExternally): Promise<Buffer>

external fun __promisify__(path: Buffer, options: fs.`T$40` = definedExternally): Promise<Buffer>

external fun __promisify__(path: URL, options: fs.`T$40` = definedExternally): Promise<Buffer>

external fun __promisify__(path: Number, options: fs.`T$40` = definedExternally): Promise<Buffer>

external fun __promisify__(path: String, options: fs.`T$41`): Promise<String>

external fun __promisify__(path: String, options: String): Promise<String>

external fun __promisify__(path: Buffer, options: fs.`T$41`): Promise<String>

external fun __promisify__(path: Buffer, options: String): Promise<String>

external fun __promisify__(path: URL, options: fs.`T$41`): Promise<String>

external fun __promisify__(path: URL, options: String): Promise<String>

external fun __promisify__(path: Number, options: fs.`T$41`): Promise<String>

external fun __promisify__(path: Number, options: String): Promise<String>

external fun __promisify__(path: String, options: fs.`T$42`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: String, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: Buffer, options: fs.`T$42`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: Buffer, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: URL, options: fs.`T$42`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: URL, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: Number, options: fs.`T$42`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: Number, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: String): Promise<Buffer>

external fun __promisify__(path: Buffer): Promise<Buffer>

external fun __promisify__(path: URL): Promise<Buffer>

external fun __promisify__(path: Number): Promise<Buffer>
