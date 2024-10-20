package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qwj {
    public static final qwj a = new qwj();

    private qwj() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[Catch: all -> 0x002c, TryCatch #2 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x005d, B:13:0x0063, B:15:0x0069, B:18:0x0076, B:22:0x009d), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.qvv r8, defpackage.qei r9, defpackage.arpe r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.qwf
            if (r0 == 0) goto L13
            r0 = r10
            qwf r0 = (defpackage.qwf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qwf r0 = new qwf
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            akrh r8 = r0.e
            qei r9 = r0.d
            defpackage.aqil.P(r10)     // Catch: java.lang.Throwable -> L2c
            goto L5d
        L2c:
            r9 = move-exception
            goto La7
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            defpackage.aqil.P(r10)
            int r10 = r9.c
            qeh r10 = defpackage.qeh.b(r10)
            if (r10 != 0) goto L44
            qeh r10 = defpackage.qeh.UNKNOWN_TYPE
        L44:
            qeh r2 = defpackage.qeh.PHONE
            if (r10 != r2) goto Lad
            java.lang.String r10 = "MyIdentityUtils#getActiveMyIdentityByChatEndpoint"
            akrh r10 = defpackage.aktp.e(r10)
            r0.d = r9     // Catch: java.lang.Throwable -> La4
            r0.e = r10     // Catch: java.lang.Throwable -> La4
            r0.c = r3     // Catch: java.lang.Throwable -> La4
            java.lang.Object r8 = r8.d(r0)     // Catch: java.lang.Throwable -> La4
            if (r8 == r1) goto La3
            r6 = r10
            r10 = r8
            r8 = r6
        L5d:
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L2c
        L63:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L2c
            r1 = r0
            qvo r1 = (defpackage.qvo) r1     // Catch: java.lang.Throwable -> L2c
            qvn r2 = r1.b     // Catch: java.lang.Throwable -> L2c
            qvn r3 = defpackage.qvn.a     // Catch: java.lang.Throwable -> L2c
            if (r2 != r3) goto L63
            j$.util.Optional r1 = r1.a     // Catch: java.lang.Throwable -> L2c
            qin r2 = new qin     // Catch: java.lang.Throwable -> L2c
            r3 = 11
            r2.<init>(r9, r3)     // Catch: java.lang.Throwable -> L2c
            qsb r3 = new qsb     // Catch: java.lang.Throwable -> L2c
            r5 = 17
            r3.<init>(r2, r5)     // Catch: java.lang.Throwable -> L2c
            j$.util.Optional r1 = r1.map(r3)     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r1 = r1.orElse(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L63
            goto L9d
        L9c:
            r0 = r4
        L9d:
            qvo r0 = (defpackage.qvo) r0     // Catch: java.lang.Throwable -> L2c
            defpackage.armd.i(r8, r4)
            return r0
        La3:
            return r1
        La4:
            r8 = move-exception
            r9 = r8
            r8 = r10
        La7:
            throw r9     // Catch: java.lang.Throwable -> La8
        La8:
            r10 = move-exception
            defpackage.armd.i(r8, r9)
            throw r10
        Lad:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwj.a(qvv, qei, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x004d, B:13:0x0053, B:15:0x005a, B:19:0x0072), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.qvv r6, int r7, defpackage.arpe r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.qwg
            if (r0 == 0) goto L13
            r0 = r8
            qwg r0 = (defpackage.qwg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qwg r0 = new qwg
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r7 = r0.a
            akrh r6 = r0.e
            defpackage.aqil.P(r8)     // Catch: java.lang.Throwable -> L2b
            goto L4d
        L2b:
            r7 = move-exception
            goto L7c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.aqil.P(r8)
            java.lang.String r8 = "MyIdentityUtils#getActiveMyIdentityBySubId"
            akrh r8 = defpackage.aktp.e(r8)
            r0.e = r8     // Catch: java.lang.Throwable -> L79
            r0.a = r7     // Catch: java.lang.Throwable -> L79
            r0.d = r3     // Catch: java.lang.Throwable -> L79
            java.lang.Object r6 = r6.d(r0)     // Catch: java.lang.Throwable -> L79
            if (r6 == r1) goto L78
            r4 = r8
            r8 = r6
            r6 = r4
        L4d:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2b
        L53:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            if (r0 == 0) goto L71
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L2b
            r2 = r0
            qvo r2 = (defpackage.qvo) r2     // Catch: java.lang.Throwable -> L2b
            alpt r2 = r2.a()     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r3 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L53
            goto L72
        L71:
            r0 = r1
        L72:
            qvo r0 = (defpackage.qvo) r0     // Catch: java.lang.Throwable -> L2b
            defpackage.armd.i(r6, r1)
            return r0
        L78:
            return r1
        L79:
            r6 = move-exception
            r7 = r6
            r6 = r8
        L7c:
            throw r7     // Catch: java.lang.Throwable -> L7d
        L7d:
            r8 = move-exception
            defpackage.armd.i(r6, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwj.b(qvv, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (r10 != r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:12:0x002f, B:13:0x007c, B:14:0x0082, B:16:0x0088, B:19:0x0095, B:23:0x00bc, B:29:0x00c2, B:30:0x00c9, B:40:0x0048, B:41:0x006a, B:43:0x006e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [qvv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qvv r8, defpackage.qei r9, defpackage.arpe r10) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwj.c(qvv, qei, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x0085, B:14:0x008b, B:16:0x0091, B:20:0x00a9, B:26:0x00af, B:27:0x00ba, B:38:0x0070, B:40:0x0074), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x0085, B:14:0x008b, B:16:0x0091, B:20:0x00a9, B:26:0x00af, B:27:0x00ba, B:38:0x0070, B:40:0x0074), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x0085, B:14:0x008b, B:16:0x0091, B:20:0x00a9, B:26:0x00af, B:27:0x00ba, B:38:0x0070, B:40:0x0074), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.qvv r8, int r9, defpackage.arpe r10) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwj.d(qvv, int, arpe):java.lang.Object");
    }
}
