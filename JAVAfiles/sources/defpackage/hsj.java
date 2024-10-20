package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsj {
    private static final hse a = new hsi(0);
    private final List b = new ArrayList();
    private final Set c = new HashSet();
    private final ecf d;

    public hsj(ecf ecfVar) {
        this.d = ecfVar;
    }

    private final void f(Class cls, Class cls2, hsf hsfVar, boolean z) {
        int i;
        kkc kkcVar = new kkc(cls, cls2, hsfVar);
        if (z) {
            i = this.b.size();
        } else {
            i = 0;
        }
        this.b.add(i, kkcVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, hsf] */
    private final hse g(kkc kkcVar) {
        hse b = kkcVar.c.b(this);
        hwr.i(b);
        return b;
    }

    public final synchronized hse a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (kkc kkcVar : this.b) {
                if (this.c.contains(kkcVar)) {
                    z = true;
                } else if (kkcVar.d(cls) && ((Class) kkcVar.b).isAssignableFrom(cls2)) {
                    this.c.add(kkcVar);
                    arrayList.add(g(kkcVar));
                    this.c.remove(kkcVar);
                }
            }
            if (arrayList.size() > 1) {
                return new hsh(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (hse) arrayList.get(0);
            }
            if (z) {
                return a;
            }
            throw new hlk(cls, cls2);
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public final synchronized List b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (kkc kkcVar : this.b) {
                if (!this.c.contains(kkcVar) && kkcVar.d(cls)) {
                    this.c.add(kkcVar);
                    arrayList.add(g(kkcVar));
                    this.c.remove(kkcVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized List c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (kkc kkcVar : this.b) {
            if (!arrayList.contains(kkcVar.b) && kkcVar.d(cls)) {
                arrayList.add(kkcVar.b);
            }
        }
        return arrayList;
    }

    public final synchronized void d(Class cls, Class cls2, hsf hsfVar) {
        f(cls, cls2, hsfVar, true);
    }

    public final synchronized void e(Class cls, Class cls2, hsf hsfVar) {
        f(cls, cls2, hsfVar, false);
    }
}
