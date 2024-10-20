package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CorpusScoringInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CorpusScoringInfo> CREATOR = new abjg(3);
    public final CorpusId a;
    public final int b;
    public final int c;

    public CorpusScoringInfo(CorpusId corpusId, int i, int i2) {
        this.a = corpusId;
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.m(parcel, 2, this.b);
        abhi.m(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
