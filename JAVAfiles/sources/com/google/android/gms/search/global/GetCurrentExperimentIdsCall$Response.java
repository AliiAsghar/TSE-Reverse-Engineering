package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.ache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetCurrentExperimentIdsCall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<GetCurrentExperimentIdsCall$Response> CREATOR = new ache(16);
    public Status a;
    public int[] b;

    public GetCurrentExperimentIdsCall$Response() {
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.y(parcel, 2, this.b);
        abhi.g(parcel, e);
    }

    public GetCurrentExperimentIdsCall$Response(Status status, int[] iArr) {
        this.a = status;
        this.b = iArr;
    }
}
