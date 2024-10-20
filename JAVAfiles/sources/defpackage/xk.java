package defpackage;

import defpackage.abt;
import defpackage.cfq;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xk extends xu {
    public abt a;
    public abt.a b;
    public abt.a c;
    public abt.a d;
    public xl e;
    public xn f;
    public arqg g;
    public xs h;
    public cfq i;
    private long j = -9223372034707292160L;
    private final arqr k;
    private final arqr l;

    /* compiled from: PG */
    /* renamed from: xk$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cvc cvcVar) {
            super(1);
            this.a = cvcVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((cvc.a) obj).e(this.a, 0, 0, brg.a);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: xk$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;
        final /* synthetic */ long b;
        final /* synthetic */ long c;
        final /* synthetic */ arqr d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cvc cvcVar, long j, long j2, arqr arqrVar) {
            super(1);
            this.a = cvcVar;
            this.b = j;
            this.c = j2;
            this.d = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            arqr arqrVar = this.d;
            long j = this.b;
            int b = dre.b(j);
            long j2 = this.c;
            int b2 = dre.b(j2);
            ((cvc.a) obj).g(this.a, dre.a(j) + dre.a(j2), b2 + b, brg.a, arqrVar);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: xk$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(cvc cvcVar) {
            super(1);
            this.a = cvcVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((cvc.a) obj).e(this.a, 0, 0, brg.a);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: xk$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqr<wv, dri> {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(long j) {
            super(1);
            this.b = j;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            wv wvVar = wv.a;
            int ordinal = ((wv) obj).ordinal();
            long j = this.b;
            xk xkVar = xk.this;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        wn wnVar = xkVar.f.b().c;
                        if (wnVar != null) {
                            j = ((dri) wnVar.b.a(new dri(j))).a;
                        }
                    } else {
                        throw new armm();
                    }
                }
            } else {
                wn wnVar2 = xkVar.e.b().c;
                if (wnVar2 != null) {
                    j = ((dri) wnVar2.b.a(new dri(j))).a;
                }
            }
            return new dri(j);
        }
    }

    /* compiled from: PG */
    /* renamed from: xk$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqr<abt.b<wv>, aap<dre>> {
        public static final AnonymousClass5 a = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            return wx.b;
        }
    }

    /* compiled from: PG */
    /* renamed from: xk$6, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass6 extends arrp implements arqr<wv, dre> {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(long j) {
            super(1);
            this.b = j;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            xk xkVar = xk.this;
            wv wvVar = (wv) obj;
            long j = 0;
            if (xkVar.i != null && xkVar.a() != null && !d.F(xkVar.i, xkVar.a())) {
                wv wvVar2 = wv.a;
                int ordinal = wvVar.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        wn wnVar = xkVar.f.b().c;
                        if (wnVar != null) {
                            long j2 = this.b;
                            long j3 = ((dri) wnVar.b.a(new dri(j2))).a;
                            cfq a = xkVar.a();
                            a.getClass();
                            long a2 = a.a(j2, j3, drk.a);
                            cfq cfqVar = xkVar.i;
                            cfqVar.getClass();
                            j = dre.c(a2, cfqVar.a(j2, j3, drk.a));
                        }
                    } else {
                        throw new armm();
                    }
                }
            }
            return new dre(j);
        }
    }

    /* compiled from: PG */
    /* renamed from: xk$7, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass7 extends arrp implements arqr<wv, dre> {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(long j) {
            super(1);
            this.b = j;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j;
            long j2;
            xk xkVar = xk.this;
            wv wvVar = (wv) obj;
            zd zdVar = xkVar.e.b().b;
            long j3 = this.b;
            long j4 = 0;
            if (zdVar != null) {
                j = ((dre) zdVar.a.a(new dri(j3))).a;
            } else {
                j = 0;
            }
            zd zdVar2 = xkVar.f.b().b;
            if (zdVar2 != null) {
                j2 = ((dre) zdVar2.a.a(new dri(j3))).a;
            } else {
                j2 = 0;
            }
            wv wvVar2 = wv.a;
            int ordinal = wvVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        j4 = j2;
                    } else {
                        throw new armm();
                    }
                }
            } else {
                j4 = j;
            }
            return new dre(j4);
        }
    }

    /* compiled from: PG */
    /* renamed from: xk$8, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass8 extends arrp implements arqr<abt.b<wv>, aap<dri>> {
        public AnonymousClass8() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            abt.b bVar = (abt.b) obj;
            Object obj2 = null;
            if (bVar.c(wv.a, wv.b)) {
                wn wnVar = xk.this.e.b().c;
                if (wnVar != null) {
                    obj2 = wnVar.c;
                }
            } else if (bVar.c(wv.b, wv.c)) {
                wn wnVar2 = xk.this.f.b().c;
                if (wnVar2 != null) {
                    obj2 = wnVar2.c;
                }
            } else {
                obj2 = wx.c;
            }
            if (obj2 == null) {
                return wx.c;
            }
            return obj2;
        }
    }

    /* compiled from: PG */
    /* renamed from: xk$9, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass9 extends arrp implements arqr<abt.b<wv>, aap<dre>> {
        public AnonymousClass9() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            abt.b bVar = (abt.b) obj;
            if (bVar.c(wv.a, wv.b)) {
                zd zdVar = xk.this.e.b().b;
                if (zdVar != null) {
                    return zdVar.b;
                }
                return wx.b;
            }
            if (bVar.c(wv.b, wv.c)) {
                zd zdVar2 = xk.this.f.b().b;
                if (zdVar2 != null) {
                    return zdVar2.b;
                }
                return wx.b;
            }
            return wx.b;
        }
    }

    public xk(abt abtVar, abt.a aVar, abt.a aVar2, abt.a aVar3, xl xlVar, xn xnVar, arqg arqgVar, xs xsVar) {
        this.a = abtVar;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = xlVar;
        this.f = xnVar;
        this.g = arqgVar;
        this.h = xsVar;
        dqt.l(0, 0, 15);
        this.k = new AnonymousClass8();
        this.l = new AnonymousClass9();
    }

    public final cfq a() {
        wn wnVar;
        if (this.a.d().c(wv.a, wv.b)) {
            wn wnVar2 = this.e.b().c;
            if (wnVar2 != null) {
                return wnVar2.a;
            }
            wnVar = this.f.b().c;
            if (wnVar == null) {
                return null;
            }
        } else {
            wn wnVar3 = this.f.b().c;
            if (wnVar3 != null) {
                return wnVar3.a;
            }
            wnVar = this.e.b().c;
            if (wnVar == null) {
                return null;
            }
        }
        return wnVar.a;
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cuf et;
        long j2;
        long j3;
        long j4;
        cuf et2;
        cuf et3;
        cas casVar = null;
        if (this.a.e() == this.a.f()) {
            this.i = null;
        } else if (this.i == null) {
            cfq a = a();
            if (a == null) {
                int i = cfq.a;
                a = cfq.a.a;
            }
            this.i = a;
        }
        if (cuhVar.ev()) {
            cvc e = cucVar.e(j);
            long j5 = (e.a << 32) | (e.b & 4294967295L);
            this.j = j5;
            et3 = cuhVar.et((int) (j5 >> 32), (int) (4294967295L & j5), arnw.a, new AnonymousClass1(e));
            return et3;
        }
        if (((Boolean) this.g.a()).booleanValue()) {
            arqr a2 = this.h.a();
            cvc e2 = cucVar.e(j);
            long j6 = this.j;
            long j7 = (e2.a << 32) | (e2.b & 4294967295L);
            if (true != wj.a(j6)) {
                j6 = j7;
            }
            abt.a aVar = this.b;
            if (aVar != null) {
                casVar = aVar.b(this.k, new AnonymousClass4(j6));
            }
            if (casVar != null) {
                j7 = ((dri) casVar.a()).a;
            }
            long e3 = dqt.e(j, j7);
            abt.a aVar2 = this.c;
            if (aVar2 != null) {
                j2 = ((dre) aVar2.b(AnonymousClass5.a, new AnonymousClass6(j6)).a()).a;
            } else {
                j2 = 0;
            }
            abt.a aVar3 = this.d;
            if (aVar3 != null) {
                j3 = ((dre) aVar3.b(this.l, new AnonymousClass7(j6)).a()).a;
            } else {
                j3 = 0;
            }
            cfq cfqVar = this.i;
            if (cfqVar != null) {
                j4 = cfqVar.a(j6, e3, drk.a);
            } else {
                j4 = 0;
            }
            et2 = cuhVar.et((int) (e3 >> 32), (int) (e3 & 4294967295L), arnw.a, new AnonymousClass2(e2, dre.d(j4, j3), j2, a2));
            return et2;
        }
        cvc e4 = cucVar.e(j);
        et = cuhVar.et(e4.a, e4.b, arnw.a, new AnonymousClass3(e4));
        return et;
    }

    @Override // cga.c
    public final void dQ() {
        this.j = -9223372034707292160L;
    }
}
