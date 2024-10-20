package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acbp;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new acbp(19);
    public final int a;
    public final int b;
    public final long c;
    final int d;
    public final NetworkLocationStatus[] e;

    public LocationAvailability(int i, int i2, int i3, long j, NetworkLocationStatus[] networkLocationStatusArr) {
        this.d = i < 1000 ? 0 : 1000;
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.e = networkLocationStatusArr;
    }

    public final boolean a() {
        if (this.d < 1000) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && Arrays.equals(this.e, locationAvailability.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d)});
    }

    public final String toString() {
        return "LocationAvailability[" + a() + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.m(parcel, 2, this.b);
        abhi.n(parcel, 3, this.c);
        abhi.m(parcel, 4, this.d);
        abhi.H(parcel, 5, this.e, i);
        abhi.h(parcel, 6, a());
        abhi.g(parcel, e);
    }
}
