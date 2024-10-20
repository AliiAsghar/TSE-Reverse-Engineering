package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhr {
    public final String a;
    public final aesp b;
    public final String c;

    public lhr(String str, aesp aespVar, String str2) {
        str.getClass();
        this.a = str;
        this.b = aespVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhr)) {
            return false;
        }
        lhr lhrVar = (lhr) obj;
        if (d.F(this.a, lhrVar.a) && d.F(this.b, lhrVar.b) && d.F(this.c, lhrVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ContactUiData(id=" + this.a + ", itemUiData=" + this.b + ", header=" + this.c + ")";
    }
}
