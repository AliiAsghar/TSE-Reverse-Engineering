package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhd implements fgt, fgs {
    public final fgt[] a;
    private final IdentityHashMap b;
    private final ArrayList c = new ArrayList();
    private final HashMap d = new HashMap();
    private fgs e;
    private fid f;
    private fgt[] g;
    private fhx h;

    public fhd(long[] jArr, fgt... fgtVarArr) {
        this.a = fgtVarArr;
        int i = alog.d;
        alog alogVar = alsx.a;
        this.h = new fgg(alogVar, alogVar);
        this.b = new IdentityHashMap();
        this.g = new fgt[0];
        for (int i2 = 0; i2 < fgtVarArr.length; i2++) {
            long j = jArr[i2];
            if (j != 0) {
                this.a[i2] = new fib(fgtVarArr[i2], j);
            }
        }
    }

    @Override // defpackage.fgt
    public final long a(long j, fbi fbiVar) {
        fgt fgtVar;
        fgt[] fgtVarArr = this.g;
        if (fgtVarArr.length > 0) {
            fgtVar = fgtVarArr[0];
        } else {
            fgtVar = this.a[0];
        }
        return fgtVar.a(j, fbiVar);
    }

    @Override // defpackage.fhw
    public final /* bridge */ /* synthetic */ void b(fhx fhxVar) {
        fgs fgsVar = this.e;
        dzg.g(fgsVar);
        fgsVar.b(this);
    }

    @Override // defpackage.fgs
    public final void c(fgt fgtVar) {
        this.c.remove(fgtVar);
        if (!this.c.isEmpty()) {
            return;
        }
        int i = 0;
        for (fgt fgtVar2 : this.a) {
            i += fgtVar2.i().b;
        }
        esa[] esaVarArr = new esa[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            fgt[] fgtVarArr = this.a;
            if (i2 < fgtVarArr.length) {
                fid i4 = fgtVarArr[i2].i();
                int i5 = i4.b;
                int i6 = 0;
                while (i6 < i5) {
                    esa b = i4.b(i6);
                    eqn[] eqnVarArr = new eqn[b.a];
                    for (int i7 = 0; i7 < b.a; i7++) {
                        eqn a = b.a(i7);
                        eqm eqmVar = new eqm(a);
                        String str = a.a;
                        if (str == null) {
                            str = "";
                        }
                        eqmVar.a = i2 + ":" + str;
                        eqnVarArr[i7] = new eqn(eqmVar);
                    }
                    esa esaVar = new esa(i2 + ":" + b.b, eqnVarArr);
                    this.d.put(esaVar, b);
                    esaVarArr[i3] = esaVar;
                    i6++;
                    i3++;
                }
                i2++;
            } else {
                this.f = new fid(esaVarArr);
                fgs fgsVar = this.e;
                dzg.g(fgsVar);
                fgsVar.c(this);
                return;
            }
        }
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final long d() {
        return this.h.d();
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final long e() {
        return this.h.e();
    }

    @Override // defpackage.fgt
    public final long f() {
        long j = -9223372036854775807L;
        for (fgt fgtVar : this.g) {
            long f = fgtVar.f();
            if (f != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (fgt fgtVar2 : this.g) {
                        if (fgtVar2 == fgtVar) {
                            break;
                        }
                        if (fgtVar2.g(f) != f) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = f;
                } else if (f != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && fgtVar.g(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // defpackage.fgt
    public final long g(long j) {
        long g = this.g[0].g(j);
        int i = 1;
        while (true) {
            fgt[] fgtVarArr = this.g;
            if (i < fgtVarArr.length) {
                if (fgtVarArr[i].g(g) == g) {
                    i++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return g;
            }
        }
    }

    @Override // defpackage.fgt
    public final long h(fje[] fjeVarArr, boolean[] zArr, fhv[] fhvVarArr, boolean[] zArr2, long j) {
        int length;
        fhv fhvVar;
        int intValue;
        int length2 = fjeVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = fjeVarArr.length;
            Integer num = null;
            if (i2 >= length) {
                break;
            }
            fhv fhvVar2 = fhvVarArr[i2];
            if (fhvVar2 != null) {
                num = (Integer) this.b.get(fhvVar2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i2] = intValue;
            fje fjeVar = fjeVarArr[i2];
            if (fjeVar != null) {
                String str = fjeVar.g().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.b.clear();
        fhv[] fhvVarArr2 = new fhv[length];
        fhv[] fhvVarArr3 = new fhv[length];
        fje[] fjeVarArr2 = new fje[length];
        ArrayList arrayList = new ArrayList(this.a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.a.length) {
            for (int i4 = i; i4 < fjeVarArr.length; i4++) {
                if (iArr[i4] == i3) {
                    fhvVar = fhvVarArr[i4];
                } else {
                    fhvVar = null;
                }
                fhvVarArr3[i4] = fhvVar;
                if (iArr2[i4] == i3) {
                    fje fjeVar2 = fjeVarArr[i4];
                    dzg.g(fjeVar2);
                    esa esaVar = (esa) this.d.get(fjeVar2.g());
                    dzg.g(esaVar);
                    fjeVarArr2[i4] = new fhc(fjeVar2, esaVar);
                } else {
                    fjeVarArr2[i4] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            fje[] fjeVarArr3 = fjeVarArr2;
            fhv[] fhvVarArr4 = fhvVarArr3;
            long h = this.a[i3].h(fjeVarArr2, zArr, fhvVarArr3, zArr2, j2);
            if (i3 == 0) {
                j2 = h;
            } else if (h != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < fjeVarArr.length; i5++) {
                boolean z2 = true;
                if (iArr2[i5] == i3) {
                    fhv fhvVar3 = fhvVarArr4[i5];
                    dzg.g(fhvVar3);
                    fhvVarArr2[i5] = fhvVarArr4[i5];
                    this.b.put(fhvVar3, Integer.valueOf(i3));
                    z = true;
                } else if (iArr[i5] == i3) {
                    if (fhvVarArr4[i5] != null) {
                        z2 = false;
                    }
                    dzg.d(z2);
                }
            }
            if (z) {
                arrayList2.add(this.a[i3]);
            }
            i3++;
            arrayList = arrayList2;
            fjeVarArr2 = fjeVarArr3;
            fhvVarArr3 = fhvVarArr4;
            i = 0;
        }
        int i6 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(fhvVarArr2, i6, fhvVarArr, i6, length);
        this.g = (fgt[]) arrayList3.toArray(new fgt[i6]);
        this.h = new fgg(arrayList3, alzz.as(arrayList3, new ezr(3)));
        return j2;
    }

    @Override // defpackage.fgt
    public final fid i() {
        fid fidVar = this.f;
        dzg.g(fidVar);
        return fidVar;
    }

    @Override // defpackage.fgt
    public final void j() {
        int i = 0;
        while (true) {
            fgt[] fgtVarArr = this.a;
            if (i < fgtVarArr.length) {
                fgtVarArr[i].j();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.fgt
    public final void k(fgs fgsVar, long j) {
        this.e = fgsVar;
        Collections.addAll(this.c, this.a);
        int i = 0;
        while (true) {
            fgt[] fgtVarArr = this.a;
            if (i < fgtVarArr.length) {
                fgtVarArr[i].k(this, j);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final void l(long j) {
        this.h.l(j);
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final boolean n(fam famVar) {
        if (!this.c.isEmpty()) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                ((fgt) this.c.get(i)).n(famVar);
            }
            return false;
        }
        return this.h.n(famVar);
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final boolean o() {
        return this.h.o();
    }

    @Override // defpackage.fgt
    public final void q(long j) {
        for (fgt fgtVar : this.g) {
            fgtVar.q(j);
        }
    }
}
