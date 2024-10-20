package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeoa {
    public final aeny a;
    public final aepp b;
    public final aemn c;
    public final aemm d;
    public final aepd e;
    public final aeos f;
    public final boolean g;
    public final aenz h;
    public final arqr i;

    public /* synthetic */ aeoa(aeny aenyVar, aepp aeppVar, aemn aemnVar, aemm aemmVar, aepd aepdVar, boolean z, aenz aenzVar, arqr arqrVar, int i) {
        aeos aeosVar;
        boolean z2;
        aemmVar = (i & 8) != 0 ? new aemm(null) : aemmVar;
        aepdVar = (i & 16) != 0 ? null : aepdVar;
        if ((i & 32) != 0) {
            aeosVar = new aeos(null);
        } else {
            aeosVar = null;
        }
        if ((i & 64) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = z & z2;
        aenzVar = (i & 128) != 0 ? new aenz(null) : aenzVar;
        int i2 = i & 4;
        int i3 = i & 2;
        int i4 = i & 1;
        aemnVar = i2 != 0 ? null : aemnVar;
        aeppVar = i3 != 0 ? null : aeppVar;
        aenyVar = 1 == i4 ? null : aenyVar;
        aemmVar.getClass();
        aenzVar.getClass();
        this.a = aenyVar;
        this.b = aeppVar;
        this.c = aemnVar;
        this.d = aemmVar;
        this.e = aepdVar;
        this.f = aeosVar;
        this.g = z3;
        this.h = aenzVar;
        this.i = arqrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeoa)) {
            return false;
        }
        aeoa aeoaVar = (aeoa) obj;
        if (d.F(this.a, aeoaVar.a) && d.F(this.b, aeoaVar.b) && d.F(this.c, aeoaVar.c) && d.F(this.d, aeoaVar.d) && d.F(this.e, aeoaVar.e) && d.F(this.f, aeoaVar.f) && this.g == aeoaVar.g && d.F(this.h, aeoaVar.h) && d.F(this.i, aeoaVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i;
        aeny aenyVar = this.a;
        int i2 = 0;
        if (aenyVar == null) {
            hashCode = 0;
        } else {
            hashCode = aenyVar.hashCode();
        }
        aepp aeppVar = this.b;
        if (aeppVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aeppVar.hashCode();
        }
        int i3 = hashCode * 31;
        aemn aemnVar = this.c;
        if (aemnVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = aemnVar.hashCode();
        }
        int hashCode4 = (((((i3 + hashCode2) * 31) + hashCode3) * 31) + this.d.hashCode()) * 31;
        if (this.e == null) {
            i = 0;
        } else {
            i = 1231;
        }
        int i4 = (hashCode4 + i) * 31;
        if (this.f != null) {
            i2 = 1231;
        }
        return ((((((i4 + i2) * 31) + a.v(this.g)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "ComposeRowInputsUiData(currentInput=" + this.a + ", voiceInputUiData=" + this.b + ", cameraGalleryInputUiData=" + this.c + ", aiInputUiData=" + this.d + ", shortcutsInputUiData=" + this.e + ", emotiveInputUiData=" + this.f + ", isAiConversation=" + this.g + ", flags=" + this.h + ", onClick=" + this.i + ")";
    }
}
