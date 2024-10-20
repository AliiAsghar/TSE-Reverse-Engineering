package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbo {
    public final afbd a;
    public final ascv b;
    public final asai c;
    public final arqg d;
    public final qdq e;

    public kbo(afbd afbdVar, qdq qdqVar, ascv ascvVar, asai asaiVar, arqg arqgVar) {
        asaiVar.getClass();
        this.a = afbdVar;
        this.e = qdqVar;
        this.b = ascvVar;
        this.c = asaiVar;
        this.d = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbo)) {
            return false;
        }
        kbo kboVar = (kbo) obj;
        if (d.F(this.a, kboVar.a) && d.F(this.e, kboVar.e) && d.F(this.b, kboVar.b) && d.F(this.c, kboVar.c) && d.F(this.d, kboVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Transcript(uiData=" + this.a + ", uiAction=" + this.e + ", expandStateFlow=" + this.b + ", progressFlow=" + this.c + ", onPrepare=" + this.d + ")";
    }
}
