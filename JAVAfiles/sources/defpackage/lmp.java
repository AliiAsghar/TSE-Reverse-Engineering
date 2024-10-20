package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmp implements lkf {
    public final lmq a;

    public lmp(lmq lmqVar) {
        this.a = lmqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lmp) && d.F(this.a, ((lmp) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        this.a.hashCode();
        return 3;
    }

    public final String toString() {
        return "Home(arguments=" + this.a + ")";
    }
}
