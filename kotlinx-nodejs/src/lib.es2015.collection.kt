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

external interface Map<K, V> {
    fun entries(): IterableIterator<dynamic /* JsTuple<K, V> */>
    fun keys(): IterableIterator<K>
    fun values(): IterableIterator<V>
    fun clear()
    fun delete(key: K): Boolean
    fun forEach(callbackfn: (value: V, key: K, map: Map<K, V>) -> Unit, thisArg: Any = definedExternally)
    fun get(key: K): V?
    fun has(key: K): Boolean
    fun set(key: K, value: V): Map<K, V> /* this */
    var size: Number
}

external interface MapConstructor {
    var prototype: Map<Any, Any>
}

external interface WeakMap<K : Any?, V> {
    fun delete(key: K): Boolean
    fun get(key: K): V?
    fun has(key: K): Boolean
    fun set(key: K, value: V): WeakMap<K, V> /* this */
}

external interface WeakMapConstructor {
    var prototype: WeakMap<Any?, Any>
}

external interface Set<T> {
    fun entries(): IterableIterator<dynamic /* JsTuple<T, T> */>
    fun keys(): IterableIterator<T>
    fun values(): IterableIterator<T>
    fun add(value: T): Set<T> /* this */
    fun clear()
    fun delete(value: T): Boolean
    fun forEach(callbackfn: (value: T, value2: T, set: Set<T>) -> Unit, thisArg: Any = definedExternally)
    fun has(value: T): Boolean
    var size: Number
}

external interface SetConstructor {
    var prototype: Set<Any>
}

external interface ReadonlySet<T> {
    fun entries(): IterableIterator<dynamic /* JsTuple<T, T> */>
    fun keys(): IterableIterator<T>
    fun values(): IterableIterator<T>
    fun forEach(callbackfn: (value: T, value2: T, set: ReadonlySet<T>) -> Unit, thisArg: Any = definedExternally)
    fun has(value: T): Boolean
    var size: Number
}

external interface WeakSet<T : Any?> {
    fun add(value: T): WeakSet<T> /* this */
    fun delete(value: T): Boolean
    fun has(value: T): Boolean
}

external interface WeakSetConstructor {
    var prototype: WeakSet<Any?>
}