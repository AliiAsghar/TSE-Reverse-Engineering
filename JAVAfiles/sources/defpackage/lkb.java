package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkb implements asaj {
    final /* synthetic */ lkc a;
    final /* synthetic */ arwe b;

    public lkb(lkc lkcVar, arwe arweVar) {
        this.a = lkcVar;
        this.b = arweVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (r10.a(r9, r0) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.asaj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fv(defpackage.lke r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.lka
            if (r0 == 0) goto L13
            r0 = r10
            lka r0 = (defpackage.lka) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lka r0 = new lka
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r10)
            goto L81
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            java.lang.Object r9 = r0.a
            lkb r2 = r0.e
            defpackage.aqil.P(r10)
            goto L50
        L3a:
            defpackage.aqil.P(r10)
            lkc r10 = r8.a
            enf r2 = defpackage.enf.ON_RESUME
            r0.e = r8
            r0.a = r9
            r0.d = r4
            enh r10 = r10.b
            java.lang.Object r10 = defpackage.afwv.D(r10, r2, r0)
            if (r10 == r1) goto L84
            r2 = r8
        L50:
            alvi r10 = defpackage.lkc.a
            alvw r10 = r10.e()
            java.lang.String r4 = "emit"
            r5 = 43
            java.lang.String r6 = "com/google/android/apps/messaging/navigation/NavigationRouterControllerImpl$initialize$1$1"
            java.lang.String r7 = "NavigationRouterControllerImpl.kt"
            alvw r10 = r10.h(r6, r4, r5, r7)
            alvg r10 = (defpackage.alvg) r10
            java.lang.String r4 = "Collected navigation state: %s"
            r10.t(r4, r9)
            arwe r10 = r2.b
            boolean r10 = defpackage.arwi.h(r10)
            if (r10 == 0) goto L81
            lkc r10 = r2.a
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r9 = r10.a(r9, r0)
            if (r9 != r1) goto L81
            goto L84
        L81:
            arnb r9 = defpackage.arnb.a
            return r9
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkb.fv(lke, arpe):java.lang.Object");
    }
}
