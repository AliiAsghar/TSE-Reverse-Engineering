package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acll;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StorageInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StorageInfoResponse> CREATOR = new acll(19);
    public final int a;
    public final long b;
    public final List c;

    public StorageInfoResponse(int i, long j, List list) {
        this.a = i;
        this.b = j;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.n(parcel, 3, this.b);
        abhi.r(parcel, 4, this.c, false);
        abhi.g(parcel, e);
    }
}
