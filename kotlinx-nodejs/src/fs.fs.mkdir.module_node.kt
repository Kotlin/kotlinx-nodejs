@file:JsQualifier("fs.mkdir")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package fs.mkdir

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
import fs.MakeDirectoryOptions
import Buffer

external fun __promisify__(path: String, options: MakeDirectoryOptions /* MakeDirectoryOptions & `T$33` | MakeDirectoryOptions & `T$34` */): dynamic /* Promise | Promise */

external fun __promisify__(path: Buffer, options: MakeDirectoryOptions /* MakeDirectoryOptions & `T$33` | MakeDirectoryOptions & `T$34` */): dynamic /* Promise | Promise */

external fun __promisify__(path: URL, options: MakeDirectoryOptions /* MakeDirectoryOptions & `T$33` | MakeDirectoryOptions & `T$34` */): dynamic /* Promise | Promise */

external fun __promisify__(path: String, options: Number? = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(path: String, options: String? = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(path: Buffer, options: Number? = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(path: Buffer, options: String? = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(path: URL, options: Number? = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(path: URL, options: String? = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(path: String, options: MakeDirectoryOptions? = definedExternally): Promise<String?>

external fun __promisify__(path: Buffer, options: MakeDirectoryOptions? = definedExternally): Promise<String?>

external fun __promisify__(path: URL, options: MakeDirectoryOptions? = definedExternally): Promise<String?>