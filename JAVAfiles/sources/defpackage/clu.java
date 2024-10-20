package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clu extends clz {
    private final List a;
    private final long c;
    private final float d;
    private final List b = null;
    private final int e = 0;

    public clu(List list, long j, float f) {
        this.a = list;
        this.c = j;
        this.d = f;
    }

    @Override // defpackage.clz
    public final Shader b(long j) {
        long j2;
        float intBitsToFloat;
        long j3;
        float intBitsToFloat2;
        long j4 = this.c;
        if ((9223372034707292159L & j4) == 9205357640488583168L) {
            long a = cju.a(j);
            intBitsToFloat = Float.intBitsToFloat((int) (a >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (a & 4294967295L));
        } else {
            if (Float.intBitsToFloat((int) (j4 >> 32)) == Float.POSITIVE_INFINITY) {
                j2 = j >> 32;
            } else {
                j2 = this.c >> 32;
            }
            intBitsToFloat = Float.intBitsToFloat((int) j2);
            if (Float.intBitsToFloat((int) (this.c & 4294967295L)) == Float.POSITIVE_INFINITY) {
                j3 = j & 4294967295L;
            } else {
                j3 = this.c & 4294967295L;
            }
            intBitsToFloat2 = Float.intBitsToFloat((int) j3);
        }
        List list = this.a;
        long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L;
        float f = this.d;
        if (f == Float.POSITIVE_INFINITY) {
            f = cjt.b(j) / 2.0f;
        }
        long j5 = floatToRawIntBits2 | floatToRawIntBits;
        cki.c(list);
        return new RadialGradient(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), f, cki.a(list), (float[]) null, ckj.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clu)) {
            return false;
        }
        clu cluVar = (clu) obj;
        if (!d.F(this.a, cluVar.a)) {
            return false;
        }
        List list = cluVar.b;
        if (!d.F(null, null) || !a.bB(this.c, cluVar.c) || this.d != cluVar.d) {
            return false;
        }
        int i = cluVar.e;
        if (a.bA(0, 0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 961) + a.A(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31;
    }

    public final String toString() {
        String str;
        String str2 = "";
        if ((this.c & 9223372034707292159L) == 9205357640488583168L) {
            str = "";
        } else {
            str = "center=" + ((Object) cjn.f(this.c)) + ", ";
        }
        if ((Float.floatToRawIntBits(this.d) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + this.d + ", ";
        }
        return "RadialGradient(colors=" + this.a + ", stops=null, " + str + str2 + "tileMode=" + ((Object) cmf.a()) + ')';
    }
}
