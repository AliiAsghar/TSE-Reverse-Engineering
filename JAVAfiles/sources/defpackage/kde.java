package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kde {
    public final miz a;

    public kde(miz mizVar) {
        this.a = mizVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kde) && d.F(this.a, ((kde) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProgressBarOverlayArgs(message=" + this.a + ")";
    }
}
