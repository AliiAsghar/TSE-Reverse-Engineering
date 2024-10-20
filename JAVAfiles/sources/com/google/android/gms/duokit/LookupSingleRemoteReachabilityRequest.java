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
public final class LookupSingleRemoteReachabilityRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LookupSingleRemoteReachabilityRequest> CREATOR = new abuz(18);
    public DuoId a;
    public String b;

    public LookupSingleRemoteReachabilityRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LookupSingleRemoteReachabilityRequest) {
            LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest = (LookupSingleRemoteReachabilityRequest) obj;
            if (d.B(this.a, lookupSingleRemoteReachabilityRequest.a) && d.B(this.b, lookupSingleRemoteReachabilityRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.g(parcel, e);
    }

    public LookupSingleRemoteReachabilityRequest(DuoId duoId, String str) {
        this.a = duoId;
        this.b = str;
    }
}
