package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.abhi;
import defpackage.aciz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new aciz(13);
    String a;
    String b;
    ProxyCard c;
    String d;
    Address e;
    Address f;
    String[] g;
    UserAddress h;
    UserAddress i;
    InstrumentInfo[] j;
    PaymentMethodToken k;

    private FullWallet() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, this.a, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.o(parcel, 4, this.c, i, false);
        abhi.q(parcel, 5, this.d, false);
        abhi.o(parcel, 6, this.e, i, false);
        abhi.o(parcel, 7, this.f, i, false);
        abhi.F(parcel, 8, this.g);
        abhi.o(parcel, 9, this.h, i, false);
        abhi.o(parcel, 10, this.i, i, false);
        abhi.H(parcel, 11, this.j, i);
        abhi.o(parcel, 12, this.k, i, false);
        abhi.g(parcel, e);
    }

    public FullWallet(String str, String str2, ProxyCard proxyCard, String str3, Address address, Address address2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.a = str;
        this.b = str2;
        this.c = proxyCard;
        this.d = str3;
        this.e = address;
        this.f = address2;
        this.g = strArr;
        this.h = userAddress;
        this.i = userAddress2;
        this.j = instrumentInfoArr;
        this.k = paymentMethodToken;
    }
}
