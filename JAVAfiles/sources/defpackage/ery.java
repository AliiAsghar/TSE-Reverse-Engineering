package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ery {
    public static final Object a = new Object();
    private static final ere q;

    @Deprecated
    public Object c;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public era j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object b = a;
    public ere d = q;

    static {
        equ equVar = new equ();
        equVar.a = "androidx.media3.common.Timeline";
        equVar.b = Uri.EMPTY;
        q = equVar.a();
        eul.M(1);
        eul.M(2);
        eul.M(3);
        eul.M(4);
        eul.M(5);
        eul.M(6);
        eul.M(7);
        eul.M(8);
        eul.M(9);
        eul.M(10);
        eul.M(11);
        eul.M(12);
        eul.M(13);
    }

    public final long a() {
        return eul.z(this.l);
    }

    public final long b() {
        return eul.z(this.m);
    }

    public final boolean c() {
        if (this.j != null) {
            return true;
        }
        return false;
    }

    public final void d(Object obj, ere ereVar, boolean z, boolean z2, era eraVar, long j) {
        this.b = obj;
        if (ereVar == null) {
            ereVar = q;
        }
        this.d = ereVar;
        this.c = null;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = z;
        this.i = z2;
        this.j = eraVar;
        this.l = 0L;
        this.m = j;
        this.n = 0;
        this.o = 0;
        this.p = 0L;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            ery eryVar = (ery) obj;
            if (Objects.equals(this.b, eryVar.b) && Objects.equals(this.d, eryVar.d) && Objects.equals(null, null) && Objects.equals(this.j, eryVar.j) && this.e == eryVar.e && this.f == eryVar.f && this.g == eryVar.g && this.h == eryVar.h && this.i == eryVar.i && this.k == eryVar.k && this.l == eryVar.l && this.m == eryVar.m && this.n == eryVar.n && this.o == eryVar.o && this.p == eryVar.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.b.hashCode() + 217) * 31) + this.d.hashCode();
        era eraVar = this.j;
        if (eraVar == null) {
            hashCode = 0;
        } else {
            hashCode = eraVar.hashCode();
        }
        int i = ((hashCode2 * 961) + hashCode) * 31;
        long j = this.e;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        int i4 = (((((((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j4 = this.l;
        int i5 = (i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.m;
        int i6 = (((((i5 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j6 = this.p;
        return i6 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
