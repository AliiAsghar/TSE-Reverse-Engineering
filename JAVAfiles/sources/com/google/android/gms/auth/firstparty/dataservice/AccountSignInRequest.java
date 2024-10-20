package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountSignInRequest> CREATOR = new ablu(10);
    final int a;
    AppDescription b;
    boolean c;
    boolean d;
    CaptchaSolution e;
    AccountCredentials f;

    public AccountSignInRequest() {
        this.a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.h(parcel, 3, this.c);
        abhi.h(parcel, 4, this.d);
        abhi.o(parcel, 5, this.e, i, false);
        abhi.o(parcel, 6, this.f, i, false);
        abhi.g(parcel, e);
    }

    public AccountSignInRequest(int i, AppDescription appDescription, boolean z, boolean z2, CaptchaSolution captchaSolution, AccountCredentials accountCredentials) {
        this.a = i;
        this.b = appDescription;
        this.c = z;
        this.d = z2;
        this.e = captchaSolution;
        this.f = accountCredentials;
    }
}
