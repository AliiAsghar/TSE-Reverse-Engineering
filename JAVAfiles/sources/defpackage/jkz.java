package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkz {
    public final aeip a;

    public jkz(aeip aeipVar) {
        this.a = aeipVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jkz) && d.F(this.a, ((jkz) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisabledComposeRowUiData(annotationUiData=" + this.a + ")";
    }
}
