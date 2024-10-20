package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.ache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DeleteUsageReportCall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<DeleteUsageReportCall$Response> CREATOR = new ache(6);
    public Status a;

    public DeleteUsageReportCall$Response() {
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.g(parcel, e);
    }

    public DeleteUsageReportCall$Response(Status status) {
        this.a = status;
    }
}
