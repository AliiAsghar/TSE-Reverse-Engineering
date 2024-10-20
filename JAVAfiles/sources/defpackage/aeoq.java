package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeoq {
    public final aenr a;
    public final aeom b;
    public final aeoa c;
    public final aeoo d;
    public final float e;
    public final boolean f;
    public final aeop g;

    public /* synthetic */ aeoq(aenr aenrVar, aeom aeomVar, aeoa aeoaVar, aeoo aeooVar, float f, boolean z, aeop aeopVar, int i) {
        boolean z2;
        aeooVar = (i & 8) != 0 ? aeoo.a : aeooVar;
        f = (i & 16) != 0 ? 1.0f : f;
        if ((i & 32) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        aeooVar.getClass();
        this.a = aenrVar;
        this.b = aeomVar;
        this.c = aeoaVar;
        this.d = aeooVar;
        this.e = f;
        this.f = z & z2;
        this.g = aeopVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeoq)) {
            return false;
        }
        aeoq aeoqVar = (aeoq) obj;
        if (d.F(this.a, aeoqVar.a) && d.F(this.b, aeoqVar.b) && d.F(this.c, aeoqVar.c) && this.d == aeoqVar.d && Float.compare(this.e, aeoqVar.e) == 0 && this.f == aeoqVar.f && d.F(this.g, aeoqVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        aeoa aeoaVar = this.c;
        if (aeoaVar == null) {
            hashCode = 0;
        } else {
            hashCode = aeoaVar.hashCode();
        }
        return (((((((((hashCode2 * 31) + hashCode) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.e)) * 31) + a.v(this.f)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "ComposeRowUiData(draft=" + this.a + ", simSelector=" + this.b + ", inputs=" + this.c + ", backgroundStyle=" + this.d + ", backgroundAlpha=" + this.e + ", showEmotiveNotificationDot=" + this.f + ", flags=" + this.g + ")";
    }
}
