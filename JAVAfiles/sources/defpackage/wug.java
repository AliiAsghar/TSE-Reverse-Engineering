package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wug implements vps {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/service/RbmBotIdResolverViaBotInfoServiceImpl");
    public final armf b;
    public final armf c;
    public final psi d;
    private final arwe e;
    private final xtj f;

    public wug(armf armfVar, armf armfVar2, xtj xtjVar, psi psiVar, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        xtjVar.getClass();
        psiVar.getClass();
        arweVar.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.f = xtjVar;
        this.d = psiVar;
        this.e = arweVar;
    }

    @Override // defpackage.vps
    public final akul a(msh mshVar) {
        akul c;
        mshVar.getClass();
        String i = mshVar.i();
        String bi = yyb.bi(mshVar);
        if (i == null) {
            alvw i2 = a.i();
            i2.X(alwp.a, "Bugle");
            ((alvg) i2.h("com/google/android/apps/messaging/shared/service/RbmBotIdResolverViaBotInfoServiceImpl", "getBotChatEndpoint", 50, "RbmBotIdResolverViaBotInfoServiceImpl.kt")).t("No short code in local destination: %s", bi);
            this.d.j(null, 5);
            akul ag = aktp.ag(Optional.empty());
            ag.getClass();
            return ag;
        }
        amuk d = this.f.d();
        if (d.equals(amuk.TRANSPORT_UNKNOWN)) {
            alvw i3 = a.i();
            i3.X(alwp.a, "Bugle");
            ((alvg) i3.h("com/google/android/apps/messaging/shared/service/RbmBotIdResolverViaBotInfoServiceImpl", "getBotChatEndpoint", 58, "RbmBotIdResolverViaBotInfoServiceImpl.kt")).t("There is no enabled transport, %s", bi);
            this.d.j(i, 5);
            akul ag2 = aktp.ag(Optional.empty());
            ag2.getClass();
            return ag2;
        }
        alvw g = a.g();
        g.X(alwp.a, "Bugle");
        ((alvg) g.h("com/google/android/apps/messaging/shared/service/RbmBotIdResolverViaBotInfoServiceImpl", "getBotChatEndpoint", 63, "RbmBotIdResolverViaBotInfoServiceImpl.kt")).D("Enabled transport %s: %s", d, bi);
        this.d.b(i);
        c = qjh.c(this.e, arpj.a, arwf.a, new vpi(this, i, (arpe) null, 18));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.prk r8, java.lang.String r9, defpackage.arpe r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.wuf
            if (r0 == 0) goto L13
            r0 = r10
            wuf r0 = (defpackage.wuf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wuf r0 = new wuf
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r10)
            goto L7b
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.aqil.P(r10)
            alvi r10 = defpackage.prk.b
            alvw r10 = r10.g()
            alvz r2 = defpackage.alwp.a
            java.lang.String r4 = "Bugle"
            r10.X(r2, r4)
            alvg r10 = (defpackage.alvg) r10
            java.lang.String r2 = "downloadBusinessInfoByShortCodeIfMissingOrExpired"
            r4 = 215(0xd7, float:3.01E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper"
            java.lang.String r6 = "RbmBusinessInfoDownloadHelper.java"
            alvw r10 = r10.h(r5, r2, r4, r6)
            alvg r10 = (defpackage.alvg) r10
            java.lang.String r2 = defpackage.yyb.bh(r9)
            java.lang.String r4 = "Checking missing/expired bot, short code: %s..."
            r10.t(r4, r2)
            mig r10 = new mig
            r2 = 10
            r10.<init>(r9, r2)
            anen r2 = r8.h
            akul r10 = defpackage.aktp.ai(r10, r2)
            ikd r2 = new ikd
            r4 = 19
            r2.<init>(r8, r9, r4)
            anen r8 = r8.g
            akul r8 = r10.i(r2, r8)
            r0.c = r3
            java.lang.Object r10 = defpackage.arro.F(r8, r0)
            if (r10 != r1) goto L7b
            return r1
        L7b:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wug.b(prk, java.lang.String, arpe):java.lang.Object");
    }
}
