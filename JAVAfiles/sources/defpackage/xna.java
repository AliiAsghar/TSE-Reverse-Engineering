package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xna implements xhj {
    static final utz a;
    static final utz b;
    static final utz c;
    private final armf d;

    static {
        uac uacVar = new uac(uuh.a, "bugle_phenotype__");
        Object obj = uacVar.a;
        a = uuh.c((ahtn) uacVar.b, ((String) obj).concat("message_count_mismatch_detection_threshold"), 0.05d);
        b = new uac(uuh.a, "bugle_phenotype__").n("bugle_db_is_not_empty_threshold", 5);
        c = new uac(uuh.a, "bugle_phenotype__").n("telephony_db_considered_empty_threshold", 1);
    }

    public xna(armf armfVar) {
        this.d = armfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if (r1 < (r0 * ((java.lang.Double) defpackage.xna.a.e()).doubleValue())) goto L16;
     */
    @Override // defpackage.xhj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.util.Optional a() {
        /*
            r8 = this;
            sxy r0 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.d()
            java.lang.String r1 = "detectWipeout"
            r0.w(r1)
            r0.q()
            sxx r0 = r0.b()
            int r0 = r0.i()
            armf r1 = r8.d
            java.lang.Object r1 = r1.b()
            wzy r1 = (defpackage.wzy) r1
            int r1 = r1.al()
            utz r2 = defpackage.xna.b
            java.lang.Object r2 = r2.e()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 1
            if (r0 < r2) goto L49
            utz r2 = defpackage.xna.c
            java.lang.Object r2 = r2.e()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 >= r2) goto L49
            if (r0 > r1) goto L40
            goto L49
        L40:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            j$.util.Optional r0 = j$.util.Optional.of(r0)
            return r0
        L49:
            r2 = 0
            if (r1 <= 0) goto L60
            double r4 = (double) r0
            utz r0 = defpackage.xna.a
            java.lang.Object r0 = r0.e()
            java.lang.Double r0 = (java.lang.Double) r0
            double r6 = r0.doubleValue()
            double r4 = r4 * r6
            double r0 = (double) r1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L60
            goto L61
        L60:
            r3 = r2
        L61:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            j$.util.Optional r0 = j$.util.Optional.of(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xna.a():j$.util.Optional");
    }
}
