package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acgc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetStorageStatsCall$PackageStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetStorageStatsCall$PackageStats> CREATOR = new acgc(19);
    public String a;
    public long b;
    public boolean c;
    public long d;

    public GetStorageStatsCall$PackageStats() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.n(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.n(parcel, 4, this.d);
        abhi.g(parcel, e);
    }

    public GetStorageStatsCall$PackageStats(String str, long j, boolean z, long j2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = j2;
    }
}
