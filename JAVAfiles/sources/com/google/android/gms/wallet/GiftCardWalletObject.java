package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import defpackage.abhi;
import defpackage.aciz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new aciz(15);
    final CommonWalletObject a;
    String b;
    String c;

    @Deprecated
    String d;
    long e;
    String f;
    long g;
    String h;

    GiftCardWalletObject() {
        this.a = (CommonWalletObject) CommonWalletObject.a().a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, this.a, i, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.q(parcel, 4, this.c, false);
        abhi.q(parcel, 5, this.d, false);
        abhi.n(parcel, 6, this.e);
        abhi.q(parcel, 7, this.f, false);
        abhi.n(parcel, 8, this.g);
        abhi.q(parcel, 9, this.h, false);
        abhi.g(parcel, e);
    }

    public GiftCardWalletObject(CommonWalletObject commonWalletObject, String str, String str2, String str3, long j, String str4, long j2, String str5) {
        CommonWalletObject.a();
        this.a = commonWalletObject;
        this.b = str;
        this.c = str2;
        this.e = j;
        this.f = str4;
        this.g = j2;
        this.h = str5;
        this.d = str3;
    }
}
