package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ackp;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetAllCapabilitiesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAllCapabilitiesResponse> CREATOR = new ackp(16);
    public final int a;
    public final List b;

    public GetAllCapabilitiesResponse(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.r(parcel, 3, this.b, false);
        abhi.g(parcel, e);
    }
}
