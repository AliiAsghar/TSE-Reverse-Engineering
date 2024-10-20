package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwp {
    public static final cga.c a(cbh cbhVar) {
        int i;
        if (cbhVar != null && (i = cbhVar.b) != 0) {
            return (cga.c) cbhVar.c(i - 1);
        }
        return null;
    }

    public static final clc b(cwo cwoVar) {
        return ((dai) g(cwoVar)).n;
    }

    public static final cti c(cwo cwoVar) {
        if (!cwoVar.A().z) {
            csg.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        cyn f = f(cwoVar, 2);
        if (!f.r()) {
            csg.c("LayoutCoordinates is not attached.");
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final cxi d(cga.c cVar) {
        if ((cVar.q & 2) != 0) {
            if (cVar instanceof cxi) {
                return (cxi) cVar;
            }
            if (cVar instanceof cwr) {
                cga.c cVar2 = ((cwr) cVar).B;
                while (cVar2 != 0) {
                    if (cVar2 instanceof cxi) {
                        return (cxi) cVar2;
                    }
                    if ((cVar2 instanceof cwr) && (cVar2.q & 2) != 0) {
                        cVar2 = ((cwr) cVar2).B;
                    } else {
                        cVar2 = cVar2.t;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static final cxn e(cwo cwoVar) {
        cyn cynVar = cwoVar.A().v;
        if (cynVar != null) {
            return cynVar.r;
        }
        csg.a("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new armj();
    }

    public static final cyn f(cwo cwoVar, int i) {
        cyn cynVar = cwoVar.A().v;
        cynVar.getClass();
        if (cynVar.y() == cwoVar && cyp.h(i)) {
            cyn cynVar2 = cynVar.u;
            cynVar2.getClass();
            return cynVar2;
        }
        return cynVar;
    }

    public static final czb g(cwo cwoVar) {
        czb czbVar = e(cwoVar).l;
        if (czbVar != null) {
            return czbVar;
        }
        csg.a("This node does not have an owner.");
        throw new armj();
    }

    public static final dqv h(cwo cwoVar) {
        return e(cwoVar).q;
    }

    public static final drk i(cwo cwoVar) {
        return e(cwoVar).r;
    }

    public static final /* synthetic */ void j(cbh cbhVar, cga.c cVar) {
        cbh o = e(cVar).o();
        int i = o.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = o.a;
            do {
                cbhVar.n(((cxn) objArr[i2]).w.e);
                i2--;
            } while (i2 >= 0);
        }
    }
}
