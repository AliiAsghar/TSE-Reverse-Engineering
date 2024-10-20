package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arcs {
    public static final Logger a = Logger.getLogger(arcs.class.getName());

    private arcs() {
    }

    public static Object a(aoro aoroVar) {
        albo.U(aoroVar.r(), "unexpected end of JSON");
        int t = aoroVar.t() - 1;
        boolean z = true;
        if (t != 0) {
            if (t != 2) {
                if (t != 5) {
                    if (t != 6) {
                        if (t != 7) {
                            if (t == 8) {
                                aoroVar.p();
                                return null;
                            }
                            throw new IllegalStateException("Bad token: ".concat(aoroVar.e()));
                        }
                        return Boolean.valueOf(aoroVar.s());
                    }
                    return Double.valueOf(aoroVar.a());
                }
                return aoroVar.j();
            }
            aoroVar.m();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (aoroVar.r()) {
                linkedHashMap.put(aoroVar.h(), a(aoroVar));
            }
            if (aoroVar.t() != 4) {
                z = false;
            }
            albo.U(z, "Bad token: ".concat(aoroVar.e()));
            aoroVar.o();
            return DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        aoroVar.l();
        ArrayList arrayList = new ArrayList();
        while (aoroVar.r()) {
            arrayList.add(a(aoroVar));
        }
        if (aoroVar.t() != 2) {
            z = false;
        }
        albo.U(z, "Bad token: ".concat(aoroVar.e()));
        aoroVar.n();
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
