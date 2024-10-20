package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afrw extends afry<afsk, afrw> {
    private final boolean a;
    private final boolean b;

    public afrw() {
        this(3);
    }

    @Override // defpackage.afry
    public final /* bridge */ /* synthetic */ boolean a(afru afruVar) {
        afsk afskVar = (afsk) afruVar;
        if (d.F(afskVar, afsi.a)) {
            return this.a;
        }
        if (!d.F(afskVar, afsb.a)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afrw)) {
            return false;
        }
        afrw afrwVar = (afrw) obj;
        if (this.a != afrwVar.a) {
            return false;
        }
        boolean z = afrwVar.b;
        return true;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + a.v(false);
    }

    public final String toString() {
        return "Image(supportsWebP=" + this.a + ", supportsHEIF=false)";
    }

    public afrw(boolean z) {
        this.a = z;
        this.b = false;
    }

    public /* synthetic */ afrw(int i) {
        this(1 == (i & 1));
    }
}
