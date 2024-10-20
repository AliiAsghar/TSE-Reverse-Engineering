package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsv implements qar {
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0018. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    @Override // defpackage.qar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.amro a(defpackage.pwr r5) {
        /*
            r4 = this;
            xoc r0 = r5.b
            r0.getClass()
            j$.util.Optional r1 = r5.f
            r1.getClass()
            java.lang.Object r1 = defpackage.arsd.k(r1)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            int r0 = r0.ordinal()
            java.lang.String r2 = "Failed requirement."
            java.lang.String r3 = "Required value was null."
            switch(r0) {
                case 0: goto La7;
                case 1: goto L8e;
                case 2: goto La7;
                case 3: goto La7;
                case 4: goto La7;
                case 5: goto La7;
                case 6: goto La7;
                case 7: goto La7;
                case 8: goto La7;
                case 9: goto La7;
                case 10: goto La7;
                case 11: goto La7;
                case 12: goto L43;
                case 13: goto La7;
                case 14: goto La7;
                case 15: goto L21;
                case 16: goto La7;
                case 17: goto La7;
                case 18: goto La7;
                case 19: goto La7;
                case 20: goto La7;
                case 21: goto La7;
                case 22: goto La7;
                default: goto L1b;
            }
        L1b:
            armm r5 = new armm
            r5.<init>()
            throw r5
        L21:
            if (r1 == 0) goto L3d
            boolean r5 = r1 instanceof defpackage.apvj
            if (r5 == 0) goto L37
            apvj r1 = (defpackage.apvj) r1
            boolean r5 = r1.a()
            if (r5 == 0) goto L33
            amrn r5 = defpackage.amrn.RETRY_AFTER_DELAY
            goto La9
        L33:
            amrn r5 = defpackage.amrn.NO_RETRY
            goto La9
        L37:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r2)
            throw r5
        L3d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r3)
            throw r5
        L43:
            if (r1 == 0) goto L88
            boolean r5 = r1 instanceof defpackage.aniq
            if (r5 == 0) goto L82
            anit r5 = defpackage.anit.a
            aniq r1 = (defpackage.aniq) r1
            anit r5 = r1.a
            boolean r5 = defpackage.albo.aA(r5)
            if (r5 == 0) goto L7f
            anit r5 = r1.a
            anis r5 = r5.c
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L79;
                case 1: goto L76;
                case 2: goto L73;
                case 3: goto L70;
                case 4: goto L79;
                case 5: goto L79;
                case 6: goto L79;
                default: goto L60;
            }
        L60:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "unknown enum value: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        L70:
            amrn r5 = defpackage.amrn.RETRY_AFTER_REPROVISIONING
            goto L7b
        L73:
            amrn r5 = defpackage.amrn.RETRY_AFTER_REGISTRATION_REFRESH
            goto L7b
        L76:
            amrn r5 = defpackage.amrn.RETRY_AFTER_DELAY
            goto L7b
        L79:
            amrn r5 = defpackage.amrn.NO_RETRY
        L7b:
            r5.getClass()
            goto La9
        L7f:
            amrn r5 = defpackage.amrn.NO_RETRY
            goto La9
        L82:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r2)
            throw r5
        L88:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r3)
            throw r5
        L8e:
            int r5 = r5.c
            r0 = 500(0x1f4, float:7.0E-43)
            if (r5 < r0) goto L99
            r0 = 600(0x258, float:8.41E-43)
            if (r5 >= r0) goto L99
            goto La4
        L99:
            r0 = 408(0x198, float:5.72E-43)
            if (r5 == r0) goto La4
            r0 = 401(0x191, float:5.62E-43)
            if (r5 != r0) goto La7
            amrn r5 = defpackage.amrn.RETRY_AFTER_REGISTRATION_REFRESH
            goto La9
        La4:
            amrn r5 = defpackage.amrn.RETRY_AFTER_DELAY
            goto La9
        La7:
            amrn r5 = defpackage.amrn.NO_RETRY
        La9:
            amro r0 = defpackage.amro.a
            aozy r0 = r0.createBuilder()
            apag r1 = r0.b
            boolean r1 = r1.isMutable()
            if (r1 != 0) goto Lba
            r0.u()
        Lba:
            apag r1 = r0.b
            amro r1 = (defpackage.amro) r1
            int r5 = r5.f
            r1.c = r5
            int r5 = r1.b
            r5 = r5 | 1
            r1.b = r5
            apag r5 = r0.s()
            r5.getClass()
            amro r5 = (defpackage.amro) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsv.a(pwr):amro");
    }
}
