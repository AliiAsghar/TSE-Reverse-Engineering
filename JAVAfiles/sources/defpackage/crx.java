package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.cga;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crx extends cga.c implements crw, crk, dqv {
    public Object a;
    public Object b;
    public Object[] c;
    public PointerInputEventHandler d;
    private arxm h;
    private cqq j;
    public cqq e = cru.a;
    public final cbh f = new cbh(new a[16]);
    private final cbh i = new cbh(new a[16]);
    public long g = 0;

    /* compiled from: PG */
    /* renamed from: crx$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<Throwable, arnb> {
        final /* synthetic */ a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar) {
            super(1);
            this.a = aVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            a aVar = this.a;
            Throwable th = (Throwable) obj;
            arvo arvoVar = aVar.a;
            if (arvoVar != null) {
                arvoVar.h(th);
            }
            aVar.a = null;
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: crx$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;

        public AnonymousClass2(arpe arpeVar) {
            super(2, arpeVar);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            if (this.a != 0) {
                aqil.P(obj);
            } else {
                aqil.P(obj);
                crx crxVar = crx.this;
                PointerInputEventHandler pointerInputEventHandler = crxVar.d;
                this.a = 2;
                if (pointerInputEventHandler.invoke(crxVar, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass2(arpeVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a<R> implements cqg, dqv, arpe {
        public arvo a;
        private final arpe c;
        private final /* synthetic */ crx d;
        private cqs e = cqs.b;
        private final arpi f = arpj.a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: crx$a$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> extends arps {
            Object a;
            /* synthetic */ Object b;
            int d;

            public AnonymousClass1(arpe arpeVar) {
                super(arpeVar);
            }

            @Override // defpackage.arpq
            public final Object b(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return a.this.s(0L, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: crx$a$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
            int a;
            final /* synthetic */ long b;
            final /* synthetic */ a c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(long j, a aVar, arpe arpeVar) {
                super(2, arpeVar);
                this.b = j;
                this.c = aVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
            
                r6.w(defpackage.aqil.O(new defpackage.cqt(r5.b)));
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
            
                return defpackage.arnb.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
            
                if (defpackage.arwi.m(r3 - 1, r5) != r0) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
            
                if (r1 != 1) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
            
                if (defpackage.arwi.m(1, r5) == r0) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
            
                r6 = r5.c.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
            
                if (r6 == null) goto L14;
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
                    if (r1 == 0) goto Ld
                    if (r1 == r2) goto L1a
                    goto L26
                Ld:
                    long r3 = r5.b
                    r5.a = r2
                    r1 = -1
                    long r3 = r3 + r1
                    java.lang.Object r6 = defpackage.arwi.m(r3, r5)
                    if (r6 == r0) goto L3d
                L1a:
                    r6 = 2
                    r5.a = r6
                    r1 = 1
                    java.lang.Object r6 = defpackage.arwi.m(r1, r5)
                    if (r6 != r0) goto L26
                    goto L3d
                L26:
                    crx$a r6 = r5.c
                    arvo r6 = r6.a
                    if (r6 == 0) goto L3a
                    long r0 = r5.b
                    cqt r2 = new cqt
                    r2.<init>(r0)
                    java.lang.Object r0 = defpackage.aqil.O(r2)
                    r6.w(r0)
                L3a:
                    arnb r6 = defpackage.arnb.a
                    return r6
                L3d:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: crx.a.AnonymousClass2.b(java.lang.Object):java.lang.Object");
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                return new AnonymousClass2(this.b, this.c, arpeVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: crx$a$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3<T> extends arps {
            /* synthetic */ Object a;
            int c;

            public AnonymousClass3(arpe arpeVar) {
                super(arpeVar);
            }

            @Override // defpackage.arpq
            public final Object b(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return a.this.t(0L, null, this);
            }
        }

        public a(arpe arpeVar) {
            this.c = arpeVar;
            this.d = crx.this;
        }

        @Override // defpackage.cqg
        public final long a() {
            crx crxVar = crx.this;
            long h = dqu.h(crxVar, crxVar.a().g());
            long j = crxVar.g;
            float max = Math.max(brg.a, Float.intBitsToFloat((int) (h >> 32)) - ((int) (j >> 32))) / 2.0f;
            float max2 = Math.max(brg.a, Float.intBitsToFloat((int) (h & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
            return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
        }

        @Override // defpackage.dqv
        public final float ec() {
            return this.d.ec();
        }

        @Override // defpackage.drc
        public final float ed() {
            return this.d.ed();
        }

        @Override // defpackage.drc
        public final float ef(long j) {
            return drb.a(this.d, j);
        }

        @Override // defpackage.dqv
        public final float eg(float f) {
            return dqu.a(this.d, f);
        }

        @Override // defpackage.dqv
        public final float eh(int i) {
            return dqu.b(this.d, i);
        }

        @Override // defpackage.dqv
        public final float el(long j) {
            return dqu.c(this.d, j);
        }

        @Override // defpackage.dqv
        public final float em(float f) {
            return dqu.d(this.d, f);
        }

        @Override // defpackage.dqv
        public final int en(long j) {
            return dqu.e(this.d, j);
        }

        @Override // defpackage.dqv
        public final int eo(float f) {
            return dqu.f(this.d, f);
        }

        @Override // defpackage.dqv
        public final long ep(long j) {
            return dqu.g(this.d, j);
        }

        @Override // defpackage.dqv
        public final long eq(long j) {
            return dqu.h(this.d, j);
        }

        @Override // defpackage.drc
        public final long er(float f) {
            return drb.b(this.d, f);
        }

        @Override // defpackage.dqv
        public final long es(float f) {
            return dqu.i(this.d, f);
        }

        @Override // defpackage.cqg
        public final long o() {
            return crx.this.g;
        }

        @Override // defpackage.cqg
        public final cqq p() {
            return crx.this.e;
        }

        @Override // defpackage.cqg
        public final deo q() {
            return crx.this.a();
        }

        @Override // defpackage.cqg
        public final Object r(cqs cqsVar, arpe arpeVar) {
            arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
            arvpVar.A();
            this.e = cqsVar;
            this.a = arvpVar;
            return arvpVar.l();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
        /* JADX WARN: Type inference failed for: r7v0, types: [long] */
        /* JADX WARN: Type inference failed for: r7v1, types: [arxm] */
        /* JADX WARN: Type inference failed for: r7v4, types: [arxm] */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r9v0, types: [arqv] */
        @Override // defpackage.cqg
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object s(long r7, defpackage.arqv r9, defpackage.arpe r10) {
            /*
                r6 = this;
                boolean r0 = r10 instanceof crx.a.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r10
                crx$a$1 r0 = (crx.a.AnonymousClass1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                crx$a$1 r0 = new crx$a$1
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.b
                arpl r1 = defpackage.arpl.a
                int r2 = r0.d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                java.lang.Object r7 = r0.a
                defpackage.aqil.P(r10)     // Catch: java.lang.Throwable -> L29
                goto L67
            L29:
                r8 = move-exception
                goto L6e
            L2b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L33:
                defpackage.aqil.P(r10)
                r4 = 0
                int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r10 > 0) goto L4c
                arvo r10 = r6.a
                if (r10 == 0) goto L4c
                cqt r2 = new cqt
                r2.<init>(r7)
                java.lang.Object r2 = defpackage.aqil.O(r2)
                r10.w(r2)
            L4c:
                crx r10 = defpackage.crx.this
                arwe r10 = r10.B()
                crx$a$2 r2 = new crx$a$2
                r4 = 0
                r2.<init>(r7, r6, r4)
                r7 = 3
                arxm r7 = defpackage.arrn.J(r10, r4, r4, r2, r7)
                r0.a = r7     // Catch: java.lang.Throwable -> L29
                r0.d = r3     // Catch: java.lang.Throwable -> L29
                java.lang.Object r10 = r9.a(r6, r0)     // Catch: java.lang.Throwable -> L29
                if (r10 == r1) goto L6d
            L67:
                cqh r8 = defpackage.cqh.a
                r7.v(r8)
                return r10
            L6d:
                return r1
            L6e:
                cqh r9 = defpackage.cqh.a
                r7.v(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: crx.a.s(long, arqv, arpe):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
        @Override // defpackage.cqg
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(long r5, defpackage.arqv r7, defpackage.arpe r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof crx.a.AnonymousClass3
                if (r0 == 0) goto L13
                r0 = r8
                crx$a$3 r0 = (crx.a.AnonymousClass3) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                crx$a$3 r0 = new crx$a$3
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.a
                arpl r1 = defpackage.arpl.a
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                defpackage.aqil.P(r8)     // Catch: defpackage.cqt -> L3b
                goto L3c
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                defpackage.aqil.P(r8)
                r0.c = r3     // Catch: defpackage.cqt -> L3b
                java.lang.Object r8 = r4.s(r5, r7, r0)     // Catch: defpackage.cqt -> L3b
                if (r8 != r1) goto L3c
                return r1
            L3b:
                r8 = 0
            L3c:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: crx.a.t(long, arqv, arpe):java.lang.Object");
        }

        @Override // defpackage.arpe
        public final arpi u() {
            return this.f;
        }

        public final void v(cqq cqqVar, cqs cqsVar) {
            arvo arvoVar;
            if (cqsVar == this.e && (arvoVar = this.a) != null) {
                this.a = null;
                arvoVar.w(cqqVar);
            }
        }

        @Override // defpackage.arpe
        public final void w(Object obj) {
            crx crxVar = crx.this;
            synchronized (crxVar.f) {
                crxVar.f.m(this);
            }
            this.c.w(obj);
        }
    }

    public crx(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.a = obj;
        this.b = obj2;
        this.c = objArr;
        this.d = pointerInputEventHandler;
    }

    private final void q(cqq cqqVar, cqs cqsVar) {
        synchronized (this.f) {
            cbh cbhVar = this.i;
            cbhVar.o(cbhVar.b, this.f);
        }
        try {
            cqs cqsVar2 = cqs.a;
            int ordinal = cqsVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                    }
                } else {
                    cbh cbhVar2 = this.i;
                    int i = cbhVar2.b;
                    if (i > 0) {
                        int i2 = i - 1;
                        Object[] objArr = cbhVar2.a;
                        do {
                            ((a) objArr[i2]).v(cqqVar, cqsVar);
                            i2--;
                        } while (i2 >= 0);
                    }
                }
            }
            cbh cbhVar3 = this.i;
            int i3 = cbhVar3.b;
            if (i3 > 0) {
                Object[] objArr2 = cbhVar3.a;
                int i4 = 0;
                do {
                    ((a) objArr2[i4]).v(cqqVar, cqsVar);
                    i4++;
                } while (i4 < i3);
            }
        } finally {
            this.i.g();
        }
    }

    @Override // defpackage.crk
    public final deo a() {
        return cwp.e(this).s;
    }

    @Override // defpackage.czi
    public final void dR() {
        cqq cqqVar = this.j;
        if (cqqVar != null) {
            List list = cqqVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((crc) list.get(i)).d) {
                    List list2 = cqqVar.a;
                    ArrayList arrayList = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        crc crcVar = (crc) list2.get(i2);
                        long j = crcVar.a;
                        long j2 = crcVar.c;
                        long j3 = crcVar.b;
                        float f = crcVar.e;
                        boolean z = crcVar.d;
                        arrayList.add(new crc(j, j3, j2, false, f, j3, j2, z, z, crcVar.i, 0L));
                    }
                    cqq cqqVar2 = new cqq(arrayList);
                    this.e = cqqVar2;
                    q(cqqVar2, cqs.a);
                    q(cqqVar2, cqs.b);
                    q(cqqVar2, cqs.c);
                    this.j = null;
                    return;
                }
            }
        }
    }

    @Override // defpackage.czi
    public final void dS() {
        p();
    }

    @Override // defpackage.czi
    public final void dT(cqq cqqVar, cqs cqsVar, long j) {
        this.g = j;
        if (cqsVar == cqs.a) {
            this.e = cqqVar;
        }
        if (this.h == null) {
            this.h = arrn.J(B(), null, arwf.d, new AnonymousClass2(null), 1);
        }
        q(cqqVar, cqsVar);
        List list = cqqVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!cqr.g((crc) list.get(i))) {
                    break;
                } else {
                    i++;
                }
            } else {
                cqqVar = null;
                break;
            }
        }
        this.j = cqqVar;
    }

    @Override // defpackage.czi
    public final void dU() {
        p();
    }

    @Override // defpackage.dqv
    public final float ec() {
        return cwp.e(this).q.ec();
    }

    @Override // defpackage.drc
    public final float ed() {
        return cwp.e(this).q.ed();
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

    @Override // defpackage.crk
    public final Object o(arqv arqvVar, arpe arpeVar) {
        arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
        arvpVar.A();
        a aVar = new a(arvpVar);
        synchronized (this.f) {
            this.f.n(aVar);
            new arpk(arhi.i(arhi.h(arqvVar, aVar, aVar)), arpl.a).w(arnb.a);
        }
        arvpVar.d(new AnonymousClass1(aVar));
        return arvpVar.l();
    }

    @Override // defpackage.crw
    public final void p() {
        arxm arxmVar = this.h;
        if (arxmVar != null) {
            arxmVar.v(new crj());
            this.h = null;
        }
    }

    @Override // cga.c
    public final void s() {
        p();
    }

    @Override // defpackage.czi
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.czi
    public final /* synthetic */ void x() {
    }
}
