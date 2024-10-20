package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhb extends lga {
    private final Throwable a;

    public nhb(Throwable th) {
        super((short[]) null);
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nhb) && d.F(this.a, ((nhb) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlayerNotPrepared(throwable=" + this.a + ")";
    }
}
