package defpackage;

import defpackage.agx;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahj extends ahf {
    public ahk f;
    public ahp g;
    public boolean h;
    public arqw i;
    public arqw j;
    public boolean k;

    /* compiled from: PG */
    /* renamed from: ahj$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<ahg, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ arqv b;
        final /* synthetic */ ahj c;
        private /* synthetic */ Object d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: ahj$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00091 extends arrp implements arqr<agx.b, arnb> {
            final /* synthetic */ ahg a;
            final /* synthetic */ ahj b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00091(ahg ahgVar, ahj ahjVar) {
                super(1);
                this.a = ahgVar;
                this.b = ahjVar;
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                float f;
                long j;
                long j2 = ((agx.b) obj).a;
                if (true != this.b.k) {
                    f = 1.0f;
                } else {
                    f = -1.0f;
                }
                long e = cjn.e(j2, f);
                ahp ahpVar = this.b.g;
                arqw arqwVar = ahh.a;
                if (ahpVar == ahp.a) {
                    j = e & 4294967295L;
                } else {
                    j = e >> 32;
                }
                this.a.a(Float.intBitsToFloat((int) j));
                return arnb.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqv arqvVar, ahj ahjVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = arqvVar;
            this.c = ahjVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((ahg) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                ahg ahgVar = (ahg) this.d;
                arqv arqvVar = this.b;
                C00091 c00091 = new C00091(ahgVar, this.c);
                this.a = 1;
                if (arqvVar.a(c00091, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, arpeVar);
            anonymousClass1.d = obj;
            return anonymousClass1;
        }
    }

    /* compiled from: PG */
    /* renamed from: ahj$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ long c;
        private /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, arpe arpeVar) {
            super(2, arpeVar);
            this.c = j;
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
                arwe arweVar = (arwe) this.d;
                ahj ahjVar = ahj.this;
                long j = this.c;
                arqw arqwVar = ahjVar.i;
                cjn cjnVar = new cjn(j);
                this.a = 1;
                if (arqwVar.a(arweVar, cjnVar, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.c, arpeVar);
            anonymousClass2.d = obj;
            return anonymousClass2;
        }
    }

    /* compiled from: PG */
    /* renamed from: ahj$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ long c;
        private /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(long j, arpe arpeVar) {
            super(2, arpeVar);
            this.c = j;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass3) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            float f;
            float a;
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                arwe arweVar = (arwe) this.d;
                ahj ahjVar = ahj.this;
                long j = this.c;
                arqw arqwVar = ahjVar.j;
                if (ahjVar.k) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                long c = drp.c(j, f);
                ahp ahpVar = ahj.this.g;
                arqw arqwVar2 = ahh.a;
                if (ahpVar == ahp.a) {
                    a = drp.b(c);
                } else {
                    a = drp.a(c);
                }
                Float f2 = new Float(a);
                this.a = 1;
                if (arqwVar.a(arweVar, f2, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.c, arpeVar);
            anonymousClass3.d = obj;
            return anonymousClass3;
        }
    }

    public ahj(ahk ahkVar, arqr arqrVar, ahp ahpVar, boolean z, ajr ajrVar, boolean z2, arqw arqwVar, arqw arqwVar2, boolean z3) {
        super(arqrVar, z, ajrVar, ahpVar);
        this.f = ahkVar;
        this.g = ahpVar;
        this.h = z2;
        this.i = arqwVar;
        this.j = arqwVar2;
        this.k = z3;
    }

    @Override // defpackage.ahf
    public final Object b(arqv arqvVar, arpe arpeVar) {
        Object a = this.f.a(afd.b, new AnonymousClass1(arqvVar, this, null), arpeVar);
        if (a == arpl.a) {
            return a;
        }
        return arnb.a;
    }

    @Override // defpackage.ahf
    public final void i(long j) {
        if (this.z && !d.F(this.i, ahh.a)) {
            arrn.J(B(), null, null, new AnonymousClass2(j, null), 3);
        }
    }

    @Override // defpackage.ahf
    public final void n(long j) {
        if (this.z && !d.F(this.j, ahh.b)) {
            arrn.J(B(), null, null, new AnonymousClass3(j, null), 3);
        }
    }

    @Override // defpackage.ahf
    public final boolean z() {
        return this.h;
    }
}
