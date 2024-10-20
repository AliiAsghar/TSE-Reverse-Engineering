package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.ajpv;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class GroupRemoteCapabilities implements Parcelable {
    public static final Parcelable.Creator<GroupRemoteCapabilities> CREATOR = new ajpv(18);

    public abstract Optional a();

    public abstract Optional b();

    public abstract boolean c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, c());
        if (b().isPresent()) {
            abhi.h(parcel, 2, ((Boolean) b().get()).booleanValue());
        }
        if (a().isPresent()) {
            abhi.h(parcel, 3, ((Boolean) a().get()).booleanValue());
        }
        abhi.g(parcel, e);
    }
}
