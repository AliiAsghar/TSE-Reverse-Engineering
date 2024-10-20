package defpackage;

import android.util.Log;
import defpackage.cvc;
import defpackage.dqs;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duj implements dwm {
    private final dwd a;
    private final Map b;
    private final Map c;
    private final Map d;
    private final int[] e;
    private final int[] f;
    private final dvo g;

    public duj(dqv dqvVar) {
        dwd dwdVar = new dwd(null);
        dwdVar.af(this);
        this.a = dwdVar;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.g = new dvo(dqvVar);
        this.e = new int[2];
        this.f = new int[2];
        new ArrayList();
    }

    private final long e(dwc dwcVar, long j) {
        int i;
        boolean z = dwcVar instanceof dwj;
        Object obj = dwcVar.aq;
        String str = dwcVar.v;
        int i2 = 0;
        if (z) {
            if (dqs.j(j)) {
                i = 1073741824;
            } else if (dqs.h(j)) {
                i = Integer.MIN_VALUE;
            } else {
                i = 0;
            }
            if (dqs.i(j)) {
                i2 = 1073741824;
            } else if (dqs.g(j)) {
                i2 = Integer.MIN_VALUE;
            }
            dwj dwjVar = (dwj) dwcVar;
            dwjVar.b(i, dqs.b(j), i2, dqs.a(j));
            return tu.c(dwjVar.aU, dwjVar.aV);
        }
        if (obj instanceof cuc) {
            cvc e = ((cuc) obj).e(j);
            this.b.put(obj, e);
            return tu.c(e.a, e.b);
        }
        Log.w("CCL", "Nothing to measure for widget: ".concat(String.valueOf(str)));
        return tu.c(0, 0);
    }

    private static final void f(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5, int[] iArr) {
        boolean z3;
        int i6;
        if (i != 0) {
            int i7 = i - 1;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        iArr[0] = i5;
                        iArr[1] = i5;
                        return;
                    }
                    if (!z2 && (i4 == 1 ? !(i3 != 1 || z) : i4 != 2)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (true != z3) {
                        i6 = 0;
                    } else {
                        i6 = i2;
                    }
                    iArr[0] = i6;
                    if (true != z3) {
                        i2 = i5;
                    }
                    iArr[1] = i2;
                    return;
                }
                iArr[0] = 0;
                iArr[1] = i5;
                return;
            }
            iArr[0] = i2;
            iArr[1] = i2;
            return;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0191  */
    @Override // defpackage.dwm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.dwc r24, defpackage.dwl r25) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duj.b(dwc, dwl):void");
    }

    public final void c(cvc.a aVar, List list) {
        cuc cucVar;
        cvc cvcVar;
        Object obj;
        if (this.d.isEmpty()) {
            ArrayList arrayList = this.a.aL;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dwc dwcVar = (dwc) arrayList.get(i);
                Object obj2 = dwcVar.aq;
                if (obj2 instanceof cuc) {
                    dvp dvpVar = dwcVar.u;
                    dwc dwcVar2 = dvpVar.a;
                    if (dwcVar2 != null) {
                        dvpVar.b = dwcVar2.k();
                        dvpVar.c = dvpVar.a.l();
                        dvpVar.d = dvpVar.a.i();
                        dvpVar.e = dvpVar.a.g();
                        dvpVar.a(dvpVar.a.u);
                    }
                    this.d.put(obj2, new dvp(dvpVar));
                }
            }
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            cuc cucVar2 = (cuc) list.get(i2);
            if (!this.d.containsKey(cucVar2)) {
                Iterator it = this.d.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        cuc cucVar3 = (cuc) obj;
                        if (ctk.b(cucVar3) != null && d.F(ctk.b(cucVar3), ctk.b(cucVar2))) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                cucVar = (cuc) obj;
                if (cucVar == null) {
                    continue;
                }
            } else {
                cucVar = cucVar2;
            }
            dvp dvpVar2 = (dvp) this.d.get(cucVar);
            if (dvpVar2 != null && (cvcVar = (cvc) this.b.get(cucVar)) != null) {
                if (!this.d.containsKey(cucVar2)) {
                    ef.u(aVar, cucVar2.e(dqs.a.c(cvcVar.a, cvcVar.b)), dvpVar2);
                } else {
                    ef.u(aVar, cvcVar, dvpVar2);
                }
            } else {
                return;
            }
        }
    }

    public final long d(long j, drk drkVar, duh duhVar, List list) {
        dvj dvjVar;
        dvj dvjVar2;
        boolean z;
        dvk dvkVar;
        dwh x;
        dwh x2;
        dud dudVar;
        if (list.isEmpty()) {
            return drj.a(dqs.d(j), dqs.c(j));
        }
        dvo dvoVar = this.g;
        if (dqs.j(j)) {
            dvjVar = dvj.a(dqs.b(j));
        } else {
            dvjVar = new dvj(dvj.b);
            dvjVar.e(dqs.d(j));
        }
        dvoVar.f.ad = dvjVar;
        dvo dvoVar2 = this.g;
        if (dqs.i(j)) {
            dvjVar2 = dvj.a(dqs.a(j));
        } else {
            dvjVar2 = new dvj(dvj.b);
            dvjVar2.e(dqs.c(j));
        }
        dvoVar2.f.ae = dvjVar2;
        this.g.f.ad.d(this.a, 0);
        this.g.f.ae.d(this.a, 1);
        dvo dvoVar3 = this.g;
        dvoVar3.k = j;
        if (drkVar == drk.b) {
            z = true;
        } else {
            z = false;
        }
        dvoVar3.b = !z;
        this.b.clear();
        this.c.clear();
        this.d.clear();
        if (!duhVar.c && list.size() == duhVar.e.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object f = ((cuc) list.get(i)).f();
                if (f instanceof dud) {
                    dudVar = (dud) f;
                } else {
                    dudVar = null;
                }
                if (d.F(dudVar, duhVar.e.get(i))) {
                }
            }
            ef.v(this.g, list);
            this.a.M(dqs.b(j));
            this.a.B(dqs.a(j));
            this.a.ah();
            this.a.ag(257);
            dwd dwdVar = this.a;
            dwdVar.ak(dwdVar.aB, 0, 0, 0, 0, 0, 0);
            dwd dwdVar2 = this.a;
            return drj.a(dwdVar2.j(), dwdVar2.h());
        }
        dvo dvoVar4 = this.g;
        Iterator it = dvoVar4.c.keySet().iterator();
        while (it.hasNext()) {
            ((dvl) dvoVar4.c.get(it.next())).b().u();
        }
        dvoVar4.c.clear();
        dvoVar4.c.put(dvo.a, dvoVar4.f);
        dvoVar4.d.clear();
        dvoVar4.e.clear();
        dvoVar4.g.clear();
        dvoVar4.i = true;
        dvo dvoVar5 = this.g;
        duhVar.e.clear();
        duhVar.b.c(arnb.a, duhVar.d, new dug(list, duhVar, dvoVar5));
        duhVar.c = false;
        ef.v(this.g, list);
        dvo dvoVar6 = this.g;
        dwd dwdVar3 = this.a;
        dwdVar3.ao();
        dvoVar6.f.ad.d(dwdVar3, 0);
        dvoVar6.f.ae.d(dwdVar3, 1);
        for (Object obj : dvoVar6.d.keySet()) {
            dwh x3 = ((dvk) dvoVar6.d.get(obj)).x();
            if (x3 != null) {
                dvl dvlVar = (dvl) dvoVar6.c.get(obj);
                if (dvlVar == null) {
                    dvlVar = dvoVar6.b(obj);
                }
                dvlVar.f(x3);
            }
        }
        for (Object obj2 : dvoVar6.c.keySet()) {
            dvl dvlVar2 = (dvl) dvoVar6.c.get(obj2);
            if (dvlVar2 != dvoVar6.f && (dvlVar2.a() instanceof dvk) && (x2 = ((dvk) dvlVar2.a()).x()) != null) {
                dvl dvlVar3 = (dvl) dvoVar6.c.get(obj2);
                if (dvlVar3 == null) {
                    dvlVar3 = dvoVar6.b(obj2);
                }
                dvlVar3.f(x2);
            }
        }
        Iterator it2 = dvoVar6.c.keySet().iterator();
        while (it2.hasNext()) {
            dvl dvlVar4 = (dvl) dvoVar6.c.get(it2.next());
            if (dvlVar4 != dvoVar6.f) {
                dwc b = dvlVar4.b();
                b.as = dvlVar4.d().toString();
                b.ae = null;
                if (dvlVar4.a() instanceof dvv) {
                    dvlVar4.e();
                }
                dwdVar3.am(b);
            } else {
                dvlVar4.f(dwdVar3);
            }
        }
        Iterator it3 = dvoVar6.d.keySet().iterator();
        while (it3.hasNext()) {
            dvk dvkVar2 = (dvk) dvoVar6.d.get(it3.next());
            if (dvkVar2.x() != null) {
                ArrayList arrayList = dvkVar2.am;
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    dvkVar2.x().af(((dvl) dvoVar6.c.get(arrayList.get(i2))).b());
                }
                dvkVar2.e();
            } else {
                dvkVar2.e();
            }
        }
        Iterator it4 = dvoVar6.c.keySet().iterator();
        while (it4.hasNext()) {
            dvl dvlVar5 = (dvl) dvoVar6.c.get(it4.next());
            if (dvlVar5 != dvoVar6.f && (dvlVar5.a() instanceof dvk) && (x = (dvkVar = (dvk) dvlVar5.a()).x()) != null) {
                ArrayList arrayList2 = dvkVar.am;
                int size3 = arrayList2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    Object obj3 = arrayList2.get(i3);
                    dvl dvlVar6 = (dvl) dvoVar6.c.get(obj3);
                    if (dvlVar6 != null) {
                        x.af(dvlVar6.b());
                    } else if (obj3 instanceof dvl) {
                        x.af(((dvl) obj3).b());
                    } else {
                        PrintStream printStream = System.out;
                        Objects.toString(obj3);
                        printStream.println("couldn't find reference for ".concat(String.valueOf(obj3)));
                    }
                }
                dvlVar5.e();
            }
        }
        for (Object obj4 : dvoVar6.c.keySet()) {
            dvl dvlVar7 = (dvl) dvoVar6.c.get(obj4);
            dvlVar7.e();
            dwc b2 = dvlVar7.b();
            if (b2 != null && obj4 != null) {
                b2.v = obj4.toString();
            }
        }
        this.a.M(dqs.b(j));
        this.a.B(dqs.a(j));
        this.a.ah();
        this.a.ag(257);
        dwd dwdVar4 = this.a;
        dwdVar4.ak(dwdVar4.aB, 0, 0, 0, 0, 0, 0);
        dwd dwdVar22 = this.a;
        return drj.a(dwdVar22.j(), dwdVar22.h());
    }

    @Override // defpackage.dwm
    public final void a() {
    }
}
