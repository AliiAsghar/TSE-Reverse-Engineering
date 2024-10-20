package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abos;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new abos(20);
    final int a;

    @Deprecated
    final IBinder b;
    final Scope[] c;
    final Integer d;
    final Integer e;
    final Account f;
    final boolean g;

    public AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2, Account account, boolean z) {
        this.a = i;
        this.b = iBinder;
        this.c = scopeArr;
        this.d = num;
        this.e = num2;
        this.f = account;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.x(parcel, 2, this.b);
        abhi.H(parcel, 3, this.c, i);
        abhi.A(parcel, 4, this.d);
        abhi.A(parcel, 5, this.e);
        abhi.o(parcel, 6, this.f, i, false);
        abhi.h(parcel, 7, this.g);
        abhi.g(parcel, e);
    }
}
