package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afyk {
    public final ageo a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    private final boolean i;
    private final boolean j;

    public afyk() {
        this(null, false, false, false, false, false, false, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afyk)) {
            return false;
        }
        afyk afykVar = (afyk) obj;
        if (!d.F(this.a, afykVar.a) || this.b != afykVar.b || this.c != afykVar.c) {
            return false;
        }
        boolean z = afykVar.i;
        if (this.d != afykVar.d || this.e != afykVar.e || this.f != afykVar.f) {
            return false;
        }
        boolean z2 = afykVar.j;
        if (this.g == afykVar.g && this.h == afykVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        ageo ageoVar = this.a;
        if (ageoVar == null) {
            hashCode = 0;
        } else {
            hashCode = ageoVar.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + a.v(this.b)) * 31) + a.v(this.c)) * 31) + a.v(false)) * 31) + a.v(this.d)) * 31) + a.v(this.e)) * 31) + a.v(this.f)) * 31) + a.v(false)) * 31) + a.v(this.g)) * 31) + a.v(this.h);
    }

    public final String toString() {
        return "HugoHostFragmentConfiguration(hugoScreenStateListener=" + this.a + ", enableHugoManagerConfigurationPersistence=" + this.b + ", enableDeferredHeightUpdate=" + this.c + ", enableOverrideScreenConfigurationOnScreenOpen=false, reopenOpenScreenOnRestore=" + this.d + ", enableConfigurationChangeDispatch=" + this.e + ", useProvidedDraftController=" + this.f + ", closeKeyboardAndInputOnClose=false, checkIfProxyActiveScreenHasChanged=" + this.g + ", checkRenderingStateOnBackNavigation=" + this.h + ")";
    }

    public /* synthetic */ afyk(ageo ageoVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        this.a = 1 == (i & 1) ? null : ageoVar;
        this.b = ((i & 2) == 0) & z;
        this.c = ((i & 4) == 0) & z2;
        this.i = false;
        this.d = (i & 16) != 0;
        this.e = (!((i & 32) == 0)) | z3;
        this.f = (!((i & 64) == 0)) | z4;
        this.j = false;
        this.g = (!((i & 256) == 0)) | z5;
        this.h = (!((i & 512) == 0)) | z6;
    }
}
