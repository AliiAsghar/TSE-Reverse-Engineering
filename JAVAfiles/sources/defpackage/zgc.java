package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zgc implements asaj {
    final /* synthetic */ zgd a;
    final /* synthetic */ arwe b;

    public zgc(zgd zgdVar, arwe arweVar) {
        this.a = zgdVar;
        this.b = arweVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.asaj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fv(defpackage.zgf r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.zgb
            if (r0 == 0) goto L13
            r0 = r7
            zgb r0 = (defpackage.zgb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zgb r0 = new zgb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            zgf r6 = r0.e
            zgc r0 = r0.d
            defpackage.aqil.P(r7)
            goto L49
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.aqil.P(r7)
            zgd r7 = r5.a
            enf r2 = defpackage.enf.ON_RESUME
            r0.d = r5
            r0.e = r6
            r0.c = r3
            enh r7 = r7.c
            java.lang.Object r7 = defpackage.afwv.D(r7, r2, r0)
            if (r7 == r1) goto L7b
            r0 = r5
        L49:
            alvi r7 = defpackage.zgd.a
            alvw r7 = r7.e()
            java.lang.String r1 = "emit"
            r2 = 40
            java.lang.String r3 = "com/google/android/apps/messaging/toast/ToastsControllerImpl$initialize$1$1"
            java.lang.String r4 = "ToastsControllerImpl.kt"
            alvw r7 = r7.h(r3, r1, r2, r4)
            alvg r7 = (defpackage.alvg) r7
            java.lang.String r1 = "Collected toast: %s"
            r7.t(r1, r6)
            arwe r7 = r0.b
            boolean r7 = defpackage.arwi.h(r7)
            if (r7 == 0) goto L78
            zgd r7 = r0.a
            android.content.Context r7 = r7.b
            java.lang.String r6 = r6.a
            r0 = 0
            android.widget.Toast r6 = android.widget.Toast.makeText(r7, r6, r0)
            r6.show()
        L78:
            arnb r6 = defpackage.arnb.a
            return r6
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgc.fv(zgf, arpe):java.lang.Object");
    }
}
