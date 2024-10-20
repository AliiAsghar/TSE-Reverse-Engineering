package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.TraceId;
import defpackage.abhi;
import defpackage.ajog;
import defpackage.akia;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class GetMessagesRequest implements Parcelable {
    public static final GetMessagesRequest a = c().b();
    public static final Parcelable.Creator<GetMessagesRequest> CREATOR = new ajog(8);

    public static akia c() {
        akia akiaVar = new akia();
        akiaVar.c(-1);
        akiaVar.d(TraceId.b().l());
        return akiaVar;
    }

    public abstract int a();

    public abstract TraceId b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, a());
        abhi.o(parcel, 2, b(), i, false);
        abhi.g(parcel, e);
    }
}
