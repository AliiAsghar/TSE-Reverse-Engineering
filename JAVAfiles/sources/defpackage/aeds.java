package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeds implements aedd, aebo {
    private final adzj a;
    private final aebn b;
    private final aecw c;
    private final adtl d;

    public aeds(adzj adzjVar, adtl adtlVar, aecw aecwVar, aebn aebnVar) {
        adzjVar.getClass();
        this.a = adzjVar;
        this.d = adtlVar;
        this.c = aecwVar;
        this.b = aebnVar;
    }

    @Override // defpackage.adzl
    public final Object a(arpe arpeVar) {
        return new adzk(this.a.a());
    }

    @Override // defpackage.aedd
    public final Object b(aecj aecjVar, aech aechVar, arpe arpeVar) {
        return this.d.r(aecjVar, aechVar, arpeVar);
    }

    @Override // defpackage.aedd
    public final Object c(aecj aecjVar, arpe arpeVar) {
        Object s = this.d.s(aecjVar, arpeVar);
        if (s == arpl.a) {
            return s;
        }
        return arnb.a;
    }

    @Override // defpackage.aedd
    public final Object d(aecj aecjVar, arpe arpeVar) {
        return this.d.t(aecjVar, arpeVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (r14.u(r13, (defpackage.aedb) r15, r0) != r10) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.aedd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.aecj r13, defpackage.aeda r14, defpackage.arpe r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.aedr
            if (r0 == 0) goto L13
            r0 = r15
            aedr r0 = (defpackage.aedr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aedr r0 = new aedr
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.a
            arpl r10 = defpackage.arpl.a
            int r1 = r0.c
            r11 = 2
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 == r2) goto L32
            if (r1 != r11) goto L2a
            defpackage.aqil.P(r15)
            goto L7f
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            aecj r13 = r0.e
            aeds r14 = r0.d
            defpackage.aqil.P(r15)
            goto L6d
        L3a:
            defpackage.aqil.P(r15)
            aecw r1 = r12.c
            r0.d = r12
            r0.e = r13
            r0.c = r2
            boolean r15 = r14 instanceof defpackage.aedc
            if (r15 == 0) goto L5f
            aedc r14 = (defpackage.aedc) r14
            java.util.List r4 = r14.a
            java.util.List r5 = r14.b
            aozb r6 = r14.c
            java.util.List r14 = r14.d
            r7 = 0
            r9 = 32
            r3 = 0
            r2 = r13
            r8 = r0
            java.lang.Object r14 = defpackage.aecw.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L5d:
            r15 = r14
            goto L6a
        L5f:
            boolean r15 = r14 instanceof defpackage.aecz
            if (r15 == 0) goto L83
            aecz r14 = (defpackage.aecz) r14
            java.lang.Object r14 = r1.a(r13, r14, r0)
            goto L5d
        L6a:
            if (r15 == r10) goto L82
            r14 = r12
        L6d:
            aedb r15 = (defpackage.aedb) r15
            adtl r14 = r14.d
            r1 = 0
            r0.d = r1
            r0.e = r1
            r0.c = r11
            java.lang.Object r13 = r14.u(r13, r15, r0)
            if (r13 != r10) goto L7f
            goto L82
        L7f:
            arnb r13 = defpackage.arnb.a
            return r13
        L82:
            return r10
        L83:
            armm r13 = new armm
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeds.e(aecj, aeda, arpe):java.lang.Object");
    }

    @Override // defpackage.aebo
    public final Object i(aecz aeczVar, arpe arpeVar) {
        return this.b.i(aeczVar, arpeVar);
    }
}
