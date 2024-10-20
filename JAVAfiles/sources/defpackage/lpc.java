package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpc implements lju {
    public final Optional a;
    private final arwe b;
    private final acdd c;
    private final aiim d;

    public lpc(Optional optional, arwe arweVar, acdd acddVar, aiim aiimVar, yjf yjfVar) {
        arweVar.getClass();
        acddVar.getClass();
        yjfVar.getClass();
        this.a = optional;
        this.b = arweVar;
        this.c = acddVar;
        this.d = aiimVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.lpa
            if (r0 == 0) goto L13
            r0 = r7
            lpa r0 = (defpackage.lpa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lpa r0 = new lpa
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r7)
            goto L52
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.aqil.P(r7)
            acdd r7 = r6.c
            r2 = 100
            acir r7 = r7.a(r2)
            lnn r2 = new lnn
            r4 = 2
            r2.<init>(r6, r4)
            kos r4 = new kos
            r5 = 3
            r4.<init>(r2, r5)
            r7.s(r4)
            r0.c = r3
            java.lang.Object r7 = defpackage.arsd.au(r7, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            android.location.Location r7 = (android.location.Location) r7
            arnb r7 = defpackage.arnb.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpc.b(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (r8.a(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.lju
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.loz r8, defpackage.arpe r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.lpb
            if (r0 == 0) goto L13
            r0 = r9
            lpb r0 = (defpackage.lpb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lpb r0 = new lpb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r9)
            goto L83
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            loz r8 = r0.e
            lpc r2 = r0.d
            defpackage.aqil.P(r9)
            goto L5d
        L3a:
            defpackage.aqil.P(r9)
            j$.util.Optional r9 = r7.a
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L83
            boolean r9 = r8.a
            aiim r9 = r7.d
            afkj r2 = defpackage.afkj.b
            java.util.List r2 = defpackage.aqjn.y(r2)
            r0.d = r7
            r0.e = r8
            r0.c = r4
            java.lang.Object r9 = r9.p(r2, r0)
            if (r9 != r1) goto L5c
            goto L82
        L5c:
            r2 = r7
        L5d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L83
            arwe r9 = r2.b
            lgp r4 = new lgp
            r5 = 4
            r6 = 0
            r4.<init>(r2, r6, r5)
            r2 = 3
            defpackage.qjh.l(r9, r6, r4, r2)
            boolean r9 = r8.a
            arqr r8 = r8.b
            r0.d = r6
            r0.e = r6
            r0.c = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L83
        L82:
            return r1
        L83:
            arnb r8 = defpackage.arnb.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpc.a(loz, arpe):java.lang.Object");
    }
}
