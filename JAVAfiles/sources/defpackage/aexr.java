package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexr {
    public final long a;
    public final cuc b;
    public final cuc c;
    public final cuc d;
    public final List e;
    public final cuc f;

    public aexr(long j, cuc cucVar, cuc cucVar2, cuc cucVar3, List list, cuc cucVar4) {
        cucVar.getClass();
        cucVar2.getClass();
        cucVar3.getClass();
        cucVar4.getClass();
        this.a = j;
        this.b = cucVar;
        this.c = cucVar2;
        this.d = cucVar3;
        this.e = list;
        this.f = cucVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aexr)) {
            return false;
        }
        aexr aexrVar = (aexr) obj;
        if (a.bB(this.a, aexrVar.a) && d.F(this.b, aexrVar.b) && d.F(this.c, aexrVar.c) && d.F(this.d, aexrVar.d) && d.F(this.e, aexrVar.e) && d.F(this.f, aexrVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((a.A(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "RichCardTextMeasurables(constraints=" + dqs.e(this.a) + ", spacer=" + this.b + ", title=" + this.c + ", desc=" + this.d + ", actions=" + this.e + ", bottomSpacer=" + this.f + ")";
    }
}
