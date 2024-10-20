package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjh;
import defpackage.d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GlobalSearchQuerySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalSearchQuerySpecification> CREATOR = new abjh();
    final CorpusId[] a;
    public final int b;
    final CorpusScoringInfo[] c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final byte[] i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int[] m;
    public final byte[] n;
    public final STSortSpec o;
    public final String p;
    public final CacheSpec q;
    private final transient Map r;
    private final transient Map s;

    public GlobalSearchQuerySpecification(CorpusId[] corpusIdArr, int i, CorpusScoringInfo[] corpusScoringInfoArr, int i2, int i3, int i4, String str, boolean z, byte[] bArr, boolean z2, boolean z3, boolean z4, int[] iArr, byte[] bArr2, STSortSpec sTSortSpec, String str2, CacheSpec cacheSpec) {
        int length;
        this.a = corpusIdArr;
        this.b = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = str;
        this.h = z;
        this.i = bArr;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = iArr;
        this.n = bArr2;
        this.o = sTSortSpec;
        this.p = str2;
        this.q = cacheSpec;
        this.c = corpusScoringInfoArr;
        if (corpusIdArr != null && corpusIdArr.length != 0) {
            this.r = new HashMap();
            for (int i5 = 0; i5 < corpusIdArr.length; i5++) {
                Set set = (Set) this.r.get(corpusIdArr[i5].a);
                if (set == null) {
                    set = new HashSet();
                    this.r.put(corpusIdArr[i5].a, set);
                }
                String str3 = corpusIdArr[i5].b;
                if (str3 != null) {
                    set.add(str3);
                }
            }
        } else {
            this.r = null;
        }
        if (corpusScoringInfoArr != null && (length = corpusScoringInfoArr.length) != 0) {
            this.s = new HashMap(length);
            for (CorpusScoringInfo corpusScoringInfo : corpusScoringInfoArr) {
                this.s.put(corpusScoringInfo.a, corpusScoringInfo);
            }
            return;
        }
        this.s = null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GlobalSearchQuerySpecification) {
            GlobalSearchQuerySpecification globalSearchQuerySpecification = (GlobalSearchQuerySpecification) obj;
            if (d.B(Integer.valueOf(this.b), Integer.valueOf(globalSearchQuerySpecification.b)) && d.B(Integer.valueOf(this.d), Integer.valueOf(globalSearchQuerySpecification.d)) && d.B(Integer.valueOf(this.e), Integer.valueOf(globalSearchQuerySpecification.e)) && d.B(Integer.valueOf(this.f), Integer.valueOf(globalSearchQuerySpecification.f)) && d.B(this.g, globalSearchQuerySpecification.g) && d.B(Boolean.valueOf(this.h), Boolean.valueOf(globalSearchQuerySpecification.h)) && d.B(Boolean.valueOf(this.j), Boolean.valueOf(globalSearchQuerySpecification.j)) && d.B(Boolean.valueOf(this.k), Boolean.valueOf(globalSearchQuerySpecification.k)) && d.B(Boolean.valueOf(this.l), Boolean.valueOf(globalSearchQuerySpecification.l)) && d.B(this.s, globalSearchQuerySpecification.s) && d.B(this.o, globalSearchQuerySpecification.o) && d.B(this.p, globalSearchQuerySpecification.p) && Arrays.equals(this.a, globalSearchQuerySpecification.a) && Arrays.equals(this.i, globalSearchQuerySpecification.i) && Arrays.equals(this.c, globalSearchQuerySpecification.c) && Arrays.equals(this.m, globalSearchQuerySpecification.m) && Arrays.equals(this.n, globalSearchQuerySpecification.n) && d.B(this.q, globalSearchQuerySpecification.q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), this.s, this.o, this.p, Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.i)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.n)), this.q});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("mFilter: [");
        Map map = this.r;
        if (map != null) {
            for (String str : map.keySet()) {
                Iterator it = ((Set) this.r.get(str)).iterator();
                String str2 = "";
                while (it.hasNext()) {
                    str2 = str2 + ((String) it.next()) + ",";
                }
                sb.append("key:");
                sb.append(str);
                sb.append(", values:");
                sb.append(str2);
                sb.append("\n");
            }
        }
        sb.append("]\nmCorpusScoringInfoMap: [");
        Map map2 = this.s;
        if (map2 != null) {
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                sb.append(((CorpusId) it2.next()).toString().concat("\n"));
            }
        }
        sb.append("]\n");
        if (this.o != null) {
            sb.append("STSortSpec: ");
            sb.append(this.o.toString());
            sb.append("\n");
        }
        if (this.p != null) {
            sb.append("Origin: ");
            sb.append(this.p);
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.H(parcel, 1, this.a, i);
        abhi.m(parcel, 2, this.b);
        abhi.H(parcel, 3, this.c, i);
        abhi.m(parcel, 4, this.d);
        abhi.m(parcel, 5, this.e);
        abhi.m(parcel, 6, this.f);
        abhi.q(parcel, 7, this.g, false);
        abhi.h(parcel, 8, this.h);
        abhi.j(parcel, 9, this.i, false);
        abhi.h(parcel, 10, this.j);
        abhi.h(parcel, 11, this.k);
        abhi.h(parcel, 12, this.l);
        abhi.y(parcel, 13, this.m);
        abhi.j(parcel, 14, this.n, false);
        abhi.o(parcel, 15, this.o, i, false);
        abhi.q(parcel, 16, this.p, false);
        abhi.o(parcel, 18, this.q, i, false);
        abhi.g(parcel, e);
    }
}
