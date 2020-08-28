@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package crypto

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
import Buffer
import stream.internal.TransformOptions

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface Certificate {
    fun exportChallenge(spkac: String): Buffer
    fun exportChallenge(spkac: Uint8Array): Buffer
    fun exportChallenge(spkac: Uint8ClampedArray): Buffer
    fun exportChallenge(spkac: Uint16Array): Buffer
    fun exportChallenge(spkac: Uint32Array): Buffer
    fun exportChallenge(spkac: Int8Array): Buffer
    fun exportChallenge(spkac: Int16Array): Buffer
    fun exportChallenge(spkac: Int32Array): Buffer
    fun exportChallenge(spkac: Float32Array): Buffer
    fun exportChallenge(spkac: Float64Array): Buffer
    fun exportChallenge(spkac: DataView): Buffer
    fun exportPublicKey(spkac: String): Buffer
    fun exportPublicKey(spkac: Uint8Array): Buffer
    fun exportPublicKey(spkac: Uint8ClampedArray): Buffer
    fun exportPublicKey(spkac: Uint16Array): Buffer
    fun exportPublicKey(spkac: Uint32Array): Buffer
    fun exportPublicKey(spkac: Int8Array): Buffer
    fun exportPublicKey(spkac: Int16Array): Buffer
    fun exportPublicKey(spkac: Int32Array): Buffer
    fun exportPublicKey(spkac: Float32Array): Buffer
    fun exportPublicKey(spkac: Float64Array): Buffer
    fun exportPublicKey(spkac: DataView): Buffer
    fun verifySpkac(spkac: Uint8Array): Boolean
    fun verifySpkac(spkac: Uint8ClampedArray): Boolean
    fun verifySpkac(spkac: Uint16Array): Boolean
    fun verifySpkac(spkac: Uint32Array): Boolean
    fun verifySpkac(spkac: Int8Array): Boolean
    fun verifySpkac(spkac: Int16Array): Boolean
    fun verifySpkac(spkac: Int32Array): Boolean
    fun verifySpkac(spkac: Float32Array): Boolean
    fun verifySpkac(spkac: Float64Array): Boolean
    fun verifySpkac(spkac: DataView): Boolean

    companion object {
        @nativeInvoke
        operator fun invoke(): Certificate
    }
}

