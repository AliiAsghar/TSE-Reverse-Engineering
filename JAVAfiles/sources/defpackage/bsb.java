package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsb {
    public static final float a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bsb$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<Boolean> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return a.by();
        }
    }

    static {
        buo buoVar = bvr.a;
        a = bvr.b;
        int i = bvq.a;
        int i2 = bvp.a;
    }

    public static final bsc a(bsd bsdVar, arqg arqgVar, zr zrVar, aag aagVar, bwj bwjVar, int i, int i2) {
        boolean z;
        boolean z2 = false;
        if ((i2 & 1) != 0) {
            float f = bjp.a;
            Object[] objArr = new Object[0];
            ceh cehVar = bsd.a;
            boolean D = bwjVar.D(-3.4028235E38f) | bwjVar.D(brg.a) | bwjVar.D(brg.a);
            bwk bwkVar = (bwk) bwjVar;
            Object T = bwkVar.T();
            if (D || T == bwj.a.a) {
                T = new bjr();
                bwkVar.ad(T);
            }
            bsdVar = (bsd) cdy.b(objArr, cehVar, (arqg) T, bwjVar, 0, 4);
        }
        if ((i2 & 2) != 0) {
            arqgVar = AnonymousClass1.a;
        }
        if ((i2 & 4) != 0) {
            zrVar = bnu.a(buz.d, bwjVar);
        }
        if ((i2 & 8) != 0) {
            aagVar = zg.a(bwjVar);
        }
        if ((((i & 14) ^ 6) > 4 && bwjVar.G(bsdVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & 112) ^ 48) > 32 && bwjVar.G(arqgVar)) || (i & 48) == 32) {
            z2 = true;
        }
        boolean G = z | z2 | bwjVar.G(zrVar) | bwjVar.G(aagVar);
        bwk bwkVar2 = (bwk) bwjVar;
        Object T2 = bwkVar2.T();
        if (G || T2 == bwj.a.a) {
            T2 = new blv(bsdVar, zrVar, aagVar);
            bwkVar2.ad(T2);
        }
        return (blv) T2;
    }

    public static final bsa b(long j, long j2, long j3, long j4, long j5, bwj bwjVar, int i) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        if ((i & 1) != 0) {
            j6 = cku.h;
        } else {
            j6 = j;
        }
        if ((i & 2) != 0) {
            j7 = cku.h;
        } else {
            j7 = j2;
        }
        if ((i & 4) != 0) {
            j8 = cku.h;
        } else {
            j8 = j3;
        }
        if ((i & 8) != 0) {
            j9 = cku.h;
        } else {
            j9 = j4;
        }
        if ((i & 16) != 0) {
            j10 = cku.h;
        } else {
            j10 = j5;
        }
        blh a2 = bmp.a(bwjVar);
        bsa bsaVar = a2.P;
        if (bsaVar == null) {
            buo buoVar = bvr.a;
            j13 = j10;
            j12 = j9;
            j11 = j8;
            bsaVar = new bsa(bli.b(a2, bvr.a), bli.b(a2, bvr.f), bli.b(a2, bvr.e), bli.b(a2, bvr.c), bli.b(a2, bvr.g));
            a2.P = bsaVar;
        } else {
            j11 = j8;
            j12 = j9;
            j13 = j10;
        }
        if (j6 == 16) {
            j6 = bsaVar.a;
        }
        if (j7 == 16) {
            j7 = bsaVar.b;
        }
        if (j11 == 16) {
            j11 = bsaVar.c;
        }
        if (j12 != 16) {
            j14 = j12;
        } else {
            j14 = bsaVar.d;
        }
        if (j13 != 16) {
            j15 = j13;
        } else {
            j15 = bsaVar.e;
        }
        return new bsa(j6, j7, j11, j14, j15);
    }
}
