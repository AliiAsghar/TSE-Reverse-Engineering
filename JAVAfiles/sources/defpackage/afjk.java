package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjk implements asaj {
    final /* synthetic */ asaj a;
    final /* synthetic */ afjn b;
    final /* synthetic */ afiu c;

    public afjk(asaj asajVar, afjn afjnVar, afiu afiuVar) {
        this.a = asajVar;
        this.b = afjnVar;
        this.c = afiuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r11.fv(r12, r0) != r7) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.asaj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fv(defpackage.afjz r11, defpackage.arpe r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.afjj
            if (r0 == 0) goto L13
            r0 = r12
            afjj r0 = (defpackage.afjj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            afjj r0 = new afjj
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            arpl r7 = defpackage.arpl.a
            int r1 = r0.d
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 == r2) goto L32
            if (r1 != r8) goto L2a
            defpackage.aqil.P(r12)
            goto L66
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            java.lang.Object r11 = r0.a
            defpackage.aqil.P(r12)
            goto L5a
        L38:
            defpackage.aqil.P(r12)
            asaj r12 = r10.a
            afjn r1 = r10.b
            afiu r4 = r10.c
            r0.a = r12
            r0.d = r2
            afjs r1 = r1.d
            anca r2 = r1.b
            j$.time.Instant r3 = r2.a()
            r5 = 50
            r2 = r11
            r6 = r0
            java.lang.Object r11 = r1.c(r2, r3, r4, r5, r6)
            if (r11 == r7) goto L69
            r9 = r12
            r12 = r11
            r11 = r9
        L5a:
            r1 = 0
            r0.a = r1
            r0.d = r8
            java.lang.Object r11 = r11.fv(r12, r0)
            if (r11 != r7) goto L66
            goto L69
        L66:
            arnb r11 = defpackage.arnb.a
            return r11
        L69:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afjk.fv(afjz, arpe):java.lang.Object");
    }
}
