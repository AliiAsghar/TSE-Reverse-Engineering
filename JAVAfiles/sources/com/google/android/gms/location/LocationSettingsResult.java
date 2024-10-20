package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.acdi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new acdi(2);
    public final Status a;
    public final LocationSettingsStates b;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.a = status;
        this.b = locationSettingsStates;
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, status, i, false);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.g(parcel, e);
    }
}
