package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afz {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: afz$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        Object a;
        /* synthetic */ Object b;
        int c;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return afz.a(null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003c -> B:10:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.cqg r8, defpackage.arpe r9) {
        /*
            boolean r0 = r9 instanceof defpackage.afz.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            afz$1 r0 = (defpackage.afz.AnonymousClass1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afz$1 r0 = new afz$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r8 = r0.a
            defpackage.aqil.P(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.aqil.P(r9)
        L34:
            r0.a = r8
            r0.c = r3
            java.lang.Object r9 = defpackage.cqf.a(r8, r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            cqq r9 = (defpackage.cqq) r9
            int r2 = r9.c
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.util.List r2 = r9.a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4f:
            if (r6 >= r4) goto L61
            java.lang.Object r7 = r2.get(r6)
            crc r7 = (defpackage.crc) r7
            boolean r7 = defpackage.cqr.d(r7)
            if (r7 != 0) goto L5e
            goto L34
        L5e:
            int r6 = r6 + 1
            goto L4f
        L61:
            java.util.List r8 = r9.a
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afz.a(cqg, arpe):java.lang.Object");
    }
}
