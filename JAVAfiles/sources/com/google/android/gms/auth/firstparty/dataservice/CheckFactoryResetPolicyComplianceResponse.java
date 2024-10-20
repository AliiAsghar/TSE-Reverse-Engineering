package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CheckFactoryResetPolicyComplianceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CheckFactoryResetPolicyComplianceResponse> CREATOR = new ablu(12);
    final int a;
    public final int b;

    public CheckFactoryResetPolicyComplianceResponse(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.m(parcel, 3, this.b);
        abhi.g(parcel, e);
    }
}
