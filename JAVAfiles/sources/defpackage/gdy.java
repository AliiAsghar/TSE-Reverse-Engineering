package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdy {
    private arxm b;
    private int c;
    private final ghw e;
    private final boolean a = true;
    private final asgm d = new asgm();

    public gdy(ghw ghwVar) {
        this.e = ghwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:11:0x004b, B:13:0x004f), top: B:10:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arxm r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.gdw
            if (r0 == 0) goto L13
            r0 = r6
            gdw r0 = (defpackage.gdw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gdw r0 = new gdw
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            asgm r5 = r0.f
            java.lang.Object r1 = r0.a
            gdy r0 = r0.e
            defpackage.aqil.P(r6)
            r6 = r5
            r5 = r1
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.aqil.P(r6)
            asgm r6 = r4.d
            r0.e = r4
            r0.a = r5
            r0.f = r6
            r0.d = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 == r1) goto L5d
            r0 = r4
        L4b:
            arxm r1 = r0.b     // Catch: java.lang.Throwable -> L58
            if (r5 != r1) goto L52
            r5 = 0
            r0.b = r5     // Catch: java.lang.Throwable -> L58
        L52:
            r6.d()
            arnb r5 = defpackage.arnb.a
            return r5
        L58:
            r5 = move-exception
            r6.d()
            throw r5
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdy.a(arxm, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r2.q(r0) != r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:25:0x005b, B:27:0x005f, B:29:0x0065, B:31:0x006b, B:33:0x0077), top: B:24:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #1 {all -> 0x0095, blocks: (B:25:0x005b, B:27:0x005f, B:29:0x0065, B:31:0x006b, B:33:0x0077), top: B:24:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arxm r10, defpackage.arpe r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.gdx
            if (r0 == 0) goto L13
            r0 = r11
            gdx r0 = (defpackage.gdx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gdx r0 = new gdx
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            asgm r10 = r0.f
            java.lang.Object r1 = r0.a
            gdy r0 = r0.e
            defpackage.aqil.P(r11)     // Catch: java.lang.Throwable -> L30
            goto L88
        L30:
            r11 = move-exception
            goto L99
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            asgm r10 = r0.f
            java.lang.Object r2 = r0.a
            gdy r5 = r0.e
            defpackage.aqil.P(r11)
            r11 = r10
            r10 = r2
            goto L5b
        L47:
            defpackage.aqil.P(r11)
            asgm r11 = r9.d
            r0.e = r9
            r0.a = r10
            r0.f = r11
            r0.d = r4
            java.lang.Object r2 = r11.b(r0)
            if (r2 == r1) goto L9d
            r5 = r9
        L5b:
            arxm r2 = r5.b     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L69
            boolean r6 = r2.x()     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L69
            int r6 = r5.c     // Catch: java.lang.Throwable -> L95
            boolean r6 = r5.a     // Catch: java.lang.Throwable -> L95
        L69:
            if (r2 == 0) goto L75
            gdv r6 = new gdv     // Catch: java.lang.Throwable -> L95
            ghw r7 = r5.e     // Catch: java.lang.Throwable -> L95
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L95
            r2.v(r6)     // Catch: java.lang.Throwable -> L95
        L75:
            if (r2 == 0) goto L85
            r0.e = r5     // Catch: java.lang.Throwable -> L95
            r0.a = r10     // Catch: java.lang.Throwable -> L95
            r0.f = r11     // Catch: java.lang.Throwable -> L95
            r0.d = r3     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = r2.q(r0)     // Catch: java.lang.Throwable -> L95
            if (r0 == r1) goto L9d
        L85:
            r1 = r10
            r10 = r11
            r0 = r5
        L88:
            r0.b = r1     // Catch: java.lang.Throwable -> L30
            r11 = 0
            r0.c = r11     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L30
            r10.d()
            return r11
        L95:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L99:
            r10.d()
            throw r11
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdy.b(arxm, arpe):java.lang.Object");
    }
}
