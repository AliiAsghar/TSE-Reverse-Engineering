package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import defpackage.abhi;
import defpackage.acjq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new acjq(1);
    public final int a;
    String b;
    CommonWalletObject c;

    OfferWalletObject() {
        this.a = 3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.q(parcel, 2, null, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.o(parcel, 4, this.c, i, false);
        abhi.g(parcel, e);
    }

    public OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.a = i;
        this.b = str2;
        if (i >= 3) {
            this.c = commonWalletObject;
            return;
        }
        CommonWalletObject commonWalletObject2 = (CommonWalletObject) CommonWalletObject.a().a;
        commonWalletObject2.a = str;
        this.c = commonWalletObject2;
    }
}
