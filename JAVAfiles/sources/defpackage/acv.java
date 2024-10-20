package defpackage;

import defpackage.aac;
import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acv<V extends zz> implements acq<V> {
    public final int a;
    private final tv b;
    private final tx c;
    private final aak d;
    private int[] e = acn.a;
    private float[] f;
    private zz g;
    private zz h;
    private zz i;
    private zz j;
    private float[] k;
    private float[] l;
    private aac m;

    public acv(tv tvVar, tx txVar, int i, aak aakVar) {
        this.b = tvVar;
        this.c = txVar;
        this.a = i;
        this.d = aakVar;
        float[] fArr = acn.b;
        this.f = fArr;
        this.k = fArr;
        this.l = fArr;
        this.m = acn.c;
    }

    private final float h(int i) {
        return i(j(i), i, false);
    }

    private final float i(int i, int i2, boolean z) {
        aak aakVar;
        float f;
        tv tvVar = this.b;
        if (i >= tvVar.b - 1) {
            f = i2;
        } else {
            int a = tvVar.a(i);
            int a2 = this.b.a(i + 1);
            if (i2 == a) {
                f = a;
            } else {
                int i3 = a2 - a;
                acu acuVar = (acu) this.c.a(a);
                if (acuVar == null || (aakVar = acuVar.b) == null) {
                    aakVar = this.d;
                }
                float f2 = i3;
                float a3 = aakVar.a((i2 - a) / f2);
                if (z) {
                    return a3;
                }
                f = (f2 * a3) + a;
            }
        }
        return f / 1000.0f;
    }

    private final int j(int i) {
        int i2;
        tv tvVar = this.b;
        int i3 = tvVar.b;
        if (i3 <= 0) {
            a.bJ("");
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = tvVar.a[i2];
                if (i6 < i) {
                    i5 = i2 + 1;
                } else {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        if (i2 < -1) {
            return -(i2 + 2);
        }
        return i2;
    }

    private final void k(zz zzVar, zz zzVar2, zz zzVar3) {
        boolean z;
        float[] fArr;
        aac aacVar = this.m;
        aac aacVar2 = acn.c;
        zz zzVar4 = this.g;
        if (aacVar != aacVar2) {
            z = true;
        } else {
            z = false;
        }
        if (zzVar4 == null) {
            this.g = zzVar.c();
            this.h = zzVar3.c();
            int i = this.b.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = this.b.a(i2) / 1000.0f;
            }
            this.f = fArr2;
            int i3 = this.b.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                z |= !a.bA(0, 0);
                iArr[i4] = 0;
            }
            this.e = iArr;
        }
        if (z) {
            if (this.m != acn.c && d.F(this.i, zzVar) && d.F(this.j, zzVar2)) {
                return;
            }
            this.i = zzVar;
            this.j = zzVar2;
            int b = (zzVar.b() & 1) + zzVar.b();
            this.k = new float[b];
            this.l = new float[b];
            int i5 = this.b.b;
            float[][] fArr3 = new float[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                tv tvVar = this.b;
                tx txVar = this.c;
                int a = tvVar.a(i6);
                acu acuVar = (acu) txVar.a(a);
                if (a == 0) {
                    if (acuVar == null) {
                        fArr = new float[b];
                        for (int i7 = 0; i7 < b; i7++) {
                            fArr[i7] = zzVar.a(i7);
                        }
                        fArr3[i6] = fArr;
                    } else {
                        a = 0;
                    }
                }
                if (a == this.a && acuVar == null) {
                    fArr = new float[b];
                    for (int i8 = 0; i8 < b; i8++) {
                        fArr[i8] = zzVar2.a(i8);
                    }
                } else {
                    acuVar.getClass();
                    fArr = new float[b];
                    for (int i9 = 0; i9 < b; i9++) {
                        fArr[i9] = acuVar.a.a(i9);
                    }
                }
                fArr3[i6] = fArr;
            }
            this.m = new aac(this.e, this.f, fArr3);
        }
    }

    @Override // defpackage.ack
    public final /* synthetic */ long a(zz zzVar, zz zzVar2, zz zzVar3) {
        return acp.a(this);
    }

    @Override // defpackage.ack
    public final /* synthetic */ zz b(zz zzVar, zz zzVar2, zz zzVar3) {
        return acj.a(this, zzVar, zzVar2, zzVar3);
    }

    @Override // defpackage.ack
    public final zz c(long j, zz zzVar, zz zzVar2, zz zzVar3) {
        zz zzVar4;
        zz zzVar5;
        zz zzVar6 = zzVar;
        zz zzVar7 = zzVar2;
        int a = (int) acn.a(this, j / 1000000);
        acu acuVar = (acu) this.c.a(a);
        if (acuVar == null) {
            if (a >= this.a) {
                return zzVar7;
            }
            if (a <= 0) {
                return zzVar6;
            }
            k(zzVar6, zzVar7, zzVar3);
            zz zzVar8 = this.g;
            zzVar8.getClass();
            int i = 0;
            if (this.m != acn.c) {
                float h = h(a);
                float[] fArr = this.k;
                aac.a[][] aVarArr = this.m.a;
                int length = aVarArr.length;
                float f = aVarArr[0][0].a;
                int i2 = length - 1;
                float f2 = aVarArr[i2][0].b;
                int length2 = fArr.length;
                if (h >= f && h <= f2) {
                    int i3 = 0;
                    boolean z = false;
                    while (i3 < length) {
                        int i4 = i;
                        int i5 = i4;
                        while (i4 < length2 - 1) {
                            aac.a aVar = aVarArr[i3][i5];
                            if (h <= aVar.b) {
                                int i6 = i4 + 1;
                                if (aVar.g) {
                                    fArr[i4] = aVar.c(h);
                                    fArr[i6] = aVar.d(h);
                                } else {
                                    aVar.e(h);
                                    fArr[i4] = aVar.h + (aVar.e * aVar.c);
                                    fArr[i6] = aVar.i + (aVar.f * aVar.d);
                                }
                                z = true;
                            }
                            i5++;
                            i4 += 2;
                        }
                        if (z) {
                            break;
                        }
                        i3++;
                        i = 0;
                    }
                } else {
                    int i7 = length2 - 1;
                    if (h > f2) {
                        f = f2;
                    }
                    if (h <= f2) {
                        i2 = 0;
                    }
                    float f3 = h - f;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < i7) {
                        int i10 = i8 + 1;
                        aac.a aVar2 = aVarArr[i2][i9];
                        if (aVar2.g) {
                            fArr[i8] = aVar2.c(f) + (aVar2.h * f3);
                            fArr[i10] = aVar2.d(f) + (aVar2.i * f3);
                        } else {
                            aVar2.e(f);
                            fArr[i8] = aVar2.h + (aVar2.e * aVar2.c) + (aVar2.a() * f3);
                            fArr[i10] = aVar2.i + (aVar2.f * aVar2.d) + (aVar2.b() * f3);
                        }
                        i8 += 2;
                        i9++;
                    }
                }
                int length3 = fArr.length;
                for (int i11 = 0; i11 < length3; i11++) {
                    zzVar8.e(i11, fArr[i11]);
                }
                return zzVar8;
            }
            int j2 = j(a);
            float i12 = i(j2, a, true);
            acu acuVar2 = (acu) this.c.a(this.b.a(j2));
            if (acuVar2 != null && (zzVar5 = acuVar2.a) != null) {
                zzVar6 = zzVar5;
            }
            acu acuVar3 = (acu) this.c.a(this.b.a(j2 + 1));
            if (acuVar3 != null && (zzVar4 = acuVar3.a) != null) {
                zzVar7 = zzVar4;
            }
            int b = zzVar8.b();
            for (int i13 = 0; i13 < b; i13++) {
                zzVar8.e(i13, (zzVar6.a(i13) * (1.0f - i12)) + (zzVar7.a(i13) * i12));
            }
            return zzVar8;
        }
        return acuVar.a;
    }

    @Override // defpackage.ack
    public final zz d(long j, zz zzVar, zz zzVar2, zz zzVar3) {
        long a = acn.a(this, j / 1000000);
        k(zzVar, zzVar2, zzVar3);
        zz zzVar4 = this.h;
        zzVar4.getClass();
        int i = 0;
        if (this.m != acn.c) {
            float h = h((int) a);
            float[] fArr = this.l;
            aac.a[][] aVarArr = this.m.a;
            float f = aVarArr[0][0].a;
            float f2 = aVarArr[aVarArr.length - 1][0].b;
            if (h < f) {
                h = f;
            }
            if (h <= f2) {
                f2 = h;
            }
            int length = fArr.length;
            boolean z = false;
            for (aac.a[] aVarArr2 : aVarArr) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < length - 1) {
                    aac.a aVar = aVarArr2[i3];
                    if (f2 <= aVar.b) {
                        int i4 = i2 + 1;
                        if (aVar.g) {
                            fArr[i2] = aVar.h;
                            fArr[i4] = aVar.i;
                        } else {
                            aVar.e(f2);
                            fArr[i2] = aVar.a();
                            fArr[i4] = aVar.b();
                        }
                        z = true;
                    }
                    i2 += 2;
                    i3++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                zzVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            zz b = acn.b(this, a - 1, zzVar, zzVar2, zzVar3);
            zz b2 = acn.b(this, a, zzVar, zzVar2, zzVar3);
            int b3 = b.b();
            while (i < b3) {
                zzVar4.e(i, (b.a(i) - b2.a(i)) * 1000.0f);
                i++;
            }
        }
        return zzVar4;
    }

    @Override // defpackage.ack
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.acq
    public final int f() {
        return 0;
    }

    @Override // defpackage.acq
    public final int g() {
        return this.a;
    }
}
