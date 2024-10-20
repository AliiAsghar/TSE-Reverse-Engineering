package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dia {
    public final dic a;
    public final boolean b;
    public final float c;
    public final float d;
    public final int e;
    public final List f;
    public final List g;
    private final int h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dia$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<dif, arnb> {
        final /* synthetic */ long a;
        final /* synthetic */ float[] b;
        final /* synthetic */ arrz c;
        final /* synthetic */ arry d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, float[] fArr, arrz arrzVar, arry arryVar) {
            super(1);
            this.a = j;
            this.b = fArr;
            this.c = arrzVar;
            this.d = arryVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            int d;
            int c;
            float c2;
            float d2;
            dif difVar = (dif) obj;
            int i = difVar.b;
            long j = this.a;
            if (i > djc.d(j)) {
                d = difVar.b;
            } else {
                d = djc.d(j);
            }
            if (difVar.c < djc.c(j)) {
                c = difVar.c;
            } else {
                c = djc.c(j);
            }
            arrz arrzVar = this.c;
            long a = djd.a(difVar.e(d), difVar.e(c));
            die dieVar = difVar.a;
            int i2 = arrzVar.a;
            int d3 = djc.d(a);
            int c3 = djc.c(a);
            djx djxVar = ((dhu) dieVar).b;
            int length = djxVar.q().length();
            if (d3 < 0) {
                doz.b("startOffset must be > 0");
            }
            if (d3 >= length) {
                doz.b("startOffset must be less than text length");
            }
            if (c3 <= d3) {
                doz.b("endOffset must be greater than startOffset");
            }
            if (c3 > length) {
                doz.b("endOffset must be smaller or equal to text length");
            }
            float[] fArr = this.b;
            if (fArr.length - i2 < (c3 - d3) * 4) {
                doz.b("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
            }
            int k = djxVar.k(d3);
            int k2 = djxVar.k(c3 - 1);
            djl djlVar = new djl(djxVar);
            if (k <= k2) {
                while (true) {
                    int m = djxVar.m(k);
                    int j2 = djxVar.j(k);
                    int max = Math.max(d3, m);
                    int min = Math.min(c3, j2);
                    float d4 = djxVar.d(k);
                    float c4 = djxVar.c(k);
                    int i3 = i2;
                    int i4 = d3;
                    boolean z = true;
                    if (djxVar.n(k) != 1) {
                        z = false;
                    }
                    i2 = i3;
                    while (max < min) {
                        int i5 = c3;
                        int i6 = max + 1;
                        boolean r = djxVar.r(max);
                        if (z && !r) {
                            c2 = djlVar.a(max);
                            d2 = djlVar.b(i6);
                        } else if (z) {
                            d2 = djlVar.c(max);
                            c2 = djlVar.d(i6);
                        } else if (r) {
                            d2 = djlVar.a(max);
                            c2 = djlVar.b(i6);
                        } else {
                            c2 = djlVar.c(max);
                            d2 = djlVar.d(i6);
                        }
                        fArr[i2] = c2;
                        fArr[i2 + 1] = d4;
                        fArr[i2 + 2] = d2;
                        fArr[i2 + 3] = c4;
                        i2 += 4;
                        max = i6;
                        c3 = i5;
                    }
                    int i7 = c3;
                    if (k == k2) {
                        break;
                    }
                    k++;
                    c3 = i7;
                    d3 = i4;
                }
            }
            int b = arrzVar.a + (djc.b(a) * 4);
            int i8 = arrzVar.a;
            while (true) {
                arry arryVar = this.d;
                if (i8 < b) {
                    int i9 = i8 + 1;
                    float f = fArr[i9];
                    float f2 = arryVar.a;
                    fArr[i9] = f + f2;
                    int i10 = i8 + 3;
                    fArr[i10] = fArr[i10] + f2;
                    i8 += 4;
                } else {
                    arrzVar.a = b;
                    arryVar.a += difVar.a.b();
                    return arnb.a;
                }
            }
        }
    }

    public dia(dic dicVar, long j, int i, int i2) {
        boolean z;
        cjp cjpVar;
        int a;
        this.a = dicVar;
        this.h = i;
        if (dqs.d(j) != 0 || dqs.c(j) != 0) {
            doz.b("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List list = dicVar.d;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        int i5 = 0;
        while (i5 < size) {
            dig digVar = (dig) list.get(i5);
            dih dihVar = digVar.a;
            int b = dqs.b(j);
            if (dqs.g(j)) {
                a = arrn.r(dqs.a(j) - dii.a(f), i3);
            } else {
                a = dqs.a(j);
            }
            dhu dhuVar = new dhu((dpg) dihVar, this.h - i4, i2, dqt.l(b, a, 5));
            float b2 = f + dhuVar.b();
            int g = i4 + dhuVar.g();
            arrayList.add(new dif(dhuVar, digVar.b, digVar.c, i4, g, f, b2));
            z = true;
            if (!dhuVar.k() && (g != this.h || i5 == aqjn.z(this.a.d))) {
                i5++;
                f = b2;
                i4 = g;
                i3 = 0;
            } else {
                f = b2;
                i4 = g;
                break;
            }
        }
        z = false;
        this.d = f;
        this.e = i4;
        this.b = z;
        this.g = arrayList;
        this.c = dqs.b(j);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            dif difVar = (dif) arrayList.get(i6);
            List list2 = ((dhu) difVar.a).d;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size3 = list2.size();
            for (int i7 = 0; i7 < size3; i7++) {
                cjp cjpVar2 = (cjp) list2.get(i7);
                if (cjpVar2 != null) {
                    cjpVar = difVar.h(cjpVar2);
                } else {
                    cjpVar = null;
                }
                arrayList3.add(cjpVar);
            }
            aqjn.S(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.a.b.size()) {
            int size4 = this.a.b.size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i8 = 0; i8 < size4; i8++) {
                arrayList4.add(null);
            }
            arrayList2 = aqjn.aq(arrayList2, arrayList4);
        }
        this.f = arrayList2;
    }

    public static /* synthetic */ void k(dia diaVar, ckr ckrVar, long j, cma cmaVar, dqj dqjVar, cnz cnzVar) {
        ckrVar.l();
        List list = diaVar.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dif difVar = (dif) list.get(i);
            difVar.a.m(ckrVar, j, cmaVar, dqjVar, cnzVar);
            ckrVar.o(brg.a, difVar.a.b());
        }
        ckrVar.j();
    }

    public static /* synthetic */ void l(dia diaVar, ckr ckrVar, cko ckoVar, float f, cma cmaVar, dqj dqjVar, cnz cnzVar) {
        ckrVar.l();
        if (diaVar.g.size() <= 1) {
            List list = diaVar.g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                dif difVar = (dif) list.get(i);
                difVar.a.n(ckrVar, ckoVar, f, cmaVar, dqjVar, cnzVar);
                ckrVar.o(brg.a, difVar.a.b());
            }
        } else {
            List list2 = diaVar.g;
            int size2 = list2.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i2 = 0; i2 < size2; i2++) {
                dif difVar2 = (dif) list2.get(i2);
                f3 += difVar2.a.b();
                f2 = Math.max(f2, difVar2.a.f());
            }
            Shader b = ((clz) ckoVar).b((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            Matrix matrix = new Matrix();
            b.getLocalMatrix(matrix);
            List list3 = diaVar.g;
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                dif difVar3 = (dif) list3.get(i3);
                difVar3.a.n(ckrVar, new ckp(b), f, cmaVar, dqjVar, cnzVar);
                ckrVar.o(brg.a, difVar3.a.b());
                matrix.setTranslate(brg.a, -difVar3.a.b());
                b.setLocalMatrix(matrix);
            }
        }
        ckrVar.j();
    }

    public final float a(int i) {
        i(i);
        List list = this.g;
        dif difVar = (dif) list.get(did.b(list, i));
        die dieVar = difVar.a;
        return difVar.a(((dhu) dieVar).b.c(difVar.f(i)));
    }

    public final float b(int i) {
        i(i);
        List list = this.g;
        dif difVar = (dif) list.get(did.b(list, i));
        die dieVar = difVar.a;
        return difVar.a(((dhu) dieVar).b.d(difVar.f(i)));
    }

    public final int c(float f) {
        List list = this.g;
        dif difVar = (dif) list.get(did.c(list, f));
        if (difVar.b() == 0) {
            return difVar.d;
        }
        return difVar.d(((dhu) difVar.a).b.l((int) (f - difVar.f)));
    }

    public final int d(long j) {
        dif difVar = (dif) this.g.get(did.c(this.g, Float.intBitsToFloat((int) (j & 4294967295L))));
        if (difVar.b() == 0) {
            return difVar.b;
        }
        die dieVar = difVar.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat(r3) - difVar.f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        int intBitsToFloat2 = (int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
        djx djxVar = ((dhu) dieVar).b;
        int l = djxVar.l(intBitsToFloat2);
        return difVar.c(djxVar.e.getOffsetForHorizontal(l, Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) + (-djxVar.a(l))));
    }

    public final long e(cjp cjpVar, int i, div divVar) {
        long j;
        long j2;
        List list = this.g;
        int c = did.c(list, cjpVar.c);
        if (((dif) list.get(c)).g < cjpVar.e && c != aqjn.z(this.g)) {
            int c2 = did.c(this.g, cjpVar.e);
            long j3 = djc.a;
            while (true) {
                j = djc.a;
                if (!a.bB(j3, j) || c > c2) {
                    break;
                }
                dif difVar = (dif) this.g.get(c);
                j3 = dif.j(difVar, difVar.a.h(difVar.i(cjpVar), i, divVar));
                c++;
            }
            if (!a.bB(j3, j)) {
                while (true) {
                    j2 = djc.a;
                    if (!a.bB(j, j2) || c > c2) {
                        break;
                    }
                    dif difVar2 = (dif) this.g.get(c2);
                    j = dif.j(difVar2, difVar2.a.h(difVar2.i(cjpVar), i, divVar));
                    c2--;
                }
                if (a.bB(j, j2)) {
                    return j3;
                }
                return djd.a(djc.e(j3), djc.a(j));
            }
            return j;
        }
        dif difVar3 = (dif) this.g.get(c);
        return dif.j(difVar3, difVar3.a.h(difVar3.i(cjpVar), i, divVar));
    }

    public final dhv f() {
        return this.a.a;
    }

    public final void g(int i) {
        if (i >= 0 && i < f().b.length()) {
            return;
        }
        doz.b("offset(" + i + ") is out of bounds [0, " + f().a() + ')');
    }

    public final void h(int i) {
        if (i >= 0 && i <= f().b.length()) {
            return;
        }
        doz.b("offset(" + i + ") is out of bounds [0, " + f().a() + ']');
    }

    public final void i(int i) {
        if (i >= 0 && i < this.e) {
            return;
        }
        doz.b("lineIndex(" + i + ") is out of bounds [0, " + this.e + ')');
    }

    public final void j(long j, float[] fArr) {
        g(djc.d(j));
        h(djc.c(j));
        arrz arrzVar = new arrz();
        arrzVar.a = 0;
        did.d(this.g, j, new AnonymousClass1(j, fArr, arrzVar, new arry()));
    }
}
