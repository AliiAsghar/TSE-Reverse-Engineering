package defpackage;

import android.os.WorkSource;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdf {
    public boolean a;
    public boolean b;
    public WorkSource c;
    private int d;
    private long e;
    private long f;
    private final long g;
    private long h;
    private final int i;
    private final float j;
    private long k;
    private int l;
    private int m;
    private final ClientIdentity n;

    public acdf(int i, long j) {
        this.d = 102;
        this.f = -1L;
        this.g = 0L;
        this.h = Long.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.j = brg.a;
        this.a = true;
        this.k = -1L;
        this.l = 0;
        this.m = 0;
        this.b = false;
        this.c = null;
        this.n = null;
        d.t(j >= 0, "intervalMillis must be greater than or equal to 0");
        this.e = j;
        abgj.k(i);
        this.d = i;
    }

    public final LocationRequest a() {
        long j;
        int i = this.d;
        long j2 = this.e;
        long j3 = this.f;
        if (j3 == -1) {
            j3 = j2;
        } else if (i != 105) {
            j3 = Math.min(j3, j2);
        }
        long max = Math.max(this.g, this.e);
        long j4 = this.h;
        int i2 = this.i;
        float f = this.j;
        boolean z = this.a;
        long j5 = this.k;
        if (j5 == -1) {
            j = this.e;
        } else {
            j = j5;
        }
        return new LocationRequest(i, j2, j3, max, Long.MAX_VALUE, j4, i2, f, z, j, this.l, this.m, this.b, new WorkSource(this.c), this.n);
    }

    public final void b(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "durationMillis must be greater than 0");
        this.h = j;
    }

    public final void c(int i) {
        abgj.n(i);
        this.l = i;
    }

    public final void d(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        d.t(z, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
        this.k = j;
    }

    public final void e(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        d.t(z, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
        this.f = j;
    }

    public final void f(int i) {
        int i2;
        boolean z;
        if (i != 0 && i != 1) {
            i2 = 2;
            if (i == 2) {
                z = true;
                i = 2;
            } else {
                i2 = i;
                z = false;
            }
        } else {
            i2 = i;
            z = true;
        }
        abhg.c(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
        this.m = i2;
    }

    public acdf(LocationRequest locationRequest) {
        this(locationRequest.a, locationRequest.b);
        e(locationRequest.c);
        long j = locationRequest.d;
        d.t(j >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
        this.g = j;
        b(locationRequest.e);
        int i = locationRequest.f;
        d.t(i > 0, "maxUpdates must be greater than 0");
        this.i = i;
        float f = locationRequest.g;
        d.t(f >= brg.a, "minUpdateDistanceMeters must be greater than or equal to 0");
        this.j = f;
        this.a = locationRequest.h;
        d(locationRequest.i);
        c(locationRequest.j);
        f(locationRequest.k);
        this.b = locationRequest.l;
        this.c = locationRequest.m;
        ClientIdentity clientIdentity = locationRequest.n;
        d.s(clientIdentity == null || !clientIdentity.a());
        this.n = clientIdentity;
    }
}
