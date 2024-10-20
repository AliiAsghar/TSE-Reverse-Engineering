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
public class RequestIndexingCall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<RequestIndexingCall$Response> CREATOR = new ache(14);
    public Status a;
    public boolean b;

    public RequestIndexingCall$Response() {
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.h(parcel, 2, this.b);
        abhi.g(parcel, e);
    }

    public RequestIndexingCall$Response(Status status, boolean z) {
        this.a = status;
        this.b = z;
    }
}
