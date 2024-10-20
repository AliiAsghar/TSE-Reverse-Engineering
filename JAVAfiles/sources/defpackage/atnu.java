package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atnu {
    public static final atnt a;

    static {
        atnt atntVar = new atnt();
        a = atntVar;
        atntVar.g(1, "A", new atka());
        atntVar.g(2, "NS", new atmh());
        atntVar.g(3, "MD", new atlt());
        atntVar.g(4, "MF", new atlu());
        atntVar.g(5, "CNAME", new atkd());
        atntVar.g(6, "SOA", new atne());
        atntVar.g(7, "MB", new atls());
        atntVar.g(8, "MG", new atlv());
        atntVar.g(9, "MR", new atlx());
        atntVar.g(10, "NULL", new atmi());
        atntVar.g(11, "WKS", new atob());
        atntVar.g(12, "PTR", new atmq());
        atntVar.g(13, "HINFO", new atlg());
        atntVar.g(14, "MINFO", new atlw());
        atntVar.g(15, "MX", new atly());
        atntVar.g(16, "TXT", new atnr());
        atntVar.g(17, "RP", new atms());
        atntVar.g(18, "AFSDB", new atjx());
        atntVar.g(19, "X25", new atod());
        atntVar.g(20, VCardConstants.PARAM_TYPE_ISDN, new atlj());
        atntVar.g(21, "RT", new atmv());
        atntVar.g(22, "NSAP", new atmc());
        atntVar.g(23, "NSAP-PTR", new atmd());
        atntVar.g(24, "SIG", new atnc());
        atntVar.g(25, VCardConstants.PROPERTY_KEY, new atlo());
        atntVar.g(26, "PX", new atmr());
        atntVar.g(27, "GPOS", new atle());
        atntVar.g(28, "AAAA", new atjw());
        atntVar.g(29, "LOC", new atlq());
        atntVar.g(30, "NXT", new atmj());
        atntVar.d(31, "EID");
        atntVar.d(32, "NIMLOC");
        atntVar.g(33, "SRV", new atng());
        atntVar.d(34, "ATMA");
        atntVar.g(35, "NAPTR", new atmb());
        atntVar.g(36, "KX", new atlp());
        atntVar.g(37, "CERT", new atkc());
        atntVar.g(38, "A6", new atjv());
        atntVar.g(39, "DNAME", new atks());
        atntVar.g(41, "OPT", new atmn());
        atntVar.g(42, "APL", new atjz());
        atntVar.g(43, "DS", new atkw());
        atntVar.g(44, "SSHFP", new atnh());
        atntVar.g(45, "IPSECKEY", new atli());
        atntVar.g(46, "RRSIG", new atmt());
        atntVar.g(47, "NSEC", new atmg());
        atntVar.g(48, "DNSKEY", new atku());
        atntVar.g(49, "DHCID", new atkq());
        atntVar.g(50, "NSEC3", new atmf());
        atntVar.g(51, "NSEC3PARAM", new atme());
        atntVar.g(52, "TLSA", new atno());
        atntVar.g(53, "SMIMEA", new atnd());
        atntVar.g(61, "OPENPGPKEY", new atmm());
        atntVar.g(99, "SPF", new atnf());
        atntVar.g(249, "TKEY", new atnn());
        atntVar.g(250, "TSIG", new atnp());
        atntVar.d(251, "IXFR");
        atntVar.d(252, "AXFR");
        atntVar.d(253, "MAILB");
        atntVar.d(254, "MAILA");
        atntVar.d(255, "ANY");
        atntVar.g(256, "URI", new atoa());
        atntVar.g(257, "CAA", new atkb());
        atntVar.g(32769, "DLV", new atkr());
    }

    public static String a(int i) {
        return a.c(i);
    }

    public static void b(int i) {
        if (i >= 0 && i <= 65535) {
        } else {
            throw new atlm(i);
        }
    }
}
