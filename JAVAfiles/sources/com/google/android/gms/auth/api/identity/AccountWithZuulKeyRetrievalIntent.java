package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ablm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountWithZuulKeyRetrievalIntent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountWithZuulKeyRetrievalIntent> CREATOR = new ablm(12);
    public final Account a;
    public final PendingIntent b;

    public AccountWithZuulKeyRetrievalIntent(Account account, PendingIntent pendingIntent) {
        abhg.m(account);
        this.a = account;
        abhg.m(pendingIntent);
        this.b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, account, i, false);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.g(parcel, e);
    }
}
