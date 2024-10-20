package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new acjs(17);
    final int a;
    String b;
    final double c;
    String d;
    long e;
    final int f;

    LoyaltyPointsBalance() {
        this.f = -1;
        this.a = -1;
        this.c = -1.0d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.q(parcel, 3, this.b, false);
        abhi.k(parcel, 4, this.c);
        abhi.q(parcel, 5, this.d, false);
        abhi.n(parcel, 6, this.e);
        abhi.m(parcel, 7, this.f);
        abhi.g(parcel, e);
    }

    public LoyaltyPointsBalance(int i, String str, double d, String str2, long j, int i2) {
        this.a = i;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = j;
        this.f = i2;
    }
}
