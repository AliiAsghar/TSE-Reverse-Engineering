package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afsp {
    public final afrw a;
    public final afrx b;
    private final afrv c;

    public afsp() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afsp)) {
            return false;
        }
        afsp afspVar = (afsp) obj;
        if (d.F(this.a, afspVar.a) && d.F(this.b, afspVar.b) && d.F(this.c, afspVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "MediaCapabilities(image=" + this.a + ", video=" + this.b + ", audio=" + this.c + ")";
    }

    public /* synthetic */ afsp(afrw afrwVar, int i) {
        afrwVar = (i & 1) != 0 ? new afrw(3) : afrwVar;
        afrx afrxVar = new afrx(null);
        afrv afrvVar = afrv.a;
        afrwVar.getClass();
        this.a = afrwVar;
        this.b = afrxVar;
        this.c = afrvVar;
    }
}
