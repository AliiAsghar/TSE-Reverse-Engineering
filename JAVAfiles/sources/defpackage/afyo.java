package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afyo {
    public final agfn a;
    public final afkq b;
    public final agff c;
    public final boolean d;
    private final boolean e;

    public afyo(agfn agfnVar, afkq afkqVar, agff agffVar, boolean z) {
        agfnVar.getClass();
        this.a = agfnVar;
        this.b = afkqVar;
        this.c = agffVar;
        this.d = z;
        this.e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afyo)) {
            return false;
        }
        afyo afyoVar = (afyo) obj;
        if (!d.F(this.a, afyoVar.a) || !d.F(this.b, afyoVar.b) || !d.F(this.c, afyoVar.c) || this.d != afyoVar.d) {
            return false;
        }
        boolean z = afyoVar.e;
        return true;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.v(this.d)) * 31) + a.v(false);
    }

    public final String toString() {
        return "HugoUiData(inputDisplay=" + this.a + ", draftController=" + this.b + ", stateCollector=" + this.c + ", enableThemingHugo=" + this.d + ", enableSkipUpdateWhenFragmentDestroyed=false)";
    }

    public /* synthetic */ afyo(agfn agfnVar, afkq afkqVar, agff agffVar, int i) {
        this(agfnVar, afkqVar, (i & 4) != 0 ? afyn.a : agffVar, false);
    }
}
