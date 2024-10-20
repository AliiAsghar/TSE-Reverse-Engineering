package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.abhi;
import defpackage.advq;
import defpackage.ajqp;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class RcsDestinationId implements Parcelable {
    public static final Parcelable.Creator<RcsDestinationId> CREATOR = new ajqp(6);

    public abstract String a();

    public abstract int b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        String format = String.format("id=%s", advq.PHONE_NUMBER.c(a()));
        if (b() != 1) {
            str = "SIP_URI";
        } else {
            str = "PHONE";
        }
        return String.format("RcsDestinationId {%s}", TextUtils.join(",", Arrays.asList(format, String.format("type=%s", str))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, b() - 1);
        abhi.q(parcel, 2, a(), false);
        abhi.g(parcel, e);
    }
}
