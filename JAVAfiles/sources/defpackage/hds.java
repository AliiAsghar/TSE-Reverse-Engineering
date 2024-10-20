package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hds extends arrp implements arqr {
    final /* synthetic */ hbb a;
    final /* synthetic */ csv b;
    final /* synthetic */ cfq c;
    final /* synthetic */ Matrix d;
    final /* synthetic */ hbl e;
    final /* synthetic */ boolean f;
    final /* synthetic */ arqg g;
    final /* synthetic */ byn h;
    final /* synthetic */ int i;
    final /* synthetic */ rae j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hds(hbb hbbVar, csv csvVar, cfq cfqVar, Matrix matrix, hbl hblVar, int i, rae raeVar, boolean z, arqg arqgVar, byn bynVar) {
        super(1);
        this.a = hbbVar;
        this.b = csvVar;
        this.c = cfqVar;
        this.d = matrix;
        this.e = hblVar;
        this.i = i;
        this.j = raeVar;
        this.f = z;
        this.g = arqgVar;
        this.h = bynVar;
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v48, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v50, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v52, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v54, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v56, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cny cnyVar = (cny) obj;
        cnyVar.getClass();
        ckr b = cnyVar.q().b();
        hbb hbbVar = this.a;
        float width = hbbVar.h.width();
        float height = hbbVar.h.height();
        long floatToRawIntBits = Float.floatToRawIntBits(width);
        long floatToRawIntBits2 = Float.floatToRawIntBits(height);
        int g = arsk.g(Float.intBitsToFloat((int) (cnyVar.o() >> 32)));
        int g2 = arsk.g(Float.intBitsToFloat((int) (cnyVar.o() & 4294967295L)));
        long j = (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32);
        long a = this.b.a(j, cnyVar.o());
        int i = (int) (a >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * Float.intBitsToFloat(i);
        int i2 = (int) (a & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * Float.intBitsToFloat(i2);
        long a2 = this.c.a((((int) intBitsToFloat) << 32) | (((int) intBitsToFloat2) & 4294967295L), (g << 32) | (g2 & 4294967295L), cnyVar.r());
        Matrix matrix = this.d;
        matrix.reset();
        matrix.preTranslate(dre.a(a2), dre.b(a2));
        matrix.preScale(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        hbl hblVar = this.e;
        hblVar.h(false);
        hblVar.s(this.i);
        hblVar.r(hbbVar);
        byn bynVar = this.h;
        rae raeVar = this.j;
        if (raeVar != gvf.ak(bynVar)) {
            rae ak = gvf.ak(bynVar);
            if (ak != null) {
                hblVar.getClass();
                for (kkc kkcVar : ak.b) {
                    hblVar.f((heo) kkcVar.b, kkcVar.c, null);
                }
                for (kkc kkcVar2 : ak.d) {
                    hblVar.f((heo) kkcVar2.b, kkcVar2.c, null);
                }
                for (kkc kkcVar3 : ak.g) {
                    hblVar.f((heo) kkcVar3.b, kkcVar3.c, null);
                }
                for (kkc kkcVar4 : ak.c) {
                    hblVar.f((heo) kkcVar4.b, kkcVar4.c, null);
                }
                for (kkc kkcVar5 : ak.h) {
                    hblVar.f((heo) kkcVar5.b, kkcVar5.c, null);
                }
                for (kkc kkcVar6 : ak.f) {
                    hblVar.f((heo) kkcVar6.b, kkcVar6.c, null);
                }
                for (kkc kkcVar7 : ak.a) {
                    hblVar.f((heo) kkcVar7.b, kkcVar7.c, null);
                }
                for (kkc kkcVar8 : ak.i) {
                    hblVar.f((heo) kkcVar8.b, kkcVar8.c, null);
                }
                for (kkc kkcVar9 : ak.e) {
                    hblVar.f((heo) kkcVar9.b, kkcVar9.c, null);
                }
            }
            if (raeVar != null) {
                hblVar.getClass();
                for (kkc kkcVar10 : raeVar.b) {
                    hblVar.f((heo) kkcVar10.b, kkcVar10.c, new hee(kkcVar10.a));
                }
                for (kkc kkcVar11 : raeVar.d) {
                    hblVar.f((heo) kkcVar11.b, kkcVar11.c, new hee(kkcVar11.a));
                }
                for (kkc kkcVar12 : raeVar.g) {
                    hblVar.f((heo) kkcVar12.b, kkcVar12.c, new hee(kkcVar12.a));
                }
                for (kkc kkcVar13 : raeVar.c) {
                    hblVar.f((heo) kkcVar13.b, kkcVar13.c, new hee(kkcVar13.a));
                }
                for (kkc kkcVar14 : raeVar.h) {
                    hblVar.f((heo) kkcVar14.b, kkcVar14.c, new hee(kkcVar14.a));
                }
                for (kkc kkcVar15 : raeVar.f) {
                    hblVar.f((heo) kkcVar15.b, kkcVar15.c, new hee(kkcVar15.a));
                }
                for (kkc kkcVar16 : raeVar.a) {
                    hblVar.f((heo) kkcVar16.b, kkcVar16.c, new hee(kkcVar16.a));
                }
                for (kkc kkcVar17 : raeVar.i) {
                    hblVar.f((heo) kkcVar17.b, kkcVar17.c, new hee(kkcVar17.a));
                }
                for (kkc kkcVar18 : raeVar.e) {
                    hblVar.f((heo) kkcVar18.b, kkcVar18.c, new hee(kkcVar18.a));
                }
            }
            bynVar.h(raeVar);
        }
        arqg arqgVar = this.g;
        hblVar.m(this.f);
        hblVar.o(((Number) arqgVar.a()).floatValue());
        hblVar.setBounds(0, 0, hbbVar.h.width(), hbbVar.h.height());
        Canvas a3 = cjx.a(b);
        hfx hfxVar = hblVar.j;
        hbb hbbVar2 = hblVar.a;
        if (hfxVar != null && hbbVar2 != null) {
            if (hblVar.l) {
                a3.save();
                a3.concat(matrix);
                hblVar.k(a3, hfxVar);
                a3.restore();
            } else {
                hfxVar.b(a3, matrix, hblVar.k);
            }
            hblVar.m = false;
        }
        return arnb.a;
    }
}
