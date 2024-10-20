package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjj;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class PhraseAffinitySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PhraseAffinitySpecification> CREATOR = new abjj(1);
    final PhraseAffinityCorpusSpec[] a;

    public PhraseAffinitySpecification(PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr) {
        this.a = phraseAffinityCorpusSpecArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.H(parcel, 1, this.a, i);
        abhi.g(parcel, e);
    }
}
