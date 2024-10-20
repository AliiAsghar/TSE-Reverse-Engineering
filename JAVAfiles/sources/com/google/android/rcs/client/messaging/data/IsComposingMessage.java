package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.ajpv;
import defpackage.ajqk;
import defpackage.ajqv;
import defpackage.ajqz;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class IsComposingMessage implements Parcelable, ajqz {
    public static final Parcelable.Creator<IsComposingMessage> CREATOR = new ajpv(19);

    public abstract ajqk a();

    public abstract Optional b();

    public abstract Optional c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ajqz
    public final void gU(ajqv ajqvVar) {
        ajqvVar.e(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, a().ordinal());
        abhi.n(parcel, 2, ((Duration) b().get()).getSeconds());
        if (c().isPresent()) {
            abhi.n(parcel, 3, ((Instant) c().get()).toEpochMilli());
        }
        abhi.g(parcel, e);
    }
}
