@file:JsModule("inspector")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
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
import inspector.Schema.GetDomainsReturnType
import inspector.Runtime.EvaluateParameterType
import inspector.Runtime.EvaluateReturnType
import inspector.Runtime.AwaitPromiseParameterType
import inspector.Runtime.AwaitPromiseReturnType
import inspector.Runtime.CallFunctionOnParameterType
import inspector.Runtime.CallFunctionOnReturnType
import inspector.Runtime.GetPropertiesParameterType
import inspector.Runtime.GetPropertiesReturnType
import inspector.Runtime.ReleaseObjectParameterType
import inspector.Runtime.ReleaseObjectGroupParameterType
import inspector.Runtime.SetCustomObjectFormatterEnabledParameterType
import inspector.Runtime.CompileScriptParameterType
import inspector.Runtime.CompileScriptReturnType
import inspector.Runtime.RunScriptParameterType
import inspector.Runtime.RunScriptReturnType
import inspector.Runtime.QueryObjectsParameterType
import inspector.Runtime.QueryObjectsReturnType
import inspector.Runtime.GlobalLexicalScopeNamesParameterType
import inspector.Runtime.GlobalLexicalScopeNamesReturnType
import inspector.Debugger.EnableReturnType
import inspector.Debugger.SetBreakpointsActiveParameterType
import inspector.Debugger.SetSkipAllPausesParameterType
import inspector.Debugger.SetBreakpointByUrlParameterType
import inspector.Debugger.SetBreakpointByUrlReturnType
import inspector.Debugger.SetBreakpointParameterType
import inspector.Debugger.SetBreakpointReturnType
import inspector.Debugger.RemoveBreakpointParameterType
import inspector.Debugger.GetPossibleBreakpointsParameterType
import inspector.Debugger.GetPossibleBreakpointsReturnType
import inspector.Debugger.ContinueToLocationParameterType
import inspector.Debugger.PauseOnAsyncCallParameterType
import inspector.Debugger.StepIntoParameterType
import inspector.Debugger.GetStackTraceParameterType
import inspector.Debugger.GetStackTraceReturnType
import inspector.Debugger.SearchInContentParameterType
import inspector.Debugger.SearchInContentReturnType
import inspector.Debugger.SetScriptSourceParameterType
import inspector.Debugger.SetScriptSourceReturnType
import inspector.Debugger.RestartFrameParameterType
import inspector.Debugger.RestartFrameReturnType
import inspector.Debugger.GetScriptSourceParameterType
import inspector.Debugger.GetScriptSourceReturnType
import inspector.Debugger.SetPauseOnExceptionsParameterType
import inspector.Debugger.EvaluateOnCallFrameParameterType
import inspector.Debugger.EvaluateOnCallFrameReturnType
import inspector.Debugger.SetVariableValueParameterType
import inspector.Debugger.SetReturnValueParameterType
import inspector.Debugger.SetAsyncCallStackDepthParameterType
import inspector.Debugger.SetBlackboxPatternsParameterType
import inspector.Debugger.SetBlackboxedRangesParameterType
import inspector.Profiler.SetSamplingIntervalParameterType
import inspector.Profiler.StopReturnType
import inspector.Profiler.StartPreciseCoverageParameterType
import inspector.Profiler.TakePreciseCoverageReturnType
import inspector.Profiler.GetBestEffortCoverageReturnType
import inspector.Profiler.TakeTypeProfileReturnType
import inspector.HeapProfiler.StartTrackingHeapObjectsParameterType
import inspector.HeapProfiler.StopTrackingHeapObjectsParameterType
import inspector.HeapProfiler.TakeHeapSnapshotParameterType
import inspector.HeapProfiler.GetObjectByHeapObjectIdParameterType
import inspector.HeapProfiler.GetObjectByHeapObjectIdReturnType
import inspector.HeapProfiler.AddInspectedHeapObjectParameterType
import inspector.HeapProfiler.GetHeapObjectIdParameterType
import inspector.HeapProfiler.GetHeapObjectIdReturnType
import inspector.HeapProfiler.StartSamplingParameterType
import inspector.HeapProfiler.StopSamplingReturnType
import inspector.HeapProfiler.GetSamplingProfileReturnType
import inspector.NodeTracing.GetCategoriesReturnType
import inspector.NodeTracing.StartParameterType
import inspector.NodeWorker.SendMessageToWorkerParameterType
import inspector.NodeWorker.EnableParameterType
import inspector.NodeWorker.DetachParameterType
import inspector.NodeRuntime.NotifyWhenWaitingForDisconnectParameterType
import inspector.Runtime.ExecutionContextCreatedEventDataType
import inspector.Runtime.ExecutionContextDestroyedEventDataType
import inspector.Runtime.ExceptionThrownEventDataType
import inspector.Runtime.ExceptionRevokedEventDataType
import inspector.Runtime.ConsoleAPICalledEventDataType
import inspector.Runtime.InspectRequestedEventDataType
import inspector.Debugger.ScriptParsedEventDataType
import inspector.Debugger.ScriptFailedToParseEventDataType
import inspector.Debugger.BreakpointResolvedEventDataType
import inspector.Debugger.PausedEventDataType
import inspector.Console.MessageAddedEventDataType
import inspector.Profiler.ConsoleProfileStartedEventDataType
import inspector.Profiler.ConsoleProfileFinishedEventDataType
import inspector.HeapProfiler.AddHeapSnapshotChunkEventDataType
import inspector.HeapProfiler.ReportHeapSnapshotProgressEventDataType
import inspector.HeapProfiler.LastSeenObjectIdEventDataType
import inspector.HeapProfiler.HeapStatsUpdateEventDataType
import inspector.NodeTracing.DataCollectedEventDataType
import inspector.NodeWorker.AttachedToWorkerEventDataType
import inspector.NodeWorker.DetachedFromWorkerEventDataType
import inspector.NodeWorker.ReceivedMessageFromWorkerEventDataType
import events.EventEmitter.EventEmitter

