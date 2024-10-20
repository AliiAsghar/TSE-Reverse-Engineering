package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abzf;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public enum ErrorCode implements Parcelable {
    OK(0),
    OTHER_ERROR(1),
    BAD_REQUEST(2),
    CONFIGURATION_UNSUPPORTED(3),
    DEVICE_INELIGIBLE(4),
    TIMEOUT(5);

    public static final Parcelable.Creator<ErrorCode> CREATOR = new abzf(20);
    public final int g;

    ErrorCode(int i) {
        this.g = i;
    }

    public static ErrorCode a(int i) {
        for (ErrorCode errorCode : values()) {
            if (i == errorCode.g) {
                return errorCode;
            }
        }
        return OTHER_ERROR;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.g);
    }
}
