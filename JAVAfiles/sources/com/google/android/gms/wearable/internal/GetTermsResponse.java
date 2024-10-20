package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aclk;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetTermsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetTermsResponse> CREATOR = new aclk(18);
    public final int a;
    public final List b;

    public GetTermsResponse(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.r(parcel, 2, this.b, false);
        abhi.g(parcel, e);
    }
}
