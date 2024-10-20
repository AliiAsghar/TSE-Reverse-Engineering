package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SuggestionResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.achm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class QuerySuggestCall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<QuerySuggestCall$Response> CREATOR = new achm(3);
    public Status a;
    public SuggestionResults b;
    public Bundle c;

    public QuerySuggestCall$Response() {
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

    public QuerySuggestCall$Response(Status status, SuggestionResults suggestionResults, Bundle bundle) {
        this.a = status;
        this.b = suggestionResults;
        this.c = bundle;
    }
}
