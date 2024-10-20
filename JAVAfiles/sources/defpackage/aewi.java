package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aewi implements aewk {
    public final arqg a;
    public final aerb b;
    private final boolean c;
    private final arqg d;
    private final arqg e;
    private final String f;

    public aewi() {
        this(null, 0 == true ? 1 : 0, 63);
    }

    @Override // defpackage.aetv
    public final String a() {
        throw null;
    }

    @Override // defpackage.aetv
    public final arqg b() {
        return this.d;
    }

    @Override // defpackage.aetv
    public final arqg c() {
        return this.e;
    }

    @Override // defpackage.aetv
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aewi)) {
            return false;
        }
        aewi aewiVar = (aewi) obj;
        if (!d.F(this.a, aewiVar.a) || this.b != aewiVar.b) {
            return false;
        }
        boolean z = aewiVar.c;
        if (!d.F(this.d, aewiVar.d) || !d.F(this.e, aewiVar.e)) {
            return false;
        }
        String str = aewiVar.f;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1237) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
    }

    public final String toString() {
        return "Cancelled(onRetryButtonClicked=" + this.a + ", icon=" + this.b + ", isHighlighted=false, onClick=" + this.d + ", onLayout=" + this.e + ", contentDescription=null)";
    }

    public /* synthetic */ aewi(arqg arqgVar, aerb aerbVar, int i) {
        arqgVar = (i & 1) != 0 ? aewh.a : arqgVar;
        aerbVar = (i & 2) != 0 ? aerb.v : aerbVar;
        aewh aewhVar = aewh.c;
        aewh aewhVar2 = aewh.d;
        arqgVar.getClass();
        aerbVar.getClass();
        this.a = arqgVar;
        this.b = aerbVar;
        this.c = false;
        this.d = aewhVar;
        this.e = aewhVar2;
        this.f = null;
    }
}
