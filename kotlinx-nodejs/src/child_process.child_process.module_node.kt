@file:JsModule("child_process")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")
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
import stream.Writable
import stream.Readable
import stream.Pipe
import net.Socket
import net.Server
import events.EventEmitter.EventEmitter
import NodeJS.ProcessEnv
import Buffer

external interface ChildProcess : EventEmitter {
    var stdin: Writable?
    var stdout: Readable?
    var stderr: Readable?
    var channel: Pipe?
        get() = definedExternally
        set(value) = definedExternally
    var stdio: dynamic /* JsTuple<Writable?, Readable?, Readable?, dynamic, dynamic> */
        get() = definedExternally
        set(value) = definedExternally
    var killed: Boolean
    var pid: Number
    var connected: Boolean
    fun kill(signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */ = definedExternally): Boolean
    fun kill(signal: Number = definedExternally): Boolean
    fun send(message: String, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Any?, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Number, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Boolean, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: String, sendHandle: Socket = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: String, sendHandle: Server = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Any?, sendHandle: Socket = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Any?, sendHandle: Server = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Number, sendHandle: Socket = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Number, sendHandle: Server = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Boolean, sendHandle: Socket = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Boolean, sendHandle: Server = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: String, sendHandle: Socket = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: String, sendHandle: Server = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Any?, sendHandle: Socket = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Any?, sendHandle: Server = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Number, sendHandle: Socket = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Number, sendHandle: Server = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Boolean, sendHandle: Socket = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Boolean, sendHandle: Server = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun disconnect()
    fun unref()
    fun ref()
    override fun addListener(event: String, listener: (args: Array<Any>) -> Unit): ChildProcess /* this */
    fun addListener(event: String /* "disconnect" */, listener: () -> Unit): ChildProcess /* this */
    fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): ChildProcess /* this */
    fun addListener(event: String /* "message" */, listener: (message: dynamic /* String | Any? | Number | Boolean */, sendHandle: dynamic /* net.Socket | net.Server */) -> Unit): ChildProcess /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    fun emit(event: String /* "close" */, code: Number, signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */): Boolean
    fun emit(event: String /* "disconnect" */): Boolean
    fun emit(event: String /* "error" */, err: Error): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    fun emit(event: String /* "exit" */, code: Number?, signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */): Boolean
    fun emit(event: String /* "message" */, message: String, sendHandle: Socket): Boolean
    fun emit(event: String /* "message" */, message: String, sendHandle: Server): Boolean
    fun emit(event: String /* "message" */, message: Any?, sendHandle: Socket): Boolean
    fun emit(event: String /* "message" */, message: Any?, sendHandle: Server): Boolean
    fun emit(event: String /* "message" */, message: Number, sendHandle: Socket): Boolean
    fun emit(event: String /* "message" */, message: Number, sendHandle: Server): Boolean
    fun emit(event: String /* "message" */, message: Boolean, sendHandle: Socket): Boolean
    fun emit(event: String /* "message" */, message: Boolean, sendHandle: Server): Boolean
    override fun on(event: String, listener: (args: Array<Any>) -> Unit): ChildProcess /* this */
    fun on(event: String /* "disconnect" */, listener: () -> Unit): ChildProcess /* this */
    fun on(event: String /* "error" */, listener: (err: Error) -> Unit): ChildProcess /* this */
    fun on(event: String /* "message" */, listener: (message: dynamic /* String | Any? | Number | Boolean */, sendHandle: dynamic /* net.Socket | net.Server */) -> Unit): ChildProcess /* this */
    override fun once(event: String, listener: (args: Array<Any>) -> Unit): ChildProcess /* this */
    fun once(event: String /* "disconnect" */, listener: () -> Unit): ChildProcess /* this */
    fun once(event: String /* "error" */, listener: (err: Error) -> Unit): ChildProcess /* this */
    fun once(event: String /* "message" */, listener: (message: dynamic /* String | Any? | Number | Boolean */, sendHandle: dynamic /* net.Socket | net.Server */) -> Unit): ChildProcess /* this */
    override fun prependListener(event: String, listener: (args: Array<Any>) -> Unit): ChildProcess /* this */
    fun prependListener(event: String /* "disconnect" */, listener: () -> Unit): ChildProcess /* this */
    fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): ChildProcess /* this */
    fun prependListener(event: String /* "message" */, listener: (message: dynamic /* String | Any? | Number | Boolean */, sendHandle: dynamic /* net.Socket | net.Server */) -> Unit): ChildProcess /* this */
    override fun prependOnceListener(event: String, listener: (args: Array<Any>) -> Unit): ChildProcess /* this */
    fun prependOnceListener(event: String /* "disconnect" */, listener: () -> Unit): ChildProcess /* this */
    fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): ChildProcess /* this */
    fun prependOnceListener(event: String /* "message" */, listener: (message: dynamic /* String | Any? | Number | Boolean */, sendHandle: dynamic /* net.Socket | net.Server */) -> Unit): ChildProcess /* this */
    fun kill(): Boolean
}

