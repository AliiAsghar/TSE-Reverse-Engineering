package com.google.android.apps.messaging.shared.conversation.draft;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import defpackage.arrj;
import defpackage.d;
import defpackage.ltv;
import defpackage.yyb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EditingData implements Parcelable {
    public static final Parcelable.Creator<EditingData> CREATOR = new ltv(16);
    public final MessageId a;
    public final String b;
    private final MessageId c;

    public EditingData(MessageId messageId, String str, MessageId messageId2) {
        messageId.getClass();
        messageId2.getClass();
        this.a = messageId;
        this.b = str;
        this.c = messageId2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditingData)) {
            return false;
        }
        EditingData editingData = (EditingData) obj;
        if (d.F(this.a, editingData.a) && d.F(this.b, editingData.b) && d.F(this.c, editingData.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.c.hashCode();
    }

    public final String toString() {
        CharSequence charSequence;
        String str = this.b;
        if (str != null) {
            charSequence = yyb.be(str);
        } else {
            charSequence = null;
        }
        return "EditingData(editedMessageId=" + this.a + ", editMessageText=" + ((Object) charSequence) + ", lastEditMessageId=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }

    public /* synthetic */ EditingData(MessageId messageId, String str, MessageId messageId2, int i, arrj arrjVar) {
        this(messageId, (i & 2) != 0 ? null : str, messageId2);
    }
}
