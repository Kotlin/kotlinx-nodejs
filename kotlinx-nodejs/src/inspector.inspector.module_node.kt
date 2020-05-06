@file:JsModule("inspector")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package inspector

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
import events.EventEmitter.EventEmitter

external interface InspectorNotification<T> {
    var method: String
    var params: T
}

external open class Session : EventEmitter {
    open fun connect()
    open fun disconnect()
    open fun post(method: String, params: Any = definedExternally, callback: (err: Error?, params: Any) -> Unit = definedExternally)
    open fun post(method: String, callback: (err: Error?, params: Any) -> Unit = definedExternally)
    open fun post(method: String /* "Schema.getDomains" */, callback: (err: Error?, params: inspector.Schema.GetDomainsReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.evaluate" */, params: inspector.Runtime.EvaluateParameterType = definedExternally, callback: (err: Error?, params: inspector.Runtime.EvaluateReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.evaluate" */, callback: (err: Error?, params: inspector.Runtime.EvaluateReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.awaitPromise" */, params: inspector.Runtime.AwaitPromiseParameterType = definedExternally, callback: (err: Error?, params: inspector.Runtime.AwaitPromiseReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.awaitPromise" */, callback: (err: Error?, params: inspector.Runtime.AwaitPromiseReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.callFunctionOn" */, params: inspector.Runtime.CallFunctionOnParameterType = definedExternally, callback: (err: Error?, params: inspector.Runtime.CallFunctionOnReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.callFunctionOn" */, callback: (err: Error?, params: inspector.Runtime.CallFunctionOnReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.getProperties" */, params: inspector.Runtime.GetPropertiesParameterType = definedExternally, callback: (err: Error?, params: inspector.Runtime.GetPropertiesReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.getProperties" */, callback: (err: Error?, params: inspector.Runtime.GetPropertiesReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.releaseObject" */, params: inspector.Runtime.ReleaseObjectParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.releaseObjectGroup" */, params: inspector.Runtime.ReleaseObjectGroupParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.setCustomObjectFormatterEnabled" */, params: inspector.Runtime.SetCustomObjectFormatterEnabledParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.compileScript" */, params: inspector.Runtime.CompileScriptParameterType = definedExternally, callback: (err: Error?, params: inspector.Runtime.CompileScriptReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.compileScript" */, callback: (err: Error?, params: inspector.Runtime.CompileScriptReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.runScript" */, params: inspector.Runtime.RunScriptParameterType = definedExternally, callback: (err: Error?, params: inspector.Runtime.RunScriptReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.runScript" */, callback: (err: Error?, params: inspector.Runtime.RunScriptReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.queryObjects" */, params: inspector.Runtime.QueryObjectsParameterType = definedExternally, callback: (err: Error?, params: inspector.Runtime.QueryObjectsReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.queryObjects" */, callback: (err: Error?, params: inspector.Runtime.QueryObjectsReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.globalLexicalScopeNames" */, params: inspector.Runtime.GlobalLexicalScopeNamesParameterType = definedExternally, callback: (err: Error?, params: inspector.Runtime.GlobalLexicalScopeNamesReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.globalLexicalScopeNames" */, callback: (err: Error?, params: inspector.Runtime.GlobalLexicalScopeNamesReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.enable" */, callback: (err: Error?, params: inspector.Debugger.EnableReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setBreakpointsActive" */, params: inspector.Debugger.SetBreakpointsActiveParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setSkipAllPauses" */, params: inspector.Debugger.SetSkipAllPausesParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setBreakpointByUrl" */, params: inspector.Debugger.SetBreakpointByUrlParameterType = definedExternally, callback: (err: Error?, params: inspector.Debugger.SetBreakpointByUrlReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setBreakpointByUrl" */, callback: (err: Error?, params: inspector.Debugger.SetBreakpointByUrlReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setBreakpoint" */, params: inspector.Debugger.SetBreakpointParameterType = definedExternally, callback: (err: Error?, params: inspector.Debugger.SetBreakpointReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setBreakpoint" */, callback: (err: Error?, params: inspector.Debugger.SetBreakpointReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.removeBreakpoint" */, params: inspector.Debugger.RemoveBreakpointParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.getPossibleBreakpoints" */, params: inspector.Debugger.GetPossibleBreakpointsParameterType = definedExternally, callback: (err: Error?, params: inspector.Debugger.GetPossibleBreakpointsReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.getPossibleBreakpoints" */, callback: (err: Error?, params: inspector.Debugger.GetPossibleBreakpointsReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.continueToLocation" */, params: inspector.Debugger.ContinueToLocationParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.pauseOnAsyncCall" */, params: inspector.Debugger.PauseOnAsyncCallParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.stepInto" */, params: inspector.Debugger.StepIntoParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.getStackTrace" */, params: inspector.Debugger.GetStackTraceParameterType = definedExternally, callback: (err: Error?, params: inspector.Debugger.GetStackTraceReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.getStackTrace" */, callback: (err: Error?, params: inspector.Debugger.GetStackTraceReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.searchInContent" */, params: inspector.Debugger.SearchInContentParameterType = definedExternally, callback: (err: Error?, params: inspector.Debugger.SearchInContentReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.searchInContent" */, callback: (err: Error?, params: inspector.Debugger.SearchInContentReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setScriptSource" */, params: inspector.Debugger.SetScriptSourceParameterType = definedExternally, callback: (err: Error?, params: inspector.Debugger.SetScriptSourceReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setScriptSource" */, callback: (err: Error?, params: inspector.Debugger.SetScriptSourceReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.restartFrame" */, params: inspector.Debugger.RestartFrameParameterType = definedExternally, callback: (err: Error?, params: inspector.Debugger.RestartFrameReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.restartFrame" */, callback: (err: Error?, params: inspector.Debugger.RestartFrameReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.getScriptSource" */, params: inspector.Debugger.GetScriptSourceParameterType = definedExternally, callback: (err: Error?, params: inspector.Debugger.GetScriptSourceReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.getScriptSource" */, callback: (err: Error?, params: inspector.Debugger.GetScriptSourceReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setPauseOnExceptions" */, params: inspector.Debugger.SetPauseOnExceptionsParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.evaluateOnCallFrame" */, params: inspector.Debugger.EvaluateOnCallFrameParameterType = definedExternally, callback: (err: Error?, params: inspector.Debugger.EvaluateOnCallFrameReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.evaluateOnCallFrame" */, callback: (err: Error?, params: inspector.Debugger.EvaluateOnCallFrameReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setVariableValue" */, params: inspector.Debugger.SetVariableValueParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setReturnValue" */, params: inspector.Debugger.SetReturnValueParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setAsyncCallStackDepth" */, params: inspector.Debugger.SetAsyncCallStackDepthParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setBlackboxPatterns" */, params: inspector.Debugger.SetBlackboxPatternsParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setBlackboxedRanges" */, params: inspector.Debugger.SetBlackboxedRangesParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Profiler.setSamplingInterval" */, params: inspector.Profiler.SetSamplingIntervalParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Profiler.stop" */, callback: (err: Error?, params: inspector.Profiler.StopReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Profiler.startPreciseCoverage" */, params: inspector.Profiler.StartPreciseCoverageParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Profiler.takePreciseCoverage" */, callback: (err: Error?, params: inspector.Profiler.TakePreciseCoverageReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Profiler.getBestEffortCoverage" */, callback: (err: Error?, params: inspector.Profiler.GetBestEffortCoverageReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Profiler.takeTypeProfile" */, callback: (err: Error?, params: inspector.Profiler.TakeTypeProfileReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.startTrackingHeapObjects" */, params: inspector.HeapProfiler.StartTrackingHeapObjectsParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.stopTrackingHeapObjects" */, params: inspector.HeapProfiler.StopTrackingHeapObjectsParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.takeHeapSnapshot" */, params: inspector.HeapProfiler.TakeHeapSnapshotParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.getObjectByHeapObjectId" */, params: inspector.HeapProfiler.GetObjectByHeapObjectIdParameterType = definedExternally, callback: (err: Error?, params: inspector.HeapProfiler.GetObjectByHeapObjectIdReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.getObjectByHeapObjectId" */, callback: (err: Error?, params: inspector.HeapProfiler.GetObjectByHeapObjectIdReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.addInspectedHeapObject" */, params: inspector.HeapProfiler.AddInspectedHeapObjectParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.getHeapObjectId" */, params: inspector.HeapProfiler.GetHeapObjectIdParameterType = definedExternally, callback: (err: Error?, params: inspector.HeapProfiler.GetHeapObjectIdReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.getHeapObjectId" */, callback: (err: Error?, params: inspector.HeapProfiler.GetHeapObjectIdReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.startSampling" */, params: inspector.HeapProfiler.StartSamplingParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.stopSampling" */, callback: (err: Error?, params: inspector.HeapProfiler.StopSamplingReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.getSamplingProfile" */, callback: (err: Error?, params: inspector.HeapProfiler.GetSamplingProfileReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "NodeTracing.getCategories" */, callback: (err: Error?, params: inspector.NodeTracing.GetCategoriesReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "NodeTracing.start" */, params: inspector.NodeTracing.StartParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "NodeWorker.sendMessageToWorker" */, params: inspector.NodeWorker.SendMessageToWorkerParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "NodeWorker.enable" */, params: inspector.NodeWorker.EnableParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "NodeWorker.detach" */, params: inspector.NodeWorker.DetachParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "NodeRuntime.notifyWhenWaitingForDisconnect" */, params: inspector.NodeRuntime.NotifyWhenWaitingForDisconnectParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    override fun addListener(event: String, listener: (args: Array<Any>) -> Unit): Session /* this */
    open fun addListener(event: String /* "inspectorNotification" */, listener: (message: InspectorNotification<Any>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Runtime.executionContextCreated" */, listener: (message: InspectorNotification<inspector.Runtime.ExecutionContextCreatedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Runtime.executionContextDestroyed" */, listener: (message: InspectorNotification<inspector.Runtime.ExecutionContextDestroyedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String, listener: () -> Unit): Session /* this */
    open fun addListener(event: String /* "Runtime.exceptionThrown" */, listener: (message: InspectorNotification<inspector.Runtime.ExceptionThrownEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Runtime.exceptionRevoked" */, listener: (message: InspectorNotification<inspector.Runtime.ExceptionRevokedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Runtime.consoleAPICalled" */, listener: (message: InspectorNotification<inspector.Runtime.ConsoleAPICalledEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Runtime.inspectRequested" */, listener: (message: InspectorNotification<inspector.Runtime.InspectRequestedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Debugger.scriptParsed" */, listener: (message: InspectorNotification<inspector.Debugger.ScriptParsedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Debugger.scriptFailedToParse" */, listener: (message: InspectorNotification<inspector.Debugger.ScriptFailedToParseEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Debugger.breakpointResolved" */, listener: (message: InspectorNotification<inspector.Debugger.BreakpointResolvedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Debugger.paused" */, listener: (message: InspectorNotification<inspector.Debugger.PausedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Console.messageAdded" */, listener: (message: InspectorNotification<inspector.Console.MessageAddedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Profiler.consoleProfileStarted" */, listener: (message: InspectorNotification<inspector.Profiler.ConsoleProfileStartedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Profiler.consoleProfileFinished" */, listener: (message: InspectorNotification<inspector.Profiler.ConsoleProfileFinishedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "HeapProfiler.addHeapSnapshotChunk" */, listener: (message: InspectorNotification<inspector.HeapProfiler.AddHeapSnapshotChunkEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "HeapProfiler.reportHeapSnapshotProgress" */, listener: (message: InspectorNotification<inspector.HeapProfiler.ReportHeapSnapshotProgressEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "HeapProfiler.lastSeenObjectId" */, listener: (message: InspectorNotification<inspector.HeapProfiler.LastSeenObjectIdEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "HeapProfiler.heapStatsUpdate" */, listener: (message: InspectorNotification<inspector.HeapProfiler.HeapStatsUpdateEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "NodeTracing.dataCollected" */, listener: (message: InspectorNotification<inspector.NodeTracing.DataCollectedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "NodeWorker.attachedToWorker" */, listener: (message: InspectorNotification<inspector.NodeWorker.AttachedToWorkerEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "NodeWorker.detachedFromWorker" */, listener: (message: InspectorNotification<inspector.NodeWorker.DetachedFromWorkerEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "NodeWorker.receivedMessageFromWorker" */, listener: (message: InspectorNotification<inspector.NodeWorker.ReceivedMessageFromWorkerEventDataType>) -> Unit): Session /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "inspectorNotification" */, message: InspectorNotification<Any>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "Runtime.executionContextCreated" */, message: InspectorNotification<inspector.Runtime.ExecutionContextCreatedEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "Runtime.executionContextDestroyed" */, message: InspectorNotification<inspector.Runtime.ExecutionContextDestroyedEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String): Boolean
    open fun emit(event: String /* "Runtime.exceptionThrown" */, message: InspectorNotification<inspector.Runtime.ExceptionThrownEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "Runtime.exceptionRevoked" */, message: InspectorNotification<inspector.Runtime.ExceptionRevokedEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "Runtime.consoleAPICalled" */, message: InspectorNotification<inspector.Runtime.ConsoleAPICalledEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "Runtime.inspectRequested" */, message: InspectorNotification<inspector.Runtime.InspectRequestedEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "Debugger.scriptParsed" */, message: InspectorNotification<inspector.Debugger.ScriptParsedEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "Debugger.scriptFailedToParse" */, message: InspectorNotification<inspector.Debugger.ScriptFailedToParseEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "Debugger.breakpointResolved" */, message: InspectorNotification<inspector.Debugger.BreakpointResolvedEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "Debugger.paused" */, message: InspectorNotification<inspector.Debugger.PausedEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "Console.messageAdded" */, message: InspectorNotification<inspector.Console.MessageAddedEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "Profiler.consoleProfileStarted" */, message: InspectorNotification<inspector.Profiler.ConsoleProfileStartedEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "Profiler.consoleProfileFinished" */, message: InspectorNotification<inspector.Profiler.ConsoleProfileFinishedEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "HeapProfiler.addHeapSnapshotChunk" */, message: InspectorNotification<inspector.HeapProfiler.AddHeapSnapshotChunkEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "HeapProfiler.reportHeapSnapshotProgress" */, message: InspectorNotification<inspector.HeapProfiler.ReportHeapSnapshotProgressEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "HeapProfiler.lastSeenObjectId" */, message: InspectorNotification<inspector.HeapProfiler.LastSeenObjectIdEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "HeapProfiler.heapStatsUpdate" */, message: InspectorNotification<inspector.HeapProfiler.HeapStatsUpdateEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "NodeTracing.dataCollected" */, message: InspectorNotification<inspector.NodeTracing.DataCollectedEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "NodeWorker.attachedToWorker" */, message: InspectorNotification<inspector.NodeWorker.AttachedToWorkerEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "NodeWorker.detachedFromWorker" */, message: InspectorNotification<inspector.NodeWorker.DetachedFromWorkerEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "NodeWorker.receivedMessageFromWorker" */, message: InspectorNotification<inspector.NodeWorker.ReceivedMessageFromWorkerEventDataType>): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    override fun on(event: String, listener: (args: Array<Any>) -> Unit): Session /* this */
    open fun on(event: String /* "inspectorNotification" */, listener: (message: InspectorNotification<Any>) -> Unit): Session /* this */
    open fun on(event: String /* "Runtime.executionContextCreated" */, listener: (message: InspectorNotification<inspector.Runtime.ExecutionContextCreatedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Runtime.executionContextDestroyed" */, listener: (message: InspectorNotification<inspector.Runtime.ExecutionContextDestroyedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String, listener: () -> Unit): Session /* this */
    open fun on(event: String /* "Runtime.exceptionThrown" */, listener: (message: InspectorNotification<inspector.Runtime.ExceptionThrownEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Runtime.exceptionRevoked" */, listener: (message: InspectorNotification<inspector.Runtime.ExceptionRevokedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Runtime.consoleAPICalled" */, listener: (message: InspectorNotification<inspector.Runtime.ConsoleAPICalledEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Runtime.inspectRequested" */, listener: (message: InspectorNotification<inspector.Runtime.InspectRequestedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Debugger.scriptParsed" */, listener: (message: InspectorNotification<inspector.Debugger.ScriptParsedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Debugger.scriptFailedToParse" */, listener: (message: InspectorNotification<inspector.Debugger.ScriptFailedToParseEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Debugger.breakpointResolved" */, listener: (message: InspectorNotification<inspector.Debugger.BreakpointResolvedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Debugger.paused" */, listener: (message: InspectorNotification<inspector.Debugger.PausedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Console.messageAdded" */, listener: (message: InspectorNotification<inspector.Console.MessageAddedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Profiler.consoleProfileStarted" */, listener: (message: InspectorNotification<inspector.Profiler.ConsoleProfileStartedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Profiler.consoleProfileFinished" */, listener: (message: InspectorNotification<inspector.Profiler.ConsoleProfileFinishedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "HeapProfiler.addHeapSnapshotChunk" */, listener: (message: InspectorNotification<inspector.HeapProfiler.AddHeapSnapshotChunkEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "HeapProfiler.reportHeapSnapshotProgress" */, listener: (message: InspectorNotification<inspector.HeapProfiler.ReportHeapSnapshotProgressEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "HeapProfiler.lastSeenObjectId" */, listener: (message: InspectorNotification<inspector.HeapProfiler.LastSeenObjectIdEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "HeapProfiler.heapStatsUpdate" */, listener: (message: InspectorNotification<inspector.HeapProfiler.HeapStatsUpdateEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "NodeTracing.dataCollected" */, listener: (message: InspectorNotification<inspector.NodeTracing.DataCollectedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "NodeWorker.attachedToWorker" */, listener: (message: InspectorNotification<inspector.NodeWorker.AttachedToWorkerEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "NodeWorker.detachedFromWorker" */, listener: (message: InspectorNotification<inspector.NodeWorker.DetachedFromWorkerEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "NodeWorker.receivedMessageFromWorker" */, listener: (message: InspectorNotification<inspector.NodeWorker.ReceivedMessageFromWorkerEventDataType>) -> Unit): Session /* this */
    override fun once(event: String, listener: (args: Array<Any>) -> Unit): Session /* this */
    open fun once(event: String /* "inspectorNotification" */, listener: (message: InspectorNotification<Any>) -> Unit): Session /* this */
    open fun once(event: String /* "Runtime.executionContextCreated" */, listener: (message: InspectorNotification<inspector.Runtime.ExecutionContextCreatedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Runtime.executionContextDestroyed" */, listener: (message: InspectorNotification<inspector.Runtime.ExecutionContextDestroyedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String, listener: () -> Unit): Session /* this */
    open fun once(event: String /* "Runtime.exceptionThrown" */, listener: (message: InspectorNotification<inspector.Runtime.ExceptionThrownEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Runtime.exceptionRevoked" */, listener: (message: InspectorNotification<inspector.Runtime.ExceptionRevokedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Runtime.consoleAPICalled" */, listener: (message: InspectorNotification<inspector.Runtime.ConsoleAPICalledEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Runtime.inspectRequested" */, listener: (message: InspectorNotification<inspector.Runtime.InspectRequestedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Debugger.scriptParsed" */, listener: (message: InspectorNotification<inspector.Debugger.ScriptParsedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Debugger.scriptFailedToParse" */, listener: (message: InspectorNotification<inspector.Debugger.ScriptFailedToParseEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Debugger.breakpointResolved" */, listener: (message: InspectorNotification<inspector.Debugger.BreakpointResolvedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Debugger.paused" */, listener: (message: InspectorNotification<inspector.Debugger.PausedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Console.messageAdded" */, listener: (message: InspectorNotification<inspector.Console.MessageAddedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Profiler.consoleProfileStarted" */, listener: (message: InspectorNotification<inspector.Profiler.ConsoleProfileStartedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Profiler.consoleProfileFinished" */, listener: (message: InspectorNotification<inspector.Profiler.ConsoleProfileFinishedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "HeapProfiler.addHeapSnapshotChunk" */, listener: (message: InspectorNotification<inspector.HeapProfiler.AddHeapSnapshotChunkEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "HeapProfiler.reportHeapSnapshotProgress" */, listener: (message: InspectorNotification<inspector.HeapProfiler.ReportHeapSnapshotProgressEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "HeapProfiler.lastSeenObjectId" */, listener: (message: InspectorNotification<inspector.HeapProfiler.LastSeenObjectIdEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "HeapProfiler.heapStatsUpdate" */, listener: (message: InspectorNotification<inspector.HeapProfiler.HeapStatsUpdateEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "NodeTracing.dataCollected" */, listener: (message: InspectorNotification<inspector.NodeTracing.DataCollectedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "NodeWorker.attachedToWorker" */, listener: (message: InspectorNotification<inspector.NodeWorker.AttachedToWorkerEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "NodeWorker.detachedFromWorker" */, listener: (message: InspectorNotification<inspector.NodeWorker.DetachedFromWorkerEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "NodeWorker.receivedMessageFromWorker" */, listener: (message: InspectorNotification<inspector.NodeWorker.ReceivedMessageFromWorkerEventDataType>) -> Unit): Session /* this */
    override fun prependListener(event: String, listener: (args: Array<Any>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "inspectorNotification" */, listener: (message: InspectorNotification<Any>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Runtime.executionContextCreated" */, listener: (message: InspectorNotification<inspector.Runtime.ExecutionContextCreatedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Runtime.executionContextDestroyed" */, listener: (message: InspectorNotification<inspector.Runtime.ExecutionContextDestroyedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String, listener: () -> Unit): Session /* this */
    open fun prependListener(event: String /* "Runtime.exceptionThrown" */, listener: (message: InspectorNotification<inspector.Runtime.ExceptionThrownEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Runtime.exceptionRevoked" */, listener: (message: InspectorNotification<inspector.Runtime.ExceptionRevokedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Runtime.consoleAPICalled" */, listener: (message: InspectorNotification<inspector.Runtime.ConsoleAPICalledEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Runtime.inspectRequested" */, listener: (message: InspectorNotification<inspector.Runtime.InspectRequestedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Debugger.scriptParsed" */, listener: (message: InspectorNotification<inspector.Debugger.ScriptParsedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Debugger.scriptFailedToParse" */, listener: (message: InspectorNotification<inspector.Debugger.ScriptFailedToParseEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Debugger.breakpointResolved" */, listener: (message: InspectorNotification<inspector.Debugger.BreakpointResolvedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Debugger.paused" */, listener: (message: InspectorNotification<inspector.Debugger.PausedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Console.messageAdded" */, listener: (message: InspectorNotification<inspector.Console.MessageAddedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Profiler.consoleProfileStarted" */, listener: (message: InspectorNotification<inspector.Profiler.ConsoleProfileStartedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Profiler.consoleProfileFinished" */, listener: (message: InspectorNotification<inspector.Profiler.ConsoleProfileFinishedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "HeapProfiler.addHeapSnapshotChunk" */, listener: (message: InspectorNotification<inspector.HeapProfiler.AddHeapSnapshotChunkEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "HeapProfiler.reportHeapSnapshotProgress" */, listener: (message: InspectorNotification<inspector.HeapProfiler.ReportHeapSnapshotProgressEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "HeapProfiler.lastSeenObjectId" */, listener: (message: InspectorNotification<inspector.HeapProfiler.LastSeenObjectIdEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "HeapProfiler.heapStatsUpdate" */, listener: (message: InspectorNotification<inspector.HeapProfiler.HeapStatsUpdateEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "NodeTracing.dataCollected" */, listener: (message: InspectorNotification<inspector.NodeTracing.DataCollectedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "NodeWorker.attachedToWorker" */, listener: (message: InspectorNotification<inspector.NodeWorker.AttachedToWorkerEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "NodeWorker.detachedFromWorker" */, listener: (message: InspectorNotification<inspector.NodeWorker.DetachedFromWorkerEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "NodeWorker.receivedMessageFromWorker" */, listener: (message: InspectorNotification<inspector.NodeWorker.ReceivedMessageFromWorkerEventDataType>) -> Unit): Session /* this */
    override fun prependOnceListener(event: String, listener: (args: Array<Any>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "inspectorNotification" */, listener: (message: InspectorNotification<Any>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Runtime.executionContextCreated" */, listener: (message: InspectorNotification<inspector.Runtime.ExecutionContextCreatedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Runtime.executionContextDestroyed" */, listener: (message: InspectorNotification<inspector.Runtime.ExecutionContextDestroyedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String, listener: () -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Runtime.exceptionThrown" */, listener: (message: InspectorNotification<inspector.Runtime.ExceptionThrownEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Runtime.exceptionRevoked" */, listener: (message: InspectorNotification<inspector.Runtime.ExceptionRevokedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Runtime.consoleAPICalled" */, listener: (message: InspectorNotification<inspector.Runtime.ConsoleAPICalledEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Runtime.inspectRequested" */, listener: (message: InspectorNotification<inspector.Runtime.InspectRequestedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Debugger.scriptParsed" */, listener: (message: InspectorNotification<inspector.Debugger.ScriptParsedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Debugger.scriptFailedToParse" */, listener: (message: InspectorNotification<inspector.Debugger.ScriptFailedToParseEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Debugger.breakpointResolved" */, listener: (message: InspectorNotification<inspector.Debugger.BreakpointResolvedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Debugger.paused" */, listener: (message: InspectorNotification<inspector.Debugger.PausedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Console.messageAdded" */, listener: (message: InspectorNotification<inspector.Console.MessageAddedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Profiler.consoleProfileStarted" */, listener: (message: InspectorNotification<inspector.Profiler.ConsoleProfileStartedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Profiler.consoleProfileFinished" */, listener: (message: InspectorNotification<inspector.Profiler.ConsoleProfileFinishedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "HeapProfiler.addHeapSnapshotChunk" */, listener: (message: InspectorNotification<inspector.HeapProfiler.AddHeapSnapshotChunkEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "HeapProfiler.reportHeapSnapshotProgress" */, listener: (message: InspectorNotification<inspector.HeapProfiler.ReportHeapSnapshotProgressEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "HeapProfiler.lastSeenObjectId" */, listener: (message: InspectorNotification<inspector.HeapProfiler.LastSeenObjectIdEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "HeapProfiler.heapStatsUpdate" */, listener: (message: InspectorNotification<inspector.HeapProfiler.HeapStatsUpdateEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "NodeTracing.dataCollected" */, listener: (message: InspectorNotification<inspector.NodeTracing.DataCollectedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "NodeWorker.attachedToWorker" */, listener: (message: InspectorNotification<inspector.NodeWorker.AttachedToWorkerEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "NodeWorker.detachedFromWorker" */, listener: (message: InspectorNotification<inspector.NodeWorker.DetachedFromWorkerEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "NodeWorker.receivedMessageFromWorker" */, listener: (message: InspectorNotification<inspector.NodeWorker.ReceivedMessageFromWorkerEventDataType>) -> Unit): Session /* this */
}

external fun open(port: Number = definedExternally, host: String = definedExternally, wait: Boolean = definedExternally)

external fun close()

external fun url(): String?