package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LoyaltyPoints extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new acjs(18);
    String a;
    LoyaltyPointsBalance b;

    @Deprecated
    TimeInterval c;

    LoyaltyPoints() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, this.a, false);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.o(parcel, 5, this.c, i, false);
        abhi.g(parcel, e);
    }

    public LoyaltyPoints(String str, LoyaltyPointsBalance loyaltyPointsBalance, TimeInterval timeInterval) {
        this.a = str;
        this.b = loyaltyPointsBalance;
        this.c = timeInterval;
    }
}
