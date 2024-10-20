package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgz implements jho {
    public final ascg a;
    private final mjg b;
    private final arwe c;
    private final ascc d;

    public kgz(mjg mjgVar, arwe arweVar) {
        mjgVar.getClass();
        arweVar.getClass();
        this.b = mjgVar;
        this.c = arweVar;
        ascc e = asck.e(1, 0, 2, 2);
        this.d = e;
        this.a = e;
    }

    @Override // defpackage.jho
    public final void a(jhc jhcVar) {
        qjh.l(this.c, null, new kbl(this, (arpe) null, 5), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r6.fv(r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.api.messaging.MessageId r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.kgy
            if (r0 == 0) goto L13
            r0 = r7
            kgy r0 = (defpackage.kgy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kgy r0 = new kgy
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
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kgz r6 = r0.d
            defpackage.aqil.P(r7)
            goto L53
        L38:
            defpackage.aqil.P(r7)
            mjg r7 = r5.b
            mjd r7 = r7.b()
            akul r6 = r7.d(r6)
            r6.getClass()
            r0.d = r5
            r0.c = r4
            java.lang.Object r7 = defpackage.arro.F(r6, r0)
            if (r7 == r1) goto L69
            r6 = r5
        L53:
            java.lang.Integer r7 = (java.lang.Integer) r7
            ascc r6 = r6.d
            r7.getClass()
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r6.fv(r7, r0)
            if (r6 != r1) goto L66
            goto L69
        L66:
            arnb r6 = defpackage.arnb.a
            return r6
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgz.b(com.google.android.apps.messaging.shared.api.messaging.MessageId, arpe):java.lang.Object");
    }

    public final Object c(arpe arpeVar) {
        Object fv = this.d.fv(new Integer(0), arpeVar);
        if (fv == arpl.a) {
            return fv;
        }
        return arnb.a;
    }
}
