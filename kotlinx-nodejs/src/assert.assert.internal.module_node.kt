@file:JsModule("assert")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")
package assert.internal

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

external interface `T$12` {
    var message: String?
        get() = definedExternally
        set(value) = definedExternally
    var actual: Any?
        get() = definedExternally
        set(value) = definedExternally
    var expected: Any?
        get() = definedExternally
        set(value) = definedExternally
    var operator: String?
        get() = definedExternally
        set(value) = definedExternally
    var stackStartFn: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
}

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

external fun rejects(block: () -> Promise<Any>, error: RegExp, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

external fun rejects(block: () -> Promise<Any>, error: Function<*>, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

external fun rejects(block: () -> Promise<Any>, error: Any, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

external fun rejects(block: () -> Promise<Any>, error: Error, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

external fun rejects(block: Promise<Any>, error: RegExp, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

external fun rejects(block: Promise<Any>, error: Function<*>, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

external fun rejects(block: Promise<Any>, error: Any, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

external fun rejects(block: Promise<Any>, error: Error, message: dynamic /* String | Error */ = definedExternally): Promise<Unit>

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

external var strict: Any

external fun fail(): Any

external fun fail(actual: Any, expected: Any): Any

external fun ok(value: Any)

external fun equal(actual: Any, expected: Any)

external fun notEqual(actual: Any, expected: Any)

external fun deepEqual(actual: Any, expected: Any)

external fun notDeepEqual(actual: Any, expected: Any)

external fun strictEqual(actual: Any, expected: Any)

external fun notStrictEqual(actual: Any, expected: Any)

external fun deepStrictEqual(actual: Any, expected: Any)

external fun notDeepStrictEqual(actual: Any, expected: Any)

external fun throws(block: () -> Any)

external fun throws(block: () -> Any, error: RegExp)

external fun throws(block: () -> Any, error: Function<*>)

external fun throws(block: () -> Any, error: Any)

external fun throws(block: () -> Any, error: Error)

external fun doesNotThrow(block: () -> Any)

external fun doesNotThrow(block: () -> Any, error: RegExp)

external fun doesNotThrow(block: () -> Any, error: Function<*>)

external fun rejects(block: () -> Promise<Any>): Promise<Unit>

external fun rejects(block: Promise<Any>): Promise<Unit>

external fun doesNotReject(block: () -> Promise<Any>): Promise<Unit>

external fun doesNotReject(block: Promise<Any>): Promise<Unit>

external fun doesNotReject(block: () -> Promise<Any>, error: RegExp): Promise<Unit>

external fun doesNotReject(block: () -> Promise<Any>, error: Function<*>): Promise<Unit>

external fun doesNotReject(block: Promise<Any>, error: RegExp): Promise<Unit>

external fun doesNotReject(block: Promise<Any>, error: Function<*>): Promise<Unit>
