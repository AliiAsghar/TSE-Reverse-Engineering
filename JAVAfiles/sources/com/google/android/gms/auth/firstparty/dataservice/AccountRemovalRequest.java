package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountRemovalRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountRemovalRequest> CREATOR = new ablu(8);
    final int a;

    @Deprecated
    String b;
    Account c;

    public AccountRemovalRequest() {
        this.a = 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.g(parcel, e);
    }

    public AccountRemovalRequest(int i, String str, Account account) {
        this.a = i;
        this.b = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.c = account;
        } else {
            this.c = new Account(str, "com.google");
        }
    }
}
