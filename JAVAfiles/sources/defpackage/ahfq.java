package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahfq {
    public static final amj a;
    public static final amj b;
    public static final float c;
    private static final float d;

    static {
        amk amkVar = new amk(24.0f, 8.0f, 24.0f, 8.0f);
        a = amkVar;
        new amk(16.0f, 8.0f, 24.0f, 8.0f);
        d = 12.0f;
        b = new amk(12.0f, amkVar.a, 12.0f, amkVar.b);
        new amk(12.0f, amkVar.a, 16.0f, amkVar.b);
        c = 8.0f;
    }

    public static final cmb a(bwj bwjVar) {
        bwjVar.y(2031760353);
        cmb b2 = ahgv.b(7, bwjVar);
        ((bwk) bwjVar).Y();
        return b2;
    }

    public static final bkn b(long j, long j2, bwj bwjVar, int i) {
        long f;
        long f2;
        bwjVar.y(-1814124481);
        if ((i & 1) != 0) {
            j = ahji.ab(26, bwjVar);
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = ahji.ab(10, bwjVar);
        }
        f = ckw.f(cku.d(r10), cku.c(r10), cku.b(r10), 0.1f, cku.f(ahji.ab(18, bwjVar)));
        f2 = ckw.f(cku.d(r10), cku.c(r10), cku.b(r10), 0.38f, cku.f(ahji.ab(19, bwjVar)));
        amj amjVar = bko.a;
        bkn b2 = bko.b(j3, j2, f, f2, bwjVar, 0);
        ((bwk) bwjVar).Y();
        return b2;
    }

    public static final bkn c(long j, bwj bwjVar, int i) {
        long j2;
        long f;
        bwjVar.y(1389225298);
        if ((i & 1) != 0) {
            j2 = cku.g;
        } else {
            j2 = 0;
        }
        long j3 = j2;
        if ((i & 2) != 0) {
            j = ahji.ab(26, bwjVar);
        }
        long j4 = j;
        long j5 = cku.g;
        f = ckw.f(cku.d(r12), cku.c(r12), cku.b(r12), 0.38f, cku.f(ahji.ab(19, bwjVar)));
        amj amjVar = bko.a;
        bkn b2 = bko.b(j3, j4, j5, f, bwjVar, 0);
        ((bwk) bwjVar).Y();
        return b2;
    }
}
