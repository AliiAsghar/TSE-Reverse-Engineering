package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmp {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public fmp(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fmp fmpVar = (fmp) obj;
            if (this.a == fmpVar.a && this.c == fmpVar.c && this.d == fmpVar.d && Arrays.equals(this.b, fmpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }
}
