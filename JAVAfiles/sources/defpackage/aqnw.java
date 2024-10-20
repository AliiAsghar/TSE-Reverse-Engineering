package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqnw implements aqnv {
    public static final ahvf a;
    public static final ahvf b;
    public static final ahvf c;

    static {
        altg altgVar = altg.a;
        altx altxVar = new altx("CLIENT_LOGGING_PROD");
        a = ahvj.d("15", new ahvh(7), "EAAYAg", "com.google.android.libraries.performance.primes", altxVar, true, true);
        int i = 8;
        b = ahvj.d("45357002", new ahvh(i), "CAASABgAIAAoADAAOABAAA", "com.google.android.libraries.performance.primes", altxVar, true, true);
        c = ahvj.d("45355611", new ahvh(i), "CAASABgAIAAoADAAOABAAA", "com.google.android.libraries.performance.primes", altxVar, true, true);
    }

    @Override // defpackage.aqnv
    public final ahng a(Context context) {
        return (ahng) b.a(context);
    }

    @Override // defpackage.aqnv
    public final ahng b(Context context) {
        return (ahng) c.a(context);
    }

    @Override // defpackage.aqnv
    public final asja c(Context context) {
        return (asja) a.a(context);
    }
}
