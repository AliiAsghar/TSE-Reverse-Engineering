package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqp {
    public static final dqp a = new dqp(2, false);
    private static final dqp d = new dqp(1, true);
    public final int b;
    public final boolean c;

    public dqp(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqp)) {
            return false;
        }
        dqp dqpVar = (dqp) obj;
        if (a.bA(this.b, dqpVar.b) && this.c == dqpVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + a.v(this.c);
    }

    public final String toString() {
        if (d.F(this, a)) {
            return "TextMotion.Static";
        }
        if (d.F(this, d)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
