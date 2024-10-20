package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqof implements aqoe {
    public static final ahvf a;
    public static final ahvf b;
    public static final ahvf c;

    static {
        altg altgVar = altg.a;
        altx altxVar = new altx("CLIENT_LOGGING_PROD");
        a = ahvj.c("45408304", false, "com.google.android.libraries.performance.primes", altxVar, true, true);
        b = ahvj.d("40", new ahvh(12), "Ci1jb20uZ29vZ2xlLmFuZHJvaWQucHJpbWVzLWphbmstJVBBQ0tBR0VfTkFNRSUSIwgCEh9KPCVFVkVOVF9OQU1FJT4jbWlzc2VkQXBwRnJhbWVzEh8IAxIbSjwlRVZFTlRfTkFNRSU+I3RvdGFsRnJhbWVzEiYIBRIiSjwlRVZFTlRfTkFNRSU+I21heEZyYW1lVGltZU1pbGxpcw", "com.google.android.libraries.performance.primes", altxVar, true, true);
        c = ahvj.d("13", new ahvh(13), "EAAYAg", "com.google.android.libraries.performance.primes", altxVar, true, true);
    }

    @Override // defpackage.aqoe
    public final ahou a(Context context) {
        return (ahou) b.a(context);
    }

    @Override // defpackage.aqoe
    public final asja b(Context context) {
        return (asja) c.a(context);
    }

    @Override // defpackage.aqoe
    public final boolean c(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }
}
