package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dld implements cas<Object> {
    public final dmc a;
    public boolean b = true;
    private final List c;
    private final dmm d;
    private final dle e;
    private final arqr f;
    private final byn g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dld$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        Object a;
        Object b;
        int c;
        int d;
        /* synthetic */ Object e;
        int g;
        dld h;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return dld.this.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dld$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arpw implements arqr<arpe<? super Object>, Object> {
        int a;
        final /* synthetic */ dlh c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(dlh dlhVar, arpe arpeVar) {
            super(1, arpeVar);
            this.c = dlhVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return new AnonymousClass2(this.c, (arpe) obj).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                dld dldVar = dld.this;
                dlh dlhVar = this.c;
                this.a = 1;
                obj = dldVar.c(dlhVar, this);
                if (obj == arplVar) {
                    return arplVar;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dld$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arps {
        Object a;
        /* synthetic */ Object b;
        int d;

        public AnonymousClass3(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return dld.this.c(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dld$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arpw implements arqv<arwe, arpe<? super Object>, Object> {
        int a;
        final /* synthetic */ dlh c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(dlh dlhVar, arpe arpeVar) {
            super(2, arpeVar);
            this.c = dlhVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass4) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                dld dldVar = dld.this;
                dlh dlhVar = this.c;
                this.a = 1;
                obj = dldVar.a.a(dlhVar, this);
                if (obj == arplVar) {
                    return arplVar;
                }
            }
            return obj;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass4(this.c, arpeVar);
        }
    }

    public dld(List list, Object obj, dmm dmmVar, dle dleVar, arqr arqrVar, dmc dmcVar) {
        this.c = list;
        this.d = dmmVar;
        this.e = dleVar;
        this.f = arqrVar;
        this.a = dmcVar;
        this.g = new byu(obj, cav.a);
    }

    @Override // defpackage.cas
    public final Object a() {
        return this.g.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #2 {all -> 0x0035, blocks: (B:12:0x0030, B:15:0x0063, B:17:0x0073), top: B:11:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095 A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:23:0x0095, B:31:0x00c1, B:43:0x004a), top: B:42:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1 A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:23:0x0095, B:31:0x00c1, B:43:0x004a), top: B:42:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0071 -> B:13:0x00d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d3 -> B:13:0x00d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dld.b(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.dlh r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dld.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r7
            dld$3 r0 = (defpackage.dld.AnonymousClass3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dld$3 r0 = new dld$3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.aqil.P(r7)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L72
            goto L7e
        L2a:
            r7 = move-exception
            goto L49
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.aqil.P(r7)
            dld$4 r7 = new dld$4     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L72
            r7.<init>(r6, r4)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L72
            r0.a = r6     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L72
            r0.d = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L72
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r7 = defpackage.arwi.s(r2, r7, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L72
            if (r7 != r1) goto L7e
            return r1
        L49:
            arpi r1 = r0.u()
            akty r2 = kotlinx.coroutines.CoroutineExceptionHandler.c
            arpg r1 = r1.get(r2)
            kotlinx.coroutines.CoroutineExceptionHandler r1 = (kotlinx.coroutines.CoroutineExceptionHandler) r1
            if (r1 != 0) goto L58
            goto L7d
        L58:
            arpi r0 = r0.u()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r3 = "Unable to load font "
            java.lang.String r6 = r3.concat(r6)
            r2.<init>(r6, r7)
            r1.handleException(r0, r2)
            return r4
        L72:
            r6 = move-exception
            arpi r7 = r0.u()
            boolean r7 = defpackage.arwi.A(r7)
            if (r7 == 0) goto L7f
        L7d:
            r7 = r4
        L7e:
            return r7
        L7f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dld.c(dlh, arpe):java.lang.Object");
    }
}
