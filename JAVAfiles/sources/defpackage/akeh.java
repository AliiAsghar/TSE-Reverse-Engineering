package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akeh extends akec {
    private final arnb a = arnb.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof akeh) && d.F(this.a, ((akeh) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Reading(unit=" + this.a + ")";
    }
}
