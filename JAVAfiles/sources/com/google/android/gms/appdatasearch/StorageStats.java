package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StorageStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StorageStats> CREATOR = new abjj(11);
    public final RegisteredPackageInfo[] a;
    public final long b;
    public final long c;
    public final long d;

    public StorageStats(RegisteredPackageInfo[] registeredPackageInfoArr, long j, long j2, long j3) {
        this.a = registeredPackageInfoArr;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.H(parcel, 1, this.a, i);
        abhi.n(parcel, 2, this.b);
        abhi.n(parcel, 3, this.c);
        abhi.n(parcel, 4, this.d);
        abhi.g(parcel, e);
    }
}
