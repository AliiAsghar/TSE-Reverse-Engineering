package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xfy {
    public static final /* synthetic */ int a = 0;

    static {
        utz utzVar = xfz.a;
    }

    public static void a(xyd xydVar, int i) {
        boolean z;
        synchronized (xydVar.a) {
            z = xydVar.b;
        }
        if (z && i >= 40) {
            ((LruCache) xydVar.get()).evictAll();
            xydVar.a();
        }
    }
}
