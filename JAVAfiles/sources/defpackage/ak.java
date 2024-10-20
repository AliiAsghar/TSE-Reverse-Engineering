package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ak {
    private static int h = 1000;
    public ai[] c;
    public final ktk g;
    int a = 0;
    public final aj b = new aj();
    private int i = 32;
    private int j = 32;
    public boolean[] d = new boolean[32];
    public int e = 1;
    public int f = 0;
    private int k = 32;
    private al[] l = new al[h];
    private int m = 0;
    private ai[] n = new ai[32];

    public ak() {
        this.c = null;
        this.c = new ai[32];
        r();
        this.g = new ktk((byte[]) null, (byte[]) null);
    }

    public static ai b(ak akVar, al alVar, al alVar2, int i, float f, al alVar3, al alVar4, int i2, boolean z) {
        ai a = akVar.a();
        a.d(alVar, alVar2, i, f, alVar3, alVar4, i2);
        if (z) {
            al d = akVar.d();
            al d2 = akVar.d();
            d.c = 4;
            d2.c = 4;
            a.c(d, d2);
        }
        return a;
    }

    public static ai c(ak akVar, al alVar, al alVar2, int i, boolean z) {
        ai a = akVar.a();
        a.h(alVar, alVar2, i);
        if (z) {
            akVar.k(a, 1);
        }
        return a;
    }

    public static final int p(Object obj) {
        al alVar = ((am) obj).f;
        if (alVar != null) {
            return (int) (alVar.d + 0.5f);
        }
        return 0;
    }

    private final void q() {
        int i = this.i;
        int i2 = i + i;
        this.i = i2;
        this.c = (ai[]) Arrays.copyOf(this.c, i2);
        this.g.c = (al[]) Arrays.copyOf((Object[]) this.g.c, this.i);
        int i3 = this.i;
        this.d = new boolean[i3];
        this.j = i3;
        this.k = i3;
        this.b.a.clear();
    }

    private final void r() {
        int i = 0;
        while (true) {
            ai[] aiVarArr = this.c;
            if (i < aiVarArr.length) {
                ai aiVar = aiVarArr[i];
                if (aiVar != null) {
                    ((asnn) this.g.a).n(aiVar);
                }
                this.c[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    private final al s(int i) {
        al alVar = (al) ((asnn) this.g.b).m();
        if (alVar == null) {
            alVar = new al(i);
        } else {
            alVar.b();
            alVar.h = i;
        }
        int i2 = this.m;
        int i3 = h;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            h = i4;
            this.l = (al[]) Arrays.copyOf(this.l, i4);
        }
        al[] alVarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        alVarArr[i5] = alVar;
        return alVar;
    }

    public final ai a() {
        ai aiVar = (ai) ((asnn) this.g.a).m();
        if (aiVar == null) {
            return new ai(this.g);
        }
        aiVar.a = null;
        ah ahVar = aiVar.d;
        ahVar.e = -1;
        ahVar.f = -1;
        ahVar.g = false;
        ahVar.a = 0;
        aiVar.b = brg.a;
        aiVar.e = false;
        return aiVar;
    }

    public final al d() {
        if (this.e + 1 >= this.j) {
            q();
        }
        al s = s(4);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        s.a = i;
        ((al[]) this.g.c)[i] = s;
        return s;
    }

    public final al e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            q();
        }
        am amVar = (am) obj;
        al alVar = amVar.f;
        if (alVar == null) {
            amVar.e();
            alVar = amVar.f;
        }
        int i = alVar.a;
        if (i != -1) {
            if (i > this.a || ((al[]) this.g.c)[i] == null) {
                if (i != -1) {
                    alVar.b();
                }
            }
            return alVar;
        }
        int i2 = this.a + 1;
        this.a = i2;
        this.e++;
        alVar.a = i2;
        alVar.h = 1;
        ((al[]) this.g.c)[i2] = alVar;
        return alVar;
    }

    public final al f() {
        if (this.e + 1 >= this.j) {
            q();
        }
        al s = s(3);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        s.a = i;
        ((al[]) this.g.c)[i] = s;
        return s;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.ai r13) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak.g(ai):void");
    }

    public final void h(al alVar, int i) {
        int i2 = alVar.b;
        if (i2 != -1) {
            ai aiVar = this.c[i2];
            if (aiVar.e) {
                aiVar.b = i;
                return;
            }
            ai a = a();
            a.g(alVar, i);
            g(a);
            return;
        }
        float f = i;
        ai a2 = a();
        a2.a = alVar;
        alVar.d = f;
        a2.b = f;
        a2.e = true;
        g(a2);
    }

    public final void i(al alVar, al alVar2, int i, int i2) {
        ai a = a();
        al f = f();
        f.c = i2;
        a.i(alVar, alVar2, f, i);
        g(a);
    }

    public final void j(al alVar, al alVar2, int i, int i2) {
        ai a = a();
        al f = f();
        f.c = i2;
        a.j(alVar, alVar2, f, i);
        g(a);
    }

    public final void k(ai aiVar, int i) {
        aiVar.d.f(d(), i);
    }

    public final void l() {
        ktk ktkVar;
        int i = 0;
        while (true) {
            ktkVar = this.g;
            al[] alVarArr = (al[]) ktkVar.c;
            if (i >= alVarArr.length) {
                break;
            }
            al alVar = alVarArr[i];
            if (alVar != null) {
                alVar.b();
            }
            i++;
        }
        Object obj = ktkVar.b;
        al[] alVarArr2 = this.l;
        int i2 = this.m;
        int length = alVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            al alVar2 = alVarArr2[i3];
            asnn asnnVar = (asnn) obj;
            int i4 = asnnVar.a;
            if (i4 < 256) {
                ((Object[]) asnnVar.b)[i4] = alVar2;
                asnnVar.a = i4 + 1;
            }
        }
        this.m = 0;
        Arrays.fill((Object[]) this.g.c, (Object) null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (int i5 = 0; i5 < this.f; i5++) {
            this.c[i5].c = false;
        }
        r();
        this.f = 0;
    }

    public final void m(al alVar, al alVar2, int i, float f, al alVar3, al alVar4, int i2) {
        ai a = a();
        a.d(alVar, alVar2, i, f, alVar3, alVar4, i2);
        al d = d();
        al d2 = d();
        d.c = 4;
        d2.c = 4;
        a.c(d, d2);
        g(a);
    }

    public final void n(al alVar, al alVar2, int i, int i2) {
        ai a = a();
        a.h(alVar, alVar2, i);
        al d = d();
        al d2 = d();
        d.c = i2;
        d2.c = i2;
        a.c(d, d2);
        g(a);
    }

    public final void o(aj ajVar) {
        int i = 0;
        while (true) {
            if (i >= this.f) {
                break;
            }
            ai aiVar = this.c[i];
            if (aiVar.a.h != 1 && aiVar.b < brg.a) {
                while (true) {
                    float f = Float.MAX_VALUE;
                    int i2 = -1;
                    int i3 = -1;
                    int i4 = 0;
                    for (int i5 = 0; i5 < this.f; i5++) {
                        ai aiVar2 = this.c[i5];
                        if (aiVar2.a.h != 1 && aiVar2.b < brg.a) {
                            for (int i6 = 1; i6 < this.e; i6++) {
                                al alVar = ((al[]) this.g.c)[i6];
                                float a = aiVar2.d.a(alVar);
                                if (a > brg.a) {
                                    for (int i7 = 0; i7 < 6; i7++) {
                                        float f2 = alVar.e[i7] / a;
                                        if ((f2 < f && i7 == i4) || i7 > i4) {
                                            f = f2;
                                            i2 = i5;
                                            i3 = i6;
                                            i4 = i7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i2 == -1) {
                        break;
                    }
                    ai aiVar3 = this.c[i2];
                    aiVar3.a.b = -1;
                    aiVar3.a(((al[]) this.g.c)[i3]);
                    aiVar3.a.b = i2;
                    for (int i8 = 0; i8 < this.f; i8++) {
                        this.c[i8].k(aiVar3);
                    }
                    ajVar.a(this);
                }
            } else {
                i++;
            }
        }
        for (int i9 = 0; i9 < this.f; i9++) {
            ai aiVar4 = this.c[i9];
            if (aiVar4.a.h != 1 && aiVar4.b < brg.a) {
                return;
            }
        }
    }
}
