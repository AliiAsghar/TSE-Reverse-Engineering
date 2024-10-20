package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dum {
    duq a = null;
    public float b = brg.a;
    final ArrayList c = new ArrayList();
    boolean d = false;
    public dul e;

    public dum() {
    }

    public static final boolean l(duq duqVar) {
        if (duqVar.l <= 1) {
            return true;
        }
        return false;
    }

    public final duq a(boolean[] zArr, duq duqVar) {
        int i;
        int i2 = this.e.a;
        duq duqVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float b = this.e.b(i3);
            if (b < brg.a) {
                duq d = this.e.d(i3);
                if ((zArr == null || !zArr[d.c]) && d != duqVar && (((i = d.n) == 3 || i == 4) && b < f)) {
                    f = b;
                    duqVar2 = d;
                }
            }
        }
        return duqVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(duq duqVar) {
        duq duqVar2 = this.a;
        if (duqVar2 != null) {
            this.e.g(duqVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(duqVar, true);
        this.a = duqVar;
        if (f != 1.0f) {
            this.b /= f;
            dul dulVar = this.e;
            int i = dulVar.e;
            for (int i2 = 0; i != -1 && i2 < dulVar.a; i2++) {
                float[] fArr = dulVar.d;
                fArr[i] = fArr[i] / f;
                i = dulVar.c[i];
            }
        }
    }

    public final void c(dun dunVar, duq duqVar, boolean z) {
        if (duqVar != null && duqVar.g) {
            this.b += duqVar.f * this.e.a(duqVar);
            this.e.c(duqVar, z);
            if (z) {
                duqVar.b(this);
            }
            if (this.e.a == 0) {
                this.d = true;
                dunVar.c = true;
            }
        }
    }

    public void d(dun dunVar, dum dumVar, boolean z) {
        dul dulVar = this.e;
        float a = dulVar.a(dumVar.a);
        dulVar.c(dumVar.a, z);
        dul dulVar2 = dumVar.e;
        int i = dulVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            duq d = dulVar2.d(i2);
            dulVar.e(d, dulVar2.a(d) * a, z);
        }
        this.b += dumVar.b * a;
        if (z) {
            dumVar.a.b(this);
        }
        if (this.a != null && this.e.a == 0) {
            this.d = true;
            dunVar.c = true;
        }
    }

    public boolean e() {
        if (this.a == null && this.b == brg.a && this.e.a == 0) {
            return true;
        }
        return false;
    }

    public final void f(dun dunVar, int i) {
        this.e.g(dunVar.p(i), 1.0f);
        this.e.g(dunVar.p(i), -1.0f);
    }

    public final void g(duq duqVar, duq duqVar2, duq duqVar3, duq duqVar4, float f) {
        this.e.g(duqVar, -1.0f);
        this.e.g(duqVar2, 1.0f);
        this.e.g(duqVar3, f);
        this.e.g(duqVar4, -f);
    }

    public final void h(duq duqVar, duq duqVar2, duq duqVar3, int i) {
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
                this.e.g(duqVar, 1.0f);
                this.e.g(duqVar2, -1.0f);
                this.e.g(duqVar3, -1.0f);
                return;
            }
        }
        this.e.g(duqVar, -1.0f);
        this.e.g(duqVar2, 1.0f);
        this.e.g(duqVar3, 1.0f);
    }

    public final void i(duq duqVar, duq duqVar2, duq duqVar3, int i) {
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
                this.e.g(duqVar, 1.0f);
                this.e.g(duqVar2, -1.0f);
                this.e.g(duqVar3, 1.0f);
                return;
            }
        }
        this.e.g(duqVar, -1.0f);
        this.e.g(duqVar2, 1.0f);
        this.e.g(duqVar3, -1.0f);
    }

    public final void j(duq duqVar, duq duqVar2, duq duqVar3, duq duqVar4, float f) {
        this.e.g(duqVar3, 0.5f);
        this.e.g(duqVar4, 0.5f);
        this.e.g(duqVar, -0.5f);
        this.e.g(duqVar2, -0.5f);
        this.b = -f;
    }

    public duq k(boolean[] zArr) {
        return a(zArr, null);
    }

    public String toString() {
        String concat;
        boolean z;
        String str;
        duq duqVar = this.a;
        if (duqVar == null) {
            concat = "0";
        } else {
            Objects.toString(duqVar);
            concat = "".concat(String.valueOf(duqVar));
        }
        float f = this.b;
        String concat2 = concat.concat(" = ");
        if (f != brg.a) {
            concat2 = concat2 + this.b;
            z = true;
        } else {
            z = false;
        }
        int i = this.e.a;
        for (int i2 = 0; i2 < i; i2++) {
            duq d = this.e.d(i2);
            if (d != null) {
                float b = this.e.b(i2);
                if (b != brg.a) {
                    String duqVar2 = d.toString();
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
                        concat2 = concat2.concat(duqVar2);
                    } else {
                        concat2 = concat2 + b + " " + duqVar2;
                    }
                    z = true;
                }
            }
        }
        if (!z) {
            return concat2.concat("0.0");
        }
        return concat2;
    }

    public dum(ktk ktkVar) {
        this.e = new dul(this, ktkVar);
    }
}
