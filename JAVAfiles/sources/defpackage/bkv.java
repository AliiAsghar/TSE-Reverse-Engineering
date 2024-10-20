package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkv {
    public static final bku a(long j, long j2, long j3, long j4, bwj bwjVar) {
        long j5;
        long j6;
        long j7;
        long j8;
        long f;
        long f2;
        blh a = bmp.a(bwjVar);
        bku bkuVar = a.M;
        if (bkuVar == null) {
            buo buoVar = bur.a;
            long b = bli.b(a, bur.a);
            long a2 = bli.a(a, bli.b(a, bur.a));
            f = ckw.f(cku.d(r7), cku.c(r7), cku.b(r7), bur.c, cku.f(bli.b(a, bur.b)));
            long h = ckw.h(f, bli.b(a, bur.a));
            f2 = ckw.f(cku.d(r9), cku.c(r9), cku.b(r9), 0.38f, cku.f(bli.a(a, bli.b(a, bur.a))));
            bkuVar = new bku(b, a2, h, f2);
            a.M = bkuVar;
        }
        if (j != 16) {
            j5 = j;
        } else {
            j5 = bkuVar.a;
        }
        if (j2 != 16) {
            j6 = j2;
        } else {
            j6 = bkuVar.b;
        }
        if (j3 != 16) {
            j7 = j3;
        } else {
            j7 = bkuVar.c;
        }
        if (j4 != 16) {
            j8 = j4;
        } else {
            j8 = bkuVar.d;
        }
        return new bku(j5, j6, j7, j8);
    }
}
