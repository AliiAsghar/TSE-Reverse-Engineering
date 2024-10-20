package com.google.android.gms.droidguard.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import defpackage.abuz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DroidGuardInitReply implements Parcelable {
    public static final Parcelable.Creator<DroidGuardInitReply> CREATOR = new abuz(13);
    public final ParcelFileDescriptor a;
    public final Parcelable b;

    public DroidGuardInitReply(ParcelFileDescriptor parcelFileDescriptor, Parcelable parcelable) {
        this.a = parcelFileDescriptor;
        this.b = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i;
        Parcelable parcelable = this.b;
        int i2 = 0;
        if (parcelable != null) {
            i = parcelable.describeContents();
        } else {
            i = 0;
        }
        if (this.a != null) {
            i2 = 1;
        }
        return i | i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
