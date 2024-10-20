package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.ajog;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class AddUserToGroupResponse implements Parcelable {
    public static final Parcelable.Creator<AddUserToGroupResponse> CREATOR = new ajog(2);

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
