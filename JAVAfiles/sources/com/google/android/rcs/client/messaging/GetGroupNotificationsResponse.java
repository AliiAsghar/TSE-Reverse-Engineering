package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.ajog;
import defpackage.alog;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class GetGroupNotificationsResponse implements Parcelable {
    public static final Parcelable.Creator<GetGroupNotificationsResponse> CREATOR = new ajog(7);

    public abstract MessagingResult a();

    public abstract alog b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, a(), i, false);
        abhi.r(parcel, 2, b(), false);
        abhi.g(parcel, e);
    }
}
