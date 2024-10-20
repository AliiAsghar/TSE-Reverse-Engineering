package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.ajgk;
import defpackage.ajqp;
import defpackage.ajqu;
import defpackage.ajqv;
import defpackage.ajqz;
import defpackage.aozb;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class MessageReceipt implements Parcelable, ajqz {
    public static final Parcelable.Creator<MessageReceipt> CREATOR = new ajqp(5);

    public abstract ajqu a();

    public abstract Instant b();

    public abstract Optional c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    @Override // defpackage.ajqz
    public final void gU(ajqv ajqvVar) {
        ajqvVar.g(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, a().ordinal());
        abhi.q(parcel, 2, d(), false);
        ajgk.D(parcel, 3, b());
        abhi.q(parcel, 4, e(), false);
        if (c().isPresent()) {
            abhi.j(parcel, 5, ((aozb) c().get()).H(), false);
        }
        abhi.g(parcel, e);
    }
}
