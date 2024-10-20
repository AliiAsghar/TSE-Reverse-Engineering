package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ackp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetCapabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCapabilityResponse> CREATOR = new ackp(19);
    public final int a;
    public final CapabilityInfoParcelable b;

    public GetCapabilityResponse(int i, CapabilityInfoParcelable capabilityInfoParcelable) {
        this.a = i;
        this.b = capabilityInfoParcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.g(parcel, e);
    }
}
