package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qsm implements qsr {
    public final qrq b;
    public final armf c;
    public final armf d;
    public final ozn e;
    private final qrq f;
    private final arpi g;
    private final arwe h;
    private final qvv i;
    private final qvr j;
    private static final asgm k = new asgm();
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/core/destination/CachingDestinationManager");

    public qsm(qrq qrqVar, qrq qrqVar2, armf armfVar, armf armfVar2, arpi arpiVar, arwe arweVar, qvv qvvVar, qvr qvrVar, ozn oznVar) {
        qrqVar.getClass();
        qrqVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        arpiVar.getClass();
        arweVar.getClass();
        qvvVar.getClass();
        qvrVar.getClass();
        this.f = qrqVar;
        this.b = qrqVar2;
        this.c = armfVar;
        this.d = armfVar2;
        this.g = arpiVar;
        this.h = arweVar;
        this.i = qvvVar;
        this.j = qvrVar;
        this.e = oznVar;
    }

    private final Object j(String str, qsn qsnVar, arpe arpeVar) {
        return this.b.a(str, new qka(this, str, qsnVar, (arpe) null, 2), arpeVar);
    }

    private final Object k(qsn qsnVar, String str, arpe arpeVar) {
        Object q = arro.q(this.g, new mmz(qsnVar, str, this, (arpe) null, 5), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    @Override // defpackage.qsr
    public final akul a(qss qssVar) {
        akul c;
        qssVar.getClass();
        c = qjh.c(this.h, arpj.a, arwf.a, new qsk(this, qssVar, (arpe) null, 1));
        return c;
    }

    @Override // defpackage.qsr
    public final akul b(aqfn aqfnVar) {
        akul c;
        c = qjh.c(this.h, arpj.a, arwf.a, new qsk(this, aqfnVar, (arpe) null, 0));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qsn r7, java.lang.String r8, defpackage.arpe r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.qse
            if (r0 == 0) goto L13
            r0 = r9
            qse r0 = (defpackage.qse) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qse r0 = new qse
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.a
            qso r7 = (defpackage.qso) r7
            defpackage.aqil.P(r9)
            goto L8b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.String r8 = r0.f
            qsn r7 = r0.e
            java.lang.Object r2 = r0.a
            qsm r2 = (defpackage.qsm) r2
            defpackage.aqil.P(r9)
            goto L54
        L42:
            defpackage.aqil.P(r9)
            r0.a = r6
            r0.e = r7
            r0.f = r8
            r0.d = r4
            java.lang.Object r9 = r6.k(r7, r8, r0)
            if (r9 == r1) goto L8c
            r2 = r6
        L54:
            qso r9 = new qso
            qss r4 = new qss
            java.util.UUID r5 = java.util.UUID.randomUUID()
            r5.getClass()
            r4.<init>(r5)
            r9.<init>(r4, r7, r8)
            armf r7 = r2.c
            java.lang.Object r7 = r7.b()
            qtc r7 = (defpackage.qtc) r7
            r0.a = r9
            r8 = 0
            r0.e = r8
            r0.f = r8
            r0.d = r3
            arpi r7 = r7.b
            pze r2 = new pze
            r3 = 6
            r2.<init>(r9, r8, r3)
            java.lang.Object r7 = defpackage.arro.q(r7, r2, r0)
            arpl r8 = defpackage.arpl.a
            if (r7 == r8) goto L88
            arnb r7 = defpackage.arnb.a
        L88:
            if (r7 == r1) goto L8c
            r7 = r9
        L8b:
            return r7
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsm.c(qsn, java.lang.String, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.qsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.qei r8, defpackage.arpe r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.qsf
            if (r0 == 0) goto L13
            r0 = r9
            qsf r0 = (defpackage.qsf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qsf r0 = new qsf
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            akrh r8 = r0.d
            defpackage.aqil.P(r9)     // Catch: java.lang.Throwable -> L2a
            goto L9f
        L2a:
            r9 = move-exception
            goto Lb3
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.aqil.P(r9)
            int r9 = r8.c
            qeh r9 = defpackage.qeh.b(r9)
            if (r9 != 0) goto L42
            qeh r9 = defpackage.qeh.UNKNOWN_TYPE
        L42:
            qeh r2 = defpackage.qeh.GROUP
            if (r9 == r2) goto Lc1
            arpi r9 = r0.u()
            boolean r9 = defpackage.aktp.al(r9)
            if (r9 == 0) goto Lb9
            java.lang.String r9 = "CachingDestinationManager#fromChatEndpoint"
            akrh r9 = defpackage.aktp.e(r9)
            java.lang.String r2 = r8.d     // Catch: java.lang.Throwable -> Laf
            r2.getClass()     // Catch: java.lang.Throwable -> Laf
            int r8 = r8.c     // Catch: java.lang.Throwable -> Laf
            qeh r8 = defpackage.qeh.b(r8)     // Catch: java.lang.Throwable -> Laf
            if (r8 != 0) goto L65
            qeh r8 = defpackage.qeh.UNKNOWN_TYPE     // Catch: java.lang.Throwable -> Laf
        L65:
            int r4 = r8.ordinal()     // Catch: java.lang.Throwable -> Laf
            if (r4 == 0) goto La7
            if (r4 == r3) goto L8d
            r5 = 2
            if (r4 == r5) goto L8a
            r5 = 3
            if (r4 != r5) goto L76
            qsn r8 = defpackage.qsn.b     // Catch: java.lang.Throwable -> Laf
            goto L8f
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Laf
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = "unknown enum value: "
            java.lang.String r8 = r1.concat(r8)     // Catch: java.lang.Throwable -> Laf
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Laf
            throw r0     // Catch: java.lang.Throwable -> Laf
        L8a:
            qsn r8 = defpackage.qsn.c     // Catch: java.lang.Throwable -> Laf
            goto L8f
        L8d:
            qsn r8 = defpackage.qsn.a     // Catch: java.lang.Throwable -> Laf
        L8f:
            r8.getClass()     // Catch: java.lang.Throwable -> Laf
            r0.d = r9     // Catch: java.lang.Throwable -> Laf
            r0.c = r3     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r8 = r7.j(r2, r8, r0)     // Catch: java.lang.Throwable -> Laf
            if (r8 == r1) goto La6
            r6 = r9
            r9 = r8
            r8 = r6
        L9f:
            qss r9 = (defpackage.qss) r9     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            defpackage.armd.i(r8, r0)
            return r9
        La6:
            return r1
        La7:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "Destination AddressType cannot be converted from an UNKNOWN ChatEndpoint type."
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Laf
            throw r8     // Catch: java.lang.Throwable -> Laf
        Laf:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        Lb3:
            throw r9     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r0 = move-exception
            defpackage.armd.i(r8, r9)
            throw r0
        Lb9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r8.<init>(r9)
            throw r8
        Lc1:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Group type not supported."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsm.d(qei, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.qsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.qwe r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.qsg
            if (r0 == 0) goto L13
            r0 = r7
            qsg r0 = (defpackage.qsg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qsg r0 = new qsg
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r7)
            goto L74
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            qsm r6 = r0.d
            defpackage.aqil.P(r7)
            goto L48
        L38:
            defpackage.aqil.P(r7)
            qvv r7 = r5.i
            r0.d = r5
            r0.c = r4
            java.lang.Object r7 = r7.f(r6, r0)
            if (r7 == r1) goto L7d
            r6 = r5
        L48:
            qvo r7 = (defpackage.qvo) r7
            qvn r2 = r7.b
            qvn r4 = defpackage.qvn.a
            if (r2 != r4) goto L75
            qvr r2 = r6.j
            uac r7 = r2.a(r7)
            j$.util.Optional r7 = r7.C()
            r7.getClass()
            java.lang.Object r7 = defpackage.arsd.k(r7)
            java.lang.String r7 = (java.lang.String) r7
            r2 = 0
            if (r7 != 0) goto L67
            return r2
        L67:
            qsn r4 = defpackage.qsn.a
            r0.d = r2
            r0.c = r3
            java.lang.Object r7 = r6.j(r7, r4, r0)
            if (r7 != r1) goto L74
            return r1
        L74:
            return r7
        L75:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Failed requirement."
            r6.<init>(r7)
            throw r6
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsm.e(qwe, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.qsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.qss r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.qsh
            if (r0 == 0) goto L13
            r0 = r10
            qsh r0 = (defpackage.qsh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qsh r0 = new qsh
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            akrh r9 = r0.d
            defpackage.aqil.P(r10)     // Catch: java.lang.Throwable -> L2a
            goto L5d
        L2a:
            r10 = move-exception
            goto L68
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.aqil.P(r10)
            arpi r10 = r0.u()
            boolean r10 = defpackage.aktp.al(r10)
            if (r10 == 0) goto L6e
            java.lang.String r10 = "CachingDestinationManager#getDestination"
            akrh r10 = defpackage.aktp.e(r10)
            qrq r2 = r8.f     // Catch: java.lang.Throwable -> L64
            mlg r5 = new mlg     // Catch: java.lang.Throwable -> L64
            r6 = 20
            r5.<init>(r9, r8, r3, r6)     // Catch: java.lang.Throwable -> L64
            r0.d = r10     // Catch: java.lang.Throwable -> L64
            r0.c = r4     // Catch: java.lang.Throwable -> L64
            java.lang.Object r9 = r2.a(r9, r5, r0)     // Catch: java.lang.Throwable -> L64
            if (r9 == r1) goto L63
            r7 = r10
            r10 = r9
            r9 = r7
        L5d:
            qso r10 = (defpackage.qso) r10     // Catch: java.lang.Throwable -> L2a
            defpackage.armd.i(r9, r3)
            return r10
        L63:
            return r1
        L64:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L68:
            throw r10     // Catch: java.lang.Throwable -> L69
        L69:
            r0 = move-exception
            defpackage.armd.i(r9, r10)
            throw r0
        L6e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsm.f(qss, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.aqfn r8, defpackage.arpe r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.qsi
            if (r0 == 0) goto L13
            r0 = r9
            qsi r0 = (defpackage.qsi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qsi r0 = new qsi
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            akrh r8 = r0.d
            defpackage.aqil.P(r9)     // Catch: java.lang.Throwable -> L29
            goto L90
        L29:
            r9 = move-exception
            goto L9c
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.aqil.P(r9)
            arpi r9 = r0.u()
            boolean r9 = defpackage.aktp.al(r9)
            if (r9 == 0) goto La2
            java.lang.String r9 = "CachingDestinationManager#matchTachyonId"
            akrh r9 = defpackage.aktp.e(r9)
            java.lang.String r2 = r8.c     // Catch: java.lang.Throwable -> L98
            r2.getClass()     // Catch: java.lang.Throwable -> L98
            int r4 = r8.b     // Catch: java.lang.Throwable -> L98
            asku r4 = defpackage.asku.b(r4)     // Catch: java.lang.Throwable -> L98
            if (r4 != 0) goto L56
            asku r4 = defpackage.asku.UNRECOGNIZED     // Catch: java.lang.Throwable -> L98
        L56:
            int r4 = r4.ordinal()     // Catch: java.lang.Throwable -> L98
            if (r4 == r3) goto L81
            r5 = 2
            if (r4 == r5) goto L7e
            r5 = 10
            if (r4 == r5) goto L7b
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L98
            int r8 = r8.b     // Catch: java.lang.Throwable -> L98
            asku r8 = defpackage.asku.b(r8)     // Catch: java.lang.Throwable -> L98
            if (r8 != 0) goto L6f
            asku r8 = defpackage.asku.UNRECOGNIZED     // Catch: java.lang.Throwable -> L98
        L6f:
            java.lang.String r1 = "Tachyon ID type "
            java.lang.String r2 = " cannot be converted to a Destination AddressType."
            java.lang.String r8 = defpackage.a.cc(r8, r1, r2)     // Catch: java.lang.Throwable -> L98
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L98
            throw r0     // Catch: java.lang.Throwable -> L98
        L7b:
            qsn r8 = defpackage.qsn.b     // Catch: java.lang.Throwable -> L98
            goto L83
        L7e:
            qsn r8 = defpackage.qsn.c     // Catch: java.lang.Throwable -> L98
            goto L83
        L81:
            qsn r8 = defpackage.qsn.a     // Catch: java.lang.Throwable -> L98
        L83:
            r0.d = r9     // Catch: java.lang.Throwable -> L98
            r0.c = r3     // Catch: java.lang.Throwable -> L98
            java.lang.Object r8 = r7.j(r2, r8, r0)     // Catch: java.lang.Throwable -> L98
            if (r8 == r1) goto L97
            r6 = r9
            r9 = r8
            r8 = r6
        L90:
            qss r9 = (defpackage.qss) r9     // Catch: java.lang.Throwable -> L29
            r0 = 0
            defpackage.armd.i(r8, r0)
            return r9
        L97:
            return r1
        L98:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L9c:
            throw r9     // Catch: java.lang.Throwable -> L9d
        L9d:
            r0 = move-exception
            defpackage.armd.i(r8, r9)
            throw r0
        La2:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsm.g(aqfn, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r11 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.String r9, defpackage.qsn r10, defpackage.arpe r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.qsj
            if (r0 == 0) goto L13
            r0 = r11
            qsj r0 = (defpackage.qsj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qsj r0 = new qsj
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            qsm r9 = r0.d
            defpackage.aqil.P(r11)
            goto L8d
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            qsn r10 = r0.f
            java.lang.String r9 = r0.e
            qsm r2 = r0.d
            defpackage.aqil.P(r11)
            r11 = r10
            r10 = r9
            r9 = r2
            goto L55
        L41:
            defpackage.aqil.P(r11)
            r0.d = r8
            r0.e = r9
            r0.f = r10
            r0.c = r4
            java.lang.Object r11 = r8.k(r10, r9, r0)
            if (r11 == r1) goto L99
            r11 = r10
            r10 = r9
            r9 = r8
        L55:
            alvi r2 = defpackage.qsm.a
            alvw r2 = r2.d()
            alvz r4 = defpackage.alwp.a
            java.lang.String r5 = "BugleCME"
            r2.X(r4, r5)
            java.lang.String r4 = "matchExactOrCreate"
            r5 = 135(0x87, float:1.89E-43)
            java.lang.String r6 = "com/google/android/apps/messaging/shared/core/destination/CachingDestinationManager"
            java.lang.String r7 = "CachingDestinationManager.kt"
            alvw r2 = r2.h(r6, r4, r5, r7)
            alvg r2 = (defpackage.alvg) r2
            java.lang.String r4 = "Cache miss matching destination. Loading from database."
            r2.q(r4)
            armf r2 = r9.c
            java.lang.Object r2 = r2.b()
            qtc r2 = (defpackage.qtc) r2
            r0.d = r9
            r4 = 0
            r0.e = r4
            r0.f = r4
            r0.c = r3
            java.lang.Object r11 = r2.a(r10, r11, r0)
            if (r11 != r1) goto L8d
            goto L99
        L8d:
            qso r11 = (defpackage.qso) r11
            qss r10 = r11.a
            qrq r9 = r9.f
            r9.b(r10, r11)
            qss r9 = r11.a
            return r9
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsm.h(java.lang.String, qsn, arpe):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(5:(2:3|(8:5|6|7|(1:(1:(1:(6:12|13|14|15|16|17)(2:20|21))(8:22|23|24|25|(1:27)|15|16|17))(1:30))(3:40|(1:42)|29)|31|32|(6:34|25|(0)|15|16|17)|29))|31|32|(0)|29)|44|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if (r12 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0035, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:14:0x00b2, B:15:0x00b5, B:23:0x004a, B:25:0x009e, B:27:0x00a2), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v8, types: [asgm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.String r10, defpackage.qsn r11, defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsm.i(java.lang.String, qsn, arpe):java.lang.Object");
    }
}
