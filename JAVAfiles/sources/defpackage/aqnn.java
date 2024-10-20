package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqnn implements aqnm {
    public static final ahvf a;
    public static final ahvf b;
    public static final ahvf c;
    public static final ahvf d;
    public static final ahvf e;
    public static final ahvf f;
    public static final ahvf g;
    public static final ahvf h;
    public static final ahvf i;
    public static final ahvf j;
    public static final ahvf k;

    static {
        altg altgVar = altg.a;
        alpt s = alpt.s("ANDROID_MESSAGING", "CARRIER_SERVICES", "ANDROID_MESSAGING_PRIMES");
        a = ahvj.c("45620741", true, "com.google.android.libraries.mobileconfiguration", s, true, false);
        b = ahvj.a("21", 86400L, "com.google.android.libraries.mobileconfiguration", s, true, false);
        c = ahvj.a("8", 86400L, "com.google.android.libraries.mobileconfiguration", s, true, false);
        d = ahvj.c("20", false, "com.google.android.libraries.mobileconfiguration", s, true, false);
        e = ahvj.c("13", false, "com.google.android.libraries.mobileconfiguration", s, true, false);
        f = ahvj.c("10", true, "com.google.android.libraries.mobileconfiguration", s, true, false);
        g = ahvj.c("14", false, "com.google.android.libraries.mobileconfiguration", s, true, false);
        h = ahvj.a("6", 604800L, "com.google.android.libraries.mobileconfiguration", s, true, false);
        i = ahvj.a("9", 3600L, "com.google.android.libraries.mobileconfiguration", s, true, false);
        j = ahvj.a("7", 3600L, "com.google.android.libraries.mobileconfiguration", s, true, false);
        k = ahvj.a("5", 3600L, "com.google.android.libraries.mobileconfiguration", s, true, false);
    }

    @Override // defpackage.aqnm
    public final long a(Context context) {
        return ((Long) b.a(context)).longValue();
    }

    @Override // defpackage.aqnm
    public final long b(Context context) {
        return ((Long) c.a(context)).longValue();
    }

    @Override // defpackage.aqnm
    public final long c(Context context) {
        return ((Long) h.a(context)).longValue();
    }

    @Override // defpackage.aqnm
    public final long d(Context context) {
        return ((Long) i.a(context)).longValue();
    }

    @Override // defpackage.aqnm
    public final long e(Context context) {
        return ((Long) j.a(context)).longValue();
    }

    @Override // defpackage.aqnm
    public final long f(Context context) {
        return ((Long) k.a(context)).longValue();
    }

    @Override // defpackage.aqnm
    public final boolean g(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.aqnm
    public final boolean h(Context context) {
        return ((Boolean) d.a(context)).booleanValue();
    }

    @Override // defpackage.aqnm
    public final boolean i(Context context) {
        return ((Boolean) e.a(context)).booleanValue();
    }

    @Override // defpackage.aqnm
    public final boolean j(Context context) {
        return ((Boolean) f.a(context)).booleanValue();
    }

    @Override // defpackage.aqnm
    public final boolean k(Context context) {
        return ((Boolean) g.a(context)).booleanValue();
    }
}
