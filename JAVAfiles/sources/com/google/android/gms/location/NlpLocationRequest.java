package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acdi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class NlpLocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<NlpLocationRequest> CREATOR = new acdi(5);
    public final WorkSource a;

    public NlpLocationRequest(WorkSource workSource) {
        workSource.getClass();
        this.a = workSource;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        WorkSource workSource = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, workSource, i, false);
        abhi.g(parcel, e);
    }
}
