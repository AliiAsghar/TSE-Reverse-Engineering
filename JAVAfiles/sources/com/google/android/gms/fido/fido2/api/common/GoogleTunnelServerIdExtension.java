package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abzb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleTunnelServerIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleTunnelServerIdExtension> CREATOR = new abzb(13);
    public final String a;

    public GoogleTunnelServerIdExtension(String str) {
        abhg.m(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GoogleTunnelServerIdExtension)) {
            return false;
        }
        return this.a.equals(((GoogleTunnelServerIdExtension) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.g(parcel, e);
    }
}
