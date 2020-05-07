@file:JsQualifier("fs.realpath")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")
package fs.realpath

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
import NodeJS.ErrnoException

external fun __promisify__(path: String, options: fs.`T$32`? = definedExternally): Promise<String>

external fun __promisify__(path: String, options: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<String>

external fun __promisify__(path: Buffer, options: fs.`T$32`? = definedExternally): Promise<String>

external fun __promisify__(path: URL, options: fs.`T$32`? = definedExternally): Promise<String>

external fun __promisify__(path: String, options: fs.`T$33`): Promise<Buffer>

external fun __promisify__(path: Buffer, options: fs.`T$33`): Promise<Buffer>

external fun __promisify__(path: Buffer, options: String /* "buffer" */): Promise<Buffer>

external fun __promisify__(path: URL, options: fs.`T$33`): Promise<Buffer>

external fun __promisify__(path: URL, options: String /* "buffer" */): Promise<Buffer>

external fun __promisify__(path: String, options: `T$16`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: String, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: Buffer, options: `T$16`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: Buffer, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: URL, options: `T$16`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: URL, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun native(path: String, options: fs.`T$32`?, callback: (err: ErrnoException?, resolvedPath: String) -> Unit)

external fun native(path: String, options: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */, callback: (err: ErrnoException?, resolvedPath: String) -> Unit)

external fun native(path: Buffer, options: fs.`T$32`?, callback: (err: ErrnoException?, resolvedPath: String) -> Unit)

external fun native(path: Buffer, options: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */, callback: (err: ErrnoException?, resolvedPath: String) -> Unit)

external fun native(path: URL, options: fs.`T$32`?, callback: (err: ErrnoException?, resolvedPath: String) -> Unit)

external fun native(path: URL, options: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */, callback: (err: ErrnoException?, resolvedPath: String) -> Unit)

external fun native(path: String, options: fs.`T$33`, callback: (err: ErrnoException?, resolvedPath: Buffer) -> Unit)

external fun native(path: String, options: String /* "buffer" */, callback: (err: ErrnoException?, resolvedPath: Buffer) -> Unit)

external fun native(path: Buffer, options: fs.`T$33`, callback: (err: ErrnoException?, resolvedPath: Buffer) -> Unit)

external fun native(path: Buffer, options: String /* "buffer" */, callback: (err: ErrnoException?, resolvedPath: Buffer) -> Unit)

external fun native(path: URL, options: fs.`T$33`, callback: (err: ErrnoException?, resolvedPath: Buffer) -> Unit)

external fun native(path: URL, options: String /* "buffer" */, callback: (err: ErrnoException?, resolvedPath: Buffer) -> Unit)

external fun native(path: String, options: `T$16`?, callback: (err: ErrnoException?, resolvedPath: dynamic /* String | Buffer */) -> Unit)

external fun native(path: String, options: String?, callback: (err: ErrnoException?, resolvedPath: dynamic /* String | Buffer */) -> Unit)

external fun native(path: Buffer, options: `T$16`?, callback: (err: ErrnoException?, resolvedPath: dynamic /* String | Buffer */) -> Unit)

external fun native(path: Buffer, options: String?, callback: (err: ErrnoException?, resolvedPath: dynamic /* String | Buffer */) -> Unit)

external fun native(path: URL, options: `T$16`?, callback: (err: ErrnoException?, resolvedPath: dynamic /* String | Buffer */) -> Unit)

external fun native(path: URL, options: String?, callback: (err: ErrnoException?, resolvedPath: dynamic /* String | Buffer */) -> Unit)

external fun native(path: String, callback: (err: ErrnoException?, resolvedPath: String) -> Unit)

external fun native(path: Buffer, callback: (err: ErrnoException?, resolvedPath: String) -> Unit)

external fun native(path: URL, callback: (err: ErrnoException?, resolvedPath: String) -> Unit)

external fun __promisify__(path: String): Promise<String>

external fun __promisify__(path: Buffer): Promise<String>

external fun __promisify__(path: URL): Promise<String>
