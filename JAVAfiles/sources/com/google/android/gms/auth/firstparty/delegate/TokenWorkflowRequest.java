package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TokenWorkflowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenWorkflowRequest> CREATOR = new abmi(15);
    String a;

    @Deprecated
    String b;
    final Bundle c;
    FACLConfig d;
    PACLConfig e;
    boolean f;
    AppDescription g;
    Account h;
    AccountAuthenticatorResponse i;
    boolean j;

    public TokenWorkflowRequest() {
        this.j = true;
        this.c = new Bundle();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, this.a, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.t(parcel, 4, this.c);
        abhi.o(parcel, 5, this.d, i, false);
        abhi.o(parcel, 6, this.e, i, false);
        abhi.h(parcel, 7, this.f);
        abhi.o(parcel, 8, this.g, i, false);
        abhi.o(parcel, 9, this.h, i, false);
        abhi.o(parcel, 10, this.i, i, false);
        abhi.h(parcel, 11, this.j);
        abhi.g(parcel, e);
    }

    public TokenWorkflowRequest(String str, String str2, Bundle bundle, FACLConfig fACLConfig, PACLConfig pACLConfig, boolean z, AppDescription appDescription, Account account, AccountAuthenticatorResponse accountAuthenticatorResponse, boolean z2) {
        this.j = true;
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = fACLConfig;
        this.e = pACLConfig;
        this.f = z;
        this.g = appDescription;
        if (account != null || TextUtils.isEmpty(str2)) {
            this.h = account;
        } else {
            this.h = new Account(str2, "com.google");
        }
        this.i = accountAuthenticatorResponse;
        this.j = z2;
    }
}
