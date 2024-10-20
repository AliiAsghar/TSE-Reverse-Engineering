package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjj;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class QuerySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QuerySpecification> CREATOR = new abjj(0);
    public final boolean a;
    public final List b;
    public final List c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final int[] j;
    public final byte[] k;
    public final STSortSpec l;
    public final String m;
    public final CacheSpec n;

    public QuerySpecification(boolean z, List list, List list2, boolean z2, int i, int i2, boolean z3, int i3, boolean z4, int[] iArr, byte[] bArr, STSortSpec sTSortSpec, String str, CacheSpec cacheSpec) {
        this.a = z;
        this.b = list;
        this.c = list2;
        this.d = z2;
        this.e = i;
        this.f = i2;
        this.g = z3;
        this.h = i3;
        this.i = z4;
        this.j = iArr;
        this.k = bArr;
        this.l = sTSortSpec;
        this.m = str;
        this.n = cacheSpec;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, this.a);
        abhi.G(parcel, 2, this.b);
        abhi.r(parcel, 3, this.c, false);
        abhi.h(parcel, 4, this.d);
        abhi.m(parcel, 5, this.e);
        abhi.m(parcel, 6, this.f);
        abhi.h(parcel, 7, this.g);
        abhi.m(parcel, 8, this.h);
        abhi.h(parcel, 9, this.i);
        abhi.y(parcel, 10, this.j);
        abhi.j(parcel, 11, this.k, false);
        abhi.o(parcel, 12, this.l, i, false);
        abhi.q(parcel, 13, this.m, false);
        abhi.o(parcel, 15, this.n, i, false);
        abhi.g(parcel, e);
    }
}
