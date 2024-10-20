package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.ajqp;
import defpackage.aodz;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class TraceId implements Parcelable {
    public static final Parcelable.Creator<TraceId> CREATOR = new ajqp(8);

    public static aodz b() {
        aodz aodzVar = new aodz((char[]) null);
        aodzVar.m("");
        return aodzVar;
    }

    public abstract String a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, a(), false);
        abhi.g(parcel, e);
    }
}
