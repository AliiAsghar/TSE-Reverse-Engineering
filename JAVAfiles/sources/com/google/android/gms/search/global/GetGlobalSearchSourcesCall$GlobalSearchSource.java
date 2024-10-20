package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetGlobalSearchSourcesCall$GlobalSearchSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGlobalSearchSourcesCall$GlobalSearchSource> CREATOR = new ache(18);
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public String f;
    public String g;
    public String h;
    public GetGlobalSearchSourcesCall$CorpusInfo[] i;
    public boolean j;

    public GetGlobalSearchSourcesCall$GlobalSearchSource() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.m(parcel, 2, this.c);
        abhi.m(parcel, 3, this.d);
        abhi.m(parcel, 4, this.e);
        abhi.q(parcel, 5, this.f, false);
        abhi.q(parcel, 6, this.g, false);
        abhi.q(parcel, 7, this.h, false);
        abhi.H(parcel, 8, this.i, i);
        abhi.h(parcel, 9, this.j);
        abhi.q(parcel, 10, this.b, false);
        abhi.g(parcel, e);
    }

    public GetGlobalSearchSourcesCall$GlobalSearchSource(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, GetGlobalSearchSourcesCall$CorpusInfo[] getGlobalSearchSourcesCall$CorpusInfoArr, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = getGlobalSearchSourcesCall$CorpusInfoArr;
        this.j = z;
    }
}
