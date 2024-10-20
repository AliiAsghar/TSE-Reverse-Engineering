package com.google.android.ims.rcsservice.filetransfer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adse;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FileTransferState implements Parcelable {
    public static final Parcelable.Creator<FileTransferState> CREATOR = new adse(17);
    private final long a;
    private final String b;
    private final String c;
    private final long d;
    private int e;
    private final String f;

    public FileTransferState(long j, String str, String str2, String str3, long j2) {
        this.a = j;
        this.b = str;
        this.c = str3;
        this.f = str2;
        this.d = j2;
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
        parcel.writeString(this.f);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
    }

    public FileTransferState(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.f = parcel.readString();
        this.d = parcel.readLong();
        this.e = parcel.readInt();
    }
}
