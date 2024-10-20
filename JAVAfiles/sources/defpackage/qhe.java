package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qhe extends qhl {
    public final qei a;

    public qhe(qei qeiVar) {
        qeiVar.getClass();
        this.a = qeiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qhe) && d.F(this.a, ((qhe) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InvalidateCapabilitiesCacheData(destination=" + this.a + ")";
    }
}
