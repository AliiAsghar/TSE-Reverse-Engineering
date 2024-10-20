package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agcl {
    public final agcj a;
    public final arxm b;

    public agcl(agcj agcjVar, arxm arxmVar) {
        this.a = agcjVar;
        this.b = arxmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agcl)) {
            return false;
        }
        agcl agclVar = (agcl) obj;
        if (d.F(this.a, agclVar.a) && d.F(this.b, agclVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ActiveProjection(projection=" + this.a + ", job=" + this.b + ")";
    }
}
