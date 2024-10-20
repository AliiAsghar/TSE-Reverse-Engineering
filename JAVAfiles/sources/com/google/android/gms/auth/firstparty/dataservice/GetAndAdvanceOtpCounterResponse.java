package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetAndAdvanceOtpCounterResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAndAdvanceOtpCounterResponse> CREATOR = new ablu(19);
    final int a;
    public final Long b;

    public GetAndAdvanceOtpCounterResponse(int i, Long l) {
        this.a = i;
        this.b = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.D(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
