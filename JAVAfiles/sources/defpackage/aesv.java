package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aesv extends aetn {
    public final String a;

    public aesv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aesv) && d.F(this.a, ((aesv) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Emotify(uri=" + this.a + ")";
    }
}
