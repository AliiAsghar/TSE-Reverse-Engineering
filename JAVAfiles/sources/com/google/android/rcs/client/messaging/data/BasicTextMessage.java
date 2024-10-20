package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.advq;
import defpackage.ajpv;
import defpackage.ajqv;
import defpackage.ajqz;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class BasicTextMessage implements Parcelable, ajqz {
    public static final Parcelable.Creator<BasicTextMessage> CREATOR = new ajpv(8);

    public abstract String a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ajqz
    public final void gU(ajqv ajqvVar) {
        ajqvVar.b(this);
    }

    public final String toString() {
        return String.format("BasicTextMessage {%s}", String.format("content=%s", advq.MESSAGE_CONTENT.c(a())));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, a(), false);
        abhi.g(parcel, e);
    }
}
