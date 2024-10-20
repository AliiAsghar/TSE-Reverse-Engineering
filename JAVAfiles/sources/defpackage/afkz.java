package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afkz extends aeke {
    public final Throwable a;

    public afkz(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afkz) && d.F(this.a, ((afkz) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Rejected(cause=" + this.a + ")";
    }
}
