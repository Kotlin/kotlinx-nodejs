@file:JsQualifier("fs.promises")
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
import fs.RmDirAsyncOptions
import fs.MakeDirectoryOptions
import fs.`T$36`
import fs.`T$37`
import fs.`T$38`
import fs.Dirent
import os.`T$21`
import child_process.`T$16`
import fs.`T$32`
import fs.OpenDirOptions
import fs.Dir

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

external fun access(path: String, mode: Number = definedExternally): Promise<Unit>

external fun access(path: Buffer, mode: Number = definedExternally): Promise<Unit>

external fun access(path: URL, mode: Number = definedExternally): Promise<Unit>

external fun copyFile(src: String, dest: String, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: String, dest: Buffer, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: String, dest: URL, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: Buffer, dest: String, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: Buffer, dest: Buffer, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: Buffer, dest: URL, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: URL, dest: String, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: URL, dest: Buffer, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: URL, dest: URL, flags: Number = definedExternally): Promise<Unit>

external fun open(path: String, flags: String, mode: String = definedExternally): Promise<FileHandle>

external fun open(path: String, flags: String, mode: Number = definedExternally): Promise<FileHandle>

external fun open(path: String, flags: Number, mode: String = definedExternally): Promise<FileHandle>

external fun open(path: String, flags: Number, mode: Number = definedExternally): Promise<FileHandle>

external fun open(path: Buffer, flags: String, mode: String = definedExternally): Promise<FileHandle>

external fun open(path: Buffer, flags: String, mode: Number = definedExternally): Promise<FileHandle>

external fun open(path: Buffer, flags: Number, mode: String = definedExternally): Promise<FileHandle>

external fun open(path: Buffer, flags: Number, mode: Number = definedExternally): Promise<FileHandle>

external fun open(path: URL, flags: String, mode: String = definedExternally): Promise<FileHandle>

external fun open(path: URL, flags: String, mode: Number = definedExternally): Promise<FileHandle>

external fun open(path: URL, flags: Number, mode: String = definedExternally): Promise<FileHandle>

external fun open(path: URL, flags: Number, mode: Number = definedExternally): Promise<FileHandle>

external fun <TBuffer : Uint8Array> read(handle: FileHandle, buffer: TBuffer, offset: Number? = definedExternally, length: Number? = definedExternally, position: Number? = definedExternally): Promise<`T$41`<TBuffer>>

external fun <TBuffer : Uint8Array> write(handle: FileHandle, buffer: TBuffer, offset: Number? = definedExternally, length: Number? = definedExternally, position: Number? = definedExternally): Promise<`T$39`<TBuffer>>

external fun write(handle: FileHandle, string: Any, position: Number? = definedExternally, encoding: String? = definedExternally): Promise<`T$40`>

external fun rename(oldPath: String, newPath: String): Promise<Unit>

external fun rename(oldPath: String, newPath: Buffer): Promise<Unit>

external fun rename(oldPath: String, newPath: URL): Promise<Unit>

external fun rename(oldPath: Buffer, newPath: String): Promise<Unit>

external fun rename(oldPath: Buffer, newPath: Buffer): Promise<Unit>

external fun rename(oldPath: Buffer, newPath: URL): Promise<Unit>

external fun rename(oldPath: URL, newPath: String): Promise<Unit>

external fun rename(oldPath: URL, newPath: Buffer): Promise<Unit>

external fun rename(oldPath: URL, newPath: URL): Promise<Unit>

external fun truncate(path: String, len: Number = definedExternally): Promise<Unit>

external fun truncate(path: Buffer, len: Number = definedExternally): Promise<Unit>

external fun truncate(path: URL, len: Number = definedExternally): Promise<Unit>

external fun ftruncate(handle: FileHandle, len: Number = definedExternally): Promise<Unit>

external fun rmdir(path: String, options: RmDirAsyncOptions = definedExternally): Promise<Unit>

external fun rmdir(path: Buffer, options: RmDirAsyncOptions = definedExternally): Promise<Unit>

external fun rmdir(path: URL, options: RmDirAsyncOptions = definedExternally): Promise<Unit>

