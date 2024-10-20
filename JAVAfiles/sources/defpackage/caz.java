package defpackage;

import defpackage.cbb;
import defpackage.cbf;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class caz {
    public cay a;
    public boolean b;
    public int e;
    public int h;
    private final bwk i;
    private int j;
    public final bxr c = new bxr();
    public boolean d = true;
    private final ArrayList k = new ArrayList();
    private int l = -1;
    public int f = -1;
    public int g = -1;

    public caz(bwk bwkVar, cay cayVar) {
        this.i = bwkVar;
        this.a = cayVar;
    }

    public final caa a() {
        return this.i.r;
    }

    public final void b() {
        if (this.b) {
            j(false);
            j(false);
            this.a.c();
            this.b = false;
        }
    }

    public final void c(cay cayVar, cdl cdlVar) {
        cay cayVar2 = this.a;
        if (cayVar.e()) {
            cbf cbfVar = cayVar2.a;
            cbb.c cVar = cbb.c.a;
            cbfVar.e(cVar);
            cbf.b.b(cbfVar, 0, cayVar);
            cbf.b.b(cbfVar, 1, cdlVar);
            if (cbfVar.g != cbf.h(cVar.b) || cbfVar.h != cbf.h(cVar.c)) {
                StringBuilder sb = new StringBuilder();
                int i = cVar.b;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    if (((1 << i3) & cbfVar.g) != 0) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(cVar.a(i3));
                        i2++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                int i4 = cVar.c;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    if (((1 << i6) & cbfVar.h) != 0) {
                        if (i2 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(cVar.c(i6));
                        i5++;
                    }
                }
                byy.b(a.cm(new StringBuilder(), sb3.toString(), i5, sb2, i2, cVar));
            }
        }
    }

    public final void d(Object obj) {
        i();
        this.k.add(obj);
    }

    public final void e(int i) {
        this.e += i - a().e;
    }

    public final void f() {
        i();
        if (car.b(this.k)) {
            car.a(this.k);
        } else {
            this.j++;
        }
    }

    public final void g() {
        int i = this.j;
        if (i > 0) {
            cbf cbfVar = this.a.a;
            cbb.ah ahVar = cbb.ah.a;
            cbfVar.e(ahVar);
            cbf.b.a(cbfVar, 0, i);
            if (cbfVar.g != cbf.h(ahVar.b) || cbfVar.h != cbf.h(ahVar.c)) {
                StringBuilder sb = new StringBuilder();
                int i2 = ahVar.b;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    if (((1 << i4) & cbfVar.g) != 0) {
                        if (i3 > 0) {
                            sb.append(", ");
                        }
                        sb.append(ahVar.a(i4));
                        i3++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                int i5 = ahVar.c;
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    if (((1 << i7) & cbfVar.h) != 0) {
                        if (i3 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(ahVar.c(i7));
                        i6++;
                    }
                }
                byy.b(a.cm(new StringBuilder(), sb3.toString(), i6, sb2, i3, ahVar));
            }
            this.j = 0;
        }
        if (car.b(this.k)) {
            cay cayVar = this.a;
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = arrayList.get(i8);
            }
            if (size != 0) {
                cbf cbfVar2 = cayVar.a;
                cbb.h hVar = cbb.h.a;
                cbfVar2.e(hVar);
                cbf.b.b(cbfVar2, 0, objArr);
                if (cbfVar2.g != cbf.h(hVar.b) || cbfVar2.h != cbf.h(hVar.c)) {
                    StringBuilder sb4 = new StringBuilder();
                    int i9 = hVar.b;
                    int i10 = 0;
                    for (int i11 = 0; i11 < i9; i11++) {
                        if (((1 << i11) & cbfVar2.g) != 0) {
                            if (i10 > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(hVar.a(i11));
                            i10++;
                        }
                    }
                    String sb5 = sb4.toString();
                    StringBuilder sb6 = new StringBuilder();
                    int i12 = hVar.c;
                    int i13 = 0;
                    for (int i14 = 0; i14 < i12; i14++) {
                        if (((1 << i14) & cbfVar2.h) != 0) {
                            if (i10 > 0) {
                                sb6.append(", ");
                            }
                            sb6.append(hVar.c(i14));
                            i13++;
                        }
                    }
                    byy.b(a.cm(new StringBuilder(), sb6.toString(), i13, sb5, i10, hVar));
                }
            }
            this.k.clear();
        }
    }

    public final void h() {
        j(false);
        k();
    }

    public final void i() {
        int i = this.h;
        if (i > 0) {
            int i2 = this.l;
            if (i2 >= 0) {
                g();
                cbf cbfVar = this.a.a;
                cbb.x xVar = cbb.x.a;
                cbfVar.e(xVar);
                cbf.b.a(cbfVar, 0, i2);
                cbf.b.a(cbfVar, 1, i);
                if (cbfVar.g != cbf.h(xVar.b) || cbfVar.h != cbf.h(xVar.c)) {
                    StringBuilder sb = new StringBuilder();
                    int i3 = xVar.b;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        if (((1 << i5) & cbfVar.g) != 0) {
                            if (i4 > 0) {
                                sb.append(", ");
                            }
                            sb.append(xVar.a(i5));
                            i4++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    int i6 = xVar.c;
                    int i7 = 0;
                    for (int i8 = 0; i8 < i6; i8++) {
                        if (((1 << i8) & cbfVar.h) != 0) {
                            if (i4 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(xVar.c(i8));
                            i7++;
                        }
                    }
                    byy.b(a.cm(new StringBuilder(), sb3.toString(), i7, sb2, i4, xVar));
                }
                this.l = -1;
            } else {
                int i9 = this.g;
                int i10 = this.f;
                g();
                cbf cbfVar2 = this.a.a;
                cbb.s sVar = cbb.s.a;
                cbfVar2.e(sVar);
                cbf.b.a(cbfVar2, 1, i9);
                cbf.b.a(cbfVar2, 0, i10);
                cbf.b.a(cbfVar2, 2, i);
                if (cbfVar2.g != cbf.h(sVar.b) || cbfVar2.h != cbf.h(sVar.c)) {
                    StringBuilder sb4 = new StringBuilder();
                    int i11 = sVar.b;
                    int i12 = 0;
                    for (int i13 = 0; i13 < i11; i13++) {
                        if (((1 << i13) & cbfVar2.g) != 0) {
                            if (i12 > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(sVar.a(i13));
                            i12++;
                        }
                    }
                    String sb5 = sb4.toString();
                    StringBuilder sb6 = new StringBuilder();
                    int i14 = sVar.c;
                    int i15 = 0;
                    for (int i16 = 0; i16 < i14; i16++) {
                        if (((1 << i16) & cbfVar2.h) != 0) {
                            if (i12 > 0) {
                                sb6.append(", ");
                            }
                            sb6.append(sVar.c(i16));
                            i15++;
                        }
                    }
                    byy.b(a.cm(new StringBuilder(), sb6.toString(), i15, sb5, i12, sVar));
                }
                this.f = -1;
                this.g = -1;
            }
            this.h = 0;
        }
    }

    public final void j(boolean z) {
        int i;
        if (z) {
            i = a().g;
        } else {
            i = a().e;
        }
        int i2 = i - this.e;
        if (i2 < 0) {
            bwp.i("Tried to seek backward");
        }
        if (i2 > 0) {
            cbf cbfVar = this.a.a;
            cbb.a aVar = cbb.a.a;
            cbfVar.e(aVar);
            cbf.b.a(cbfVar, 0, i2);
            if (cbfVar.g != cbf.h(aVar.b) || cbfVar.h != cbf.h(aVar.c)) {
                StringBuilder sb = new StringBuilder();
                int i3 = aVar.b;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    if (((1 << i5) & cbfVar.g) != 0) {
                        if (i4 > 0) {
                            sb.append(", ");
                        }
                        sb.append(aVar.a(i5));
                        i4++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                int i6 = aVar.c;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    if (((1 << i8) & cbfVar.h) != 0) {
                        if (i4 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(aVar.c(i8));
                        i7++;
                    }
                }
                byy.b(a.cm(new StringBuilder(), sb3.toString(), i7, sb2, i4, aVar));
            }
            this.e = i;
        }
    }

    public final void k() {
        caa a;
        int i;
        if (a().c > 0 && this.c.b(-2) != (i = (a = a()).g)) {
            if (!this.b && this.d) {
                j(false);
                this.a.a.d(cbb.n.a);
                this.b = true;
            }
            if (i > 0) {
                bwa g = a.g(i);
                this.c.e(i);
                j(false);
                cbf cbfVar = this.a.a;
                cbb.m mVar = cbb.m.a;
                cbfVar.e(mVar);
                cbf.b.b(cbfVar, 0, g);
                if (cbfVar.g != cbf.h(mVar.b) || cbfVar.h != cbf.h(mVar.c)) {
                    StringBuilder sb = new StringBuilder();
                    int i2 = mVar.b;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        if (((1 << i4) & cbfVar.g) != 0) {
                            if (i3 > 0) {
                                sb.append(", ");
                            }
                            sb.append(mVar.a(i4));
                            i3++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    int i5 = mVar.c;
                    int i6 = 0;
                    for (int i7 = 0; i7 < i5; i7++) {
                        if (((1 << i7) & cbfVar.h) != 0) {
                            if (i3 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(mVar.c(i7));
                            i6++;
                        }
                    }
                    byy.b(a.cm(new StringBuilder(), sb3.toString(), i6, sb2, i3, mVar));
                }
                this.b = true;
            }
        }
    }

    public final void l(int i, int i2) {
        if (i2 > 0) {
            if (i < 0) {
                bwp.i(a.bV(i, "Invalid remove index "));
            }
            if (this.l == i) {
                this.h += i2;
                return;
            }
            i();
            this.l = i;
            this.h = i2;
        }
    }

    public final void m() {
        this.a.a.d(cbb.aa.a);
    }
}
