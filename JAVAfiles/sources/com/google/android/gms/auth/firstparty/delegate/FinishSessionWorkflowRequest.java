package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abmi;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FinishSessionWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FinishSessionWorkflowRequest> CREATOR = new abmi(13);
    public final int a;
    public final AppDescription b;
    public final String c;
    public final AccountAuthenticatorResponse d;
    private final Bundle e;

    public FinishSessionWorkflowRequest(int i, Bundle bundle, AppDescription appDescription, String str, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        this.a = i;
        d.aC(bundle, "sessionBundle cannot be null");
        this.e = bundle;
        d.aC(appDescription, "callingAppDescription cannot be null");
        this.b = appDescription;
        abhg.l(str, "accountType must be provided");
        this.c = str;
        this.d = accountAuthenticatorResponse;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.t(parcel, 2, new Bundle(this.e));
        abhi.o(parcel, 3, this.b, i, false);
        abhi.q(parcel, 4, this.c, false);
        abhi.o(parcel, 5, this.d, i, false);
        abhi.g(parcel, e);
    }
}
