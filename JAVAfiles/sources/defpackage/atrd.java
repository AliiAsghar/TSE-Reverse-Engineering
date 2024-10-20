package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atrd implements atox {
    private final /* synthetic */ int a;
    private final Object b;

    public atrd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r4 != null) goto L22;
     */
    /* JADX WARN: Type inference failed for: r0v8, types: [atox, java.lang.Object] */
    @Override // defpackage.atox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object a(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.a
            if (r0 == 0) goto L11
            asmp r11 = (defpackage.asmp) r11
            java.lang.Object r0 = r10.b
            java.lang.Object r11 = r0.a(r11)
            j$.util.Optional r11 = j$.util.Optional.ofNullable(r11)
            return r11
        L11:
            asmp r11 = (defpackage.asmp) r11
            java.io.Reader r0 = r11.d
            if (r0 != 0) goto L5b
            asmn r0 = new asmn
            asqw r1 = r11.c()
            aslz r2 = r11.b()
            if (r2 == 0) goto L54
            java.lang.String[] r3 = r2.e
            java.nio.charset.Charset r4 = defpackage.arul.a
            int r3 = r3.length
            int r3 = r3 + (-1)
            r5 = 0
            r6 = 2
            int r3 = defpackage.arhi.e(r5, r3, r6)
            r6 = 0
            if (r3 < 0) goto L4b
        L33:
            java.lang.String[] r7 = r2.e
            r7 = r7[r5]
            java.lang.String r8 = "charset"
            r9 = 1
            boolean r7 = defpackage.arsd.x(r7, r8, r9)
            if (r7 == 0) goto L46
            java.lang.String[] r2 = r2.e
            int r5 = r5 + r9
            r6 = r2[r5]
            goto L4b
        L46:
            if (r5 == r3) goto L4b
            int r5 = r5 + 2
            goto L33
        L4b:
            if (r6 != 0) goto L4e
            goto L52
        L4e:
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.IllegalArgumentException -> L52
        L52:
            if (r4 != 0) goto L56
        L54:
            java.nio.charset.Charset r4 = defpackage.arul.a
        L56:
            r0.<init>(r1, r4)
            r11.d = r0
        L5b:
            aoro r0 = defpackage.aonx.m(r0)
            java.lang.Object r1 = r10.b     // Catch: java.lang.Throwable -> L7b
            aoon r1 = (defpackage.aoon) r1     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r1 = r1.a(r0)     // Catch: java.lang.Throwable -> L7b
            int r0 = r0.t()     // Catch: java.lang.Throwable -> L7b
            r2 = 10
            if (r0 != r2) goto L73
            r11.close()
            return r1
        L73:
            aooe r0 = new aooe     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "JSON document was not fully consumed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7b
            throw r0     // Catch: java.lang.Throwable -> L7b
        L7b:
            r0 = move-exception
            r11.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atrd.a(java.lang.Object):java.lang.Object");
    }
}
