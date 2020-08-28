@file:JsModule("assert")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package assert.assert

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

external fun fail(message: String = definedExternally): Any

external fun fail(message: Error = definedExternally): Any

external fun fail(actual: Any, expected: Any, message: String = definedExternally, operator: String = definedExternally, stackStartFn: Function<*> = definedExternally): Any

external fun fail(actual: Any, expected: Any, message: Error = definedExternally, operator: String = definedExternally, stackStartFn: Function<*> = definedExternally): Any

external fun ok(value: Any, message: String = definedExternally)

external fun ok(value: Any, message: Error = definedExternally)

external fun equal(actual: Any, expected: Any, message: String = definedExternally)

external fun equal(actual: Any, expected: Any, message: Error = definedExternally)

external fun notEqual(actual: Any, expected: Any, message: String = definedExternally)

external fun notEqual(actual: Any, expected: Any, message: Error = definedExternally)

external fun deepEqual(actual: Any, expected: Any, message: String = definedExternally)

external fun deepEqual(actual: Any, expected: Any, message: Error = definedExternally)

external fun notDeepEqual(actual: Any, expected: Any, message: String = definedExternally)

external fun notDeepEqual(actual: Any, expected: Any, message: Error = definedExternally)

external fun strictEqual(actual: Any, expected: Any, message: String = definedExternally)

external fun strictEqual(actual: Any, expected: Any, message: Error = definedExternally)

external fun notStrictEqual(actual: Any, expected: Any, message: String = definedExternally)

external fun notStrictEqual(actual: Any, expected: Any, message: Error = definedExternally)

external fun deepStrictEqual(actual: Any, expected: Any, message: String = definedExternally)

external fun deepStrictEqual(actual: Any, expected: Any, message: Error = definedExternally)

external fun notDeepStrictEqual(actual: Any, expected: Any, message: String = definedExternally)

external fun notDeepStrictEqual(actual: Any, expected: Any, message: Error = definedExternally)

external fun throws(block: () -> Any, message: String = definedExternally)

external fun throws(block: () -> Any, message: Error = definedExternally)

external fun throws(block: () -> Any, error: RegExp?, message: String = definedExternally)

external fun throws(block: () -> Any, error: RegExp?, message: Error = definedExternally)

external fun throws(block: () -> Any, error: Any?, message: String = definedExternally)

external fun throws(block: () -> Any, error: Any?, message: Error = definedExternally)

external fun throws(block: () -> Any, error: ((thrown: Any) -> Boolean)?, message: String = definedExternally)

external fun throws(block: () -> Any, error: ((thrown: Any) -> Boolean)?, message: Error = definedExternally)

external fun throws(block: () -> Any, error: Error?, message: String = definedExternally)

external fun throws(block: () -> Any, error: Error?, message: Error = definedExternally)

external fun doesNotThrow(block: () -> Any, message: String = definedExternally)

external fun doesNotThrow(block: () -> Any, message: Error = definedExternally)

external fun doesNotThrow(block: () -> Any, error: RegExp, message: String = definedExternally)

external fun doesNotThrow(block: () -> Any, error: RegExp, message: Error = definedExternally)

external fun doesNotThrow(block: () -> Any, error: Function<*>, message: String = definedExternally)

external fun doesNotThrow(block: () -> Any, error: Function<*>, message: Error = definedExternally)

external fun ifError(value: Any)

external fun rejects(block: () -> Promise<Any>, message: String = definedExternally): Promise<Unit>

external fun rejects(block: () -> Promise<Any>, message: Error = definedExternally): Promise<Unit>

external fun rejects(block: Promise<Any>, message: String = definedExternally): Promise<Unit>

external fun rejects(block: Promise<Any>, message: Error = definedExternally): Promise<Unit>

external fun rejects(block: () -> Promise<Any>, error: RegExp?, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

external fun rejects(block: () -> Promise<Any>, error: Any?, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

external fun rejects(block: () -> Promise<Any>, error: ((thrown: Any) -> Boolean)?, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

external fun rejects(block: () -> Promise<Any>, error: Error?, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

external fun rejects(block: Promise<Any>, error: RegExp?, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

external fun rejects(block: Promise<Any>, error: Any?, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

external fun rejects(block: Promise<Any>, error: ((thrown: Any) -> Boolean)?, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

external fun rejects(block: Promise<Any>, error: Error?, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

external fun doesNotReject(block: () -> Promise<Any>, message: String = definedExternally): Promise<Unit>

external fun doesNotReject(block: () -> Promise<Any>, message: Error = definedExternally): Promise<Unit>

external fun doesNotReject(block: Promise<Any>, message: String = definedExternally): Promise<Unit>

external fun doesNotReject(block: Promise<Any>, message: Error = definedExternally): Promise<Unit>

external fun doesNotReject(block: () -> Promise<Any>, error: RegExp, message: String = definedExternally): Promise<Unit>

external fun doesNotReject(block: () -> Promise<Any>, error: RegExp, message: Error = definedExternally): Promise<Unit>

external fun doesNotReject(block: () -> Promise<Any>, error: Function<*>, message: String = definedExternally): Promise<Unit>

external fun doesNotReject(block: () -> Promise<Any>, error: Function<*>, message: Error = definedExternally): Promise<Unit>

external fun doesNotReject(block: Promise<Any>, error: RegExp, message: String = definedExternally): Promise<Unit>

external fun doesNotReject(block: Promise<Any>, error: RegExp, message: Error = definedExternally): Promise<Unit>

external fun doesNotReject(block: Promise<Any>, error: Function<*>, message: String = definedExternally): Promise<Unit>

external fun doesNotReject(block: Promise<Any>, error: Function<*>, message: Error = definedExternally): Promise<Unit>

external fun match(value: String, regExp: RegExp, message: String = definedExternally)

external fun match(value: String, regExp: RegExp, message: Error = definedExternally)

external fun doesNotMatch(value: String, regExp: RegExp, message: String = definedExternally)

external fun doesNotMatch(value: String, regExp: RegExp, message: Error = definedExternally)

external var strict: Any