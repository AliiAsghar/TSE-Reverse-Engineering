package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.abhi;
import defpackage.advq;
import defpackage.ajgk;
import defpackage.ajpv;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class Conversation implements Parcelable {
    public static final Parcelable.Creator<Conversation> CREATOR = new ajpv(11);

    public abstract RcsDestinationId a();

    public abstract String b();

    public abstract int c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("Conversation {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", b()), String.format("destination=%s", advq.PHONE_NUMBER.c(a())), String.format("type=%s", ajgk.E(c())))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, c() - 1);
        abhi.q(parcel, 2, b(), false);
        abhi.o(parcel, 3, a(), i, false);
        abhi.g(parcel, e);
    }
}
