package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acga;
import defpackage.acgc;
import defpackage.alzz;
import defpackage.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExperimentTokens extends AbstractSafeParcelable {
    public final String b;
    public final byte[] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final byte[][] g;
    public final int[] h;
    public final byte[][] i;
    public final int[] j;
    public final byte[][] k;
    public static final byte[][] a = new byte[0];
    public static final Parcelable.Creator<ExperimentTokens> CREATOR = new acgc(1);

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
        this.g = bArr5;
        this.h = iArr;
        this.i = bArr6;
        this.j = iArr2;
        this.k = bArr7;
    }

    public static byte[][] a(List list, acga acgaVar) {
        byte[][] a2;
        byte[][] a3;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            ExperimentTokens experimentTokens = (ExperimentTokens) it.next();
            if (experimentTokens != null && (a3 = acgaVar.a(experimentTokens)) != null) {
                i += a3.length;
            }
        }
        byte[][] bArr = new byte[i];
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            ExperimentTokens experimentTokens2 = (ExperimentTokens) it2.next();
            if (experimentTokens2 != null && (a2 = acgaVar.a(experimentTokens2)) != null) {
                for (byte[] bArr2 : a2) {
                    if (bArr2 != null) {
                        bArr[i2] = bArr2;
                        i2++;
                    }
                }
            }
        }
        return bArr;
    }

    private static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new GenericDimension(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private final Set c() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.i;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return e((byte[][]) arrayList.toArray(new byte[0]));
    }

    private static Set d(int[] iArr) {
        int length;
        if (iArr != null && (length = iArr.length) != 0) {
            HashSet L = alzz.L(length);
            for (int i : iArr) {
                L.add(Integer.valueOf(i));
            }
            return L;
        }
        return Collections.emptySet();
    }

    private static Set e(byte[][] bArr) {
        int length;
        if (bArr != null && (length = bArr.length) != 0) {
            HashSet L = alzz.L(length);
            for (byte[] bArr2 : bArr) {
                abhg.m(bArr2);
                L.add(Base64.encodeToString(bArr2, 3));
            }
            return L;
        }
        return Collections.emptySet();
    }

    private static void f(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            abhg.m(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (d.B(this.b, experimentTokens.b) && d.B(c(), experimentTokens.c()) && d.B(e(this.d), e(experimentTokens.d)) && d.B(e(this.e), e(experimentTokens.e)) && d.B(e(this.f), e(experimentTokens.f)) && d.B(e(this.g), e(experimentTokens.g)) && d.B(d(this.h), d(experimentTokens.h)) && d.B(b(this.j), b(experimentTokens.j)) && d.B(e(this.k), e(experimentTokens.k))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String bW;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.b;
        if (str == null) {
            bW = "null";
        } else {
            bW = a.bW(str, "'", "'");
        }
        sb.append(bW);
        byte[] bArr = this.c;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        f(sb, "GAIA=", this.d);
        sb.append(", ");
        f(sb, "PSEUDO=", this.e);
        sb.append(", ");
        f(sb, "ALWAYS=", this.f);
        sb.append(", ");
        f(sb, "OTHER=", this.g);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.h));
        sb.append(", ");
        f(sb, "directs=", this.i);
        sb.append(", genDims=");
        sb.append(Arrays.toString(b(this.j).toArray()));
        sb.append(", ");
        f(sb, "external=", this.k);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.j(parcel, 3, this.c, false);
        abhi.u(parcel, 4, this.d);
        abhi.u(parcel, 5, this.e);
        abhi.u(parcel, 6, this.f);
        abhi.u(parcel, 7, this.g);
        abhi.y(parcel, 8, this.h);
        abhi.u(parcel, 9, this.i);
        abhi.y(parcel, 10, this.j);
        abhi.u(parcel, 11, this.k);
        abhi.g(parcel, e);
    }
}
