package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acll;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OpenChannelResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OpenChannelResponse> CREATOR = new acll(5);
    public final int a;
    public final ChannelImpl b;

    public OpenChannelResponse(int i, ChannelImpl channelImpl) {
        this.a = i;
        this.b = channelImpl;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.g(parcel, e);
    }
}
