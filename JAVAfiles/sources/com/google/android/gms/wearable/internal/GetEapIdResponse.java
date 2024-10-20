package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aclk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetEapIdResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetEapIdResponse> CREATOR = new aclk(9);
    public final int a;
    public final String b;

    public GetEapIdResponse(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.q(parcel, 3, this.b, false);
        abhi.g(parcel, e);
    }
}
