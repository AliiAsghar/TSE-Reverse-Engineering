package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RegisterCorpusInfoCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterCorpusInfoCall$Request> CREATOR = new ache(11);
    public String a;
    public String b;
    public RegisterCorpusInfo c;

    public RegisterCorpusInfoCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.g(parcel, e);
    }

    public RegisterCorpusInfoCall$Request(String str, String str2, RegisterCorpusInfo registerCorpusInfo) {
        this.a = str;
        this.b = str2;
        this.c = registerCorpusInfo;
    }
}
