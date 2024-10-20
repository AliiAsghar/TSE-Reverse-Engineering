package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abuz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VerifyPhoneNumberResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VerifyPhoneNumberResponse> CREATOR = new abuz(11);
    public final PhoneNumberVerification[] a;
    public final Bundle b;

    public VerifyPhoneNumberResponse(PhoneNumberVerification[] phoneNumberVerificationArr, Bundle bundle) {
        this.a = phoneNumberVerificationArr;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PhoneNumberVerification[] phoneNumberVerificationArr = this.a;
        int e = abhi.e(parcel);
        abhi.H(parcel, 1, phoneNumberVerificationArr, i);
        abhi.t(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
