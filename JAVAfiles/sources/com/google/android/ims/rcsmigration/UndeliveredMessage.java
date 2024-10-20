package com.google.android.ims.rcsmigration;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adse;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UndeliveredMessage implements Parcelable {
    public static final Parcelable.Creator<UndeliveredMessage> CREATOR = new adse(6);
    private final long a;
    private final String b;
    private final String c;

    public UndeliveredMessage(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public UndeliveredMessage(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
