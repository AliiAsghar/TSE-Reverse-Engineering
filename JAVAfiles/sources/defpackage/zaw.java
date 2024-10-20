package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zaw {
    public final String a;
    public final boolean b;

    public zaw() {
        this("");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zaw) && d.F(this.a, ((zaw) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GroupNameConfig(name=" + this.a + ")";
    }

    public zaw(String str) {
        this.a = str;
        this.b = str.length() > 0;
    }
}
