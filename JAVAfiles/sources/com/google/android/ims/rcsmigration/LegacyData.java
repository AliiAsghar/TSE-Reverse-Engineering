package com.google.android.ims.rcsmigration;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adse;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LegacyData implements Parcelable {
    public static final Parcelable.Creator<LegacyData> CREATOR = new adse(3);
    private final LegacyToken a;
    private final int b;
    private final int c;
    private final ArrayList d;
    private final ArrayList e;
    private final ArrayList f;
    private final String g;
    private final String h;
    private final long i;

    @Deprecated
    private boolean j;

    public LegacyData(LegacyToken legacyToken, int i, int i2, ArrayList<FileTransfer> arrayList, ArrayList<UndeliveredMessage> arrayList2, ArrayList<File> arrayList3, String str, String str2, long j) {
        this.j = false;
        this.a = legacyToken;
        this.b = i;
        this.c = i2;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
        this.g = str;
        this.h = str2;
        this.i = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeInt(this.b);
        parcel.writeList(this.d);
        parcel.writeList(this.e);
        parcel.writeList(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeLong(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.c);
    }

    public LegacyData(Parcel parcel) {
        this.j = false;
        this.a = (LegacyToken) parcel.readParcelable(LegacyToken.class.getClassLoader());
        this.b = parcel.readInt();
        this.d = parcel.readArrayList(FileTransfer.class.getClassLoader());
        this.e = parcel.readArrayList(UndeliveredMessage.class.getClassLoader());
        this.f = parcel.readArrayList(File.class.getClassLoader());
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readLong();
        this.j = parcel.readInt() == 1;
        this.c = parcel.readInt();
    }
}
