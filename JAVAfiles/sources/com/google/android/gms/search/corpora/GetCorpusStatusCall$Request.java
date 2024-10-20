package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetCorpusStatusCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCorpusStatusCall$Request> CREATOR = new ache(9);
    public String a;
    public String b;

    public GetCorpusStatusCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.g(parcel, e);
    }

    public GetCorpusStatusCall$Request(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
