package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UnlockFactoryResetProtectionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UnlockFactoryResetProtectionRequest> CREATOR = new abmm(13);
    final int a;
    public final String b;
    public final String c;
    public final String d;

    public UnlockFactoryResetProtectionRequest(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.g(parcel, e);
    }
}
