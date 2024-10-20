package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abzb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DevicePublicKeyExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DevicePublicKeyExtension> CREATOR = new abzb(6);

    public final boolean equals(Object obj) {
        if (!(obj instanceof DevicePublicKeyExtension)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{false});
    }

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, false);
        abhi.g(parcel, e);
    }
}
