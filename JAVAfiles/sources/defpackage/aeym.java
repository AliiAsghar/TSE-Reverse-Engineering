package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeym {
    public final aeyn a;

    public aeym(aeyn aeynVar) {
        this.a = aeynVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aeym) && d.F(this.a, ((aeym) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SimBarUiData(simChipUiData=" + this.a + ")";
    }
}
