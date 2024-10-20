package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UpdateCredentialsWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UpdateCredentialsWorkflowRequest> CREATOR = new abmi(16);
    final int a;

    @Deprecated
    String b;
    AppDescription c;
    final Bundle d;
    Account e;
    AccountAuthenticatorResponse f;

    public UpdateCredentialsWorkflowRequest() {
        this.a = 3;
        this.d = new Bundle();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.t(parcel, 4, this.d);
        abhi.o(parcel, 5, this.e, i, false);
        abhi.o(parcel, 6, this.f, i, false);
        abhi.g(parcel, e);
    }

    public UpdateCredentialsWorkflowRequest(int i, String str, AppDescription appDescription, Bundle bundle, Account account, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        this.a = i;
        this.b = str;
        this.c = appDescription;
        this.d = bundle;
        if (account != null || TextUtils.isEmpty(str)) {
            this.e = account;
        } else {
            this.e = new Account(str, "com.google");
        }
        this.f = accountAuthenticatorResponse;
    }
}
