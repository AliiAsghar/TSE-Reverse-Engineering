package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atah implements atbb {
    public static final Map a;
    public final int b;
    private final String c;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(a("SHA-256", 32, 67, 10), new atah(1, "XMSS_SHA2_10_256"));
        hashMap.put(a("SHA-256", 32, 67, 16), new atah(2, "XMSS_SHA2_16_256"));
        hashMap.put(a("SHA-256", 32, 67, 20), new atah(3, "XMSS_SHA2_20_256"));
        hashMap.put(a("SHA-512", 64, 131, 10), new atah(4, "XMSS_SHA2_10_512"));
        hashMap.put(a("SHA-512", 64, 131, 16), new atah(5, "XMSS_SHA2_16_512"));
        hashMap.put(a("SHA-512", 64, 131, 20), new atah(6, "XMSS_SHA2_20_512"));
        hashMap.put(a("SHAKE128", 32, 67, 10), new atah(7, "XMSS_SHAKE_10_256"));
        hashMap.put(a("SHAKE128", 32, 67, 16), new atah(8, "XMSS_SHAKE_16_256"));
        hashMap.put(a("SHAKE128", 32, 67, 20), new atah(9, "XMSS_SHAKE_20_256"));
        hashMap.put(a("SHAKE256", 64, 131, 10), new atah(10, "XMSS_SHAKE_10_512"));
        hashMap.put(a("SHAKE256", 64, 131, 16), new atah(11, "XMSS_SHAKE_16_512"));
        hashMap.put(a("SHAKE256", 64, 131, 20), new atah(12, "XMSS_SHAKE_20_512"));
        a = DesugarCollections.unmodifiableMap(hashMap);
    }

    private atah(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public static String a(String str, int i, int i2, int i3) {
        return str + "-" + i + "-16-" + i2 + "-" + i3;
    }

    public final String toString() {
        return this.c;
    }
}
