package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crc {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final long k;
    public crc l;
    private List m;
    private boolean n;
    private boolean o;

    public crc(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = 0L;
        this.n = z3;
        this.o = z3;
    }

    public final List a() {
        List list = this.m;
        if (list == null) {
            return arnv.a;
        }
        return list;
    }

    public final void b() {
        crc crcVar = this.l;
        if (crcVar == null) {
            this.n = true;
            this.o = true;
        } else {
            crcVar.b();
        }
    }

    public final boolean c() {
        crc crcVar = this.l;
        if (crcVar != null) {
            return crcVar.c();
        }
        if (this.n || this.o) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "PointerInputChange(id=" + ((Object) crb.a(this.a)) + ", uptimeMillis=" + this.b + ", position=" + ((Object) cjn.f(this.c)) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + ((Object) cjn.f(this.g)) + ", previousPressed=" + this.h + ", isConsumed=" + c() + ", type=" + ((Object) crr.a(this.i)) + ", historical=" + a() + ",scrollDelta=" + ((Object) cjn.f(this.j)) + ')';
    }

    public /* synthetic */ crc(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6);
        this.m = list;
        this.k = j7;
    }
}
