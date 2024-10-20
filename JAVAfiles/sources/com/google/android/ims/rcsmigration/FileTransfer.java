package com.google.android.ims.rcsmigration;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adse;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FileTransfer implements Parcelable {
    public static final Parcelable.Creator<FileTransfer> CREATOR = new adse(2);
    private final long a;
    private final long b;
    private final String c;
    private final String d;
    private final String e;
    private final long f;
    private final String g;
    private final int h;
    private final int i;
    private final int j;
    private final String k;

    public FileTransfer(long j, long j2, String str, String str2, String str3, long j3, String str4, int i, int i2, int i3, String str5) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j3;
        this.g = str4;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
    }

    public FileTransfer(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readLong();
        this.g = parcel.readString();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readString();
    }
}
