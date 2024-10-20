package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bko {
    public static final amj a;
    public static final amj b;
    public static final float c;
    public static final float d;
    private static final float e;
    private static final float f;
    private static final float g;
    private static final float h;
    private static final float i;

    static {
        float f2 = buj.a;
        float f3 = buj.a;
        e = f3;
        float f4 = buj.b;
        f = f4;
        g = 16.0f;
        bvg bvgVar = buk.a;
        h = 8.0f;
        amk amkVar = new amk(f3, 8.0f, f4, 8.0f);
        a = amkVar;
        new amk(16.0f, 8.0f, f4, 8.0f);
        i = 12.0f;
        b = new amk(12.0f, amkVar.a, 12.0f, amkVar.b);
        new amk(12.0f, amkVar.a, 16.0f, amkVar.b);
        c = 58.0f;
        d = 40.0f;
    }

    public static final bkn a(blh blhVar) {
        long f2;
        long f3;
        bkn bknVar = blhVar.K;
        if (bknVar == null) {
            buo buoVar = buq.a;
            long b2 = bli.b(blhVar, buq.a);
            long b3 = bli.b(blhVar, buq.g);
            f2 = ckw.f(cku.d(r6), cku.c(r6), cku.b(r6), buq.c, cku.f(bli.b(blhVar, buq.b)));
            f3 = ckw.f(cku.d(r8), cku.c(r8), cku.b(r8), buq.e, cku.f(bli.b(blhVar, buq.d)));
            bkn bknVar2 = new bkn(b2, b3, f2, f3);
            blhVar.K = bknVar2;
            return bknVar2;
        }
        return bknVar;
    }

    public static final bkn b(long j, long j2, long j3, long j4, bwj bwjVar, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        if ((i2 & 1) != 0) {
            j5 = cku.h;
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = cku.h;
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = cku.h;
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = cku.h;
        } else {
            j8 = j4;
        }
        return a(bmp.a(bwjVar)).a(j5, j6, j7, j8);
    }

    public static final bkr c(float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            buo buoVar = buq.a;
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            buo buoVar2 = buq.a;
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            buo buoVar3 = buq.a;
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            buo buoVar4 = buq.a;
            f5 = buq.f;
        }
        if ((i2 & 16) != 0) {
            buo buoVar5 = buq.a;
        }
        return new bkr(f2, f3, f4, f5);
    }
}
