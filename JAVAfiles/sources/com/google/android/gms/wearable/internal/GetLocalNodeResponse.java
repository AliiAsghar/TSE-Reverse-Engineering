package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aclk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetLocalNodeResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetLocalNodeResponse> CREATOR = new aclk(13);
    public final int a;
    public final NodeParcelable b;

    public GetLocalNodeResponse(int i, NodeParcelable nodeParcelable) {
        this.a = i;
        this.b = nodeParcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.g(parcel, e);
    }
}
