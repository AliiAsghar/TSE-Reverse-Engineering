package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdu {
    public static final zw a = new zw(Float.NaN, Float.NaN);
    public static final acg b = new ach(AnonymousClass1.a, AnonymousClass2.a);
    public static final long c;
    public static final abm d;

    /* compiled from: PG */
    /* renamed from: bdu$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cjn, zw> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((cjn) obj).a;
            if ((9223372034707292159L & j) != 9205357640488583168L) {
                return new zw(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            }
            return bdu.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: bdu$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<zw, cjn> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            return new cjn(a.bG((zw) obj));
        }
    }

    /* compiled from: PG */
    /* renamed from: bdu$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqw<cga, bwj, Integer, cga> {
        final /* synthetic */ arqg a;
        final /* synthetic */ arqr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(arqg arqgVar, arqr arqrVar) {
            super(3);
            this.a = arqgVar;
            this.b = arqrVar;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            bwjVar.y(759876635);
            zw zwVar = bdu.a;
            Object h = bwjVar.h();
            if (h == bwj.a.a) {
                bxd bxdVar = new bxd(this.a, null);
                bwjVar.B(bxdVar);
                h = bxdVar;
            }
            cas casVar = (cas) h;
            Object h2 = bwjVar.h();
            if (h2 == bwj.a.a) {
                h2 = new zj(new cjn(bdu.a(casVar)), bdu.b, new cjn(bdu.c), 8);
                bwjVar.B(h2);
            }
            zj zjVar = (zj) h2;
            arnb arnbVar = arnb.a;
            boolean I = bwjVar.I(zjVar);
            Object h3 = bwjVar.h();
            if (I || h3 == bwj.a.a) {
                h3 = new bdw(casVar, zjVar, null);
                bwjVar.B(h3);
            }
            bxl.g(arnbVar, (arqv) h3, bwjVar);
            zt ztVar = zjVar.b;
            arqr arqrVar = this.b;
            boolean G = bwjVar.G(ztVar);
            Object h4 = bwjVar.h();
            if (G || h4 == bwj.a.a) {
                h4 = new bdv(ztVar);
                bwjVar.B(h4);
            }
            cga cgaVar = (cga) arqrVar.a((arqg) h4);
            bwjVar.q();
            return cgaVar;
        }
    }

    static {
        long floatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        c = floatToRawIntBits;
        d = new abm(new cjn(floatToRawIntBits), 3);
    }

    public static final long a(cas casVar) {
        return ((cjn) casVar.a()).a;
    }

    public static final cga b(cga cgaVar, arqg arqgVar, arqr arqrVar) {
        cga g;
        g = cfv.g(cgaVar, new AnonymousClass3(arqgVar, arqrVar));
        return g;
    }
}
