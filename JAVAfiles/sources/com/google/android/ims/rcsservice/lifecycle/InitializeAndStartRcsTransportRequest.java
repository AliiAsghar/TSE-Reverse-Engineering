package com.google.android.ims.rcsservice.lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adsv;
import defpackage.aowt;
import defpackage.aplh;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class InitializeAndStartRcsTransportRequest implements Parcelable {
    public static final Parcelable.Creator<InitializeAndStartRcsTransportRequest> CREATOR = new adsv(5);

    public abstract aplh a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aowt.g(parcel, a());
    }
}
