package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.abhi;
import defpackage.aciz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CardInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new aciz(8);
    String a;
    String b;
    String c;
    int d;
    UserAddress e;

    private CardInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.m(parcel, 4, this.d);
        abhi.o(parcel, 5, this.e, i, false);
        abhi.g(parcel, e);
    }

    public CardInfo(String str, String str2, String str3, int i, UserAddress userAddress) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = userAddress;
    }
}
