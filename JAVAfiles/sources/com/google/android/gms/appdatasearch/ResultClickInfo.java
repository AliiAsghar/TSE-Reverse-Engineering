package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ResultClickInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResultClickInfo> CREATOR = new abjj(7);
    final String a;
    final DocumentId[] b;
    final int c;

    public ResultClickInfo(String str, DocumentId[] documentIdArr, int i) {
        this.a = str;
        this.b = documentIdArr;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.H(parcel, 2, this.b, i);
        abhi.m(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
