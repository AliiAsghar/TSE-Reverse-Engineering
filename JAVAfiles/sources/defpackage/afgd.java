package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afgd extends gdk {
    private final int a;
    private final int b = 20;
    private final affy c;

    public afgd(affy affyVar) {
        this.c = affyVar;
    }

    @Override // defpackage.gdk
    public final /* bridge */ /* synthetic */ Object a(gdl gdlVar) {
        Integer num;
        Integer num2;
        Integer num3 = gdlVar.b;
        if (num3 == null) {
            return null;
        }
        int intValue = num3.intValue();
        gdj a = gdlVar.a(intValue);
        if (a != null && (num2 = (Integer) a.c) != null) {
            return Integer.valueOf(num2.intValue() + 1);
        }
        gdj a2 = gdlVar.a(intValue);
        if (a2 == null || (num = (Integer) a2.d) == null) {
            return null;
        }
        return Integer.valueOf(num.intValue() - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.gdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.gdg r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.afgc
            if (r0 == 0) goto L13
            r0 = r10
            afgc r0 = (defpackage.afgc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            afgc r0 = new afgc
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            int r9 = r0.a
            afgd r0 = r0.e
            defpackage.aqil.P(r10)     // Catch: java.lang.Exception -> L9b
            goto L64
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.aqil.P(r10)
            java.lang.Object r9 = r9.a()     // Catch: java.lang.Exception -> L9b
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Exception -> L9b
            if (r9 == 0) goto L44
            int r9 = r9.intValue()     // Catch: java.lang.Exception -> L9b
            goto L45
        L44:
            r9 = 0
        L45:
            affy r10 = r8.c     // Catch: java.lang.Exception -> L9b
            int r2 = r9 * 20
            r0.e = r8     // Catch: java.lang.Exception -> L9b
            r0.a = r9     // Catch: java.lang.Exception -> L9b
            r0.d = r4     // Catch: java.lang.Exception -> L9b
            arwe r5 = r10.b     // Catch: java.lang.Exception -> L9b
            arpi r5 = r5.b()     // Catch: java.lang.Exception -> L9b
            uxn r6 = new uxn     // Catch: java.lang.Exception -> L9b
            r7 = 9
            r6.<init>(r10, r2, r3, r7)     // Catch: java.lang.Exception -> L9b
            java.lang.Object r10 = defpackage.arro.q(r5, r6, r0)     // Catch: java.lang.Exception -> L9b
            if (r10 != r1) goto L63
            return r1
        L63:
            r0 = r8
        L64:
            affw r10 = (defpackage.affw) r10     // Catch: java.lang.Exception -> L9b
            java.util.List r1 = r10.a     // Catch: java.lang.Exception -> L9b
            int r2 = r9 + (-1)
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Exception -> L9b
            r5.<init>(r2)     // Catch: java.lang.Exception -> L9b
            r5.intValue()     // Catch: java.lang.Exception -> L9b
            int r2 = r0.a     // Catch: java.lang.Exception -> L9b
            if (r9 != 0) goto L77
            r5 = r3
        L77:
            int r9 = r9 + r4
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Exception -> L9b
            r2.<init>(r9)     // Catch: java.lang.Exception -> L9b
            r2.intValue()     // Catch: java.lang.Exception -> L9b
            java.util.List r9 = r10.a     // Catch: java.lang.Exception -> L9b
            int r9 = r9.size()     // Catch: java.lang.Exception -> L9b
            java.util.List r10 = r10.b     // Catch: java.lang.Exception -> L9b
            int r10 = r10.size()     // Catch: java.lang.Exception -> L9b
            int r9 = r9 + r10
            int r10 = r0.b     // Catch: java.lang.Exception -> L9b
            r10 = 20
            if (r9 >= r10) goto L94
            goto L95
        L94:
            r3 = r2
        L95:
            gdj r9 = new gdj     // Catch: java.lang.Exception -> L9b
            r9.<init>(r1, r5, r3)     // Catch: java.lang.Exception -> L9b
            goto La2
        L9b:
            r9 = move-exception
            gdh r10 = new gdh
            r10.<init>(r9)
            r9 = r10
        La2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afgd.b(gdg, arpe):java.lang.Object");
    }
}
