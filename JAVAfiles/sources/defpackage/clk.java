package defpackage;

import android.graphics.Shader;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clk extends clz {
    private final List a;
    private final long c;
    private final long d;
    private final List b = null;
    private final int e = 0;

    public clk(List list, long j, long j2) {
        this.a = list;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.clz
    public final Shader b(long j) {
        long j2;
        long j3;
        long j4;
        if (Float.intBitsToFloat((int) (this.c >> 32)) == Float.POSITIVE_INFINITY) {
            j2 = j >> 32;
        } else {
            j2 = this.c >> 32;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) j2);
        if (Float.intBitsToFloat((int) (this.c & 4294967295L)) == Float.POSITIVE_INFINITY) {
            j3 = j & 4294967295L;
        } else {
            j3 = this.c & 4294967295L;
        }
        float intBitsToFloat2 = Float.intBitsToFloat((int) j3);
        if (Float.intBitsToFloat((int) (this.d >> 32)) == Float.POSITIVE_INFINITY) {
            j4 = j >> 32;
        } else {
            j4 = this.d >> 32;
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) j4);
        if (Float.intBitsToFloat((int) (this.d & 4294967295L)) != Float.POSITIVE_INFINITY) {
            j = this.d;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return cki.b((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clk)) {
            return false;
        }
        clk clkVar = (clk) obj;
        if (!d.F(this.a, clkVar.a)) {
            return false;
        }
        List list = clkVar.b;
        if (!d.F(null, null) || !a.bB(this.c, clkVar.c) || !a.bB(this.d, clkVar.d)) {
            return false;
        }
        int i = clkVar.e;
        if (a.bA(0, 0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 961) + a.A(this.c)) * 31) + a.A(this.d)) * 31;
    }

    public final String toString() {
        String str;
        String str2 = "";
        if (((((this.c & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0) {
            str = "";
        } else {
            str = "start=" + ((Object) cjn.f(this.c)) + ", ";
        }
        if ((((9187343241974906880L ^ (this.d & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) cjn.f(this.d)) + ", ";
        }
        return "LinearGradient(colors=" + this.a + ", stops=null, " + str + str2 + "tileMode=" + ((Object) cmf.a()) + ')';
    }
}
