package defpackage;

import defpackage.bwj;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cao {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cao$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqv<bza, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ arpi b;
        final /* synthetic */ asai c;
        private /* synthetic */ Object d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: cao$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
            int a;
            final /* synthetic */ asai b;
            final /* synthetic */ bza c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(asai asaiVar, bza bzaVar, arpe arpeVar) {
                super(2, arpeVar);
                this.b = asaiVar;
                this.c = bzaVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }

            @Override // defpackage.arpq
            public final Object b(Object obj) {
                arpl arplVar = arpl.a;
                int i = this.a;
                aqil.P(obj);
                if (i == 0) {
                    asai asaiVar = this.b;
                    final bza bzaVar = this.c;
                    asaj asajVar = new asaj() { // from class: cao.1.2.1
                        @Override // defpackage.asaj
                        public final Object fv(Object obj2, arpe arpeVar) {
                            bza.this.h(obj2);
                            return arnb.a;
                        }
                    };
                    this.a = 1;
                    if (asaiVar.a(asajVar, this) == arplVar) {
                        return arplVar;
                    }
                }
                return arnb.a;
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                return new AnonymousClass2(this.b, this.c, arpeVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arpi arpiVar, asai asaiVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = arpiVar;
            this.c = asaiVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((bza) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        
            if (defpackage.arro.q(r1, r3, r5) == r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
        
            if (r1.a(r3, r5) == r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
        
            return r0;
         */
        @Override // defpackage.arpq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.Object r6) {
            /*
                r5 = this;
                arpl r0 = defpackage.arpl.a
                int r1 = r5.a
                r2 = 1
                defpackage.aqil.P(r6)
                if (r1 == 0) goto Lb
                goto L3d
            Lb:
                java.lang.Object r6 = r5.d
                bza r6 = (defpackage.bza) r6
                arpi r1 = r5.b
                arpj r3 = defpackage.arpj.a
                boolean r1 = defpackage.d.F(r1, r3)
                if (r1 == 0) goto L29
                asai r1 = r5.c
                cao$1$1 r3 = new cao$1$1
                r3.<init>()
                r5.a = r2
                java.lang.Object r6 = r1.a(r3, r5)
                if (r6 != r0) goto L3d
                goto L3c
            L29:
                arpi r1 = r5.b
                asai r2 = r5.c
                cao$1$2 r3 = new cao$1$2
                r4 = 0
                r3.<init>(r2, r6, r4)
                r6 = 2
                r5.a = r6
                java.lang.Object r6 = defpackage.arro.q(r1, r3, r5)
                if (r6 != r0) goto L3d
            L3c:
                return r0
            L3d:
                arnb r6 = defpackage.arnb.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.cao.AnonymousClass1.b(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, arpeVar);
            anonymousClass1.d = obj;
            return anonymousClass1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cao$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arpw implements arqv<asaj, arpe<? super arnb>, Object> {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        int f;
        final /* synthetic */ arqg g;
        private /* synthetic */ Object h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: cao$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arrp implements arqr<Object, arnb> {
            final /* synthetic */ vh a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(vh vhVar) {
                super(1);
                this.a = vhVar;
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                if (obj instanceof cfh) {
                    ((cfh) obj).k(4);
                }
                this.a.j(obj);
                return arnb.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: cao$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00412 extends arrp implements arqv<Set<? extends Object>, ces, arnb> {
            final /* synthetic */ arzj a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00412(arzj arzjVar) {
                super(2);
                this.a = arzjVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                Set set = (Set) obj;
                if (set instanceof cbj) {
                    vh vhVar = ((cbj) set).a;
                    Object[] objArr = vhVar.b;
                    long[] jArr = vhVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        loop0: while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = i - length;
                                int i3 = 0;
                                while (true) {
                                    int i4 = 8 - ((~i2) >>> 31);
                                    if (i3 < i4) {
                                        if ((255 & j) < 128) {
                                            Object obj3 = objArr[(i << 3) + i3];
                                            if (!(obj3 instanceof cfh) || ((cfh) obj3).l(4)) {
                                                break loop0;
                                            }
                                        }
                                        j >>= 8;
                                        i3++;
                                    } else if (i4 != 8) {
                                        break;
                                    }
                                }
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                } else if (!(set instanceof Collection) || !set.isEmpty()) {
                    for (Object obj4 : set) {
                        if ((obj4 instanceof cfh) && !((cfh) obj4).l(4)) {
                        }
                        this.a.c(set);
                    }
                }
                return arnb.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arqg arqgVar, arpe arpeVar) {
            super(2, arpeVar);
            this.g = arqgVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((asaj) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:78:0x00fe, code lost:
        
            if (r13 != 8) goto L113;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x00a6, code lost:
        
            if (r11 != r0) goto L25;
         */
        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x017a A[LOOP:0: B:12:0x00ab->B:17:0x017a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0126 A[EDGE_INSN: B:18:0x0126->B:19:0x0126 BREAK  A[LOOP:0: B:12:0x00ab->B:17:0x017a], SYNTHETIC] */
        @Override // defpackage.arpq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 405
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.cao.AnonymousClass2.b(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.g, arpeVar);
            anonymousClass2.h = obj;
            return anonymousClass2;
        }
    }

    public static final asai a(arqg arqgVar) {
        return new asaa(new AnonymousClass2(arqgVar, null));
    }

    public static final cas b(asai asaiVar, Object obj, arpi arpiVar, bwj bwjVar, int i) {
        if ((i & 2) != 0) {
            arpiVar = arpj.a;
        }
        boolean I = bwjVar.I(arpiVar) | bwjVar.I(asaiVar);
        Object h = bwjVar.h();
        if (I || h == bwj.a.a) {
            h = new AnonymousClass1(arpiVar, asaiVar, null);
            bwjVar.B(h);
        }
        arqv arqvVar = (arqv) h;
        Object h2 = bwjVar.h();
        if (h2 == bwj.a.a) {
            Object byuVar = new byu(obj, cav.a);
            bwjVar.B(byuVar);
            h2 = byuVar;
        }
        byn bynVar = (byn) h2;
        boolean I2 = bwjVar.I(arqvVar);
        Object h3 = bwjVar.h();
        if (I2 || h3 == bwj.a.a) {
            h3 = new can(arqvVar, bynVar, null);
            bwjVar.B(h3);
        }
        bxl.f(asaiVar, arpiVar, (arqv) h3, bwjVar);
        return bynVar;
    }
}
