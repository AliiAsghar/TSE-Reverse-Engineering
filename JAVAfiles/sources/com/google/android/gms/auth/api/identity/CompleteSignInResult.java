package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ablm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CompleteSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CompleteSignInResult> CREATOR = new ablm(19);
    public final SignInCredential a;

    public CompleteSignInResult(SignInCredential signInCredential) {
        abhg.m(signInCredential);
        this.a = signInCredential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SignInCredential signInCredential = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, signInCredential, i, false);
        abhi.g(parcel, e);
    }
}