external interface HashOptions : TransformOptions {
    var outputLength: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface KeyExportOptions<T : String> {
    var type: String /* "pkcs1" | "spki" | "pkcs8" | "sec1" */
    var format: T
    var cipher: String?
        get() = definedExternally
        set(value) = definedExternally
    var passphrase: dynamic /* String? | Buffer? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface CipherCCMOptions : TransformOptions {
    var authTagLength: Number
}

external interface CipherGCMOptions : TransformOptions {
    var authTagLength: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$22` {
    var plaintextLength: Number
}

external interface CipherCCM : Cipher {
    fun setAAD(buffer: Buffer, options: `T$22`): CipherCCM /* this */
    fun getAuthTag(): Buffer
}

external interface CipherGCM : Cipher {
    fun setAAD(buffer: Buffer, options: `T$22` = definedExternally): CipherGCM /* this */
    fun getAuthTag(): Buffer
}

external interface DecipherCCM : Decipher {
    fun setAuthTag(buffer: Uint8Array): DecipherCCM /* this */
    fun setAuthTag(buffer: Uint8ClampedArray): DecipherCCM /* this */
    fun setAuthTag(buffer: Uint16Array): DecipherCCM /* this */
    fun setAuthTag(buffer: Uint32Array): DecipherCCM /* this */
    fun setAuthTag(buffer: Int8Array): DecipherCCM /* this */
    fun setAuthTag(buffer: Int16Array): DecipherCCM /* this */
    fun setAuthTag(buffer: Int32Array): DecipherCCM /* this */
    fun setAuthTag(buffer: Float32Array): DecipherCCM /* this */
    fun setAuthTag(buffer: Float64Array): DecipherCCM /* this */
    fun setAuthTag(buffer: DataView): DecipherCCM /* this */
    fun setAAD(buffer: Uint8Array, options: `T$22`): DecipherCCM /* this */
    fun setAAD(buffer: Uint8ClampedArray, options: `T$22`): DecipherCCM /* this */
    fun setAAD(buffer: Uint16Array, options: `T$22`): DecipherCCM /* this */
    fun setAAD(buffer: Uint32Array, options: `T$22`): DecipherCCM /* this */
    fun setAAD(buffer: Int8Array, options: `T$22`): DecipherCCM /* this */
    fun setAAD(buffer: Int16Array, options: `T$22`): DecipherCCM /* this */
    fun setAAD(buffer: Int32Array, options: `T$22`): DecipherCCM /* this */
    fun setAAD(buffer: Float32Array, options: `T$22`): DecipherCCM /* this */
    fun setAAD(buffer: Float64Array, options: `T$22`): DecipherCCM /* this */
    fun setAAD(buffer: DataView, options: `T$22`): DecipherCCM /* this */
}

external interface DecipherGCM : Decipher {
    fun setAuthTag(buffer: Uint8Array): DecipherGCM /* this */
    fun setAuthTag(buffer: Uint8ClampedArray): DecipherGCM /* this */
    fun setAuthTag(buffer: Uint16Array): DecipherGCM /* this */
    fun setAuthTag(buffer: Uint32Array): DecipherGCM /* this */
    fun setAuthTag(buffer: Int8Array): DecipherGCM /* this */
    fun setAuthTag(buffer: Int16Array): DecipherGCM /* this */
    fun setAuthTag(buffer: Int32Array): DecipherGCM /* this */
    fun setAuthTag(buffer: Float32Array): DecipherGCM /* this */
    fun setAuthTag(buffer: Float64Array): DecipherGCM /* this */
    fun setAuthTag(buffer: DataView): DecipherGCM /* this */
    fun setAAD(buffer: Uint8Array, options: `T$22` = definedExternally): DecipherGCM /* this */
    fun setAAD(buffer: Uint8ClampedArray, options: `T$22` = definedExternally): DecipherGCM /* this */
    fun setAAD(buffer: Uint16Array, options: `T$22` = definedExternally): DecipherGCM /* this */
    fun setAAD(buffer: Uint32Array, options: `T$22` = definedExternally): DecipherGCM /* this */
    fun setAAD(buffer: Int8Array, options: `T$22` = definedExternally): DecipherGCM /* this */
    fun setAAD(buffer: Int16Array, options: `T$22` = definedExternally): DecipherGCM /* this */
    fun setAAD(buffer: Int32Array, options: `T$22` = definedExternally): DecipherGCM /* this */
    fun setAAD(buffer: Float32Array, options: `T$22` = definedExternally): DecipherGCM /* this */
    fun setAAD(buffer: Float64Array, options: `T$22` = definedExternally): DecipherGCM /* this */
    fun setAAD(buffer: DataView, options: `T$22` = definedExternally): DecipherGCM /* this */
}

external interface PrivateKeyInput {
    var key: dynamic /* String | Buffer */
        get() = definedExternally
        set(value) = definedExternally
    var format: String? /* "pem" | "der" */
        get() = definedExternally
        set(value) = definedExternally
    var type: String? /* "pkcs1" | "pkcs8" | "sec1" */
        get() = definedExternally
        set(value) = definedExternally
    var passphrase: dynamic /* String? | Buffer? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface PublicKeyInput {
    var key: dynamic /* String | Buffer */
        get() = definedExternally
        set(value) = definedExternally
    var format: String? /* "pem" | "der" */
        get() = definedExternally
        set(value) = definedExternally
    var type: String? /* "pkcs1" | "spki" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SigningOptions {
    var padding: Number?
        get() = definedExternally
        set(value) = definedExternally
    var saltLength: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SignPrivateKeyInput : PrivateKeyInput, SigningOptions

external interface ScryptOptions {
    var N: Number?
        get() = definedExternally
        set(value) = definedExternally
    var r: Number?
        get() = definedExternally
        set(value) = definedExternally
    var p: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxmem: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RsaPublicKey {
    var key: dynamic /* String | Buffer | KeyObject */
        get() = definedExternally
        set(value) = definedExternally
    var padding: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RsaPrivateKey {
    var key: dynamic /* String | Buffer | KeyObject */
        get() = definedExternally
        set(value) = definedExternally
    var passphrase: String?
        get() = definedExternally
        set(value) = definedExternally
    var oaepHash: String?
        get() = definedExternally
        set(value) = definedExternally
    var oaepLabel: dynamic /* Uint8Array? | Uint8ClampedArray? | Uint16Array? | Uint32Array? | Int8Array? | Int16Array? | Int32Array? | Float32Array? | Float64Array? */
        get() = definedExternally
        set(value) = definedExternally
    var padding: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BasePrivateKeyEncodingOptions<T : String> {
    var format: T
    var cipher: String?
        get() = definedExternally
        set(value) = definedExternally
    var passphrase: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface KeyPairKeyObjectResult {
    var publicKey: KeyObject
    var privateKey: KeyObject
}

external interface ECKeyPairKeyObjectOptions {
    var namedCurve: String
}

external interface RSAKeyPairKeyObjectOptions {
    var modulusLength: Number
    var publicExponent: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DSAKeyPairKeyObjectOptions {
    var modulusLength: Number
    var divisorLength: Number
}

external interface `T$23`<PubF> {
    var type: String /* "pkcs1" | "spki" */
    var format: PubF
}

external interface `T$24` {
    var type: String /* "pkcs1" | "pkcs8" */
}

external interface RSAKeyPairOptions<PubF : String, PrivF : String> {
    var modulusLength: Number
    var publicExponent: Number?
        get() = definedExternally
        set(value) = definedExternally
    var publicKeyEncoding: `T$23`<Any?>
    var privateKeyEncoding: BasePrivateKeyEncodingOptions<PrivF> /* BasePrivateKeyEncodingOptions<PrivF> & `T$24` */
}

external interface `T$25`<PubF> {
    var type: String /* "spki" */
    var format: PubF
}

external interface `T$26` {
    var type: String /* "pkcs8" */
}

external interface DSAKeyPairOptions<PubF : String, PrivF : String> {
    var modulusLength: Number
    var divisorLength: Number
    var publicKeyEncoding: `T$25`<Any?>
    var privateKeyEncoding: BasePrivateKeyEncodingOptions<PrivF> /* BasePrivateKeyEncodingOptions<PrivF> & `T$26` */
}

external interface `T$27` {
    var type: String /* "sec1" | "pkcs8" */
}

external interface ECKeyPairOptions<PubF : String, PrivF : String> {
    var namedCurve: String
    var publicKeyEncoding: `T$23`<Any?>
    var privateKeyEncoding: BasePrivateKeyEncodingOptions<PrivF> /* BasePrivateKeyEncodingOptions<PrivF> & `T$27` */
}

external interface KeyPairSyncResult<T1, T2> {
    var publicKey: T1
    var privateKey: T2
}

external interface VerifyKeyWithOptions : KeyObject, SigningOptions