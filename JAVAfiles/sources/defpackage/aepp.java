package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aepp {
    public final aekm a;
    public final boolean b;
    public final aeph c;
    public final arqr d;
    public final arqg e;
    public final arqr f;
    public final arqr g;
    public final aepo h;

    public aepp(aekm aekmVar, boolean z, aeph aephVar, arqr arqrVar, arqg arqgVar, arqr arqrVar2, arqr arqrVar3, aepo aepoVar) {
        aekmVar.getClass();
        this.a = aekmVar;
        this.b = z;
        this.c = aephVar;
        this.d = arqrVar;
        this.e = arqgVar;
        this.f = arqrVar2;
        this.g = arqrVar3;
        this.h = aepoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aepp)) {
            return false;
        }
        aepp aeppVar = (aepp) obj;
        if (d.F(this.a, aeppVar.a) && this.b == aeppVar.b && d.F(this.c, aeppVar.c) && d.F(this.d, aeppVar.d) && d.F(this.e, aeppVar.e) && d.F(this.f, aeppVar.f) && d.F(this.g, aeppVar.g) && d.F(this.h, aeppVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        aeph aephVar = this.c;
        int i = 0;
        if (aephVar == null) {
            hashCode = 0;
        } else {
            hashCode = aephVar.hashCode();
        }
        int v = (((((((((hashCode3 + a.v(this.b)) * 31) + hashCode) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        arqr arqrVar = this.g;
        if (arqrVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = arqrVar.hashCode();
        }
        int i2 = (v + hashCode2) * 31;
        aepo aepoVar = this.h;
        if (aepoVar != null) {
            i = aepoVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "VoiceInputUiData(timerUiData=" + this.a + ", isEnabled=" + this.b + ", swipeUpToLockUiData=" + this.c + ", onLongPress=" + this.d + ", onPressReleased=" + this.e + ", onSwipeToCancelRecording=" + this.f + ", onSwipeUp=" + this.g + ", errorUiData=" + this.h + ")";
    }
}
