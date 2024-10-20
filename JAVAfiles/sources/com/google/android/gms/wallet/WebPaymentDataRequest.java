package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WebPaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebPaymentDataRequest> CREATOR = new acjq(11);
    Cart a;
    String b;
    String c;
    byte[] d;
    Bundle e;

    private WebPaymentDataRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, this.a, i, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.q(parcel, 4, this.c, false);
        abhi.t(parcel, 5, this.e);
        abhi.j(parcel, 6, this.d, false);
        abhi.g(parcel, e);
    }

    public WebPaymentDataRequest(Cart cart, String str, String str2, byte[] bArr, Bundle bundle) {
        this.a = cart;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = bundle;
    }
}
