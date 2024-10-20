package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmi;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountRemovalAllowedWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountRemovalAllowedWorkflowRequest> CREATOR = new abmi(11);
    final AccountAuthenticatorResponse a;
    final Account b;
    final boolean c;

    public AccountRemovalAllowedWorkflowRequest(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z) {
        d.aC(account, "account cannot be null");
        this.b = account;
        d.aC(accountAuthenticatorResponse, "amResponse cannot be null");
        this.a = accountAuthenticatorResponse;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.h(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
