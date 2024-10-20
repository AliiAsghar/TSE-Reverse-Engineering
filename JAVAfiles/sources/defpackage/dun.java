package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dun {
    public static boolean a = false;
    public static long b;
    public final ktk j;
    private final dum r;
    private dum s;
    private int k = 1000;
    public boolean c = false;
    int d = 0;
    private int l = 32;
    private int m = 32;
    public boolean f = false;
    public boolean g = false;
    private boolean[] n = new boolean[32];
    int h = 1;
    int i = 0;
    private int o = 32;
    private duq[] p = new duq[1000];
    private int q = 0;
    dum[] e = new dum[32];

    public dun() {
        t();
        ktk ktkVar = new ktk((byte[]) null);
        this.j = ktkVar;
        this.r = new dup(ktkVar);
        this.s = new dum(ktkVar);
    }

    public static final int o(Object obj) {
        duq duqVar = ((dwb) obj).h;
        if (duqVar != null) {
            return (int) (duqVar.f + 0.5f);
        }
        return 0;
    }

    private final void q(dum dumVar) {
        int i;
        if (dumVar.d) {
            dumVar.a.d(this, dumVar.b);
        } else {
            dum[] dumVarArr = this.e;
            int i2 = this.i;
            dumVarArr[i2] = dumVar;
            duq duqVar = dumVar.a;
            duqVar.d = i2;
            this.i = i2 + 1;
            duqVar.e(this, dumVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    System.out.println("WTF");
                }
                dum dumVar2 = this.e[i3];
                if (dumVar2 != null && dumVar2.d) {
                    dumVar2.a.d(this, dumVar2.b);
                    ((aspp) this.j.a).s(dumVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        dum[] dumVarArr2 = this.e;
                        int i6 = i4 - 1;
                        dum dumVar3 = dumVarArr2[i4];
                        dumVarArr2[i6] = dumVar3;
                        duq duqVar2 = dumVar3.a;
                        if (duqVar2.d == i4) {
                            duqVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.e[i5] = null;
                    }
                    this.i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.c = false;
        }
    }

    private final void r() {
        for (int i = 0; i < this.i; i++) {
            dum dumVar = this.e[i];
            dumVar.a.f = dumVar.b;
        }
    }

    private final void s() {
        int i = this.l;
        int i2 = i + i;
        this.l = i2;
        this.e = (dum[]) Arrays.copyOf(this.e, i2);
        this.j.c = (duq[]) Arrays.copyOf((Object[]) this.j.c, this.l);
        int i3 = this.l;
        this.n = new boolean[i3];
        this.m = i3;
        this.o = i3;
    }

    private final void t() {
        for (int i = 0; i < this.i; i++) {
            dum dumVar = this.e[i];
            if (dumVar != null) {
                ((aspp) this.j.a).s(dumVar);
            }
            this.e[i] = null;
        }
    }

    private final void u(dum dumVar) {
        dul dulVar;
        int i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.n[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            z = true;
            i3++;
            int i4 = this.h;
            if (i3 < i4 + i4) {
                duq duqVar = dumVar.a;
                if (duqVar != null) {
                    this.n[duqVar.c] = true;
                }
                duq k = dumVar.k(this.n);
                if (k != null) {
                    boolean[] zArr = this.n;
                    int i5 = k.c;
                    if (!zArr[i5]) {
                        zArr[i5] = true;
                    } else {
                        return;
                    }
                }
                if (k != null) {
                    float f = Float.MAX_VALUE;
                    int i6 = -1;
                    for (int i7 = 0; i7 < this.i; i7++) {
                        dum dumVar2 = this.e[i7];
                        if (dumVar2.a.n != 1 && !dumVar2.d && (i = (dulVar = dumVar2.e).e) != -1) {
                            int i8 = 0;
                            while (true) {
                                if (i != -1 && i8 < dulVar.a) {
                                    if (dulVar.b[i] == k.c) {
                                        float a2 = dumVar2.e.a(k);
                                        if (a2 < brg.a) {
                                            float f2 = (-dumVar2.b) / a2;
                                            if (f2 < f) {
                                                i6 = i7;
                                                f = f2;
                                            }
                                        }
                                    } else {
                                        i = dulVar.c[i];
                                        i8++;
                                    }
                                }
                            }
                        }
                    }
                    if (i6 >= 0) {
                        dum dumVar3 = this.e[i6];
                        dumVar3.a.d = -1;
                        dumVar3.b(k);
                        duq duqVar2 = dumVar3.a;
                        duqVar2.d = i6;
                        duqVar2.e(this, dumVar3);
                    }
                    z = false;
                }
            } else {
                return;
            }
        }
    }

    private final duq v(int i) {
        duq duqVar = (duq) ((aspp) this.j.b).r();
        if (duqVar == null) {
            duqVar = new duq(i);
            duqVar.n = i;
        } else {
            duqVar.c();
            duqVar.n = i;
        }
        int i2 = this.q;
        int i3 = this.k;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            this.k = i4;
            this.p = (duq[]) Arrays.copyOf(this.p, i4);
        }
        duq[] duqVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        duqVarArr[i5] = duqVar;
        return duqVar;
    }

    public final dum a() {
        dum dumVar = (dum) ((aspp) this.j.a).r();
        if (dumVar == null) {
            dum dumVar2 = new dum(this.j);
            b++;
            dumVar = dumVar2;
        } else {
            dumVar.a = null;
            dumVar.e.f();
            dumVar.b = brg.a;
            dumVar.d = false;
        }
        duq.a++;
        return dumVar;
    }

    public final duq b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            s();
        }
        dwb dwbVar = (dwb) obj;
        duq duqVar = dwbVar.h;
        if (duqVar == null) {
            dwbVar.m();
            duqVar = dwbVar.h;
        }
        int i = duqVar.c;
        if (i != -1) {
            if (i > this.d || ((duq[]) this.j.c)[i] == null) {
                if (i != -1) {
                    duqVar.c();
                }
            }
            return duqVar;
        }
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        duqVar.c = i2;
        duqVar.n = 1;
        ((duq[]) this.j.c)[i2] = duqVar;
        return duqVar;
    }

    public final duq c() {
        if (this.h + 1 >= this.m) {
            s();
        }
        duq v = v(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        v.c = i;
        ((duq[]) this.j.c)[i] = v;
        return v;
    }

    public final void d(duq duqVar, duq duqVar2, int i, float f, duq duqVar3, duq duqVar4, int i2, int i3) {
        dum a2 = a();
        if (duqVar2 == duqVar3) {
            a2.e.g(duqVar, 1.0f);
            a2.e.g(duqVar4, 1.0f);
            a2.e.g(duqVar2, -2.0f);
        } else if (f == 0.5f) {
            a2.e.g(duqVar, 1.0f);
            a2.e.g(duqVar2, -1.0f);
            a2.e.g(duqVar3, -1.0f);
            a2.e.g(duqVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                a2.b = (-i) + i2;
            }
        } else if (f <= brg.a) {
            a2.e.g(duqVar, -1.0f);
            a2.e.g(duqVar2, 1.0f);
            a2.b = i;
        } else if (f >= 1.0f) {
            a2.e.g(duqVar4, -1.0f);
            a2.e.g(duqVar3, 1.0f);
            a2.b = -i2;
        } else {
            float f2 = 1.0f - f;
            a2.e.g(duqVar, f2);
            a2.e.g(duqVar2, -f2);
            a2.e.g(duqVar3, -f);
            a2.e.g(duqVar4, f);
            if (i > 0 || i2 > 0) {
                a2.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            a2.f(this, i3);
        }
        e(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.dum r17) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dun.e(dum):void");
    }

    public final void f(duq duqVar, int i) {
        int i2 = duqVar.d;
        if (i2 == -1) {
            duqVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                duq duqVar2 = ((duq[]) this.j.c)[i3];
            }
            return;
        }
        if (i2 != -1) {
            dum dumVar = this.e[i2];
            if (dumVar.d) {
                dumVar.b = i;
                return;
            }
            if (dumVar.e.a == 0) {
                dumVar.d = true;
                dumVar.b = i;
                return;
            }
            dum a2 = a();
            if (i < 0) {
                a2.b = -i;
                a2.e.g(duqVar, 1.0f);
            } else {
                a2.b = i;
                a2.e.g(duqVar, -1.0f);
            }
            e(a2);
            return;
        }
        float f = i;
        dum a3 = a();
        a3.a = duqVar;
        duqVar.f = f;
        a3.b = f;
        a3.d = true;
        e(a3);
    }

    public final void g(duq duqVar, duq duqVar2, int i, int i2) {
        dum a2 = a();
        duq c = c();
        c.e = 0;
        a2.h(duqVar, duqVar2, c, i);
        if (i2 != 8) {
            i(a2, (int) (-a2.e.a(c)), i2);
        }
        e(a2);
    }

    public final void h(duq duqVar, duq duqVar2, int i, int i2) {
        dum a2 = a();
        duq c = c();
        c.e = 0;
        a2.i(duqVar, duqVar2, c, i);
        if (i2 != 8) {
            i(a2, (int) (-a2.e.a(c)), i2);
        }
        e(a2);
    }

    final void i(dum dumVar, int i, int i2) {
        dumVar.e.g(p(i2), i);
    }

    public final void j() {
        dum dumVar = this.r;
        if (dumVar.e()) {
            r();
            return;
        }
        if (this.g) {
            for (int i = 0; i < this.i; i++) {
                if (!this.e[i].d) {
                    l(this.r);
                    return;
                }
            }
            r();
            return;
        }
        l(dumVar);
    }

    public final void k() {
        ktk ktkVar;
        int i = 0;
        while (true) {
            ktkVar = this.j;
            duq[] duqVarArr = (duq[]) ktkVar.c;
            if (i >= duqVarArr.length) {
                break;
            }
            duq duqVar = duqVarArr[i];
            if (duqVar != null) {
                duqVar.c();
            }
            i++;
        }
        Object obj = ktkVar.b;
        duq[] duqVarArr2 = this.p;
        int i2 = this.q;
        int length = duqVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            duq duqVar2 = duqVarArr2[i3];
            aspp asppVar = (aspp) obj;
            int i4 = asppVar.a;
            if (i4 < 256) {
                ((Object[]) asppVar.b)[i4] = duqVar2;
                asppVar.a = i4 + 1;
            }
        }
        this.q = 0;
        Arrays.fill((Object[]) this.j.c, (Object) null);
        this.d = 0;
        dup dupVar = (dup) this.r;
        dupVar.f = 0;
        dupVar.b = brg.a;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            dum dumVar = this.e[i5];
        }
        t();
        this.i = 0;
        this.s = new dum(this.j);
    }

    final void l(dum dumVar) {
        boolean z;
        boolean z2;
        int i = 0;
        while (true) {
            if (i >= this.i) {
                break;
            }
            dum dumVar2 = this.e[i];
            if (dumVar2.a.n != 1) {
                float f = dumVar2.b;
                float f2 = brg.a;
                if (f < brg.a) {
                    boolean z3 = false;
                    int i2 = 0;
                    while (!z3) {
                        i2++;
                        float f3 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.i) {
                            dum dumVar3 = this.e[i5];
                            if (dumVar3.a.n != 1 && !dumVar3.d && dumVar3.b < f2) {
                                int i7 = dumVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    duq d = dumVar3.e.d(i8);
                                    float a2 = dumVar3.e.a(d);
                                    if (a2 > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = d.h[i9] / a2;
                                            if ((f4 < f3 && i9 == i6) || i9 > i6) {
                                                i4 = d.c;
                                                i6 = i9;
                                                f3 = f4;
                                                i3 = i5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f2 = brg.a;
                                }
                            }
                            i5++;
                            f2 = brg.a;
                        }
                        if (i3 != -1) {
                            dum dumVar4 = this.e[i3];
                            dumVar4.a.d = -1;
                            dumVar4.b(((duq[]) this.j.c)[i4]);
                            duq duqVar = dumVar4.a;
                            duqVar.d = i3;
                            duqVar.e(this, dumVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        if (i2 > this.h / 2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        z3 = (!z2) | z;
                        f2 = brg.a;
                    }
                }
            }
            i++;
        }
        u(dumVar);
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.duq r6, defpackage.duq r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L17
            boolean r9 = r7.g
            if (r9 == 0) goto L16
            int r9 = r6.d
            r1 = -1
            if (r9 == r1) goto Le
            goto L16
        Le:
            float r7 = r7.f
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.d(r5, r7)
            return
        L16:
            r9 = r0
        L17:
            dum r1 = r5.a()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L38
            if (r8 >= 0) goto L26
            int r8 = -r8
            r4 = 1
            goto L27
        L26:
            r4 = 0
        L27:
            float r8 = (float) r8
            r1.b = r8
            if (r4 != 0) goto L2d
            goto L38
        L2d:
            dul r8 = r1.e
            r8.g(r6, r2)
            dul r6 = r1.e
            r6.g(r7, r3)
            goto L42
        L38:
            dul r8 = r1.e
            r8.g(r6, r3)
            dul r6 = r1.e
            r6.g(r7, r2)
        L42:
            if (r9 == r0) goto L47
            r1.f(r5, r9)
        L47:
            r5.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dun.m(duq, duq, int, int):void");
    }

    public final void n(duq duqVar, duq duqVar2, duq duqVar3, duq duqVar4, float f) {
        dum a2 = a();
        a2.g(duqVar, duqVar2, duqVar3, duqVar4, f);
        e(a2);
    }

    public final duq p(int i) {
        if (this.h + 1 >= this.m) {
            s();
        }
        duq v = v(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        v.c = i2;
        v.e = i;
        ((duq[]) this.j.c)[i2] = v;
        dup dupVar = (dup) this.r;
        duo duoVar = dupVar.g;
        duoVar.a = v;
        Arrays.fill(duoVar.a.i, brg.a);
        v.i[v.e] = 1.0f;
        dupVar.m(v);
        return v;
    }
}
