package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.abhi;
import defpackage.acdi;
import defpackage.d;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class DeviceOrientationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientationRequestInternal> CREATOR = new acdi(8);
    public static final DeviceOrientationRequest a;
    final DeviceOrientationRequest b;

    static {
        d.t(true, "Invalid interval: 20000 should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
        a = new DeviceOrientationRequest(20000L, false);
    }

    public DeviceOrientationRequestInternal(DeviceOrientationRequest deviceOrientationRequest) {
        this.b = deviceOrientationRequest;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DeviceOrientationRequestInternal)) {
            return false;
        }
        return d.B(this.b, ((DeviceOrientationRequestInternal) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.b, i, false);
        abhi.g(parcel, e);
    }
}
