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
public class GetAppIndexingPackagesCall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<GetAppIndexingPackagesCall$Response> CREATOR = new acgc(18);
    public final Status a;
    public final String[] b;
    public final String[] c;

    public GetAppIndexingPackagesCall$Response(Status status, String[] strArr, String[] strArr2) {
        this.a = status;
        this.b = strArr;
        this.c = strArr2;
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
        abhi.F(parcel, 2, this.b);
        abhi.F(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
