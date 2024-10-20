package com.google.android.ims.rcsservice.transportcontrol;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adsv;
import defpackage.ahby;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TransportControlServiceResult extends ahby {
    public static final Parcelable.Creator<TransportControlServiceResult> CREATOR = new adsv(10);

    public TransportControlServiceResult(int i) {
        this.code = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
    }

    public TransportControlServiceResult(Parcel parcel) {
        this.code = parcel.readInt();
    }
}
