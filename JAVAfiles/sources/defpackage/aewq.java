package defpackage;

import defpackage.cko;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aewq implements aewn {
    public final aaw a;
    private final long b;
    private final float c = 0.6f;

    public aewq(long j, aaw aawVar) {
        this.b = j;
        this.a = aawVar;
    }

    @Override // defpackage.aewn
    public final float a(float f) {
        if (f <= 0.6f) {
            return drv.b(brg.a, 1.0f, f / 0.6f);
        }
        return drv.b(1.0f, brg.a, (f - 0.6f) / 0.39999998f);
    }

    @Override // defpackage.aewn
    public final aaw b() {
        return this.a;
    }

    @Override // defpackage.aewn
    public final cko c(float f, long j) {
        long f2;
        long f3;
        f2 = ckw.f(cku.d(r0), cku.c(r0), cku.b(r0), brg.a, cku.f(this.b));
        long j2 = this.b;
        f3 = ckw.f(cku.d(j2), cku.c(j2), cku.b(j2), brg.a, cku.f(j2));
        List B = aqjn.B(new cku(f2), new cku(j2), new cku(f3));
        long floatToRawIntBits = Float.floatToRawIntBits(brg.a);
        long floatToRawIntBits2 = Float.floatToRawIntBits(brg.a);
        float max = Math.max(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))) * f;
        return cko.a.a(B, (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), arrn.o(max + max, 0.01f), 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aewq)) {
            return false;
        }
        aewq aewqVar = (aewq) obj;
        if (!a.bB(this.b, aewqVar.b) || !d.F(this.a, aewqVar.a)) {
            return false;
        }
        float f = aewqVar.c;
        if (Float.compare(0.6f, 0.6f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = cku.a;
        return (((a.A(this.b) * 31) + this.a.hashCode()) * 31) + Float.floatToIntBits(0.6f);
    }

    public final String toString() {
        return "Shimmer(highlightColor=" + cku.g(this.b) + ", animationSpec=" + this.a + ", progressForMaxAlpha=0.6)";
    }
}
