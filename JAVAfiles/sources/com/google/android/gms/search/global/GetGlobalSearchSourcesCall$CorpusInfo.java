package com.google.android.gms.search.global;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetGlobalSearchSourcesCall$CorpusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGlobalSearchSourcesCall$CorpusInfo> CREATOR = new ache(17);
    public String a;
    public Feature[] b;
    public boolean c;
    public Bundle d;

    public GetGlobalSearchSourcesCall$CorpusInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.H(parcel, 2, this.b, i);
        abhi.h(parcel, 3, this.c);
        abhi.t(parcel, 4, this.d);
        abhi.g(parcel, e);
    }

    public GetGlobalSearchSourcesCall$CorpusInfo(String str, Feature[] featureArr, boolean z, Bundle bundle) {
        this.a = str;
        this.b = featureArr;
        this.c = z;
        this.d = bundle;
    }
}
