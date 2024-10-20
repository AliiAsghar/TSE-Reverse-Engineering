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
public class GetAppIndexingPackageDetailsCall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<GetAppIndexingPackageDetailsCall$Response> CREATOR = new acgc(16);
    public final Status a;
    public final CorpusConfigParcelable[] b;
    public final long c;
    public final AppIndexingErrorInfo[] d;
    public final AppIndexingUserActionInfo[] e;
    public final boolean f;
    public final boolean g;

    public GetAppIndexingPackageDetailsCall$Response(Status status, CorpusConfigParcelable[] corpusConfigParcelableArr, long j, AppIndexingErrorInfo[] appIndexingErrorInfoArr, AppIndexingUserActionInfo[] appIndexingUserActionInfoArr, boolean z, boolean z2) {
        this.a = status;
        this.b = corpusConfigParcelableArr;
        this.c = j;
        this.d = appIndexingErrorInfoArr;
        this.e = appIndexingUserActionInfoArr;
        this.f = z;
        this.g = z2;
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
        abhi.H(parcel, 2, this.b, i);
        abhi.n(parcel, 3, this.c);
        abhi.H(parcel, 4, this.d, i);
        abhi.H(parcel, 5, this.e, i);
        abhi.h(parcel, 6, this.f);
        abhi.h(parcel, 7, this.g);
        abhi.g(parcel, e);
    }
}
