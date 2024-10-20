package defpackage;

import android.provider.ContactsContract;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qns implements qnq {
    public static final alwo a = alwo.o("BugleContacts");
    public final armf b;
    public final aogy c;
    private final arwe d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;

    public qns(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, aogy aogyVar, armf armfVar6, armf armfVar7) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        aogyVar.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        this.d = arweVar;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.c = aogyVar;
        this.b = armfVar6;
        this.i = armfVar7;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.qnq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.qnr
            if (r0 == 0) goto L13
            r0 = r9
            qnr r0 = (defpackage.qnr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qnr r0 = new qnr
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r0 = r0.a
            java.io.Closeable r0 = (java.io.Closeable) r0
            defpackage.aqil.P(r9)     // Catch: java.lang.Throwable -> L2f
            goto L80
        L2f:
            r9 = move-exception
            goto L8a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            akrh r2 = r0.e
            java.lang.Object r5 = r0.a
            qns r5 = (defpackage.qns) r5
            defpackage.aqil.P(r9)     // Catch: java.lang.Throwable -> L44
            r9 = r2
            goto L68
        L44:
            r9 = move-exception
            r0 = r2
            goto L8a
        L47:
            defpackage.aqil.P(r9)
            java.lang.String r9 = "ContactsSync#forceSync"
            akrh r9 = defpackage.aktp.e(r9)
            armf r2 = r8.g     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L86
            qng r2 = (defpackage.qng) r2     // Catch: java.lang.Throwable -> L86
            qnf r6 = defpackage.qnf.d     // Catch: java.lang.Throwable -> L86
            r0.a = r8     // Catch: java.lang.Throwable -> L86
            r0.e = r9     // Catch: java.lang.Throwable -> L86
            r0.d = r5     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r2.a(r6, r0)     // Catch: java.lang.Throwable -> L86
            if (r2 != r1) goto L67
            goto L7e
        L67:
            r5 = r8
        L68:
            armf r2 = r5.h     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L86
            qnx r2 = (defpackage.qnx) r2     // Catch: java.lang.Throwable -> L86
            qnw r5 = defpackage.qnw.d     // Catch: java.lang.Throwable -> L86
            r0.a = r9     // Catch: java.lang.Throwable -> L86
            r0.e = r3     // Catch: java.lang.Throwable -> L86
            r0.d = r4     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r2.a(r5, r0)     // Catch: java.lang.Throwable -> L86
            if (r0 != r1) goto L7f
        L7e:
            return r1
        L7f:
            r0 = r9
        L80:
            defpackage.armd.i(r0, r3)
            arnb r9 = defpackage.arnb.a
            return r9
        L86:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L8a:
            throw r9     // Catch: java.lang.Throwable -> L8b
        L8b:
            r1 = move-exception
            defpackage.armd.i(r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qns.a(arpe):java.lang.Object");
    }

    @Override // defpackage.qnq
    public final void b() {
        if (!((qlc) this.i.b()).a()) {
            return;
        }
        ((alwl) a.g()).q("Registering contacts observers");
        qne qneVar = (qne) this.e.b();
        ((atsg) qneVar.b.b()).j(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, false, qneVar);
        qnv qnvVar = (qnv) this.f.b();
        ((atsg) qnvVar.b.b()).j(ContactsContract.DeletedContacts.CONTENT_URI, false, qnvVar);
        qjh.l(this.d, null, new mwv(this, (arpe) null, 18), 3);
    }

    @Override // defpackage.qnq
    public final void c() {
        ((alwl) a.g()).q("Unregistering contacts observers");
        ((qne) this.e.b()).b();
        ((qnv) this.f.b()).b();
        qjh.l(this.d, null, new mwv(this, (arpe) null, 19, (byte[]) null), 3);
    }
}
