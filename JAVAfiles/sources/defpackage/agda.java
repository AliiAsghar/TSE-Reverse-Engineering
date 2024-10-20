package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agda {
    public final afto a;
    public final String b;
    public final arqg c;

    public agda(afto aftoVar, String str, arqg arqgVar) {
        aftoVar.getClass();
        this.a = aftoVar;
        this.b = str;
        this.c = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agda)) {
            return false;
        }
        agda agdaVar = (agda) obj;
        if (d.F(this.a, agdaVar.a) && d.F(this.b, agdaVar.b) && d.F(this.c, agdaVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LocalImageRendererUiAdapterArgs(attachment=" + this.a + ", contentDescription=" + this.b + ", onDeleteButtonClick=" + this.c + ")";
    }
}
