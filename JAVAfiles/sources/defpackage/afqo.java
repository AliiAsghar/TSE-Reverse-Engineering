package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afqo {
    private final afqs a;

    public afqo(afqs afqsVar) {
        this.a = afqsVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Collection, java.lang.Iterable] */
    public final boolean equals(Object obj) {
        if (obj instanceof afqo) {
            afqs afqsVar = this.a;
            afqs afqsVar2 = ((afqo) obj).a;
            if (!d.F(afqsVar.h(), afqsVar2.h()) && !d.F(afqsVar.i(), afqsVar2.i())) {
                ?? f = afqsVar2.f();
                if (!f.isEmpty()) {
                    Iterator it = f.iterator();
                    while (it.hasNext()) {
                        if (d.F(((afqr) it.next()).b, afqsVar.i())) {
                            return true;
                        }
                    }
                }
                ?? f2 = afqsVar.f();
                if (!f2.isEmpty()) {
                    Iterator it2 = f2.iterator();
                    while (it2.hasNext()) {
                        if (d.F(((afqr) it2.next()).b, afqsVar2.i())) {
                            return true;
                        }
                    }
                }
                if (arsd.M(afqsVar.h()) || arsd.M(afqsVar2.h())) {
                    ?? f3 = afqsVar2.f();
                    if (!f3.isEmpty()) {
                        for (afqr afqrVar : f3) {
                            ?? f4 = afqsVar.f();
                            if (!f4.isEmpty()) {
                                Iterator it3 = f4.iterator();
                                while (it3.hasNext()) {
                                    if (d.F(((afqr) it3.next()).b, afqrVar.b)) {
                                        return true;
                                    }
                                }
                            }
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
