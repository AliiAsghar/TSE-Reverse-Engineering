package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abzb;
import defpackage.abzc;
import defpackage.abzg;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new abzb(20);
    private final PublicKeyCredentialType a;
    private final COSEAlgorithmIdentifier b;

    public PublicKeyCredentialParameters(String str, int i) {
        abhg.m(str);
        try {
            this.a = PublicKeyCredentialType.a(str);
            try {
                this.b = COSEAlgorithmIdentifier.a(i);
            } catch (abzc e) {
                throw new IllegalArgumentException(e);
            }
        } catch (abzg e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        if (!this.a.equals(publicKeyCredentialParameters.a) || !this.b.equals(publicKeyCredentialParameters.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        COSEAlgorithmIdentifier cOSEAlgorithmIdentifier = this.b;
        return "PublicKeyCredentialParameters{\n type=" + String.valueOf(this.a) + ", \n algorithm=" + cOSEAlgorithmIdentifier.toString() + "\n }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a.b;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.A(parcel, 3, Integer.valueOf(this.b.a.a()));
        abhi.g(parcel, e);
    }
}
