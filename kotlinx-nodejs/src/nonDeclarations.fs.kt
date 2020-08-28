@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package fs

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
import NodeJS.ErrnoException
import events.EventEmitter.EventEmitter

typealias NoParamCallback = (err: ErrnoException?) -> Unit

external interface StatsBase<T> {
    fun isFile(): Boolean
    fun isDirectory(): Boolean
    fun isBlockDevice(): Boolean
    fun isCharacterDevice(): Boolean
    fun isSymbolicLink(): Boolean
    fun isFIFO(): Boolean
    fun isSocket(): Boolean
    var dev: T
    var ino: T
    var mode: T
    var nlink: T
    var uid: T
    var gid: T
    var rdev: T
    var size: T
    var blksize: T
    var blocks: T
    var atimeMs: T
    var mtimeMs: T
    var ctimeMs: T
    var birthtimeMs: T
    var atime: Date
    var mtime: Date
    var ctime: Date
    var birthtime: Date
}

external interface FSWatcher : EventEmitter {
    fun close()
    override fun addListener(event: String, listener: (args: Any) -> Unit): FSWatcher /* this */
    fun addListener(event: String /* "change" */, listener: (eventType: String, filename: dynamic /* String | Buffer */) -> Unit): FSWatcher /* this */
    fun addListener(event: String /* "error" */, listener: (error: Error) -> Unit): FSWatcher /* this */
    fun addListener(event: String /* "close" */, listener: () -> Unit): FSWatcher /* this */
    override fun on(event: String, listener: (args: Any) -> Unit): FSWatcher /* this */
    fun on(event: String /* "change" */, listener: (eventType: String, filename: dynamic /* String | Buffer */) -> Unit): FSWatcher /* this */
    fun on(event: String /* "error" */, listener: (error: Error) -> Unit): FSWatcher /* this */
    fun on(event: String /* "close" */, listener: () -> Unit): FSWatcher /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): FSWatcher /* this */
    fun once(event: String /* "change" */, listener: (eventType: String, filename: dynamic /* String | Buffer */) -> Unit): FSWatcher /* this */
    fun once(event: String /* "error" */, listener: (error: Error) -> Unit): FSWatcher /* this */
    fun once(event: String /* "close" */, listener: () -> Unit): FSWatcher /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): FSWatcher /* this */
    fun prependListener(event: String /* "change" */, listener: (eventType: String, filename: dynamic /* String | Buffer */) -> Unit): FSWatcher /* this */
    fun prependListener(event: String /* "error" */, listener: (error: Error) -> Unit): FSWatcher /* this */
    fun prependListener(event: String /* "close" */, listener: () -> Unit): FSWatcher /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): FSWatcher /* this */
    fun prependOnceListener(event: String /* "change" */, listener: (eventType: String, filename: dynamic /* String | Buffer */) -> Unit): FSWatcher /* this */
    fun prependOnceListener(event: String /* "error" */, listener: (error: Error) -> Unit): FSWatcher /* this */
    fun prependOnceListener(event: String /* "close" */, listener: () -> Unit): FSWatcher /* this */
}

external interface `T$32` {
    var encoding: String? /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface RmDirOptions {
    var recursive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RmDirAsyncOptions : RmDirOptions {
    var retryDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxRetries: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MakeDirectoryOptions {
    var recursive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mode: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$33` {
    var recursive: Boolean
}

external interface `T$34` {
    var recursive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$35` {
    var encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */
    var withFileTypes: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$36` {
    var encoding: String /* "buffer" */
    var withFileTypes: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$37` {
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var withFileTypes: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$38` {
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var withFileTypes: Boolean
}

external interface ReadSyncOptions {
    var offset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var length: Number?
        get() = definedExternally
        set(value) = definedExternally
    var position: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$42` {
    var encoding: Any?
        get() = definedExternally
        set(value) = definedExternally
    var flag: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$43` {
    var encoding: String
    var flag: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$44` {
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var flag: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$45` {
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var mode: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var flag: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$46` {
    var persistent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var interval: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$47` {
    var encoding: String? /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */
        get() = definedExternally
        set(value) = definedExternally
    var persistent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var recursive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$48` {
    var encoding: String /* "buffer" */
    var persistent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var recursive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$49` {
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var persistent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var recursive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$50` {
    var flags: String?
        get() = definedExternally
        set(value) = definedExternally
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var fd: Number?
        get() = definedExternally
        set(value) = definedExternally
    var mode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var autoClose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var emitClose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var start: Number?
        get() = definedExternally
        set(value) = definedExternally
    var end: Number?
        get() = definedExternally
        set(value) = definedExternally
    var highWaterMark: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$51` {
    var flags: String?
        get() = definedExternally
        set(value) = definedExternally
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var fd: Number?
        get() = definedExternally
        set(value) = definedExternally
    var mode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var autoClose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var emitClose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var start: Number?
        get() = definedExternally
        set(value) = definedExternally
    var highWaterMark: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WriteVResult {
    var bytesWritten: Number
    var buffers: Array<dynamic /* Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | Float32Array | Float64Array | DataView */>
}

external interface ReadVResult {
    var bytesRead: Number
    var buffers: Array<dynamic /* Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | Float32Array | Float64Array | DataView */>
}

external interface OpenDirOptions {
    var encoding: String? /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */
        get() = definedExternally
        set(value) = definedExternally
    var bufferSize: Number?
        get() = definedExternally
        set(value) = definedExternally
}