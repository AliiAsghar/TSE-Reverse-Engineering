package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RegisteredPackageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisteredPackageInfo> CREATOR = new abjj(5);
    public final String a;
    public final long b;
    public final boolean c;
    public final long d;

    public RegisteredPackageInfo(String str, long j, boolean z, long j2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.n(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.n(parcel, 4, this.d);
        abhi.g(parcel, e);
    }
}
