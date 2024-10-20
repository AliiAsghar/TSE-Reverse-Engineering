package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crf {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final List i;
    public final long j;
    public final long k;

    public crf(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = list;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crf)) {
            return false;
        }
        crf crfVar = (crf) obj;
        if (a.bB(this.a, crfVar.a) && this.b == crfVar.b && a.bB(this.c, crfVar.c) && a.bB(this.d, crfVar.d) && this.e == crfVar.e && Float.compare(this.f, crfVar.f) == 0 && a.bA(this.g, crfVar.g) && this.h == crfVar.h && d.F(this.i, crfVar.i) && a.bB(this.j, crfVar.j) && a.bB(this.k, crfVar.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A = a.A(this.a) * 31;
        float f = this.f;
        boolean z = this.e;
        long j = this.d;
        int A2 = ((((((((A + a.A(this.b)) * 31) + a.A(this.c)) * 31) + a.A(j)) * 31) + a.v(z)) * 31) + Float.floatToIntBits(f);
        List list = this.i;
        return (((((((((A2 * 31) + this.g) * 31) + a.v(this.h)) * 31) + list.hashCode()) * 31) + a.A(this.j)) * 31) + a.A(this.k);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) crb.a(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) cjn.f(this.c)) + ", position=" + ((Object) cjn.f(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) crr.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) cjn.f(this.j)) + ", originalEventPosition=" + ((Object) cjn.f(this.k)) + ')';
    }
}
