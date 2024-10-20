package com.google.android.ims.rcsservice.ims;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.acok;
import defpackage.adsv;
import defpackage.adsw;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ImsRegistrationState implements Parcelable {
    public static final Parcelable.Creator<ImsRegistrationState> CREATOR = new adsv(4);
    public final adsw a;
    public final acok b;

    public ImsRegistrationState(adsw adswVar) {
        this.a = adswVar;
        this.b = acok.UNKNOWN;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImsRegistrationState)) {
            return false;
        }
        ImsRegistrationState imsRegistrationState = (ImsRegistrationState) obj;
        if (imsRegistrationState.b == this.b && imsRegistrationState.a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.l ^ 47;
    }

    public final String toString() {
        acok acokVar = this.b;
        return "RegistrationState " + this.a.name() + ", reason " + String.valueOf(acokVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.l);
        parcel.writeInt(this.b.ordinal());
    }

    public ImsRegistrationState(adsw adswVar, acok acokVar) {
        this.a = adswVar;
        this.b = acokVar;
    }

    public ImsRegistrationState(Parcel parcel) {
        this.a = adsw.a(parcel.readInt());
        this.b = acok.a(parcel.readInt());
    }
}
