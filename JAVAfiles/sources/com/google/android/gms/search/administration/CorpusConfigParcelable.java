package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acgc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CorpusConfigParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CorpusConfigParcelable> CREATOR = new acgc(14);
    public final String a;
    public final String b;
    public final String c;

    public CorpusConfigParcelable(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.g(parcel, e);
    }
}
