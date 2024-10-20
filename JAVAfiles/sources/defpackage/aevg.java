package defpackage;

/* compiled from: PG */
@armg
/* loaded from: classes4.dex */
public final class aevg implements aevl {
    public final arqg a;
    public final aerb b;
    public final aevf c;

    public aevg() {
        this(null, 0 == true ? 1 : 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aevg)) {
            return false;
        }
        aevg aevgVar = (aevg) obj;
        if (d.F(this.a, aevgVar.a) && this.b == aevgVar.b && d.F(this.c, aevgVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Cancelled(onRetryButtonClicked=" + this.a + ", icon=" + this.b + ", flags=" + this.c + ")";
    }

    public /* synthetic */ aevg(arqg arqgVar, aevf aevfVar, int i) {
        arqgVar = (i & 1) != 0 ? aepz.u : arqgVar;
        aerb aerbVar = (i & 2) != 0 ? aerb.v : null;
        aevfVar = (i & 4) != 0 ? new aevf((byte[]) null) : aevfVar;
        arqgVar.getClass();
        aerbVar.getClass();
        aevfVar.getClass();
        this.a = arqgVar;
        this.b = aerbVar;
        this.c = aevfVar;
    }
}
