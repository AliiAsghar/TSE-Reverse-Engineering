package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import defpackage.abhi;
import defpackage.aclk;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class GetConfigResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetConfigResponse> CREATOR = new aclk(5);
    public final int a;
    public final ConnectionConfiguration b;

    public GetConfigResponse(int i, ConnectionConfiguration connectionConfiguration) {
        this.a = i;
        this.b = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.g(parcel, e);
    }
}
