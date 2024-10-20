package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpq {
    public final boolean a;
    public final boolean b;
    public zr c;
    public bsr d;
    public aap e;
    public aap f;

    /* compiled from: PG */
    /* renamed from: bpq$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<Float, Float> {
        final /* synthetic */ dqv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(dqv dqvVar) {
            super(1);
            this.a = dqvVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((Number) obj).floatValue();
            return Float.valueOf(this.a.em(56.0f));
        }
    }

    /* compiled from: PG */
    /* renamed from: bpq$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqg<Float> {
        final /* synthetic */ dqv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(dqv dqvVar) {
            super(0);
            this.a = dqvVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Float.valueOf(this.a.em(125.0f));
        }
    }

    /* compiled from: PG */
    /* renamed from: bpq$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqg<zr<Float>> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return bpq.this.c;
        }
    }

    public bpq(boolean z, dqv dqvVar, bps bpsVar, arqr arqrVar, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z && bpsVar == bps.c) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z2 && bpsVar == bps.a) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.c = bpn.a;
        this.d = new bsr(bpsVar, new AnonymousClass1(dqvVar), new AnonymousClass2(dqvVar), new AnonymousClass3(), arqrVar);
        this.e = new abk(0);
        this.f = new abk(0);
    }

    public static /* synthetic */ Object k(bpq bpqVar, bps bpsVar, aap aapVar, arpe arpeVar) {
        Object r = bsr.r(bpqVar.d, bpsVar, new bpr(bpqVar, bpqVar.d.b(), aapVar, null), arpeVar);
        if (r == arpl.a) {
            return r;
        }
        return arnb.a;
    }

    public final float a() {
        return this.d.c();
    }

    public final float b() {
        return this.d.e();
    }

    public final bps c() {
        return (bps) this.d.j();
    }

    public final Object d(arpe arpeVar) {
        bsr bsrVar = this.d;
        Object c = bsq.c(bsrVar, bps.b, bsrVar.b(), arpeVar);
        if (c == arpl.a) {
            return c;
        }
        return arnb.a;
    }

    public final Object e(arpe arpeVar) {
        if (!this.b) {
            Object k = k(this, bps.a, this.f, arpeVar);
            if (k == arpl.a) {
                return k;
            }
            return arnb.a;
        }
        throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
    }

    public final Object f(arpe arpeVar) {
        if (!this.a) {
            Object k = k(this, bps.c, this.e, arpeVar);
            if (k == arpl.a) {
                return k;
            }
            return arnb.a;
        }
        throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
    }

    public final Object g(float f, arpe arpeVar) {
        Object m = this.d.m(f, arpeVar);
        if (m == arpl.a) {
            return m;
        }
        return arnb.a;
    }

    public final Object h(arpe arpeVar) {
        bps bpsVar;
        if (i()) {
            bpsVar = bps.c;
        } else {
            bpsVar = bps.b;
        }
        Object k = k(this, bpsVar, this.e, arpeVar);
        if (k == arpl.a) {
            return k;
        }
        return arnb.a;
    }

    public final boolean i() {
        return this.d.f().g(bps.c);
    }

    public final boolean j() {
        if (this.d.j() != bps.a) {
            return true;
        }
        return false;
    }
}