external fun fdatasync(handle: FileHandle): Promise<Unit>

external fun fsync(handle: FileHandle): Promise<Unit>

external fun mkdir(path: String, options: MakeDirectoryOptions /* MakeDirectoryOptions & `T$33` */): Promise<String>

external fun mkdir(path: Buffer, options: MakeDirectoryOptions /* MakeDirectoryOptions & `T$33` */): Promise<String>

external fun mkdir(path: URL, options: MakeDirectoryOptions /* MakeDirectoryOptions & `T$33` */): Promise<String>

external fun mkdir(path: String, options: Number? = definedExternally): Promise<Unit>

external fun mkdir(path: String, options: String? = definedExternally): Promise<Unit>

external fun mkdir(path: String, options: MakeDirectoryOptions /* MakeDirectoryOptions & `T$34` */ = definedExternally): Promise<Unit>

external fun mkdir(path: Buffer, options: Number? = definedExternally): Promise<Unit>

external fun mkdir(path: Buffer, options: String? = definedExternally): Promise<Unit>

external fun mkdir(path: Buffer, options: MakeDirectoryOptions /* MakeDirectoryOptions & `T$34` */ = definedExternally): Promise<Unit>

external fun mkdir(path: URL, options: Number? = definedExternally): Promise<Unit>

external fun mkdir(path: URL, options: String? = definedExternally): Promise<Unit>

external fun mkdir(path: URL, options: MakeDirectoryOptions /* MakeDirectoryOptions & `T$34` */ = definedExternally): Promise<Unit>

external fun mkdir(path: String, options: Number? = definedExternally): Promise<String?>

external fun mkdir(path: String, options: String? = definedExternally): Promise<String?>

external fun mkdir(path: String, options: MakeDirectoryOptions? = definedExternally): Promise<String?>

external fun mkdir(path: Buffer, options: Number? = definedExternally): Promise<String?>

external fun mkdir(path: Buffer, options: String? = definedExternally): Promise<String?>

external fun mkdir(path: Buffer, options: MakeDirectoryOptions? = definedExternally): Promise<String?>

external fun mkdir(path: URL, options: Number? = definedExternally): Promise<String?>

external fun mkdir(path: URL, options: String? = definedExternally): Promise<String?>

external fun mkdir(path: URL, options: MakeDirectoryOptions? = definedExternally): Promise<String?>

