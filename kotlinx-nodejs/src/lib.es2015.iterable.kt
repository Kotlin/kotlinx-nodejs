@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package tsstdlib

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

external interface SymbolConstructor {
    var asyncIterator: Any
    var hasInstance: Any
    var isConcatSpreadable: Any
    var match: Any
    var replace: Any
    var search: Any
    var species: Any
    var split: Any
    var toPrimitive: Any
    var toStringTag: Any
    var unscopables: Any
    var prototype: Symbol
    @nativeInvoke
    operator fun invoke(description: String = definedExternally): Any
    @nativeInvoke
    operator fun invoke(description: Number = definedExternally): Any
    fun `for`(key: String): Any
    fun keyFor(sym: Any): String?
    var iterator: Any
}

external interface IteratorYieldResult<TYield> {
    var done: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var value: TYield
}

external interface IteratorReturnResult<TReturn> {
    var done: Boolean
    var value: TReturn
}

external interface Iterator<T, TReturn, TNext> {
    fun next(vararg args: dynamic /* JsTuple<> | JsTuple<TNext> */): dynamic /* IteratorYieldResult<T> | IteratorReturnResult<TReturn> */
    val `return`: ((value: TReturn) -> dynamic)?
        get() = definedExternally
    val `throw`: ((e: Any) -> dynamic)?
        get() = definedExternally
}

typealias Iterator__1<T> = Iterator<T, Any, Nothing?>

external interface Iterable<T>

external interface IterableIterator<T> : Iterator__1<T>

external interface PromiseConstructor {
    var prototype: Promise<Any>
    fun all(values: dynamic /* JsTuple<dynamic, dynamic, dynamic, dynamic, dynamic, dynamic, dynamic, dynamic, dynamic, dynamic> | JsTuple<dynamic, dynamic, dynamic, dynamic, dynamic, dynamic, dynamic, dynamic, dynamic> | JsTuple<dynamic, dynamic, dynamic, dynamic, dynamic, dynamic, dynamic, dynamic> | JsTuple<dynamic, dynamic, dynamic, dynamic, dynamic, dynamic, dynamic> | JsTuple<dynamic, dynamic, dynamic, dynamic, dynamic, dynamic> | JsTuple<dynamic, dynamic, dynamic, dynamic, dynamic> | JsTuple<dynamic, dynamic, dynamic, dynamic> | JsTuple<dynamic, dynamic, dynamic> | JsTuple<dynamic, dynamic> */): Promise<dynamic /* JsTuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> | JsTuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> | JsTuple<T1, T2, T3, T4, T5, T6, T7, T8> | JsTuple<T1, T2, T3, T4, T5, T6, T7> | JsTuple<T1, T2, T3, T4, T5, T6> | JsTuple<T1, T2, T3, T4, T5> | JsTuple<T1, T2, T3, T4> | JsTuple<T1, T2, T3> | JsTuple<T1, T2> */>
    fun <T> all(values: Array<dynamic /* T | PromiseLike<T> */>): Promise<Array<T>>
    fun <T> race(values: Array<T>): Promise<Any>
    fun <T> reject(reason: Any = definedExternally): Promise<T>
    fun <T> resolve(value: T): Promise<T>
    fun <T> resolve(value: PromiseLike<T>): Promise<T>
    fun resolve(): Promise<Unit>
    fun <T> all(values: Iterable<dynamic /* T | PromiseLike<T> */>): Promise<Array<T>>
    fun <T> race(values: Iterable<dynamic /* T | PromiseLike<T> */>): Promise<T>
}