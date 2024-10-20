package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afnx implements agen {
    public final afmr a;
    public final boolean b;
    public final aflw c;
    public final Integer d;
    public final boolean e;
    public final afiu f;
    public final boolean g;
    private final alhr h;
    private final afka i;

    public afnx() {
        this(null, 0 == true ? 1 : 0, false, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afnx)) {
            return false;
        }
        afnx afnxVar = (afnx) obj;
        if (this.a != afnxVar.a || this.b != afnxVar.b || !d.F(this.h, afnxVar.h)) {
            return false;
        }
        aflw aflwVar = afnxVar.c;
        if (!d.F(null, null)) {
            return false;
        }
        Integer num = afnxVar.d;
        if (!d.F(null, null) || this.e != afnxVar.e) {
            return false;
        }
        afiu afiuVar = afnxVar.f;
        if (!d.F(null, null)) {
            return false;
        }
        afka afkaVar = afnxVar.i;
        if (d.F(null, null) && this.g == afnxVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        alhr alhrVar = this.h;
        if (alhrVar == null) {
            hashCode = 0;
        } else {
            hashCode = alhrVar.hashCode();
        }
        return ((((((hashCode2 + a.v(this.b)) * 31) + hashCode) * 29791) + a.v(this.e)) * 29791) + a.v(this.g);
    }

    public final String toString() {
        return "EmojiConfiguration(preferencesStrategy=" + this.a + ", showVariantPickerOnFirstVariableEmojiUse=" + this.b + ", emojiSearchManifestFileFlagSupplier=" + this.h + ", selectedEmoji=null, selectedEmojiBackgroundResId=null, showBackspaceButton=" + this.e + ", emojiUsageUserContext=null, emojiUsageFrecencyFactors=null, alwaysEnableSearchRendererBeforeSearch=" + this.g + ")";
    }

    public /* synthetic */ afnx(afmr afmrVar, alhr alhrVar, boolean z, int i) {
        afmrVar = (i & 1) != 0 ? afmr.b : afmrVar;
        boolean z2 = (i & 2) != 0 && afmrVar == afmr.a;
        alhrVar = (i & 4) != 0 ? null : alhrVar;
        boolean z3 = (i & 32) != 0;
        boolean z4 = (i & 256) == 0;
        afmrVar.getClass();
        this.a = afmrVar;
        this.b = z2;
        this.h = alhrVar;
        this.c = null;
        this.d = null;
        this.e = z3;
        this.f = null;
        this.i = null;
        this.g = z & z4;
    }
}
