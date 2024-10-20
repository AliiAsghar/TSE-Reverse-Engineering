package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.aidg;
import defpackage.ajpv;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class RevokeMessageRequest implements Parcelable {
    public static final Parcelable.Creator<RevokeMessageRequest> CREATOR = new ajpv(1);

    public abstract PendingIntent a();

    public abstract com.google.android.rcs.client.messaging.data.Conversation b();

    public abstract Optional c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.E(parcel, a());
        abhi.o(parcel, 2, b(), i, false);
        abhi.q(parcel, 3, d(), false);
        c().ifPresent(new aidg(parcel, 20));
        abhi.g(parcel, e);
    }
}
