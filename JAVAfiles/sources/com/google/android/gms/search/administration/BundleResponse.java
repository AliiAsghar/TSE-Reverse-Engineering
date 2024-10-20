package com.google.android.gms.search.administration;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.acgc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BundleResponse extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<BundleResponse> CREATOR = new acgc(11);
    public Status a;
    public Bundle b;

    public BundleResponse() {
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.t(parcel, 2, this.b);
        abhi.g(parcel, e);
    }

    public BundleResponse(Status status, Bundle bundle) {
        this.a = status;
        this.b = bundle;
    }
}
