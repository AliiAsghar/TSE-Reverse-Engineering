package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ascr implements asaj {
    final /* synthetic */ arrx a;
    final /* synthetic */ asaj b;

    public ascr(arrx arrxVar, asaj asajVar) {
        this.a = arrxVar;
        this.b = asajVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(int r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ascq
            if (r0 == 0) goto L13
            r0 = r6
            ascq r0 = (defpackage.ascq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ascq r0 = new ascq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.aqil.P(r6)
            if (r5 <= 0) goto L49
            arrx r5 = r4.a
            boolean r6 = r5.a
            if (r6 != 0) goto L49
            r5.a = r3
            asaj r5 = r4.b
            ascm r6 = defpackage.ascm.a
            r0.c = r3
            java.lang.Object r5 = r5.fv(r6, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            arnb r5 = defpackage.arnb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ascr.b(int, arpe):java.lang.Object");
    }

    @Override // defpackage.asaj
    public final /* bridge */ /* synthetic */ Object fv(Object obj, arpe arpeVar) {
        return b(((Number) obj).intValue(), arpeVar);
    }
}
