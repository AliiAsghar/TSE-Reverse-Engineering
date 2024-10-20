package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ajog;
import defpackage.ajpi;
import defpackage.ajpo;
import defpackage.ajro;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public abstract class MessageNotification implements Parcelable {
    public static final Parcelable.Creator<MessageNotification> CREATOR = new ajog(16);

    public abstract Conversation a();

    public abstract ajpo b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ajro.q(parcel, 1, a(), i);
        ajro.p(parcel, 2, b(), new ajpi(4), i);
        ajro.l(parcel);
    }
}
