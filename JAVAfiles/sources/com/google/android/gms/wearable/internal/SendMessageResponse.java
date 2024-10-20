package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acll;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SendMessageResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SendMessageResponse> CREATOR = new acll(17);
    public final int a;
    public final int b;

    public SendMessageResponse(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.m(parcel, 3, this.b);
        abhi.g(parcel, e);
    }
}
