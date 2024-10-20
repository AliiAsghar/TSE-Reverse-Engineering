package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PaymentCardRecognitionIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionIntentRequest> CREATOR = new acjq(0);
    int a;

    PaymentCardRecognitionIntentRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.g(parcel, e);
    }

    public PaymentCardRecognitionIntentRequest(int i) {
        this.a = i;
    }
}
