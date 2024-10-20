package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qoa implements qnx {
    public static final /* synthetic */ int d = 0;
    private static final alwo e = alwo.o("BugleContacts");
    public final wul a;
    public final armf b;
    public final rdc c;
    private final arpi f;
    private final arpi g;
    private final xnv h;
    private final qls i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final armf p;
    private final uie q;
    private final qya r;

    public qoa(arpi arpiVar, arpi arpiVar2, xnv xnvVar, uie uieVar, wul wulVar, qls qlsVar, qya qyaVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, rdc rdcVar, armf armfVar8) {
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
        armfVar6.getClass();
        armfVar7.getClass();
        rdcVar.getClass();
        armfVar8.getClass();
        this.f = arpiVar;
        this.g = arpiVar2;
        this.h = xnvVar;
        this.q = uieVar;
        this.a = wulVar;
        this.i = qlsVar;
        this.r = qyaVar;
        this.j = armfVar;
        this.k = armfVar2;
        this.b = armfVar3;
        this.l = armfVar4;
        this.m = armfVar5;
        this.n = armfVar6;
        this.o = armfVar7;
        this.c = rdcVar;
        this.p = armfVar8;
    }

    @Override // defpackage.qnx
    public final Object a(qnw qnwVar, arpe arpeVar) {
        Object q = arro.q(this.f, new qnm(this, qnwVar, (arpe) null, 2), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.qnw r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.qny
            if (r0 == 0) goto L13
            r0 = r8
            qny r0 = (defpackage.qny) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qny r0 = new qny
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            akrh r7 = r0.e
            qoa r0 = r0.d
            defpackage.aqil.P(r8)     // Catch: java.lang.Throwable -> L2b
            goto L67
        L2b:
            r8 = move-exception
            goto L74
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.aqil.P(r8)
            java.lang.String r8 = "DeletedContactsSync#sync"
            akrh r8 = defpackage.aktp.e(r8)
            alwo r2 = defpackage.qoa.e     // Catch: java.lang.Throwable -> L6f
            alvw r2 = r2.d()     // Catch: java.lang.Throwable -> L6f
            alwl r2 = (defpackage.alwl) r2     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "Syncing deleted contacts"
            r2.q(r4)     // Catch: java.lang.Throwable -> L6f
            armf r2 = r6.b     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L6f
            r2.getClass()     // Catch: java.lang.Throwable -> L6f
            mbl r2 = (defpackage.mbl) r2     // Catch: java.lang.Throwable -> L6f
            r4 = 2
            defpackage.qlm.e(r2, r4)     // Catch: java.lang.Throwable -> L6f
            r0.d = r6     // Catch: java.lang.Throwable -> L6f
            r0.e = r8     // Catch: java.lang.Throwable -> L6f
            r0.c = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r7 = r6.c(r7, r0)     // Catch: java.lang.Throwable -> L6f
            if (r7 == r1) goto L6e
            r7 = r8
        L67:
            r8 = 0
            defpackage.armd.i(r7, r8)
            arnb r7 = defpackage.arnb.a
            return r7
        L6e:
            return r1
        L6f:
            r7 = move-exception
            r0 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L74:
            armf r0 = r0.b     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L84
            r0.getClass()     // Catch: java.lang.Throwable -> L84
            mbl r0 = (defpackage.mbl) r0     // Catch: java.lang.Throwable -> L84
            r1 = 4
            defpackage.qlm.e(r0, r1)     // Catch: java.lang.Throwable -> L84
            throw r8     // Catch: java.lang.Throwable -> L84
        L84:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L86
        L86:
            r0 = move-exception
            defpackage.armd.i(r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qoa.b(qnw, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x036a, code lost:
    
        if (defpackage.arro.q(r4, r5, r2) == r3) goto L100;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0027. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0300 A[LOOP:0: B:35:0x02fa->B:37:0x0300, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fd A[LOOP:1: B:59:0x01f7->B:61:0x01fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b8  */
    /* JADX WARN: Type inference failed for: r1v21, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qnw r25, defpackage.arpe r26) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qoa.c(qnw, arpe):java.lang.Object");
    }
}
