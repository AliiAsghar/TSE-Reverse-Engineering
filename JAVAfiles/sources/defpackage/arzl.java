package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arzl extends arzm {
    public final Throwable a;

    public arzl(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof arzl) && d.F(this.a, ((arzl) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.arzm
    public final String toString() {
        return "Closed(" + this.a + ")";
    }
}
