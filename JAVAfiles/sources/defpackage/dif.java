package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dif {
    public final die a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public dif(die dieVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = dieVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public static /* synthetic */ long j(dif difVar, long j) {
        return difVar.g(j, true);
    }

    public final float a(float f) {
        return f + this.f;
    }

    public final int b() {
        return this.c - this.b;
    }

    public final int c(int i) {
        return i + this.b;
    }

    public final int d(int i) {
        return i + this.d;
    }

    public final int e(int i) {
        int i2 = this.b;
        return arrn.u(i, i2, this.c) - i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dif)) {
            return false;
        }
        dif difVar = (dif) obj;
        if (d.F(this.a, difVar.a) && this.b == difVar.b && this.c == difVar.c && this.d == difVar.d && this.e == difVar.e && Float.compare(this.f, difVar.f) == 0 && Float.compare(this.g, difVar.g) == 0) {
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return i - this.d;
    }

    public final long g(long j, boolean z) {
        if (z) {
            long j2 = djc.a;
            if (a.bB(j, j2)) {
                return j2;
            }
        }
        return djd.a(c(djc.e(j)), c(djc.a(j)));
    }

    public final cjp h(cjp cjpVar) {
        return cjpVar.f((Float.floatToRawIntBits(brg.a) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L));
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g);
    }

    public final cjp i(cjp cjpVar) {
        return cjpVar.f((Float.floatToRawIntBits(brg.a) << 32) | (Float.floatToRawIntBits(-this.f) & 4294967295L));
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ')';
    }
}
