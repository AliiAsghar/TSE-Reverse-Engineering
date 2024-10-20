package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import defpackage.abhi;
import defpackage.aidg;
import defpackage.ajog;
import defpackage.ajpe;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class RemoveUserFromGroupRequest implements Parcelable, ajpe {
    public static final Parcelable.Creator<RemoveUserFromGroupRequest> CREATOR = new ajog(19);

    public abstract PendingIntent a();

    public abstract com.google.android.rcs.client.messaging.data.Conversation b();

    public abstract RcsDestinationId c();

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
        abhi.o(parcel, 3, c(), i, false);
        d().ifPresent(new aidg(parcel, 19));
        abhi.g(parcel, e);
    }
}