external interface ChildProcessWithoutNullStreams : ChildProcess {
    override var stdio: dynamic /* JsTuple<Writable, Readable, Readable, dynamic, dynamic> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ChildProcessByStdio<I : Writable?, O : Readable?, E : Readable?> : ChildProcess {
    override var stdio: dynamic /* JsTuple<I, O, E, dynamic, dynamic> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface MessageOptions {
    var keepOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MessagingOptions {
    var serialization: String? /* 'json' | 'advanced' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ProcessEnvOptions {
    var uid: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gid: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cwd: String?
        get() = definedExternally
        set(value) = definedExternally
    var env: ProcessEnv?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CommonOptions : ProcessEnvOptions {
    var windowsHide: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CommonSpawnOptions : CommonOptions, MessagingOptions {
    var argv0: String?
        get() = definedExternally
        set(value) = definedExternally
    var stdio: dynamic /* String | String | String | Array<dynamic /* String? | String? | String? | String? | Stream? | Number? */> */
        get() = definedExternally
        set(value) = definedExternally
    var shell: dynamic /* Boolean? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var windowsVerbatimArguments: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SpawnOptions : CommonSpawnOptions {
    var detached: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SpawnOptionsWithoutStdio : SpawnOptions {
    override var stdio: dynamic /* String? | Array<String /* 'pipe' */>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SpawnOptionsWithStdioTuple<Stdin, Stdout, Stderr> : SpawnOptions {
    override var stdio: dynamic /* JsTuple<Stdin, Stdout, Stderr> */
        get() = definedExternally
        set(value) = definedExternally
}

external fun spawn(command: String, options: SpawnOptionsWithoutStdio = definedExternally): ChildProcessWithoutNullStreams

external fun spawn(command: String, options: SpawnOptionsWithStdioTuple<dynamic /* String | String | Stream */, dynamic /* String | String | Stream */, dynamic /* String | String | Stream */>): ChildProcessByStdio<Nothing?, Nothing?, Nothing?>

external fun spawn(command: String, options: SpawnOptions): ChildProcess

external fun spawn(command: String, args: Array<String> = definedExternally, options: SpawnOptionsWithoutStdio = definedExternally): ChildProcessWithoutNullStreams

external fun spawn(command: String, args: Array<String>, options: SpawnOptionsWithStdioTuple<dynamic /* String | String | Stream */, dynamic /* String | String | Stream */, dynamic /* String | String | Stream */>): ChildProcessByStdio<Nothing?, Nothing?, Nothing?>

external fun spawn(command: String, args: Array<String>, options: SpawnOptions): ChildProcess

external interface ExecOptions : CommonOptions {
    var shell: String?
        get() = definedExternally
        set(value) = definedExternally
    var maxBuffer: Number?
        get() = definedExternally
        set(value) = definedExternally
    var killSignal: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExecOptionsWithStringEncoding : ExecOptions {
    var encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */
}

external interface ExecOptionsWithBufferEncoding : ExecOptions {
    var encoding: String?
}

external fun exec(command: String, callback: (error: ExecException?, stdout: String, stderr: String) -> Unit = definedExternally): ChildProcess

external interface `T$13` {
    var encoding: String /* "buffer" */
}

external fun exec(command: String, options: `T$13` /* `T$13` & ExecOptions */, callback: (error: ExecException?, stdout: Buffer, stderr: Buffer) -> Unit = definedExternally): ChildProcess

external interface `T$14` {
    var encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */
}

external fun exec(command: String, options: `T$14` /* `T$14` & ExecOptions */, callback: (error: ExecException?, stdout: String, stderr: String) -> Unit = definedExternally): ChildProcess

external interface `T$15` {
    var encoding: String
}

external fun exec(command: String, options: `T$15` /* `T$15` & ExecOptions */, callback: (error: ExecException?, stdout: dynamic /* String | Buffer */, stderr: dynamic /* String | Buffer */) -> Unit = definedExternally): ChildProcess

external fun exec(command: String, options: ExecOptions, callback: (error: ExecException?, stdout: String, stderr: String) -> Unit = definedExternally): ChildProcess

external interface `T$16` {
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
}

external fun exec(command: String, options: `T$16` /* `T$16` & ExecOptions */, callback: (error: ExecException?, stdout: dynamic /* String | Buffer */, stderr: dynamic /* String | Buffer */) -> Unit = definedExternally): ChildProcess

external interface PromiseWithChild<T> : Promise<T> {
    var child: ChildProcess
}

external interface ExecFileOptions : CommonOptions {
    var maxBuffer: Number?
        get() = definedExternally
        set(value) = definedExternally
    var killSignal: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var windowsVerbatimArguments: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var shell: dynamic /* Boolean? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExecFileOptionsWithStringEncoding : ExecFileOptions {
    var encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */
}

external interface ExecFileOptionsWithBufferEncoding : ExecFileOptions {
    var encoding: String /* 'buffer' */
}

external interface ExecFileOptionsWithOtherEncoding : ExecFileOptions {
    var encoding: String
}

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

external interface ForkOptions : ProcessEnvOptions, MessagingOptions {
    var execPath: String?
        get() = definedExternally
        set(value) = definedExternally
    var execArgv: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stdio: dynamic /* String | String | String | Array<dynamic /* String? | String? | String? | String? | Stream? | Number? */> */
        get() = definedExternally
        set(value) = definedExternally
    var detached: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var windowsVerbatimArguments: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external fun fork(modulePath: String, args: Array<String> = definedExternally, options: ForkOptions = definedExternally): ChildProcess

external interface SpawnSyncOptions : CommonSpawnOptions {
    var input: dynamic /* String? | Uint8Array? | Uint8ClampedArray? | Uint16Array? | Uint32Array? | Int8Array? | Int16Array? | Int32Array? | Float32Array? | Float64Array? | DataView? */
        get() = definedExternally
        set(value) = definedExternally
    var killSignal: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var maxBuffer: Number?
        get() = definedExternally
        set(value) = definedExternally
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SpawnSyncOptionsWithStringEncoding : SpawnSyncOptions

external interface SpawnSyncOptionsWithBufferEncoding : SpawnSyncOptions

external interface SpawnSyncReturns<T> {
    var pid: Number
    var output: Array<String>
    var stdout: T
    var stderr: T
    var status: Number?
    var signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */
    var error: Error?
        get() = definedExternally
        set(value) = definedExternally
}

external fun spawnSync(command: String): SpawnSyncReturns<Buffer>

external fun spawnSync(command: String, options: SpawnSyncOptionsWithStringEncoding = definedExternally): SpawnSyncReturns<String>

external fun spawnSync(command: String, options: SpawnSyncOptionsWithBufferEncoding = definedExternally): SpawnSyncReturns<Buffer>

external fun spawnSync(command: String, options: SpawnSyncOptions = definedExternally): SpawnSyncReturns<Buffer>

external fun spawnSync(command: String, args: Array<String> = definedExternally, options: SpawnSyncOptionsWithStringEncoding = definedExternally): SpawnSyncReturns<String>

external fun spawnSync(command: String, args: Array<String> = definedExternally, options: SpawnSyncOptionsWithBufferEncoding = definedExternally): SpawnSyncReturns<Buffer>

external fun spawnSync(command: String, args: Array<String> = definedExternally, options: SpawnSyncOptions = definedExternally): SpawnSyncReturns<Buffer>

external interface ExecSyncOptions : CommonOptions {
    var input: dynamic /* String? | Uint8Array? */
        get() = definedExternally
        set(value) = definedExternally
    var stdio: dynamic /* String | String | String | Array<dynamic /* String? | String? | String? | String? | Stream? | Number? */> */
        get() = definedExternally
        set(value) = definedExternally
    var shell: String?
        get() = definedExternally
        set(value) = definedExternally
    var killSignal: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var maxBuffer: Number?
        get() = definedExternally
        set(value) = definedExternally
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExecSyncOptionsWithStringEncoding : ExecSyncOptions

external interface ExecSyncOptionsWithBufferEncoding : ExecSyncOptions

external fun execSync(command: String): Buffer

external fun execSync(command: String, options: ExecSyncOptionsWithStringEncoding = definedExternally): String

external fun execSync(command: String, options: ExecSyncOptionsWithBufferEncoding = definedExternally): Buffer

external fun execSync(command: String, options: ExecSyncOptions = definedExternally): Buffer

external interface ExecFileSyncOptions : CommonOptions {
    var input: dynamic /* String? | Uint8Array? | Uint8ClampedArray? | Uint16Array? | Uint32Array? | Int8Array? | Int16Array? | Int32Array? | Float32Array? | Float64Array? | DataView? */
        get() = definedExternally
        set(value) = definedExternally
    var stdio: dynamic /* String | String | String | Array<dynamic /* String? | String? | String? | String? | Stream? | Number? */> */
        get() = definedExternally
        set(value) = definedExternally
    var killSignal: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var maxBuffer: Number?
        get() = definedExternally
        set(value) = definedExternally
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var shell: dynamic /* Boolean? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExecFileSyncOptionsWithStringEncoding : ExecFileSyncOptions

external interface ExecFileSyncOptionsWithBufferEncoding : ExecFileSyncOptions

external fun execFileSync(command: String): Buffer

external fun execFileSync(command: String, options: ExecFileSyncOptionsWithStringEncoding = definedExternally): String

external fun execFileSync(command: String, options: ExecFileSyncOptionsWithBufferEncoding = definedExternally): Buffer

external fun execFileSync(command: String, options: ExecFileSyncOptions = definedExternally): Buffer

external fun execFileSync(command: String, args: Array<String> = definedExternally, options: ExecFileSyncOptionsWithStringEncoding = definedExternally): String

external fun execFileSync(command: String, args: Array<String> = definedExternally, options: ExecFileSyncOptionsWithBufferEncoding = definedExternally): Buffer

external fun execFileSync(command: String, args: Array<String> = definedExternally, options: ExecFileSyncOptions = definedExternally): Buffer
