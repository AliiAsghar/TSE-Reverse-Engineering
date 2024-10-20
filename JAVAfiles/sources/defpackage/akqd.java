package defpackage;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akqd {
    public static final /* synthetic */ int a = 0;
    private static final WeakHashMap b = new WeakHashMap();
    private static final WeakHashMap c = new WeakHashMap();

    public static void a(Throwable th) {
        WeakHashMap weakHashMap = c;
        synchronized (weakHashMap) {
            weakHashMap.put(th, true);
        }
    }

    public static void b(Throwable th) {
        Throwable th2;
        boolean z;
        synchronized (c) {
            th2 = th;
            while (th2 != null) {
                if (c.containsKey(th2)) {
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
            WeakHashMap weakHashMap = c;
            if (th2 != null) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(th, Boolean.valueOf(z));
        }
        if (th2 == null && c(th) == null) {
            ArrayList arrayList = new ArrayList();
            for (akry c2 = akqj.c(); c2 != null; c2 = c2.a()) {
                arrayList.add(c2);
            }
            alob d = alog.d(arrayList.size());
            alob d2 = alog.d(arrayList.size());
            for (akry akryVar : alzz.ar(arrayList)) {
                d2.h(akryVar.c());
                d.h(akryVar.i());
            }
            alog g = d2.g();
            d.g();
            aksz akszVar = new aksz(g);
            WeakHashMap weakHashMap2 = b;
            synchronized (weakHashMap2) {
                weakHashMap2.put(th, akszVar);
            }
        }
    }

    public static ahmn c(Throwable th) {
        albo.U(true, "Trace uncaught exception is disabled.");
        synchronized (b) {
            Throwable th2 = th;
            while (th2 != null) {
                try {
                    if (b.containsKey(th2)) {
                        break;
                    }
                    th2 = th2.getCause();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (th2 == null) {
                return null;
            }
            WeakHashMap weakHashMap = b;
            aksz akszVar = (aksz) weakHashMap.get(th2);
            weakHashMap.put(th, akszVar);
            return new ahmn(akszVar, null);
        }
    }
}
