package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.abhi;
import defpackage.advq;
import defpackage.ajpv;
import defpackage.ajqv;
import defpackage.ajqz;
import defpackage.aozb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ChatMessage implements Parcelable, ajqz {
    public static final Parcelable.Creator<ChatMessage> CREATOR = new ajpv(9);

    public abstract ContentType a();

    public abstract aozb b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ajqz
    public final void gU(ajqv ajqvVar) {
        ajqvVar.c(this);
    }

    public final String toString() {
        return String.format("ChatMessage {%s}", TextUtils.join(",", Arrays.asList(String.format("content=%s", advq.MESSAGE_CONTENT.c(b())), String.format("contentType=%s", a()))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, a(), i, false);
        abhi.j(parcel, 2, b().H(), false);
        abhi.g(parcel, e);
    }
}
