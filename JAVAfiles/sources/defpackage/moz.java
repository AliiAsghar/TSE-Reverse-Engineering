package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class moz {
    public final mlu b;
    public final armf c;
    private final xnv e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final puw k;
    private final ojs l;
    private final ojq m;
    private final ojr n;
    private final pfp o;
    private final pfm p;
    private static final alvi d = alvi.m("com/google/android/apps/messaging/shared/api/messaging/conversation/mmsgroupupgrade/GroupRcsUpgradeEligibilityChecker");
    public static final arqr a = lgk.n;

    public moz(mlu mluVar, xnv xnvVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, puw puwVar, ojs ojsVar, ojq ojqVar, ojr ojrVar, wam wamVar, pfp pfpVar, pfm pfmVar) {
        mluVar.getClass();
        xnvVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        ojsVar.getClass();
        ojqVar.getClass();
        wamVar.getClass();
        this.b = mluVar;
        this.e = xnvVar;
        this.f = armfVar;
        this.g = armfVar2;
        this.h = armfVar3;
        this.i = armfVar4;
        this.j = armfVar5;
        this.c = armfVar6;
        this.k = puwVar;
        this.l = ojsVar;
        this.m = ojqVar;
        this.n = ojrVar;
        this.o = pfpVar;
        this.p = pfmVar;
    }

    private final boolean g(ResolvedRecipient resolvedRecipient) {
        Boolean bool;
        msh f = resolvedRecipient.f();
        if (!f.q() || (bool = (Boolean) f.e().map(new moh(new lnn(this, 8), 5)).orElse(false)) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    private final boolean h(qry qryVar, int i) {
        int parseInt;
        Integer u;
        String a2 = qryVar.a("mms-group-upgrade");
        if (a2 != null && (u = arsd.u(a2)) != null) {
            parseInt = u.intValue();
        } else {
            parseInt = Integer.parseInt("0");
        }
        if (parseInt >= i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5, defpackage.puu r6, java.util.Map r7, defpackage.arpe r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.mot
            if (r0 == 0) goto L13
            r0 = r8
            mot r0 = (defpackage.mot) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mot r0 = new mot
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            j$.time.Instant r5 = r0.d
            defpackage.aqil.P(r8)
            goto L81
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r8)
            msh r5 = r5.f()
            j$.util.Optional r5 = r5.e()
            r5.getClass()
            java.lang.Object r5 = defpackage.arsd.k(r5)
            if (r5 == 0) goto L99
            pfp r8 = r4.o
            qei r5 = (defpackage.qei) r5
            boolean r8 = r8.a()
            if (r8 == 0) goto L68
            pto r6 = defpackage.pto.d()
            java.lang.Object r5 = j$.util.Map.EL.getOrDefault(r7, r5, r6)
            pto r5 = (defpackage.pto) r5
            ptz r5 = r5.a()
            mos r6 = new mos
            qry r5 = defpackage.qrz.a(r5)
            r7 = 0
            r6.<init>(r5, r7)
            return r6
        L68:
            xnv r7 = r4.e
            j$.time.Instant r7 = r7.f()
            akul r5 = r6.b(r5)
            r5.getClass()
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = defpackage.arro.F(r5, r0)
            if (r8 != r1) goto L80
            return r1
        L80:
            r5 = r7
        L81:
            pto r8 = (defpackage.pto) r8
            j$.time.Instant r6 = r8.b()
            boolean r5 = r5.isBefore(r6)
            mos r6 = new mos
            ptz r7 = r8.a()
            qry r7 = defpackage.qrz.a(r7)
            r6.<init>(r7, r5)
            return r6
        L99:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Required value was null."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moz.a(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, puu, java.util.Map, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00bd -> B:11:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r17, java.util.List r18, defpackage.arpe r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            boolean r2 = r1 instanceof defpackage.mou
            if (r2 == 0) goto L17
            r2 = r1
            mou r2 = (defpackage.mou) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d = r3
            goto L1c
        L17:
            mou r2 = new mou
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.b
            arpl r3 = defpackage.arpl.a
            int r4 = r2.d
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L46
            if (r4 == r7) goto L3c
            if (r4 != r6) goto L34
            java.lang.Object r4 = r2.a
            java.util.Iterator r4 = (java.util.Iterator) r4
            defpackage.aqil.P(r1)
            goto Lbf
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r4 = r2.e
            java.lang.Object r8 = r2.a
            moz r8 = (defpackage.moz) r8
            defpackage.aqil.P(r1)
            goto L6f
        L46:
            defpackage.aqil.P(r1)
            mlu r1 = r0.b
            mqy r4 = new mqy
            alog r9 = defpackage.alzz.aZ(r18)
            r14 = 0
            r15 = 38
            r10 = 0
            r11 = 0
            r12 = 4
            r13 = 1
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            akul r1 = r1.h(r4)
            r2.a = r0
            r4 = r17
            r2.e = r4
            r2.d = r7
            java.lang.Object r1 = defpackage.arro.F(r1, r2)
            if (r1 == r3) goto Lcf
            r8 = r0
        L6f:
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            artx r1 = defpackage.aqjn.aF(r1)
            lgk r9 = defpackage.lgk.o
            artt r10 = new artt
            r10.<init>(r1, r7, r9)
            lnn r1 = new lnn
            r9 = 6
            r1.<init>(r4, r9)
            artt r4 = new artt
            r4.<init>(r10, r5, r1)
            lnn r1 = new lnn
            r9 = 7
            r1.<init>(r8, r9)
            artx r1 = defpackage.arrn.i(r4, r1)
            aruk r4 = new aruk
            artw r1 = (defpackage.artw) r1
            r4.<init>(r1)
        L9b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lca
            java.lang.Object r1 = r4.next()
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r1 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation) r1
            ncq r1 = r1.l()
            akul r1 = r1.b()
            r1.getClass()
            r2.a = r4
            r8 = 0
            r2.e = r8
            r2.d = r6
            java.lang.Object r1 = defpackage.arro.F(r1, r2)
            if (r1 == r3) goto Lc9
        Lbf:
            mll r1 = (defpackage.mll) r1
            boolean r1 = r1.F()
            if (r1 == 0) goto L9b
            r5 = r7
            goto Lca
        Lc9:
            return r3
        Lca:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            return r1
        Lcf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moz.b(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.mov
            if (r0 == 0) goto L13
            r0 = r6
            mov r0 = (defpackage.mov) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mov r0 = new mov
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            moz r5 = r0.d
            defpackage.aqil.P(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r6)
            mtn r5 = r5.k()
            akul r5 = r5.u(r3)
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = defpackage.arro.F(r5, r0)
            if (r6 == r1) goto L84
            r5 = r4
        L47:
            alog r6 = (defpackage.alog) r6
            r6.getClass()
            java.lang.Object r6 = defpackage.aqjn.Z(r6)
            miz r6 = (defpackage.miz) r6
            if (r6 != 0) goto L5a
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L5a:
            j$.time.Instant r6 = r6.h()
            xnv r0 = r5.e
            j$.time.Instant r0 = r0.f()
            armf r5 = r5.f
            java.lang.Object r5 = r5.b()
            r5.getClass()
            java.lang.Number r5 = (java.lang.Number) r5
            long r1 = r5.longValue()
            j$.time.Duration r5 = j$.time.Duration.ofDays(r1)
            j$.time.Instant r5 = r0.minus(r5)
            boolean r5 = r6.isAfter(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moz.c(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation, arpe):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0028. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x03b6 -> B:29:0x03d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0407 -> B:15:0x0409). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r18, defpackage.arpe r19) {
        /*
            Method dump skipped, instructions count: 1346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moz.d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.nfw r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.mox
            if (r0 == 0) goto L13
            r0 = r7
            mox r0 = (defpackage.mox) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mox r0 = new mox
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.aqil.P(r7)
            goto L47
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.aqil.P(r7)
            ncq r6 = r6.d()
            if (r6 == 0) goto L51
            akul r6 = r6.b()
            if (r6 == 0) goto L51
            r0.c = r3
            java.lang.Object r7 = defpackage.arro.F(r6, r0)
            if (r7 == r1) goto L50
        L47:
            ngh r7 = (defpackage.ngh) r7
            if (r7 == 0) goto L51
            boolean r4 = r7.a()
            goto L51
        L50:
            return r1
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moz.e(nfw, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.nfw r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.moy
            if (r0 == 0) goto L13
            r0 = r6
            moy r0 = (defpackage.moy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            moy r0 = new moy
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.aqil.P(r6)
            mjq r6 = defpackage.mjq.RICH
            akul r5 = r5.h(r6)
            r0.c = r3
            java.lang.Object r6 = defpackage.arro.F(r5, r0)
            if (r6 == r1) goto L4f
        L40:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L49
            boolean r5 = r6.booleanValue()
            goto L4a
        L49:
            r5 = 0
        L4a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moz.f(nfw, arpe):java.lang.Object");
    }
}
