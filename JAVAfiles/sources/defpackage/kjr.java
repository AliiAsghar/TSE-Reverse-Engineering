package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjr {
    public final ascv a;
    public final ascv b;
    public final ascv c;
    public final ascv d;
    public final ascv e;
    public final arqr f;
    private final kjq g;

    public kjr(ascv ascvVar, ascv ascvVar2, ascv ascvVar3, ascv ascvVar4, ascv ascvVar5, arqr arqrVar, kjq kjqVar) {
        ascvVar2.getClass();
        ascvVar3.getClass();
        ascvVar4.getClass();
        ascvVar5.getClass();
        this.a = ascvVar;
        this.b = ascvVar2;
        this.c = ascvVar3;
        this.d = ascvVar4;
        this.e = ascvVar5;
        this.f = arqrVar;
        this.g = kjqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjr)) {
            return false;
        }
        kjr kjrVar = (kjr) obj;
        if (d.F(this.a, kjrVar.a) && d.F(this.b, kjrVar.b) && d.F(this.c, kjrVar.c) && d.F(this.d, kjrVar.d) && d.F(this.e, kjrVar.e) && d.F(this.f, kjrVar.f) && d.F(this.g, kjrVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + 1237;
    }

    public final String toString() {
        return "TopContentUiData(rbmAppBarUiData=" + this.a + ", topAppBarUiData=" + this.b + ", textResultsBarUiData=" + this.c + ", bannersUiData=" + this.d + ", overrideSystemBack=" + this.e + ", onHeightComputed=" + this.f + ", flags=" + this.g + ")";
    }
}
