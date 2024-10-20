package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetRecentContextCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetRecentContextCall$Request> CREATOR = new abjg(10);
    public final Account a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public GetRecentContextCall$Request(Account account, boolean z, boolean z2, boolean z3, String str) {
        this.a = account;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.h(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.h(parcel, 4, this.d);
        abhi.q(parcel, 5, this.e, false);
        abhi.g(parcel, e);
    }

    public GetRecentContextCall$Request() {
        this(null, false, false, false, null);
    }
}
