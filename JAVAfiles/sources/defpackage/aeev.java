package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeev {
    public final aeew a;

    public aeev(aeew aeewVar) {
        this.a = aeewVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aeev) && d.F(this.a, ((aeev) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClassificationResult(verdict=" + this.a + ")";
    }
}
