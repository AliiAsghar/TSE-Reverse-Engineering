package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acbp;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DeviceOrientationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientationRequest> CREATOR = new acbp(16);
    public final long a;
    public final boolean b;

    public DeviceOrientationRequest(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientationRequest)) {
            return false;
        }
        DeviceOrientationRequest deviceOrientationRequest = (DeviceOrientationRequest) obj;
        if (this.a == deviceOrientationRequest.a && this.b == deviceOrientationRequest.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DeviceOrientationRequest[samplingPeriodMicros=");
        sb.append(this.a);
        if (true != this.b) {
            str = "";
        } else {
            str = ", withVelocity";
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int e = abhi.e(parcel);
        abhi.n(parcel, 2, j);
        abhi.h(parcel, 6, this.b);
        abhi.g(parcel, e);
    }
}
