package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyf {
    public final aesg a;

    public zyf(aesg aesgVar) {
        this.a = aesgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zyf) && d.F(this.a, ((zyf) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActiveSimUiData(activeSim=" + this.a + ")";
    }
}
