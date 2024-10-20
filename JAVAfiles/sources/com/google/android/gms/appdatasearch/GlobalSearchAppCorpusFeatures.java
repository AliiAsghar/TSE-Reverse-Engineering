package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GlobalSearchAppCorpusFeatures extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalSearchAppCorpusFeatures> CREATOR = new abjg(12);
    final String a;
    final Feature[] b;

    public GlobalSearchAppCorpusFeatures(String str, Feature[] featureArr) {
        this.a = str;
        this.b = featureArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.H(parcel, 2, this.b, i);
        abhi.g(parcel, e);
    }
}
