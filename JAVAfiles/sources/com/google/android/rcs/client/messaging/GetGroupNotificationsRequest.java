package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.ajog;
import defpackage.ajph;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class GetGroupNotificationsRequest implements Parcelable {
    public static final GetGroupNotificationsRequest a = b().a();
    public static final Parcelable.Creator<GetGroupNotificationsRequest> CREATOR = new ajog(6);

    public static ajph b() {
        ajph ajphVar = new ajph();
        ajphVar.b(-1);
        return ajphVar;
    }

    public abstract int a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, a());
        abhi.g(parcel, e);
    }
}
