package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SyncStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncStatus> CREATOR = new acfy(5);
    public final int a;
    public final String b;
    public final long c;

    public SyncStatus(int i, String str, long j) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, i2);
        abhi.q(parcel, 3, this.b, false);
        abhi.n(parcel, 4, this.c);
        abhi.g(parcel, e);
    }
}
