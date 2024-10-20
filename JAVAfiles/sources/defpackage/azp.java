package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.ajt;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azp implements PointerInputEventHandler {
    final /* synthetic */ arwe a;
    final /* synthetic */ byn b;
    final /* synthetic */ ajr c;
    final /* synthetic */ cas d;

    /* compiled from: PG */
    /* renamed from: azp$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqw<ahq, cjn, arpe<? super arnb>, Object> {
        int a;
        /* synthetic */ long b;
        final /* synthetic */ arwe c;
        final /* synthetic */ byn d;
        final /* synthetic */ ajr e;
        private /* synthetic */ Object f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: azp$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00251 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
            Object a;
            int b;
            final /* synthetic */ byn c;
            final /* synthetic */ long d;
            final /* synthetic */ ajr e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00251(byn bynVar, long j, ajr ajrVar, arpe arpeVar) {
                super(2, arpeVar);
                this.c = bynVar;
                this.d = j;
                this.e = ajrVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((C00251) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
            
                if (r1.b(r6, r5) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
            
                if (r1.b(r4, r5) != r0) goto L13;
             */
            /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
            @Override // defpackage.arpq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(java.lang.Object r6) {
                /*
                    r5 = this;
                    arpl r0 = defpackage.arpl.a
                    int r1 = r5.b
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 == r2) goto L11
                    java.lang.Object r0 = r5.a
                    ajt$b r0 = (ajt.b) r0
                    defpackage.aqil.P(r6)
                    goto L58
                L11:
                    java.lang.Object r1 = r5.a
                    byn r1 = (defpackage.byn) r1
                    defpackage.aqil.P(r6)
                    goto L3c
                L19:
                    defpackage.aqil.P(r6)
                    byn r6 = r5.c
                    java.lang.Object r6 = r6.a()
                    ajt$b r6 = (ajt.b) r6
                    if (r6 == 0) goto L40
                    ajr r1 = r5.e
                    byn r3 = r5.c
                    ajt$a r4 = new ajt$a
                    r4.<init>(r6)
                    if (r1 == 0) goto L3b
                    r5.a = r3
                    r5.b = r2
                    java.lang.Object r6 = r1.b(r4, r5)
                    if (r6 == r0) goto L56
                L3b:
                    r1 = r3
                L3c:
                    r6 = 0
                    r1.h(r6)
                L40:
                    long r1 = r5.d
                    ajt$b r6 = new ajt$b
                    r6.<init>(r1)
                    ajr r1 = r5.e
                    if (r1 == 0) goto L57
                    r5.a = r6
                    r2 = 2
                    r5.b = r2
                    java.lang.Object r1 = r1.b(r6, r5)
                    if (r1 != r0) goto L57
                L56:
                    return r0
                L57:
                    r0 = r6
                L58:
                    byn r6 = r5.c
                    r6.h(r0)
                    arnb r6 = defpackage.arnb.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.azp.AnonymousClass1.C00251.b(java.lang.Object):java.lang.Object");
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                return new C00251(this.c, this.d, this.e, arpeVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: azp$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
            Object a;
            int b;
            final /* synthetic */ byn c;
            final /* synthetic */ boolean d;
            final /* synthetic */ ajr e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(byn bynVar, boolean z, ajr ajrVar, arpe arpeVar) {
                super(2, arpeVar);
                this.c = bynVar;
                this.d = z;
                this.e = ajrVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.arpq
            public final Object b(Object obj) {
                ajp aVar;
                byn bynVar;
                arpl arplVar = arpl.a;
                if (this.b != 0) {
                    Object obj2 = this.a;
                    aqil.P(obj);
                    bynVar = obj2;
                } else {
                    aqil.P(obj);
                    ajt.b bVar = (ajt.b) this.c.a();
                    if (bVar != null) {
                        boolean z = this.d;
                        ajr ajrVar = this.e;
                        byn bynVar2 = this.c;
                        if (z) {
                            aVar = new ajt.c(bVar);
                        } else {
                            aVar = new ajt.a(bVar);
                        }
                        if (ajrVar != null) {
                            this.a = bynVar2;
                            this.b = 1;
                            if (ajrVar.b(aVar, this) == arplVar) {
                                return arplVar;
                            }
                        }
                        bynVar = bynVar2;
                    }
                    return arnb.a;
                }
                bynVar.h(null);
                return arnb.a;
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                return new AnonymousClass2(this.c, this.d, this.e, arpeVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arwe arweVar, byn bynVar, ajr ajrVar, arpe arpeVar) {
            super(3, arpeVar);
            this.c = arweVar;
            this.d = bynVar;
            this.e = ajrVar;
        }

        @Override // defpackage.arqw
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            long j = ((cjn) obj2).a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.d, this.e, (arpe) obj3);
            anonymousClass1.f = (ahq) obj;
            anonymousClass1.b = j;
            return anonymousClass1.b(arnb.a);
        }

        /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, ahq] */
        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                ?? r12 = this.f;
                arrn.J(this.c, null, null, new C00251(this.d, this.b, this.e, null), 3);
                this.a = 1;
                obj = r12.a(this);
                if (obj == arplVar) {
                    return arplVar;
                }
            }
            arrn.J(this.c, null, null, new AnonymousClass2(this.d, ((Boolean) obj).booleanValue(), this.e, null), 3);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: azp$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<cjn, arnb> {
        final /* synthetic */ cas a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cas casVar) {
            super(1);
            this.a = casVar;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            ((arqr) this.a.a()).a(new cjn(((cjn) obj).a));
            return arnb.a;
        }
    }

    public azp(arwe arweVar, byn bynVar, ajr ajrVar, cas casVar) {
        this.a = arweVar;
        this.b = bynVar;
        this.c = ajrVar;
        this.d = casVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(crk crkVar, arpe<? super arnb> arpeVar) {
        Object c = aik.c(crkVar, new AnonymousClass1(this.a, this.b, this.c, null), new AnonymousClass2(this.d), arpeVar);
        if (c == arpl.a) {
            return c;
        }
        return arnb.a;
    }
}
