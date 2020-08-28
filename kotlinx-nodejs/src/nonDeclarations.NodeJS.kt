@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package NodeJS

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
import tsstdlib.ReadonlySet
import tsstdlib.MapConstructor
import tsstdlib.SetConstructor
import tsstdlib.WeakMapConstructor
import tsstdlib.WeakSetConstructor
import NodeModule

external interface InspectOptions {
    var getters: dynamic /* "get" | "set" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var showHidden: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var colors: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var customInspect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showProxy: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxArrayLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxStringLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var breakLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var compact: dynamic /* Boolean? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var sorted: dynamic /* Boolean? | ((a: String, b: String) -> Number)? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ConsoleConstructorOptions {
    var stdout: WritableStream
    var stderr: WritableStream?
        get() = definedExternally
        set(value) = definedExternally
    var ignoreErrors: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var colorMode: dynamic /* Boolean? | "auto" */
        get() = definedExternally
        set(value) = definedExternally
    var inspectOptions: InspectOptions?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ConsoleConstructor {
    var prototype: Console
}

external interface CallSite {
    fun getThis(): Any
    fun getTypeName(): String?
    fun getFunction(): Function<*>?
    fun getFunctionName(): String?
    fun getMethodName(): String?
    fun getFileName(): String?
    fun getLineNumber(): Number?
    fun getColumnNumber(): Number?
    fun getEvalOrigin(): String?
    fun isToplevel(): Boolean
    fun isEval(): Boolean
    fun isNative(): Boolean
    fun isConstructor(): Boolean
}

typealias ErrnoException = Error

external interface EventEmitter {
    fun addListener(event: String, listener: (args: Any) -> Unit): EventEmitter /* this */
    fun addListener(event: Any, listener: (args: Any) -> Unit): EventEmitter /* this */
    fun on(event: String, listener: (args: Any) -> Unit): EventEmitter /* this */
    fun on(event: Any, listener: (args: Any) -> Unit): EventEmitter /* this */
    fun once(event: String, listener: (args: Any) -> Unit): EventEmitter /* this */
    fun once(event: Any, listener: (args: Any) -> Unit): EventEmitter /* this */
    fun removeListener(event: String, listener: (args: Any) -> Unit): EventEmitter /* this */
    fun removeListener(event: Any, listener: (args: Any) -> Unit): EventEmitter /* this */
    fun off(event: String, listener: (args: Any) -> Unit): EventEmitter /* this */
    fun off(event: Any, listener: (args: Any) -> Unit): EventEmitter /* this */
    fun removeAllListeners(event: String = definedExternally): EventEmitter /* this */
    fun removeAllListeners(event: Any = definedExternally): EventEmitter /* this */
    fun setMaxListeners(n: Number): EventEmitter /* this */
    fun getMaxListeners(): Number
    fun listeners(event: String): Array<Function<*>>
    fun listeners(event: Any): Array<Function<*>>
    fun rawListeners(event: String): Array<Function<*>>
    fun rawListeners(event: Any): Array<Function<*>>
    fun emit(event: String, vararg args: Any): Boolean
    fun emit(event: Any, vararg args: Any): Boolean
    fun listenerCount(type: String): Number
    fun listenerCount(type: Any): Number
    fun prependListener(event: String, listener: (args: Any) -> Unit): EventEmitter /* this */
    fun prependListener(event: Any, listener: (args: Any) -> Unit): EventEmitter /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): EventEmitter /* this */
    fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): EventEmitter /* this */
    fun eventNames(): Array<dynamic /* String | Any */>
}

