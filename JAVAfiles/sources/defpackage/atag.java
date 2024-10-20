package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atag implements atbb {
    public static final Map a;
    public final int b;
    private final String c;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(a("SHA-256", 32, 67, 20, 2), new atag(1, "XMSSMT_SHA2_20/2_256"));
        hashMap.put(a("SHA-256", 32, 67, 20, 4), new atag(2, "XMSSMT_SHA2_20/4_256"));
        hashMap.put(a("SHA-256", 32, 67, 40, 2), new atag(3, "XMSSMT_SHA2_40/2_256"));
        hashMap.put(a("SHA-256", 32, 67, 40, 4), new atag(4, "XMSSMT_SHA2_40/4_256"));
        hashMap.put(a("SHA-256", 32, 67, 40, 8), new atag(5, "XMSSMT_SHA2_40/8_256"));
        hashMap.put(a("SHA-256", 32, 67, 60, 3), new atag(6, "XMSSMT_SHA2_60/3_256"));
        hashMap.put(a("SHA-256", 32, 67, 60, 6), new atag(7, "XMSSMT_SHA2_60/6_256"));
        hashMap.put(a("SHA-256", 32, 67, 60, 12), new atag(8, "XMSSMT_SHA2_60/12_256"));
        hashMap.put(a("SHA-512", 64, 131, 20, 2), new atag(9, "XMSSMT_SHA2_20/2_512"));
        hashMap.put(a("SHA-512", 64, 131, 20, 4), new atag(10, "XMSSMT_SHA2_20/4_512"));
        hashMap.put(a("SHA-512", 64, 131, 40, 2), new atag(11, "XMSSMT_SHA2_40/2_512"));
        hashMap.put(a("SHA-512", 64, 131, 40, 4), new atag(12, "XMSSMT_SHA2_40/4_512"));
        hashMap.put(a("SHA-512", 64, 131, 40, 8), new atag(13, "XMSSMT_SHA2_40/8_512"));
        hashMap.put(a("SHA-512", 64, 131, 60, 3), new atag(14, "XMSSMT_SHA2_60/3_512"));
        hashMap.put(a("SHA-512", 64, 131, 60, 6), new atag(15, "XMSSMT_SHA2_60/6_512"));
        hashMap.put(a("SHA-512", 64, 131, 60, 12), new atag(16, "XMSSMT_SHA2_60/12_512"));
        hashMap.put(a("SHAKE128", 32, 67, 20, 2), new atag(17, "XMSSMT_SHAKE_20/2_256"));
        hashMap.put(a("SHAKE128", 32, 67, 20, 4), new atag(18, "XMSSMT_SHAKE_20/4_256"));
        hashMap.put(a("SHAKE128", 32, 67, 40, 2), new atag(19, "XMSSMT_SHAKE_40/2_256"));
        hashMap.put(a("SHAKE128", 32, 67, 40, 4), new atag(20, "XMSSMT_SHAKE_40/4_256"));
        hashMap.put(a("SHAKE128", 32, 67, 40, 8), new atag(21, "XMSSMT_SHAKE_40/8_256"));
        hashMap.put(a("SHAKE128", 32, 67, 60, 3), new atag(22, "XMSSMT_SHAKE_60/3_256"));
        hashMap.put(a("SHAKE128", 32, 67, 60, 6), new atag(23, "XMSSMT_SHAKE_60/6_256"));
        hashMap.put(a("SHAKE128", 32, 67, 60, 12), new atag(24, "XMSSMT_SHAKE_60/12_256"));
        hashMap.put(a("SHAKE256", 64, 131, 20, 2), new atag(25, "XMSSMT_SHAKE_20/2_512"));
        hashMap.put(a("SHAKE256", 64, 131, 20, 4), new atag(26, "XMSSMT_SHAKE_20/4_512"));
        hashMap.put(a("SHAKE256", 64, 131, 40, 2), new atag(27, "XMSSMT_SHAKE_40/2_512"));
        hashMap.put(a("SHAKE256", 64, 131, 40, 4), new atag(28, "XMSSMT_SHAKE_40/4_512"));
        hashMap.put(a("SHAKE256", 64, 131, 40, 8), new atag(29, "XMSSMT_SHAKE_40/8_512"));
        hashMap.put(a("SHAKE256", 64, 131, 60, 3), new atag(30, "XMSSMT_SHAKE_60/3_512"));
        hashMap.put(a("SHAKE256", 64, 131, 60, 6), new atag(31, "XMSSMT_SHAKE_60/6_512"));
        hashMap.put(a("SHAKE256", 64, 131, 60, 12), new atag(32, "XMSSMT_SHAKE_60/12_512"));
        a = DesugarCollections.unmodifiableMap(hashMap);
    }

    private atag(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public static String a(String str, int i, int i2, int i3, int i4) {
        return str + "-" + i + "-16-" + i2 + "-" + i3 + "-" + i4;
    }

    public final String toString() {
        return this.c;
    }
}
