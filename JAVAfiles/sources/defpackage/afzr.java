package defpackage;

import android.content.res.ColorStateList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afzr {
    public final blh a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ColorStateList f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final ColorStateList k;

    public afzr(blh blhVar, int i, int i2, int i3, int i4, ColorStateList colorStateList, int i5, int i6, int i7, int i8, ColorStateList colorStateList2) {
        colorStateList2.getClass();
        this.a = blhVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = colorStateList;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = colorStateList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afzr)) {
            return false;
        }
        afzr afzrVar = (afzr) obj;
        if (d.F(this.a, afzrVar.a) && this.b == afzrVar.b && this.c == afzrVar.c && this.d == afzrVar.d && this.e == afzrVar.e && d.F(this.f, afzrVar.f) && this.g == afzrVar.g && this.h == afzrVar.h && this.i == afzrVar.i && this.j == afzrVar.j && d.F(this.k, afzrVar.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "HugoColors(colorScheme=" + this.a + ", selected=" + this.b + ", notSelected=" + this.c + ", tabBackground=" + this.d + ", tabForeground=" + this.e + ", categoryTabColorStateList=" + this.f + ", searchBarBackground=" + this.g + ", errorButtonBackground=" + this.h + ", errorButtonText=" + this.i + ", backspaceBackground=" + this.j + ", backspaceImageTintList=" + this.k + ")";
    }
}
