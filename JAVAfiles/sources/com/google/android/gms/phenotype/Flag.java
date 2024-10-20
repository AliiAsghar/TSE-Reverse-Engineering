package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acgc;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Flag extends AbstractSafeParcelable implements Comparable<Flag> {
    public static final Parcelable.Creator<Flag> CREATOR = new acgc(0);
    public final String a;
    final long b;
    final boolean c;
    final double d;
    final String e;
    final byte[] f;
    public final int g;
    public final int h;
    public final int i;

    public Flag(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    private static int g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i != i2) {
            return 1;
        }
        return 0;
    }

    public final double a() {
        if (this.g == 3) {
            return this.d;
        }
        throw new IllegalArgumentException("Not a double type");
    }

    public final long b() {
        if (this.g == 1) {
            return this.b;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    public final String c() {
        if (this.g == 4) {
            String str = this.e;
            abhg.m(str);
            return str;
        }
        throw new IllegalArgumentException("Not a String type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (r0 != false) goto L7;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ int compareTo(com.google.android.gms.phenotype.Flag r6) {
        /*
            r5 = this;
            com.google.android.gms.phenotype.Flag r6 = (com.google.android.gms.phenotype.Flag) r6
            java.lang.String r0 = r6.a
            java.lang.String r1 = r5.a
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto Le
            goto L9b
        Le:
            int r0 = r5.g
            int r1 = r6.g
            int r1 = g(r0, r1)
            if (r1 == 0) goto L1b
        L18:
            r0 = r1
            goto L9b
        L1b:
            r1 = 1
            if (r0 == r1) goto L93
            r2 = 2
            r3 = -1
            r4 = 0
            if (r0 == r2) goto L86
            r2 = 3
            if (r0 == r2) goto L7d
            r2 = 4
            if (r0 == r2) goto L6b
            r2 = 5
            if (r0 != r2) goto L5f
            byte[] r0 = r5.f
            byte[] r2 = r6.f
            if (r0 != r2) goto L33
            goto L8c
        L33:
            if (r0 != 0) goto L36
            goto L91
        L36:
            if (r2 != 0) goto L39
            goto L18
        L39:
            byte[] r0 = r5.f
            int r0 = r0.length
            byte[] r1 = r6.f
            int r1 = r1.length
            int r0 = java.lang.Math.min(r0, r1)
            if (r4 >= r0) goto L54
            byte[] r0 = r5.f
            r0 = r0[r4]
            byte[] r1 = r6.f
            r1 = r1[r4]
            int r0 = r0 - r1
            if (r0 == 0) goto L51
            goto L9b
        L51:
            int r4 = r4 + 1
            goto L39
        L54:
            byte[] r0 = r5.f
            int r0 = r0.length
            byte[] r6 = r6.f
            int r6 = r6.length
            int r0 = g(r0, r6)
            goto L9b
        L5f:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r1 = "Invalid enum value: "
            java.lang.String r0 = defpackage.a.bV(r0, r1)
            r6.<init>(r0)
            throw r6
        L6b:
            java.lang.String r0 = r5.e
            java.lang.String r6 = r6.e
            if (r0 != r6) goto L72
            goto L8c
        L72:
            if (r0 != 0) goto L75
            goto L91
        L75:
            if (r6 != 0) goto L78
            goto L18
        L78:
            int r0 = r0.compareTo(r6)
            goto L9b
        L7d:
            double r0 = r5.d
            double r2 = r6.d
            int r0 = java.lang.Double.compare(r0, r2)
            goto L9b
        L86:
            boolean r0 = r5.c
            boolean r6 = r6.c
            if (r0 != r6) goto L8e
        L8c:
            r0 = r4
            goto L9b
        L8e:
            if (r0 == 0) goto L91
            goto L18
        L91:
            r0 = r3
            goto L9b
        L93:
            long r0 = r5.b
            long r2 = r6.b
            int r0 = defpackage.d.x(r0, r2)
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.Flag.compareTo(java.lang.Object):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(StringBuilder sb) {
        sb.append("Flag(");
        sb.append(this.a);
        sb.append(", ");
        int i = this.g;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            sb.append("'");
                            byte[] bArr = this.f;
                            abhg.m(bArr);
                            sb.append(Base64.encodeToString(bArr, 3));
                            sb.append("'");
                        } else {
                            throw new AssertionError("Invalid type: " + this.a + ", " + i);
                        }
                    } else {
                        sb.append("'");
                        String str = this.e;
                        abhg.m(str);
                        sb.append(str);
                        sb.append("'");
                    }
                } else {
                    sb.append(this.d);
                }
            } else {
                sb.append(this.c);
            }
        } else {
            sb.append(this.b);
        }
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(")");
    }

    public final boolean e() {
        if (this.g == 2) {
            return this.c;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof Flag) {
            Flag flag = (Flag) obj;
            if (d.B(this.a, flag.a) && (i = this.g) == flag.g && this.h == flag.h && this.i == flag.i) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    return Arrays.equals(this.f, flag.f);
                                }
                                throw new AssertionError(a.bV(i, "Invalid enum value: "));
                            }
                            return d.B(this.e, flag.e);
                        }
                        if (this.d != flag.d) {
                            return false;
                        }
                        return true;
                    }
                    if (this.c != flag.c) {
                        return false;
                    }
                    return true;
                }
                if (this.b == flag.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final byte[] f() {
        if (this.g == 5) {
            byte[] bArr = this.f;
            abhg.m(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("Not a bytes type");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        d(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        if (!acgc.b(str)) {
            abhi.q(parcel, 2, str, false);
        }
        long j = this.b;
        if (j != 0) {
            abhi.n(parcel, 3, j);
        }
        if (this.c) {
            abhi.h(parcel, 4, true);
        }
        double d = this.d;
        if (d != 0.0d) {
            abhi.k(parcel, 5, d);
        }
        String str2 = this.e;
        if (!acgc.b(str2)) {
            abhi.q(parcel, 6, str2, false);
        }
        byte[] bArr = this.f;
        if (!acgc.b(bArr)) {
            abhi.j(parcel, 7, bArr, false);
        }
        int i2 = this.g;
        if (!acgc.a(i2)) {
            abhi.m(parcel, 8, i2);
        }
        int i3 = this.h;
        if (!acgc.a(i3)) {
            abhi.m(parcel, 9, i3);
        }
        int i4 = this.i;
        if (!acgc.a(i4)) {
            abhi.m(parcel, 10, i4);
        }
        abhi.g(parcel, e);
    }
}
