package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gip implements asaj {
    final /* synthetic */ arsb a;
    final /* synthetic */ asaj b;
    final /* synthetic */ String[] c;
    final /* synthetic */ int[] d;

    public gip(arsb arsbVar, asaj asajVar, String[] strArr, int[] iArr) {
        this.a = arsbVar;
        this.b = asajVar;
        this.c = strArr;
        this.d = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r14.fv(r2, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        if (r14.fv(r2, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.asaj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fv(int[] r13, defpackage.arpe r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.gio
            if (r0 == 0) goto L13
            r0 = r14
            gio r0 = (defpackage.gio) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gio r0 = new gio
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            int[] r13 = r0.e
            gip r0 = r0.d
            defpackage.aqil.P(r14)
            goto L9e
        L37:
            defpackage.aqil.P(r14)
            arsb r14 = r12.a
            java.lang.Object r2 = r14.a
            if (r2 != 0) goto L55
            asaj r14 = r12.b
            java.lang.String[] r2 = r12.c
            java.util.Set r2 = defpackage.aqil.r(r2)
            r0.d = r12
            r0.e = r13
            r0.c = r4
            java.lang.Object r14 = r14.fv(r2, r0)
            if (r14 != r1) goto L9d
            goto L9c
        L55:
            java.lang.String[] r2 = r12.c
            int[] r4 = r12.d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r2.length
            r7 = 0
            r8 = r7
        L61:
            if (r7 >= r6) goto L84
            r9 = r2[r7]
            int r10 = r8 + 1
            java.lang.Object r11 = r14.a
            if (r11 == 0) goto L7c
            int[] r11 = (int[]) r11
            r8 = r4[r8]
            r11 = r11[r8]
            r8 = r13[r8]
            if (r11 == r8) goto L78
            r5.add(r9)
        L78:
            int r7 = r7 + 1
            r8 = r10
            goto L61
        L7c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Required value was null."
            r13.<init>(r14)
            throw r13
        L84:
            boolean r14 = r5.isEmpty()
            if (r14 != 0) goto L9d
            asaj r14 = r12.b
            java.util.Set r2 = defpackage.aqjn.aE(r5)
            r0.d = r12
            r0.e = r13
            r0.c = r3
            java.lang.Object r14 = r14.fv(r2, r0)
            if (r14 != r1) goto L9d
        L9c:
            return r1
        L9d:
            r0 = r12
        L9e:
            arsb r14 = r0.a
            r14.a = r13
            arnb r13 = defpackage.arnb.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gip.fv(int[], arpe):java.lang.Object");
    }
}
