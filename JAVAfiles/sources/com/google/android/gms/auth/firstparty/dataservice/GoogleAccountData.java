package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablu;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleAccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleAccountData> CREATOR = new ablu(20);
    final int a;

    @Deprecated
    final String b;
    final boolean c;
    public final List d;
    public final String e;
    public final String f;
    public final Account g;

    public GoogleAccountData(int i, String str, boolean z, List list, String str2, String str3, Account account) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = str2;
        this.f = str3;
        if (account == null && !TextUtils.isEmpty(str)) {
            this.g = new Account(str, "com.google");
        } else {
            this.g = account;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.h(parcel, 3, this.c);
        abhi.G(parcel, 4, this.d);
        abhi.q(parcel, 5, this.e, false);
        abhi.q(parcel, 6, this.f, false);
        abhi.o(parcel, 7, this.g, i, false);
        abhi.g(parcel, e);
    }
}
