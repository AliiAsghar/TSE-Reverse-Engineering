package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxv implements akoa {
    public static final alwo a = alwo.o("BugleBackup");
    public final armf b;
    public final xnv c;
    private final arwe d;
    private final armf e;
    private final armf f;

    public lxv(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, xnv xnvVar) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        xnvVar.getClass();
        this.d = arweVar;
        this.b = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.c = xnvVar;
    }

    @Override // defpackage.akoa
    public final ListenableFuture a() {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new jks(this, (arpe) null, 11));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[LOOP:0: B:11:0x0061->B:13:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(j$.time.Duration r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.lxt
            if (r0 == 0) goto L13
            r0 = r10
            lxt r0 = (defpackage.lxt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lxt r0 = new lxt
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            j$.time.Duration r9 = r0.e
            lxv r0 = r0.d
            defpackage.aqil.P(r10)
            goto L58
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.aqil.P(r10)
            alwo r10 = defpackage.lxv.a
            alvw r10 = r10.g()
            alwl r10 = (defpackage.alwl) r10
            java.lang.String r2 = "MessagesRestoreDailySynclet deleting restore database and attachments for inactive executions"
            r10.q(r2)
            armf r10 = r8.e
            java.lang.Object r10 = r10.b()
            jat r10 = (defpackage.jat) r10
            r0.d = r8
            r0.e = r9
            r0.c = r3
            java.lang.Object r10 = r10.o(r0)
            if (r10 == r1) goto L94
            r0 = r8
        L58:
            alog r10 = (defpackage.alog) r10
            alur r10 = r10.iterator()
            r10.getClass()
        L61:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r10.next()
            luq r1 = (defpackage.luq) r1
            armf r2 = r0.f
            java.lang.Object r2 = r2.b()
            lvx r2 = (defpackage.lvx) r2
            java.util.UUID r4 = r1.a
            amxr r3 = defpackage.amxr.CLEAN_UP
            amxp r1 = defpackage.amxp.a
            aozy r1 = r1.createBuilder()
            r1.getClass()
            r5 = 3
            defpackage.akec.ae(r5, r1)
            amxp r6 = defpackage.akec.ad(r1)
            r7 = 120(0x78, float:1.68E-43)
            r5 = r9
            defpackage.lvx.c(r2, r3, r4, r5, r6, r7)
            goto L61
        L91:
            arnb r9 = defpackage.arnb.a
            return r9
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxv.b(j$.time.Duration, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[LOOP:0: B:11:0x0076->B:13:0x007c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(j$.time.Duration r11, defpackage.arpe r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.lxu
            if (r0 == 0) goto L13
            r0 = r12
            lxu r0 = (defpackage.lxu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lxu r0 = new lxu
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            j$.time.Duration r11 = r0.e
            lxv r0 = r0.d
            defpackage.aqil.P(r12)
            goto L6d
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            defpackage.aqil.P(r12)
            alwo r12 = defpackage.lxv.a
            alvw r12 = r12.g()
            alwl r12 = (defpackage.alwl) r12
            java.lang.String r2 = "MessagesRestoreDailySynclet marking restore executions past the restore expiry as closed"
            r12.q(r2)
            armf r12 = r10.b
            java.lang.Object r12 = r12.b()
            luz r12 = (defpackage.luz) r12
            r2 = 3
            lwr[] r2 = new defpackage.lwr[r2]
            r5 = 0
            lwr r6 = defpackage.lwr.WAITING_ON_APP_UPDATE
            r2[r5] = r6
            lwr r5 = defpackage.lwr.WAITING_ON_APP_UPDATE_INITIAL_PROMPT_SHOWN
            r2[r4] = r5
            lwr r5 = defpackage.lwr.WAITING_FOR_APP_UPDATE_READY_FOR_REPROMPT
            r2[r3] = r5
            java.util.Set r2 = defpackage.aqil.r(r2)
            r0.d = r10
            r0.e = r11
            r0.c = r4
            java.lang.Object r12 = r12.b(r2, r0)
            if (r12 == r1) goto La9
            r0 = r10
        L6d:
            alog r12 = (defpackage.alog) r12
            alur r12 = r12.iterator()
            r12.getClass()
        L76:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r12.next()
            luq r1 = (defpackage.luq) r1
            armf r2 = r0.f
            java.lang.Object r2 = r2.b()
            r4 = r2
            lvx r4 = (defpackage.lvx) r4
            java.util.UUID r6 = r1.a
            amxr r5 = defpackage.amxr.CLEAN_UP
            amxp r1 = defpackage.amxp.a
            aozy r1 = r1.createBuilder()
            r1.getClass()
            defpackage.akec.ae(r3, r1)
            amxp r8 = defpackage.akec.ad(r1)
            r9 = 120(0x78, float:1.68E-43)
            r7 = r11
            defpackage.lvx.c(r4, r5, r6, r7, r8, r9)
            goto L76
        La6:
            arnb r11 = defpackage.arnb.a
            return r11
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxv.c(j$.time.Duration, arpe):java.lang.Object");
    }
}
