package defpackage;

import androidx.compose.foundation.gestures.ScrollableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahy {
    public static final arqr a = AnonymousClass1.a;
    public static final ahv b = new ahv() { // from class: ahy.3
        @Override // defpackage.ahv
        public final float a(float f) {
            return f;
        }
    };
    public static final cge c = new cge() { // from class: ahy.2
        @Override // defpackage.cge
        public final float a() {
            return 1.0f;
        }

        @Override // defpackage.arpi
        public final <R> R fold(R r, arqv<? super R, ? super arpg, ? extends R> arqvVar) {
            return (R) arhi.k(this, r, arqvVar);
        }

        @Override // defpackage.arpg, defpackage.arpi
        public final <E extends arpg> E get(arph<E> arphVar) {
            return (E) arhi.l(this, arphVar);
        }

        @Override // defpackage.arpg
        public final /* synthetic */ arph getKey() {
            return cge.a;
        }

        @Override // defpackage.arpi
        public final arpi minusKey(arph<?> arphVar) {
            return arhi.m(this, arphVar);
        }

        @Override // defpackage.arpi
        public final arpi plus(arpi arpiVar) {
            return arhi.n(this, arpiVar);
        }
    };
    public static final AnonymousClass4 d = new dqv() { // from class: ahy.4
        @Override // defpackage.dqv
        public final float ec() {
            return 1.0f;
        }

        @Override // defpackage.drc
        public final float ed() {
            return 1.0f;
        }

        @Override // defpackage.drc
        public final /* synthetic */ float ef(long j) {
            return drb.a(this, j);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ float eg(float f) {
            return dqu.a(this, f);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ float eh(int i) {
            return dqu.b(this, i);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ float el(long j) {
            return dqu.c(this, j);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ float em(float f) {
            return dqu.d(this, f);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ int en(long j) {
            return dqu.e(this, j);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ int eo(float f) {
            return dqu.f(this, f);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ long ep(long j) {
            return dqu.g(this, j);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ long eq(long j) {
            return dqu.h(this, j);
        }

        @Override // defpackage.drc
        public final /* synthetic */ long er(float f) {
            return drb.b(this, f);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ long es(float f) {
            return dqu.i(this, f);
        }
    };

    /* compiled from: PG */
    /* renamed from: ahy$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<crc, Boolean> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return Boolean.valueOf(!a.bA(((crc) obj).i, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ahy$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arps {
        /* synthetic */ Object a;
        int b;
        aii c;
        arry d;

        public AnonymousClass5(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return ahy.b(null, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ahy$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arpw implements arqv<aho, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ aii b;
        final /* synthetic */ long c;
        final /* synthetic */ arry d;
        private /* synthetic */ Object e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: ahy$6$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arrp implements arqv<Float, Float, arnb> {
            final /* synthetic */ arry a;
            final /* synthetic */ aii b;
            final /* synthetic */ aho c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(arry arryVar, aii aiiVar, aho ahoVar) {
                super(2);
                this.a = arryVar;
                this.b = aiiVar;
                this.c = ahoVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                float f = floatValue - this.a.a;
                aii aiiVar = this.b;
                this.a.a += aiiVar.a(aiiVar.b(this.c.b(aiiVar.f(aiiVar.a(f)))));
                return arnb.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(aii aiiVar, long j, arry arryVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = aiiVar;
            this.c = j;
            this.d = arryVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass6) c((aho) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                aho ahoVar = (aho) this.e;
                aii aiiVar = this.b;
                long j = this.c;
                arry arryVar = this.d;
                float b = aiiVar.b(j);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(arryVar, aiiVar, ahoVar);
                this.a = 1;
                if (abq.h(brg.a, b, null, anonymousClass1, this, 12) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.b, this.c, this.d, arpeVar);
            anonymousClass6.e = obj;
            return anonymousClass6;
        }
    }

    public static final cga a(cga cgaVar, aig aigVar, ahp ahpVar, afl aflVar, boolean z, boolean z2, ahl ahlVar, ajr ajrVar, agq agqVar) {
        return cgaVar.a(new ScrollableElement(aigVar, ahpVar, aflVar, z, z2, ahlVar, ajrVar, agqVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.aii r11, long r12, defpackage.arpe r14) {
        /*
            boolean r0 = r14 instanceof defpackage.ahy.AnonymousClass5
            if (r0 == 0) goto L13
            r0 = r14
            ahy$5 r0 = (defpackage.ahy.AnonymousClass5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ahy$5 r0 = new ahy$5
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            arry r11 = r0.d
            aii r12 = r0.c
            defpackage.aqil.P(r14)
            r14 = r11
            r11 = r12
            goto L55
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            defpackage.aqil.P(r14)
            arry r14 = new arry
            r14.<init>()
            afd r2 = defpackage.afd.a
            ahy$6 r10 = new ahy$6
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r14
            r4.<init>(r5, r6, r8, r9)
            r0.c = r11
            r0.d = r14
            r0.b = r3
            java.lang.Object r12 = r11.h(r2, r10, r0)
            if (r12 == r1) goto L61
        L55:
            float r12 = r14.a
            long r11 = r11.f(r12)
            cjn r13 = new cjn
            r13.<init>(r11)
            return r13
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahy.b(aii, long, arpe):java.lang.Object");
    }
}
