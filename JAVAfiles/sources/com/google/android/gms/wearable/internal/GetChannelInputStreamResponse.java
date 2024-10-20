package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ackp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetChannelInputStreamResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetChannelInputStreamResponse> CREATOR = new ackp(20);
    public final int a;
    public final ParcelFileDescriptor b;

    public GetChannelInputStreamResponse(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.g(parcel, e);
    }
}
