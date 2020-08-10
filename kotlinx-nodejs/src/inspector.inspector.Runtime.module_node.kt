@file:JsQualifier("inspector.Runtime")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package inspector.Runtime

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

external interface RemoteObject {
    var type: String
    var subtype: String?
        get() = definedExternally
        set(value) = definedExternally
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: Any?
        get() = definedExternally
        set(value) = definedExternally
    var unserializableValue: UnserializableValue?
        get() = definedExternally
        set(value) = definedExternally
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var objectId: RemoteObjectId?
        get() = definedExternally
        set(value) = definedExternally
    var preview: ObjectPreview?
        get() = definedExternally
        set(value) = definedExternally
    var customPreview: CustomPreview?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomPreview {
    var header: String
    var hasBody: Boolean
    var formatterObjectId: RemoteObjectId
    var bindRemoteObjectFunctionId: RemoteObjectId
    var configObjectId: RemoteObjectId?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ObjectPreview {
    var type: String
    var subtype: String?
        get() = definedExternally
        set(value) = definedExternally
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var overflow: Boolean
    var properties: Array<PropertyPreview>
    var entries: Array<EntryPreview>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PropertyPreview {
    var name: String
    var type: String
    var value: String?
        get() = definedExternally
        set(value) = definedExternally
    var valuePreview: ObjectPreview?
        get() = definedExternally
        set(value) = definedExternally
    var subtype: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EntryPreview {
    var key: ObjectPreview?
        get() = definedExternally
        set(value) = definedExternally
    var value: ObjectPreview
}

external interface PropertyDescriptor {
    var name: String
    var value: RemoteObject?
        get() = definedExternally
        set(value) = definedExternally
    var writable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var get: RemoteObject?
        get() = definedExternally
        set(value) = definedExternally
    var set: RemoteObject?
        get() = definedExternally
        set(value) = definedExternally
    var configurable: Boolean
    var enumerable: Boolean
    var wasThrown: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isOwn: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var symbol: RemoteObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface InternalPropertyDescriptor {
    var name: String
    var value: RemoteObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CallArgument {
    var value: Any?
        get() = definedExternally
        set(value) = definedExternally
    var unserializableValue: UnserializableValue?
        get() = definedExternally
        set(value) = definedExternally
    var objectId: RemoteObjectId?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExecutionContextDescription {
    var id: ExecutionContextId
    var origin: String
    var name: String
    var auxData: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExceptionDetails {
    var exceptionId: Number
    var text: String
    var lineNumber: Number
    var columnNumber: Number
    var scriptId: ScriptId?
        get() = definedExternally
        set(value) = definedExternally
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var stackTrace: StackTrace?
        get() = definedExternally
        set(value) = definedExternally
    var exception: RemoteObject?
        get() = definedExternally
        set(value) = definedExternally
    var executionContextId: ExecutionContextId?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CallFrame {
    var functionName: String
    var scriptId: ScriptId
    var url: String
    var lineNumber: Number
    var columnNumber: Number
}

external interface StackTrace {
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var callFrames: Array<CallFrame>
    var parent: StackTrace?
        get() = definedExternally
        set(value) = definedExternally
    var parentId: StackTraceId?
        get() = definedExternally
        set(value) = definedExternally
}

external interface StackTraceId {
    var id: String
    var debuggerId: UniqueDebuggerId?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EvaluateParameterType {
    var expression: String
    var objectGroup: String?
        get() = definedExternally
        set(value) = definedExternally
    var includeCommandLineAPI: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var contextId: ExecutionContextId?
        get() = definedExternally
        set(value) = definedExternally
    var returnByValue: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var generatePreview: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var userGesture: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var awaitPromise: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AwaitPromiseParameterType {
    var promiseObjectId: RemoteObjectId
    var returnByValue: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var generatePreview: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CallFunctionOnParameterType {
    var functionDeclaration: String
    var objectId: RemoteObjectId?
        get() = definedExternally
        set(value) = definedExternally
    var arguments: Array<CallArgument>?
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var returnByValue: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var generatePreview: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var userGesture: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var awaitPromise: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var executionContextId: ExecutionContextId?
        get() = definedExternally
        set(value) = definedExternally
    var objectGroup: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GetPropertiesParameterType {
    var objectId: RemoteObjectId
    var ownProperties: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var accessorPropertiesOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var generatePreview: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ReleaseObjectParameterType {
    var objectId: RemoteObjectId
}

external interface ReleaseObjectGroupParameterType {
    var objectGroup: String
}

external interface SetCustomObjectFormatterEnabledParameterType {
    var enabled: Boolean
}

external interface CompileScriptParameterType {
    var expression: String
    var sourceURL: String
    var persistScript: Boolean
    var executionContextId: ExecutionContextId?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RunScriptParameterType {
    var scriptId: ScriptId
    var executionContextId: ExecutionContextId?
        get() = definedExternally
        set(value) = definedExternally
    var objectGroup: String?
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var includeCommandLineAPI: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var returnByValue: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var generatePreview: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var awaitPromise: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface QueryObjectsParameterType {
    var prototypeObjectId: RemoteObjectId
}

external interface GlobalLexicalScopeNamesParameterType {
    var executionContextId: ExecutionContextId?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EvaluateReturnType {
    var result: RemoteObject
    var exceptionDetails: ExceptionDetails?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AwaitPromiseReturnType {
    var result: RemoteObject
    var exceptionDetails: ExceptionDetails?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CallFunctionOnReturnType {
    var result: RemoteObject
    var exceptionDetails: ExceptionDetails?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GetPropertiesReturnType {
    var result: Array<PropertyDescriptor>
    var internalProperties: Array<InternalPropertyDescriptor>?
        get() = definedExternally
        set(value) = definedExternally
    var exceptionDetails: ExceptionDetails?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CompileScriptReturnType {
    var scriptId: ScriptId?
        get() = definedExternally
        set(value) = definedExternally
    var exceptionDetails: ExceptionDetails?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RunScriptReturnType {
    var result: RemoteObject
    var exceptionDetails: ExceptionDetails?
        get() = definedExternally
        set(value) = definedExternally
}

external interface QueryObjectsReturnType {
    var objects: RemoteObject
}

external interface GlobalLexicalScopeNamesReturnType {
    var names: Array<String>
}

external interface ExecutionContextCreatedEventDataType {
    var context: ExecutionContextDescription
}

external interface ExecutionContextDestroyedEventDataType {
    var executionContextId: ExecutionContextId
}

external interface ExceptionThrownEventDataType {
    var timestamp: Timestamp
    var exceptionDetails: ExceptionDetails
}

external interface ExceptionRevokedEventDataType {
    var reason: String
    var exceptionId: Number
}

external interface ConsoleAPICalledEventDataType {
    var type: String
    var args: Array<RemoteObject>
    var executionContextId: ExecutionContextId
    var timestamp: Timestamp
    var stackTrace: StackTrace?
        get() = definedExternally
        set(value) = definedExternally
    var context: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface InspectRequestedEventDataType {
    var `object`: RemoteObject
    var hints: Any
}