package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PasswordCheckRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PasswordCheckRequest> CREATOR = new abmi(4);
    final int a;
    final String b;
    final String c;
    final String d;
    final String e;
    final AppDescription f;

    public PasswordCheckRequest(int i, String str, String str2, String str3, String str4, AppDescription appDescription) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = appDescription;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.q(parcel, 5, this.e, false);
        abhi.o(parcel, 6, this.f, i, false);
        abhi.g(parcel, e);
    }
}
