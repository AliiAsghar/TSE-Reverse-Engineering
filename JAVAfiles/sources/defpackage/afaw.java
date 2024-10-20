package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afaw {
    public final afat a;
    public final aehz b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final arqr f;
    private final afav g;

    public /* synthetic */ afaw(afat afatVar, aehz aehzVar, List list, boolean z, arqr arqrVar, afav afavVar, int i) {
        boolean z2;
        list = (i & 4) != 0 ? arnv.a : list;
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = z & ((i & 16) == 0);
        arqrVar = (i & 32) != 0 ? aeys.e : arqrVar;
        afavVar = (i & 64) != 0 ? new afav(null) : afavVar;
        aehzVar.getClass();
        list.getClass();
        arqrVar.getClass();
        afavVar.getClass();
        this.a = afatVar;
        this.b = aehzVar;
        this.c = list;
        this.d = z2;
        this.e = z3;
        this.f = arqrVar;
        this.g = afavVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afaw)) {
            return false;
        }
        afaw afawVar = (afaw) obj;
        if (d.F(this.a, afawVar.a) && d.F(this.b, afawVar.b) && d.F(this.c, afawVar.c) && this.d == afawVar.d && this.e == afawVar.e && d.F(this.f, afawVar.f) && d.F(this.g, afawVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        arqr arqrVar = this.f;
        return (((((((hashCode * 31) + a.v(this.d)) * 31) + a.v(this.e)) * 31) + arqrVar.hashCode()) * 31) + 39584;
    }

    public final String toString() {
        return "TopAppBarUiData(middleUiData=" + this.a + ", onBackAction=" + this.b + ", actions=" + this.c + ", liftOnScroll=" + this.d + ", isTranslucent=" + this.e + ", onInteractive=" + this.f + ", flags=" + this.g + ")";
    }
}
