package defpackage;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class p extends Number implements Comparable {
    private static final long serialVersionUID = -4756200506571685661L;

    @Deprecated
    public final double a;

    @Deprecated
    public final int b;

    @Deprecated
    public final int c;

    @Deprecated
    public final long d;

    @Deprecated
    public final long e;

    @Deprecated
    public final long f;

    @Deprecated
    public final boolean g;

    @Deprecated
    public p(double d, int i) {
        int round;
        double d2 = i;
        int i2 = 0;
        if (i == 0) {
            round = 0;
        } else {
            double d3 = d < 0.0d ? -d : d;
            int pow = (int) Math.pow(10.0d, d2);
            round = (int) (Math.round(d3 * pow) % pow);
        }
        boolean z = d < 0.0d;
        this.g = z;
        long j = round;
        this.a = z ? -d : d;
        this.b = i;
        this.d = j;
        this.f = d > 1.0E18d ? 1000000000000000000L : (long) d;
        long j2 = 0;
        if (j != 0) {
            while (j % 10 == 0) {
                j /= 10;
                i--;
            }
            i2 = i;
            j2 = j;
        }
        this.e = j2;
        this.c = i2;
        Math.pow(10.0d, d2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new NotSerializableException();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new NotSerializableException();
    }

    @Override // java.lang.Comparable
    @Deprecated
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        p pVar = (p) obj;
        long j = pVar.f;
        long j2 = this.f;
        if (j2 != j) {
            if (j2 >= j) {
                return 1;
            }
            return -1;
        }
        double d = this.a;
        double d2 = pVar.a;
        if (d != d2) {
            if (d >= d2) {
                return 1;
            }
            return -1;
        }
        int i = this.b;
        int i2 = pVar.b;
        if (i != i2) {
            if (i >= i2) {
                return 1;
            }
            return -1;
        }
        long j3 = this.d - pVar.d;
        if (j3 != 0) {
            if (j3 >= 0) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // java.lang.Number
    @Deprecated
    public final double doubleValue() {
        if (this.g) {
            return -this.a;
        }
        return this.a;
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.a != pVar.a || this.b != pVar.b || this.d != pVar.d) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Number
    @Deprecated
    public final float floatValue() {
        return (float) this.a;
    }

    @Deprecated
    public final int hashCode() {
        return (int) (this.d + ((this.b + ((int) (this.a * 37.0d))) * 37));
    }

    @Override // java.lang.Number
    @Deprecated
    public final int intValue() {
        return (int) this.f;
    }

    @Override // java.lang.Number
    @Deprecated
    public final long longValue() {
        return this.f;
    }

    @Deprecated
    public final String toString() {
        return String.format("%." + this.b + "f", Double.valueOf(this.a));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p(java.lang.String r4) {
        /*
            r3 = this;
            double r0 = java.lang.Double.parseDouble(r4)
            java.lang.String r4 = r4.trim()
            r2 = 46
            int r2 = r4.indexOf(r2)
            int r2 = r2 + 1
            if (r2 != 0) goto L14
            r4 = 0
            goto L19
        L14:
            int r4 = r4.length()
            int r4 = r4 - r2
        L19:
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p.<init>(java.lang.String):void");
    }
}
