package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abuz;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LookupSingleRemoteReachabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LookupSingleRemoteReachabilityResponse> CREATOR = new abuz(19);
    public RemoteUserReachability a;

    public LookupSingleRemoteReachabilityResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LookupSingleRemoteReachabilityResponse) {
            return d.B(this.a, ((LookupSingleRemoteReachabilityResponse) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.g(parcel, e);
    }

    public LookupSingleRemoteReachabilityResponse(RemoteUserReachability remoteUserReachability) {
        this.a = remoteUserReachability;
    }
}
