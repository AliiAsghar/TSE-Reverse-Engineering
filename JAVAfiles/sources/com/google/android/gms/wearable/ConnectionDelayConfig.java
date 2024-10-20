package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acju;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConnectionDelayConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionDelayConfig> CREATOR = new acju(5);
    public final long a;
    public final long b;

    public ConnectionDelayConfig(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int e = abhi.e(parcel);
        abhi.n(parcel, 1, j);
        abhi.n(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
