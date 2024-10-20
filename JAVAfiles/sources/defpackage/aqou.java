package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqou implements aqot {
    public static final ahvf a;
    public static final ahvf b;
    public static final ahvf c;
    public static final ahvf d;
    public static final ahvf e;
    public static final ahvf f;

    static {
        altg altgVar = altg.a;
        altx altxVar = new altx("CLIENT_LOGGING_PROD");
        a = ahvj.a("45641094", 2L, "com.google.android.libraries.performance.primes", altxVar, true, true);
        b = ahvj.c("3", false, "com.google.android.libraries.performance.primes", altxVar, true, true);
        c = ahvj.a("45357887", 1L, "com.google.android.libraries.performance.primes", altxVar, true, true);
        d = ahvj.d("19", new ahvh(17), "EAAYAg", "com.google.android.libraries.performance.primes", altxVar, true, true);
        e = ahvj.c("45641093", false, "com.google.android.libraries.performance.primes", altxVar, true, true);
        f = ahvj.a("45628530", 0L, "com.google.android.libraries.performance.primes", altxVar, true, true);
    }

    @Override // defpackage.aqot
    public final long a(Context context) {
        return ((Long) a.a(context)).longValue();
    }

    @Override // defpackage.aqot
    public final long b(Context context) {
        return ((Long) c.a(context)).longValue();
    }

    @Override // defpackage.aqot
    public final long c(Context context) {
        return ((Long) f.a(context)).longValue();
    }

    @Override // defpackage.aqot
    public final asja d(Context context) {
        return (asja) d.a(context);
    }

    @Override // defpackage.aqot
    public final boolean e(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.aqot
    public final boolean f(Context context) {
        return ((Boolean) e.a(context)).booleanValue();
    }
}
