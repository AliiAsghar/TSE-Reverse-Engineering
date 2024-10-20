package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aclk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetCloudSyncOptInOutDoneResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCloudSyncOptInOutDoneResponse> CREATOR = new aclk(0);
    public final int a;
    public final boolean b;

    public GetCloudSyncOptInOutDoneResponse(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.h(parcel, 3, this.b);
        abhi.g(parcel, e);
    }
}
