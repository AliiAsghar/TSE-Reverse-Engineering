package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountNameCheckRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountNameCheckRequest> CREATOR = new ablu(6);
    final int a;

    @Deprecated
    String b;
    String c;
    String d;
    AppDescription e;
    CaptchaSolution f;
    Account g;

    public AccountNameCheckRequest() {
        this.a = 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.o(parcel, 5, this.e, i, false);
        abhi.o(parcel, 6, this.f, i, false);
        abhi.o(parcel, 7, this.g, i, false);
        abhi.g(parcel, e);
    }

    public AccountNameCheckRequest(int i, String str, String str2, String str3, AppDescription appDescription, CaptchaSolution captchaSolution, Account account) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = appDescription;
        this.f = captchaSolution;
        if (account != null || TextUtils.isEmpty(str)) {
            this.g = account;
        } else {
            this.g = new Account(str, "com.google");
        }
    }
}
