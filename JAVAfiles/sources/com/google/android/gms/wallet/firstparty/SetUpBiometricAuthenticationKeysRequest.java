package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SetUpBiometricAuthenticationKeysRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetUpBiometricAuthenticationKeysRequest> CREATOR = new acjq(20);
    byte[] a;

    public SetUpBiometricAuthenticationKeysRequest(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.j(parcel, 1, this.a, false);
        abhi.g(parcel, e);
    }

    public SetUpBiometricAuthenticationKeysRequest() {
        this(null);
    }
}
