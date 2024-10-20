package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.abgj;
import defpackage.abhi;
import defpackage.abvm;
import defpackage.acdg;
import defpackage.acee;
import defpackage.brg;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new acdg();
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public float g;
    public boolean h;
    public long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final WorkSource m;
    public final ClientIdentity n;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, brg.a, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String c(long j) {
        String sb;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        synchronized (acee.b) {
            acee.b.setLength(0);
            StringBuilder sb2 = acee.b;
            acee.a(j, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    public final boolean a() {
        long j = this.d;
        if (j > 0 && (j >> 1) >= this.b) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.a == 105) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            boolean a = a();
            if (this.a == locationRequest.a && ((b() || this.b == locationRequest.b) && this.c == locationRequest.c && a == locationRequest.a() && ((!a || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && this.h == locationRequest.h && this.j == locationRequest.j && this.k == locationRequest.k && this.l == locationRequest.l && this.m.equals(locationRequest.m) && d.B(this.n, locationRequest.n)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.m});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (b()) {
            sb.append(abgj.j(this.a));
            if (this.d > 0) {
                sb.append("/");
                acee.a(this.d, sb);
            }
        } else {
            sb.append("@");
            if (a()) {
                acee.a(this.b, sb);
                sb.append("/");
                acee.a(this.d, sb);
            } else {
                acee.a(this.b, sb);
            }
            sb.append(" ");
            sb.append(abgj.j(this.a));
        }
        if (b() || this.c != this.b) {
            sb.append(", minUpdateInterval=");
            sb.append(c(this.c));
        }
        if (this.g > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.g);
        }
        if (!b() ? this.i != this.b : this.i != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(c(this.i));
        }
        if (this.e != Long.MAX_VALUE) {
            sb.append(", duration=");
            acee.a(this.e, sb);
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f);
        }
        if (this.k != 0) {
            sb.append(", ");
            sb.append(abgj.i(this.k));
        }
        if (this.j != 0) {
            sb.append(", ");
            sb.append(abgj.m(this.j));
        }
        if (this.h) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.l) {
            sb.append(", bypass");
        }
        if (!abvm.c(this.m)) {
            sb.append(", ");
            sb.append(this.m);
        }
        if (this.n != null) {
            sb.append(", impersonation=");
            sb.append(this.n);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.n(parcel, 2, this.b);
        abhi.n(parcel, 3, this.c);
        abhi.m(parcel, 6, this.f);
        abhi.l(parcel, 7, this.g);
        abhi.n(parcel, 8, this.d);
        abhi.h(parcel, 9, this.h);
        abhi.n(parcel, 10, this.e);
        abhi.n(parcel, 11, this.i);
        abhi.m(parcel, 12, this.j);
        abhi.m(parcel, 13, this.k);
        abhi.h(parcel, 15, this.l);
        abhi.o(parcel, 16, this.m, i, false);
        abhi.o(parcel, 17, this.n, i, false);
        abhi.g(parcel, e);
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, ClientIdentity clientIdentity) {
        long j7;
        this.a = i;
        if (i == 105) {
            this.b = Long.MAX_VALUE;
            j7 = j;
        } else {
            j7 = j;
            this.b = j7;
        }
        this.c = j2;
        this.d = j3;
        this.e = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.f = i2;
        this.g = f;
        this.h = z;
        this.i = j6 != -1 ? j6 : j7;
        this.j = i3;
        this.k = i4;
        this.l = z2;
        this.m = workSource;
        this.n = clientIdentity;
    }
}
