package com.google.android.gms.search.ime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.achi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetCorpusHandlesRegisteredForIMECall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<GetCorpusHandlesRegisteredForIMECall$Response> CREATOR = new achi(7);
    public Status a;
    public String[] b;

    public GetCorpusHandlesRegisteredForIMECall$Response() {
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.F(parcel, 2, this.b);
        abhi.g(parcel, e);
    }

    public GetCorpusHandlesRegisteredForIMECall$Response(Status status, String[] strArr) {
        this.a = status;
        this.b = strArr;
    }
}
