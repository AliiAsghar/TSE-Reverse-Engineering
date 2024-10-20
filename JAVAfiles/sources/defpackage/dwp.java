package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwp {
    public final dwd a;
    public final dwd d;
    public dwm f;
    final ArrayList g;
    private final dwl h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();

    public dwp(dwd dwdVar) {
        new ArrayList();
        this.f = null;
        this.h = new dwl();
        this.g = new ArrayList();
        this.a = dwdVar;
        this.d = dwdVar;
    }

    private final void e(dwy dwyVar, int i, ArrayList arrayList) {
        for (dwo dwoVar : dwyVar.h.j) {
            if (dwoVar instanceof dwq) {
                g((dwq) dwoVar, i, dwyVar.i, arrayList, null);
            } else if (dwoVar instanceof dwy) {
                g(((dwy) dwoVar).h, i, dwyVar.i, arrayList, null);
            }
        }
        for (dwo dwoVar2 : dwyVar.i.j) {
            if (dwoVar2 instanceof dwq) {
                g((dwq) dwoVar2, i, dwyVar.h, arrayList, null);
            } else if (dwoVar2 instanceof dwy) {
                g(((dwy) dwoVar2).i, i, dwyVar.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (dwo dwoVar3 : ((dww) dwyVar).a.j) {
                if (dwoVar3 instanceof dwq) {
                    g((dwq) dwoVar3, 1, null, arrayList, null);
                }
            }
        }
    }

    private final void f(dwc dwcVar, int i, int i2, int i3, int i4) {
        dwl dwlVar = this.h;
        dwlVar.i = i;
        dwlVar.j = i3;
        dwlVar.a = i2;
        dwlVar.b = i4;
        this.f.b(dwcVar, dwlVar);
        dwcVar.M(this.h.c);
        dwcVar.B(this.h.d);
        dwl dwlVar2 = this.h;
        dwcVar.P = dwlVar2.f;
        dwcVar.x(dwlVar2.e);
    }

    private final void g(dwq dwqVar, int i, dwq dwqVar2, ArrayList arrayList, fcp fcpVar) {
        dwy dwyVar = dwqVar.d;
        if (dwyVar.l == null) {
            dwd dwdVar = this.a;
            if (dwyVar != dwdVar.o && dwyVar != dwdVar.p) {
                if (fcpVar == null) {
                    fcpVar = new fcp(dwyVar);
                    arrayList.add(fcpVar);
                }
                dwyVar.l = fcpVar;
                ((ArrayList) fcpVar.a).add(dwyVar);
                for (dwo dwoVar : dwyVar.h.j) {
                    if (dwoVar instanceof dwq) {
                        g((dwq) dwoVar, i, dwqVar2, arrayList, fcpVar);
                    }
                }
                for (dwo dwoVar2 : dwyVar.i.j) {
                    if (dwoVar2 instanceof dwq) {
                        g((dwq) dwoVar2, i, dwqVar2, arrayList, fcpVar);
                    }
                }
                if (i == 1 && (dwyVar instanceof dww)) {
                    for (dwo dwoVar3 : ((dww) dwyVar).a.j) {
                        if (dwoVar3 instanceof dwq) {
                            g((dwq) dwoVar3, 1, dwqVar2, arrayList, fcpVar);
                        }
                    }
                }
                Iterator it = dwyVar.h.k.iterator();
                while (it.hasNext()) {
                    g((dwq) it.next(), i, dwqVar2, arrayList, fcpVar);
                }
                Iterator it2 = dwyVar.i.k.iterator();
                while (it2.hasNext()) {
                    g((dwq) it2.next(), i, dwqVar2, arrayList, fcpVar);
                }
                if (i == 1 && (dwyVar instanceof dww)) {
                    Iterator it3 = ((dww) dwyVar).a.k.iterator();
                    while (it3.hasNext()) {
                        g((dwq) it3.next(), 1, dwqVar2, arrayList, fcpVar);
                    }
                }
            }
        }
    }

    public final int a(dwd dwdVar, int i) {
        dwq dwqVar;
        dwq dwqVar2;
        long a;
        float f;
        long j;
        dwp dwpVar = this;
        dwd dwdVar2 = dwdVar;
        int size = dwpVar.g.size();
        int i2 = 0;
        long j2 = 0;
        long j3 = 0;
        while (i2 < size) {
            fcp fcpVar = (fcp) dwpVar.g.get(i2);
            Object obj = fcpVar.b;
            if (!(obj instanceof dwn) ? !(i != 0 ? (obj instanceof dww) : (obj instanceof dwv)) : ((dwn) obj).f != i) {
                a = j2;
            } else {
                if (i == 0) {
                    dwqVar = dwdVar2.o.h;
                } else {
                    dwqVar = dwdVar2.p.h;
                }
                if (i == 0) {
                    dwqVar2 = dwdVar2.o.i;
                } else {
                    dwqVar2 = dwdVar2.p.i;
                }
                boolean contains = ((dwy) obj).h.k.contains(dwqVar);
                boolean contains2 = ((dwy) fcpVar.b).i.k.contains(dwqVar2);
                long a2 = ((dwy) fcpVar.b).a();
                if (contains && contains2) {
                    long j4 = fcpVar.j(((dwy) fcpVar.b).h, j2);
                    long i3 = fcpVar.i(((dwy) fcpVar.b).i, j2);
                    long j5 = j4 - a2;
                    dwy dwyVar = (dwy) fcpVar.b;
                    long j6 = dwyVar.i.e;
                    if (j5 >= (-r5)) {
                        j5 += j6;
                    }
                    long j7 = (-i3) - a2;
                    long j8 = dwyVar.h.e;
                    long j9 = j7 - j8;
                    if (j9 >= j8) {
                        j9 -= j8;
                    }
                    dwc dwcVar = dwyVar.d;
                    if (i == 0) {
                        f = dwcVar.ao;
                    } else {
                        f = dwcVar.ap;
                    }
                    float f2 = 1.0f - f;
                    if (f > brg.a) {
                        j = (((float) j9) / f) + (((float) j5) / f2);
                    } else {
                        j = 0;
                    }
                    float f3 = (float) j;
                    a = (j8 + ((((f * f3) + 0.5f) + a2) + ((f3 * f2) + 0.5f))) - j6;
                } else if (contains) {
                    a = Math.max(fcpVar.j(((dwy) fcpVar.b).h, r0.e), ((dwy) fcpVar.b).h.e + a2);
                } else if (contains2) {
                    a = Math.max(-fcpVar.i(((dwy) fcpVar.b).i, r0.e), (-((dwy) fcpVar.b).i.e) + a2);
                } else {
                    a = (r0.h.e + ((dwy) fcpVar.b).a()) - ((dwy) fcpVar.b).i.e;
                }
            }
            j3 = Math.max(j3, a);
            i2++;
            dwpVar = this;
            dwdVar2 = dwdVar;
            j2 = 0;
        }
        return (int) j3;
    }

    public final void b() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.d.o.d();
        this.d.p.d();
        arrayList.add(this.d.o);
        arrayList.add(this.d.p);
        ArrayList arrayList2 = this.d.aL;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            dwc dwcVar = (dwc) arrayList2.get(i);
            if (dwcVar instanceof dwg) {
                arrayList.add(new dwt(dwcVar));
            } else {
                if (dwcVar.R()) {
                    if (dwcVar.m == null) {
                        dwcVar.m = new dwn(dwcVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dwcVar.m);
                } else {
                    arrayList.add(dwcVar.o);
                }
                if (dwcVar.S()) {
                    if (dwcVar.n == null) {
                        dwcVar.n = new dwn(dwcVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dwcVar.n);
                } else {
                    arrayList.add(dwcVar.p);
                }
                if (dwcVar instanceof dwh) {
                    arrayList.add(new dwu(dwcVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((dwy) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            dwy dwyVar = (dwy) arrayList.get(i3);
            if (dwyVar.d != this.d) {
                dwyVar.b();
            }
        }
        this.g.clear();
        fcp.c = 0;
        e(this.a.o, 0, this.g);
        e(this.a.p, 1, this.g);
        this.b = false;
    }

    public final void c() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        dwr dwrVar;
        ArrayList arrayList = this.a.aL;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            dwc dwcVar = (dwc) arrayList.get(i3);
            if (!dwcVar.l) {
                int[] iArr = dwcVar.aA;
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = dwcVar.C;
                int i7 = dwcVar.D;
                if (i4 != 2) {
                    if (i4 == 3) {
                        if (i6 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        i = 3;
                    } else {
                        i = i4;
                        z = false;
                    }
                } else {
                    i = i4;
                    z = true;
                }
                if (i5 != 2) {
                    if (i5 == 3) {
                        if (i7 == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        i2 = 3;
                    } else {
                        i2 = i5;
                        z2 = false;
                    }
                } else {
                    i2 = i5;
                    z2 = true;
                }
                dwr dwrVar2 = dwcVar.o.e;
                boolean z3 = dwrVar2.i;
                dwr dwrVar3 = dwcVar.p.e;
                boolean z4 = dwrVar3.i;
                if (z3 && z4) {
                    f(dwcVar, 1, dwrVar2.f, 1, dwrVar3.f);
                    dwcVar.l = true;
                } else if (z3 && z2) {
                    f(dwcVar, 1, dwrVar2.f, 2, dwrVar3.f);
                    if (i2 == 3) {
                        dwcVar.p.e.m = dwcVar.h();
                    } else {
                        dwcVar.p.e.c(dwcVar.h());
                        dwcVar.l = true;
                    }
                } else if (z4 && z) {
                    f(dwcVar, 2, dwrVar2.f, 1, dwrVar3.f);
                    if (i == 3) {
                        dwcVar.o.e.m = dwcVar.j();
                    } else {
                        dwcVar.o.e.c(dwcVar.j());
                        dwcVar.l = true;
                    }
                }
                if (dwcVar.l && (dwrVar = dwcVar.p.b) != null) {
                    dwrVar.c(dwcVar.al);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.dwd r18) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwp.d(dwd):void");
    }
}
