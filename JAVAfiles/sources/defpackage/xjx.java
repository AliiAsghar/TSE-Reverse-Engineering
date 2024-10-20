package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xjx {
    public final int a;
    public final int b;
    public final int c;
    private final int d;
    private final int e;

    public xjx(int i) {
        boolean z;
        this.d = i;
        Object e = xim.e.e();
        e.getClass();
        this.a = ((Number) e).intValue();
        Object e2 = xim.g.e();
        e2.getClass();
        int intValue = ((Number) e2).intValue();
        this.e = intValue;
        Object e3 = xim.f.e();
        e3.getClass();
        int intValue2 = ((Number) e3).intValue();
        this.b = intValue2;
        this.c = arrn.u(i, intValue, intValue2);
        if (intValue <= intValue2) {
            z = true;
        } else {
            z = false;
        }
        albo.B(z, intValue, intValue2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xjx) && this.d == ((xjx) obj).d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return "BatchLimits(targetMessagesToUpdate=" + this.d + ")";
    }
}
