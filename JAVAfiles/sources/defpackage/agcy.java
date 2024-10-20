package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agcy {
    public final aerb a;
    public final String b;
    public final arqg c;

    public agcy(aerb aerbVar, String str, arqg arqgVar) {
        aerbVar.getClass();
        str.getClass();
        arqgVar.getClass();
        this.a = aerbVar;
        this.b = str;
        this.c = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agcy)) {
            return false;
        }
        agcy agcyVar = (agcy) obj;
        if (this.a == agcyVar.a && d.F(this.b, agcyVar.b) && d.F(this.c, agcyVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ToolbarAction(icon=" + this.a + ", title=" + this.b + ", onClick=" + this.c + ")";
    }
}
