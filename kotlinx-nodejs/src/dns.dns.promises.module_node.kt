@file:JsQualifier("dns.promises")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package dns.promises

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
import dns.LookupAddress
import dns.LookupOneOptions
import dns.LookupAllOptions
import dns.LookupOptions
import dns.lookupService.`T$12`
import dns.ResolveWithTtlOptions
import dns.RecordWithTtl
import dns.ResolveOptions
import dns.MxRecord
import dns.NaptrRecord
import dns.SoaRecord
import dns.SrvRecord

external fun getServers(): Array<String>

external fun lookup(hostname: String, family: Number): Promise<LookupAddress>

external fun lookup(hostname: String, options: LookupOneOptions): Promise<LookupAddress>

external fun lookup(hostname: String, options: LookupAllOptions): Promise<Array<LookupAddress>>

external fun lookup(hostname: String, options: LookupOptions): Promise<dynamic /* LookupAddress | Array<LookupAddress> */>

external fun lookup(hostname: String): Promise<LookupAddress>

external fun lookupService(address: String, port: Number): Promise<`T$12`>

external fun resolve(hostname: String): Promise<Array<String>>

external fun resolve(hostname: String, rrtype: String /* "A" | "AAAA" | "ANY" | "CNAME" | "MX" | "NAPTR" | "NS" | "PTR" | "SOA" | "SRV" | "TXT" */): dynamic /* Promise */

external fun resolve4(hostname: String): Promise<Array<String>>

external fun resolve4(hostname: String, options: ResolveWithTtlOptions): Promise<Array<RecordWithTtl>>

external fun resolve4(hostname: String, options: ResolveOptions): Promise<dynamic /* Array<String> | Array<RecordWithTtl> */>

external fun resolve6(hostname: String): Promise<Array<String>>

external fun resolve6(hostname: String, options: ResolveWithTtlOptions): Promise<Array<RecordWithTtl>>

external fun resolve6(hostname: String, options: ResolveOptions): Promise<dynamic /* Array<String> | Array<RecordWithTtl> */>

external fun resolveAny(hostname: String): Promise<Array<dynamic /* AnyARecord | AnyAaaaRecord | AnyCnameRecord | AnyMxRecord | AnyNaptrRecord | AnyNsRecord | AnyPtrRecord | AnySoaRecord | AnySrvRecord | AnyTxtRecord */>>

external fun resolveCname(hostname: String): Promise<Array<String>>

external fun resolveMx(hostname: String): Promise<Array<MxRecord>>

external fun resolveNaptr(hostname: String): Promise<Array<NaptrRecord>>

external fun resolveNs(hostname: String): Promise<Array<String>>

external fun resolvePtr(hostname: String): Promise<Array<String>>

external fun resolveSoa(hostname: String): Promise<SoaRecord>

external fun resolveSrv(hostname: String): Promise<Array<SrvRecord>>

external fun resolveTxt(hostname: String): Promise<Array<Array<String>>>

external fun reverse(ip: String): Promise<Array<String>>

external fun setServers(servers: Array<String>)

external open class Resolver {
    open var getServers: Any
    open var resolve: Any
    open var resolve4: Any
    open var resolve6: Any
    open var resolveAny: Any
    open var resolveCname: Any
    open var resolveMx: Any
    open var resolveNaptr: Any
    open var resolveNs: Any
    open var resolvePtr: Any
    open var resolveSoa: Any
    open var resolveSrv: Any
    open var resolveTxt: Any
    open var reverse: Any
    open var setServers: Any
}