package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.abhi;
import defpackage.acbp;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LocationAvailabilityRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationAvailabilityRequest> CREATOR = new acbp(20);
    public final boolean a;
    public final ClientIdentity b;

    public LocationAvailabilityRequest(boolean z, ClientIdentity clientIdentity) {
        this.a = z;
        this.b = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationAvailabilityRequest)) {
            return false;
        }
        LocationAvailabilityRequest locationAvailabilityRequest = (LocationAvailabilityRequest) obj;
        if (this.a != locationAvailabilityRequest.a || !d.B(this.b, locationAvailabilityRequest.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationAvailabilityRequest[");
        if (this.a) {
            sb.append("bypass, ");
        }
        if (this.b != null) {
            sb.append("impersonation=");
            sb.append(this.b);
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, z);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.g(parcel, e);
    }
}
