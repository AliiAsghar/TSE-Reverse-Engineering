package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeInterval> CREATOR = new acjs(20);
    long a;
    long b;

    TimeInterval() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.n(parcel, 2, this.a);
        abhi.n(parcel, 3, this.b);
        abhi.g(parcel, e);
    }

    public TimeInterval(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
