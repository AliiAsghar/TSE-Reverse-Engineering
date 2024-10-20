package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.ajpe;
import defpackage.ajpv;
import defpackage.ajpx;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class TriggerGroupNotificationRequest implements Parcelable, ajpe {
    public static final Parcelable.Creator<TriggerGroupNotificationRequest> CREATOR = new ajpv(4);

    public abstract PendingIntent a();

    public abstract com.google.android.rcs.client.messaging.data.Conversation b();

    public abstract Optional c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ajpe
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.ajpe
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.E(parcel, a());
        abhi.o(parcel, 2, b(), i, false);
        c().ifPresent(new ajpx(parcel, 2));
        abhi.g(parcel, e);
    }
}
