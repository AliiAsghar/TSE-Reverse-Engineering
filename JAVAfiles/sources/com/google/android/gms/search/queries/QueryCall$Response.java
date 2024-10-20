package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.achm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class QueryCall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<QueryCall$Response> CREATOR = new achm(0);
    public Status a;
    public SearchResults b;
    public Bundle c;

    public QueryCall$Response() {
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
        abhi.t(parcel, 3, this.c);
        abhi.g(parcel, e);
    }

    public QueryCall$Response(Status status, SearchResults searchResults, Bundle bundle) {
        this.a = status;
        this.b = searchResults;
        this.c = bundle;
    }
}
