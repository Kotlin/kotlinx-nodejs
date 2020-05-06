@file:JsQualifier("fs.realpathSync")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package fs.realpathSync

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
import child_process.`T$16`

external fun native(path: String, options: fs.`T$32`? = definedExternally): String

external fun native(path: String, options: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */ = definedExternally): String

external fun native(path: Buffer, options: fs.`T$32`? = definedExternally): String

external fun native(path: Buffer, options: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */ = definedExternally): String

external fun native(path: URL, options: fs.`T$32`? = definedExternally): String

external fun native(path: URL, options: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */ = definedExternally): String

external fun native(path: String, options: fs.`T$33`): Buffer

external fun native(path: String, options: String /* "buffer" */): Buffer

external fun native(path: Buffer, options: fs.`T$33`): Buffer

external fun native(path: Buffer, options: String /* "buffer" */): Buffer

external fun native(path: URL, options: fs.`T$33`): Buffer

external fun native(path: URL, options: String /* "buffer" */): Buffer

external fun native(path: String, options: `T$16`? = definedExternally): dynamic /* String | Buffer */

external fun native(path: String, options: String? = definedExternally): dynamic /* String | Buffer */

external fun native(path: Buffer, options: `T$16`? = definedExternally): dynamic /* String | Buffer */

external fun native(path: Buffer, options: String? = definedExternally): dynamic /* String | Buffer */

external fun native(path: URL, options: `T$16`? = definedExternally): dynamic /* String | Buffer */

external fun native(path: URL, options: String? = definedExternally): dynamic /* String | Buffer */

external fun native(path: String): String

external fun native(path: Buffer): String

external fun native(path: URL): String