package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeuw implements aeur {
    public final aewe a;

    public aeuw(aewe aeweVar) {
        this.a = aeweVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aeuw) && d.F(this.a, ((aeuw) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MetatextMonogramItemUiData(monogram=" + this.a + ")";
    }
}
