package defpackage;

import android.graphics.Rect;
import defpackage.bbk;
import defpackage.cga;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bat extends bbk {
    public bbm a;
    private arxm c;
    private ascc d;

    /* compiled from: PG */
    /* renamed from: bat$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<bbm, arnb> {
        final /* synthetic */ doj a;
        final /* synthetic */ bat b;
        final /* synthetic */ dno c;
        final /* synthetic */ arqr d;
        final /* synthetic */ arqr e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(doj dojVar, bat batVar, dno dnoVar, arqr arqrVar, arqr arqrVar2) {
            super(1);
            this.a = dojVar;
            this.b = batVar;
            this.c = dnoVar;
            this.d = arqrVar;
            this.e = arqrVar2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [cwm, bbk$a] */
        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            ayd aydVar;
            bfb bfbVar;
            bbm bbmVar = (bbm) obj;
            ?? r0 = this.b.b;
            bbmVar.h = this.a;
            bbmVar.i = this.c;
            bbmVar.c = this.d;
            bbmVar.d = this.e;
            deo deoVar = null;
            if (r0 != 0) {
                aydVar = ((bbh) r0).b;
            } else {
                aydVar = null;
            }
            bbmVar.e = aydVar;
            if (r0 != 0) {
                bfbVar = ((bbh) r0).c;
            } else {
                bfbVar = null;
            }
            bbmVar.f = bfbVar;
            if (r0 != 0) {
                deoVar = (deo) cwn.a(r0, dch.m);
            }
            bbmVar.g = deoVar;
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bat$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arpw implements arqv<ddp, arpe<?>, Object> {
        int a;
        final /* synthetic */ arqr b;
        final /* synthetic */ bat c;
        final /* synthetic */ bbk.a d;
        private /* synthetic */ Object e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: bat$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<?>, Object> {
            int a;
            final /* synthetic */ ddp b;
            final /* synthetic */ arqr c;
            final /* synthetic */ bat d;
            final /* synthetic */ bbk.a e;
            private /* synthetic */ Object f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PG */
            /* renamed from: bat$2$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00271 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
                int a;
                final /* synthetic */ bat b;
                final /* synthetic */ bbe c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: PG */
                /* renamed from: bat$2$1$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C00281 extends arrp implements arqr<Long, arnb> {
                    public static final C00281 a = new C00281();

                    public C00281() {
                        super(1);
                    }

                    @Override // defpackage.arqr
                    public final /* bridge */ /* synthetic */ Object a(Object obj) {
                        ((Number) obj).longValue();
                        return arnb.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00271(bat batVar, bbe bbeVar, arpe arpeVar) {
                    super(2, arpeVar);
                    this.b = batVar;
                    this.c = bbeVar;
                }

                @Override // defpackage.arqv
                public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                    return ((C00271) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
                
                    if (defpackage.ascj.g((defpackage.ascj) r4, r2, r3) == r0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0015, code lost:
                
                    if (defpackage.byf.b(r4, r3) != r0) goto L8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
                
                    if (r1 == 1) goto L8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
                
                    throw new defpackage.armj();
                 */
                @Override // defpackage.arpq
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object b(java.lang.Object r4) {
                    /*
                        r3 = this;
                        arpl r0 = defpackage.arpl.a
                        int r1 = r3.a
                        r2 = 1
                        defpackage.aqil.P(r4)
                        if (r1 == 0) goto Ld
                        if (r1 != r2) goto L32
                        goto L17
                    Ld:
                        bat$2$1$1$1 r4 = defpackage.bat.AnonymousClass2.AnonymousClass1.C00271.C00281.a
                        r3.a = r2
                        java.lang.Object r4 = defpackage.byf.b(r4, r3)
                        if (r4 == r0) goto L3b
                    L17:
                        bat r4 = r3.b
                        ascc r4 = r4.a()
                        if (r4 == 0) goto L38
                        bbe r1 = r3.c
                        bat$2$1$1$2 r2 = new bat$2$1$1$2
                        r2.<init>()
                        r1 = 2
                        r3.a = r1
                        ascj r4 = (defpackage.ascj) r4
                        java.lang.Object r4 = defpackage.ascj.g(r4, r2, r3)
                        if (r4 != r0) goto L32
                        goto L3b
                    L32:
                        armj r4 = new armj
                        r4.<init>()
                        throw r4
                    L38:
                        arnb r4 = defpackage.arnb.a
                        return r4
                    L3b:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bat.AnonymousClass2.AnonymousClass1.C00271.b(java.lang.Object):java.lang.Object");
                }

                @Override // defpackage.arpq
                public final arpe c(Object obj, arpe arpeVar) {
                    return new C00271(this.b, this.c, arpeVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PG */
            /* renamed from: bat$2$1$2, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C00302 extends arrm implements arqr<cll, arnb> {
                final /* synthetic */ bbk.a a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00302(bbk.a aVar) {
                    super(1, arrn.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                    this.a = aVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v13, types: [czb] */
                @Override // defpackage.arqr
                public final /* synthetic */ Object a(Object obj) {
                    ctx ctxVar;
                    cyn cynVar;
                    cqm cqmVar;
                    cxn cxnVar;
                    float[] fArr = ((cll) obj).a;
                    cti ctiVar = (cti) ((bbh) this.a).d.a();
                    if (ctiVar != null) {
                        cqm cqmVar2 = null;
                        if (true != ctiVar.r()) {
                            ctiVar = null;
                        }
                        if (ctiVar != null) {
                            cti f = ctj.f(ctiVar);
                            float[] e = cll.e();
                            f.p(ctiVar, e);
                            cll.d(fArr, e);
                            if (ctiVar instanceof ctx) {
                                ctxVar = (ctx) ctiVar;
                            } else {
                                ctxVar = null;
                            }
                            if (ctxVar == null || (cynVar = ctxVar.a()) == null) {
                                if (ctiVar instanceof cyn) {
                                    cynVar = (cyn) ctiVar;
                                } else {
                                    cynVar = null;
                                }
                            }
                            if (cynVar != null && (cxnVar = cynVar.r) != null) {
                                cqmVar = cxq.a(cxnVar);
                            } else {
                                cqmVar = null;
                            }
                            if (true == (cqmVar instanceof cqm)) {
                                cqmVar2 = cqmVar;
                            }
                            if (cqmVar2 != null) {
                                cqmVar2.a(fArr);
                            } else {
                                long j = f.j(0L);
                                if ((9223372034707292159L & j) != 9205357640488583168L) {
                                    cll.f(fArr, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
                                }
                            }
                        }
                    }
                    return arnb.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ddp ddpVar, arqr arqrVar, bat batVar, bbk.a aVar, arpe arpeVar) {
                super(2, arpeVar);
                this.b = ddpVar;
                this.c = arqrVar;
                this.d = batVar;
                this.e = aVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [bbe, java.lang.Object] */
            @Override // defpackage.arpq
            public final Object b(Object obj) {
                arpl arplVar = arpl.a;
                try {
                    if (this.a == 0) {
                        aqil.P(obj);
                        arwe arweVar = (arwe) this.f;
                        ?? a = bbl.a.a(this.b.a());
                        bbm bbmVar = new bbm(this.b.a(), new C00302(this.e), a);
                        if (bas.a) {
                            arrn.J(arweVar, null, null, new C00271(this.d, a, null), 3);
                        }
                        arqr arqrVar = this.c;
                        if (arqrVar != null) {
                            arqrVar.a(bbmVar);
                        }
                        this.d.a = bbmVar;
                        ddp ddpVar = this.b;
                        this.a = 1;
                        if (ddpVar.c(bbmVar, this) == arplVar) {
                            return arplVar;
                        }
                    } else {
                        aqil.P(obj);
                    }
                    throw new armj();
                } catch (Throwable th) {
                    this.d.a = null;
                    throw th;
                }
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, this.d, this.e, arpeVar);
                anonymousClass1.f = obj;
                return anonymousClass1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arqr arqrVar, bat batVar, bbk.a aVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = arqrVar;
            this.c = batVar;
            this.d = aVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((ddp) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((ddp) this.e, this.b, this.c, this.d, null);
                this.a = 1;
                if (arwi.d(anonymousClass1, this) == arplVar) {
                    return arplVar;
                }
            }
            throw new armj();
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, this.c, this.d, arpeVar);
            anonymousClass2.e = obj;
            return anonymousClass2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m(arqr arqrVar) {
        bbk.a aVar = this.b;
        if (aVar == 0) {
            return;
        }
        arxm arxmVar = null;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(arqrVar, this, aVar, null);
        cga.c cVar = (cga.c) aVar;
        if (cVar.z) {
            arxmVar = arrn.J(cVar.B(), null, arwf.d, new bbg((bbh) aVar, anonymousClass2, null), 1);
        }
        this.c = arxmVar;
    }

    public final ascc a() {
        ascc asccVar = this.d;
        if (asccVar == null) {
            if (!bas.a) {
                return null;
            }
            ascc e = asck.e(1, 0, 3, 2);
            this.d = e;
            return e;
        }
        return asccVar;
    }

    @Override // defpackage.bbk, defpackage.doe
    public final void b(cjp cjpVar) {
        Rect rect;
        bbm bbmVar = this.a;
        if (bbmVar != null) {
            bbmVar.l = new Rect(arsk.g(cjpVar.b), arsk.g(cjpVar.c), arsk.g(cjpVar.d), arsk.g(cjpVar.e));
            if (bbmVar.j.isEmpty() && (rect = bbmVar.l) != null) {
                bbmVar.a.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    @Override // defpackage.bbk, defpackage.doe
    public final void c() {
        m(null);
    }

    @Override // defpackage.doe
    public final void d(doj dojVar, dno dnoVar, arqr arqrVar, arqr arqrVar2) {
        m(new AnonymousClass1(dojVar, this, dnoVar, arqrVar, arqrVar2));
    }

    @Override // defpackage.bbk
    public final void e() {
        ascc a = a();
        if (a != null) {
            a.h(arnb.a);
        }
    }

    @Override // defpackage.doe
    public final void f() {
        arxm arxmVar = this.c;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        this.c = null;
        ascc a = a();
        if (a != null) {
            a.e();
        }
    }

    @Override // defpackage.doe
    public final void g(doj dojVar, doj dojVar2) {
        int i;
        int i2;
        int i3;
        bbm bbmVar = this.a;
        if (bbmVar != null) {
            boolean z = true;
            if (a.bB(bbmVar.h.b, dojVar2.b) && d.F(bbmVar.h.c, dojVar2.c)) {
                z = false;
            }
            bbmVar.h = dojVar2;
            int size = bbmVar.j.size();
            for (int i4 = 0; i4 < size; i4++) {
                bbo bboVar = (bbo) ((WeakReference) bbmVar.j.get(i4)).get();
                if (bboVar != null) {
                    bboVar.a = dojVar2;
                }
            }
            bbj bbjVar = bbmVar.m;
            synchronized (bbjVar.a) {
                bbjVar.h = null;
                bbjVar.j = null;
                bbjVar.i = null;
                bbjVar.k = null;
                bbjVar.l = null;
            }
            int i5 = -1;
            if (d.F(dojVar, dojVar2)) {
                if (z) {
                    bbe bbeVar = bbmVar.b;
                    long j = dojVar2.b;
                    int d = djc.d(j);
                    int c = djc.c(j);
                    djc djcVar = bbmVar.h.c;
                    if (djcVar != null) {
                        i3 = djc.d(djcVar.b);
                    } else {
                        i3 = -1;
                    }
                    djc djcVar2 = bbmVar.h.c;
                    if (djcVar2 != null) {
                        i5 = djc.c(djcVar2.b);
                    }
                    bbeVar.e(d, c, i3, i5);
                    return;
                }
                return;
            }
            if (dojVar != null && (!d.F(dojVar.a(), dojVar2.a()) || (a.bB(dojVar.b, dojVar2.b) && !d.F(dojVar.c, dojVar2.c)))) {
                bbmVar.b.a();
                return;
            }
            int size2 = bbmVar.j.size();
            for (int i6 = 0; i6 < size2; i6++) {
                bbo bboVar2 = (bbo) ((WeakReference) bbmVar.j.get(i6)).get();
                if (bboVar2 != null) {
                    doj dojVar3 = bbmVar.h;
                    bbe bbeVar2 = bbmVar.b;
                    if (bboVar2.d) {
                        bboVar2.a = dojVar3;
                        if (bboVar2.c) {
                            bbeVar2.d(bboVar2.b, bbp.a(dojVar3));
                        }
                        djc djcVar3 = dojVar3.c;
                        if (djcVar3 != null) {
                            i = djc.d(djcVar3.b);
                        } else {
                            i = -1;
                        }
                        djc djcVar4 = dojVar3.c;
                        if (djcVar4 != null) {
                            i2 = djc.c(djcVar4.b);
                        } else {
                            i2 = -1;
                        }
                        bbeVar2.e(djc.d(dojVar3.b), djc.c(dojVar3.b), i, i2);
                    }
                }
            }
        }
    }

    @Override // defpackage.bbk, defpackage.doe
    public final void h(doj dojVar, dob dobVar, diy diyVar, arqr arqrVar, cjp cjpVar, cjp cjpVar2) {
        bbm bbmVar = this.a;
        if (bbmVar != null) {
            bbj bbjVar = bbmVar.m;
            synchronized (bbjVar.a) {
                bbjVar.h = dojVar;
                bbjVar.j = dobVar;
                bbjVar.i = diyVar;
                bbjVar.k = cjpVar;
                bbjVar.l = cjpVar2;
                if (bbjVar.c || bbjVar.b) {
                    bbjVar.a();
                }
            }
        }
    }
}
