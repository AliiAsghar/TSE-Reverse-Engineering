package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class QuerySuggestCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QuerySuggestCall$Request> CREATOR = new achm(2);
    public String a;
    public String b;
    public String[] c;
    public int d;
    public SuggestSpecification e;
    public Bundle f;

    public QuerySuggestCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.F(parcel, 3, this.c);
        abhi.m(parcel, 4, this.d);
        abhi.o(parcel, 5, this.e, i, false);
        abhi.t(parcel, 6, this.f);
        abhi.g(parcel, e);
    }

    public QuerySuggestCall$Request(String str, String str2, String[] strArr, int i, SuggestSpecification suggestSpecification, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = i;
        this.e = suggestSpecification;
        this.f = bundle;
    }
}
