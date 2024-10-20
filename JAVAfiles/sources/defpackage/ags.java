package defpackage;

import defpackage.agq;
import defpackage.cga;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ags extends cga.c implements avn, cxg, cwm {
    public ahp a;
    public final aii b;
    public boolean c;
    public agq d;
    public cti f;
    public boolean g;
    public boolean i;
    private cjp j;
    public final ago e = new ago();
    public long h = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ags$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ aiu c;
        final /* synthetic */ agq d;
        private /* synthetic */ Object e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: ags$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00051 extends arpw implements arqv<aho, arpe<? super arnb>, Object> {
            int a;
            final /* synthetic */ aiu b;
            final /* synthetic */ ags c;
            final /* synthetic */ agq d;
            final /* synthetic */ arxm e;
            private /* synthetic */ Object f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PG */
            /* renamed from: ags$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00061 extends arrp implements arqr<Float, arnb> {
                final /* synthetic */ ags a;
                final /* synthetic */ arxm b;
                final /* synthetic */ aho c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00061(ags agsVar, arxm arxmVar, aho ahoVar) {
                    super(1);
                    this.a = agsVar;
                    this.b = arxmVar;
                    this.c = ahoVar;
                }

                @Override // defpackage.arqr
                public final /* bridge */ /* synthetic */ Object a(Object obj) {
                    float f;
                    float floatValue = ((Number) obj).floatValue();
                    ags agsVar = this.a;
                    if (true != agsVar.c) {
                        f = -1.0f;
                    } else {
                        f = 1.0f;
                    }
                    aii aiiVar = agsVar.b;
                    float b = f * aiiVar.b(aiiVar.d(this.c.b(aiiVar.d(aiiVar.f(f * floatValue)))));
                    if (Math.abs(b) < Math.abs(floatValue)) {
                        arwi.x(this.b, "Scroll animation cancelled because scroll was not consumed (" + b + " < " + floatValue + ')', null);
                    }
                    return arnb.a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PG */
            /* renamed from: ags$1$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends arrp implements arqg<arnb> {
                final /* synthetic */ ags a;
                final /* synthetic */ aiu b;
                final /* synthetic */ agq c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(ags agsVar, aiu aiuVar, agq agqVar) {
                    super(0);
                    this.a = agsVar;
                    this.b = aiuVar;
                    this.c = agqVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
                
                    if (r0.g == false) goto L21;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
                
                    r0 = r0.d();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
                
                    if (r0 == null) goto L21;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
                
                    if (defpackage.ags.i(r4.a, r0) != true) goto L21;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
                
                    r4.a.g = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
                
                    r4.b.e = r4.a.a(r4.c);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
                
                    return defpackage.arnb.a;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
                
                    r0 = r4.a;
                 */
                @Override // defpackage.arqg
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final /* bridge */ /* synthetic */ java.lang.Object a() {
                    /*
                        r4 = this;
                    L0:
                        ags r0 = r4.a
                        ago r1 = r0.e
                        cbh r2 = r1.a
                        int r3 = r2.b
                        if (r3 == 0) goto L43
                        if (r3 == 0) goto L3a
                        int r3 = r3 + (-1)
                        java.lang.Object[] r2 = r2.a
                        r2 = r2[r3]
                        ags$a r2 = (ags.a) r2
                        arqg r2 = r2.a
                        java.lang.Object r2 = r2.a()
                        if (r2 != 0) goto L1d
                        goto L26
                    L1d:
                        cjp r2 = (defpackage.cjp) r2
                        boolean r0 = defpackage.ags.i(r0, r2)
                        if (r0 != 0) goto L26
                        goto L43
                    L26:
                        cbh r0 = r1.a
                        int r1 = r0.b
                        int r1 = r1 + (-1)
                        java.lang.Object r0 = r0.c(r1)
                        ags$a r0 = (ags.a) r0
                        arvo r0 = r0.b
                        arnb r1 = defpackage.arnb.a
                        r0.w(r1)
                        goto L0
                    L3a:
                        defpackage.cbh.q()
                        armj r0 = new armj
                        r0.<init>()
                        throw r0
                    L43:
                        ags r0 = r4.a
                        boolean r1 = r0.g
                        if (r1 == 0) goto L5d
                        cjp r0 = r0.d()
                        if (r0 == 0) goto L5d
                        ags r1 = r4.a
                        boolean r0 = defpackage.ags.i(r1, r0)
                        r1 = 1
                        if (r0 != r1) goto L5d
                        ags r0 = r4.a
                        defpackage.ags.h(r0)
                    L5d:
                        aiu r0 = r4.b
                        ags r1 = r4.a
                        agq r2 = r4.c
                        float r1 = r1.a(r2)
                        r0.e = r1
                        arnb r0 = defpackage.arnb.a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ags.AnonymousClass1.C00051.AnonymousClass2.a():java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00051(aiu aiuVar, ags agsVar, agq agqVar, arxm arxmVar, arpe arpeVar) {
                super(2, arpeVar);
                this.b = aiuVar;
                this.c = agsVar;
                this.d = agqVar;
                this.e = arxmVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((C00051) c((aho) obj, (arpe) obj2)).b(arnb.a);
            }

            @Override // defpackage.arpq
            public final Object b(Object obj) {
                arpl arplVar = arpl.a;
                int i = this.a;
                aqil.P(obj);
                if (i == 0) {
                    aho ahoVar = (aho) this.f;
                    this.b.e = this.c.a(this.d);
                    aiu aiuVar = this.b;
                    ags agsVar = this.c;
                    C00061 c00061 = new C00061(agsVar, this.e, ahoVar);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(agsVar, aiuVar, this.d);
                    this.a = 1;
                    if (aiuVar.a(c00061, anonymousClass2, this) == arplVar) {
                        return arplVar;
                    }
                }
                return arnb.a;
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                C00051 c00051 = new C00051(this.b, this.c, this.d, this.e, arpeVar);
                c00051.f = obj;
                return c00051;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(aiu aiuVar, agq agqVar, arpe arpeVar) {
            super(2, arpeVar);
            this.c = aiuVar;
            this.d = agqVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            CancellationException cancellationException = null;
            try {
                try {
                    if (this.a != 0) {
                        aqil.P(obj);
                    } else {
                        aqil.P(obj);
                        arxm v = arwi.v(((arwe) this.e).b());
                        ags agsVar = ags.this;
                        agsVar.i = true;
                        aii aiiVar = agsVar.b;
                        afd afdVar = afd.a;
                        C00051 c00051 = new C00051(this.c, ags.this, this.d, v, null);
                        this.a = 1;
                        if (aiiVar.h(afdVar, c00051, this) == arplVar) {
                            return arplVar;
                        }
                    }
                    ago agoVar = ags.this.e;
                    artb B = arrn.B(0, agoVar.a.b);
                    int i = B.a;
                    int i2 = B.b;
                    if (i <= i2) {
                        while (true) {
                            ((a) agoVar.a.a[i]).b.w(arnb.a);
                            if (i == i2) {
                                break;
                            }
                            i++;
                        }
                    }
                    agoVar.a.g();
                    ags agsVar2 = ags.this;
                    agsVar2.i = false;
                    agsVar2.e.a(null);
                    ags.this.g = false;
                    return arnb.a;
                } catch (CancellationException e) {
                    cancellationException = e;
                    throw cancellationException;
                }
            } catch (Throwable th) {
                ags agsVar3 = ags.this;
                agsVar3.i = false;
                agsVar3.e.a(cancellationException);
                ags.this.g = false;
                throw th;
            }
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.d, arpeVar);
            anonymousClass1.e = obj;
            return anonymousClass1;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final arqg a;
        public final arvo b;

        public a(arqg arqgVar, arvo arvoVar) {
            this.a = arqgVar;
            this.b = arvoVar;
        }

        public final String toString() {
            String str;
            String str2;
            arwd arwdVar = (arwd) ((arvp) this.b).b.get(arwd.b);
            if (arwdVar != null) {
                str = arwdVar.a;
            } else {
                str = null;
            }
            StringBuilder sb = new StringBuilder("Request@");
            int hashCode = hashCode();
            arro.i(16);
            String num = Integer.toString(hashCode, 16);
            num.getClass();
            sb.append(num);
            if (str != null) {
                str2 = "[" + str + "](";
            } else {
                str2 = "(";
            }
            sb.append(str2);
            sb.append("currentBounds()=");
            sb.append(this.a.a());
            sb.append(", continuation=");
            sb.append(this.b);
            sb.append(')');
            return sb.toString();
        }
    }

    public ags(ahp ahpVar, aii aiiVar, boolean z, agq agqVar) {
        this.a = ahpVar;
        this.b = aiiVar;
        this.c = z;
        this.d = agqVar;
    }

    public static /* synthetic */ boolean i(ags agsVar, cjp cjpVar) {
        return agsVar.k(cjpVar, agsVar.h);
    }

    private final agq j() {
        agq agqVar = this.d;
        if (agqVar == null) {
            return (agq) cwn.a(this, agr.a);
        }
        return agqVar;
    }

    private final boolean k(cjp cjpVar, long j) {
        long b = b(cjpVar, j);
        if (Math.abs(Float.intBitsToFloat((int) (b >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (b & 4294967295L))) <= 0.5f) {
            return true;
        }
        return false;
    }

    public final float a(agq agqVar) {
        Object obj;
        Object obj2;
        int compare;
        if (defpackage.a.bB(this.h, 0L)) {
            return brg.a;
        }
        cbh cbhVar = this.e.a;
        int i = cbhVar.b;
        if (i > 0) {
            Object[] objArr = cbhVar.a;
            int i2 = i - 1;
            obj = null;
            while (true) {
                Object a2 = ((a) objArr[i2]).a.a();
                if (a2 != null) {
                    long b = ((cjp) a2).b();
                    long c = drj.c(this.h);
                    ahp ahpVar = this.a;
                    ahp ahpVar2 = ahp.a;
                    int ordinal = ahpVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            compare = Float.compare(Float.intBitsToFloat((int) (b >> 32)), Float.intBitsToFloat((int) (c >> 32)));
                        } else {
                            throw new armm();
                        }
                    } else {
                        compare = Float.compare(Float.intBitsToFloat((int) (b & 4294967295L)), Float.intBitsToFloat((int) (c & 4294967295L)));
                    }
                    if (compare <= 0) {
                        obj = a2;
                    } else if (obj == null) {
                        obj = a2;
                    }
                }
                i2--;
                if (i2 < 0) {
                    break;
                }
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            if (this.g) {
                obj2 = d();
            } else {
                obj2 = null;
            }
            if (obj2 == null) {
                return brg.a;
            }
            obj = obj2;
        }
        long c2 = drj.c(this.h);
        ahp ahpVar3 = this.a;
        ahp ahpVar4 = ahp.a;
        int ordinal2 = ahpVar3.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                cjp cjpVar = (cjp) obj;
                float f = cjpVar.b;
                return agqVar.a(f, cjpVar.d - f, Float.intBitsToFloat((int) (c2 >> 32)));
            }
            throw new armm();
        }
        cjp cjpVar2 = (cjp) obj;
        float f2 = cjpVar2.c;
        return agqVar.a(f2, cjpVar2.e - f2, Float.intBitsToFloat((int) (c2 & 4294967295L)));
    }

    public final long b(cjp cjpVar, long j) {
        long floatToRawIntBits;
        long j2;
        long c = drj.c(j);
        ahp ahpVar = this.a;
        ahp ahpVar2 = ahp.a;
        int ordinal = ahpVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                agq j3 = j();
                float f = cjpVar.b;
                long floatToRawIntBits2 = Float.floatToRawIntBits(j3.a(f, cjpVar.d - f, Float.intBitsToFloat((int) (c >> 32))));
                floatToRawIntBits = Float.floatToRawIntBits(brg.a);
                j2 = floatToRawIntBits2 << 32;
            } else {
                throw new armm();
            }
        } else {
            agq j4 = j();
            float f2 = cjpVar.c;
            float a2 = j4.a(f2, cjpVar.e - f2, Float.intBitsToFloat((int) (c & 4294967295L)));
            long floatToRawIntBits3 = Float.floatToRawIntBits(brg.a);
            floatToRawIntBits = Float.floatToRawIntBits(a2);
            j2 = floatToRawIntBits3 << 32;
        }
        return j2 | (floatToRawIntBits & 4294967295L);
    }

    public final cjp d() {
        if (this.z) {
            cti c = cwp.c(this);
            cti ctiVar = this.f;
            if (ctiVar != null) {
                if (true != ctiVar.r()) {
                    ctiVar = null;
                }
                if (ctiVar != null) {
                    return c.n(ctiVar, false);
                }
            }
        }
        return null;
    }

    @Override // cga.c
    public final boolean dL() {
        return false;
    }

    @Override // defpackage.cxg
    public final void dX(long j) {
        int a2;
        cjp d;
        long j2 = this.h;
        this.h = j;
        ahp ahpVar = this.a;
        ahp ahpVar2 = ahp.a;
        int ordinal = ahpVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                a2 = arro.a((int) (j >> 32), (int) (j2 >> 32));
            } else {
                throw new armm();
            }
        } else {
            a2 = arro.a((int) (j & 4294967295L), (int) (4294967295L & j2));
        }
        if (a2 < 0 && (d = d()) != null) {
            cjp cjpVar = this.j;
            if (cjpVar == null) {
                cjpVar = d;
            }
            if (!this.i && !this.g && k(cjpVar, j2) && !k(d, j)) {
                this.g = true;
                e();
            }
            this.j = d;
        }
    }

    public final void e() {
        agq j = j();
        if (this.i) {
            aju.d("launchAnimation called when previous animation was running");
        }
        int i = agq.a;
        arrn.J(B(), null, arwf.d, new AnonymousClass1(new aiu(agq.a.a), j, null), 1);
    }

    @Override // defpackage.cxg
    public final /* synthetic */ void dW(cti ctiVar) {
    }
}
