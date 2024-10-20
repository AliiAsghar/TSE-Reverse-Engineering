package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ajog;
import defpackage.ajro;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public abstract class GroupNotification implements Parcelable {
    public static final Parcelable.Creator<GroupNotification> CREATOR = new ajog(12);

    public abstract Conversation a();

    public abstract GroupInformation b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ajro.q(parcel, 1, a(), i);
        ajro.q(parcel, 2, b(), i);
        ajro.l(parcel);
    }
}
