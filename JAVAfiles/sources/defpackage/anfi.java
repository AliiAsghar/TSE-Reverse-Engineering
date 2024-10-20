package defpackage;

import android.content.Context;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anfi {
    public static volatile Context a;
    private static final Map b = new ConcurrentHashMap();
    private final ansy c;

    public anfi() {
        throw null;
    }

    public static boolean a(String str, String str2) {
        Object obj;
        Supplier m330m = d$$ExternalSyntheticApiModelOutline0.m330m(Map.EL.getOrDefault(b, str2, new akxz(17)));
        m330m.getClass();
        obj = m330m.get();
        return ((anfi) obj).c.e(str);
    }

    public static Context b() {
        Context context = a;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        return applicationContext;
    }

    public anfi(ansy ansyVar) {
        this.c = ansyVar;
    }
}
