package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import defpackage.abhi;
import defpackage.aclk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetConfigsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetConfigsResponse> CREATOR = new aclk(6);
    public final int a;
    public final ConnectionConfiguration[] b;

    public GetConfigsResponse(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i;
        this.b = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.H(parcel, 3, this.b, i);
        abhi.g(parcel, e);
    }
}
