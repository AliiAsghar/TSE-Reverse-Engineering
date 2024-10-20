package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aekw implements aelb {
    public final String a;
    public final int b;
    public final String c;
    public final aeli d;

    public aekw(String str, int i, String str2, aeli aeliVar) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = aeliVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aekw)) {
            return false;
        }
        aekw aekwVar = (aekw) obj;
        if (d.F(this.a, aekwVar.a) && this.b == aekwVar.b && d.F(this.c, aekwVar.c) && d.F(this.d, aekwVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
        this.d.hashCode();
        return (hashCode * 31) + 32;
    }

    public final String toString() {
        return "Emoji(emoji=" + this.a + ", count=" + this.b + ", contentDescription=" + this.c + ", style=" + this.d + ")";
    }
}
