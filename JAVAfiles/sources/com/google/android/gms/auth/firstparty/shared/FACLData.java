package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FACLData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FACLData> CREATOR = new abmm(0);
    final int a;
    final FACLConfig b;
    final String c;
    final boolean d;
    final String e;

    public FACLData(int i, FACLConfig fACLConfig, String str, boolean z, String str2) {
        this.a = i;
        this.b = fACLConfig;
        this.c = str;
        this.d = z;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.h(parcel, 4, this.d);
        abhi.q(parcel, 5, this.e, false);
        abhi.g(parcel, e);
    }
}
