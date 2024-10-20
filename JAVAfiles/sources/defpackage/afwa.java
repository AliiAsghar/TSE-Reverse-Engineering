package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwa implements agen {
    public final Map a;
    public final Integer b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final float h;
    private final boolean i;
    private final boolean j;

    public afwa() {
        this(false, false, false, false, brg.a, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afwa)) {
            return false;
        }
        afwa afwaVar = (afwa) obj;
        if (!d.F(this.a, afwaVar.a)) {
            return false;
        }
        boolean z = afwaVar.i;
        Integer num = afwaVar.b;
        if (!d.F(null, null)) {
            return false;
        }
        Integer num2 = afwaVar.c;
        if (!d.F(null, null)) {
            return false;
        }
        boolean z2 = afwaVar.j;
        if (this.d == afwaVar.d && this.e == afwaVar.e && this.f == afwaVar.f && this.g == afwaVar.g && Float.compare(this.h, afwaVar.h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((a.v(false) * 29791) + a.v(false)) * 31) + a.v(this.d)) * 31) + a.v(this.e)) * 31) + a.v(this.f)) * 31) + a.v(this.g)) * 31) + Float.floatToIntBits(this.h);
    }

    public final String toString() {
        return "ProxyScreenConfiguration(attachedScreenConfigurationOverrides=" + this.a + ", dismissIconWithSearchBar=false, searchBarTopInsetResId=null, searchBarBottomMarginResId=null, isEmotifyEntryPointEnabled=false, notifyOnStateChange=" + this.d + ", alwaysRespectSearchTerm=" + this.e + ", shouldDelayBindingSearchUntilRequired=" + this.f + ", shouldUnbindSearchBarWhenHidden=" + this.g + ", emotifySmallSegmentRatio=" + this.h + ")";
    }

    public /* synthetic */ afwa(boolean z, boolean z2, boolean z3, boolean z4, float f, int i) {
        arnw arnwVar = (i & 1) != 0 ? arnw.a : null;
        boolean z5 = z & ((i & 32) == 0);
        boolean z6 = z2 & ((i & 64) == 0);
        boolean z7 = z3 & ((i & 128) == 0);
        boolean z8 = z4 & ((i & 256) == 0);
        f = (i & 512) != 0 ? brg.a : f;
        arnwVar.getClass();
        this.a = arnwVar;
        this.i = false;
        this.b = null;
        this.c = null;
        this.j = false;
        this.d = z5;
        this.e = z6;
        this.f = z7;
        this.g = z8;
        this.h = f;
    }
}
