package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abzo;
import defpackage.abzp;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public enum ProtocolVersion implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");

    public static final Parcelable.Creator<ProtocolVersion> CREATOR = new abzo(2);
    public final String d;

    ProtocolVersion(String str) {
        this.d = str;
    }

    public static ProtocolVersion a(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (ProtocolVersion protocolVersion : values()) {
            if (str.equals(protocolVersion.d)) {
                return protocolVersion;
            }
        }
        throw new abzp(str);
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
