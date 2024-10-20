package com.google.android.ims.rcsmigration;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adse;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LegacyToken implements Parcelable {
    public static final Parcelable.Creator<LegacyToken> CREATOR = new adse(4);
    private final String a;
    private final long b;

    public LegacyToken(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
    }

    public LegacyToken(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
    }
}
