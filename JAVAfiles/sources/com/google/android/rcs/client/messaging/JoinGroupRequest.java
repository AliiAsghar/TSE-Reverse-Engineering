package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.ajog;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class JoinGroupRequest implements Parcelable {
    public static final Parcelable.Creator<JoinGroupRequest> CREATOR = new ajog(14);

    public abstract PendingIntent a();

    public abstract com.google.android.rcs.client.messaging.data.Conversation b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.E(parcel, a());
        abhi.o(parcel, 2, b(), i, false);
        abhi.g(parcel, e);
    }
}
