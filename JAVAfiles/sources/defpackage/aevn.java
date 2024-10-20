package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aevn {
    public final aeib a;

    public aevn(aeib aeibVar) {
        this.a = aeibVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aevn) && d.F(this.a, ((aevn) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "AiSummary(uiData=" + this.a + ")";
    }
}
