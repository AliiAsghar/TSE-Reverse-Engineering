package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbu {
    private static final xze a = xze.g("BugleContacts", "RcsGroupChatCapabilityCacheImpl");
    private final arwe b;
    private final arwe c;
    private final uaq d;
    private final okf e;
    private final adjc f;
    private final armf g;
    private final Map h;
    private final asgm i;
    private final zap j;

    public zbu(arwe arweVar, arwe arweVar2, uaq uaqVar, zap zapVar, okf okfVar, adjc adjcVar, armf armfVar) {
        arweVar.getClass();
        arweVar2.getClass();
        uaqVar.getClass();
        zapVar.getClass();
        okfVar.getClass();
        adjcVar.getClass();
        armfVar.getClass();
        this.b = arweVar;
        this.c = arweVar2;
        this.d = uaqVar;
        this.j = zapVar;
        this.e = okfVar;
        this.f = adjcVar;
        this.g = armfVar;
        this.i = new asgm();
        new LinkedHashMap();
        this.h = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.google.android.apps.messaging.startchat.chip.ChipData r19, boolean r20, defpackage.nfw r21, defpackage.arpe r22) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r0 = r22
            boolean r1 = r0 instanceof defpackage.zbn
            if (r1 == 0) goto L19
            r1 = r0
            zbn r1 = (defpackage.zbn) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L19
            int r2 = r2 - r3
            r1.c = r2
            goto L1e
        L19:
            zbn r1 = new zbn
            r1.<init>(r8, r0)
        L1e:
            r0 = r1
            java.lang.Object r1 = r0.a
            arpl r10 = defpackage.arpl.a
            int r2 = r0.c
            r12 = 1
            if (r2 == 0) goto L3b
            if (r2 != r12) goto L33
            com.google.android.apps.messaging.startchat.chip.ChipData r2 = r0.d
            defpackage.aqil.P(r1)     // Catch: java.lang.Exception -> L30
            goto L84
        L30:
            r0 = move-exception
            goto La4
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            defpackage.aqil.P(r1)
            arwe r1 = r8.c
            yqs r2 = new yqs
            r3 = 16
            r13 = 0
            r2.<init>(r8, r9, r13, r3)
            r14 = 3
            arwl r15 = defpackage.arrn.I(r1, r13, r13, r2, r14)
            arwe r7 = r8.c
            kcw r6 = new kcw
            r16 = 0
            r17 = 4
            r1 = r6
            r2 = r20
            r3 = r18
            r4 = r19
            r5 = r21
            r12 = r6
            r6 = r16
            r11 = r7
            r7 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7)
            arwl r1 = defpackage.arrn.I(r11, r13, r13, r12, r14)
            r2 = 2
            arwl[] r2 = new defpackage.arwl[r2]     // Catch: java.lang.Exception -> La2
            r3 = 0
            r2[r3] = r15     // Catch: java.lang.Exception -> La2
            r3 = 1
            r2[r3] = r1     // Catch: java.lang.Exception -> La2
            java.util.List r1 = defpackage.aqjn.B(r2)     // Catch: java.lang.Exception -> La2
            r0.d = r9     // Catch: java.lang.Exception -> La2
            r0.c = r3     // Catch: java.lang.Exception -> La2
            java.lang.Object r1 = defpackage.arrj.j(r1, r0)     // Catch: java.lang.Exception -> La2
            if (r1 != r10) goto L83
            return r10
        L83:
            r2 = r9
        L84:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L30
            zbm r0 = new zbm     // Catch: java.lang.Exception -> L30
            r3 = 0
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Exception -> L30
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Exception -> L30
            boolean r3 = r4.booleanValue()     // Catch: java.lang.Exception -> L30
            r4 = 1
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Exception -> L30
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L30
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L30
            r0.<init>(r2, r3, r1)     // Catch: java.lang.Exception -> L30
            return r0
        La2:
            r0 = move-exception
            r2 = r9
        La4:
            boolean r1 = r0 instanceof defpackage.psx
            if (r1 != 0) goto Lae
            boolean r1 = r0 instanceof defpackage.ajob
            if (r1 == 0) goto Lad
            goto Lae
        Lad:
            throw r0
        Lae:
            xze r1 = defpackage.zbu.a
            xyo r1 = r1.e()
            java.lang.String r3 = "Failed to get Rcs capabilities"
            r1.H(r3)
            r1.r(r0)
            zbm r0 = new zbm
            r1 = 0
            r0.<init>(r2, r1, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbu.a(com.google.android.apps.messaging.startchat.chip.ChipData, boolean, nfw, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r9 == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.msh r7, defpackage.nfw r8, defpackage.arpe r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.zbo
            if (r0 == 0) goto L13
            r0 = r9
            zbo r0 = (defpackage.zbo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zbo r0 = new zbo
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.aqil.P(r9)
            goto L78
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            zbu r7 = r0.d
            defpackage.aqil.P(r9)
            goto L65
        L39:
            defpackage.aqil.P(r9)
            j$.util.Optional r9 = r7.e()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L59
            xze r7 = defpackage.zbu.a
            xyo r7 = r7.a()
            java.lang.String r8 = "Skip fetching e2ee info for the recipient due to missing rcs identifier."
            r7.H(r8)
            r7.q()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L59:
            r0.d = r6
            r0.c = r4
            java.lang.Object r9 = r6.c(r7, r8, r0)
            if (r9 != r1) goto L64
            goto Lc9
        L64:
            r7 = r6
        L65:
            uav r9 = (defpackage.uav) r9
            uaq r7 = r7.d
            akul r7 = r7.b(r9)
            r8 = 0
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = defpackage.arro.F(r7, r0)
            if (r9 == r1) goto Lc9
        L78:
            uaw r9 = (defpackage.uaw) r9
            if (r9 == 0) goto Lb6
            apax r7 = r9.b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L85
            goto Lb6
        L85:
            apax r7 = r9.b
            java.lang.Object r7 = r7.get(r5)
            uat r7 = (defpackage.uat) r7
            apaq r8 = new apaq
            apao r9 = r7.e
            apap r0 = defpackage.uat.a
            r8.<init>(r9, r0)
            uas r9 = defpackage.uas.ONE_ON_ONE_ENCRYPTION
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto Lb0
            apaq r8 = new apaq
            apao r7 = r7.e
            apap r9 = defpackage.uat.a
            r8.<init>(r7, r9)
            uas r7 = defpackage.uas.GROUP_ENCRYPTION
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto Lb0
            goto Lb1
        Lb0:
            r4 = r5
        Lb1:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        Lb6:
            xze r7 = defpackage.zbu.a
            xyo r7 = r7.a()
            java.lang.String r8 = "Empty e2eeInfo from chat end point"
            r7.H(r8)
            r7.q()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbu.b(msh, nfw, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.msh r11, defpackage.nfw r12, defpackage.arpe r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbu.c(msh, nfw, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.msh r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.zbq
            if (r0 == 0) goto L13
            r0 = r6
            zbq r0 = (defpackage.zbq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zbq r0 = new zbq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)
            goto L75
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.aqil.P(r6)
            okf r6 = r4.e
            boolean r6 = r6.a()
            if (r6 == 0) goto L64
            boolean r6 = r5.q()
            if (r6 == 0) goto L64
            j$.util.Optional r6 = r5.e()
            boolean r6 = r6.isPresent()
            if (r6 == 0) goto L64
            adjc r6 = r4.f
            j$.util.Optional r2 = r5.e()
            java.lang.Object r2 = r2.get()
            qei r2 = (defpackage.qei) r2
            java.lang.String r2 = r2.d
            boolean r6 = r6.v(r2)
            if (r6 != 0) goto L5f
            goto L64
        L5f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L64:
            zap r6 = r4.j
            zck r5 = r6.c(r5)
            akul r5 = r5.b
            r0.c = r3
            java.lang.Object r6 = defpackage.arro.F(r5, r0)
            if (r6 != r1) goto L75
            return r1
        L75:
            nfb r6 = (defpackage.nfb) r6
            boolean r5 = r6.e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbu.d(msh, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0076 -> B:16:0x0079). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.util.List r9, defpackage.nfw r10, defpackage.arpe r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.zbr
            if (r0 == 0) goto L13
            r0 = r11
            zbr r0 = (defpackage.zbr) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            zbr r0 = new zbr
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.e
            arpl r1 = defpackage.arpl.a
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.aqil.P(r11)
            goto L96
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.Object r9 = r0.d
            java.lang.Object r10 = r0.c
            java.lang.Object r2 = r0.b
            java.lang.Object r5 = r0.a
            zbu r6 = r0.h
            defpackage.aqil.P(r11)
            goto L79
        L41:
            defpackage.aqil.P(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.aqjn.J(r9, r2)
            r11.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
            r6 = r8
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L58:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r10.next()
            com.google.android.apps.messaging.startchat.chip.ChipData r2 = (com.google.android.apps.messaging.startchat.chip.ChipData) r2
            r0.h = r6
            r0.a = r11
            r0.b = r9
            r0.c = r10
            r0.d = r9
            r0.g = r4
            java.lang.Object r2 = r6.f(r2, r4, r11, r0)
            if (r2 == r1) goto L81
            r5 = r11
            r11 = r2
            r2 = r9
        L79:
            arwl r11 = (defpackage.arwl) r11
            r9.add(r11)
            r9 = r2
            r11 = r5
            goto L58
        L81:
            return r1
        L82:
            r10 = 0
            r0.h = r10
            r0.a = r10
            r0.b = r10
            r0.c = r10
            r0.d = r10
            r0.g = r3
            java.lang.Object r11 = defpackage.arrj.j(r9, r0)
            if (r11 != r1) goto L96
            return r1
        L96:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbu.e(java.util.List, nfw, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:11:0x0059, B:13:0x0063, B:14:0x0076), top: B:10:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(com.google.android.apps.messaging.startchat.chip.ChipData r10, boolean r11, defpackage.nfw r12, defpackage.arpe r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.zbs
            if (r0 == 0) goto L13
            r0 = r13
            zbs r0 = (defpackage.zbs) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            zbs r0 = new zbs
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            boolean r11 = r0.b
            asgm r10 = r0.h
            java.lang.Object r12 = r0.a
            com.google.android.apps.messaging.startchat.chip.ChipData r1 = r0.g
            zbu r0 = r0.f
            defpackage.aqil.P(r13)
            r5 = r11
            r6 = r12
            r3 = r0
            r4 = r1
            goto L59
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            defpackage.aqil.P(r13)
            asgm r13 = r9.i
            r0.f = r9
            r0.g = r10
            r0.a = r12
            r0.h = r13
            r0.b = r11
            r0.e = r3
            java.lang.Object r0 = r13.b(r0)
            if (r0 == r1) goto L81
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r10 = r13
        L59:
            java.util.Map r11 = r3.h     // Catch: java.lang.Throwable -> L7c
            msh r12 = r4.a     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r13 = r11.get(r12)     // Catch: java.lang.Throwable -> L7c
            if (r13 != 0) goto L76
            arwe r13 = r3.b     // Catch: java.lang.Throwable -> L7c
            kcw r0 = new kcw     // Catch: java.lang.Throwable -> L7c
            r7 = 0
            r8 = 5
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L7c
            r1 = 3
            r2 = 0
            arwl r13 = defpackage.arrn.I(r13, r2, r2, r0, r1)     // Catch: java.lang.Throwable -> L7c
            r11.put(r12, r13)     // Catch: java.lang.Throwable -> L7c
        L76:
            arwl r13 = (defpackage.arwl) r13     // Catch: java.lang.Throwable -> L7c
            r10.d()
            return r13
        L7c:
            r11 = move-exception
            r10.d()
            throw r11
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbu.f(com.google.android.apps.messaging.startchat.chip.ChipData, boolean, nfw, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0071 -> B:16:0x0072). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.util.List r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.zbt
            if (r0 == 0) goto L13
            r0 = r10
            zbt r0 = (defpackage.zbt) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            zbt r0 = new zbt
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            arpl r1 = defpackage.arpl.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r10)
            goto L8b
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            java.lang.Object r9 = r0.c
            java.lang.Object r2 = r0.b
            java.lang.Object r5 = r0.a
            zbu r6 = r0.g
            defpackage.aqil.P(r10)
            goto L72
        L3e:
            defpackage.aqil.P(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.aqjn.J(r9, r2)
            r10.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
            r6 = r8
            r2 = r9
            r9 = r10
        L53:
            boolean r10 = r2.hasNext()
            r5 = 0
            if (r10 == 0) goto L7a
            java.lang.Object r10 = r2.next()
            com.google.android.apps.messaging.startchat.chip.ChipData r10 = (com.google.android.apps.messaging.startchat.chip.ChipData) r10
            r0.g = r6
            r0.a = r9
            r0.b = r2
            r0.c = r9
            r0.f = r4
            r7 = 0
            java.lang.Object r10 = r6.f(r10, r7, r5, r0)
            if (r10 == r1) goto L79
            r5 = r9
        L72:
            arwl r10 = (defpackage.arwl) r10
            r9.add(r10)
            r9 = r5
            goto L53
        L79:
            return r1
        L7a:
            r0.g = r5
            r0.a = r5
            r0.b = r5
            r0.c = r5
            r0.f = r3
            java.lang.Object r10 = defpackage.arrj.j(r9, r0)
            if (r10 != r1) goto L8b
            return r1
        L8b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbu.g(java.util.List, arpe):java.lang.Object");
    }
}
