@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")

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
    var iterator: Any
    var asyncIterator: Any
    var observable: Any
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
    @nativeInvoke
    operator fun invoke(): Any
}

external interface IteratorResult<T> {
    var done: Boolean
    var value: T
}

external interface Iterator<T> {
    fun next(value: Any = definedExternally): IteratorResult<T>
    val `return`: ((value: Any) -> IteratorResult<T>)?
        get() = definedExternally
    val `throw`: ((e: Any) -> IteratorResult<T>)?
        get() = definedExternally
    fun next(): IteratorResult<T>
}

external interface Iterable<T>

typealias IterableIterator<T> = Iterator<T>

external interface PromiseConstructor {
    var prototype: Promise<Any>
    fun <T1, T2> all(values: dynamic /* JsTuple<dynamic, dynamic> */): Promise<dynamic /* JsTuple<T1, T2> */>
    fun <T> all(values: Array<dynamic /* T | PromiseLike<T> */>): Promise<Array<T>>
    fun <T> race(values: Array<T>): Promise<Any>
    fun <T> reject(reason: Any = definedExternally): Promise<T>
    fun <T> resolve(value: T): Promise<T>
    fun <T> resolve(value: PromiseLike<T>): Promise<T>
    fun resolve(): Promise<Unit>
    fun <TAll> all(values: Iterable<dynamic /* TAll | PromiseLike<TAll> */>): Promise<Array<TAll>>
    fun <T> race(values: Iterable<dynamic /* T | PromiseLike<T> */>): Promise<T>
}
