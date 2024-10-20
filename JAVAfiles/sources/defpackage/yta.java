package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yta {
    static final alhr a;
    public static final ysy b;
    public static final uuf c;
    static final alhr d;
    static final alhr e;
    private static final String f;
    private static final ysx g;
    private static final ysy h;
    private static final Object i;
    private static final alhr j;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        void OA();

        mbl aa();
    }

    static {
        String ch = Character.toString((char) 0);
        f = ch;
        aozy createBuilder = ysx.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ysx ysxVar = (ysx) apagVar;
        ysxVar.b |= 1;
        ysxVar.c = "[\\u2000-\\u200A\\u1680\\u205F\\u3000]+([ \\t])";
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        ysx ysxVar2 = (ysx) apagVar2;
        ysxVar2.b |= 2;
        ysxVar2.d = "$1";
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        ysx.a((ysx) createBuilder.b);
        ysx ysxVar3 = (ysx) createBuilder.s();
        g = ysxVar3;
        a = uuh.w("enable_replace_null_character");
        aozy createBuilder2 = ysy.a.createBuilder();
        createBuilder2.ah(ysxVar3);
        ysy ysyVar = (ysy) createBuilder2.s();
        h = ysyVar;
        aozy createBuilder3 = ysy.a.createBuilder();
        createBuilder3.ah(ysxVar3);
        aozy createBuilder4 = ysx.a.createBuilder();
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        apag apagVar3 = createBuilder4.b;
        ysx ysxVar4 = (ysx) apagVar3;
        ch.getClass();
        ysxVar4.b |= 1;
        ysxVar4.c = ch;
        if (!apagVar3.isMutable()) {
            createBuilder4.u();
        }
        apag apagVar4 = createBuilder4.b;
        ysx ysxVar5 = (ysx) apagVar4;
        ysxVar5.b |= 2;
        ysxVar5.d = "";
        if (!apagVar4.isMutable()) {
            createBuilder4.u();
        }
        ysx.a((ysx) createBuilder4.b);
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        ysy ysyVar2 = (ysy) createBuilder3.b;
        ysx ysxVar6 = (ysx) createBuilder4.s();
        ysxVar6.getClass();
        ysyVar2.a();
        ysyVar2.b.add(ysxVar6);
        b = (ysy) createBuilder3.s();
        int i2 = 13;
        c = uuh.u(uuh.b, "text_sanitization_config", ysyVar, new mdd(i2));
        i = new Object();
        d = albo.D(new xyn(i2));
        e = albo.D(new xyn(14));
        j = albo.D(new xyn(15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[Catch: all -> 0x0084, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x000f, B:10:0x0024, B:11:0x0035, B:12:0x003a, B:14:0x0040, B:15:0x004c, B:18:0x0054, B:20:0x0059, B:24:0x0061, B:26:0x006f, B:29:0x0075, B:33:0x002d), top: B:5:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r9) {
        /*
            alhr r0 = defpackage.yta.j
            if (r9 == 0) goto L87
            java.lang.Object r1 = defpackage.yta.i
            monitor-enter(r1)
            alhr r2 = defpackage.yta.a     // Catch: java.lang.Throwable -> L84
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L2d
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L84
            utz r2 = (defpackage.utz) r2     // Catch: java.lang.Throwable -> L84
            r2.getClass()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r2 = r2.e()     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L84
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L2d
            alhr r2 = defpackage.yta.e     // Catch: java.lang.Throwable -> L84
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L84
            alog r2 = (defpackage.alog) r2     // Catch: java.lang.Throwable -> L84
            goto L35
        L2d:
            alhr r2 = defpackage.yta.d     // Catch: java.lang.Throwable -> L84
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L84
            alog r2 = (defpackage.alog) r2     // Catch: java.lang.Throwable -> L84
        L35:
            alur r2 = r2.iterator()     // Catch: java.lang.Throwable -> L84
            r3 = 0
        L3a:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L75
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L84
            ysz r4 = (defpackage.ysz) r4     // Catch: java.lang.Throwable -> L84
            java.util.regex.Matcher r5 = r4.a     // Catch: java.lang.Throwable -> L84
            r5.reset(r9)     // Catch: java.lang.Throwable -> L84
            r6 = 0
        L4c:
            boolean r7 = r5.find()     // Catch: java.lang.Throwable -> L84
            if (r7 == 0) goto L5f
            if (r6 != 0) goto L59
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L84
            r6.<init>()     // Catch: java.lang.Throwable -> L84
        L59:
            java.lang.String r7 = r4.b     // Catch: java.lang.Throwable -> L84
            r5.appendReplacement(r6, r7)     // Catch: java.lang.Throwable -> L84
            goto L4c
        L5f:
            if (r6 == 0) goto L6f
            boolean r9 = r4.c     // Catch: java.lang.Throwable -> L84
            r9 = r9 | r3
            java.lang.StringBuffer r3 = r5.appendTail(r6)     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L84
            r8 = r3
            r3 = r9
            r9 = r8
        L6f:
            java.lang.String r4 = ""
            r5.reset(r4)     // Catch: java.lang.Throwable -> L84
            goto L3a
        L75:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L87
            java.lang.Object r0 = r0.get()
            mbl r0 = (defpackage.mbl) r0
            java.lang.String r1 = "Bugle.Text.Sanitization.Success.Count"
            r0.c(r1)
            goto L87
        L84:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L84
            throw r9
        L87:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yta.a(java.lang.String):java.lang.String");
    }
}
