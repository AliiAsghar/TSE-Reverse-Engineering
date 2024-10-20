package defpackage;

import defpackage.cet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cem extends ces {
    private static final int[] k = new int[0];
    public final arqr a;
    public final arqr b;
    public cev c;
    public int[] d;
    public boolean e;
    public vh f;
    private int l;
    private List m;
    private int n;

    public cem(int i, cev cevVar, arqr arqrVar, arqr arqrVar2) {
        super(i, cevVar);
        this.a = arqrVar;
        this.b = arqrVar2;
        this.c = cev.a;
        this.d = k;
        this.n = 1;
    }

    private final void F() {
        if (this.e && this.j < 0) {
            byy.b("Unsupported operation on a disposed or applied snapshot");
        }
    }

    public cem a(arqr arqrVar, arqr arqrVar2) {
        cen cenVar;
        arqr p;
        C();
        F();
        o(v());
        synchronized (cex.c) {
            int i = cex.e;
            cex.e = i + 1;
            cex.d = cex.d.d(i);
            cev x = x();
            B(x.d(i));
            cev d = cex.d(x, v() + 1, i);
            p = cex.p(arqrVar, i(), true);
            cenVar = new cen(i, d, p, cex.q(arqrVar2, k()), this);
        }
        if (!this.e && !this.i) {
            int v = v();
            synchronized (cex.c) {
                int i2 = cex.e;
                cex.e = i2 + 1;
                A(i2);
                cex.d = cex.d.d(v());
            }
            B(cex.d(x(), v + 1, v()));
        }
        return cenVar;
    }

    @Override // defpackage.ces
    public ces b(arqr arqrVar) {
        ceo ceoVar;
        arqr p;
        C();
        F();
        int v = v();
        o(v());
        synchronized (cex.c) {
            int i = cex.e;
            cex.e = i + 1;
            cex.d = cex.d.d(i);
            cev d = cex.d(x(), v + 1, i);
            p = cex.p(arqrVar, i(), true);
            ceoVar = new ceo(i, d, p, this);
        }
        if (!this.e && !this.i) {
            int v2 = v();
            synchronized (cex.c) {
                int i2 = cex.e;
                cex.e = i2 + 1;
                A(i2);
                cex.d = cex.d.d(v());
            }
            B(cex.d(x(), v2 + 1, v()));
        }
        return ceoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be A[LOOP:1: B:31:0x00bc->B:32:0x00be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.cet c() {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cem.c():cet");
    }

    @Override // defpackage.ces
    public void d() {
        if (!this.i) {
            super.d();
            g();
        }
    }

    @Override // defpackage.ces
    public void e() {
        if (!this.e && !this.i) {
            l();
        }
    }

    @Override // defpackage.ces
    public void f() {
        this.n++;
    }

    @Override // defpackage.ces
    public void g() {
        int i;
        if (this.n <= 0) {
            byy.a("no pending nested snapshots");
        }
        int i2 = this.n - 1;
        this.n = i2;
        if (i2 == 0 && !this.e) {
            vh s = s();
            if (s != null) {
                if (this.e) {
                    byy.b("Unsupported operation on a snapshot that has been applied");
                }
                u(null);
                int v = v();
                Object[] objArr = s.b;
                long[] jArr = s.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = ~(i3 - length);
                            int i5 = 0;
                            while (true) {
                                i = 8 - (i4 >>> 31);
                                if (i5 >= i) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    for (cfi e = ((cfg) objArr[(i3 << 3) + i5]).e(); e != null; e = e.h) {
                                        int i6 = e.g;
                                        if (i6 == v || aqjn.aH(this.c, Integer.valueOf(i6))) {
                                            e.g = 0;
                                        }
                                    }
                                }
                                j >>= 8;
                                i5++;
                            }
                            if (i != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
            y();
        }
    }

    @Override // defpackage.ces
    public int h() {
        return this.l;
    }

    @Override // defpackage.ces
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public arqr i() {
        return this.a;
    }

    @Override // defpackage.ces
    public arqr k() {
        return this.b;
    }

    public final void l() {
        o(v());
        if (!this.e && !this.i) {
            int v = v();
            synchronized (cex.c) {
                int i = cex.e;
                cex.e = i + 1;
                A(i);
                cex.d = cex.d.d(v());
            }
            B(cex.d(x(), v + 1, v()));
        }
    }

    @Override // defpackage.ces
    public final void m() {
        cex.d = cex.d.b(v()).a(this.c);
    }

    @Override // defpackage.ces
    public void n(cfg cfgVar) {
        vh s = s();
        if (s == null) {
            s = new vh((byte[]) null);
            u(s);
        }
        s.j(cfgVar);
    }

    public final void o(int i) {
        synchronized (cex.c) {
            this.c = this.c.d(i);
        }
    }

    @Override // defpackage.ces
    public final void p() {
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            cex.v(this.d[i]);
        }
        z();
    }

    @Override // defpackage.ces
    public void q(int i) {
        this.l = i;
    }

    @Override // defpackage.ces
    public boolean r() {
        return false;
    }

    public vh s() {
        return this.f;
    }

    public final cet t(int i, vh vhVar, Map map, cev cevVar) {
        List list;
        cev cevVar2;
        Object[] objArr;
        long[] jArr;
        cev cevVar3;
        Object[] objArr2;
        long[] jArr2;
        int i2;
        cfi k2;
        cfi j;
        armo armoVar;
        cev c = x().d(v()).c(this.c);
        Object[] objArr3 = vhVar.b;
        long[] jArr3 = vhVar.a;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        if (length >= 0) {
            list = null;
            int i3 = 0;
            while (true) {
                long j2 = jArr3[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 < i6) {
                            if ((j2 & 255) < 128) {
                                cfg cfgVar = (cfg) objArr3[(i3 << 3) + i5];
                                cfi e = cfgVar.e();
                                objArr2 = objArr3;
                                jArr2 = jArr3;
                                i2 = i4;
                                cfi k3 = cex.k(e, i, cevVar);
                                if (k3 != null && (k2 = cex.k(e, v(), c)) != null) {
                                    cevVar3 = c;
                                    if (k2.g != 1 && !d.F(k3, k2)) {
                                        cfi k4 = cex.k(e, v(), x());
                                        if (k4 != null) {
                                            if (map == null || (j = (cfi) map.get(k3)) == null) {
                                                j = cfgVar.j(k2, k3, k4);
                                            }
                                            if (j == null) {
                                                return new cet.a();
                                            }
                                            if (!d.F(j, k4)) {
                                                if (d.F(j, k3)) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    arrayList.add(new armo(cfgVar, k3.a(v())));
                                                    if (list == null) {
                                                        list = new ArrayList();
                                                    }
                                                    list.add(cfgVar);
                                                } else {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    if (!d.F(j, k2)) {
                                                        armoVar = new armo(cfgVar, j);
                                                    } else {
                                                        armoVar = new armo(cfgVar, k2.a(v()));
                                                    }
                                                    arrayList.add(armoVar);
                                                }
                                            }
                                        } else {
                                            cex.z();
                                            throw new armj();
                                        }
                                    }
                                } else {
                                    cevVar3 = c;
                                }
                            } else {
                                cevVar3 = c;
                                objArr2 = objArr3;
                                jArr2 = jArr3;
                                i2 = i4;
                            }
                            j2 >>= 8;
                            i5++;
                            objArr3 = objArr2;
                            jArr3 = jArr2;
                            i4 = i2;
                            c = cevVar3;
                        } else {
                            cevVar2 = c;
                            objArr = objArr3;
                            jArr = jArr3;
                            if (i6 != 8) {
                                break;
                            }
                        }
                    }
                } else {
                    cevVar2 = c;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                objArr3 = objArr;
                jArr3 = jArr;
                c = cevVar2;
            }
        } else {
            list = null;
        }
        if (arrayList != null) {
            l();
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                armo armoVar2 = (armo) arrayList.get(i7);
                cfg cfgVar2 = (cfg) armoVar2.a;
                cfi cfiVar = (cfi) armoVar2.b;
                cfiVar.g = v();
                synchronized (cex.c) {
                    cfiVar.h = cfgVar2.e();
                    cfgVar2.f(cfiVar);
                }
            }
        }
        if (list != null) {
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                vhVar.l((cfg) list.get(i8));
            }
            List list2 = this.m;
            if (list2 != null) {
                list = aqjn.aq(list2, list);
            }
            this.m = list;
        }
        return cet.b.a;
    }

    public void u(vh vhVar) {
        this.f = vhVar;
    }
}
