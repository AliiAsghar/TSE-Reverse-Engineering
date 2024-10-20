package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anbs extends Number implements Comparable, Serializable {
    public final long a;

    static {
        new anbs(0L);
        new anbs(1L);
        new anbs(-1L);
    }

    public anbs(long j) {
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        anbs anbsVar = (anbs) obj;
        anbsVar.getClass();
        return albo.cg(this.a, anbsVar.a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        long j = this.a;
        if (j >= 0) {
            return j;
        }
        double d = (j & 1) | (j >>> 1);
        return d + d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anbs) || this.a != ((anbs) obj).a) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        long j = this.a;
        if (j >= 0) {
            return (float) j;
        }
        float f = (float) ((j & 1) | (j >>> 1));
        return f + f;
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.a;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.a;
    }

    public final String toString() {
        albo.L(true, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", 10);
        long j = this.a;
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, 10);
        }
        long j2 = (j >>> 1) / 5;
        char[] cArr = new char[64];
        int i = 63;
        cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
        while (j2 > 0) {
            i--;
            cArr[i] = Character.forDigit((int) (j2 % 10), 10);
            j2 /= 10;
        }
        return new String(cArr, i, 64 - i);
    }
}
