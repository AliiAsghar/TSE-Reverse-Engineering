package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zl {
    public static final /* synthetic */ int a = 0;
    private static final abm b = zs.c(brg.a, brg.a, null, 7);
    private static final abm c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: zl$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        final /* synthetic */ arzj a;
        final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arzj arzjVar, Object obj) {
            super(0);
            this.a = arzjVar;
            this.b = obj;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            this.a.c(this.b);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: zl$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        Object a;
        int b;
        final /* synthetic */ arzj c;
        final /* synthetic */ zj d;
        final /* synthetic */ cas e;
        final /* synthetic */ cas f;
        private /* synthetic */ Object g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: zl$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
            int a;
            final /* synthetic */ Object b;
            final /* synthetic */ zj c;
            final /* synthetic */ cas d;
            final /* synthetic */ cas e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Object obj, zj zjVar, cas casVar, cas casVar2, arpe arpeVar) {
                super(2, arpeVar);
                this.b = obj;
                this.c = zjVar;
                this.d = casVar;
                this.e = casVar2;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }

            @Override // defpackage.arpq
            public final Object b(Object obj) {
                arpl arplVar = arpl.a;
                int i = this.a;
                aqil.P(obj);
                if (i == 0) {
                    if (!d.F(this.b, this.c.c())) {
                        zj zjVar = this.c;
                        Object obj2 = this.b;
                        cas casVar = this.d;
                        int i2 = zl.a;
                        zr zrVar = (zr) casVar.a();
                        this.a = 1;
                        if (zj.j(zjVar, obj2, zrVar, this, 12) == arplVar) {
                            return arplVar;
                        }
                    }
                    return arnb.a;
                }
                cas casVar2 = this.e;
                int i3 = zl.a;
                arqr arqrVar = (arqr) casVar2.a();
                if (arqrVar != null) {
                    arqrVar.a(this.c.d());
                }
                return arnb.a;
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                return new AnonymousClass1(this.b, this.c, this.d, this.e, arpeVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arzj arzjVar, zj zjVar, cas casVar, cas casVar2, arpe arpeVar) {
            super(2, arpeVar);
            this.c = arzjVar;
            this.d = zjVar;
            this.e = casVar;
            this.f = casVar2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002c -> B:4:0x002f). Please report as a decompilation issue!!! */
        @Override // defpackage.arpq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.Object r11) {
            /*
                r10 = this;
                arpl r0 = defpackage.arpl.a
                int r1 = r10.b
                if (r1 == 0) goto L10
                java.lang.Object r1 = r10.a
                java.lang.Object r2 = r10.g
                arwe r2 = (defpackage.arwe) r2
                defpackage.aqil.P(r11)
                goto L2f
            L10:
                defpackage.aqil.P(r11)
                java.lang.Object r11 = r10.g
                arwe r11 = (defpackage.arwe) r11
                arzj r1 = r10.c
                aryz r1 = r1.B()
                r2 = r11
            L1e:
                r10.g = r2
                r10.a = r1
                r11 = 1
                r10.b = r11
                r11 = r1
                aryz r11 = (defpackage.aryz) r11
                java.lang.Object r11 = r11.a(r10)
                if (r11 != r0) goto L2f
                return r0
            L2f:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L60
                r11 = r1
                aryz r11 = (defpackage.aryz) r11
                java.lang.Object r11 = r11.b()
                arzj r3 = r10.c
                java.lang.Object r3 = r3.m()
                java.lang.Object r3 = defpackage.arzn.a(r3)
                if (r3 == 0) goto L4c
                r5 = r3
                goto L4d
            L4c:
                r5 = r11
            L4d:
                zj r6 = r10.d
                cas r7 = r10.e
                cas r8 = r10.f
                zl$2$1 r11 = new zl$2$1
                r9 = 0
                r4 = r11
                r4.<init>(r5, r6, r7, r8, r9)
                r3 = 3
                r4 = 0
                defpackage.arrn.J(r2, r4, r4, r11, r3)
                goto L1e
            L60:
                arnb r11 = defpackage.arnb.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zl.AnonymousClass2.b(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.c, this.d, this.e, this.f, arpeVar);
            anonymousClass2.g = obj;
            return anonymousClass2;
        }
    }

    static {
        cjp cjpVar = acz.a;
        c = zs.c(brg.a, brg.a, new dqy(0.1f), 3);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
    }

    public static final cas a(Object obj, acg acgVar, zr zrVar, Object obj2, arqr arqrVar, bwj bwjVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            Object h = bwjVar.h();
            if (h == bwj.a.a) {
                h = zs.c(brg.a, brg.a, null, 7);
                bwjVar.B(h);
            }
            zrVar = (abm) h;
        }
        if ((i2 & 8) != 0) {
            obj2 = null;
        }
        Object h2 = bwjVar.h();
        if (h2 == bwj.a.a) {
            Object byuVar = new byu(null, cav.a);
            bwjVar.B(byuVar);
            h2 = byuVar;
        }
        byn bynVar = (byn) h2;
        Object h3 = bwjVar.h();
        if (h3 == bwj.a.a) {
            h3 = new zj(obj, acgVar, obj2);
            bwjVar.B(h3);
        }
        zj zjVar = (zj) h3;
        cas a2 = cap.a(arqrVar, bwjVar);
        if (obj2 != null && (zrVar instanceof abm)) {
            abm abmVar = (abm) zrVar;
            if (!d.F(abmVar.c, obj2)) {
                zrVar = new abm(abmVar.a, abmVar.b, obj2);
            }
        }
        cas a3 = cap.a(zrVar, bwjVar);
        Object h4 = bwjVar.h();
        boolean z = false;
        if (h4 == bwj.a.a) {
            h4 = arhi.t(-1, 0, 6);
            bwjVar.B(h4);
        }
        arzj arzjVar = (arzj) h4;
        boolean I = bwjVar.I(arzjVar);
        if ((((i & 14) ^ 6) > 4 && bwjVar.I(obj)) || (6 & i) == 4) {
            z = true;
        }
        boolean z2 = I | z;
        Object h5 = bwjVar.h();
        if (z2 || h5 == bwj.a.a) {
            h5 = new AnonymousClass1(arzjVar, obj);
            bwjVar.B(h5);
        }
        bxl.h((arqg) h5, bwjVar);
        boolean I2 = bwjVar.I(arzjVar) | bwjVar.I(zjVar) | bwjVar.G(a3) | bwjVar.G(a2);
        Object h6 = bwjVar.h();
        if (I2 || h6 == bwj.a.a) {
            h6 = new AnonymousClass2(arzjVar, zjVar, a3, a2, null);
            bwjVar.B(h6);
        }
        bxl.g(arzjVar, (arqv) h6, bwjVar);
        cas casVar = (cas) bynVar.a();
        if (casVar == null) {
            return zjVar.b;
        }
        return casVar;
    }

    public static final cas b(float f, zr zrVar, bwj bwjVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            zrVar = c;
        }
        zr zrVar2 = zrVar;
        dqy dqyVar = new dqy(f);
        int i3 = i & 14;
        int i4 = i << 3;
        return a(dqyVar, aci.c, zrVar2, null, null, bwjVar, i3 | (i4 & 896) | (57344 & (i << 6)), 8);
    }

    public static final cas c(float f, zr zrVar, arqr arqrVar, bwj bwjVar, int i, int i2) {
        float f2;
        if ((i2 & 2) != 0) {
            zrVar = b;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.01f;
        } else {
            f2 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            arqrVar = null;
        }
        arqr arqrVar2 = arqrVar;
        bwjVar.y(313401822);
        if (zrVar == b) {
            boolean z = true;
            if ((((i & 896) ^ 384) <= 256 || !bwjVar.D(f2)) && (i & 384) != 256) {
                z = false;
            }
            Object h = bwjVar.h();
            if (z || h == bwj.a.a) {
                h = zs.c(brg.a, brg.a, Float.valueOf(f2), 3);
                bwjVar.B(h);
            }
            zrVar = (abm) h;
        }
        bwjVar.q();
        int i3 = i << 3;
        return a(Float.valueOf(f), aci.a, zrVar, Float.valueOf(f2), arqrVar2, bwjVar, (i & 14) | (i3 & 7168) | (i3 & 57344), 0);
    }
}
