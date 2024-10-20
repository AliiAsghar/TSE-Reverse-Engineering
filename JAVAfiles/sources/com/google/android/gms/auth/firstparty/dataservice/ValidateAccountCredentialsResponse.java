package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ValidateAccountCredentialsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ValidateAccountCredentialsResponse> CREATOR = new abmi(8);
    final int a;
    public final int b;
    public final String c;

    public ValidateAccountCredentialsResponse(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.m(parcel, 2, this.b);
        abhi.q(parcel, 3, this.c, false);
        abhi.g(parcel, e);
    }
}
