package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aesl implements aesp {
    public final String a;

    public aesl(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aesl) && d.F(this.a, ((aesl) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InlineHeader(text=" + this.a + ")";
    }
}
