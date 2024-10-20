package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqnq implements aqnp {
    public static final ahvf a;
    public static final ahvf b;
    public static final ahvf c;
    public static final ahvf d;

    static {
        altg altgVar = altg.a;
        altx altxVar = new altx("CLIENT_LOGGING_PROD");
        a = ahvj.c("45352228", true, "com.google.android.libraries.performance.primes", altxVar, true, true);
        b = ahvj.d("45352241", new ahvh(5), "CAYIBAgFCAM", "com.google.android.libraries.performance.primes", altxVar, true, true);
        c = ahvj.c("45633315", false, "com.google.android.libraries.performance.primes", altxVar, true, true);
        d = ahvj.a("45646085", 175500L, "com.google.android.libraries.performance.primes", altxVar, true, true);
    }

    @Override // defpackage.aqnp
    public final long a(Context context) {
        return ((Long) d.a(context)).longValue();
    }

    @Override // defpackage.aqnp
    public final ashc b(Context context) {
        return (ashc) b.a(context);
    }

    @Override // defpackage.aqnp
    public final boolean c(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.aqnp
    public final boolean d(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }
}
