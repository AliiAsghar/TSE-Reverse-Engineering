package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tsl implements tsb {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl");
    private static final alvz h = new alvz("e2ee_update_reason", uax.class, false, false);
    public final arpi b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final qei f;
    public final AtomicReference g;
    private final xnv i;
    private final arwe j;
    private final arpi k;
    private final armf l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final tsa p;
    private final armf q;
    private final armf r;
    private final ConversationIdType s;
    private final rrq t;
    private final tuk u;

    public tsl(xnv xnvVar, arwe arweVar, arpi arpiVar, arpi arpiVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, tsa tsaVar, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, qei qeiVar, ConversationIdType conversationIdType) {
        xnvVar.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        arpiVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        tsaVar.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        qeiVar.getClass();
        conversationIdType.getClass();
        this.i = xnvVar;
        this.j = arweVar;
        this.b = arpiVar;
        this.k = arpiVar2;
        this.l = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.m = armfVar4;
        this.n = armfVar5;
        this.e = armfVar6;
        this.o = armfVar7;
        this.p = tsaVar;
        this.q = armfVar10;
        this.r = armfVar11;
        this.f = qeiVar;
        this.s = conversationIdType;
        this.u = ((rsw) armfVar8.b()).a(qeiVar, conversationIdType);
        this.t = ((rrr) armfVar9.b()).a(qeiVar);
        this.g = new AtomicReference();
    }

    @armg
    private final Object l(qei qeiVar, sec secVar, arpe arpeVar) {
        String h2;
        if (secVar.j() && (h2 = secVar.h()) != null) {
            alpu alpuVar = new alpu();
            alpuVar.b(qeiVar, h2);
            alpx a2 = alpuVar.a();
            a2.getClass();
            Object i = i(a2, arpeVar);
            if (i == arpl.a) {
                return i;
            }
        } else {
            Object j = j(uax.DOWNGRADE_REMOTE_REGISTRATION_MISSING, arpeVar);
            if (j == arpl.a) {
                return j;
            }
        }
        return arnb.a;
    }

    private final void m(int i, ConversationIdType conversationIdType) {
        alvw d = a.d();
        d.X(alwp.a, "BugleEtouffee");
        ((alvg) c((alvg) d).h("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl", "startTimerForRemoteInstanceProcessing", 490, "ConversationE2eeStatusImpl.kt")).r("starting etouffee action timer, remoteInstancesToDownload: %d", i);
        this.g.set(((mce) this.n.b()).m(i, conversationIdType.toString()));
    }

    @Override // defpackage.tsb
    public final akul a() {
        akul c;
        c = qjh.c(this.j, arpj.a, arwf.a, new txt(this, (arpe) null, 1));
        return c;
    }

    @Override // defpackage.tsb
    public final akul b(alog alogVar) {
        alogVar.getClass();
        if (((trz) this.d.b()).i() && !alogVar.isEmpty()) {
            this.p.f(alogVar, this.s);
        }
        return a();
    }

    public final alvg c(alvg alvgVar) {
        alvgVar.X(ydl.D, this.f.d);
        alvgVar.X(ydl.p, this.s);
        return alvgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (r12.g(r11, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (r12.l(r11, r13, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ea, code lost:
    
        if (r12.j(r11, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.qei r11, defpackage.amkd r12, defpackage.arpe r13) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsl.d(qei, amkd, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.qei r13, defpackage.arpe r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.tsf
            if (r0 == 0) goto L13
            r0 = r14
            tsf r0 = (defpackage.tsf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tsf r0 = new tsf
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            alpu r13 = r0.d
            defpackage.aqil.P(r14)
            goto L54
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            defpackage.aqil.P(r14)
            alpu r14 = new alpu
            r14.<init>()
            arpi r2 = r12.k
            mmz r10 = new mmz
            r8 = 0
            r9 = 15
            r4 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.d = r14
            r0.c = r3
            java.lang.Object r13 = defpackage.arro.q(r2, r10, r0)
            if (r13 == r1) goto L67
            r11 = r14
            r14 = r13
            r13 = r11
        L54:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            tsd r0 = new tsd
            alpx r13 = r13.a()
            r13.getClass()
            r0.<init>(r14, r13)
            return r0
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsl.e(qei, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f4, code lost:
    
        if (r2.d(r14, r3, r0) == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0145, code lost:
    
        if (r2.d(r14, r3, r0) == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017e, code lost:
    
        if (r2.g(r14, r0) == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0191, code lost:
    
        if (r2.l(r14, r3, r0) == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a0, code lost:
    
        if (r2.j(r14, r0) == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0294, code lost:
    
        if (r14 == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0290, code lost:
    
        if (r14 != defpackage.arpl.a) goto L77;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.Set, java.lang.Object, java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsl.f(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r7.i(r8, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r7.j(r8, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.qei r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.tsh
            if (r0 == 0) goto L13
            r0 = r8
            tsh r0 = (defpackage.tsh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tsh r0 = new tsh
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            goto L32
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.aqil.P(r8)
            goto L85
        L36:
            tsl r7 = r0.d
            defpackage.aqil.P(r8)
            goto L4a
        L3c:
            defpackage.aqil.P(r8)
            r0.d = r6
            r0.c = r5
            java.lang.Object r8 = r6.e(r7, r0)
            if (r8 == r1) goto L88
            r7 = r6
        L4a:
            tsd r8 = (defpackage.tsd) r8
            boolean r2 = r8.a
            alpx r8 = r8.b
            r5 = 0
            if (r2 == 0) goto L5e
            r0.d = r5
            r0.c = r4
            java.lang.Object r7 = r7.i(r8, r0)
            if (r7 != r1) goto L85
            goto L88
        L5e:
            armf r2 = r7.r
            java.lang.Object r2 = r2.b()
            ofq r2 = (defpackage.ofq) r2
            boolean r2 = r2.a()
            if (r2 != 0) goto L6f
            uax r8 = defpackage.uax.DEFAULT
            goto L7a
        L6f:
            boolean r8 = r8.x()
            if (r8 == 0) goto L78
            uax r8 = defpackage.uax.DOWNGRADE_REMOTE_REGISTRATION_MISSING
            goto L7a
        L78:
            uax r8 = defpackage.uax.DOWNGRADE_REMOTE_REGISTRATION_MISSING_E2EE
        L7a:
            r0.d = r5
            r0.c = r3
            java.lang.Object r7 = r7.j(r8, r0)
            if (r7 != r1) goto L85
            goto L88
        L85:
            arnb r7 = defpackage.arnb.a
            return r7
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsl.g(qei, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x010e, code lost:
    
        if (r13.k(r14, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0130, code lost:
    
        if (r13.j(r12, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
    
        if (j(r12, r0) == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r12, defpackage.rto r13, java.util.Set r14, defpackage.arpe r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsl.h(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, rto, java.util.Set, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.alpx r12, defpackage.arpe r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.tsj
            if (r0 == 0) goto L13
            r0 = r13
            tsj r0 = (defpackage.tsj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tsj r0 = new tsj
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            java.lang.String r3 = "setupScytaleSessions"
            java.lang.String r4 = "BugleEtouffee"
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 != r5) goto L30
            tsl r12 = r0.d
            defpackage.aqil.P(r13)     // Catch: java.lang.Throwable -> L2e
            goto Lbd
        L2e:
            r13 = move-exception
            goto L93
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            defpackage.aqil.P(r13)
            tuk r6 = r11.u     // Catch: java.lang.Throwable -> L90
            r0.d = r11     // Catch: java.lang.Throwable -> L90
            r0.c = r5     // Catch: java.lang.Throwable -> L90
            boolean r13 = r12.x()     // Catch: java.lang.Throwable -> L90
            if (r13 == 0) goto L71
            alvi r12 = defpackage.tuk.a     // Catch: java.lang.Throwable -> L90
            alvw r12 = r12.i()     // Catch: java.lang.Throwable -> L90
            alvz r13 = defpackage.alwp.a     // Catch: java.lang.Throwable -> L90
            r12.X(r13, r4)     // Catch: java.lang.Throwable -> L90
            alvg r12 = (defpackage.alvg) r12     // Catch: java.lang.Throwable -> L90
            alvz r13 = defpackage.ydl.C     // Catch: java.lang.Throwable -> L90
            qei r0 = r6.m     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = r0.d     // Catch: java.lang.Throwable -> L90
            r12.X(r13, r0)     // Catch: java.lang.Throwable -> L90
            java.lang.String r13 = "EtouffeeSessionSetupImpl.kt"
            java.lang.String r0 = "com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSessionSetupImpl"
            r2 = 115(0x73, float:1.61E-43)
            alvw r12 = r12.h(r0, r3, r2, r13)     // Catch: java.lang.Throwable -> L90
            alvg r12 = (defpackage.alvg) r12     // Catch: java.lang.Throwable -> L90
            java.lang.String r13 = "No remote user registrations to set up."
            r12.q(r13)     // Catch: java.lang.Throwable -> L90
            arnb r12 = defpackage.arnb.a     // Catch: java.lang.Throwable -> L90
            goto L8d
        L71:
            arpi r13 = r6.i     // Catch: java.lang.Throwable -> L90
            qsk r2 = new qsk     // Catch: java.lang.Throwable -> L90
            r9 = 16
            r10 = 0
            r8 = 0
            r5 = r2
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L90
            java.lang.Object r12 = defpackage.arro.q(r13, r2, r0)     // Catch: java.lang.Throwable -> L90
            arpl r13 = defpackage.arpl.a     // Catch: java.lang.Throwable -> L90
            if (r12 == r13) goto L88
            arnb r12 = defpackage.arnb.a     // Catch: java.lang.Throwable -> L90
        L88:
            if (r12 != r13) goto L8b
            goto L8d
        L8b:
            arnb r12 = defpackage.arnb.a     // Catch: java.lang.Throwable -> L90
        L8d:
            if (r12 != r1) goto Lbd
            return r1
        L90:
            r12 = move-exception
            r13 = r12
            r12 = r11
        L93:
            alvi r0 = defpackage.tsl.a
            alvw r0 = r0.i()
            alvz r1 = defpackage.alwp.a
            r0.X(r1, r4)
            alvg r0 = (defpackage.alvg) r0
            alvg r12 = r12.c(r0)
            alvw r12 = r12.g(r13)
            java.lang.String r0 = "com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl"
            r1 = 468(0x1d4, float:6.56E-43)
            java.lang.String r2 = "ConversationE2eeStatusImpl.kt"
            alvw r12 = r12.h(r0, r3, r1, r2)
            alvg r12 = (defpackage.alvg) r12
            java.lang.String r0 = "Failed to setup remote instance session"
            r12.q(r0)
            boolean r12 = r13 instanceof java.util.concurrent.CancellationException
            if (r12 != 0) goto Lc0
        Lbd:
            arnb r12 = defpackage.arnb.a
            return r12
        Lc0:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsl.i(alpx, arpe):java.lang.Object");
    }

    public final Object j(uax uaxVar, arpe arpeVar) {
        alvw d = a.d();
        d.X(alwp.a, "BugleEtouffee");
        alvg c = c((alvg) d);
        c.X(h, uaxVar);
        ((alvg) c.h("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl", "takedownEncryptionForConversation", 478, "ConversationE2eeStatusImpl.kt")).q("Disabling Etouffee for conversation draft");
        Object c2 = this.u.c(0, uaxVar, arpeVar);
        if (c2 == arpl.a) {
            return c2;
        }
        return arnb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (r2.i((defpackage.alpx) r10, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.alpx r10, defpackage.arpe r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.tsk
            if (r0 == 0) goto L13
            r0 = r11
            tsk r0 = (defpackage.tsk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            tsk r0 = new tsk
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.aqil.P(r11)
            goto L98
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            java.lang.Object r10 = r0.a
            tsl r2 = r0.e
            defpackage.aqil.P(r11)
            goto L81
        L3e:
            java.lang.Object r10 = r0.a
            tsl r2 = r0.e
            defpackage.aqil.P(r11)
            goto L6a
        L46:
            defpackage.aqil.P(r11)
            armf r11 = r9.o
            java.lang.Object r11 = r11.b()
            wyp r11 = (defpackage.wyp) r11
            qei r2 = r9.f
            java.lang.String r2 = r2.d
            vel r11 = r11.D(r2)
            akul r11 = r11.a()
            r0.e = r9
            r0.a = r10
            r0.d = r5
            java.lang.Object r11 = defpackage.arro.F(r11, r0)
            if (r11 == r1) goto Ld5
            r2 = r9
        L6a:
            j$.util.Optional r11 = (j$.util.Optional) r11
            arpi r5 = r2.b
            rdx r7 = new rdx
            r8 = 10
            r7.<init>(r11, r2, r6, r8)
            r0.e = r2
            r0.a = r10
            r0.d = r4
            java.lang.Object r11 = defpackage.arro.q(r5, r7, r0)
            if (r11 == r1) goto Ld5
        L81:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L9b
            r0.e = r6
            r0.a = r6
            r0.d = r3
            alpx r10 = (defpackage.alpx) r10
            java.lang.Object r10 = r2.i(r10, r0)
            if (r10 != r1) goto L98
            goto Ld5
        L98:
            arnb r10 = defpackage.arnb.a
            return r10
        L9b:
            alvi r10 = defpackage.tsl.a
            alvw r10 = r10.g()
            alvz r11 = defpackage.alwp.a
            java.lang.String r0 = "BugleEtouffee"
            r10.X(r11, r0)
            alvg r10 = (defpackage.alvg) r10
            alvg r10 = r2.c(r10)
            java.lang.String r11 = "skipEtouffeeSetupIfCapsNotSynced"
            r0 = 351(0x15f, float:4.92E-43)
            java.lang.String r1 = "com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl"
            java.lang.String r3 = "ConversationE2eeStatusImpl.kt"
            alvw r10 = r10.h(r1, r11, r0, r3)
            alvg r10 = (defpackage.alvg) r10
            java.lang.String r11 = "etouffee configs not in sync, skipping etouffee setup"
            r10.q(r11)
            armf r10 = r2.m
            java.lang.Object r10 = r10.b()
            mbl r10 = (defpackage.mbl) r10
            uax r11 = defpackage.uax.SKIP_UPGRADE_FLAG_AND_BACKEND_NOT_SYNCED
            int r11 = r11.t
            java.lang.String r0 = "Bugle.Etouffee.Conversation.Encryption.Update"
            r10.e(r0, r11)
            arnb r10 = defpackage.arnb.a
            return r10
        Ld5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsl.k(alpx, arpe):java.lang.Object");
    }
}