external interface `T$2` {
    var end: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ReadableStream : EventEmitter {
    var readable: Boolean
    fun read(size: Number = definedExternally): dynamic /* String | Buffer */
    fun setEncoding(encoding: String): ReadableStream /* this */
    fun pause(): ReadableStream /* this */
    fun resume(): ReadableStream /* this */
    fun isPaused(): Boolean
    fun <T : WritableStream> pipe(destination: T, options: `T$2` = definedExternally): T
    fun unpipe(destination: WritableStream = definedExternally): ReadableStream /* this */
    fun unshift(chunk: String, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */ = definedExternally)
    fun unshift(chunk: Uint8Array, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "latin1" | "binary" | "hex" */ = definedExternally)
    fun wrap(oldStream: ReadableStream): ReadableStream /* this */
}

external interface WritableStream : EventEmitter {
    var writable: Boolean
    fun write(buffer: Uint8Array, cb: (err: Error?) -> Unit = definedExternally): Boolean
    fun write(buffer: String, cb: (err: Error?) -> Unit = definedExternally): Boolean
    fun write(str: String, encoding: String = definedExternally, cb: (err: Error?) -> Unit = definedExternally): Boolean
    fun end(cb: () -> Unit = definedExternally)
    fun end(data: String, cb: () -> Unit = definedExternally)
    fun end(data: Uint8Array, cb: () -> Unit = definedExternally)
    fun end(str: String, encoding: String = definedExternally, cb: () -> Unit = definedExternally)
}

external interface ReadWriteStream : ReadableStream, WritableStream

external interface Domain : EventEmitter {
    fun <T> run(fn: (args: Any) -> T, vararg args: Any): T
    fun add(emitter: EventEmitter)
    fun add(emitter: Timer)
    fun remove(emitter: EventEmitter)
    fun remove(emitter: Timer)
    fun <T : Function<*>> bind(cb: T): T
    fun <T : Function<*>> intercept(cb: T): T
    override fun addListener(event: String, listener: (args: Any) -> Unit): Domain /* this */
    override fun on(event: String, listener: (args: Any) -> Unit): Domain /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Domain /* this */
    override fun removeListener(event: String, listener: (args: Any) -> Unit): Domain /* this */
    override fun removeAllListeners(event: String): Domain /* this */
}

external interface MemoryUsage {
    var rss: Number
    var heapTotal: Number
    var heapUsed: Number
    var external: Number
    var arrayBuffers: Number
}

external interface CpuUsage {
    var user: Number
    var system: Number
}

external interface ProcessRelease {
    var name: String
    var sourceUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var headersUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var libUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var lts: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ProcessVersions {
    var http_parser: String
    var node: String
    var v8: String
    var ares: String
    var uv: String
    var zlib: String
    var modules: String
    var openssl: String
}

typealias BeforeExitListener = (code: Number) -> Unit

typealias DisconnectListener = () -> Unit

typealias ExitListener = (code: Number) -> Unit

typealias RejectionHandledListener = (promise: Promise<Any>) -> Unit

typealias UncaughtExceptionListener = (error: Error) -> Unit

typealias UnhandledRejectionListener = (reason: Any?, promise: Promise<Any>) -> Unit

typealias WarningListener = (warning: Error) -> Unit

typealias MessageListener = (message: Any, sendHandle: Any) -> Unit

typealias SignalsListener = (signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */) -> Unit

typealias NewListenerListener = (type: dynamic /* String | Any */, listener: (args: Any) -> Unit) -> Unit

typealias RemoveListenerListener = (type: dynamic /* String | Any */, listener: (args: Any) -> Unit) -> Unit

typealias MultipleResolveListener = (type: String /* "resolve" | "reject" */, promise: Promise<Any>, value: Any) -> Unit

external interface Socket : ReadWriteStream {
    var isTTY: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ProcessEnv : Dict<String>

external interface HRTime {
    @nativeInvoke
    operator fun invoke(time: dynamic /* JsTuple<Number, Number> */ = definedExternally): dynamic /* JsTuple<Number, Number> */
}

external interface ProcessReport {
    var directory: String
    var filename: String
    fun getReport(err: Error = definedExternally): String
    var reportOnFatalError: Boolean
    var reportOnSignal: Boolean
    var reportOnUncaughtException: Boolean
    var signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */
    fun writeReport(fileName: String = definedExternally): String
    fun writeReport(error: Error = definedExternally): String
    fun writeReport(fileName: String = definedExternally, err: Error = definedExternally): String
}

external interface ResourceUsage {
    var fsRead: Number
    var fsWrite: Number
    var involuntaryContextSwitches: Number
    var ipcReceived: Number
    var ipcSent: Number
    var majorPageFault: Number
    var maxRSS: Number
    var minorPageFault: Number
    var sharedMemorySize: Number
    var signalsCount: Number
    var swappedOut: Number
    var systemCPUTime: Number
    var unsharedDataSize: Number
    var unsharedStackSize: Number
    var userCPUTime: Number
    var voluntaryContextSwitches: Number
}

external interface `T$3` {
    var cflags: Array<Any>
    var default_configuration: String
    var defines: Array<String>
    var include_dirs: Array<String>
    var libraries: Array<String>
}

external interface `T$4` {
    var clang: Number
    var host_arch: String
    var node_install_npm: Boolean
    var node_install_waf: Boolean
    var node_prefix: String
    var node_shared_openssl: Boolean
    var node_shared_v8: Boolean
    var node_shared_zlib: Boolean
    var node_use_dtrace: Boolean
    var node_use_etw: Boolean
    var node_use_openssl: Boolean
    var target_arch: String
    var v8_no_strict_aliasing: Number
    var v8_use_snapshot: Boolean
    var visibility: String
}

external interface `T$5` {
    var target_defaults: `T$3`
    var variables: `T$4`
}

external interface `T$6` {
    var inspector: Boolean
    var debug: Boolean
    var uv: Boolean
    var ipv6: Boolean
    var tls_alpn: Boolean
    var tls_sni: Boolean
    var tls_ocsp: Boolean
    var tls: Boolean
}

external interface `T$7` {
    var swallowErrors: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Process : EventEmitter {
    var stdout: process.global.NodeJS.WriteStream
    var stderr: process.global.NodeJS.WriteStream
    var stdin: process.global.NodeJS.ReadStream
    fun openStdin(): Socket
    var argv: Array<String>
    var argv0: String
    var execArgv: Array<String>
    var execPath: String
    fun abort()
    fun chdir(directory: String)
    fun cwd(): String
    var debugPort: Number
    fun emitWarning(warning: String, name: String = definedExternally, ctor: Function<*> = definedExternally)
    fun emitWarning(warning: Error, name: String = definedExternally, ctor: Function<*> = definedExternally)
    var env: ProcessEnv
    fun exit(code: Number = definedExternally): Any
    var exitCode: Number?
        get() = definedExternally
        set(value) = definedExternally
    fun getgid(): Number
    fun setgid(id: Number)
    fun setgid(id: String)
    fun getuid(): Number
    fun setuid(id: Number)
    fun setuid(id: String)
    fun geteuid(): Number
    fun seteuid(id: Number)
    fun seteuid(id: String)
    fun getegid(): Number
    fun setegid(id: Number)
    fun setegid(id: String)
    fun getgroups(): Array<Number>
    fun setgroups(groups: Array<dynamic /* String | Number */>)
    fun setUncaughtExceptionCaptureCallback(cb: ((err: Error) -> Unit)?)
    fun hasUncaughtExceptionCaptureCallback(): Boolean
    var version: String
    var versions: ProcessVersions
    var config: `T$5`
    fun kill(pid: Number, signal: String = definedExternally)
    fun kill(pid: Number, signal: Number = definedExternally)
    var pid: Number
    var ppid: Number
    var title: String
    var arch: String
    var platform: String /* "aix" | "android" | "darwin" | "freebsd" | "linux" | "openbsd" | "sunos" | "win32" | "cygwin" | "netbsd" */
    var mainModule: Module?
        get() = definedExternally
        set(value) = definedExternally
    fun memoryUsage(): MemoryUsage
    fun cpuUsage(previousValue: CpuUsage = definedExternally): CpuUsage
    fun nextTick(callback: Function<*>, vararg args: Any)
    var release: ProcessRelease
    var features: `T$6`
    fun umask(mask: Number = definedExternally): Number
    fun uptime(): Number
    var hrtime: HRTime
    var domain: Domain
    val send: ((message: Any, sendHandle: Any, options: `T$7`, callback: (error: Error?) -> Unit) -> Boolean)?
        get() = definedExternally
    fun disconnect()
    var connected: Boolean
    var allowedNodeEnvironmentFlags: ReadonlySet<String>
    var report: ProcessReport?
        get() = definedExternally
        set(value) = definedExternally
    fun resourceUsage(): ResourceUsage
    fun addListener(event: String /* "beforeExit" */, listener: BeforeExitListener): Process /* this */
    fun addListener(event: String /* "disconnect" */, listener: DisconnectListener): Process /* this */
    fun addListener(event: String /* "rejectionHandled" */, listener: RejectionHandledListener): Process /* this */
    fun addListener(event: String /* "uncaughtException" | "uncaughtExceptionMonitor" */, listener: UncaughtExceptionListener): Process /* this */
    fun addListener(event: String /* "unhandledRejection" */, listener: UnhandledRejectionListener): Process /* this */
    fun addListener(event: String /* "message" */, listener: MessageListener): Process /* this */
    fun addListener(event: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */, listener: SignalsListener): Process /* this */
    fun addListener(event: String /* "newListener" */, listener: NewListenerListener): Process /* this */
    fun addListener(event: String /* "multipleResolves" */, listener: MultipleResolveListener): Process /* this */
    fun emit(event: String /* "beforeExit" | "exit" */, code: Number): Boolean
    override fun emit(event: String, vararg args: Any): Boolean
    fun emit(event: String /* "disconnect" */): Boolean
    fun emit(event: String /* "rejectionHandled" */, promise: Promise<Any>): Boolean
    fun emit(event: String /* "uncaughtException" | "uncaughtExceptionMonitor" | "warning" */, error: Error): Boolean
    fun emit(event: String /* "unhandledRejection" */, reason: Any, promise: Promise<Any>): Boolean
    fun emit(event: String /* "message" */, message: Any, sendHandle: Any): Process /* this */
    fun emit(event: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */, signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */): Boolean
    fun emit(event: String /* "newListener" | "removeListener" */, eventName: String, listener: (args: Any) -> Unit): Process /* this */
    fun emit(event: String /* "newListener" */, eventName: Any, listener: (args: Any) -> Unit): Process /* this */
    fun emit(event: String /* "multipleResolves" */, listener: MultipleResolveListener): Process /* this */
    fun on(event: String /* "beforeExit" */, listener: BeforeExitListener): Process /* this */
    fun on(event: String /* "disconnect" */, listener: DisconnectListener): Process /* this */
    fun on(event: String /* "rejectionHandled" */, listener: RejectionHandledListener): Process /* this */
    fun on(event: String /* "uncaughtException" | "uncaughtExceptionMonitor" */, listener: UncaughtExceptionListener): Process /* this */
    fun on(event: String /* "unhandledRejection" */, listener: UnhandledRejectionListener): Process /* this */
    fun on(event: String /* "message" */, listener: MessageListener): Process /* this */
    fun on(event: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */, listener: SignalsListener): Process /* this */
    fun on(event: String /* "newListener" */, listener: NewListenerListener): Process /* this */
    fun on(event: String /* "multipleResolves" */, listener: MultipleResolveListener): Process /* this */
    fun once(event: String /* "beforeExit" */, listener: BeforeExitListener): Process /* this */
    fun once(event: String /* "disconnect" */, listener: DisconnectListener): Process /* this */
    fun once(event: String /* "rejectionHandled" */, listener: RejectionHandledListener): Process /* this */
    fun once(event: String /* "uncaughtException" | "uncaughtExceptionMonitor" */, listener: UncaughtExceptionListener): Process /* this */
    fun once(event: String /* "unhandledRejection" */, listener: UnhandledRejectionListener): Process /* this */
    fun once(event: String /* "message" */, listener: MessageListener): Process /* this */
    fun once(event: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */, listener: SignalsListener): Process /* this */
    fun once(event: String /* "newListener" */, listener: NewListenerListener): Process /* this */
    fun once(event: String /* "multipleResolves" */, listener: MultipleResolveListener): Process /* this */
    fun prependListener(event: String /* "beforeExit" */, listener: BeforeExitListener): Process /* this */
    fun prependListener(event: String /* "disconnect" */, listener: DisconnectListener): Process /* this */
    fun prependListener(event: String /* "rejectionHandled" */, listener: RejectionHandledListener): Process /* this */
    fun prependListener(event: String /* "uncaughtException" | "uncaughtExceptionMonitor" */, listener: UncaughtExceptionListener): Process /* this */
    fun prependListener(event: String /* "unhandledRejection" */, listener: UnhandledRejectionListener): Process /* this */
    fun prependListener(event: String /* "message" */, listener: MessageListener): Process /* this */
    fun prependListener(event: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */, listener: SignalsListener): Process /* this */
    fun prependListener(event: String /* "newListener" */, listener: NewListenerListener): Process /* this */
    fun prependListener(event: String /* "multipleResolves" */, listener: MultipleResolveListener): Process /* this */
    fun prependOnceListener(event: String /* "beforeExit" */, listener: BeforeExitListener): Process /* this */
    fun prependOnceListener(event: String /* "disconnect" */, listener: DisconnectListener): Process /* this */
    fun prependOnceListener(event: String /* "rejectionHandled" */, listener: RejectionHandledListener): Process /* this */
    fun prependOnceListener(event: String /* "uncaughtException" | "uncaughtExceptionMonitor" */, listener: UncaughtExceptionListener): Process /* this */
    fun prependOnceListener(event: String /* "unhandledRejection" */, listener: UnhandledRejectionListener): Process /* this */
    fun prependOnceListener(event: String /* "message" */, listener: MessageListener): Process /* this */
    fun prependOnceListener(event: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */, listener: SignalsListener): Process /* this */
    fun prependOnceListener(event: String /* "newListener" */, listener: NewListenerListener): Process /* this */
    fun prependOnceListener(event: String /* "multipleResolves" */, listener: MultipleResolveListener): Process /* this */
    override fun listeners(event: String /* "beforeExit" | "disconnect" | "exit" | "rejectionHandled" | "uncaughtException" | "uncaughtExceptionMonitor" | "unhandledRejection" | "warning" | "message" | "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" | "newListener" | "removeListener" | "multipleResolves" */): dynamic /* Array */
}

external interface Global {
    var Array: Any
    var ArrayBuffer: Any
    var Boolean: Any
    var Buffer: Any
    var DataView: Any
    var Date: Any
    var Error: Any
    var EvalError: Any
    var Float32Array: Any
    var Float64Array: Any
    var Function: Any
    var GLOBAL: Global
    var Infinity: Any
    var Int16Array: Any
    var Int32Array: Any
    var Int8Array: Any
    var Intl: Any
    var JSON: Any
    var Map: MapConstructor
    var Math: Any
    var NaN: Any
    var Number: Any
    var Object: Any
    var Promise: Any
    var RangeError: Any
    var ReferenceError: Any
    var RegExp: Any
    var Set: SetConstructor
    var String: Any
    var Symbol: Function<*>
    var SyntaxError: Any
    var TypeError: Any
    var URIError: Any
    var Uint16Array: Any
    var Uint32Array: Any
    var Uint8Array: Any
    var Uint8ClampedArray: Any
    var WeakMap: WeakMapConstructor
    var WeakSet: WeakSetConstructor
    var clearImmediate: (immediateId: Immediate) -> Unit
    var clearInterval: (intervalId: Timeout) -> Unit
    var clearTimeout: (timeoutId: Timeout) -> Unit
    var console: Any
    var decodeURI: Any
    var decodeURIComponent: Any
    var encodeURI: Any
    var encodeURIComponent: Any
    var escape: (str: String) -> String
    var eval: Any
    var global: Global
    var isFinite: Any
    var isNaN: Any
    var parseFloat: Any
    var parseInt: Any
    var process: Process
    var root: Global
    var setImmediate: (callback: (args: Any) -> Unit, args: Any) -> Immediate
    var setInterval: (callback: (args: Any) -> Unit, ms: Number, args: Any) -> Timeout
    var setTimeout: (callback: (args: Any) -> Unit, ms: Number, args: Any) -> Timeout
    var queueMicrotask: Any
    var undefined: Any
    var unescape: (str: String) -> String
    var gc: () -> Unit
    var v8debug: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RefCounted {
    fun ref(): RefCounted /* this */
    fun unref(): RefCounted /* this */
}

external interface Timer : RefCounted {
    fun hasRef(): Boolean
    fun refresh(): Timer /* this */
}

external interface Immediate : RefCounted {
    fun hasRef(): Boolean
    var _onImmediate: Function<*>
}

external interface Timeout : Timer {
    override fun hasRef(): Boolean
    override fun refresh(): Timeout /* this */
}

external interface Require {
    @nativeInvoke
    operator fun invoke(id: String): Any
    var resolve: RequireResolve
    var cache: Dict<NodeModule>
    var extensions: RequireExtensions
    var main: Module?
}

external interface `T$8` {
    var paths: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RequireResolve {
    @nativeInvoke
    operator fun invoke(id: String, options: `T$8` = definedExternally): String
    fun paths(request: String): Array<String>?
}

external interface RequireExtensions : Dict<(m: Module, filename: String) -> Any>

public inline operator fun NodeJS.RequireExtensions.get(key: String): (m: Module, filename: String) -> Any = this.asDynamic()[key]

public inline operator fun NodeJS.RequireExtensions.set(key: String, noinline value: (m: Module, filename: String) -> Any) { this.asDynamic()[key] = value }

external interface Module {
    var exports: Any
    var require: Require
    var id: String
    var filename: String
    var loaded: Boolean
    var path: String
    var parent: Module?
    var children: Array<Module>
    var paths: Array<String>
}

external interface Dict<T>

public inline operator fun <T> NodeJS.Dict<T>.get(key: String): T? = this.asDynamic()[key]

public inline operator fun <T> NodeJS.Dict<T>.set(key: String, value: T?) { this.asDynamic()[key] = value }

external interface ReadOnlyDict<T>

public inline operator fun <T> NodeJS.ReadOnlyDict<T>.get(key: String): T? = this.asDynamic()[key]

public inline operator fun <T> NodeJS.ReadOnlyDict<T>.set(key: String, value: T?) { this.asDynamic()[key] = value }

external interface ReadStream : tty.ReadStream

external interface WriteStream : tty.WriteStream