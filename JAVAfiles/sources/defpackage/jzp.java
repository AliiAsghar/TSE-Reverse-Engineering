package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzp {
    public final jzz a;
    public final jzk b;
    public final arwe c;

    public jzp(jzz jzzVar, jzk jzkVar, arwe arweVar) {
        this.a = jzzVar;
        this.b = jzkVar;
        this.c = arweVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzp)) {
            return false;
        }
        jzp jzpVar = (jzp) obj;
        if (d.F(this.a, jzpVar.a) && d.F(this.b, jzpVar.b) && d.F(this.c, jzpVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CacheValue(messageBubbleArgs=" + this.a + ", uiDataWrapper=" + this.b + ", scope=" + this.c + ")";
    }
}
