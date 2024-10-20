package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agv implements aig {
    public final arqr a;
    public final ahv b = new ahv() { // from class: agv.2
        @Override // defpackage.ahv
        public final float a(float f) {
            boolean z;
            if (Float.isNaN(f)) {
                return brg.a;
            }
            float floatValue = ((Number) agv.this.a.a(Float.valueOf(f))).floatValue();
            agv agvVar = agv.this;
            boolean z2 = true;
            if (floatValue > brg.a) {
                z = true;
            } else {
                z = false;
            }
            agvVar.e.h(Boolean.valueOf(z));
            agv agvVar2 = agv.this;
            if (floatValue >= brg.a) {
                z2 = false;
            }
            agvVar2.f.h(Boolean.valueOf(z2));
            return floatValue;
        }
    };
    public final aff c = new aff();
    public final byn d = new byu(false, cav.a);
    public final byn e = new byu(false, cav.a);
    public final byn f = new byu(false, cav.a);

    /* compiled from: PG */
    /* renamed from: agv$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ afd c;
        final /* synthetic */ arqv d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: agv$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00081 extends arpw implements arqv<ahv, arpe<? super arnb>, Object> {
            int a;
            final /* synthetic */ agv b;
            final /* synthetic */ arqv c;
            private /* synthetic */ Object d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00081(agv agvVar, arqv arqvVar, arpe arpeVar) {
                super(2, arpeVar);
                this.b = agvVar;
                this.c = arqvVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((C00081) c((ahv) obj, (arpe) obj2)).b(arnb.a);
            }

            @Override // defpackage.arpq
            public final Object b(Object obj) {
                arpl arplVar = arpl.a;
                try {
                    if (this.a != 0) {
                        aqil.P(obj);
                    } else {
                        aqil.P(obj);
                        ahv ahvVar = (ahv) this.d;
                        this.b.d.h(true);
                        arqv arqvVar = this.c;
                        this.a = 1;
                        if (arqvVar.a(ahvVar, this) == arplVar) {
                            return arplVar;
                        }
                    }
                    this.b.d.h(false);
                    return arnb.a;
                } catch (Throwable th) {
                    this.b.d.h(false);
                    throw th;
                }
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                C00081 c00081 = new C00081(this.b, this.c, arpeVar);
                c00081.d = obj;
                return c00081;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(afd afdVar, arqv arqvVar, arpe arpeVar) {
            super(2, arpeVar);
            this.c = afdVar;
            this.d = arqvVar;
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
                agv agvVar = agv.this;
                afd afdVar = this.c;
                C00081 c00081 = new C00081(agvVar, this.d, null);
                this.a = 1;
                if (agvVar.c.a(agvVar.b, afdVar, c00081, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.c, this.d, arpeVar);
        }
    }

    public agv(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.aig
    public final float a(float f) {
        return ((Number) this.a.a(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.aig
    public final Object e(afd afdVar, arqv arqvVar, arpe arpeVar) {
        Object d = arwi.d(new AnonymousClass1(afdVar, arqvVar, null), arpeVar);
        if (d == arpl.a) {
            return d;
        }
        return arnb.a;
    }

    @Override // defpackage.aig
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // defpackage.aig
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.aig
    public final boolean i() {
        return ((Boolean) this.d.a()).booleanValue();
    }
}
