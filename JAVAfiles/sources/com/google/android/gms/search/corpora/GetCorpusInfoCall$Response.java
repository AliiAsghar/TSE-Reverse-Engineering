package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.ache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetCorpusInfoCall$Response extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<GetCorpusInfoCall$Response> CREATOR = new ache(8);
    public Status a;
    public RegisterCorpusInfo b;

    public GetCorpusInfoCall$Response() {
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
        abhi.g(parcel, e);
    }

    public GetCorpusInfoCall$Response(Status status, RegisterCorpusInfo registerCorpusInfo) {
        this.a = status;
        this.b = registerCorpusInfo;
    }
}
