package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abzf;
import defpackage.abzk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum UserVerificationRequirement implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<UserVerificationRequirement> CREATOR = new abzf(9);
    public final String d;

    UserVerificationRequirement(String str) {
        this.d = str;
    }

    public static UserVerificationRequirement a(String str) {
        for (UserVerificationRequirement userVerificationRequirement : values()) {
            if (str.equals(userVerificationRequirement.d)) {
                return userVerificationRequirement;
            }
        }
        throw new abzk(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
    }
}
