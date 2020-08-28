@file:JsModule("child_process")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package child_process

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
import stream.internal.Writable
import stream.internal.Readable
import Buffer

external fun spawn(command: String, options: SpawnOptionsWithoutStdio = definedExternally): ChildProcessWithoutNullStreams

external fun spawn(command: String, options: SpawnOptionsWithStdioTuple<dynamic /* "inherit" | "ignore" | Stream */, dynamic /* "inherit" | "ignore" | Stream */, dynamic /* "inherit" | "ignore" | Stream */>): ChildProcessByStdio<Nothing?, Nothing?, Nothing?>

external fun spawn(command: String, options: SpawnOptions): ChildProcess

external fun spawn(command: String, args: Array<String> = definedExternally, options: SpawnOptionsWithoutStdio = definedExternally): ChildProcessWithoutNullStreams

external fun spawn(command: String, args: Array<String>, options: SpawnOptionsWithStdioTuple<dynamic /* "inherit" | "ignore" | Stream */, dynamic /* "inherit" | "ignore" | Stream */, dynamic /* "inherit" | "ignore" | Stream */>): ChildProcessByStdio<Nothing?, Nothing?, Nothing?>

external fun spawn(command: String, args: Array<String>, options: SpawnOptions): ChildProcess

external fun exec(command: String, callback: (error: ExecException?, stdout: String, stderr: String) -> Unit = definedExternally): ChildProcess

external fun exec(command: String, options: `T$13` /* `T$13` & ExecOptions */, callback: (error: ExecException?, stdout: Buffer, stderr: Buffer) -> Unit = definedExternally): ChildProcess

external fun exec(command: String, options: `T$14` /* `T$14` & ExecOptions */, callback: (error: ExecException?, stdout: String, stderr: String) -> Unit = definedExternally): ChildProcess

external fun exec(command: String, options: `T$15` /* `T$15` & ExecOptions */, callback: (error: ExecException?, stdout: dynamic /* String | Buffer */, stderr: dynamic /* String | Buffer */) -> Unit = definedExternally): ChildProcess

external fun exec(command: String, options: ExecOptions, callback: (error: ExecException?, stdout: String, stderr: String) -> Unit = definedExternally): ChildProcess

external fun exec(command: String, options: `T$16` /* `T$16` & ExecOptions */, callback: (error: ExecException?, stdout: dynamic /* String | Buffer */, stderr: dynamic /* String | Buffer */) -> Unit = definedExternally): ChildProcess

external fun execFile(file: String): ChildProcess

external fun execFile(file: String, options: `T$16` /* `T$16` & ExecFileOptions */): ChildProcess

external fun execFile(file: String, args: Array<String>? = definedExternally): ChildProcess

external fun execFile(file: String, args: Array<String>?, options: `T$16` /* `T$16` & ExecFileOptions */): ChildProcess

external fun execFile(file: String, callback: (error: ExecException?, stdout: String, stderr: String) -> Unit): ChildProcess

external fun execFile(file: String, args: Array<String>?, callback: (error: ExecException?, stdout: String, stderr: String) -> Unit): ChildProcess

external fun execFile(file: String, options: ExecFileOptionsWithBufferEncoding, callback: (error: ExecException?, stdout: Buffer, stderr: Buffer) -> Unit): ChildProcess

external fun execFile(file: String, args: Array<String>?, options: ExecFileOptionsWithBufferEncoding, callback: (error: ExecException?, stdout: Buffer, stderr: Buffer) -> Unit): ChildProcess

external fun execFile(file: String, options: ExecFileOptionsWithStringEncoding, callback: (error: ExecException?, stdout: String, stderr: String) -> Unit): ChildProcess

external fun execFile(file: String, args: Array<String>?, options: ExecFileOptionsWithStringEncoding, callback: (error: ExecException?, stdout: String, stderr: String) -> Unit): ChildProcess

external fun execFile(file: String, options: ExecFileOptionsWithOtherEncoding, callback: (error: ExecException?, stdout: dynamic /* String | Buffer */, stderr: dynamic /* String | Buffer */) -> Unit): ChildProcess

external fun execFile(file: String, args: Array<String>?, options: ExecFileOptionsWithOtherEncoding, callback: (error: ExecException?, stdout: dynamic /* String | Buffer */, stderr: dynamic /* String | Buffer */) -> Unit): ChildProcess

external fun execFile(file: String, options: ExecFileOptions, callback: (error: ExecException?, stdout: String, stderr: String) -> Unit): ChildProcess

external fun execFile(file: String, args: Array<String>?, options: ExecFileOptions, callback: (error: ExecException?, stdout: String, stderr: String) -> Unit): ChildProcess

external fun execFile(file: String, options: `T$16` /* `T$16` & ExecFileOptions */, callback: ((error: ExecException?, stdout: dynamic /* String | Buffer */, stderr: dynamic /* String | Buffer */) -> Unit)?): ChildProcess

external fun execFile(file: String, args: Array<String>?, options: `T$16` /* `T$16` & ExecFileOptions */, callback: ((error: ExecException?, stdout: dynamic /* String | Buffer */, stderr: dynamic /* String | Buffer */) -> Unit)?): ChildProcess

external fun fork(modulePath: String, options: ForkOptions = definedExternally): ChildProcess

external fun fork(modulePath: String, args: Array<String> = definedExternally, options: ForkOptions = definedExternally): ChildProcess

external fun spawnSync(command: String): SpawnSyncReturns<Buffer>

external fun spawnSync(command: String, options: SpawnSyncOptionsWithStringEncoding = definedExternally): SpawnSyncReturns<String>

external fun spawnSync(command: String, options: SpawnSyncOptionsWithBufferEncoding = definedExternally): SpawnSyncReturns<Buffer>

external fun spawnSync(command: String, options: SpawnSyncOptions = definedExternally): SpawnSyncReturns<Buffer>

external fun spawnSync(command: String, args: Array<String> = definedExternally, options: SpawnSyncOptionsWithStringEncoding = definedExternally): SpawnSyncReturns<String>

external fun spawnSync(command: String, args: Array<String> = definedExternally, options: SpawnSyncOptionsWithBufferEncoding = definedExternally): SpawnSyncReturns<Buffer>

external fun spawnSync(command: String, args: Array<String> = definedExternally, options: SpawnSyncOptions = definedExternally): SpawnSyncReturns<Buffer>

external fun execSync(command: String): Buffer

external fun execSync(command: String, options: ExecSyncOptionsWithStringEncoding = definedExternally): String

external fun execSync(command: String, options: ExecSyncOptionsWithBufferEncoding = definedExternally): Buffer

external fun execSync(command: String, options: ExecSyncOptions = definedExternally): Buffer

external fun execFileSync(command: String): Buffer

external fun execFileSync(command: String, options: ExecFileSyncOptionsWithStringEncoding = definedExternally): String

external fun execFileSync(command: String, options: ExecFileSyncOptionsWithBufferEncoding = definedExternally): Buffer

external fun execFileSync(command: String, options: ExecFileSyncOptions = definedExternally): Buffer

external fun execFileSync(command: String, args: Array<String> = definedExternally, options: ExecFileSyncOptionsWithStringEncoding = definedExternally): String

external fun execFileSync(command: String, args: Array<String> = definedExternally, options: ExecFileSyncOptionsWithBufferEncoding = definedExternally): Buffer

external fun execFileSync(command: String, args: Array<String> = definedExternally, options: ExecFileSyncOptions = definedExternally): Buffer