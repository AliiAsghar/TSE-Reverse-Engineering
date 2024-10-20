package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qjp implements qkg {
    private final arml a;

    public qjp(arqg arqgVar) {
        arml b;
        if (anfi.a("bugle.enable_synchronized_lazy_in_constant_flow", "bugle")) {
            b = armd.a(arqgVar);
        } else {
            b = armd.b(3, arqgVar);
        }
        this.a = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (defpackage.arwi.l(r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r6.fv(r7, r0) != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.asai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.asaj r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.qjo
            if (r0 == 0) goto L13
            r0 = r7
            qjo r0 = (defpackage.qjo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qjo r0 = new qjo
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2e:
            defpackage.aqil.P(r7)
            goto L5f
        L32:
            defpackage.aqil.P(r7)
            goto L56
        L36:
            defpackage.aqil.P(r7)
            arpi r7 = r0.u()
            akty r2 = defpackage.arxm.c
            arpg r7 = r7.get(r2)
            arxm r7 = (defpackage.arxm) r7
            if (r7 == 0) goto L4a
            defpackage.arwi.z(r7)
        L4a:
            java.lang.Object r7 = r5.c()
            r0.c = r4
            java.lang.Object r6 = r6.fv(r7, r0)
            if (r6 == r1) goto L65
        L56:
            r0.c = r3
            java.lang.Object r6 = defpackage.arwi.l(r0)
            if (r6 != r1) goto L5f
            goto L65
        L5f:
            armj r6 = new armj
            r6.<init>()
            throw r6
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjp.a(asaj, arpe):java.lang.Object");
    }

    @Override // defpackage.qkg
    public final Object b() {
        return c();
    }

    public final Object c() {
        return this.a.a();
    }
}
