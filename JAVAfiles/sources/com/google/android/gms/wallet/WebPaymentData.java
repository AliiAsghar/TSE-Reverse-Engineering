package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WebPaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebPaymentData> CREATOR = new acjq(10);
    String a;
    Bundle b;

    private WebPaymentData() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, this.a, false);
        abhi.t(parcel, 3, this.b);
        abhi.g(parcel, e);
    }

    public WebPaymentData(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }
}
