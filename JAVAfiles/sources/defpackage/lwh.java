package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwh implements lva {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/restore/impl/RestoreAnytimeCompatibleRestoreWorkflowSteps");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final arpi g;
    public final armf h;
    public final armf i;
    public final arwe j;
    public final armf k;
    public final lus l;

    public lwh(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, arpi arpiVar, armf armfVar6, armf armfVar7, arwe arweVar, armf armfVar8, lus lusVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        arpiVar.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        arweVar.getClass();
        armfVar8.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = arpiVar;
        this.h = armfVar6;
        this.i = armfVar7;
        this.j = arweVar;
        this.k = armfVar8;
        this.l = lusVar;
    }

    @Override // defpackage.lva
    public final int a() {
        return 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3 A[Catch: all -> 0x0137, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0137, blocks: (B:42:0x00e3, B:46:0x011f), top: B:40:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f A[Catch: all -> 0x0137, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0137, blocks: (B:42:0x00e3, B:46:0x011f), top: B:40:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.io.Closeable] */
    @Override // defpackage.lva
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.UUID r18, defpackage.lwr r19, defpackage.arpe r20) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwh.b(java.util.UUID, lwr, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.lva
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.UUID r13, defpackage.arpe r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.lvz
            if (r0 == 0) goto L13
            r0 = r14
            lvz r0 = (defpackage.lvz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lvz r0 = new lvz
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            akrh r13 = r0.d
            defpackage.aqil.P(r14)     // Catch: java.lang.Throwable -> L29
            goto L60
        L29:
            r14 = move-exception
            goto L70
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            defpackage.aqil.P(r14)
            java.lang.String r14 = "RestoreAnytimeCompatibleRestoreWorkflowSteps#doAttachmentRestore"
            akrh r14 = defpackage.aktp.e(r14)
            arrz r7 = new arrz     // Catch: java.lang.Throwable -> L6c
            r7.<init>()     // Catch: java.lang.Throwable -> L6c
            amxr r2 = defpackage.amxr.DO_ATTACHMENTS_RESTORE     // Catch: java.lang.Throwable -> L6c
            r12.i(r2, r13)     // Catch: java.lang.Throwable -> L6c
            arpi r2 = r12.g     // Catch: java.lang.Throwable -> L6c
            jyw r10 = new jyw     // Catch: java.lang.Throwable -> L6c
            r8 = 0
            r9 = 9
            r4 = r10
            r5 = r12
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6c
            r0.d = r14     // Catch: java.lang.Throwable -> L6c
            r0.c = r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r13 = defpackage.arro.q(r2, r10, r0)     // Catch: java.lang.Throwable -> L6c
            if (r13 == r1) goto L6b
            r11 = r14
            r14 = r13
            r13 = r11
        L60:
            arut r14 = (defpackage.arut) r14     // Catch: java.lang.Throwable -> L29
            long r0 = r14.c     // Catch: java.lang.Throwable -> L29
            r14 = 0
            defpackage.armd.i(r13, r14)
            arnb r13 = defpackage.arnb.a
            return r13
        L6b:
            return r1
        L6c:
            r13 = move-exception
            r11 = r14
            r14 = r13
            r13 = r11
        L70:
            throw r14     // Catch: java.lang.Throwable -> L71
        L71:
            r0 = move-exception
            defpackage.armd.i(r13, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwh.c(java.util.UUID, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.lva
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.UUID r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.lwa
            if (r0 == 0) goto L13
            r0 = r10
            lwa r0 = (defpackage.lwa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lwa r0 = new lwa
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
            goto L58
        L2a:
            r10 = move-exception
            goto L67
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.aqil.P(r10)
            java.lang.String r10 = "RestoreAnytimeCompatibleRestoreWorkflowSteps#doBugleDbRestore"
            akrh r10 = defpackage.aktp.e(r10)
            amxr r2 = defpackage.amxr.DO_BUGLE_DATABASE_RESTORE     // Catch: java.lang.Throwable -> L63
            r8.i(r2, r9)     // Catch: java.lang.Throwable -> L63
            arpi r2 = r8.g     // Catch: java.lang.Throwable -> L63
            kda r5 = new kda     // Catch: java.lang.Throwable -> L63
            r6 = 20
            r5.<init>(r8, r9, r3, r6)     // Catch: java.lang.Throwable -> L63
            r0.d = r10     // Catch: java.lang.Throwable -> L63
            r0.c = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r9 = defpackage.arro.q(r2, r5, r0)     // Catch: java.lang.Throwable -> L63
            if (r9 == r1) goto L62
            r7 = r10
            r10 = r9
            r9 = r7
        L58:
            arut r10 = (defpackage.arut) r10     // Catch: java.lang.Throwable -> L2a
            long r0 = r10.c     // Catch: java.lang.Throwable -> L2a
            defpackage.armd.i(r9, r3)
            arnb r9 = defpackage.arnb.a
            return r9
        L62:
            return r1
        L63:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L67:
            throw r10     // Catch: java.lang.Throwable -> L68
        L68:
            r0 = move-exception
            defpackage.armd.i(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwh.d(java.util.UUID, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.lva
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.util.UUID r12, defpackage.lwr r13, defpackage.arpe r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.lwc
            if (r0 == 0) goto L13
            r0 = r14
            lwc r0 = (defpackage.lwc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lwc r0 = new lwc
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.UUID r12 = r0.e
            lwh r13 = r0.d
            defpackage.aqil.P(r14)
            goto L53
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            defpackage.aqil.P(r14)
            rjt r14 = defpackage.rjt.a
            lvq r2 = new lvq
            r8 = 0
            r9 = 2
            r4 = r2
            r5 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.d = r11
            r0.e = r12
            r0.c = r3
            java.lang.String r13 = "RestoreAnytimeCompatibleRestoreWorkflowSteps#doCompleteRestore"
            java.lang.Object r14 = r14.a(r13, r2, r0)
            if (r14 != r1) goto L52
            return r1
        L52:
            r13 = r11
        L53:
            r4 = r12
            arut r14 = (defpackage.arut) r14
            long r0 = r14.c
            armf r12 = r13.i
            java.lang.Object r12 = r12.b()
            r12.getClass()
            r2 = r12
            lvx r2 = (defpackage.lvx) r2
            amxr r3 = defpackage.amxr.DO_COMPLETE_RESTORE
            long r12 = defpackage.arut.h(r0)
            int r14 = defpackage.arut.d(r0)
            long r0 = (long) r14
            j$.time.Duration r9 = j$.time.Duration.ofSeconds(r12, r0)
            r9.getClass()
            r10 = 188(0xbc, float:2.63E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            defpackage.lvx.b(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            arnb r12 = defpackage.arnb.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwh.e(java.util.UUID, lwr, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.lva
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.util.UUID r12, defpackage.lwz r13, defpackage.arpe r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.lwd
            if (r0 == 0) goto L13
            r0 = r14
            lwd r0 = (defpackage.lwd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lwd r0 = new lwd
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            lwz r13 = r0.f
            java.util.UUID r12 = r0.e
            lwh r0 = r0.d
            defpackage.aqil.P(r14)
            goto L57
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            defpackage.aqil.P(r14)
            rjt r14 = defpackage.rjt.a
            lvq r2 = new lvq
            r8 = 0
            r9 = 3
            r4 = r2
            r5 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.d = r11
            r0.e = r12
            r0.f = r13
            r0.c = r3
            java.lang.String r3 = "RestoreAnytimeCompatibleRestoreWorkflowSteps#initializeRestore"
            java.lang.Object r14 = r14.a(r3, r2, r0)
            if (r14 != r1) goto L56
            return r1
        L56:
            r0 = r11
        L57:
            r4 = r12
            r8 = r13
            arut r14 = (defpackage.arut) r14
            long r12 = r14.c
            armf r14 = r0.i
            java.lang.Object r14 = r14.b()
            r2 = r14
            lvx r2 = (defpackage.lvx) r2
            amxr r3 = defpackage.amxr.INITIALIZE_RESTORE_WORKFLOW
            long r0 = defpackage.arut.h(r12)
            int r12 = defpackage.arut.d(r12)
            long r12 = (long) r12
            j$.time.Duration r9 = j$.time.Duration.ofSeconds(r0, r12)
            r9.getClass()
            r2.getClass()
            r10 = 156(0x9c, float:2.19E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            defpackage.lvx.b(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            arnb r12 = defpackage.arnb.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwh.f(java.util.UUID, lwz, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.lva
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.util.UUID r17, java.io.File r18, defpackage.icg r19, defpackage.arpe r20) {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof defpackage.lwe
            if (r2 == 0) goto L19
            r2 = r1
            lwe r2 = (defpackage.lwe) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.c = r3
            goto L1e
        L19:
            lwe r2 = new lwe
            r2.<init>(r8, r1)
        L1e:
            r9 = r2
            java.lang.Object r1 = r9.a
            arpl r10 = defpackage.arpl.a
            int r2 = r9.c
            r11 = 1
            if (r2 == 0) goto L45
            if (r2 != r11) goto L3d
            j$.time.Duration r0 = r9.f
            akrh r2 = r9.g
            java.util.UUID r3 = r9.e
            lwh r4 = r9.d
            defpackage.aqil.P(r1)     // Catch: java.lang.Throwable -> L3a
            r5 = r0
            r12 = r2
            r0 = r4
            r4 = r3
            goto L7a
        L3a:
            r0 = move-exception
            r1 = r0
            goto L99
        L3d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L45:
            defpackage.aqil.P(r1)
            java.lang.String r1 = "RestoreAnytimeCompatibleRestoreWorkflowSteps#requestAttachmentRestore"
            akrh r12 = defpackage.aktp.e(r1)
            amxr r1 = defpackage.amxr.REQUEST_ATTACHMENTS_RESTORE     // Catch: java.lang.Throwable -> L96
            j$.time.Duration r13 = r8.i(r1, r0)     // Catch: java.lang.Throwable -> L96
            arpi r14 = r8.g     // Catch: java.lang.Throwable -> L96
            hak r15 = new hak     // Catch: java.lang.Throwable -> L96
            r6 = 0
            r7 = 13
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L96
            r9.d = r8     // Catch: java.lang.Throwable -> L96
            r9.e = r0     // Catch: java.lang.Throwable -> L96
            r9.g = r12     // Catch: java.lang.Throwable -> L96
            r9.f = r13     // Catch: java.lang.Throwable -> L96
            r9.c = r11     // Catch: java.lang.Throwable -> L96
            java.lang.Object r1 = defpackage.arro.q(r14, r15, r9)     // Catch: java.lang.Throwable -> L96
            if (r1 == r10) goto L95
            r4 = r0
            r0 = r8
            r5 = r13
        L7a:
            armf r0 = r0.i     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L96
            r0.getClass()     // Catch: java.lang.Throwable -> L96
            r2 = r0
            lvx r2 = (defpackage.lvx) r2     // Catch: java.lang.Throwable -> L96
            amxr r3 = defpackage.amxr.REQUEST_ATTACHMENTS_RESTORE     // Catch: java.lang.Throwable -> L96
            r6 = 0
            r7 = 248(0xf8, float:3.48E-43)
            defpackage.lvx.c(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L96
            r0 = 0
            defpackage.armd.i(r12, r0)
            arnb r0 = defpackage.arnb.a
            return r0
        L95:
            return r10
        L96:
            r0 = move-exception
            r1 = r0
            r2 = r12
        L99:
            throw r1     // Catch: java.lang.Throwable -> L9a
        L9a:
            r0 = move-exception
            r3 = r0
            defpackage.armd.i(r2, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwh.g(java.util.UUID, java.io.File, icg, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.lva
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.util.UUID r17, java.io.File r18, defpackage.icl r19, defpackage.arpe r20) {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof defpackage.lwf
            if (r2 == 0) goto L19
            r2 = r1
            lwf r2 = (defpackage.lwf) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.c = r3
            goto L1e
        L19:
            lwf r2 = new lwf
            r2.<init>(r8, r1)
        L1e:
            r9 = r2
            java.lang.Object r1 = r9.a
            arpl r10 = defpackage.arpl.a
            int r2 = r9.c
            r11 = 1
            if (r2 == 0) goto L45
            if (r2 != r11) goto L3d
            j$.time.Duration r0 = r9.f
            akrh r2 = r9.g
            java.util.UUID r3 = r9.e
            lwh r4 = r9.d
            defpackage.aqil.P(r1)     // Catch: java.lang.Throwable -> L3a
            r5 = r0
            r12 = r2
            r0 = r4
            r4 = r3
            goto L79
        L3a:
            r0 = move-exception
            r1 = r0
            goto L98
        L3d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L45:
            defpackage.aqil.P(r1)
            java.lang.String r1 = "RestoreAnytimeCompatibleRestoreWorkflowSteps#requestBugleDbRestore"
            akrh r12 = defpackage.aktp.e(r1)
            amxr r1 = defpackage.amxr.REQUEST_BUGLE_DATABASE_RESTORE     // Catch: java.lang.Throwable -> L95
            j$.time.Duration r13 = r8.i(r1, r0)     // Catch: java.lang.Throwable -> L95
            arpi r14 = r8.g     // Catch: java.lang.Throwable -> L95
            icw r15 = new icw     // Catch: java.lang.Throwable -> L95
            r6 = 0
            r7 = 6
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L95
            r9.d = r8     // Catch: java.lang.Throwable -> L95
            r9.e = r0     // Catch: java.lang.Throwable -> L95
            r9.g = r12     // Catch: java.lang.Throwable -> L95
            r9.f = r13     // Catch: java.lang.Throwable -> L95
            r9.c = r11     // Catch: java.lang.Throwable -> L95
            java.lang.Object r1 = defpackage.arro.q(r14, r15, r9)     // Catch: java.lang.Throwable -> L95
            if (r1 == r10) goto L94
            r4 = r0
            r0 = r8
            r5 = r13
        L79:
            armf r0 = r0.i     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L95
            r0.getClass()     // Catch: java.lang.Throwable -> L95
            r2 = r0
            lvx r2 = (defpackage.lvx) r2     // Catch: java.lang.Throwable -> L95
            amxr r3 = defpackage.amxr.REQUEST_BUGLE_DATABASE_RESTORE     // Catch: java.lang.Throwable -> L95
            r6 = 0
            r7 = 248(0xf8, float:3.48E-43)
            defpackage.lvx.c(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L95
            r0 = 0
            defpackage.armd.i(r12, r0)
            arnb r0 = defpackage.arnb.a
            return r0
        L94:
            return r10
        L95:
            r0 = move-exception
            r1 = r0
            r2 = r12
        L98:
            throw r1     // Catch: java.lang.Throwable -> L99
        L99:
            r0 = move-exception
            r3 = r0
            defpackage.armd.i(r2, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwh.h(java.util.UUID, java.io.File, icl, arpe):java.lang.Object");
    }

    public final Duration i(amxr amxrVar, UUID uuid) {
        Object b = this.i.b();
        b.getClass();
        return lvx.d((lvx) b, amxrVar, uuid, 5, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.util.UUID r10, defpackage.arpe r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.lwg
            if (r0 == 0) goto L13
            r0 = r11
            lwg r0 = (defpackage.lwg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lwg r0 = new lwg
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            aloc r10 = r0.f
            java.lang.Object r2 = r0.a
            lwh r4 = r0.e
            defpackage.aqil.P(r11)
            goto L5c
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            lwh r10 = r0.e
            defpackage.aqil.P(r11)
            r4 = r10
            goto L55
        L3f:
            defpackage.aqil.P(r11)
            armf r11 = r9.b
            java.lang.Object r11 = r11.b()
            luz r11 = (defpackage.luz) r11
            r0.e = r9
            r0.d = r4
            java.lang.Object r11 = r11.f(r10, r0)
            if (r11 == r1) goto Lbe
            r4 = r9
        L55:
            r2 = r11
            alog r2 = (defpackage.alog) r2
            alur r10 = r2.iterator()
        L5c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lb2
            java.lang.Object r11 = r10.next()
            r11.getClass()
            tiq r11 = (defpackage.tiq) r11
            lwq r5 = r11.k()
            java.lang.String r5 = r5.e
            r5.getClass()
            lwq r6 = r11.k()
            int r7 = r6.c
            r8 = 3
            if (r7 != r8) goto L82
            java.lang.Object r6 = r6.d
            lwo r6 = (defpackage.lwo) r6
            goto L84
        L82:
            lwo r6 = defpackage.lwo.a
        L84:
            long r6 = r6.c
            int r6 = (int) r6
            armf r7 = r4.d
            java.lang.Object r7 = r7.b()
            jat r7 = (defpackage.jat) r7
            lus r8 = r4.l
            r7.q(r6, r5, r8)
            armf r5 = r4.b
            java.lang.Object r5 = r5.b()
            luz r5 = (defpackage.luz) r5
            long r6 = r11.h()
            r0.e = r4
            r0.a = r2
            r11 = r10
            aloc r11 = (defpackage.aloc) r11
            r0.f = r11
            r0.d = r3
            java.lang.Object r11 = r5.j(r6, r0)
            if (r11 != r1) goto L5c
            return r1
        Lb2:
            alog r2 = (defpackage.alog) r2
            int r10 = r2.size()
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            return r11
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwh.j(java.util.UUID, arpe):java.lang.Object");
    }

    public final void k(amxr amxrVar, UUID uuid) {
        Object b = this.i.b();
        b.getClass();
        lvx.e((lvx) b, amxrVar, 3, uuid);
    }
}
