package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ai {
    public final ah d;
    public al a = null;
    public float b = brg.a;
    boolean c = false;
    boolean e = false;

    public ai(ktk ktkVar) {
        this.d = new ah(this, ktkVar);
    }

    public final void a(al alVar) {
        al alVar2 = this.a;
        if (alVar2 != null) {
            this.d.f(alVar2, -1.0f);
            this.a = null;
        }
        float f = -this.d.c(alVar);
        this.a = alVar;
        if (f != 1.0f) {
            this.b /= f;
            ah ahVar = this.d;
            int i = ahVar.e;
            for (int i2 = 0; i != -1 && i2 < ahVar.a; i2++) {
                float[] fArr = ahVar.d;
                fArr[i] = fArr[i] / f;
                i = ahVar.c[i];
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        ah ahVar = this.d;
        int i = ahVar.e;
        for (int i2 = 0; i != -1 && i2 < ahVar.a; i2++) {
            al alVar = ((al[]) ahVar.h.c)[ahVar.b[i]];
            int i3 = 0;
            while (true) {
                int i4 = alVar.g;
                if (i3 < i4) {
                    if (alVar.f[i3] == this) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    ai[] aiVarArr = alVar.f;
                    int length = aiVarArr.length;
                    if (i4 >= length) {
                        alVar.f = (ai[]) Arrays.copyOf(aiVarArr, length + length);
                    }
                    ai[] aiVarArr2 = alVar.f;
                    int i5 = alVar.g;
                    aiVarArr2[i5] = this;
                    alVar.g = i5 + 1;
                }
            }
            i = ahVar.c[i];
        }
    }

    public final void c(al alVar, al alVar2) {
        this.d.f(alVar, 1.0f);
        this.d.f(alVar2, -1.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(al alVar, al alVar2, int i, float f, al alVar3, al alVar4, int i2) {
        if (alVar2 == alVar3) {
            this.d.f(alVar, 1.0f);
            this.d.f(alVar4, 1.0f);
            this.d.f(alVar2, -2.0f);
            return;
        }
        if (f == 0.5f) {
            this.d.f(alVar, 1.0f);
            this.d.f(alVar2, -1.0f);
            this.d.f(alVar3, -1.0f);
            this.d.f(alVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
                return;
            }
            return;
        }
        if (f <= brg.a) {
            this.d.f(alVar, -1.0f);
            this.d.f(alVar2, 1.0f);
            this.b = i;
            return;
        }
        if (f >= 1.0f) {
            this.d.f(alVar3, -1.0f);
            this.d.f(alVar4, 1.0f);
            this.b = i2;
            return;
        }
        float f2 = 1.0f - f;
        this.d.f(alVar, f2);
        this.d.f(alVar2, -f2);
        this.d.f(alVar3, -f);
        this.d.f(alVar4, f);
        if (i <= 0 && i2 <= 0) {
            return;
        }
        this.b = ((-i) * f2) + (i2 * f);
    }

    public final void e(al alVar, al alVar2, al alVar3, al alVar4, float f) {
        this.d.f(alVar, -1.0f);
        this.d.f(alVar2, 1.0f);
        this.d.f(alVar3, f);
        this.d.f(alVar4, -f);
    }

    public final void f(float f, float f2, float f3, al alVar, int i, al alVar2, int i2, al alVar3, int i3, al alVar4, int i4) {
        int i5 = (-i) - i2;
        if (f2 != brg.a && f != f3) {
            float f4 = (f / f2) / (f3 / f2);
            this.b = i5 + (i3 * f4) + (i4 * f4);
            this.d.f(alVar, 1.0f);
            this.d.f(alVar2, -1.0f);
            this.d.f(alVar4, f4);
            this.d.f(alVar3, -f4);
            return;
        }
        this.b = i5 + i3 + i4;
        this.d.f(alVar, 1.0f);
        this.d.f(alVar2, -1.0f);
        this.d.f(alVar4, 1.0f);
        this.d.f(alVar3, -1.0f);
    }

    public final void g(al alVar, int i) {
        if (i < 0) {
            this.b = -i;
            this.d.f(alVar, 1.0f);
        } else {
            this.b = i;
            this.d.f(alVar, -1.0f);
        }
    }

    public final void h(al alVar, al alVar2, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.d.f(alVar, 1.0f);
                this.d.f(alVar2, -1.0f);
                return;
            }
        }
        this.d.f(alVar, -1.0f);
        this.d.f(alVar2, 1.0f);
    }

    public final void i(al alVar, al alVar2, al alVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.d.f(alVar, 1.0f);
                this.d.f(alVar2, -1.0f);
                this.d.f(alVar3, -1.0f);
                return;
            }
        }
        this.d.f(alVar, -1.0f);
        this.d.f(alVar2, 1.0f);
        this.d.f(alVar3, 1.0f);
    }

    public final void j(al alVar, al alVar2, al alVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.d.f(alVar, 1.0f);
                this.d.f(alVar2, -1.0f);
                this.d.f(alVar3, 1.0f);
                return;
            }
        }
        this.d.f(alVar, -1.0f);
        this.d.f(alVar2, 1.0f);
        this.d.f(alVar3, -1.0f);
    }

    public final void k(ai aiVar) {
        this.d.g(this, aiVar);
    }

    public final String toString() {
        String concat;
        boolean z;
        String str;
        al alVar = this.a;
        if (alVar == null) {
            concat = "0";
        } else {
            Objects.toString(alVar);
            concat = "".concat(String.valueOf(alVar));
        }
        float f = this.b;
        String concat2 = concat.concat(" = ");
        if (f != brg.a) {
            concat2 = concat2 + this.b;
            z = true;
        } else {
            z = false;
        }
        int i = this.d.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.d.d(i2) != null) {
                float b = this.d.b(i2);
                if (!z) {
                    if (b < brg.a) {
                        b = -b;
                        concat2 = concat2.concat("- ");
                    }
                } else {
                    if (b > brg.a) {
                        str = " + ";
                    } else {
                        b = -b;
                        str = " - ";
                    }
                    concat2 = concat2.concat(str);
                }
                if (b == 1.0f) {
                    concat2 = concat2.concat("null");
                } else {
                    concat2 = concat2 + b + " null";
                }
                z = true;
            }
        }
        if (!z) {
            return concat2.concat("0.0");
        }
        return concat2;
    }
}
