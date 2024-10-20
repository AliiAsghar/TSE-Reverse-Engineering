package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzl {
    public final String a;
    public final arqr b;
    private final String c;

    public zzl(String str, String str2, arqr arqrVar) {
        this.c = str;
        this.a = str2;
        this.b = arqrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzlVar = (zzl) obj;
        if (d.F(this.c, zzlVar.c) && d.F(this.a, zzlVar.a) && d.F(this.b, zzlVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ButtonUiData(contentDescription=" + this.c + ", title=" + this.a + ", onClick=" + this.b + ")";
    }
}
