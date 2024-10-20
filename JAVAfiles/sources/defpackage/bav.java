package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bav extends arpw implements arqv<arwe, arpe<? super Boolean>, Object> {
    final /* synthetic */ baw a;
    private /* synthetic */ Object b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bav$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ arxm b;
        final /* synthetic */ baw c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arxm arxmVar, baw bawVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = arxmVar;
            this.c = bawVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0063 -> B:8:0x0066). Please report as a decompilation issue!!! */
        @Override // defpackage.arpq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.Object r10) {
            /*
                r9 = this;
                arpl r0 = defpackage.arpl.a
                int r1 = r9.a
                r2 = 500(0x1f4, double:2.47E-321)
                r4 = 0
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 3
                r7 = 2
                r8 = 1
                if (r1 == 0) goto L24
                if (r1 == r8) goto L20
                if (r1 == r7) goto L1c
                if (r1 == r6) goto L18
                defpackage.aqil.P(r10)     // Catch: java.lang.Throwable -> L6c
                goto L66
            L18:
                defpackage.aqil.P(r10)     // Catch: java.lang.Throwable -> L6c
                goto L57
            L1c:
                defpackage.aqil.P(r10)     // Catch: java.lang.Throwable -> L6c
                goto L49
            L20:
                defpackage.aqil.P(r10)
                goto L35
            L24:
                defpackage.aqil.P(r10)
                arxm r10 = r9.b
                if (r10 == 0) goto L35
                r9.a = r8
                java.lang.Object r10 = defpackage.arwi.t(r10, r9)
                if (r10 == r0) goto L34
                goto L35
            L34:
                return r0
            L35:
                baw r10 = r9.c     // Catch: java.lang.Throwable -> L6c
                r10.a(r5)     // Catch: java.lang.Throwable -> L6c
                baw r10 = r9.c     // Catch: java.lang.Throwable -> L6c
                boolean r10 = r10.a     // Catch: java.lang.Throwable -> L6c
                if (r10 != 0) goto L4f
                r9.a = r7     // Catch: java.lang.Throwable -> L6c
                java.lang.Object r10 = defpackage.arwi.l(r9)     // Catch: java.lang.Throwable -> L6c
                if (r10 != r0) goto L49
                return r0
            L49:
                armj r10 = new armj     // Catch: java.lang.Throwable -> L6c
                r10.<init>()     // Catch: java.lang.Throwable -> L6c
                throw r10     // Catch: java.lang.Throwable -> L6c
            L4f:
                r9.a = r6     // Catch: java.lang.Throwable -> L6c
                java.lang.Object r10 = defpackage.arwi.m(r2, r9)     // Catch: java.lang.Throwable -> L6c
                if (r10 == r0) goto L6e
            L57:
                baw r10 = r9.c     // Catch: java.lang.Throwable -> L6c
                r10.a(r4)     // Catch: java.lang.Throwable -> L6c
                r10 = 4
                r9.a = r10     // Catch: java.lang.Throwable -> L6c
                java.lang.Object r10 = defpackage.arwi.m(r2, r9)     // Catch: java.lang.Throwable -> L6c
                if (r10 != r0) goto L66
                return r0
            L66:
                baw r10 = r9.c     // Catch: java.lang.Throwable -> L6c
                r10.a(r5)     // Catch: java.lang.Throwable -> L6c
                goto L4f
            L6c:
                r10 = move-exception
                goto L6f
            L6e:
                return r0
            L6f:
                baw r0 = r9.c
                r0.a(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bav.AnonymousClass1.b(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.b, this.c, arpeVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bav(baw bawVar, arpe arpeVar) {
        super(2, arpeVar);
        this.a = bawVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bav) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        arwe arweVar = (arwe) this.b;
        arxm arxmVar = (arxm) this.a.b.getAndSet(null);
        baw bawVar = this.a;
        return Boolean.valueOf(a.bE(bawVar.b, arrn.J(arweVar, null, null, new AnonymousClass1(arxmVar, bawVar, null), 3)));
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        bav bavVar = new bav(this.a, arpeVar);
        bavVar.b = obj;
        return bavVar;
    }
}
