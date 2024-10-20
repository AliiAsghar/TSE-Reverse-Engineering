package com.google.android.apps.messaging.shared.datamodel.data.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.amfm;
import defpackage.rha;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DeviceData implements Parcelable {
    public static final Parcelable.Creator<DeviceData> CREATOR = new rha(8);
    public final amfm a;
    public boolean b;
    public boolean c;
    public boolean d;

    public DeviceData(amfm amfmVar) {
        this.a = amfmVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.f);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public DeviceData(Parcel parcel) {
        amfm b = amfm.b(parcel.readInt());
        this.a = b == null ? amfm.UNKNOWN_BUGLE_DEVICE_TYPE : b;
        this.b = parcel.readInt() != 0;
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
    }
}
