@file:JsQualifier("util.types")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package util.types

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

external fun isAnyArrayBuffer(obj: Any): Boolean

external fun isArgumentsObject(obj: Any): Boolean

external fun isArrayBuffer(obj: Any): Boolean

external fun isArrayBufferView(obj: Any): Boolean

external fun isAsyncFunction(obj: Any): Boolean

external fun isBooleanObject(obj: Any): Boolean

external fun isBoxedPrimitive(obj: Any): Boolean

external fun isDataView(obj: Any): Boolean

external fun isDate(obj: Any): Boolean

external fun isExternal(obj: Any): Boolean

external fun isFloat32Array(obj: Any): Boolean

external fun isFloat64Array(obj: Any): Boolean

external fun isGeneratorFunction(obj: Any): Boolean

external fun isGeneratorObject(obj: Any): Boolean

external fun isInt8Array(obj: Any): Boolean

external fun isInt16Array(obj: Any): Boolean

external fun isInt32Array(obj: Any): Boolean

external fun isMap(obj: Any): Boolean

external fun isMapIterator(obj: Any): Boolean

external fun isModuleNamespaceObject(value: Any): Boolean

external fun isNativeError(obj: Any): Boolean

external fun isNumberObject(obj: Any): Boolean

external fun isPromise(obj: Any): Boolean

external fun isProxy(obj: Any): Boolean

external fun isRegExp(obj: Any): Boolean

external fun isSet(obj: Any): Boolean

external fun isSetIterator(obj: Any): Boolean

external fun isSharedArrayBuffer(obj: Any): Boolean

external fun isStringObject(obj: Any): Boolean

external fun isSymbolObject(obj: Any): Boolean

external fun isTypedArray(obj: Any): Boolean

external fun isUint8Array(obj: Any): Boolean

external fun isUint8ClampedArray(obj: Any): Boolean

external fun isUint16Array(obj: Any): Boolean

external fun isUint32Array(obj: Any): Boolean

external fun isWeakMap(obj: Any): Boolean

external fun isWeakSet(obj: Any): Boolean

external fun isWebAssemblyCompiledModule(obj: Any): Boolean

external fun isBigInt64Array(value: Any): Boolean

external fun isBigUint64Array(value: Any): Boolean