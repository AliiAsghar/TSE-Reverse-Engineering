package com.google.android.gms.search.ime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.achi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetIMEUpdatesCall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<GetIMEUpdatesCall$Response> CREATOR = new achi(9);
    public Status a;
    public PIMEUpdateResponse b;

    public GetIMEUpdatesCall$Response() {
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.g(parcel, e);
    }

    public GetIMEUpdatesCall$Response(Status status, PIMEUpdateResponse pIMEUpdateResponse) {
        this.a = status;
        this.b = pIMEUpdateResponse;
    }
}
