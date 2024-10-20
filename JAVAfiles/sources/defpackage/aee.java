package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aee extends ada implements czi, cwm {
    public arqg i;
    public arqg j;
    public boolean k;
    public final uf l;
    private final uf m;

    /* compiled from: PG */
    /* renamed from: aee$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            arqg arqgVar = aee.this.i;
            if (arqgVar != null) {
                arqgVar.a();
            }
            return true;
        }
    }

    /* compiled from: PG */
    /* renamed from: aee$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<cjn, arnb> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((cjn) obj).a;
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: aee$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<cjn, arnb> {
        public AnonymousClass3() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((cjn) obj).a;
            arqg arqgVar = aee.this.i;
            if (arqgVar != null) {
                arqgVar.a();
            }
            aee aeeVar = aee.this;
            if (aeeVar.k) {
                ((cpm) cwn.a(aeeVar, dch.g)).a(0);
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: aee$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arpw implements arqw<ahq, cjn, arpe<? super arnb>, Object> {
        int a;
        /* synthetic */ long b;
        private /* synthetic */ Object d;

        public AnonymousClass4(arpe arpeVar) {
            super(3, arpeVar);
        }

        @Override // defpackage.arqw
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            long j = ((cjn) obj2).a;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4((arpe) obj3);
            anonymousClass4.d = (ahq) obj;
            anonymousClass4.b = j;
            return anonymousClass4.b(arnb.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, ahq] */
        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                ?? r6 = this.d;
                long j = this.b;
                aee aeeVar = aee.this;
                if (((ada) aeeVar).c) {
                    this.a = 1;
                    if (aeeVar.d(r6, j, this) == arplVar) {
                        return arplVar;
                    }
                }
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: aee$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqr<cjn, arnb> {
        public AnonymousClass5() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((cjn) obj).a;
            aee aeeVar = aee.this;
            if (((ada) aeeVar).c) {
                aeeVar.d.a();
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: aee$6, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass6 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;

        public AnonymousClass6(arpe arpeVar) {
            super(2, arpeVar);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass6) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                long f = ((deo) cwn.a(aee.this, dch.m)).f();
                this.a = 1;
                if (arwi.m(f, this) == arplVar) {
                    return arplVar;
                }
            }
            arqg arqgVar = aee.this.i;
            if (arqgVar != null) {
                arqgVar.a();
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass6(arpeVar);
        }
    }

    /* compiled from: PG */
    /* renamed from: aee$7, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass7 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        long a;
        long b;
        int c;
        final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(long j, arpe arpeVar) {
            super(2, arpeVar);
            this.e = j;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass7) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        
            if (defpackage.arwi.m(r3 - r5, r9) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        
            if (defpackage.arwi.m(40, r9) != r0) goto L9;
         */
        @Override // defpackage.arpq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.Object r10) {
            /*
                r9 = this;
                arpl r0 = defpackage.arpl.a
                int r1 = r9.c
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 == r2) goto Ld
                defpackage.aqil.P(r10)
                goto L52
            Ld:
                long r3 = r9.b
                long r5 = r9.a
                defpackage.aqil.P(r10)
                goto L37
            L15:
                defpackage.aqil.P(r10)
                aee r10 = defpackage.aee.this
                bzc r1 = defpackage.dch.m
                java.lang.Object r10 = defpackage.cwn.a(r10, r1)
                deo r10 = (defpackage.deo) r10
                r10.h()
                long r3 = r10.e()
                r5 = 40
                r9.a = r5
                r9.b = r3
                r9.c = r2
                java.lang.Object r10 = defpackage.arwi.m(r5, r9)
                if (r10 == r0) goto L5c
            L37:
                aee r10 = defpackage.aee.this
                long r7 = r9.e
                uf r10 = r10.l
                java.lang.Object r10 = r10.a(r7)
                aee$a r10 = (aee.a) r10
                if (r10 == 0) goto L47
                r10.b = r2
            L47:
                long r3 = r3 - r5
                r10 = 2
                r9.c = r10
                java.lang.Object r10 = defpackage.arwi.m(r3, r9)
                if (r10 != r0) goto L52
                goto L5c
            L52:
                aee r10 = defpackage.aee.this
                arqg r10 = r10.d
                r10.a()
                arnb r10 = defpackage.arnb.a
                return r10
            L5c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aee.AnonymousClass7.b(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass7(this.e, arpeVar);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final arxm a;
        public boolean b;

        public a(arxm arxmVar) {
            this.a = arxmVar;
        }
    }

    public aee(arqg arqgVar, arqg arqgVar2, arqg arqgVar3, ajr ajrVar, afa afaVar, boolean z, dgv dgvVar) {
        super(ajrVar, afaVar, z, null, dgvVar, arqgVar);
        this.i = arqgVar2;
        this.j = arqgVar3;
        this.k = true;
        this.m = new uf((byte[]) null);
        this.l = new uf((byte[]) null);
    }

    private final void z() {
        char c;
        uf ufVar = this.m;
        Object[] objArr = ufVar.c;
        long[] jArr = ufVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j & 255) < 128) {
                            ((arxm) objArr[(i << 3) + i3]).v(null);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        ufVar.e();
        uf ufVar2 = this.l;
        Object[] objArr2 = ufVar2.c;
        long[] jArr2 = ufVar2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j2 = jArr2[i4];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j2 & 255) < 128) {
                            ((a) objArr2[(i4 << 3) + i6]).a.v(null);
                        }
                        j2 >>= 8;
                    }
                    c = '\b';
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    c = '\b';
                }
                if (i4 == length2) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        ufVar2.e();
    }

    @Override // defpackage.ada
    public final Object a(crk crkVar, arpe arpeVar) {
        AnonymousClass2 anonymousClass2;
        AnonymousClass3 anonymousClass3;
        boolean z = ((ada) this).c;
        if (z && this.j != null) {
            anonymousClass2 = new AnonymousClass2();
        } else {
            anonymousClass2 = null;
        }
        if (z && this.i != null) {
            anonymousClass3 = new AnonymousClass3();
        } else {
            anonymousClass3 = null;
        }
        Object d = aik.d(crkVar, anonymousClass2, anonymousClass3, new AnonymousClass4(null), new AnonymousClass5(), arpeVar);
        if (d == arpl.a) {
            return d;
        }
        return arnb.a;
    }

    @Override // defpackage.ada
    public final void e(dho dhoVar) {
        if (this.i != null) {
            dhl.H(dhoVar, new AnonymousClass1());
        }
    }

    @Override // cga.c
    public final void eb() {
        z();
    }

    @Override // defpackage.ada
    protected final void i() {
        z();
    }

    @Override // defpackage.ada
    protected final boolean r(KeyEvent keyEvent) {
        long b = cpt.b(keyEvent);
        boolean z = false;
        if (this.i != null && this.m.a(b) == null) {
            this.m.f(b, arrn.J(B(), null, null, new AnonymousClass6(null), 3));
            z = true;
        }
        a aVar = (a) this.l.a(b);
        if (aVar != null) {
            if (aVar.a.x()) {
                aVar.a.v(null);
                if (!aVar.b) {
                    this.d.a();
                    this.l.d(b);
                }
            } else {
                this.l.d(b);
            }
        }
        return z;
    }

    @Override // defpackage.ada
    protected final void y(KeyEvent keyEvent) {
        uf ufVar = this.m;
        long b = cpt.b(keyEvent);
        Object a2 = ufVar.a(b);
        boolean z = false;
        if (a2 != null) {
            arxm arxmVar = (arxm) this.m.a(b);
            if (arxmVar != null) {
                if (arxmVar.x()) {
                    arxmVar.v(null);
                } else {
                    z = true;
                }
            }
            this.m.d(b);
        }
        if (this.j != null) {
            if (this.l.a(b) == null) {
                if (!z) {
                    this.l.f(b, new a(arrn.J(B(), null, null, new AnonymousClass7(b, null), 3)));
                    return;
                }
                return;
            }
            this.l.d(b);
            return;
        }
        if (!z) {
            this.d.a();
        }
    }
}
