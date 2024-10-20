package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abmi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountCredentials extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountCredentials> CREATOR = new abmi(17);
    final int a;
    boolean b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    final String i;

    public AccountCredentials(int i, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.h(parcel, 2, this.b);
        abhi.q(parcel, 3, this.c, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.q(parcel, 5, this.e, false);
        abhi.q(parcel, 6, this.f, false);
        abhi.q(parcel, 7, this.g, false);
        abhi.q(parcel, 8, this.h, false);
        abhi.q(parcel, 9, this.i, false);
        abhi.g(parcel, e);
    }

    @Deprecated
    public AccountCredentials() {
        this.a = 2;
        abhg.l("com.google", "Account type can't be empty.");
        this.i = "com.google";
    }
}
