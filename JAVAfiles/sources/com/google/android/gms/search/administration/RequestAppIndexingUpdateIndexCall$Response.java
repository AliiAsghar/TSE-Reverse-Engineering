package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.ache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RequestAppIndexingUpdateIndexCall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<RequestAppIndexingUpdateIndexCall$Response> CREATOR = new ache(2);
    public final Status a;
    public final long b;

    public RequestAppIndexingUpdateIndexCall$Response(Status status, long j) {
        this.a = status;
        this.b = j;
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.n(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
