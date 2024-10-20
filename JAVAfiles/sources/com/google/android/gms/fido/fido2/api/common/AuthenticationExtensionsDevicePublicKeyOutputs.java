package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abxj;
import defpackage.aozb;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AuthenticationExtensionsDevicePublicKeyOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsDevicePublicKeyOutputs> CREATOR = new abxj(20);
    private final aozb a;
    private final aozb b;

    public AuthenticationExtensionsDevicePublicKeyOutputs(aozb aozbVar, aozb aozbVar2) {
        this.a = aozbVar;
        this.b = aozbVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsDevicePublicKeyOutputs)) {
            return false;
        }
        AuthenticationExtensionsDevicePublicKeyOutputs authenticationExtensionsDevicePublicKeyOutputs = (AuthenticationExtensionsDevicePublicKeyOutputs) obj;
        if (!d.B(this.a, authenticationExtensionsDevicePublicKeyOutputs.a) || !d.B(this.b, authenticationExtensionsDevicePublicKeyOutputs.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] H;
        aozb aozbVar = this.a;
        int e = abhi.e(parcel);
        byte[] bArr = null;
        if (aozbVar == null) {
            H = null;
        } else {
            H = aozbVar.H();
        }
        abhi.j(parcel, 1, H, false);
        aozb aozbVar2 = this.b;
        if (aozbVar2 != null) {
            bArr = aozbVar2.H();
        }
        abhi.j(parcel, 2, bArr, false);
        abhi.g(parcel, e);
    }
}
