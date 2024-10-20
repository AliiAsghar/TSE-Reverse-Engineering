package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aclk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetFastpairAccountKeyByAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetFastpairAccountKeyByAccountResponse> CREATOR = new aclk(10);
    public final int a;
    public final FastPairAccountKeyParcelable b;

    public GetFastpairAccountKeyByAccountResponse(int i, FastPairAccountKeyParcelable fastPairAccountKeyParcelable) {
        this.a = i;
        this.b = fastPairAccountKeyParcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.g(parcel, e);
    }
}
