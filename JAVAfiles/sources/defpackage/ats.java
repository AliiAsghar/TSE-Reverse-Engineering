package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ats implements PointerInputEventHandler {
    final /* synthetic */ avc a;

    /* compiled from: PG */
    /* renamed from: ats$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ crk b;
        final /* synthetic */ avc c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: ats$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00171 extends arpv implements arqv<cqg, arpe<? super arnb>, Object> {
            Object a;
            int b;
            final /* synthetic */ avc c;
            private /* synthetic */ Object d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00171(avc avcVar, arpe arpeVar) {
                super(arpeVar);
                this.c = avcVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((C00171) c((cqg) obj, (arpe) obj2)).b(arnb.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0059  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004b -> B:5:0x004e). Please report as a decompilation issue!!! */
            @Override // defpackage.arpq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(java.lang.Object r10) {
                /*
                    r9 = this;
                    arpl r0 = defpackage.arpl.a
                    int r1 = r9.b
                    r2 = 0
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L1d
                    if (r1 == r4) goto L15
                    java.lang.Object r1 = r9.a
                    java.lang.Object r4 = r9.d
                    cqg r4 = (defpackage.cqg) r4
                    defpackage.aqil.P(r10)
                    goto L4e
                L15:
                    java.lang.Object r1 = r9.d
                    cqg r1 = (defpackage.cqg) r1
                    defpackage.aqil.P(r10)
                    goto L31
                L1d:
                    defpackage.aqil.P(r10)
                    java.lang.Object r10 = r9.d
                    r1 = r10
                    cqg r1 = (defpackage.cqg) r1
                    cqs r10 = defpackage.cqs.a
                    r9.d = r1
                    r9.b = r4
                    java.lang.Object r10 = defpackage.aik.a(r1, r3, r10, r9)
                    if (r10 == r0) goto L85
                L31:
                    avc r4 = r9.c
                    crc r10 = (defpackage.crc) r10
                    r5 = 0
                    r4.u(r5)
                    r4 = r1
                    r1 = r10
                L3c:
                    if (r2 != 0) goto L73
                    cqs r10 = defpackage.cqs.a
                    r9.d = r4
                    r9.a = r1
                    r5 = 2
                    r9.b = r5
                    java.lang.Object r10 = r4.r(r10, r9)
                    if (r10 != r0) goto L4e
                    return r0
                L4e:
                    cqq r10 = (defpackage.cqq) r10
                    java.util.List r5 = r10.a
                    int r6 = r5.size()
                    r7 = r3
                L57:
                    if (r7 >= r6) goto L69
                    java.lang.Object r8 = r5.get(r7)
                    crc r8 = (defpackage.crc) r8
                    boolean r8 = defpackage.cqr.f(r8)
                    if (r8 != 0) goto L66
                    goto L3c
                L66:
                    int r7 = r7 + 1
                    goto L57
                L69:
                    java.util.List r10 = r10.a
                    java.lang.Object r10 = r10.get(r3)
                    r2 = r10
                    crc r2 = (defpackage.crc) r2
                    goto L3c
                L73:
                    avc r10 = r9.c
                    crc r1 = (defpackage.crc) r1
                    long r0 = r1.c
                    long r2 = r2.c
                    long r0 = defpackage.a.Q(r2, r0)
                    r10.u(r0)
                    arnb r10 = defpackage.arnb.a
                    return r10
                L85:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ats.AnonymousClass1.C00171.b(java.lang.Object):java.lang.Object");
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                C00171 c00171 = new C00171(this.c, arpeVar);
                c00171.d = obj;
                return c00171;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(crk crkVar, avc avcVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = crkVar;
            this.c = avcVar;
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
                crk crkVar = this.b;
                C00171 c00171 = new C00171(this.c, null);
                this.a = 1;
                if (ahm.b(crkVar, c00171, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.b, this.c, arpeVar);
        }
    }

    public ats(avc avcVar) {
        this.a = avcVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(crk crkVar, arpe<? super arnb> arpeVar) {
        Object d = arwi.d(new AnonymousClass1(crkVar, this.a, null), arpeVar);
        if (d == arpl.a) {
            return d;
        }
        return arnb.a;
    }
}
