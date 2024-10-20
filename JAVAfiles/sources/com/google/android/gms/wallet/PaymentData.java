package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.abhi;
import defpackage.acjq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentData> CREATOR = new acjq(3);
    String a;
    CardInfo b;
    UserAddress c;
    PaymentMethodToken d;
    String e;
    Bundle f;
    String g;
    Bundle h;

    private PaymentData() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.o(parcel, 4, this.d, i, false);
        abhi.q(parcel, 5, this.e, false);
        abhi.t(parcel, 6, this.f);
        abhi.q(parcel, 7, this.g, false);
        abhi.t(parcel, 8, this.h);
        abhi.g(parcel, e);
    }

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.a = str;
        this.b = cardInfo;
        this.c = userAddress;
        this.d = paymentMethodToken;
        this.e = str2;
        this.f = bundle;
        this.g = str3;
        this.h = bundle2;
    }
}
