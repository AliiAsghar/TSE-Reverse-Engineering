package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cnw {
    public static long a(cny cnyVar) {
        return cju.a(((cnr) cnyVar).b.a());
    }

    public static long b(cny cnyVar) {
        return ((cnr) cnyVar).b.a();
    }

    public static /* synthetic */ void d(cny cnyVar, clr clrVar, long j, cnz cnzVar, int i) {
        float f;
        if ((i & 8) != 0) {
            cnzVar = coc.a;
        }
        cnz cnzVar2 = cnzVar;
        if ((i & 4) != 0) {
            f = 1.0f;
        } else {
            f = brg.a;
        }
        cnyVar.B(clrVar, j, f, cnzVar2);
    }

    public static /* synthetic */ void e(cny cnyVar, cko ckoVar, long j, long j2, long j3, cnz cnzVar, int i) {
        long j4;
        long j5;
        long j6;
        float f;
        cnz cnzVar2;
        if ((i & 2) != 0) {
            j4 = 0;
        } else {
            j4 = j;
        }
        if ((i & 4) != 0) {
            j5 = a.Q(cnyVar.o(), j4);
        } else {
            j5 = j2;
        }
        if ((i & 8) != 0) {
            j6 = 0;
        } else {
            j6 = j3;
        }
        if ((i & 16) != 0) {
            f = 1.0f;
        } else {
            f = brg.a;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            cnzVar2 = coc.a;
        } else {
            cnzVar2 = cnzVar;
        }
        cnyVar.C(ckoVar, j4, j5, j6, f2, cnzVar2);
    }

    public static /* synthetic */ void f(cny cnyVar, long j, long j2, long j3, long j4, cnz cnzVar, float f, int i) {
        long j5;
        long j6;
        long j7;
        cnz cnzVar2;
        float f2;
        if ((i & 2) != 0) {
            j5 = 0;
        } else {
            j5 = j2;
        }
        if ((i & 4) != 0) {
            j6 = a.Q(cnyVar.o(), j5);
        } else {
            j6 = j3;
        }
        if ((i & 8) != 0) {
            j7 = 0;
        } else {
            j7 = j4;
        }
        if ((i & 16) != 0) {
            cnzVar2 = coc.a;
        } else {
            cnzVar2 = cnzVar;
        }
        if ((i & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        cnyVar.D(j, j5, j6, j7, cnzVar2, f2);
    }

    public static /* synthetic */ void g(cny cnyVar, long j, float f, long j2, cnz cnzVar, int i) {
        float f2;
        long j3;
        float f3;
        cnz cnzVar2;
        int i2;
        if ((i & 2) != 0) {
            f2 = cjt.b(cnyVar.o()) / 2.0f;
        } else {
            f2 = f;
        }
        if ((i & 4) != 0) {
            j3 = cnyVar.a();
        } else {
            j3 = j2;
        }
        if ((i & 8) != 0) {
            f3 = 1.0f;
        } else {
            f3 = brg.a;
        }
        float f4 = f3;
        if ((i & 16) != 0) {
            cnzVar2 = coc.a;
        } else {
            cnzVar2 = cnzVar;
        }
        if ((i & 64) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        cnyVar.v(j, f2, j3, f4, cnzVar2, i2);
    }

    public static /* synthetic */ void h(cny cnyVar, clg clgVar, long j, long j2, float f, ckv ckvVar, int i, int i2) {
        long j3;
        long j4;
        float f2;
        coc cocVar;
        ckv ckvVar2;
        int i3;
        if ((i2 & 4) != 0) {
            j3 = (clgVar.b() & 4294967295L) | (clgVar.c() << 32);
        } else {
            j3 = j;
        }
        if ((i2 & 16) != 0) {
            j4 = j3;
        } else {
            j4 = j2;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 64) != 0) {
            cocVar = coc.a;
        } else {
            cocVar = null;
        }
        if ((i2 & 128) != 0) {
            ckvVar2 = null;
        } else {
            ckvVar2 = ckvVar;
        }
        int i4 = 0;
        if ((i2 & 256) != 0) {
            i3 = 3;
        } else {
            i3 = 0;
        }
        if ((i2 & 512) == 0) {
            i4 = 1;
        }
        cnyVar.y(clgVar, j3, j4, f2, cocVar, ckvVar2, i3, (i4 ^ 1) | i);
    }

    public static /* synthetic */ void i(cny cnyVar, long j, long j2, long j3, float f, int i, int i2) {
        int i3;
        float f2;
        if ((i2 & 16) != 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        int i4 = i3 & i;
        if ((i2 & 8) != 0) {
            f2 = 0.0f;
        } else {
            f2 = f;
        }
        cnyVar.E(j, j2, j3, f2, i4);
    }

    public static /* synthetic */ void j(cny cnyVar, clr clrVar, cko ckoVar, float f, cnz cnzVar, int i) {
        int i2;
        if ((i & 8) != 0) {
            cnzVar = coc.a;
        }
        cnz cnzVar2 = cnzVar;
        if ((i & 32) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        cnyVar.w(clrVar, ckoVar, f, cnzVar2, i3);
    }

    public static /* synthetic */ void k(cny cnyVar, cko ckoVar, long j, long j2, float f, cnz cnzVar, int i) {
        long j3;
        long j4;
        float f2;
        cnz cnzVar2;
        if ((i & 2) != 0) {
            j3 = 0;
        } else {
            j3 = j;
        }
        if ((i & 4) != 0) {
            j4 = a.Q(cnyVar.o(), j3);
        } else {
            j4 = j2;
        }
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 16) != 0) {
            cnzVar2 = coc.a;
        } else {
            cnzVar2 = cnzVar;
        }
        cnyVar.F(ckoVar, j3, j4, f2, cnzVar2);
    }

    public static /* synthetic */ void l(cny cnyVar, long j, long j2, long j3, float f, ckv ckvVar, int i) {
        long j4;
        long j5;
        float f2;
        coc cocVar;
        ckv ckvVar2;
        int i2;
        if ((i & 2) != 0) {
            j4 = 0;
        } else {
            j4 = j2;
        }
        if ((i & 4) != 0) {
            j5 = a.Q(cnyVar.o(), j4);
        } else {
            j5 = j3;
        }
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 16) != 0) {
            cocVar = coc.a;
        } else {
            cocVar = null;
        }
        if ((i & 32) != 0) {
            ckvVar2 = null;
        } else {
            ckvVar2 = ckvVar;
        }
        if ((i & 64) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        cnyVar.s(j, j4, j5, f2, cocVar, ckvVar2, i2);
    }
}
