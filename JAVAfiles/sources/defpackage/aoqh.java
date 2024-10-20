package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoqh extends aoon {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        r11.f = r11.k();
     */
    @Override // defpackage.aoon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.aoro r11) {
        /*
            r10 = this;
            java.lang.String r0 = "Expected a long but was "
            int r1 = r11.t()
            r2 = 0
            r3 = 9
            if (r1 != r3) goto L10
            r11.p()
            goto La7
        L10:
            int r1 = r11.c     // Catch: java.lang.NumberFormatException -> Lc3
            if (r1 != 0) goto L18
            int r1 = r11.b()     // Catch: java.lang.NumberFormatException -> Lc3
        L18:
            r4 = 15
            r5 = 0
            if (r1 != r4) goto L2f
            r11.c = r5     // Catch: java.lang.NumberFormatException -> Lc3
            int[] r0 = r11.h     // Catch: java.lang.NumberFormatException -> Lc3
            int r1 = r11.g     // Catch: java.lang.NumberFormatException -> Lc3
            int r1 = r1 + (-1)
            r2 = r0[r1]     // Catch: java.lang.NumberFormatException -> Lc3
            int r2 = r2 + 1
            r0[r1] = r2     // Catch: java.lang.NumberFormatException -> Lc3
            long r0 = r11.d     // Catch: java.lang.NumberFormatException -> Lc3
            goto La3
        L2f:
            r4 = 16
            if (r1 != r4) goto L44
            char[] r1 = r11.a     // Catch: java.lang.NumberFormatException -> Lc3
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.NumberFormatException -> Lc3
            int r4 = r11.b     // Catch: java.lang.NumberFormatException -> Lc3
            int r6 = r11.e     // Catch: java.lang.NumberFormatException -> Lc3
            r3.<init>(r1, r4, r6)     // Catch: java.lang.NumberFormatException -> Lc3
            r11.f = r3     // Catch: java.lang.NumberFormatException -> Lc3
            int r4 = r4 + r6
            r11.b = r4     // Catch: java.lang.NumberFormatException -> Lc3
            goto L82
        L44:
            r4 = 10
            r6 = 8
            if (r1 == r6) goto L56
            if (r1 == r3) goto L56
            if (r1 != r4) goto L4f
            goto L56
        L4f:
            java.lang.String r0 = "a long"
            java.lang.IllegalStateException r11 = r11.d(r0)     // Catch: java.lang.NumberFormatException -> Lc3
            throw r11     // Catch: java.lang.NumberFormatException -> Lc3
        L56:
            if (r1 != r4) goto L5f
            java.lang.String r1 = r11.k()     // Catch: java.lang.NumberFormatException -> Lc3
            r11.f = r1     // Catch: java.lang.NumberFormatException -> Lc3
            goto L6c
        L5f:
            if (r1 != r6) goto L64
            r1 = 39
            goto L66
        L64:
            r1 = 34
        L66:
            java.lang.String r1 = r11.i(r1)     // Catch: java.lang.NumberFormatException -> Lc3
            r11.f = r1     // Catch: java.lang.NumberFormatException -> Lc3
        L6c:
            java.lang.String r1 = r11.f     // Catch: java.lang.NumberFormatException -> L82
            long r3 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L82
            r11.c = r5     // Catch: java.lang.NumberFormatException -> L82
            int[] r1 = r11.h     // Catch: java.lang.NumberFormatException -> L82
            int r6 = r11.g     // Catch: java.lang.NumberFormatException -> L82
            int r6 = r6 + (-1)
            r7 = r1[r6]     // Catch: java.lang.NumberFormatException -> L82
            int r7 = r7 + 1
            r1[r6] = r7     // Catch: java.lang.NumberFormatException -> L82
            r0 = r3
            goto La3
        L82:
            r1 = 11
            r11.c = r1     // Catch: java.lang.NumberFormatException -> Lc3
            java.lang.String r1 = r11.f     // Catch: java.lang.NumberFormatException -> Lc3
            double r3 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.NumberFormatException -> Lc3
            long r6 = (long) r3     // Catch: java.lang.NumberFormatException -> Lc3
            double r8 = (double) r6     // Catch: java.lang.NumberFormatException -> Lc3
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto La8
            r11.f = r2     // Catch: java.lang.NumberFormatException -> Lc3
            r11.c = r5     // Catch: java.lang.NumberFormatException -> Lc3
            int[] r0 = r11.h     // Catch: java.lang.NumberFormatException -> Lc3
            int r11 = r11.g     // Catch: java.lang.NumberFormatException -> Lc3
            int r11 = r11 + (-1)
            r1 = r0[r11]     // Catch: java.lang.NumberFormatException -> Lc3
            int r1 = r1 + 1
            r0[r11] = r1     // Catch: java.lang.NumberFormatException -> Lc3
            r0 = r6
        La3:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lc3
        La7:
            return r2
        La8:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> Lc3
            java.lang.String r2 = r11.f     // Catch: java.lang.NumberFormatException -> Lc3
            java.lang.String r11 = r11.g()     // Catch: java.lang.NumberFormatException -> Lc3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lc3
            r3.<init>(r0)     // Catch: java.lang.NumberFormatException -> Lc3
            r3.append(r2)     // Catch: java.lang.NumberFormatException -> Lc3
            r3.append(r11)     // Catch: java.lang.NumberFormatException -> Lc3
            java.lang.String r11 = r3.toString()     // Catch: java.lang.NumberFormatException -> Lc3
            r1.<init>(r11)     // Catch: java.lang.NumberFormatException -> Lc3
            throw r1     // Catch: java.lang.NumberFormatException -> Lc3
        Lc3:
            r11 = move-exception
            aook r0 = new aook
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoqh.a(aoro):java.lang.Object");
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            aorpVar.j();
        } else {
            aorpVar.k(number.longValue());
        }
    }
}
