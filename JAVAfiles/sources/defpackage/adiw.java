package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adiw implements adiv {
    public final String a;

    public adiw(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof adiw) && d.F(this.a, ((adiw) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SimId(idValue=" + this.a + ")";
    }
}
