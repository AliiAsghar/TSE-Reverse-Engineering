package defpackage;

import defpackage.asm;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class avc implements aig {
    private final boolean A;
    private int B;
    private asm.b C;
    private boolean D;
    private final byk E;
    private final byn F;
    private final byn G;
    private final byn a;
    private final aig b;
    public final auy c;
    public int d;
    public int e;
    public long f;
    public long g;
    public float h;
    public float i;
    public int j;
    public int k;
    public final byn l;
    public dqv m;
    public final ajr n;
    public final byk o;
    public final asm p;
    public final are q;
    public final aqx r;
    public final byn s;
    public final cvf t;
    public long u;
    public final asl v;
    public final byn w;
    public final byn x;
    public final byn y;
    public final byn z;

    /* compiled from: PG */
    /* renamed from: avc$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        Object a;
        Object b;
        int c;
        /* synthetic */ Object d;
        int f;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return avc.this.x(0, null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: avc$2 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arpw implements arqv<ahv, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ int c;
        final /* synthetic */ float d;
        final /* synthetic */ zr e;
        private /* synthetic */ Object f;

        /* compiled from: PG */
        /* renamed from: avc$2$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arrp implements arqv<ahv, Integer, arnb> {
            final /* synthetic */ avc a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(avc avcVar) {
                super(2);
                this.a = avcVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                this.a.A(((Number) obj2).intValue());
                return arnb.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, float f, zr zrVar, arpe arpeVar) {
            super(2, arpeVar);
            this.c = i;
            this.d = f;
            this.e = zrVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((ahv) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            boolean z;
            int e;
            int s;
            Object obj2 = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                ahv ahvVar = (ahv) this.f;
                avc avcVar = avc.this;
                ava avaVar = new ava(ahvVar, avcVar);
                int i2 = this.c;
                float f = this.d;
                zr zrVar = this.e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(avcVar);
                this.a = 1;
                anonymousClass1.a(ahvVar, new Integer(i2));
                int b = avaVar.b();
                int d = avaVar.d() - avaVar.b();
                if (i2 > b) {
                    z = true;
                } else {
                    z = false;
                }
                if (((z && i2 > avaVar.d()) || (!z && i2 < avaVar.b())) && Math.abs(i2 - avaVar.b()) >= 3) {
                    int i3 = d + 1;
                    if (z) {
                        s = arrn.r(i2 - i3, avaVar.b());
                    } else {
                        s = arrn.s(i3 + i2, avaVar.b());
                    }
                    avaVar.a.v(s, brg.a / avaVar.a.l(), true);
                }
                e = avaVar.e(i2);
                Object h = abq.h(brg.a, e + f, zrVar, new avg(new arry(), ahvVar), this, 4);
                if (h != arpl.a) {
                    h = arnb.a;
                }
                if (h == obj2) {
                    return obj2;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.c, this.d, this.e, arpeVar);
            anonymousClass2.f = obj;
            return anonymousClass2;
        }
    }

    /* compiled from: PG */
    /* renamed from: avc$3 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 implements cvf {
        public AnonymousClass3() {
        }

        @Override // defpackage.cga
        public final /* synthetic */ cga a(cga cgaVar) {
            return cfz.a(this, cgaVar);
        }

        @Override // defpackage.cga
        public final /* synthetic */ Object b(Object obj, arqv arqvVar) {
            return cgb.a(this, obj, arqvVar);
        }

        @Override // defpackage.cga
        public final /* synthetic */ boolean c(arqr arqrVar) {
            return cgb.b(this, arqrVar);
        }

        @Override // defpackage.cvf
        public final void d(cve cveVar) {
            avc.this.s.h(cveVar);
        }
    }

    /* compiled from: PG */
    /* renamed from: avc$4 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arps {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;
        afd f;

        public AnonymousClass4(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return avc.s(avc.this, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: avc$5 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqr<Float, Float> {
        public AnonymousClass5() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
        
            if (java.lang.Math.min((r12.h + r14) - r5.f, (r13.h + r14) - r5.g) > (-r15)) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
        
            r1 = r5.a;
            r12 = r1.size();
            r13 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00e1, code lost:
        
            if (r13 >= r12) goto L153;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e3, code lost:
        
            ((defpackage.atx) r1.get(r13)).c(r15);
            r13 = r13 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
        
            r1 = r5.r;
            r12 = r1.size();
            r13 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00f6, code lost:
        
            if (r13 >= r12) goto L154;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
        
            ((defpackage.atx) r1.get(r13)).c(r15);
            r13 = r13 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0104, code lost:
        
            r1 = r5.s;
            r12 = r1.size();
            r13 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x010b, code lost:
        
            if (r13 >= r12) goto L155;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x010d, code lost:
        
            ((defpackage.atx) r1.get(r13)).c(r15);
            r13 = r13 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
        
            r1 = r5.a;
            r12 = r5.b;
            r13 = r5.c;
            r14 = r5.d;
            r36 = r0;
            r0 = r5.e;
            r37 = r3;
            r3 = r5.f;
            r4 = r5.g;
            r39 = r6;
            r6 = r5.h;
            r6 = r5.i;
            r6 = r5.j;
            r7 = r5.k;
            r41 = r8;
            r27 = r5.l - r11;
            r28 = r5.m - r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0143, code lost:
        
            if (r5.n != false) goto L132;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0145, code lost:
        
            if (r15 <= 0) goto L131;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0148, code lost:
        
            r29 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x014d, code lost:
        
            r16 = new defpackage.auv(r1, r12, r13, r14, r0, r3, r4, r6, r7, r27, r28, r29, r5.o, r5.p, r5.q, r5.r, r5.s, r5.t);
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x014b, code lost:
        
            r29 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
        
            if (java.lang.Math.min(r5.f - r12.h, r5.g - r13.h) <= r15) goto L134;
         */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0189  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0198  */
        @Override // defpackage.arqr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r44) {
            /*
                Method dump skipped, instructions count: 475
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.avc.AnonymousClass5.a(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: avc$6 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqg<Integer> {
        public AnonymousClass6() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            int j;
            if (avc.this.i()) {
                j = avc.this.o.b();
            } else {
                j = avc.this.j();
            }
            return Integer.valueOf(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: avc$7 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends arrp implements arqg<Integer> {
        public AnonymousClass7() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            int j;
            if (!avc.this.i()) {
                j = avc.this.j();
            } else if (avc.this.n() != -1) {
                j = avc.this.n();
            } else if (Math.abs(avc.this.c()) >= Math.abs(avc.this.d())) {
                if (avc.this.w()) {
                    j = avc.this.d + 1;
                } else {
                    j = avc.this.d;
                }
            } else {
                j = avc.this.j();
            }
            return Integer.valueOf(avc.this.f(j));
        }
    }

    public avc(int i, float f) {
        double d = f;
        if (d < -0.5d || d > 0.5d) {
            aju.c("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.a = new byu(new cjn(0L), cav.a);
        auy auyVar = new auy(i, f, this);
        this.c = auyVar;
        this.d = i;
        this.f = Long.MAX_VALUE;
        this.b = new agv(new AnonymousClass5());
        this.A = true;
        this.B = -1;
        this.l = new byu(avf.a, byo.a);
        this.m = avf.b;
        this.n = new ajs();
        this.E = new bys(-1);
        this.o = new bys(i);
        new bxd(new AnonymousClass6(), cav.a);
        new bxd(new AnonymousClass7(), cav.a);
        this.p = new asm((byte[]) null);
        this.q = new are();
        this.r = new aqx();
        this.s = new byu(null, cav.a);
        this.t = new cvf() { // from class: avc.3
            public AnonymousClass3() {
            }

            @Override // defpackage.cga
            public final /* synthetic */ cga a(cga cgaVar) {
                return cfz.a(this, cgaVar);
            }

            @Override // defpackage.cga
            public final /* synthetic */ Object b(Object obj, arqv arqvVar) {
                return cgb.a(this, obj, arqvVar);
            }

            @Override // defpackage.cga
            public final /* synthetic */ boolean c(arqr arqrVar) {
                return cgb.b(this, arqrVar);
            }

            @Override // defpackage.cvf
            public final void d(cve cveVar) {
                avc.this.s.h(cveVar);
            }
        };
        this.u = dqt.l(0, 0, 15);
        this.v = new asl();
        ash ashVar = auyVar.e;
        this.w = new byu(arnb.a, byo.a);
        this.x = new byu(arnb.a, byo.a);
        this.F = new byu(false, cav.a);
        this.G = new byu(false, cav.a);
        this.y = new byu(false, cav.a);
        this.z = new byu(false, cav.a);
    }

    private final void B(int i) {
        this.E.d(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r8.e(r6, r7, r0) != r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r8 != r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object s(defpackage.avc r5, defpackage.afd r6, defpackage.arqv r7, defpackage.arpe r8) {
        /*
            boolean r0 = r8 instanceof defpackage.avc.AnonymousClass4
            if (r0 == 0) goto L13
            r0 = r8
            avc$4 r0 = (defpackage.avc.AnonymousClass4) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            avc$4 r0 = new avc$4
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r5 = r0.a
            defpackage.aqil.P(r8)
            goto L73
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r7 = r0.b
            afd r6 = r0.f
            java.lang.Object r5 = r0.a
            defpackage.aqil.P(r8)
            goto L4f
        L3e:
            defpackage.aqil.P(r8)
            r0.a = r5
            r0.f = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = r5.r(r0)
            if (r8 == r1) goto L7c
        L4f:
            r8 = r5
            avc r8 = (defpackage.avc) r8
            boolean r2 = r8.i()
            if (r2 != 0) goto L61
            int r2 = r8.j()
            byk r4 = r8.o
            r4.d(r2)
        L61:
            aig r8 = r8.b
            r0.a = r5
            r2 = 0
            r0.f = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L73
            goto L7c
        L73:
            avc r5 = (defpackage.avc) r5
            r6 = -1
            r5.B(r6)
            arnb r5 = defpackage.arnb.a
            return r5
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avc.s(avc, afd, arqv, arpe):java.lang.Object");
    }

    public static /* synthetic */ Object y(avc avcVar, int i, zr zrVar, arpe arpeVar, int i2) {
        if ((i2 & 4) != 0) {
            zrVar = zs.c(brg.a, brg.a, null, 7);
        }
        return avcVar.x(i, zrVar, arpeVar);
    }

    public static /* synthetic */ Object z(avc avcVar, int i, arpe arpeVar) {
        Object e;
        e = avcVar.e(afd.a, new ave(avcVar, i, null), arpeVar);
        if (e == arpl.a) {
            return e;
        }
        return arnb.a;
    }

    public final void A(int i) {
        B(f(i));
    }

    @Override // defpackage.aig
    public final float a(float f) {
        return this.b.a(f);
    }

    public abstract int b();

    public final float c() {
        return this.c.a();
    }

    public final float d() {
        dqv dqvVar = this.m;
        auv auvVar = avf.a;
        return Math.min(dqvVar.em(56.0f), k() / 2.0f) / k();
    }

    @Override // defpackage.aig
    public final Object e(afd afdVar, arqv arqvVar, arpe arpeVar) {
        return s(this, afdVar, arqvVar, arpeVar);
    }

    public final int f(int i) {
        if (b() <= 0) {
            return 0;
        }
        return arrn.u(i, 0, b() - 1);
    }

    @Override // defpackage.aig
    public final boolean g() {
        return ((Boolean) this.G.a()).booleanValue();
    }

    @Override // defpackage.aig
    public final boolean h() {
        return ((Boolean) this.F.a()).booleanValue();
    }

    @Override // defpackage.aig
    public final boolean i() {
        return this.b.i();
    }

    public final int j() {
        return this.c.b.b();
    }

    public final int k() {
        return ((auv) this.l.a()).b;
    }

    public final int l() {
        return k() + m();
    }

    public final int m() {
        return ((auv) this.l.a()).c;
    }

    public final int n() {
        return this.E.b();
    }

    public final long o() {
        return ((cjn) this.a.a()).a;
    }

    public final auk p() {
        return (auk) this.l.a();
    }

    public final cve q() {
        return (cve) this.s.a();
    }

    public final Object r(arpe arpeVar) {
        Object d = this.r.d(arpeVar);
        if (d == arpl.a) {
            return d;
        }
        return arnb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011e, code lost:
    
        if (((int) java.lang.Float.intBitsToFloat((int) (o() & 4294967295L))) == 0) goto L170;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a A[Catch: all -> 0x01e4, TryCatch #0 {all -> 0x01e4, blocks: (B:17:0x00b1, B:19:0x00c4, B:21:0x00c8, B:23:0x00d6, B:26:0x0120, B:29:0x0128, B:35:0x013a, B:37:0x0157, B:39:0x015d, B:41:0x0161, B:43:0x0165, B:45:0x0169, B:46:0x016c, B:48:0x017c, B:50:0x0196, B:52:0x019a, B:53:0x019e, B:55:0x01b3, B:57:0x01b7, B:58:0x0148, B:60:0x0106, B:62:0x0113, B:64:0x00ee), top: B:16:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0161 A[Catch: all -> 0x01e4, TryCatch #0 {all -> 0x01e4, blocks: (B:17:0x00b1, B:19:0x00c4, B:21:0x00c8, B:23:0x00d6, B:26:0x0120, B:29:0x0128, B:35:0x013a, B:37:0x0157, B:39:0x015d, B:41:0x0161, B:43:0x0165, B:45:0x0169, B:46:0x016c, B:48:0x017c, B:50:0x0196, B:52:0x019a, B:53:0x019e, B:55:0x01b3, B:57:0x01b7, B:58:0x0148, B:60:0x0106, B:62:0x0113, B:64:0x00ee), top: B:16:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c A[Catch: all -> 0x01e4, TryCatch #0 {all -> 0x01e4, blocks: (B:17:0x00b1, B:19:0x00c4, B:21:0x00c8, B:23:0x00d6, B:26:0x0120, B:29:0x0128, B:35:0x013a, B:37:0x0157, B:39:0x015d, B:41:0x0161, B:43:0x0165, B:45:0x0169, B:46:0x016c, B:48:0x017c, B:50:0x0196, B:52:0x019a, B:53:0x019e, B:55:0x01b3, B:57:0x01b7, B:58:0x0148, B:60:0x0106, B:62:0x0113, B:64:0x00ee), top: B:16:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019e A[Catch: all -> 0x01e4, TryCatch #0 {all -> 0x01e4, blocks: (B:17:0x00b1, B:19:0x00c4, B:21:0x00c8, B:23:0x00d6, B:26:0x0120, B:29:0x0128, B:35:0x013a, B:37:0x0157, B:39:0x015d, B:41:0x0161, B:43:0x0165, B:45:0x0169, B:46:0x016c, B:48:0x017c, B:50:0x0196, B:52:0x019a, B:53:0x019e, B:55:0x01b3, B:57:0x01b7, B:58:0x0148, B:60:0x0106, B:62:0x0113, B:64:0x00ee), top: B:16:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148 A[Catch: all -> 0x01e4, TryCatch #0 {all -> 0x01e4, blocks: (B:17:0x00b1, B:19:0x00c4, B:21:0x00c8, B:23:0x00d6, B:26:0x0120, B:29:0x0128, B:35:0x013a, B:37:0x0157, B:39:0x015d, B:41:0x0161, B:43:0x0165, B:45:0x0169, B:46:0x016c, B:48:0x017c, B:50:0x0196, B:52:0x019a, B:53:0x019e, B:55:0x01b3, B:57:0x01b7, B:58:0x0148, B:60:0x0106, B:62:0x0113, B:64:0x00ee), top: B:16:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113 A[Catch: all -> 0x01e4, TryCatch #0 {all -> 0x01e4, blocks: (B:17:0x00b1, B:19:0x00c4, B:21:0x00c8, B:23:0x00d6, B:26:0x0120, B:29:0x0128, B:35:0x013a, B:37:0x0157, B:39:0x015d, B:41:0x0161, B:43:0x0165, B:45:0x0169, B:46:0x016c, B:48:0x017c, B:50:0x0196, B:52:0x019a, B:53:0x019e, B:55:0x01b3, B:57:0x01b7, B:58:0x0148, B:60:0x0106, B:62:0x0113, B:64:0x00ee), top: B:16:0x00b1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(defpackage.auv r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avc.t(auv, boolean):void");
    }

    public final void u(long j) {
        this.a.h(new cjn(j));
    }

    public final void v(int i, float f, boolean z) {
        auy auyVar = this.c;
        auyVar.d(i, f);
        auyVar.d = null;
        if (z) {
            cve q = q();
            if (q != null) {
                q.e();
                return;
            }
            return;
        }
        ate.b(this.x);
    }

    public final boolean w() {
        return ((Boolean) this.y.a()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r12 != r1) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(int r12, defpackage.zr r13, defpackage.arpe r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.avc.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r14
            avc$1 r0 = (defpackage.avc.AnonymousClass1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            avc$1 r0 = new avc$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.d
            arpl r1 = defpackage.arpl.a
            int r2 = r0.f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.aqil.P(r14)
            goto L89
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            int r12 = r0.c
            java.lang.Object r13 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.aqil.P(r14)
        L3c:
            r9 = r13
            goto L66
        L3e:
            defpackage.aqil.P(r14)
            int r14 = r11.j()
            if (r12 != r14) goto L4f
            float r14 = r11.c()
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 == 0) goto L89
        L4f:
            int r14 = r11.b()
            if (r14 == 0) goto L89
            r0.a = r11
            r0.b = r13
            r0.c = r12
            r0.f = r5
            java.lang.Object r14 = r11.r(r0)
            if (r14 != r1) goto L64
            goto L88
        L64:
            r2 = r11
            goto L3c
        L66:
            r6 = r2
            avc r6 = (defpackage.avc) r6
            int r7 = r6.f(r12)
            int r12 = r6.l()
            float r12 = (float) r12
            float r8 = r12 * r3
            avc$2 r12 = new avc$2
            r10 = 0
            r5 = r12
            r5.<init>(r7, r8, r9, r10)
            r13 = 0
            r0.a = r13
            r0.b = r13
            r0.f = r4
            java.lang.Object r12 = defpackage.aif.a(r2, r12, r0)
            if (r12 != r1) goto L89
        L88:
            return r1
        L89:
            arnb r12 = defpackage.arnb.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avc.x(int, zr, arpe):java.lang.Object");
    }
}
