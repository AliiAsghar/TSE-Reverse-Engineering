package androidx.compose.animation;

import defpackage.aap;
import defpackage.abt;
import defpackage.abu;
import defpackage.arnb;
import defpackage.arnw;
import defpackage.arqr;
import defpackage.arqv;
import defpackage.arrp;
import defpackage.brg;
import defpackage.byn;
import defpackage.byu;
import defpackage.cas;
import defpackage.cav;
import defpackage.cfq;
import defpackage.cfz;
import defpackage.cga;
import defpackage.cgb;
import defpackage.cuc;
import defpackage.cuf;
import defpackage.cuh;
import defpackage.cuz;
import defpackage.cvc;
import defpackage.cyg;
import defpackage.d;
import defpackage.dri;
import defpackage.drk;
import defpackage.ve;
import defpackage.wd;
import defpackage.xu;
import defpackage.yz;
import defpackage.zs;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements wd<S> {
    public final abt a;
    public cfq b;
    public final byn c = new byu(new dri(0), cav.a);
    public final ve d = new ve((byte[]) null);

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class SizeModifierElement extends cyg<b> {
        private final abt.a b;
        private final cas c;

        public SizeModifierElement(abt.a aVar, cas casVar) {
            this.b = aVar;
            this.c = casVar;
        }

        @Override // defpackage.cyg
        public final /* bridge */ /* synthetic */ cga.c d() {
            return new b(this.b, this.c);
        }

        @Override // defpackage.cyg
        public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
            b bVar = (b) cVar;
            bVar.a = this.b;
            bVar.b = this.c;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof SizeModifierElement) {
                SizeModifierElement sizeModifierElement = (SizeModifierElement) obj;
                if (d.F(sizeModifierElement.b, this.b) && d.F(sizeModifierElement.c, this.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            abt.a aVar = this.b;
            if (aVar != null) {
                i = aVar.hashCode();
            } else {
                i = 0;
            }
            return (i * 31) + this.c.hashCode();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class b extends xu {
        public abt.a a;
        public cas b;
        private long d = -9223372034707292160L;

        /* compiled from: PG */
        /* renamed from: androidx.compose.animation.AnimatedContentTransitionScopeImpl$b$1, reason: invalid class name */
        /* loaded from: classes.dex */
        static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
            final /* synthetic */ AnimatedContentTransitionScopeImpl a;
            final /* synthetic */ cvc b;
            final /* synthetic */ long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, cvc cvcVar, long j) {
                super(1);
                this.a = animatedContentTransitionScopeImpl;
                this.b = cvcVar;
                this.c = j;
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                cfq cfqVar = this.a.b;
                cvc cvcVar = this.b;
                ((cvc.a) obj).f(this.b, cfqVar.a((cvcVar.a << 32) | (cvcVar.b & 4294967295L), this.c, drk.a), brg.a);
                return arnb.a;
            }
        }

        /* compiled from: PG */
        /* renamed from: androidx.compose.animation.AnimatedContentTransitionScopeImpl$b$2, reason: invalid class name */
        /* loaded from: classes.dex */
        static final class AnonymousClass2 extends arrp implements arqr<abt.b<S>, aap<dri>> {
            final /* synthetic */ AnimatedContentTransitionScopeImpl a;
            final /* synthetic */ b b;
            final /* synthetic */ long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, b bVar, long j) {
                super(1);
                this.a = animatedContentTransitionScopeImpl;
                this.b = bVar;
                this.c = j;
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                long j;
                abt.b bVar = (abt.b) obj;
                long j2 = 0;
                if (d.F(bVar.a(), this.a.a())) {
                    j = this.b.a(this.c);
                } else {
                    cas casVar = (cas) this.a.d.a(bVar.a());
                    if (casVar != null) {
                        j = ((dri) casVar.a()).a;
                    } else {
                        j = 0;
                    }
                }
                cas casVar2 = (cas) this.a.d.a(bVar.b());
                if (casVar2 != null) {
                    j2 = ((dri) casVar2.a()).a;
                }
                yz yzVar = (yz) this.b.b.a();
                if (yzVar != null) {
                    return yzVar.a(j, j2);
                }
                return zs.c(brg.a, 400.0f, null, 5);
            }
        }

        /* compiled from: PG */
        /* renamed from: androidx.compose.animation.AnimatedContentTransitionScopeImpl$b$3, reason: invalid class name */
        /* loaded from: classes.dex */
        static final class AnonymousClass3 extends arrp implements arqr<S, dri> {
            final /* synthetic */ AnimatedContentTransitionScopeImpl a;
            final /* synthetic */ b b;
            final /* synthetic */ long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, b bVar, long j) {
                super(1);
                this.a = animatedContentTransitionScopeImpl;
                this.b = bVar;
                this.c = j;
            }

            @Override // defpackage.arqr
            public final /* synthetic */ Object a(Object obj) {
                long j;
                if (d.F(obj, this.a.a())) {
                    j = this.b.a(this.c);
                } else {
                    cas casVar = (cas) this.a.d.a(obj);
                    if (casVar != null) {
                        j = ((dri) casVar.a()).a;
                    } else {
                        j = 0;
                    }
                }
                return new dri(j);
            }
        }

        public b(abt.a aVar, cas casVar) {
            this.a = aVar;
            this.b = casVar;
        }

        public final long a(long j) {
            long j2 = this.d;
            if (defpackage.a.bB(j2, -9223372034707292160L)) {
                return j;
            }
            return j2;
        }

        @Override // defpackage.cxi
        public final cuf b(cuh cuhVar, cuc cucVar, long j) {
            long j2;
            cuf et;
            cvc e = cucVar.e(j);
            if (cuhVar.ev()) {
                j2 = (e.a << 32) | (e.b & 4294967295L);
            } else {
                abt.a aVar = this.a;
                if (aVar == null) {
                    j2 = (e.a << 32) | (e.b & 4294967295L);
                    this.d = j2;
                } else {
                    long j3 = e.b & 4294967295L;
                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = AnimatedContentTransitionScopeImpl.this;
                    long j4 = j3 | (e.a << 32);
                    cas b = aVar.b(new AnonymousClass2(animatedContentTransitionScopeImpl, this, j4), new AnonymousClass3(animatedContentTransitionScopeImpl, this, j4));
                    j2 = ((dri) b.a()).a;
                    this.d = ((dri) b.a()).a;
                }
            }
            et = cuhVar.et((int) (j2 >> 32), (int) (4294967295L & j2), arnw.a, new AnonymousClass1(AnimatedContentTransitionScopeImpl.this, e, j2));
            return et;
        }
    }

    public AnimatedContentTransitionScopeImpl(abt abtVar, cfq cfqVar) {
        this.a = abtVar;
        this.b = cfqVar;
    }

    @Override // abt.b
    public final Object a() {
        return this.a.d().a();
    }

    @Override // abt.b
    public final Object b() {
        return this.a.d().b();
    }

    @Override // abt.b
    public final /* synthetic */ boolean c(Object obj, Object obj2) {
        return abu.a(this, obj, obj2);
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a implements cuz {
        public final byn a;

        public a(boolean z) {
            this.a = new byu(Boolean.valueOf(z), cav.a);
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

        @Override // defpackage.cuz
        public final Object d() {
            return this;
        }
    }
}
