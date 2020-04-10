@file:JsQualifier("crypto.generateKeyPair")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package crypto.generateKeyPair

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

external interface `T$27` {
    var publicKey: String
    var privateKey: String
}

external fun __promisify__(type: String /* "rsa" */, options: crypto.RSAKeyPairOptions<String /* 'pem' */, String /* 'pem' */>): Promise<`T$27`>

external interface `T$28` {
    var publicKey: String
    var privateKey: Buffer
}

external fun __promisify__(type: String /* "rsa" */, options: crypto.RSAKeyPairOptions<String /* 'pem' */, String /* 'der' */>): Promise<`T$28`>

external interface `T$29` {
    var publicKey: Buffer
    var privateKey: String
}

external fun __promisify__(type: String /* "rsa" */, options: crypto.RSAKeyPairOptions<String /* 'der' */, String /* 'pem' */>): Promise<`T$29`>

external interface `T$30` {
    var publicKey: Buffer
    var privateKey: Buffer
}

external fun __promisify__(type: String /* "rsa" */, options: crypto.RSAKeyPairOptions<String /* 'der' */, String /* 'der' */>): Promise<`T$30`>

external fun __promisify__(type: String /* "rsa" */, options: crypto.RSAKeyPairKeyObjectOptions): Promise<crypto.KeyPairKeyObjectResult>

external fun __promisify__(type: String /* "dsa" */, options: crypto.DSAKeyPairOptions<String /* 'pem' */, String /* 'pem' */>): Promise<`T$27`>

external fun __promisify__(type: String /* "dsa" */, options: crypto.DSAKeyPairOptions<String /* 'pem' */, String /* 'der' */>): Promise<`T$28`>

external fun __promisify__(type: String /* "dsa" */, options: crypto.DSAKeyPairOptions<String /* 'der' */, String /* 'pem' */>): Promise<`T$29`>

external fun __promisify__(type: String /* "dsa" */, options: crypto.DSAKeyPairOptions<String /* 'der' */, String /* 'der' */>): Promise<`T$30`>

external fun __promisify__(type: String /* "dsa" */, options: crypto.DSAKeyPairKeyObjectOptions): Promise<crypto.KeyPairKeyObjectResult>

external fun __promisify__(type: String /* "ec" */, options: crypto.ECKeyPairOptions<String /* 'pem' */, String /* 'pem' */>): Promise<`T$27`>

external fun __promisify__(type: String /* "ec" */, options: crypto.ECKeyPairOptions<String /* 'pem' */, String /* 'der' */>): Promise<`T$28`>

external fun __promisify__(type: String /* "ec" */, options: crypto.ECKeyPairOptions<String /* 'der' */, String /* 'pem' */>): Promise<`T$29`>

external fun __promisify__(type: String /* "ec" */, options: crypto.ECKeyPairOptions<String /* 'der' */, String /* 'der' */>): Promise<`T$30`>

external fun __promisify__(type: String /* "ec" */, options: crypto.ECKeyPairKeyObjectOptions): Promise<crypto.KeyPairKeyObjectResult>