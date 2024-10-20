package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asac extends asae {
    private final arqv d;

    public asac(arqv arqvVar, arpi arpiVar, int i, int i2) {
        super(arqvVar, arpiVar, i, i2);
        this.d = arqvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.asae, defpackage.asdj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arzu r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.asab
            if (r0 == 0) goto L13
            r0 = r6
            asab r0 = (defpackage.asab) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            asab r0 = new asab
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            arzu r5 = r0.d
            defpackage.aqil.P(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r6)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.asae.g(r4, r5, r0)
            if (r6 == r1) goto L51
        L3e:
            arzj r5 = r5.b
            boolean r5 = r5.f()
            if (r5 == 0) goto L49
            arnb r5 = defpackage.arnb.a
            return r5
        L49:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asac.b(arzu, arpe):java.lang.Object");
    }

    @Override // defpackage.asae, defpackage.asdj
    protected final asdj c(arpi arpiVar, int i, int i2) {
        return new asac(this.d, arpiVar, i, i2);
    }

    public /* synthetic */ asac(arqv arqvVar) {
        this(arqvVar, arpj.a, -2, 1);
    }
}
