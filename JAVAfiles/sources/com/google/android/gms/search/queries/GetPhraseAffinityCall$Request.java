package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetPhraseAffinityCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetPhraseAffinityCall$Request> CREATOR = new achi(17);
    public String[] a;
    public PhraseAffinityCorpusSpec[] b;
    public Bundle c;

    public GetPhraseAffinityCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.F(parcel, 1, this.a);
        abhi.H(parcel, 2, this.b, i);
        abhi.t(parcel, 3, this.c);
        abhi.g(parcel, e);
    }

    public GetPhraseAffinityCall$Request(String[] strArr, PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr, Bundle bundle) {
        this.a = strArr;
        this.b = phraseAffinityCorpusSpecArr;
        this.c = bundle;
    }
}
