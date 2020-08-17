@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package perf_hooks

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
import tsstdlib.Map

external interface PerformanceEntry {
    var duration: Number
    var name: String
    var startTime: Number
    var entryType: String /* "node" | "mark" | "measure" | "gc" | "function" | "http2" | "http" */
    var kind: Number?
        get() = definedExternally
        set(value) = definedExternally
    var flags: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PerformanceNodeTiming : PerformanceEntry {
    var bootstrapComplete: Number
    var clusterSetupEnd: Number
    var clusterSetupStart: Number
    var loopExit: Number
    var loopStart: Number
    var moduleLoadEnd: Number
    var moduleLoadStart: Number
    var nodeStart: Number
    var preloadModuleLoadEnd: Number
    var preloadModuleLoadStart: Number
    var thirdPartyMainEnd: Number
    var thirdPartyMainStart: Number
    var v8Start: Number
}

external interface Performance {
    fun clearFunctions(name: String = definedExternally)
    fun clearMarks(name: String = definedExternally)
    fun clearMeasures(name: String = definedExternally)
    fun getEntries(): Array<PerformanceEntry>
    fun getEntriesByName(name: String, type: String /* "node" | "mark" | "measure" | "gc" | "function" | "http2" | "http" */ = definedExternally): Array<PerformanceEntry>
    fun getEntriesByType(type: String /* "node" | "mark" | "measure" | "gc" | "function" | "http2" | "http" */): Array<PerformanceEntry>
    fun mark(name: String = definedExternally)
    fun measure(name: String, startMark: String, endMark: String)
    var nodeTiming: PerformanceNodeTiming
    fun now(): Number
    var timeOrigin: Number
    fun <T : (optionalParams: Any) -> Any> timerify(fn: T): T
}

external interface PerformanceObserverEntryList {
    fun getEntries(): Array<PerformanceEntry>
    fun getEntriesByName(name: String, type: String /* "node" | "mark" | "measure" | "gc" | "function" | "http2" | "http" */ = definedExternally): Array<PerformanceEntry>
    fun getEntriesByType(type: String /* "node" | "mark" | "measure" | "gc" | "function" | "http2" | "http" */): Array<PerformanceEntry>
}

typealias PerformanceObserverCallback = (list: PerformanceObserverEntryList, observer: PerformanceObserver) -> Unit

external interface `T$60` {
    var entryTypes: Array<String /* "node" | "mark" | "measure" | "gc" | "function" | "http2" | "http" */>
    var buffered: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EventLoopMonitorOptions {
    var resolution: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EventLoopDelayMonitor {
    fun enable(): Boolean
    fun disable(): Boolean
    fun reset()
    fun percentile(percentile: Number): Number
    var percentiles: Map<Number, Number>
    var exceeds: Number
    var min: Number
    var max: Number
    var mean: Number
    var stddev: Number
}