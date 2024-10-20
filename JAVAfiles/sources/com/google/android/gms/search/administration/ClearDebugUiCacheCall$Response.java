package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.acgc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ClearDebugUiCacheCall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<ClearDebugUiCacheCall$Response> CREATOR = new acgc(13);
    public final Status a;

    public ClearDebugUiCacheCall$Response(Status status) {
        this.a = status;
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, status, i, false);
        abhi.g(parcel, e);
    }
}
