package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayf {

    /* compiled from: PG */
    /* renamed from: ayf$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arxm>, Object> {
        final /* synthetic */ crk a;
        final /* synthetic */ ays b;
        private /* synthetic */ Object c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: ayf$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00241 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
            int a;
            final /* synthetic */ crk b;
            final /* synthetic */ ays c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00241(crk crkVar, ays aysVar, arpe arpeVar) {
                super(2, arpeVar);
                this.b = crkVar;
                this.c = aysVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((C00241) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }

            @Override // defpackage.arpq
            public final Object b(Object obj) {
                Object obj2 = arpl.a;
                int i = this.a;
                aqil.P(obj);
                if (i == 0) {
                    crk crkVar = this.b;
                    ays aysVar = this.c;
                    this.a = 1;
                    Object b = ahm.b(crkVar, new ayk(aysVar, null), this);
                    if (b != arpl.a) {
                        b = arnb.a;
                    }
                    if (b == obj2) {
                        return obj2;
                    }
                }
                return arnb.a;
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                return new C00241(this.b, this.c, arpeVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: ayf$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
            int a;
            final /* synthetic */ crk b;
            final /* synthetic */ ays c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(crk crkVar, ays aysVar, arpe arpeVar) {
                super(2, arpeVar);
                this.b = crkVar;
                this.c = aysVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }

            @Override // defpackage.arpq
            public final Object b(Object obj) {
                Object obj2 = arpl.a;
                int i = this.a;
                aqil.P(obj);
                if (i == 0) {
                    crk crkVar = this.b;
                    ays aysVar = this.c;
                    this.a = 1;
                    ayg aygVar = new ayg(aysVar);
                    ayh ayhVar = new ayh(aysVar);
                    Object e = agy.e(crkVar, new agz(aygVar), new aha(ayhVar), new ayi(aysVar), ahb.a, null, new ayj(aysVar), this);
                    Object obj3 = arpl.a;
                    if (e != obj3) {
                        e = arnb.a;
                    }
                    if (e != obj3) {
                        e = arnb.a;
                    }
                    if (e == obj2) {
                        return obj2;
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
        public AnonymousClass1(crk crkVar, ays aysVar, arpe arpeVar) {
            super(2, arpeVar);
            this.a = crkVar;
            this.b = aysVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            aqil.P(obj);
            arwe arweVar = (arwe) this.c;
            arrn.J(arweVar, null, arwf.d, new C00241(this.a, this.b, null), 1);
            return arrn.J(arweVar, null, arwf.d, new AnonymousClass2(this.a, this.b, null), 1);
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.a, this.b, arpeVar);
            anonymousClass1.c = obj;
            return anonymousClass1;
        }
    }

    public static final Object a(crk crkVar, ays aysVar, arpe arpeVar) {
        Object d = arwi.d(new AnonymousClass1(crkVar, aysVar, null), arpeVar);
        if (d == arpl.a) {
            return d;
        }
        return arnb.a;
    }
}
