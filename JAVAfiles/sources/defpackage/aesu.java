package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aesu extends aetn {
    public final String a;

    public aesu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aesu) && d.F(this.a, ((aesu) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Emoji(emoji=" + this.a + ")";
    }
}