external open class Session : EventEmitter {
    open fun connect()
    open fun disconnect()
    open fun post(method: String, params: Any = definedExternally, callback: (err: Error?, params: Any) -> Unit = definedExternally)
    open fun post(method: String, callback: (err: Error?, params: Any) -> Unit = definedExternally)
    open fun post(method: String /* "Schema.getDomains" */, callback: (err: Error?, params: GetDomainsReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.evaluate" */, params: EvaluateParameterType = definedExternally, callback: (err: Error?, params: EvaluateReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.evaluate" */, callback: (err: Error?, params: EvaluateReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.awaitPromise" */, params: AwaitPromiseParameterType = definedExternally, callback: (err: Error?, params: AwaitPromiseReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.awaitPromise" */, callback: (err: Error?, params: AwaitPromiseReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.callFunctionOn" */, params: CallFunctionOnParameterType = definedExternally, callback: (err: Error?, params: CallFunctionOnReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.callFunctionOn" */, callback: (err: Error?, params: CallFunctionOnReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.getProperties" */, params: GetPropertiesParameterType = definedExternally, callback: (err: Error?, params: GetPropertiesReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.getProperties" */, callback: (err: Error?, params: GetPropertiesReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.releaseObject" */, params: ReleaseObjectParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.releaseObject" | "Runtime.releaseObjectGroup" | "Runtime.runIfWaitingForDebugger" | "Runtime.enable" | "Runtime.disable" | "Runtime.discardConsoleEntries" | "Runtime.setCustomObjectFormatterEnabled" | "Debugger.disable" | "Debugger.setBreakpointsActive" | "Debugger.setSkipAllPauses" | "Debugger.removeBreakpoint" | "Debugger.continueToLocation" | "Debugger.pauseOnAsyncCall" | "Debugger.stepOver" | "Debugger.stepInto" | "Debugger.stepOut" | "Debugger.pause" | "Debugger.scheduleStepIntoAsync" | "Debugger.resume" | "Debugger.setPauseOnExceptions" | "Debugger.setVariableValue" | "Debugger.setReturnValue" | "Debugger.setAsyncCallStackDepth" | "Debugger.setBlackboxPatterns" | "Debugger.setBlackboxedRanges" | "Console.enable" | "Console.disable" | "Console.clearMessages" | "Profiler.enable" | "Profiler.disable" | "Profiler.setSamplingInterval" | "Profiler.start" | "Profiler.startPreciseCoverage" | "Profiler.stopPreciseCoverage" | "Profiler.startTypeProfile" | "Profiler.stopTypeProfile" | "HeapProfiler.enable" | "HeapProfiler.disable" | "HeapProfiler.startTrackingHeapObjects" | "HeapProfiler.stopTrackingHeapObjects" | "HeapProfiler.takeHeapSnapshot" | "HeapProfiler.collectGarbage" | "HeapProfiler.addInspectedHeapObject" | "HeapProfiler.startSampling" | "NodeTracing.start" | "NodeTracing.stop" | "NodeWorker.sendMessageToWorker" | "NodeWorker.enable" | "NodeWorker.disable" | "NodeWorker.detach" | "NodeRuntime.notifyWhenWaitingForDisconnect" */, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.releaseObjectGroup" */, params: ReleaseObjectGroupParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.setCustomObjectFormatterEnabled" */, params: SetCustomObjectFormatterEnabledParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.compileScript" */, params: CompileScriptParameterType = definedExternally, callback: (err: Error?, params: CompileScriptReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.compileScript" */, callback: (err: Error?, params: CompileScriptReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.runScript" */, params: RunScriptParameterType = definedExternally, callback: (err: Error?, params: RunScriptReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.runScript" */, callback: (err: Error?, params: RunScriptReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.queryObjects" */, params: QueryObjectsParameterType = definedExternally, callback: (err: Error?, params: QueryObjectsReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.queryObjects" */, callback: (err: Error?, params: QueryObjectsReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.globalLexicalScopeNames" */, params: GlobalLexicalScopeNamesParameterType = definedExternally, callback: (err: Error?, params: GlobalLexicalScopeNamesReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Runtime.globalLexicalScopeNames" */, callback: (err: Error?, params: GlobalLexicalScopeNamesReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.enable" */, callback: (err: Error?, params: EnableReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setBreakpointsActive" */, params: SetBreakpointsActiveParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setSkipAllPauses" */, params: SetSkipAllPausesParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setBreakpointByUrl" */, params: SetBreakpointByUrlParameterType = definedExternally, callback: (err: Error?, params: SetBreakpointByUrlReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setBreakpointByUrl" */, callback: (err: Error?, params: SetBreakpointByUrlReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setBreakpoint" */, params: SetBreakpointParameterType = definedExternally, callback: (err: Error?, params: SetBreakpointReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setBreakpoint" */, callback: (err: Error?, params: SetBreakpointReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.removeBreakpoint" */, params: RemoveBreakpointParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.getPossibleBreakpoints" */, params: GetPossibleBreakpointsParameterType = definedExternally, callback: (err: Error?, params: GetPossibleBreakpointsReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.getPossibleBreakpoints" */, callback: (err: Error?, params: GetPossibleBreakpointsReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.continueToLocation" */, params: ContinueToLocationParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.pauseOnAsyncCall" */, params: PauseOnAsyncCallParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.stepInto" */, params: StepIntoParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.getStackTrace" */, params: GetStackTraceParameterType = definedExternally, callback: (err: Error?, params: GetStackTraceReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.getStackTrace" */, callback: (err: Error?, params: GetStackTraceReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.searchInContent" */, params: SearchInContentParameterType = definedExternally, callback: (err: Error?, params: SearchInContentReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.searchInContent" */, callback: (err: Error?, params: SearchInContentReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setScriptSource" */, params: SetScriptSourceParameterType = definedExternally, callback: (err: Error?, params: SetScriptSourceReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setScriptSource" */, callback: (err: Error?, params: SetScriptSourceReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.restartFrame" */, params: RestartFrameParameterType = definedExternally, callback: (err: Error?, params: RestartFrameReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.restartFrame" */, callback: (err: Error?, params: RestartFrameReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.getScriptSource" */, params: GetScriptSourceParameterType = definedExternally, callback: (err: Error?, params: GetScriptSourceReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.getScriptSource" */, callback: (err: Error?, params: GetScriptSourceReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setPauseOnExceptions" */, params: SetPauseOnExceptionsParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.evaluateOnCallFrame" */, params: EvaluateOnCallFrameParameterType = definedExternally, callback: (err: Error?, params: EvaluateOnCallFrameReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.evaluateOnCallFrame" */, callback: (err: Error?, params: EvaluateOnCallFrameReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setVariableValue" */, params: SetVariableValueParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setReturnValue" */, params: SetReturnValueParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setAsyncCallStackDepth" */, params: SetAsyncCallStackDepthParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setBlackboxPatterns" */, params: SetBlackboxPatternsParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Debugger.setBlackboxedRanges" */, params: SetBlackboxedRangesParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Profiler.setSamplingInterval" */, params: SetSamplingIntervalParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Profiler.stop" */, callback: (err: Error?, params: StopReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Profiler.startPreciseCoverage" */, params: StartPreciseCoverageParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "Profiler.takePreciseCoverage" */, callback: (err: Error?, params: TakePreciseCoverageReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Profiler.getBestEffortCoverage" */, callback: (err: Error?, params: GetBestEffortCoverageReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "Profiler.takeTypeProfile" */, callback: (err: Error?, params: TakeTypeProfileReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.startTrackingHeapObjects" */, params: StartTrackingHeapObjectsParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.stopTrackingHeapObjects" */, params: StopTrackingHeapObjectsParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.takeHeapSnapshot" */, params: TakeHeapSnapshotParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.getObjectByHeapObjectId" */, params: GetObjectByHeapObjectIdParameterType = definedExternally, callback: (err: Error?, params: GetObjectByHeapObjectIdReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.getObjectByHeapObjectId" */, callback: (err: Error?, params: GetObjectByHeapObjectIdReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.addInspectedHeapObject" */, params: AddInspectedHeapObjectParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.getHeapObjectId" */, params: GetHeapObjectIdParameterType = definedExternally, callback: (err: Error?, params: GetHeapObjectIdReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.getHeapObjectId" */, callback: (err: Error?, params: GetHeapObjectIdReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.startSampling" */, params: StartSamplingParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.stopSampling" */, callback: (err: Error?, params: StopSamplingReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "HeapProfiler.getSamplingProfile" */, callback: (err: Error?, params: GetSamplingProfileReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "NodeTracing.getCategories" */, callback: (err: Error?, params: GetCategoriesReturnType) -> Unit = definedExternally)
    open fun post(method: String /* "NodeTracing.start" */, params: StartParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "NodeWorker.sendMessageToWorker" */, params: SendMessageToWorkerParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "NodeWorker.enable" */, params: EnableParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "NodeWorker.detach" */, params: DetachParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    open fun post(method: String /* "NodeRuntime.notifyWhenWaitingForDisconnect" */, params: NotifyWhenWaitingForDisconnectParameterType = definedExternally, callback: (err: Error?) -> Unit = definedExternally)
    override fun addListener(event: String, listener: (args: Any) -> Unit): Session /* this */
    open fun addListener(event: String /* "inspectorNotification" */, listener: (message: InspectorNotification<Any>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Runtime.executionContextCreated" */, listener: (message: InspectorNotification<ExecutionContextCreatedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Runtime.executionContextDestroyed" */, listener: (message: InspectorNotification<ExecutionContextDestroyedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Runtime.executionContextsCleared" | "Debugger.resumed" | "HeapProfiler.resetProfiles" | "NodeTracing.tracingComplete" | "NodeRuntime.waitingForDisconnect" */, listener: () -> Unit): Session /* this */
    open fun addListener(event: String /* "Runtime.exceptionThrown" */, listener: (message: InspectorNotification<ExceptionThrownEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Runtime.exceptionRevoked" */, listener: (message: InspectorNotification<ExceptionRevokedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Runtime.consoleAPICalled" */, listener: (message: InspectorNotification<ConsoleAPICalledEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Runtime.inspectRequested" */, listener: (message: InspectorNotification<InspectRequestedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Debugger.scriptParsed" */, listener: (message: InspectorNotification<ScriptParsedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Debugger.scriptFailedToParse" */, listener: (message: InspectorNotification<ScriptFailedToParseEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Debugger.breakpointResolved" */, listener: (message: InspectorNotification<BreakpointResolvedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Debugger.paused" */, listener: (message: InspectorNotification<PausedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Console.messageAdded" */, listener: (message: InspectorNotification<MessageAddedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Profiler.consoleProfileStarted" */, listener: (message: InspectorNotification<ConsoleProfileStartedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "Profiler.consoleProfileFinished" */, listener: (message: InspectorNotification<ConsoleProfileFinishedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "HeapProfiler.addHeapSnapshotChunk" */, listener: (message: InspectorNotification<AddHeapSnapshotChunkEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "HeapProfiler.reportHeapSnapshotProgress" */, listener: (message: InspectorNotification<ReportHeapSnapshotProgressEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "HeapProfiler.lastSeenObjectId" */, listener: (message: InspectorNotification<LastSeenObjectIdEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "HeapProfiler.heapStatsUpdate" */, listener: (message: InspectorNotification<HeapStatsUpdateEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "NodeTracing.dataCollected" */, listener: (message: InspectorNotification<DataCollectedEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "NodeWorker.attachedToWorker" */, listener: (message: InspectorNotification<AttachedToWorkerEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "NodeWorker.detachedFromWorker" */, listener: (message: InspectorNotification<DetachedFromWorkerEventDataType>) -> Unit): Session /* this */
    open fun addListener(event: String /* "NodeWorker.receivedMessageFromWorker" */, listener: (message: InspectorNotification<ReceivedMessageFromWorkerEventDataType>) -> Unit): Session /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "inspectorNotification" */, message: InspectorNotification<Any>): Boolean
    open fun emit(event: String /* "Runtime.executionContextCreated" */, message: InspectorNotification<ExecutionContextCreatedEventDataType>): Boolean
    open fun emit(event: String /* "Runtime.executionContextDestroyed" */, message: InspectorNotification<ExecutionContextDestroyedEventDataType>): Boolean
    open fun emit(event: String /* "Runtime.executionContextsCleared" | "Debugger.resumed" | "HeapProfiler.resetProfiles" | "NodeTracing.tracingComplete" | "NodeRuntime.waitingForDisconnect" */): Boolean
    open fun emit(event: String /* "Runtime.exceptionThrown" */, message: InspectorNotification<ExceptionThrownEventDataType>): Boolean
    open fun emit(event: String /* "Runtime.exceptionRevoked" */, message: InspectorNotification<ExceptionRevokedEventDataType>): Boolean
    open fun emit(event: String /* "Runtime.consoleAPICalled" */, message: InspectorNotification<ConsoleAPICalledEventDataType>): Boolean
    open fun emit(event: String /* "Runtime.inspectRequested" */, message: InspectorNotification<InspectRequestedEventDataType>): Boolean
    open fun emit(event: String /* "Debugger.scriptParsed" */, message: InspectorNotification<ScriptParsedEventDataType>): Boolean
    open fun emit(event: String /* "Debugger.scriptFailedToParse" */, message: InspectorNotification<ScriptFailedToParseEventDataType>): Boolean
    open fun emit(event: String /* "Debugger.breakpointResolved" */, message: InspectorNotification<BreakpointResolvedEventDataType>): Boolean
    open fun emit(event: String /* "Debugger.paused" */, message: InspectorNotification<PausedEventDataType>): Boolean
    open fun emit(event: String /* "Console.messageAdded" */, message: InspectorNotification<MessageAddedEventDataType>): Boolean
    open fun emit(event: String /* "Profiler.consoleProfileStarted" */, message: InspectorNotification<ConsoleProfileStartedEventDataType>): Boolean
    open fun emit(event: String /* "Profiler.consoleProfileFinished" */, message: InspectorNotification<ConsoleProfileFinishedEventDataType>): Boolean
    open fun emit(event: String /* "HeapProfiler.addHeapSnapshotChunk" */, message: InspectorNotification<AddHeapSnapshotChunkEventDataType>): Boolean
    open fun emit(event: String /* "HeapProfiler.reportHeapSnapshotProgress" */, message: InspectorNotification<ReportHeapSnapshotProgressEventDataType>): Boolean
    open fun emit(event: String /* "HeapProfiler.lastSeenObjectId" */, message: InspectorNotification<LastSeenObjectIdEventDataType>): Boolean
    open fun emit(event: String /* "HeapProfiler.heapStatsUpdate" */, message: InspectorNotification<HeapStatsUpdateEventDataType>): Boolean
    open fun emit(event: String /* "NodeTracing.dataCollected" */, message: InspectorNotification<DataCollectedEventDataType>): Boolean
    open fun emit(event: String /* "NodeWorker.attachedToWorker" */, message: InspectorNotification<AttachedToWorkerEventDataType>): Boolean
    open fun emit(event: String /* "NodeWorker.detachedFromWorker" */, message: InspectorNotification<DetachedFromWorkerEventDataType>): Boolean
    open fun emit(event: String /* "NodeWorker.receivedMessageFromWorker" */, message: InspectorNotification<ReceivedMessageFromWorkerEventDataType>): Boolean
    override fun on(event: String, listener: (args: Any) -> Unit): Session /* this */
    open fun on(event: String /* "inspectorNotification" */, listener: (message: InspectorNotification<Any>) -> Unit): Session /* this */
    open fun on(event: String /* "Runtime.executionContextCreated" */, listener: (message: InspectorNotification<ExecutionContextCreatedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Runtime.executionContextDestroyed" */, listener: (message: InspectorNotification<ExecutionContextDestroyedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Runtime.executionContextsCleared" | "Debugger.resumed" | "HeapProfiler.resetProfiles" | "NodeTracing.tracingComplete" | "NodeRuntime.waitingForDisconnect" */, listener: () -> Unit): Session /* this */
    open fun on(event: String /* "Runtime.exceptionThrown" */, listener: (message: InspectorNotification<ExceptionThrownEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Runtime.exceptionRevoked" */, listener: (message: InspectorNotification<ExceptionRevokedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Runtime.consoleAPICalled" */, listener: (message: InspectorNotification<ConsoleAPICalledEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Runtime.inspectRequested" */, listener: (message: InspectorNotification<InspectRequestedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Debugger.scriptParsed" */, listener: (message: InspectorNotification<ScriptParsedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Debugger.scriptFailedToParse" */, listener: (message: InspectorNotification<ScriptFailedToParseEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Debugger.breakpointResolved" */, listener: (message: InspectorNotification<BreakpointResolvedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Debugger.paused" */, listener: (message: InspectorNotification<PausedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Console.messageAdded" */, listener: (message: InspectorNotification<MessageAddedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Profiler.consoleProfileStarted" */, listener: (message: InspectorNotification<ConsoleProfileStartedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "Profiler.consoleProfileFinished" */, listener: (message: InspectorNotification<ConsoleProfileFinishedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "HeapProfiler.addHeapSnapshotChunk" */, listener: (message: InspectorNotification<AddHeapSnapshotChunkEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "HeapProfiler.reportHeapSnapshotProgress" */, listener: (message: InspectorNotification<ReportHeapSnapshotProgressEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "HeapProfiler.lastSeenObjectId" */, listener: (message: InspectorNotification<LastSeenObjectIdEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "HeapProfiler.heapStatsUpdate" */, listener: (message: InspectorNotification<HeapStatsUpdateEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "NodeTracing.dataCollected" */, listener: (message: InspectorNotification<DataCollectedEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "NodeWorker.attachedToWorker" */, listener: (message: InspectorNotification<AttachedToWorkerEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "NodeWorker.detachedFromWorker" */, listener: (message: InspectorNotification<DetachedFromWorkerEventDataType>) -> Unit): Session /* this */
    open fun on(event: String /* "NodeWorker.receivedMessageFromWorker" */, listener: (message: InspectorNotification<ReceivedMessageFromWorkerEventDataType>) -> Unit): Session /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Session /* this */
    open fun once(event: String /* "inspectorNotification" */, listener: (message: InspectorNotification<Any>) -> Unit): Session /* this */
    open fun once(event: String /* "Runtime.executionContextCreated" */, listener: (message: InspectorNotification<ExecutionContextCreatedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Runtime.executionContextDestroyed" */, listener: (message: InspectorNotification<ExecutionContextDestroyedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Runtime.executionContextsCleared" | "Debugger.resumed" | "HeapProfiler.resetProfiles" | "NodeTracing.tracingComplete" | "NodeRuntime.waitingForDisconnect" */, listener: () -> Unit): Session /* this */
    open fun once(event: String /* "Runtime.exceptionThrown" */, listener: (message: InspectorNotification<ExceptionThrownEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Runtime.exceptionRevoked" */, listener: (message: InspectorNotification<ExceptionRevokedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Runtime.consoleAPICalled" */, listener: (message: InspectorNotification<ConsoleAPICalledEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Runtime.inspectRequested" */, listener: (message: InspectorNotification<InspectRequestedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Debugger.scriptParsed" */, listener: (message: InspectorNotification<ScriptParsedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Debugger.scriptFailedToParse" */, listener: (message: InspectorNotification<ScriptFailedToParseEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Debugger.breakpointResolved" */, listener: (message: InspectorNotification<BreakpointResolvedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Debugger.paused" */, listener: (message: InspectorNotification<PausedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Console.messageAdded" */, listener: (message: InspectorNotification<MessageAddedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Profiler.consoleProfileStarted" */, listener: (message: InspectorNotification<ConsoleProfileStartedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "Profiler.consoleProfileFinished" */, listener: (message: InspectorNotification<ConsoleProfileFinishedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "HeapProfiler.addHeapSnapshotChunk" */, listener: (message: InspectorNotification<AddHeapSnapshotChunkEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "HeapProfiler.reportHeapSnapshotProgress" */, listener: (message: InspectorNotification<ReportHeapSnapshotProgressEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "HeapProfiler.lastSeenObjectId" */, listener: (message: InspectorNotification<LastSeenObjectIdEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "HeapProfiler.heapStatsUpdate" */, listener: (message: InspectorNotification<HeapStatsUpdateEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "NodeTracing.dataCollected" */, listener: (message: InspectorNotification<DataCollectedEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "NodeWorker.attachedToWorker" */, listener: (message: InspectorNotification<AttachedToWorkerEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "NodeWorker.detachedFromWorker" */, listener: (message: InspectorNotification<DetachedFromWorkerEventDataType>) -> Unit): Session /* this */
    open fun once(event: String /* "NodeWorker.receivedMessageFromWorker" */, listener: (message: InspectorNotification<ReceivedMessageFromWorkerEventDataType>) -> Unit): Session /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): Session /* this */
    open fun prependListener(event: String /* "inspectorNotification" */, listener: (message: InspectorNotification<Any>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Runtime.executionContextCreated" */, listener: (message: InspectorNotification<ExecutionContextCreatedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Runtime.executionContextDestroyed" */, listener: (message: InspectorNotification<ExecutionContextDestroyedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Runtime.executionContextsCleared" | "Debugger.resumed" | "HeapProfiler.resetProfiles" | "NodeTracing.tracingComplete" | "NodeRuntime.waitingForDisconnect" */, listener: () -> Unit): Session /* this */
    open fun prependListener(event: String /* "Runtime.exceptionThrown" */, listener: (message: InspectorNotification<ExceptionThrownEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Runtime.exceptionRevoked" */, listener: (message: InspectorNotification<ExceptionRevokedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Runtime.consoleAPICalled" */, listener: (message: InspectorNotification<ConsoleAPICalledEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Runtime.inspectRequested" */, listener: (message: InspectorNotification<InspectRequestedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Debugger.scriptParsed" */, listener: (message: InspectorNotification<ScriptParsedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Debugger.scriptFailedToParse" */, listener: (message: InspectorNotification<ScriptFailedToParseEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Debugger.breakpointResolved" */, listener: (message: InspectorNotification<BreakpointResolvedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Debugger.paused" */, listener: (message: InspectorNotification<PausedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Console.messageAdded" */, listener: (message: InspectorNotification<MessageAddedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Profiler.consoleProfileStarted" */, listener: (message: InspectorNotification<ConsoleProfileStartedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "Profiler.consoleProfileFinished" */, listener: (message: InspectorNotification<ConsoleProfileFinishedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "HeapProfiler.addHeapSnapshotChunk" */, listener: (message: InspectorNotification<AddHeapSnapshotChunkEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "HeapProfiler.reportHeapSnapshotProgress" */, listener: (message: InspectorNotification<ReportHeapSnapshotProgressEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "HeapProfiler.lastSeenObjectId" */, listener: (message: InspectorNotification<LastSeenObjectIdEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "HeapProfiler.heapStatsUpdate" */, listener: (message: InspectorNotification<HeapStatsUpdateEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "NodeTracing.dataCollected" */, listener: (message: InspectorNotification<DataCollectedEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "NodeWorker.attachedToWorker" */, listener: (message: InspectorNotification<AttachedToWorkerEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "NodeWorker.detachedFromWorker" */, listener: (message: InspectorNotification<DetachedFromWorkerEventDataType>) -> Unit): Session /* this */
    open fun prependListener(event: String /* "NodeWorker.receivedMessageFromWorker" */, listener: (message: InspectorNotification<ReceivedMessageFromWorkerEventDataType>) -> Unit): Session /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "inspectorNotification" */, listener: (message: InspectorNotification<Any>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Runtime.executionContextCreated" */, listener: (message: InspectorNotification<ExecutionContextCreatedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Runtime.executionContextDestroyed" */, listener: (message: InspectorNotification<ExecutionContextDestroyedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Runtime.executionContextsCleared" | "Debugger.resumed" | "HeapProfiler.resetProfiles" | "NodeTracing.tracingComplete" | "NodeRuntime.waitingForDisconnect" */, listener: () -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Runtime.exceptionThrown" */, listener: (message: InspectorNotification<ExceptionThrownEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Runtime.exceptionRevoked" */, listener: (message: InspectorNotification<ExceptionRevokedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Runtime.consoleAPICalled" */, listener: (message: InspectorNotification<ConsoleAPICalledEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Runtime.inspectRequested" */, listener: (message: InspectorNotification<InspectRequestedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Debugger.scriptParsed" */, listener: (message: InspectorNotification<ScriptParsedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Debugger.scriptFailedToParse" */, listener: (message: InspectorNotification<ScriptFailedToParseEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Debugger.breakpointResolved" */, listener: (message: InspectorNotification<BreakpointResolvedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Debugger.paused" */, listener: (message: InspectorNotification<PausedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Console.messageAdded" */, listener: (message: InspectorNotification<MessageAddedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Profiler.consoleProfileStarted" */, listener: (message: InspectorNotification<ConsoleProfileStartedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "Profiler.consoleProfileFinished" */, listener: (message: InspectorNotification<ConsoleProfileFinishedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "HeapProfiler.addHeapSnapshotChunk" */, listener: (message: InspectorNotification<AddHeapSnapshotChunkEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "HeapProfiler.reportHeapSnapshotProgress" */, listener: (message: InspectorNotification<ReportHeapSnapshotProgressEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "HeapProfiler.lastSeenObjectId" */, listener: (message: InspectorNotification<LastSeenObjectIdEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "HeapProfiler.heapStatsUpdate" */, listener: (message: InspectorNotification<HeapStatsUpdateEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "NodeTracing.dataCollected" */, listener: (message: InspectorNotification<DataCollectedEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "NodeWorker.attachedToWorker" */, listener: (message: InspectorNotification<AttachedToWorkerEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "NodeWorker.detachedFromWorker" */, listener: (message: InspectorNotification<DetachedFromWorkerEventDataType>) -> Unit): Session /* this */
    open fun prependOnceListener(event: String /* "NodeWorker.receivedMessageFromWorker" */, listener: (message: InspectorNotification<ReceivedMessageFromWorkerEventDataType>) -> Unit): Session /* this */
}

external fun open(port: Number = definedExternally, host: String = definedExternally, wait: Boolean = definedExternally)

external fun close()

external fun url(): String?