package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqoi implements aqoh {
    public static final ahvf a;
    public static final ahvf b;
    public static final ahvf c;
    public static final ahvf d;

    static {
        altg altgVar = altg.a;
        altx altxVar = new altx("CLIENT_LOGGING_PROD");
        a = ahvj.c("45415027", true, "com.google.android.libraries.performance.primes", altxVar, true, true);
        b = ahvj.d("8", new ahvh(14), "EOgHGAQ", "com.google.android.libraries.performance.primes", altxVar, true, true);
        c = ahvj.a("45401381", 3600000L, "com.google.android.libraries.performance.primes", altxVar, true, true);
        d = ahvj.c("45420903", false, "com.google.android.libraries.performance.primes", altxVar, true, true);
    }

    @Override // defpackage.aqoh
    public final long a(Context context) {
        return ((Long) c.a(context)).longValue();
    }

    @Override // defpackage.aqoh
    public final asja b(Context context) {
        return (asja) b.a(context);
    }

    @Override // defpackage.aqoh
    public final boolean c(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.aqoh
    public final boolean d(Context context) {
        return ((Boolean) d.a(context)).booleanValue();
    }
}
