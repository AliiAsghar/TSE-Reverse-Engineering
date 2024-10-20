package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexo {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final List g;
    public final int h;
    public final int i;

    public aexo(int i, int i2, int i3, int i4, int i5, int i6, List list, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = list;
        this.h = i7;
        this.i = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aexo)) {
            return false;
        }
        aexo aexoVar = (aexo) obj;
        if (this.a == aexoVar.a && this.b == aexoVar.b && this.c == aexoVar.c && this.d == aexoVar.d && this.e == aexoVar.e && this.f == aexoVar.f && d.F(this.g, aexoVar.g) && this.h == aexoVar.h && this.i == aexoVar.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g.hashCode()) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        return "RichCardTextContentIntrinsics(maxHeight=" + this.a + ", spacer=" + this.b + ", titleMin=" + this.c + ", titleMax=" + this.d + ", descMin=" + this.e + ", descMax=" + this.f + ", actions=" + this.g + ", actionMax=" + this.h + ", bottomSpacer=" + this.i + ")";
    }
}
