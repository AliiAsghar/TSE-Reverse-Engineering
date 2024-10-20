package com.google.android.ims.rcsmigration;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adse;

/* compiled from: PG */
/* loaded from: classes.dex */
public class File implements Parcelable {
    public static final Parcelable.Creator<File> CREATOR = new adse(0);
    private final String a;
    private final byte[] b;

    public File(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }

    public File(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.createByteArray();
    }
}
