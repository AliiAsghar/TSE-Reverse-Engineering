package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qnn implements qng {
    public static final alwo a = alwo.o("BugleContacts");
    public final wul b;
    public final qls c;
    public final armf d;
    public final qya e;
    public final rdc f;
    public final hmk g;
    private final arpi h;
    private final arpi i;
    private final xnv j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final armf p;
    private final uie q;

    public qnn(arpi arpiVar, arpi arpiVar2, xnv xnvVar, uie uieVar, wul wulVar, qls qlsVar, qya qyaVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, hmk hmkVar, rdc rdcVar, armf armfVar6, armf armfVar7) {
        arpiVar.getClass();
        arpiVar2.getClass();
        xnvVar.getClass();
        uieVar.getClass();
        wulVar.getClass();
        qlsVar.getClass();
        qyaVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        rdcVar.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        this.h = arpiVar;
        this.i = arpiVar2;
        this.j = xnvVar;
        this.q = uieVar;
        this.b = wulVar;
        this.c = qlsVar;
        this.e = qyaVar;
        this.k = armfVar;
        this.l = armfVar2;
        this.m = armfVar3;
        this.d = armfVar4;
        this.n = armfVar5;
        this.g = hmkVar;
        this.f = rdcVar;
        this.o = armfVar6;
        this.p = armfVar7;
    }

    @Override // defpackage.qng
    public final Object a(qnf qnfVar, arpe arpeVar) {
        Object q = arro.q(this.h, new qnm(this, qnfVar, (arpe) null, 0), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0102, code lost:
    
        if (defpackage.qlm.c(r0) != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0148 -> B:17:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r20, double r22, defpackage.arqr r24, defpackage.arpe r25) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnn.b(long, double, arqr, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qnf r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.qnj
            if (r0 == 0) goto L13
            r0 = r8
            qnj r0 = (defpackage.qnj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qnj r0 = new qnj
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            akrh r7 = r0.e
            qnn r0 = r0.d
            defpackage.aqil.P(r8)     // Catch: java.lang.Throwable -> L2b
            goto L66
        L2b:
            r8 = move-exception
            goto L73
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.aqil.P(r8)
            java.lang.String r8 = "ContactsChangeSync#sync"
            akrh r8 = defpackage.aktp.e(r8)
            alwo r2 = defpackage.qnn.a     // Catch: java.lang.Throwable -> L6e
            alvw r2 = r2.d()     // Catch: java.lang.Throwable -> L6e
            alwl r2 = (defpackage.alwl) r2     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "Syncing changed contacts"
            r2.q(r4)     // Catch: java.lang.Throwable -> L6e
            armf r2 = r6.m     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L6e
            r2.getClass()     // Catch: java.lang.Throwable -> L6e
            mbl r2 = (defpackage.mbl) r2     // Catch: java.lang.Throwable -> L6e
            defpackage.qlm.e(r2, r3)     // Catch: java.lang.Throwable -> L6e
            r0.d = r6     // Catch: java.lang.Throwable -> L6e
            r0.e = r8     // Catch: java.lang.Throwable -> L6e
            r0.c = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r7 = r6.d(r7, r0)     // Catch: java.lang.Throwable -> L6e
            if (r7 == r1) goto L6d
            r7 = r8
        L66:
            r8 = 0
            defpackage.armd.i(r7, r8)
            arnb r7 = defpackage.arnb.a
            return r7
        L6d:
            return r1
        L6e:
            r7 = move-exception
            r0 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L73:
            armf r0 = r0.m     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L83
            r0.getClass()     // Catch: java.lang.Throwable -> L83
            mbl r0 = (defpackage.mbl) r0     // Catch: java.lang.Throwable -> L83
            r1 = 3
            defpackage.qlm.e(r0, r1)     // Catch: java.lang.Throwable -> L83
            throw r8     // Catch: java.lang.Throwable -> L83
        L83:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            defpackage.armd.i(r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnn.c(qnf, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0447, code lost:
    
        if (defpackage.arro.q(r1, r3, r2) == r10) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01fe, code lost:
    
        if (defpackage.arro.F(r1, r2) == r10) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01bd A[LOOP:8: B:156:0x01b7->B:158:0x01bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.qnf r32, defpackage.arpe r33) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnn.d(qnf, arpe):java.lang.Object");
    }
}
