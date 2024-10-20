package com.google.android.gms.auth.api.identity;

import android.content.pm.Signature;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablq;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SigningInfoCompat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SigningInfoCompat> CREATOR = new ablq(15);
    public final boolean a;
    public final boolean b;
    public final Signature[] c;
    public final Signature[] d;

    public SigningInfoCompat(boolean z, boolean z2, Signature[] signatureArr, Signature[] signatureArr2) {
        this.a = z;
        this.b = z2;
        this.c = signatureArr;
        this.d = signatureArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SigningInfoCompat)) {
            return false;
        }
        SigningInfoCompat signingInfoCompat = (SigningInfoCompat) obj;
        if (this.a == signingInfoCompat.a && this.b == signingInfoCompat.b && Arrays.equals(this.c, signingInfoCompat.c) && Arrays.equals(this.d, signingInfoCompat.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b)) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }

    public final String toString() {
        return "SigningInfoCompat{hasMultipleSigners=" + this.a + ", hasPastSigningCertificates=" + this.b + ", signingCertificateHistory=" + Arrays.toString(this.c) + ", apkContentsSigners=" + Arrays.toString(this.d) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, z);
        abhi.h(parcel, 2, this.b);
        abhi.H(parcel, 3, this.c, i);
        abhi.H(parcel, 4, this.d, i);
        abhi.g(parcel, e);
    }
}
