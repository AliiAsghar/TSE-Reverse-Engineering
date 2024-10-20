package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aezp {
    public final arqg a;
    private final boolean b;
    private final arqg c;
    private final arqg d;
    private final arqg e;

    public aezp() {
        this(null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aezp)) {
            return false;
        }
        aezp aezpVar = (aezp) obj;
        boolean z = aezpVar.b;
        if (d.F(this.c, aezpVar.c) && d.F(this.a, aezpVar.a) && d.F(this.d, aezpVar.d) && d.F(this.e, aezpVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.c.hashCode() + 38347) * 31) + this.a.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "AbcFlags(defaultFlagValue=false, useExpressiveMaterial=" + this.c + ", useGm3Ripples=" + this.a + ", useMonogramV2=" + this.d + ", useNewDividers=" + this.e + ")";
    }

    public /* synthetic */ aezp(arqg arqgVar, int i) {
        aewh aewhVar = (i & 2) != 0 ? new aewh(19) : null;
        arqgVar = (i & 4) != 0 ? new aewh(20) : arqgVar;
        aezo aezoVar = new aezo(1);
        aezo aezoVar2 = new aezo(0);
        aewhVar.getClass();
        arqgVar.getClass();
        this.b = false;
        this.c = aewhVar;
        this.a = arqgVar;
        this.d = aezoVar;
        this.e = aezoVar2;
    }
}
