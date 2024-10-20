package com.google.android.ims.rcsservice.lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adsv;
import defpackage.aowt;
import defpackage.aplj;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class StopAllRcsTransportsExceptRequest implements Parcelable {
    public static final Parcelable.Creator<StopAllRcsTransportsExceptRequest> CREATOR = new adsv(6);

    public abstract aplj a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aowt.g(parcel, a());
    }
}
