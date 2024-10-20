package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GlobalQueryCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalQueryCall$Request> CREATOR = new achi(19);
    public String a;
    public int b;
    public int c;
    public GlobalSearchQuerySpecification d;
    public Bundle e;

    public GlobalQueryCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.m(parcel, 2, this.b);
        abhi.m(parcel, 3, this.c);
        abhi.o(parcel, 4, this.d, i, false);
        abhi.t(parcel, 5, this.e);
        abhi.g(parcel, e);
    }

    public GlobalQueryCall$Request(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification, Bundle bundle) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = globalSearchQuerySpecification;
        this.e = bundle;
    }
}
