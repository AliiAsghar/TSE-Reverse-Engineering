package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dup extends dum {
    public int f;
    final duo g;
    private duq[] h;
    private duq[] i;

    public dup(ktk ktkVar) {
        super(ktkVar);
        this.h = new duq[128];
        this.i = new duq[128];
        this.f = 0;
        this.g = new duo(this);
    }

    @Override // defpackage.dum
    public final void d(dun dunVar, dum dumVar, boolean z) {
        duq duqVar = dumVar.a;
        if (duqVar == null) {
            return;
        }
        dul dulVar = dumVar.e;
        int i = dulVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            duq d = dulVar.d(i2);
            float b = dulVar.b(i2);
            duo duoVar = this.g;
            duoVar.a = d;
            if (duoVar.a.b) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = duoVar.a.i;
                    float f = fArr[i3] + (duqVar.i[i3] * b);
                    fArr[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        duoVar.a.i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    duoVar.b.n(duoVar.a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = duqVar.i[i4];
                    if (f2 != brg.a) {
                        float f3 = f2 * b;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        duoVar.a.i[i4] = f3;
                    } else {
                        duoVar.a.i[i4] = 0.0f;
                    }
                }
                m(d);
            }
            this.b += dumVar.b * b;
        }
        n(duqVar);
    }

    @Override // defpackage.dum
    public final boolean e() {
        if (this.f == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dum
    public final duq k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            duq[] duqVarArr = this.h;
            duq duqVar = duqVarArr[i2];
            if (!zArr[duqVar.c]) {
                duo duoVar = this.g;
                duoVar.a = duqVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = duoVar.a.i[i3];
                        if (f > brg.a) {
                            break;
                        }
                        if (f < brg.a) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                    i = -1;
                } else {
                    duq duqVar2 = duqVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = duqVar2.i[i3];
                            float f3 = duoVar.a.i[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    public final void m(duq duqVar) {
        int i;
        int i2 = this.f + 1;
        duq[] duqVarArr = this.h;
        int length = duqVarArr.length;
        if (i2 > length) {
            duq[] duqVarArr2 = (duq[]) Arrays.copyOf(duqVarArr, length + length);
            this.h = duqVarArr2;
            int length2 = duqVarArr2.length;
            this.i = (duq[]) Arrays.copyOf(duqVarArr2, length2 + length2);
        }
        duq[] duqVarArr3 = this.h;
        int i3 = this.f;
        duqVarArr3[i3] = duqVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && duqVarArr3[i3].c > duqVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new mm(2));
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        duqVar.b = true;
        duqVar.a(this);
    }

    public final void n(duq duqVar) {
        int i = 0;
        while (i < this.f) {
            if (this.h[i] == duqVar) {
                while (true) {
                    int i2 = this.f - 1;
                    if (i < i2) {
                        duq[] duqVarArr = this.h;
                        int i3 = i + 1;
                        duqVarArr[i] = duqVarArr[i3];
                        i = i3;
                    } else {
                        this.f = i2;
                        duqVar.b = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.dum
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.f; i++) {
            this.g.a = this.h[i];
            str = str + this.g + " ";
        }
        return str;
    }
}
