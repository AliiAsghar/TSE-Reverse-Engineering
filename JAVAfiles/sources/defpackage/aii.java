package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aii {
    public aig a;
    public afl b;
    public ahl c;
    public ahp d;
    public boolean e;
    public cqa f;
    public int g = 1;
    public ahv h = ahy.b;
    public final AnonymousClass3 i = new aho() { // from class: aii.3
        @Override // defpackage.aho
        public final long a(long j, int i) {
            aii aiiVar = aii.this;
            aiiVar.g = i;
            afl aflVar = aiiVar.b;
            if (aflVar != null && aiiVar.i()) {
                aii aiiVar2 = aii.this;
                return aflVar.a(j, aiiVar2.g, aiiVar2.j);
            }
            aii aiiVar3 = aii.this;
            return aiiVar3.c(aiiVar3.h, j, i);
        }

        @Override // defpackage.aho
        public final long b(long j) {
            aii aiiVar = aii.this;
            return aiiVar.c(aiiVar.h, j, 1);
        }
    };
    public final arqr j = new AnonymousClass4();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aii$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        /* synthetic */ Object a;
        int c;
        arsa d;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return aii.this.g(0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aii$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arpw implements arqv<aho, arpe<? super arnb>, Object> {
        Object a;
        Object b;
        long c;
        int d;
        final /* synthetic */ arsa f;
        final /* synthetic */ long g;
        private /* synthetic */ Object h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arsa arsaVar, long j, arpe arpeVar) {
            super(2, arpeVar);
            this.f = arsaVar;
            this.g = j;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((aho) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            float b;
            aii aiiVar;
            long j;
            Object obj2;
            Object obj3;
            long e;
            arpl arplVar = arpl.a;
            if (this.d != 0) {
                j = this.c;
                Object obj4 = this.b;
                Object obj5 = this.a;
                aiiVar = (aii) this.h;
                aqil.P(obj);
                obj3 = obj4;
                obj2 = obj5;
            } else {
                aqil.P(obj);
                final aho ahoVar = (aho) this.h;
                final aii aiiVar2 = aii.this;
                ahv ahvVar = new ahv() { // from class: aii.2.1
                    @Override // defpackage.ahv
                    public final float a(float f) {
                        if ((f > brg.a && !aii.this.a.h()) || (f < brg.a && !aii.this.a.g())) {
                            throw new CancellationException("The fling was cancelled");
                        }
                        aii aiiVar3 = aii.this;
                        return aiiVar3.a(aiiVar3.b(ahoVar.a(aiiVar3.d(aiiVar3.f(f)), 2)));
                    }
                };
                arsa arsaVar = this.f;
                long j2 = this.g;
                ahl ahlVar = aiiVar2.c;
                long j3 = arsaVar.a;
                if (aiiVar2.d == ahp.b) {
                    b = drp.a(j2);
                } else {
                    b = drp.b(j2);
                }
                float a = aiiVar2.a(b);
                this.h = aiiVar2;
                this.a = aiiVar2;
                this.b = arsaVar;
                this.c = j3;
                this.d = 1;
                obj = ahlVar.a(ahvVar, a, this);
                if (obj != arplVar) {
                    aiiVar = aiiVar2;
                    j = j3;
                    obj3 = arsaVar;
                    obj2 = aiiVar2;
                } else {
                    return arplVar;
                }
            }
            float a2 = aiiVar.a(((Number) obj).floatValue());
            if (((aii) obj2).d == ahp.b) {
                e = drp.e(j, a2, brg.a, 2);
            } else {
                e = drp.e(j, brg.a, a2, 1);
            }
            ((arsa) obj3).a = e;
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f, this.g, arpeVar);
            anonymousClass2.h = obj;
            return anonymousClass2;
        }
    }

    /* compiled from: PG */
    /* renamed from: aii$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqr<cjn, cjn> {
        public AnonymousClass4() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((cjn) obj).a;
            aii aiiVar = aii.this;
            return new cjn(aiiVar.c(aiiVar.h, j, aiiVar.g));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aii$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arpw implements arqv<ahv, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ arqv c;
        private /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(arqv arqvVar, arpe arpeVar) {
            super(2, arpeVar);
            this.c = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass5) c((ahv) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                ahv ahvVar = (ahv) this.d;
                aii aiiVar = aii.this;
                aiiVar.h = ahvVar;
                arqv arqvVar = this.c;
                this.a = 1;
                if (arqvVar.a(aiiVar.i, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.c, arpeVar);
            anonymousClass5.d = obj;
            return anonymousClass5;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [aii$3] */
    public aii(aig aigVar, afl aflVar, ahl ahlVar, ahp ahpVar, boolean z, cqa cqaVar) {
        this.a = aigVar;
        this.b = aflVar;
        this.c = ahlVar;
        this.d = ahpVar;
        this.e = z;
        this.f = cqaVar;
    }

    public final float a(float f) {
        if (this.e) {
            return -f;
        }
        return f;
    }

    public final float b(long j) {
        long j2;
        if (this.d == ahp.b) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public final long c(ahv ahvVar, long j, int i) {
        long b = this.f.b(j, i);
        long Q = a.Q(j, b);
        long d = d(f(ahvVar.a(b(d(e(Q))))));
        return d.aH(d.aH(b, d), this.f.a(d, a.Q(Q, d), i));
    }

    public final long d(long j) {
        if (this.e) {
            return cjn.e(j, -1.0f);
        }
        return j;
    }

    public final long e(long j) {
        int i;
        if (this.d == ahp.b) {
            i = 1;
        } else {
            i = 2;
        }
        return cjn.h(j, brg.a, i);
    }

    public final long f(float f) {
        long floatToRawIntBits;
        long j;
        if (f == brg.a) {
            return 0L;
        }
        if (this.d == ahp.b) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(f);
            floatToRawIntBits = Float.floatToRawIntBits(brg.a);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(brg.a);
            floatToRawIntBits = Float.floatToRawIntBits(f);
            j = floatToRawIntBits3 << 32;
        }
        return j | (floatToRawIntBits & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(long r12, defpackage.arpe r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.aii.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r14
            aii$1 r0 = (defpackage.aii.AnonymousClass1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aii$1 r0 = new aii$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            arsa r12 = r0.d
            defpackage.aqil.P(r14)
            goto L52
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            defpackage.aqil.P(r14)
            arsa r14 = new arsa
            r14.<init>()
            r14.a = r12
            afd r2 = defpackage.afd.a
            aii$2 r10 = new aii$2
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r4.<init>(r6, r7, r9)
            r0.d = r14
            r0.c = r3
            java.lang.Object r12 = r11.h(r2, r10, r0)
            if (r12 == r1) goto L5a
            r12 = r14
        L52:
            long r12 = r12.a
            drp r14 = new drp
            r14.<init>(r12)
            return r14
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aii.g(long, arpe):java.lang.Object");
    }

    public final Object h(afd afdVar, arqv arqvVar, arpe arpeVar) {
        Object e = this.a.e(afdVar, new AnonymousClass5(arqvVar, null), arpeVar);
        if (e == arpl.a) {
            return e;
        }
        return arnb.a;
    }

    public final boolean i() {
        if (!this.a.h() && !this.a.g()) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        if (this.d == ahp.a) {
            return true;
        }
        return false;
    }
}
