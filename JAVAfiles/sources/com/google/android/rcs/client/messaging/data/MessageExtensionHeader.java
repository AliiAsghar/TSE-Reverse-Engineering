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
public abstract class MessageExtensionHeader implements Parcelable {
    public static final Parcelable.Creator<MessageExtensionHeader> CREATOR = new ajqp(3);

    public abstract String a();

    public abstract String b();

    public abstract String c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("MessageExtensionHeader {%s}", TextUtils.join(",", Arrays.asList(String.format("namespace=%s", b()), String.format("name=%s", advq.GENERIC.c(a())), String.format("value=%s", advq.GENERIC.c(c())))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, b(), false);
        abhi.q(parcel, 2, a(), false);
        abhi.q(parcel, 3, c(), false);
        abhi.g(parcel, e);
    }
}
