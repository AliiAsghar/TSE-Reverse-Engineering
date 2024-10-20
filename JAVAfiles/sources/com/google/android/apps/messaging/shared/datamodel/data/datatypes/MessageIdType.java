package com.google.android.apps.messaging.shared.datamodel.data.datatypes;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rha;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MessageIdType implements Parcelable {
    public static final Parcelable.Creator<MessageIdType> CREATOR = new rha(12);
    public final long a;

    public MessageIdType(long j) {
        this.a = j == 0 ? -1L : j;
    }

    public final String a() {
        return String.valueOf(this.a);
    }

    public final boolean b() {
        if (this.a < 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MessageIdType) || this.a != ((MessageIdType) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (int) (this.a & 65535);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
