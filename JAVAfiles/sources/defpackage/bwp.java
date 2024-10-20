package defpackage;

import defpackage.bwj;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwp {
    public static final Object a = new byq("provider");
    public static final Object b = new byq("provider");
    public static final Object c = new byq("compositionLocalMap");
    public static final Object d = new byq("providers");
    public static final Object e = new byq("reference");
    public static final Comparator f = new Comparator() { // from class: bwo
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return arro.a(((bxt) obj).b, ((bxt) obj2).b);
        }
    };

    public static final int a(boolean z) {
        if (z) {
            return 1;
        }
        return 0;
    }

    public static final int b(caa caaVar, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = caaVar.e(i);
            i3++;
        }
        return i3;
    }

    public static final int c(List list, int i) {
        int d2 = d(list, i);
        if (d2 < 0) {
            return -(d2 + 1);
        }
        return d2;
    }

    public static final int d(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int a2 = arro.a(((bxt) list.get(i3)).b, i);
            if (a2 < 0) {
                i2 = i3 + 1;
            } else if (a2 > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final bxt e(List list, int i, int i2) {
        int c2 = c(list, i);
        if (c2 < list.size()) {
            bxt bxtVar = (bxt) list.get(c2);
            if (bxtVar.b < i2) {
                return bxtVar;
            }
            return null;
        }
        return null;
    }

    public static final bxt f(List list, int i) {
        int d2 = d(list, i);
        if (d2 >= 0) {
            return (bxt) list.remove(d2);
        }
        return null;
    }

    public static final Void g(String str) {
        throw new bwi(a.bW(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void h(caa caaVar, List list, int i) {
        if (caaVar.z(i)) {
            list.add(caaVar.o(i));
            return;
        }
        int i2 = i + 1;
        int c2 = i + caaVar.c(i);
        while (i2 < c2) {
            h(caaVar, list, i2);
            i2 += caaVar.c(i2);
        }
    }

    public static final void i(String str) {
        throw new bwi(a.bW(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void j(cae caeVar, bzs bzsVar) {
        int i;
        int[] iArr = caeVar.b;
        int i2 = caeVar.o;
        int c2 = caeVar.c(iArr, caeVar.h(i2 + caeVar.j(i2)));
        for (int c3 = caeVar.c(caeVar.b, caeVar.h(caeVar.o)); c3 < c2; c3++) {
            Object obj = caeVar.c[caeVar.d(c3)];
            int i3 = -1;
            if (obj instanceof bwh) {
                ((cdo) bzsVar).d((bwh) obj, caeVar.g() - c3, -1, -1);
            } else if (obj instanceof bzu) {
                bzu bzuVar = (bzu) obj;
                bzt bztVar = bzuVar.a;
                if (!(bztVar instanceof bzx)) {
                    o(caeVar, c3, obj);
                    int g = caeVar.g() - c3;
                    bwa bwaVar = bzuVar.b;
                    if (bwaVar != null && bwaVar.a()) {
                        i3 = caeVar.a(bwaVar);
                        i = caeVar.g() - caeVar.p(i3);
                    } else {
                        i = -1;
                    }
                    ((cdo) bzsVar).d(bztVar, g, i3, i);
                }
            } else if (obj instanceof bzf) {
                o(caeVar, c3, obj);
                ((bzf) obj).c();
            }
        }
    }

    public static final void k(cae caeVar, bzs bzsVar) {
        int i;
        int[] iArr = caeVar.b;
        int i2 = caeVar.o;
        int c2 = caeVar.c(iArr, caeVar.h(i2 + caeVar.j(i2)));
        for (int c3 = caeVar.c(caeVar.b, caeVar.h(caeVar.o)); c3 < c2; c3++) {
            Object obj = caeVar.c[caeVar.d(c3)];
            int i3 = -1;
            if (obj instanceof bwh) {
                int g = caeVar.g() - c3;
                bwh bwhVar = (bwh) obj;
                cdo cdoVar = (cdo) bzsVar;
                vh vhVar = cdoVar.b;
                if (vhVar == null) {
                    vhVar = new vh((byte[]) null);
                    cdoVar.b = vhVar;
                }
                vhVar.h(bwhVar);
                cdoVar.d(bwhVar, g, -1, -1);
            }
            if (obj instanceof bzu) {
                int g2 = caeVar.g() - c3;
                bzu bzuVar = (bzu) obj;
                bwa bwaVar = bzuVar.b;
                if (bwaVar != null && bwaVar.a()) {
                    i3 = caeVar.a(bwaVar);
                    i = caeVar.g() - caeVar.p(i3);
                } else {
                    i = -1;
                }
                ((cdo) bzsVar).d(bzuVar.a, g2, i3, i);
            }
            if (obj instanceof bzf) {
                ((bzf) obj).c();
            }
        }
        caeVar.T();
    }

    public static final void l(List list, int i, int i2) {
        int c2 = c(list, i);
        while (c2 < list.size() && ((bxt) list.get(c2)).b < i2) {
            list.remove(c2);
        }
    }

    public static final void m(boolean z) {
        if (!z) {
            i("Check failed");
        }
    }

    public static final boolean n(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    private static final void o(cae caeVar, int i, Object obj) {
        int d2 = caeVar.d(i);
        Object[] objArr = caeVar.c;
        Object obj2 = objArr[d2];
        objArr[d2] = bwj.a.a;
        if (obj == obj2) {
            return;
        }
        i("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
