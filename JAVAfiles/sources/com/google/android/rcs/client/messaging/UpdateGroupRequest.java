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
public abstract class UpdateGroupRequest implements Parcelable, ajpe {
    public static final Parcelable.Creator<UpdateGroupRequest> CREATOR = new ajpv(6);

    public abstract PendingIntent a();

    public abstract com.google.android.rcs.client.messaging.data.Conversation b();

    public abstract Optional c();

    public abstract Optional d();

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
        int i2 = 3;
        if (d().isPresent()) {
            abhi.q(parcel, 3, (String) d().get(), false);
        }
        c().ifPresent(new ajpx(parcel, i2));
        abhi.g(parcel, e);
    }
}
