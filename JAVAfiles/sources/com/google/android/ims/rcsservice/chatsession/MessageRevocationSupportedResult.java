package com.google.android.ims.rcsservice.chatsession;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adse;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum MessageRevocationSupportedResult implements Parcelable {
    UNKNOWN,
    REVOCATION_ALLOWED,
    REVOCATION_DISALLOWED,
    UNSUPPORTED_CSAPK_VERSION,
    SESSION_NOT_FOUND,
    PROVIDER_NOT_FOUND;

    public static final Parcelable.Creator<MessageRevocationSupportedResult> CREATOR = new adse(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
