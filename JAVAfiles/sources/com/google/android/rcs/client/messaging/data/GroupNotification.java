package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.aczt;
import defpackage.ajpv;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class GroupNotification implements Parcelable {
    public static final Parcelable.Creator<GroupNotification> CREATOR = new ajpv(17);

    public abstract Conversation a();

    public abstract Optional b();

    public abstract Optional c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, a(), i, false);
        if (c().isPresent()) {
            abhi.o(parcel, 2, c().get(), i, false);
        }
        if (aczt.n() && b().isPresent()) {
            abhi.o(parcel, 3, b().get(), i, false);
        }
        abhi.g(parcel, e);
    }
}
