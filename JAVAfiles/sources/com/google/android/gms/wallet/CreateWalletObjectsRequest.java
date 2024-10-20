package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aciz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new aciz(12);
    LoyaltyWalletObject a;
    OfferWalletObject b;
    GiftCardWalletObject c;
    int d;

    CreateWalletObjectsRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, this.a, i, false);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.o(parcel, 4, this.c, i, false);
        abhi.m(parcel, 5, this.d);
        abhi.g(parcel, e);
    }

    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject, GiftCardWalletObject giftCardWalletObject, int i) {
        this.a = loyaltyWalletObject;
        this.b = offerWalletObject;
        this.c = giftCardWalletObject;
        this.d = i;
    }
}
