package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class amdp extends amdr {
    final int a;
    final long b;
    final double c;

    public amdp(long j, double d, int i) {
        this.a = amdr.c(i);
        if (j > 0) {
            this.b = j;
            albo.Q(d > 0.0d, "%s (%s) must be > 0", "multiplier", Double.valueOf(d));
            this.c = d;
            return;
        }
        throw new IllegalArgumentException(albo.F("%s (%s) must be > 0", "firstDelayMillis", Long.valueOf(j)));
    }

    @Override // defpackage.amdr
    public final long a(int i) {
        if (i == 0) {
            return 0L;
        }
        if (!b(i)) {
            return -1L;
        }
        return (long) (this.b * Math.pow(this.c, i - 1));
    }

    @Override // defpackage.amdr
    public final boolean b(int i) {
        amdr.e(i);
        if (i < this.a) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amdp) {
            amdp amdpVar = (amdp) obj;
            if (this.b == amdpVar.b && this.c == amdpVar.c && this.a == amdpVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Double.valueOf(this.c)});
    }
}
