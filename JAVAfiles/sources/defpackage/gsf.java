package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsf {
    public static final gsf a = new gsf(false, 15);
    public final gzu b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;
    public final int j;

    public gsf(gsf gsfVar) {
        gsfVar.getClass();
        this.c = gsfVar.c;
        this.d = gsfVar.d;
        this.b = gsfVar.b;
        this.j = gsfVar.j;
        this.e = gsfVar.e;
        this.f = gsfVar.f;
        this.i = gsfVar.i;
        this.g = gsfVar.g;
        this.h = gsfVar.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.b;
    }

    public final boolean b() {
        if (!this.i.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d.F(getClass(), obj.getClass())) {
            return false;
        }
        gsf gsfVar = (gsf) obj;
        if (this.c != gsfVar.c || this.d != gsfVar.d || this.e != gsfVar.e || this.f != gsfVar.f || this.g != gsfVar.g || this.h != gsfVar.h || !d.F(a(), gsfVar.a()) || this.j != gsfVar.j) {
            return false;
        }
        return d.F(this.i, gsfVar.i);
    }

    public final int hashCode() {
        int i;
        int i2 = this.j;
        a.aS(i2);
        long j = this.h;
        Set set = this.i;
        long j2 = this.g;
        int hashCode = (((((((((((((i2 * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + set.hashCode();
        NetworkRequest a2 = a();
        if (a2 != null) {
            i = a2.hashCode();
        } else {
            i = 0;
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + ((Object) gvf.as(this.j)) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public /* synthetic */ gsf(boolean z, int i) {
        byte[] bArr = null;
        if ((i & 1) != 0) {
            boolean z2 = z & ((i & 2) == 0);
            arnx arnxVar = arnx.a;
            this.b = new gzu(bArr);
            this.j = 1;
            this.c = z2;
            this.d = false;
            this.e = false;
            this.f = false;
            this.g = -1L;
            this.h = -1L;
            this.i = arnxVar;
            return;
        }
        throw null;
    }

    public gsf(gzu gzuVar, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        gzuVar.getClass();
        if (i == 0) {
            throw null;
        }
        set.getClass();
        this.b = gzuVar;
        this.j = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j;
        this.h = j2;
        this.i = set;
    }
}
