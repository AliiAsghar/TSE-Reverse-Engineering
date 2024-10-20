package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qvu implements rvm {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/core/myidentity/MyIdentityForeignKeyUpgrader");
    private final oer b;
    private final arwe c;
    private final arwe d;
    private final tqb e;
    private final usk f;

    public qvu(oer oerVar, usk uskVar, arwe arweVar, arwe arweVar2) {
        uskVar.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        this.b = oerVar;
        this.f = uskVar;
        this.c = arweVar;
        this.d = arweVar2;
        this.e = tqb.MY_IDENTITY_FOREIGN_KEY;
    }

    @Override // defpackage.rvm
    public final tqb a() {
        return this.e;
    }

    @Override // defpackage.rvm
    public final akul b() {
        akul c;
        c = qjh.c(this.c, arpj.a, arwf.a, new qrr(this, (arpe) null, 9));
        return c;
    }

    @Override // defpackage.rvm
    public final akul c(long j) {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new qvt(this, j, (arpe) null, 0));
        return c;
    }

    @Override // defpackage.rvm
    public final akul d(Optional optional) {
        akul c;
        optional.getClass();
        c = qjh.c(this.d, arpj.a, arwf.a, new qsk(this, optional, (arpe) null, 6));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.concurrent.Executor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.qvs
            if (r0 == 0) goto L13
            r0 = r7
            qvs r0 = (defpackage.qvs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qvs r0 = new qvs
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r7)
            goto L62
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.aqil.P(r7)
            oer r7 = r6.b
            nmv r7 = (defpackage.nmv) r7
            armf r7 = r7.a
            java.lang.Object r7 = r7.b()
            ansy r7 = (defpackage.ansy) r7
            java.lang.String r2 = "bugle.enable_my_identity_token_foreign_key_upgrade"
            boolean r7 = r7.e(r2)
            if (r7 == 0) goto L71
            usk r7 = r6.f
            tqb r2 = defpackage.tqb.PARTICIPANTS_TABLE_MY_IDENTITY
            qpk r4 = new qpk
            r5 = 8
            r4.<init>(r7, r2, r5)
            java.lang.Object r7 = r7.a
            akul r7 = defpackage.aktp.ai(r4, r7)
            r7.getClass()
            r0.c = r3
            java.lang.Object r7 = defpackage.arro.F(r7, r0)
            if (r7 == r1) goto L70
        L62:
            r7.getClass()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L71
            rvj r7 = defpackage.rvj.EXECUTE_UPGRADE
            goto L73
        L70:
            return r1
        L71:
            rvj r7 = defpackage.rvj.DISABLED
        L73:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvu.e(arpe):java.lang.Object");
    }

    @Override // defpackage.rvm
    public final void f() {
    }
}
