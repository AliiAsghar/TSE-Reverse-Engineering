package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ankw implements ankl {
    public static final anip a;
    private final anlp b;
    private final anjr c;

    static {
        aoad aoadVar = new aoad((char[]) null, (byte[]) null);
        aoadVar.s("tachygram");
        aoadVar.r("multipart");
        a = aoadVar.p();
    }

    public ankw(anlp anlpVar, anjr anjrVar) {
        this.b = anlpVar;
        this.c = anjrVar;
    }

    @Override // defpackage.ankl
    public final Iterable a() {
        return aqjn.y(aqdr.TACHYGRAM_MESSAGE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ankl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.aqds r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.anku
            if (r0 == 0) goto L13
            r0 = r8
            anku r0 = (defpackage.anku) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            anku r0 = new anku
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            aqds r7 = r0.e
            ankw r0 = r0.d
            defpackage.aqil.P(r8)     // Catch: defpackage.aniv -> L2b
            goto L70
        L2b:
            r8 = move-exception
            goto L75
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.aqil.P(r8)
            anjr r8 = r6.c
            aptx r2 = defpackage.aptx.a
            aozy r2 = r2.createBuilder()
            r2.getClass()
            apty r4 = defpackage.apty.a
            aozy r4 = r4.createBuilder()
            r4.getClass()
            r5 = 7
            defpackage.aovn.l(r5, r4)
            java.lang.String r5 = r7.c
            defpackage.aovn.i(r5, r4)
            apty r4 = defpackage.aovn.g(r4)
            defpackage.aovn.p(r4, r2)
            aptx r2 = defpackage.aovn.m(r2)
            r8.a(r2)
            r0.d = r6     // Catch: defpackage.aniv -> L73
            r0.e = r7     // Catch: defpackage.aniv -> L73
            r0.c = r3     // Catch: defpackage.aniv -> L73
            java.lang.Object r7 = r6.c(r7, r0)     // Catch: defpackage.aniv -> L73
            if (r7 != r1) goto L70
            return r1
        L70:
            arnb r7 = defpackage.arnb.a
            return r7
        L73:
            r8 = move-exception
            r0 = r6
        L75:
            anjr r0 = r0.c
            aptx r1 = defpackage.aptx.a
            aozy r1 = r1.createBuilder()
            r1.getClass()
            apty r2 = defpackage.apty.a
            aozy r2 = r2.createBuilder()
            r2.getClass()
            java.lang.String r7 = r7.c
            defpackage.aovn.i(r7, r2)
            r7 = 6
            defpackage.aovn.l(r7, r2)
            anit r7 = r8.a
            aptw r7 = defpackage.xea.a(r7)
            defpackage.aovn.k(r7, r2)
            apty r7 = defpackage.aovn.g(r2)
            defpackage.aovn.p(r7, r1)
            aptx r7 = defpackage.aovn.m(r1)
            r0.a(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ankw.b(aqds, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.aqds r21, defpackage.arpe r22) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ankw.c(aqds, arpe):java.lang.Object");
    }
}
