package com.google.android.ims.rcsservice.locationsharing;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adsv;
import defpackage.ahby;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LocationSharingResult extends ahby {
    public static final Parcelable.Creator<LocationSharingResult> CREATOR = new adsv(8);
    private final long a;
    private final String b;
    private final String c;

    public LocationSharingResult(long j, String str, int i, String str2) {
        this(j, str, i, str2, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte b;
        parcel.writeString(this.b);
        parcel.writeInt(this.code);
        parcel.writeString(this.description);
        parcel.writeLong(this.a);
        if (this.c != null) {
            b = 1;
        } else {
            b = 0;
        }
        parcel.writeByte(b);
        parcel.writeString(this.c);
    }

    public LocationSharingResult(long j, String str, int i, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.code = i;
        this.description = str2;
        this.c = str3;
    }

    public LocationSharingResult(Parcel parcel) {
        this.b = parcel.readString();
        this.code = parcel.readInt();
        this.description = parcel.readString();
        this.a = parcel.readLong();
        this.c = parcel.readByte() > 0 ? parcel.readString() : null;
    }
}
