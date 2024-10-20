package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CaptchaSolution extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CaptchaSolution> CREATOR = new abmi(20);
    final int a;
    final String b;
    final String c;

    public CaptchaSolution(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.g(parcel, e);
    }
}
