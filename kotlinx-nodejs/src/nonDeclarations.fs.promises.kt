@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package fs.promises

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
import fs.read.`T$41`
import Buffer
import fs.Stats
import fs.write.`T$39`
import fs.write.`T$40`
import fs.WriteVResult
import fs.ReadVResult

external interface `T$52` {
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var mode: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var flag: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$53` {
    var encoding: Any?
        get() = definedExternally
        set(value) = definedExternally
    var flag: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$54` {
    var encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */
    var flag: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$55` {
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var flag: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface FileHandle {
    var fd: Number
    fun appendFile(data: Any, options: `T$52`? = definedExternally): Promise<Unit>
    fun appendFile(data: Any, options: String? = definedExternally): Promise<Unit>
    fun chown(uid: Number, gid: Number): Promise<Unit>
    fun chmod(mode: String): Promise<Unit>
    fun chmod(mode: Number): Promise<Unit>
    fun datasync(): Promise<Unit>
    fun sync(): Promise<Unit>
    fun <TBuffer : Uint8Array> read(buffer: TBuffer, offset: Number? = definedExternally, length: Number? = definedExternally, position: Number? = definedExternally): Promise<`T$41`<TBuffer>>
    fun readFile(options: `T$53`? = definedExternally): Promise<Buffer>
    fun readFile(options: `T$54`): Promise<String>
    fun readFile(options: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */): Promise<String>
    fun readFile(options: `T$55`? = definedExternally): Promise<dynamic /* String | Buffer */>
    fun readFile(options: String? = definedExternally): Promise<dynamic /* String | Buffer */>
    fun stat(): Promise<Stats>
    fun truncate(len: Number = definedExternally): Promise<Unit>
    fun utimes(atime: String, mtime: String): Promise<Unit>
    fun utimes(atime: String, mtime: Number): Promise<Unit>
    fun utimes(atime: String, mtime: Date): Promise<Unit>
    fun utimes(atime: Number, mtime: String): Promise<Unit>
    fun utimes(atime: Number, mtime: Number): Promise<Unit>
    fun utimes(atime: Number, mtime: Date): Promise<Unit>
    fun utimes(atime: Date, mtime: String): Promise<Unit>
    fun utimes(atime: Date, mtime: Number): Promise<Unit>
    fun utimes(atime: Date, mtime: Date): Promise<Unit>
    fun <TBuffer : Uint8Array> write(buffer: TBuffer, offset: Number? = definedExternally, length: Number? = definedExternally, position: Number? = definedExternally): Promise<`T$39`<TBuffer>>
    fun write(data: Any, position: Number? = definedExternally, encoding: String? = definedExternally): Promise<`T$40`>
    fun writeFile(data: Any, options: `T$52`? = definedExternally): Promise<Unit>
    fun writeFile(data: Any, options: String? = definedExternally): Promise<Unit>
    fun writev(buffers: Array<dynamic /* Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | Float32Array | Float64Array | DataView */>, position: Number = definedExternally): Promise<WriteVResult>
    fun readv(buffers: Array<dynamic /* Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | Float32Array | Float64Array | DataView */>, position: Number = definedExternally): Promise<ReadVResult>
    fun close(): Promise<Unit>
}

external interface `T$56` {
    var encoding: String? /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */
        get() = definedExternally
        set(value) = definedExternally
    var withFileTypes: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}