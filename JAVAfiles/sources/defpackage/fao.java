package defpackage;

import android.util.Pair;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fao {
    public final fgt a;
    public final Object b;
    public final fhv[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public fap g;
    public boolean h;
    public fao i;
    public fid j = fid.a;
    public long k;
    public agoe l;
    private final boolean[] m;
    private final fbf[] n;
    private final fji o;
    private final fax p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [fgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [fgx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [ffy] */
    public fao(fbf[] fbfVarArr, long j, fji fjiVar, fjl fjlVar, fax faxVar, fap fapVar, agoe agoeVar) {
        this.n = fbfVarArr;
        this.k = j;
        this.o = fjiVar;
        this.p = faxVar;
        this.b = fapVar.a.a;
        this.g = fapVar;
        this.l = agoeVar;
        int length = fbfVarArr.length;
        this.c = new fhv[length];
        this.m = new boolean[length];
        fgv fgvVar = fapVar.a;
        long j2 = fapVar.b;
        long j3 = fapVar.d;
        Object s = ezd.s(fgvVar.a);
        fgv a = fgvVar.a(ezd.r(fgvVar.a));
        fav favVar = (fav) faxVar.c.get(s);
        dzg.g(favVar);
        faxVar.f.add(favVar);
        kkc kkcVar = (kkc) faxVar.e.get(favVar);
        if (kkcVar != null) {
            kkcVar.a.f(kkcVar.b);
        }
        favVar.c.add(a);
        fgn w = favVar.a.w(a, fjlVar, j2);
        faxVar.b.put(w, favVar);
        faxVar.c();
        this.a = j3 != -9223372036854775807L ? new ffy(w, true, 0L, j3) : w;
    }

    private static /* synthetic */ void r(fao faoVar) {
        if (faoVar.m()) {
            int i = 0;
            while (true) {
                agoe agoeVar = faoVar.l;
                if (i < agoeVar.a) {
                    agoeVar.c(i);
                    fje fjeVar = ((fje[]) faoVar.l.d)[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final long a() {
        long j;
        if (!this.e) {
            return this.g.b;
        }
        if (this.f) {
            j = this.a.d();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.g.e;
        }
        return j;
    }

    public final long b() {
        if (!this.e) {
            return 0L;
        }
        return this.a.e();
    }

    public final long c() {
        return this.g.b + this.k;
    }

    public final long d(long j) {
        return j - this.k;
    }

    public final long e(long j) {
        return j + this.k;
    }

    public final void f(long j, float f, long j2) {
        boolean z;
        dzg.d(m());
        long d = d(j);
        fal falVar = new fal();
        falVar.a = d;
        boolean z2 = false;
        if (f <= brg.a && f != -3.4028235E38f) {
            z = false;
        } else {
            z = true;
        }
        d.s(z);
        falVar.b = f;
        if (j2 < 0) {
            if (j2 == -9223372036854775807L) {
                z2 = true;
                j2 = -9223372036854775807L;
            }
        } else {
            z2 = true;
        }
        fgt fgtVar = this.a;
        d.s(z2);
        falVar.c = j2;
        fgtVar.n(new fam(falVar));
    }

    public final void g(fgs fgsVar, long j) {
        this.d = true;
        this.a.k(fgsVar, j);
    }

    public final void h() {
        r(this);
        fgt fgtVar = this.a;
        try {
            boolean z = fgtVar instanceof ffy;
            fax faxVar = this.p;
            if (z) {
                faxVar.e(((ffy) fgtVar).a);
            } else {
                faxVar.e(fgtVar);
            }
        } catch (RuntimeException e) {
            eub.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void i(fao faoVar) {
        if (faoVar == this.i) {
            return;
        }
        r(this);
        this.i = faoVar;
        r(this);
    }

    public final void j() {
        fgt fgtVar = this.a;
        if (fgtVar instanceof ffy) {
            long j = this.g.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((ffy) fgtVar).m(0L, j);
        }
    }

    public final boolean k() {
        if (!this.e) {
            return false;
        }
        if (this.f && this.a.d() != Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean l() {
        if (!this.e) {
            return false;
        }
        if (!k() && a() - this.g.b < -9223372036854775807L) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        if (this.i == null) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.e = true;
        this.j = this.a.i();
        agoe q = q();
        fap fapVar = this.g;
        long j = fapVar.b;
        long j2 = fapVar.e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long p = p(q, j);
        long j3 = this.k;
        fap fapVar2 = this.g;
        this.k = j3 + (fapVar2.b - p);
        this.g = fapVar2.b(p);
    }

    public final long o(agoe agoeVar, long j, boolean z, boolean[] zArr) {
        boolean z2;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= agoeVar.a) {
                break;
            }
            boolean[] zArr2 = this.m;
            if (z || !agoeVar.d(this.l, i)) {
                z3 = false;
            }
            zArr2[i] = z3;
            i++;
        }
        int i2 = 0;
        while (true) {
            fbf[] fbfVarArr = this.n;
            if (i2 >= fbfVarArr.length) {
                break;
            }
            fbfVarArr[i2].eL();
            i2++;
        }
        r(this);
        this.l = agoeVar;
        r(this);
        long h = this.a.h((fje[]) agoeVar.d, this.m, this.c, zArr, j);
        int i3 = 0;
        while (true) {
            fbf[] fbfVarArr2 = this.n;
            if (i3 >= fbfVarArr2.length) {
                break;
            }
            fbfVarArr2[i3].eL();
            i3++;
        }
        this.f = false;
        int i4 = 0;
        while (true) {
            fhv[] fhvVarArr = this.c;
            if (i4 < fhvVarArr.length) {
                if (fhvVarArr[i4] != null) {
                    dzg.d(agoeVar.c(i4));
                    this.n[i4].eL();
                    this.f = true;
                } else {
                    if (((fje[]) agoeVar.d)[i4] == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    dzg.d(z2);
                }
                i4++;
            } else {
                return h;
            }
        }
    }

    public final long p(agoe agoeVar, long j) {
        return o(agoeVar, j, false, new boolean[this.n.length]);
    }

    public final agoe q() {
        int length;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        alog alogVar;
        int length2;
        int[] iArr;
        boolean z5;
        fid fidVar = this.j;
        fgv fgvVar = this.g.a;
        fbf[] fbfVarArr = this.n;
        boolean z6 = true;
        int length3 = fbfVarArr.length + 1;
        int[] iArr2 = new int[length3];
        esa[][] esaVarArr = new esa[length3];
        int[][][] iArr3 = new int[length3][];
        for (int i = 0; i < length3; i++) {
            int i2 = fidVar.b;
            esaVarArr[i] = new esa[i2];
            iArr3[i] = new int[i2];
        }
        int length4 = fbfVarArr.length;
        int[] iArr4 = new int[length4];
        for (int i3 = 0; i3 < length4; i3++) {
            iArr4[i3] = fbfVarArr[i3].d();
        }
        int i4 = 0;
        while (i4 < fidVar.b) {
            esa b = fidVar.b(i4);
            int i5 = b.c;
            int length5 = fbfVarArr.length;
            boolean z7 = z6;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                length2 = fbfVarArr.length;
                if (i6 >= length2) {
                    break;
                }
                fbf fbfVar = fbfVarArr[i6];
                fid fidVar2 = fidVar;
                int[] iArr5 = iArr4;
                int i8 = 0;
                for (int i9 = 0; i9 < b.a; i9++) {
                    i8 = Math.max(i8, dzn.h(fbfVar.V(b.a(i9))));
                }
                if (iArr2[i6] == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (i8 <= i7) {
                    if (i8 == i7 && i5 == 5 && !z7 && z5) {
                        i7 = i8;
                        length5 = i6;
                        z7 = true;
                    }
                } else {
                    i7 = i8;
                    z7 = z5;
                    length5 = i6;
                }
                i6++;
                fidVar = fidVar2;
                iArr4 = iArr5;
            }
            fid fidVar3 = fidVar;
            int[] iArr6 = iArr4;
            if (length5 == length2) {
                iArr = new int[b.a];
            } else {
                fbf fbfVar2 = fbfVarArr[length5];
                int[] iArr7 = new int[b.a];
                for (int i10 = 0; i10 < b.a; i10++) {
                    iArr7[i10] = fbfVar2.V(b.a(i10));
                }
                iArr = iArr7;
            }
            int i11 = iArr2[length5];
            esaVarArr[length5][i11] = b;
            iArr3[length5][i11] = iArr;
            iArr2[length5] = i11 + 1;
            i4++;
            fidVar = fidVar3;
            iArr4 = iArr6;
            z6 = true;
        }
        int[] iArr8 = iArr4;
        int length6 = fbfVarArr.length;
        fid[] fidVarArr = new fid[length6];
        String[] strArr = new String[length6];
        int[] iArr9 = new int[length6];
        int i12 = 0;
        while (true) {
            length = fbfVarArr.length;
            if (i12 >= length) {
                break;
            }
            int i13 = iArr2[i12];
            fidVarArr[i12] = new fid((esa[]) eul.ad(esaVarArr[i12], i13));
            iArr3[i12] = (int[][]) eul.ad(iArr3[i12], i13);
            strArr[i12] = fbfVarArr[i12].R();
            iArr9[i12] = fbfVarArr[i12].eL();
            i12++;
        }
        fji fjiVar = this.o;
        fjf fjfVar = new fjf(iArr9, fidVarArr, iArr8, iArr3, new fid((esa[]) eul.ad(esaVarArr[length], iArr2[length])));
        Pair k = fjiVar.k(fjfVar, iArr3, iArr8);
        fjg[] fjgVarArr = (fjg[]) k.second;
        List[] listArr = new List[fjgVarArr.length];
        for (int i14 = 0; i14 < fjgVarArr.length; i14++) {
            fjg fjgVar = fjgVarArr[i14];
            if (fjgVar != null) {
                alogVar = alog.r(fjgVar);
            } else {
                int i15 = alog.d;
                alogVar = alsx.a;
            }
            listArr[i14] = alogVar;
        }
        alob alobVar = new alob();
        for (int i16 = 0; i16 < fjfVar.a; i16++) {
            fid c = fjfVar.c(i16);
            List list = listArr[i16];
            int i17 = 0;
            while (i17 < c.b) {
                esa b2 = c.b(i17);
                int i18 = fjfVar.b[i16].b(i17).a;
                int[] iArr10 = new int[i18];
                int i19 = 0;
                for (int i20 = 0; i20 < i18; i20++) {
                    if (fjfVar.b(i16, i17, i20) == 4) {
                        iArr10[i19] = i20;
                        i19++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr10, i19);
                String str = null;
                int i21 = 16;
                List[] listArr2 = listArr;
                int i22 = 0;
                boolean z8 = false;
                int i23 = 0;
                while (i22 < copyOf.length) {
                    fid fidVar4 = c;
                    String str2 = fjfVar.b[i16].b(i17).a(copyOf[i22]).o;
                    int i24 = i23 + 1;
                    if (i23 == 0) {
                        str = str2;
                    } else {
                        z8 |= !Objects.equals(str, str2);
                    }
                    i21 = Math.min(i21, fjfVar.d[i16][i17][i22] & 24);
                    i22++;
                    i23 = i24;
                    c = fidVar4;
                }
                fid fidVar5 = c;
                if (z8) {
                    i21 = Math.min(i21, fjfVar.c[i16]);
                }
                if (i21 != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i25 = b2.a;
                int[] iArr11 = new int[i25];
                boolean[] zArr = new boolean[i25];
                for (int i26 = 0; i26 < b2.a; i26++) {
                    iArr11[i26] = fjfVar.b(i16, i17, i26);
                    int i27 = 0;
                    while (true) {
                        if (i27 < list.size()) {
                            fjg fjgVar2 = (fjg) list.get(i27);
                            if (fjgVar2.g().equals(b2) && fjgVar2.c(i26) != -1) {
                                z4 = true;
                                break;
                            }
                            i27++;
                        } else {
                            z4 = false;
                            break;
                        }
                    }
                    zArr[i26] = z4;
                }
                alobVar.h(new esf(b2, z3, iArr11, zArr));
                i17++;
                listArr = listArr2;
                c = fidVar5;
            }
        }
        fid fidVar6 = fjfVar.e;
        for (int i28 = 0; i28 < fidVar6.b; i28++) {
            esa b3 = fidVar6.b(i28);
            int[] iArr12 = new int[b3.a];
            Arrays.fill(iArr12, 0);
            alobVar.h(new esf(b3, false, iArr12, new boolean[b3.a]));
        }
        agoe agoeVar = new agoe((fbg[]) k.first, (fje[]) k.second, new esg(alobVar.g()), fjfVar);
        for (int i29 = 0; i29 < agoeVar.a; i29++) {
            if (agoeVar.c(i29)) {
                if (((fje[]) agoeVar.d)[i29] == null) {
                    this.n[i29].eL();
                    z2 = false;
                } else {
                    z2 = true;
                }
                dzg.d(z2);
            } else {
                if (((fje[]) agoeVar.d)[i29] == null) {
                    z = true;
                } else {
                    z = false;
                }
                dzg.d(z);
            }
        }
        for (fje fjeVar : (fje[]) agoeVar.d) {
        }
        return agoeVar;
    }
}
