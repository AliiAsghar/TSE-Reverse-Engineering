package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class t implements Serializable, n {
    private static final long serialVersionUID = 1;
    private final int a;
    private final boolean b;
    private final boolean c;
    private final double d;
    private final double e;
    private final long[] f;
    private final int g;

    public t(int i, boolean z, int i2, boolean z2, double d, double d2, long[] jArr) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = d;
        this.e = d2;
        this.f = jArr;
        this.g = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0081 A[RETURN] */
    @Override // defpackage.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(defpackage.p r11) {
        /*
            r10 = this;
            int r0 = r10.g
            int r1 = r0 + (-1)
            r2 = 1
            if (r1 == r2) goto L23
            r3 = 2
            if (r1 == r3) goto L20
            r3 = 3
            if (r1 == r3) goto L1d
            r3 = 4
            if (r1 == r3) goto L19
            r3 = 5
            if (r1 == r3) goto L16
            double r3 = r11.a
            goto L26
        L16:
            int r1 = r11.c
            goto L1b
        L19:
            int r1 = r11.b
        L1b:
            double r3 = (double) r1
            goto L26
        L1d:
            long r3 = r11.e
            goto L25
        L20:
            long r3 = r11.d
            goto L25
        L23:
            long r3 = r11.f
        L25:
            double r3 = (double) r3
        L26:
            boolean r1 = r10.c
            r5 = 0
            if (r1 == 0) goto L35
            long r6 = (long) r3
            double r6 = (double) r6
            double r6 = r3 - r6
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L3c
        L35:
            r1 = 7
            if (r0 != r1) goto L42
            int r11 = r11.b
            if (r11 == 0) goto L42
        L3c:
            boolean r11 = r10.b
            if (r11 != 0) goto L41
            return r2
        L41:
            return r5
        L42:
            int r11 = r10.a
            if (r11 == 0) goto L48
            double r0 = (double) r11
            double r3 = r3 % r0
        L48:
            double r0 = r10.d
            int r11 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r11 < 0) goto L56
            double r0 = r10.e
            int r11 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r11 > 0) goto L56
            r11 = r2
            goto L57
        L56:
            r11 = r5
        L57:
            if (r11 == 0) goto L7c
            long[] r0 = r10.f
            if (r0 == 0) goto L7c
            r11 = r5
            r0 = r11
        L5f:
            if (r11 != 0) goto L7c
            long[] r1 = r10.f
            int r6 = r1.length
            if (r0 >= r6) goto L7c
            r6 = r1[r0]
            double r6 = (double) r6
            int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r11 < 0) goto L78
            int r11 = r0 + 1
            r6 = r1[r11]
            double r6 = (double) r6
            int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r11 > 0) goto L78
            r11 = r2
            goto L79
        L78:
            r11 = r5
        L79:
            int r0 = r0 + 2
            goto L5f
        L7c:
            boolean r0 = r10.b
            if (r0 != r11) goto L81
            return r2
        L81:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t.a(p):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r9.b != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        r1 = " != ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0050, code lost:
    
        if (r9.b != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r9 = this;
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r0 = r9.g
            switch(r0) {
                case 1: goto L1c;
                case 2: goto L19;
                case 3: goto L16;
                case 4: goto L13;
                case 5: goto L10;
                case 6: goto Ld;
                default: goto La;
            }
        La:
            java.lang.String r0 = "j"
            goto L1e
        Ld:
            java.lang.String r0 = "w"
            goto L1e
        L10:
            java.lang.String r0 = "v"
            goto L1e
        L13:
            java.lang.String r0 = "t"
            goto L1e
        L16:
            java.lang.String r0 = "f"
            goto L1e
        L19:
            java.lang.String r0 = "i"
            goto L1e
        L1c:
            java.lang.String r0 = "n"
        L1e:
            r6.append(r0)
            int r0 = r9.a
            if (r0 == 0) goto L2f
            java.lang.String r0 = " % "
            r6.append(r0)
            int r0 = r9.a
            r6.append(r0)
        L2f:
            double r0 = r9.d
            double r2 = r9.e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.lang.String r1 = " = "
            java.lang.String r2 = " != "
            if (r0 == 0) goto L4e
            boolean r0 = r9.c
            if (r0 == 0) goto L44
            boolean r0 = r9.b
            if (r0 == 0) goto L53
            goto L54
        L44:
            boolean r0 = r9.b
            if (r0 == 0) goto L4b
            java.lang.String r1 = " within "
            goto L54
        L4b:
            java.lang.String r1 = " not within "
            goto L54
        L4e:
            boolean r0 = r9.b
            if (r0 == 0) goto L53
            goto L54
        L53:
            r1 = r2
        L54:
            r6.append(r1)
            long[] r0 = r9.f
            if (r0 == 0) goto L77
            r7 = 0
            r8 = r7
        L5d:
            long[] r0 = r9.f
            int r1 = r0.length
            if (r8 >= r1) goto L80
            r1 = r0[r8]
            double r1 = (double) r1
            int r3 = r8 + 1
            r3 = r0[r3]
            double r3 = (double) r3
            if (r8 == 0) goto L6f
            r0 = 1
            r5 = r0
            goto L70
        L6f:
            r5 = r7
        L70:
            r0 = r6
            defpackage.w.b(r0, r1, r3, r5)
            int r8 = r8 + 2
            goto L5d
        L77:
            double r1 = r9.d
            double r3 = r9.e
            r5 = 0
            r0 = r6
            defpackage.w.b(r0, r1, r3, r5)
        L80:
            java.lang.String r0 = r6.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t.toString():java.lang.String");
    }
}