external interface `T$56` {
    var encoding: String? /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */
        get() = definedExternally
        set(value) = definedExternally
    var withFileTypes: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external fun readdir(path: String, options: dynamic /* `T$56`? | String | String | String | String | String | String | String | String | String | String */ = definedExternally): Promise<Array<String>>

external fun readdir(path: Buffer, options: dynamic /* `T$56`? | String | String | String | String | String | String | String | String | String | String */ = definedExternally): Promise<Array<String>>

external fun readdir(path: URL, options: dynamic /* `T$56`? | String | String | String | String | String | String | String | String | String | String */ = definedExternally): Promise<Array<String>>

external fun readdir(path: String, options: `T$36`): Promise<Array<Buffer>>

external fun readdir(path: String, options: String /* "buffer" */): Promise<Array<Buffer>>

external fun readdir(path: Buffer, options: `T$36`): Promise<Array<Buffer>>

external fun readdir(path: Buffer, options: String /* "buffer" */): Promise<Array<Buffer>>

external fun readdir(path: URL, options: `T$36`): Promise<Array<Buffer>>

external fun readdir(path: URL, options: String /* "buffer" */): Promise<Array<Buffer>>

external fun readdir(path: String, options: `T$37`? = definedExternally): Promise<dynamic /* Array<String> | Array<Buffer> */>

external fun readdir(path: String, options: String? = definedExternally): Promise<dynamic /* Array<String> | Array<Buffer> */>

external fun readdir(path: Buffer, options: `T$37`? = definedExternally): Promise<dynamic /* Array<String> | Array<Buffer> */>

external fun readdir(path: Buffer, options: String? = definedExternally): Promise<dynamic /* Array<String> | Array<Buffer> */>

external fun readdir(path: URL, options: `T$37`? = definedExternally): Promise<dynamic /* Array<String> | Array<Buffer> */>

external fun readdir(path: URL, options: String? = definedExternally): Promise<dynamic /* Array<String> | Array<Buffer> */>

external fun readdir(path: String, options: `T$38`): Promise<Array<Dirent>>

external fun readdir(path: Buffer, options: `T$38`): Promise<Array<Dirent>>

external fun readdir(path: URL, options: `T$38`): Promise<Array<Dirent>>

external fun readlink(path: String, options: dynamic /* `T$32`? | String | String | String | String | String | String | String | String | String | String */ = definedExternally): Promise<String>

external fun readlink(path: Buffer, options: dynamic /* `T$32`? | String | String | String | String | String | String | String | String | String | String */ = definedExternally): Promise<String>

external fun readlink(path: URL, options: dynamic /* `T$32`? | String | String | String | String | String | String | String | String | String | String */ = definedExternally): Promise<String>

external fun readlink(path: String, options: `T$21`): Promise<Buffer>

external fun readlink(path: String, options: String /* "buffer" */): Promise<Buffer>

external fun readlink(path: Buffer, options: `T$21`): Promise<Buffer>

external fun readlink(path: Buffer, options: String /* "buffer" */): Promise<Buffer>

external fun readlink(path: URL, options: `T$21`): Promise<Buffer>

external fun readlink(path: URL, options: String /* "buffer" */): Promise<Buffer>

external fun readlink(path: String, options: `T$16`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readlink(path: String, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readlink(path: Buffer, options: `T$16`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readlink(path: Buffer, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readlink(path: URL, options: `T$16`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readlink(path: URL, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun symlink(target: String, path: String, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: String, path: Buffer, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: String, path: URL, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: Buffer, path: String, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: Buffer, path: Buffer, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: Buffer, path: URL, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: URL, path: String, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: URL, path: Buffer, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: URL, path: URL, type: String? = definedExternally): Promise<Unit>

external fun fstat(handle: FileHandle): Promise<Stats>

external fun lstat(path: String): Promise<Stats>

external fun lstat(path: Buffer): Promise<Stats>

external fun lstat(path: URL): Promise<Stats>

external fun stat(path: String): Promise<Stats>

external fun stat(path: Buffer): Promise<Stats>

external fun stat(path: URL): Promise<Stats>

external fun link(existingPath: String, newPath: String): Promise<Unit>

external fun link(existingPath: String, newPath: Buffer): Promise<Unit>

external fun link(existingPath: String, newPath: URL): Promise<Unit>

external fun link(existingPath: Buffer, newPath: String): Promise<Unit>

external fun link(existingPath: Buffer, newPath: Buffer): Promise<Unit>

external fun link(existingPath: Buffer, newPath: URL): Promise<Unit>

external fun link(existingPath: URL, newPath: String): Promise<Unit>

external fun link(existingPath: URL, newPath: Buffer): Promise<Unit>

external fun link(existingPath: URL, newPath: URL): Promise<Unit>

external fun unlink(path: String): Promise<Unit>

external fun unlink(path: Buffer): Promise<Unit>

external fun unlink(path: URL): Promise<Unit>

external fun fchmod(handle: FileHandle, mode: String): Promise<Unit>

external fun fchmod(handle: FileHandle, mode: Number): Promise<Unit>

external fun chmod(path: String, mode: String): Promise<Unit>

external fun chmod(path: String, mode: Number): Promise<Unit>

external fun chmod(path: Buffer, mode: String): Promise<Unit>

external fun chmod(path: Buffer, mode: Number): Promise<Unit>

external fun chmod(path: URL, mode: String): Promise<Unit>

external fun chmod(path: URL, mode: Number): Promise<Unit>

external fun lchmod(path: String, mode: String): Promise<Unit>

external fun lchmod(path: String, mode: Number): Promise<Unit>

external fun lchmod(path: Buffer, mode: String): Promise<Unit>

external fun lchmod(path: Buffer, mode: Number): Promise<Unit>

external fun lchmod(path: URL, mode: String): Promise<Unit>

external fun lchmod(path: URL, mode: Number): Promise<Unit>

external fun lchown(path: String, uid: Number, gid: Number): Promise<Unit>

external fun lchown(path: Buffer, uid: Number, gid: Number): Promise<Unit>

external fun lchown(path: URL, uid: Number, gid: Number): Promise<Unit>

external fun fchown(handle: FileHandle, uid: Number, gid: Number): Promise<Unit>

external fun chown(path: String, uid: Number, gid: Number): Promise<Unit>

external fun chown(path: Buffer, uid: Number, gid: Number): Promise<Unit>

external fun chown(path: URL, uid: Number, gid: Number): Promise<Unit>

external fun utimes(path: String, atime: String, mtime: dynamic /* String | Number | Date */): Promise<Unit>

external fun utimes(path: String, atime: Number, mtime: dynamic /* String | Number | Date */): Promise<Unit>

external fun utimes(path: String, atime: Date, mtime: dynamic /* String | Number | Date */): Promise<Unit>

external fun utimes(path: Buffer, atime: String, mtime: dynamic /* String | Number | Date */): Promise<Unit>

external fun utimes(path: Buffer, atime: Number, mtime: dynamic /* String | Number | Date */): Promise<Unit>

external fun utimes(path: Buffer, atime: Date, mtime: dynamic /* String | Number | Date */): Promise<Unit>

external fun utimes(path: URL, atime: String, mtime: dynamic /* String | Number | Date */): Promise<Unit>

external fun utimes(path: URL, atime: Number, mtime: dynamic /* String | Number | Date */): Promise<Unit>

external fun utimes(path: URL, atime: Date, mtime: dynamic /* String | Number | Date */): Promise<Unit>

external fun futimes(handle: FileHandle, atime: String, mtime: String): Promise<Unit>

external fun futimes(handle: FileHandle, atime: String, mtime: Number): Promise<Unit>

external fun futimes(handle: FileHandle, atime: String, mtime: Date): Promise<Unit>

external fun futimes(handle: FileHandle, atime: Number, mtime: String): Promise<Unit>

external fun futimes(handle: FileHandle, atime: Number, mtime: Number): Promise<Unit>

external fun futimes(handle: FileHandle, atime: Number, mtime: Date): Promise<Unit>

external fun futimes(handle: FileHandle, atime: Date, mtime: String): Promise<Unit>

external fun futimes(handle: FileHandle, atime: Date, mtime: Number): Promise<Unit>

external fun futimes(handle: FileHandle, atime: Date, mtime: Date): Promise<Unit>

external fun realpath(path: String, options: dynamic /* `T$32`? | String | String | String | String | String | String | String | String | String | String */ = definedExternally): Promise<String>

external fun realpath(path: Buffer, options: dynamic /* `T$32`? | String | String | String | String | String | String | String | String | String | String */ = definedExternally): Promise<String>

external fun realpath(path: URL, options: dynamic /* `T$32`? | String | String | String | String | String | String | String | String | String | String */ = definedExternally): Promise<String>

external fun realpath(path: String, options: `T$21`): Promise<Buffer>

external fun realpath(path: String, options: String /* "buffer" */): Promise<Buffer>

external fun realpath(path: Buffer, options: `T$21`): Promise<Buffer>

external fun realpath(path: Buffer, options: String /* "buffer" */): Promise<Buffer>

external fun realpath(path: URL, options: `T$21`): Promise<Buffer>

external fun realpath(path: URL, options: String /* "buffer" */): Promise<Buffer>

external fun realpath(path: String, options: `T$16`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun realpath(path: String, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun realpath(path: Buffer, options: `T$16`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun realpath(path: Buffer, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun realpath(path: URL, options: `T$16`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun realpath(path: URL, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun mkdtemp(prefix: String, options: `T$32`? = definedExternally): Promise<String>

external fun mkdtemp(prefix: String, options: String /* "ascii" */ = definedExternally): Promise<String>

external fun mkdtemp(prefix: String, options: String /* "utf8" */ = definedExternally): Promise<String>

external fun mkdtemp(prefix: String, options: String /* "utf-8" */ = definedExternally): Promise<String>

external fun mkdtemp(prefix: String, options: String /* "utf16le" */ = definedExternally): Promise<String>

external fun mkdtemp(prefix: String, options: String /* "ucs2" */ = definedExternally): Promise<String>

external fun mkdtemp(prefix: String, options: String /* "ucs-2" */ = definedExternally): Promise<String>

external fun mkdtemp(prefix: String, options: String /* "base64" */ = definedExternally): Promise<String>

external fun mkdtemp(prefix: String, options: String /* "latin1" */ = definedExternally): Promise<String>

external fun mkdtemp(prefix: String, options: String /* "binary" */ = definedExternally): Promise<String>

external fun mkdtemp(prefix: String, options: String /* "hex" */ = definedExternally): Promise<String>

external fun mkdtemp(prefix: String, options: `T$21`): Promise<Buffer>

external fun mkdtemp(prefix: String, options: String /* "buffer" */): Promise<Buffer>

external fun mkdtemp(prefix: String, options: `T$16`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun mkdtemp(prefix: String, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun writeFile(path: String, data: Any, options: `T$52`? = definedExternally): Promise<Unit>

external fun writeFile(path: String, data: Any, options: String? = definedExternally): Promise<Unit>

external fun writeFile(path: Buffer, data: Any, options: `T$52`? = definedExternally): Promise<Unit>

external fun writeFile(path: Buffer, data: Any, options: String? = definedExternally): Promise<Unit>

external fun writeFile(path: URL, data: Any, options: `T$52`? = definedExternally): Promise<Unit>

external fun writeFile(path: URL, data: Any, options: String? = definedExternally): Promise<Unit>

external fun writeFile(path: FileHandle, data: Any, options: `T$52`? = definedExternally): Promise<Unit>

external fun writeFile(path: FileHandle, data: Any, options: String? = definedExternally): Promise<Unit>

external fun appendFile(path: String, data: Any, options: `T$52`? = definedExternally): Promise<Unit>

external fun appendFile(path: String, data: Any, options: String? = definedExternally): Promise<Unit>

external fun appendFile(path: Buffer, data: Any, options: `T$52`? = definedExternally): Promise<Unit>

external fun appendFile(path: Buffer, data: Any, options: String? = definedExternally): Promise<Unit>

external fun appendFile(path: URL, data: Any, options: `T$52`? = definedExternally): Promise<Unit>

external fun appendFile(path: URL, data: Any, options: String? = definedExternally): Promise<Unit>

external fun appendFile(path: FileHandle, data: Any, options: `T$52`? = definedExternally): Promise<Unit>

external fun appendFile(path: FileHandle, data: Any, options: String? = definedExternally): Promise<Unit>

external fun readFile(path: String, options: `T$53`? = definedExternally): Promise<Buffer>

external fun readFile(path: Buffer, options: `T$53`? = definedExternally): Promise<Buffer>

external fun readFile(path: URL, options: `T$53`? = definedExternally): Promise<Buffer>

external fun readFile(path: FileHandle, options: `T$53`? = definedExternally): Promise<Buffer>

external fun readFile(path: String, options: dynamic /* `T$54` | String | String | String | String | String | String | String | String | String | String */): Promise<String>

external fun readFile(path: Buffer, options: dynamic /* `T$54` | String | String | String | String | String | String | String | String | String | String */): Promise<String>

external fun readFile(path: URL, options: dynamic /* `T$54` | String | String | String | String | String | String | String | String | String | String */): Promise<String>

external fun readFile(path: FileHandle, options: dynamic /* `T$54` | String | String | String | String | String | String | String | String | String | String */): Promise<String>

external fun readFile(path: String, options: `T$55`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readFile(path: String, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readFile(path: Buffer, options: `T$55`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readFile(path: Buffer, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readFile(path: URL, options: `T$55`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readFile(path: URL, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readFile(path: FileHandle, options: `T$55`? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readFile(path: FileHandle, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun opendir(path: String, options: OpenDirOptions = definedExternally): Promise<Dir>