package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WarmUpUiProcessRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WarmUpUiProcessRequest> CREATOR = new acjs(2);
    long a;

    public WarmUpUiProcessRequest(long j) {
        this.a = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.n(parcel, 1, this.a);
        abhi.g(parcel, e);
    }

    public WarmUpUiProcessRequest() {
        this(SystemClock.elapsedRealtime());
    }
}
