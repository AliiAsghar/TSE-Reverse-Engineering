package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UnlockForWearRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UnlockForWearRequest> CREATOR = new abmm(15);
    public final boolean a;

    public UnlockForWearRequest(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, z);
        abhi.g(parcel, e);
    }
}
