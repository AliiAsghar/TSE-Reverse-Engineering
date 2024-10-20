package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aclk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetCloudSyncSettingResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCloudSyncSettingResponse> CREATOR = new aclk(3);
    public final int a;
    public final boolean b;

    public GetCloudSyncSettingResponse(int i, boolean z) {
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
