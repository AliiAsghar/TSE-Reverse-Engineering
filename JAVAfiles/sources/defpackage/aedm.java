package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aedm extends adcx {
    public final aect a;
    public final long b;
    public final List c;
    public final List d;
    public final aozb e;
    public final int f;

    public aedm(aect aectVar, long j, List list, List list2, aozb aozbVar) {
        super(null, null);
        this.a = aectVar;
        this.b = j;
        this.c = list;
        this.d = list2;
        this.e = aozbVar;
        this.f = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aedm)) {
            return false;
        }
        aedm aedmVar = (aedm) obj;
        if (!d.F(this.a, aedmVar.a) || !a.bB(this.b, aedmVar.b) || !d.F(this.c, aedmVar.c) || !d.F(this.d, aedmVar.d) || !d.F(this.e, aedmVar.e)) {
            return false;
        }
        int i = aedmVar.f;
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = arut.a;
        int A = ((((((hashCode + a.A(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        a.bm(2);
        return (A * 31) + 2;
    }
}
