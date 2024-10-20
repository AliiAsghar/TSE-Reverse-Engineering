package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.achi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetPhraseAffinityCall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<GetPhraseAffinityCall$Response> CREATOR = new achi(18);
    public Status a;
    public PhraseAffinityResponse b;
    public Bundle c;

    public GetPhraseAffinityCall$Response() {
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

    public GetPhraseAffinityCall$Response(Status status, PhraseAffinityResponse phraseAffinityResponse, Bundle bundle) {
        this.a = status;
        this.b = phraseAffinityResponse;
        this.c = bundle;
    }
}
