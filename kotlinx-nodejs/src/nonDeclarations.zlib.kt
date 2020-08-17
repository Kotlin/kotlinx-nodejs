@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package zlib

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
import stream.internal.Transform
import Buffer

external interface ZlibOptions {
    var flush: Number?
        get() = definedExternally
        set(value) = definedExternally
    var finishFlush: Number?
        get() = definedExternally
        set(value) = definedExternally
    var chunkSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var windowBits: Number?
        get() = definedExternally
        set(value) = definedExternally
    var level: Number?
        get() = definedExternally
        set(value) = definedExternally
    var memLevel: Number?
        get() = definedExternally
        set(value) = definedExternally
    var strategy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dictionary: dynamic /* Uint8Array? | Uint8ClampedArray? | Uint16Array? | Uint32Array? | Int8Array? | Int16Array? | Int32Array? | Float32Array? | Float64Array? | DataView? | ArrayBuffer? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$67`

public inline operator fun zlib.`T$67`.get(key: Number): dynamic /* Boolean? | Number? */ = this.asDynamic()[key]

public inline operator fun zlib.`T$67`.set(key: Number, value: Boolean) { this.asDynamic()[key] = value }

public inline operator fun zlib.`T$67`.set(key: Number, value: Number) { this.asDynamic()[key] = value }

external interface BrotliOptions {
    var flush: Number?
        get() = definedExternally
        set(value) = definedExternally
    var finishFlush: Number?
        get() = definedExternally
        set(value) = definedExternally
    var chunkSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var params: `T$67`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Zlib {
    var bytesRead: Number
    var bytesWritten: Number
    var shell: dynamic /* Boolean? | String? */
        get() = definedExternally
        set(value) = definedExternally
    fun close(callback: () -> Unit = definedExternally)
    fun flush(kind: Number = definedExternally, callback: () -> Unit = definedExternally)
    fun flush(kind: () -> Unit = definedExternally, callback: () -> Unit = definedExternally)
}

external interface ZlibParams {
    fun params(level: Number, strategy: Number, callback: () -> Unit)
}

external interface ZlibReset {
    fun reset()
}

external interface BrotliCompress : Transform, Zlib

external interface BrotliDecompress : Transform, Zlib

external interface Gzip : Transform, Zlib

external interface Gunzip : Transform, Zlib

external interface Deflate : Transform, Zlib, ZlibReset, ZlibParams

external interface Inflate : Transform, Zlib, ZlibReset

external interface DeflateRaw : Transform, Zlib, ZlibReset, ZlibParams

external interface InflateRaw : Transform, Zlib, ZlibReset

external interface Unzip : Transform, Zlib

typealias CompressCallback = (error: Error?, result: Buffer) -> Unit