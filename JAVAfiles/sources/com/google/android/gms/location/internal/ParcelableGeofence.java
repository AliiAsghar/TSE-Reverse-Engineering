package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.abhi;
import defpackage.acdi;
import defpackage.brg;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ParcelableGeofence extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableGeofence> CREATOR = new acdi(14);
    public final String a;
    public final long b;
    public final short c;
    public final double d;
    public final double e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;

    public ParcelableGeofence(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str != null) {
            if (f > brg.a) {
                if (d <= 90.0d && d >= -90.0d) {
                    if (d2 <= 180.0d && d2 >= -180.0d) {
                        int i4 = i & 15;
                        if (i4 != 0) {
                            this.c = s;
                            this.a = str;
                            this.d = d;
                            this.e = d2;
                            this.f = f;
                            this.b = j;
                            this.g = i4;
                            this.h = i2;
                            this.i = i3;
                            return;
                        }
                        throw new IllegalArgumentException(a.bV(i, "No supported transition specified: "));
                    }
                    throw new IllegalArgumentException("invalid longitude: " + d2);
                }
                throw new IllegalArgumentException("invalid latitude: " + d);
            }
            throw new IllegalArgumentException("invalid radius: " + f);
        }
        throw new IllegalArgumentException("requestId is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParcelableGeofence) {
            ParcelableGeofence parcelableGeofence = (ParcelableGeofence) obj;
            if (this.f == parcelableGeofence.f && this.d == parcelableGeofence.d && this.e == parcelableGeofence.e && this.c == parcelableGeofence.c && this.g == parcelableGeofence.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.d);
        long j = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.e);
        return ((((((((((int) j) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f)) * 31) + this.c) * 31) + this.g;
    }

    public final String toString() {
        String str;
        short s = this.c;
        Locale locale = Locale.US;
        if (s != -1) {
            if (s != 1) {
                str = "UNKNOWN";
            } else {
                str = "CIRCLE";
            }
        } else {
            str = "INVALID";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.a.replaceAll("\\p{C}", "?"), Integer.valueOf(this.g), Double.valueOf(this.d), Double.valueOf(this.e), Float.valueOf(this.f), Integer.valueOf(this.h / 1000), Integer.valueOf(this.i), Long.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.n(parcel, 2, this.b);
        abhi.p(parcel, 3, this.c);
        abhi.k(parcel, 4, this.d);
        abhi.k(parcel, 5, this.e);
        abhi.l(parcel, 6, this.f);
        abhi.m(parcel, 7, this.g);
        abhi.m(parcel, 8, this.h);
        abhi.m(parcel, 9, this.i);
        abhi.g(parcel, e);
    }
}
