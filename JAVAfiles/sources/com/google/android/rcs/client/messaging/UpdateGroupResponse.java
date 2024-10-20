package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.ajpv;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class UpdateGroupResponse implements Parcelable {
    public static final Parcelable.Creator<UpdateGroupResponse> CREATOR = new ajpv(7);

    public abstract MessagingResult a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, a(), i, false);
        abhi.g(parcel, e);
    }
}
