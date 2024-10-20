package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeyq {
    public static final bzc a = new bxj(cav.a, aewh.o);

    public static final void a(aeyw aeywVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        float f;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1110554840);
        if (i5 == 0) {
            if (true != c.G(aeywVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new aexd(aeywVar, cgaVar, i, 7, null);
                return;
            }
            return;
        }
        aeywVar.d();
        aeywVar.a();
        if (aeywVar.b() != null) {
            f = 64.0f;
        } else {
            f = 48.0f;
        }
        aetn.aN(amv.t(cgaVar, f, brg.a, 2), aeywVar.c(), true);
        aeywVar.d();
        throw null;
    }

    public static final void b(aeyw aeywVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        aeyu aeyuVar;
        cga cgaVar2;
        int i3;
        aeywVar.getClass();
        int i4 = i & 14;
        bwj c = bwjVar.c(596044650);
        if (i4 == 0) {
            if (true != c.G(aeywVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if ((i5 & 91) == 18 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
        } else {
            boolean z = aeywVar instanceof aeyu;
            cga.a aVar = cga.e;
            if (z) {
                aeyuVar = (aeyu) aeywVar;
            } else {
                aeyuVar = null;
            }
            if (aeyuVar == null) {
                c.y(1203639696);
                a(aeywVar, aVar, c, i5 & 126);
                ((bwk) c).Y();
                cgaVar2 = aVar;
            } else {
                throw null;
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aexd(aeywVar, cgaVar2, i, 8, null);
        }
    }
}
