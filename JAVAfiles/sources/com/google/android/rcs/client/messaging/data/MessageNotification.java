package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.aczf;
import defpackage.ajpx;
import defpackage.ajqp;
import defpackage.aoad;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class MessageNotification implements Parcelable {
    public static final Parcelable.Creator<MessageNotification> CREATOR = new ajqp(4);

    public static aoad e() {
        aoad aoadVar = new aoad((byte[]) null, (char[]) null);
        aoadVar.x(TraceId.b().l());
        return aoadVar;
    }

    public abstract Conversation a();

    public abstract Message b();

    public abstract TraceId c();

    public abstract Optional d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, a(), i, false);
        abhi.o(parcel, 2, b(), i, false);
        abhi.o(parcel, 3, c(), i, false);
        if (aczf.v()) {
            d().ifPresent(new ajpx(parcel, 7));
        }
        abhi.g(parcel, e);
    }
}
