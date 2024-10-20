package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PhraseAffinityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PhraseAffinityResponse> CREATOR = new abjg(20);
    final String a;
    final CorpusId[] b;
    final int[] c;

    public PhraseAffinityResponse(String str, CorpusId[] corpusIdArr, int[] iArr) {
        this.a = str;
        this.b = corpusIdArr;
        this.c = iArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.H(parcel, 2, this.b, i);
        abhi.y(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
