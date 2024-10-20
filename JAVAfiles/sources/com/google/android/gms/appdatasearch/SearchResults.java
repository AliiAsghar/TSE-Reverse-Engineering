package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjl;
import defpackage.abjm;
import defpackage.abjn;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SearchResults extends AbstractSafeParcelable implements Iterable<abjl> {
    public static final Parcelable.Creator<SearchResults> CREATOR = new abjn();
    final String a;
    public final int[] b;
    public final byte[] c;
    final Bundle[] d;
    public final Bundle[] e;
    public final Bundle[] f;
    public final int g;
    public final int[] h;
    public final String[] i;
    final byte[] j;
    final double[] k;
    final Bundle l;
    final int m;
    final long[] n;
    final long[] o;
    final Bundle[] p;
    final int[] q;
    final byte[] r;
    final boolean s;

    public SearchResults(String str, int[] iArr, byte[] bArr, Bundle[] bundleArr, Bundle[] bundleArr2, Bundle[] bundleArr3, int i, int[] iArr2, String[] strArr, byte[] bArr2, double[] dArr, Bundle bundle, int i2, long[] jArr, long[] jArr2, Bundle[] bundleArr4, int[] iArr3, byte[] bArr3, boolean z) {
        this.a = str;
        this.b = iArr;
        this.c = bArr;
        this.d = bundleArr;
        this.e = bundleArr2;
        this.f = bundleArr3;
        this.g = i;
        this.h = iArr2;
        this.i = strArr;
        this.j = bArr2;
        this.k = dArr;
        this.l = bundle;
        this.m = i2;
        this.n = jArr;
        this.o = jArr2;
        this.p = bundleArr4;
        this.q = iArr3;
        this.r = bArr3;
        this.s = z;
    }

    public final boolean a() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<abjl> iterator() {
        return new abjm(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.y(parcel, 2, this.b);
        abhi.j(parcel, 3, this.c, false);
        abhi.H(parcel, 4, this.d, i);
        abhi.H(parcel, 5, this.e, i);
        abhi.H(parcel, 6, this.f, i);
        abhi.m(parcel, 7, this.g);
        abhi.y(parcel, 8, this.h);
        abhi.F(parcel, 9, this.i);
        abhi.j(parcel, 10, this.j, false);
        double[] dArr = this.k;
        if (dArr != null) {
            int f = abhi.f(parcel, 11);
            parcel.writeDoubleArray(dArr);
            abhi.g(parcel, f);
        }
        abhi.t(parcel, 12, this.l);
        abhi.m(parcel, 13, this.m);
        abhi.B(parcel, 14, this.n);
        abhi.B(parcel, 15, this.o);
        abhi.H(parcel, 16, this.p, i);
        abhi.y(parcel, 17, this.q);
        abhi.j(parcel, 18, this.r, false);
        abhi.h(parcel, 19, this.s);
        abhi.g(parcel, e);
    }
}
