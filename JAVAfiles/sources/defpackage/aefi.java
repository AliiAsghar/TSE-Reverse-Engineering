package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aefi {
    public final long a;
    public final byte[] b;

    public aefi(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aefi)) {
            return false;
        }
        aefi aefiVar = (aefi) obj;
        if (this.a == aefiVar.a && d.F(this.b, aefiVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.A(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "DEFAULT\n" + this.a + "\n" + amcn.e.j(this.b);
    }
}
