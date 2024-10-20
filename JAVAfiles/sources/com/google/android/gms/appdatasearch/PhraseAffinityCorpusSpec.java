package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PhraseAffinityCorpusSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PhraseAffinityCorpusSpec> CREATOR = new abjg(19);
    public final CorpusId a;
    final Bundle b;

    public PhraseAffinityCorpusSpec(CorpusId corpusId, Bundle bundle) {
        this.a = corpusId;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.t(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
