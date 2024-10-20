package com.google.android.apps.messaging.ui.conversation.message;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.sdr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MessageDetails implements Parcelable {
    public static final Parcelable.Creator<MessageDetails> CREATOR = new sdr(18);
    public final MessageIdType a;
    public final String b;
    public final CharSequence c;

    public MessageDetails(MessageIdType messageIdType, String str, CharSequence charSequence) {
        this.a = messageIdType;
        this.b = str;
        this.c = charSequence;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.a());
        parcel.writeString(this.b);
        TextUtils.writeToParcel(this.c, parcel, i);
    }
}
