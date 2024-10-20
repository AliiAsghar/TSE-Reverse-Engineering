package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.achi;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AnnotateCall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<AnnotateCall$Response> CREATOR = new achi(13);
    public Status a;
    public List b;
    public Bundle c;

    public AnnotateCall$Response() {
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.r(parcel, 2, this.b, false);
        abhi.t(parcel, 3, this.c);
        abhi.g(parcel, e);
    }

    public AnnotateCall$Response(Status status, List list, Bundle bundle) {
        this.a = status;
        this.b = list;
        this.c = bundle;
    }
}
