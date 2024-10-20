package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetDefaultAccountResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetDefaultAccountResult> CREATOR = new ablq(1);
    public final Account a;

    public GetDefaultAccountResult(Account account) {
        this.a = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, account, i, false);
        abhi.g(parcel, e);
    }
}
