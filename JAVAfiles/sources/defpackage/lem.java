package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lem implements leo {
    public final String a;

    public lem(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lem) && d.F(this.a, ((lem) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Conversation(id=" + this.a + ")";
    }
}
