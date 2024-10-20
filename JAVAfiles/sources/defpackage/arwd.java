package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arwd extends arpa {
    public static final akty b = new akty();
    public final String a;

    public arwd(String str) {
        super(b);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof arwd) && d.F(this.a, ((arwd) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.a + ")";
    }
}
