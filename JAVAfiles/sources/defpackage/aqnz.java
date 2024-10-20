package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqnz implements aqny {
    public static final ahvf a;
    public static final ahvf b;
    public static final ahvf c;
    public static final ahvf d;
    public static final ahvf e;
    public static final ahvf f;

    static {
        altg altgVar = altg.a;
        altx altxVar = new altx("CLIENT_LOGGING_PROD");
        a = ahvj.d("45390627", new ahvh(9), "CAAQAxgGIJBOLQrXIzw", "com.google.android.libraries.performance.primes", altxVar, true, true);
        b = ahvj.d("45376983", new ahvh(10), "CAEQZBj0AyDoBw", "com.google.android.libraries.performance.primes", altxVar, true, true);
        c = ahvj.c("45625683", false, "com.google.android.libraries.performance.primes", altxVar, true, true);
        d = ahvj.c("45617767", false, "com.google.android.libraries.performance.primes", altxVar, true, true);
        e = ahvj.c("33", false, "com.google.android.libraries.performance.primes", altxVar, true, true);
        f = ahvj.d("45371370", new ahvh(11), "CJYBEMgB", "com.google.android.libraries.performance.primes", altxVar, true, true);
    }

    @Override // defpackage.aqny
    public final ahnk a(Context context) {
        return (ahnk) a.a(context);
    }

    @Override // defpackage.aqny
    public final ahnr b(Context context) {
        return (ahnr) f.a(context);
    }

    @Override // defpackage.aqny
    public final ahns c(Context context) {
        return (ahns) b.a(context);
    }

    @Override // defpackage.aqny
    public final boolean d(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }

    @Override // defpackage.aqny
    public final boolean e(Context context) {
        return ((Boolean) d.a(context)).booleanValue();
    }

    @Override // defpackage.aqny
    public final boolean f(Context context) {
        return ((Boolean) e.a(context)).booleanValue();
    }
}
