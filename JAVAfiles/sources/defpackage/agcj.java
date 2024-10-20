package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agcj {
    public final Object a;
    public final agcw b;
    public final agck c;

    public agcj(Object obj, agcw agcwVar, agck agckVar) {
        this.a = obj;
        this.b = agcwVar;
        this.c = agckVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agcj)) {
            return false;
        }
        agcj agcjVar = (agcj) obj;
        if (d.F(this.a, agcjVar.a) && d.F(this.b, agcjVar.b) && d.F(this.c, agcjVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Projection(uiData=" + this.a + ", uiSpec=" + this.b + ", lifecycle=" + this.c + ")";
    }
}
