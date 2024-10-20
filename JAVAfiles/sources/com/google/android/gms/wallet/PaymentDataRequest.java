package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjq;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new acjq(4);
    boolean a;
    boolean b;
    CardRequirements c;
    boolean d;
    ShippingAddressRequirements e;
    ArrayList f;
    PaymentMethodTokenizationParameters g;
    TransactionInfo h;
    final boolean i;
    String j;
    byte[] k;
    Bundle l;

    private PaymentDataRequest() {
        this.i = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, this.a);
        abhi.h(parcel, 2, this.b);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.h(parcel, 4, this.d);
        abhi.o(parcel, 5, this.e, i, false);
        abhi.z(parcel, 6, this.f);
        abhi.o(parcel, 7, this.g, i, false);
        abhi.o(parcel, 8, this.h, i, false);
        abhi.h(parcel, 9, this.i);
        abhi.q(parcel, 10, this.j, false);
        abhi.t(parcel, 11, this.l);
        abhi.j(parcel, 12, this.k, false);
        abhi.g(parcel, e);
    }

    public PaymentDataRequest(boolean z, boolean z2, CardRequirements cardRequirements, boolean z3, ShippingAddressRequirements shippingAddressRequirements, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, TransactionInfo transactionInfo, boolean z4, String str, byte[] bArr, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = cardRequirements;
        this.d = z3;
        this.e = shippingAddressRequirements;
        this.f = arrayList;
        this.g = paymentMethodTokenizationParameters;
        this.h = transactionInfo;
        this.i = z4;
        this.j = str;
        this.k = bArr;
        this.l = bundle;
    }
}
