package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.abxj;
import defpackage.abyv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable"),
    HYBRID_V2("hybrid");

    public static final Parcelable.Creator<Transport> CREATOR = new abxj(10);
    public final String h;

    Transport(String str) {
        this.h = str;
    }

    public static Transport a(String str) {
        for (Transport transport : values()) {
            if (str.equals(transport.h)) {
                return transport;
            }
        }
        throw new abyv(String.format("Transport %s not supported", str));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.h);
    }
}
