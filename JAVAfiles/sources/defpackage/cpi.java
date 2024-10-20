package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpi extends cpf {
    public final String a;
    public final List b;
    public final int c;
    public final cko d;
    public final float e;
    public final cko f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public cpi(String str, List list, int i, cko ckoVar, float f, cko ckoVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = ckoVar;
        this.e = f;
        this.f = ckoVar2;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cpi cpiVar = (cpi) obj;
            if (d.F(this.a, cpiVar.a) && d.F(this.d, cpiVar.d) && this.e == cpiVar.e && d.F(this.f, cpiVar.f) && this.g == cpiVar.g && this.h == cpiVar.h && a.bA(this.i, cpiVar.i) && a.bA(this.j, cpiVar.j) && this.k == cpiVar.k && this.l == cpiVar.l && this.m == cpiVar.m && this.n == cpiVar.n && a.bA(this.c, cpiVar.c) && d.F(this.b, cpiVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        cko ckoVar = this.d;
        int i2 = 0;
        if (ckoVar != null) {
            i = ckoVar.hashCode();
        } else {
            i = 0;
        }
        int floatToIntBits = ((((hashCode * 31) + i) * 31) + Float.floatToIntBits(this.e)) * 31;
        cko ckoVar2 = this.f;
        if (ckoVar2 != null) {
            i2 = ckoVar2.hashCode();
        }
        return ((((((((((((((((((floatToIntBits + i2) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + this.i) * 31) + this.j) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(this.l)) * 31) + Float.floatToIntBits(this.m)) * 31) + Float.floatToIntBits(this.n)) * 31) + this.c;
    }
}
