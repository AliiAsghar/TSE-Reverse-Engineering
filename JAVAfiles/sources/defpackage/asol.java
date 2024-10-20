package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asol {
    public static final asoi[] a = {new asoi(asoi.f, ""), new asoi(asoi.c, "GET"), new asoi(asoi.c, "POST"), new asoi(asoi.d, "/"), new asoi(asoi.d, "/index.html"), new asoi(asoi.e, "http"), new asoi(asoi.e, "https"), new asoi(asoi.b, "200"), new asoi(asoi.b, "204"), new asoi(asoi.b, "206"), new asoi(asoi.b, "304"), new asoi(asoi.b, "400"), new asoi(asoi.b, "404"), new asoi(asoi.b, "500"), new asoi("accept-charset", ""), new asoi("accept-encoding", "gzip, deflate"), new asoi("accept-language", ""), new asoi("accept-ranges", ""), new asoi("accept", ""), new asoi("access-control-allow-origin", ""), new asoi("age", ""), new asoi("allow", ""), new asoi("authorization", ""), new asoi("cache-control", ""), new asoi("content-disposition", ""), new asoi("content-encoding", ""), new asoi("content-language", ""), new asoi("content-length", ""), new asoi("content-location", ""), new asoi("content-range", ""), new asoi("content-type", ""), new asoi("cookie", ""), new asoi("date", ""), new asoi("etag", ""), new asoi("expect", ""), new asoi("expires", ""), new asoi("from", ""), new asoi("host", ""), new asoi("if-match", ""), new asoi("if-modified-since", ""), new asoi("if-none-match", ""), new asoi("if-range", ""), new asoi("if-unmodified-since", ""), new asoi("last-modified", ""), new asoi("link", ""), new asoi("location", ""), new asoi("max-forwards", ""), new asoi("proxy-authenticate", ""), new asoi("proxy-authorization", ""), new asoi("range", ""), new asoi("referer", ""), new asoi("refresh", ""), new asoi("retry-after", ""), new asoi("server", ""), new asoi("set-cookie", ""), new asoi("strict-transport-security", ""), new asoi("transfer-encoding", ""), new asoi("user-agent", ""), new asoi("vary", ""), new asoi("via", ""), new asoi("www-authenticate", "")};
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            asoi[] asoiVarArr = a;
            if (!linkedHashMap.containsKey(asoiVarArr[i].g)) {
                linkedHashMap.put(asoiVarArr[i].g, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static final void a(asqx asqxVar) {
        int b2 = asqxVar.b();
        for (int i = 0; i < b2; i++) {
            byte a2 = asqxVar.a(i);
            if (a2 >= 65 && a2 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(asqxVar.e()));
            }
        }
    }
}
