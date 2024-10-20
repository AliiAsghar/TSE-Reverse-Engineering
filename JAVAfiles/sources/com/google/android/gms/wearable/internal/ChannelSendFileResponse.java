package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ackp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ChannelSendFileResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelSendFileResponse> CREATOR = new ackp(7);
    public final int a;

    public ChannelSendFileResponse(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.g(parcel, e);
    }
}
