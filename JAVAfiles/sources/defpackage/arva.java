package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arva {
    public final Object a;
    public final long b;

    public arva(Object obj, long j) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arva)) {
            return false;
        }
        arva arvaVar = (arva) obj;
        if (d.F(this.a, arvaVar.a) && a.bB(this.b, arvaVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (hashCode * 31) + a.A(this.b);
    }

    public final String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + arut.l(this.b) + ")";
    }
}
