package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ufg implements ufw {
    final /* synthetic */ ufh a;
    private final ufw b;

    public ufg(ufh ufhVar, ufw ufwVar) {
        this.a = ufhVar;
        this.b = ufwVar;
        ufhVar.p();
    }

    @Override // defpackage.ufw
    public final int c() {
        return 0;
    }

    @Override // defpackage.ufw
    public final int d() {
        return 1;
    }

    @Override // defpackage.ufw
    public final ufv j() {
        return this.b.j();
    }

    @Override // defpackage.ufw
    public final ufx k() {
        return this.b.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r10 != r0.d()) goto L19;
     */
    @Override // defpackage.ufw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ defpackage.ugg l(java.util.List r10) {
        /*
            r9 = this;
            defpackage.xyl.h()
            ufh r10 = r9.a
            r10.o()
            r10 = 0
            ufh r0 = r9.a     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            android.graphics.Bitmap r0 = r0.d()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            r0.getClass()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            boolean r1 = r0.hasAlpha()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            defpackage.xyl.f(r1)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            int r1 = r0.getWidth()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            int r2 = r0.getHeight()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            if (r1 <= 0) goto L51
            if (r2 <= 0) goto L51
            ufw r3 = r9.b     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            ufr r3 = (defpackage.ufr) r3     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            ufs r3 = r3.b     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            int r4 = r3.b     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            float r5 = (float) r1     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            float r4 = r4 / r5
            int r3 = r3.c     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            float r6 = (float) r2     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            float r3 = r3 / r6
            float r3 = java.lang.Math.max(r4, r3)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            float r5 = r5 * r3
            float r6 = r6 * r3
            r4 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L51
            int r3 = (int) r5     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            if (r3 <= 0) goto L51
            int r4 = (int) r6     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            if (r4 <= 0) goto L51
            if (r3 == r1) goto L51
            if (r4 == r2) goto L51
            r1 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r3, r4, r1)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            r10 = r0
        L51:
            ufh r1 = r9.a     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            yfo r1 = r1.c     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            r2 = 50
            byte[] r5 = r1.m(r0, r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            ufn r0 = new ufn     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            java.lang.String r4 = r9.m()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            r5.getClass()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            ufh r1 = r9.a     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            int r6 = r1.d     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            xnv r7 = r1.i     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            yfo r8 = r1.c     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            if (r10 == 0) goto L93
            ufh r1 = r9.a
            android.graphics.Bitmap r1 = r1.d()
            if (r10 == r1) goto L93
        L7a:
            r10.recycle()
            goto L93
        L7e:
            r0 = move-exception
            goto L9e
        L80:
            r0 = move-exception
            xze r1 = defpackage.ufh.a     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = "Error compressing bitmap."
            r1.n(r2, r0)     // Catch: java.lang.Throwable -> L7e
            ufh r0 = r9.a     // Catch: java.lang.Throwable -> L7e
            if (r10 == 0) goto L93
            android.graphics.Bitmap r1 = r0.d()
            if (r10 == r1) goto L93
            goto L7a
        L93:
            ufh r10 = r9.a
            r10.r()
            ufh r10 = r9.a
            r10.q()
            return r0
        L9e:
            if (r10 == 0) goto Lab
            ufh r1 = r9.a
            android.graphics.Bitmap r1 = r1.d()
            if (r10 == r1) goto Lab
            r10.recycle()
        Lab:
            ufh r10 = r9.a
            r10.r()
            ufh r10 = r9.a
            r10.q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufg.l(java.util.List):ugg");
    }

    @Override // defpackage.ufw
    public final String m() {
        return this.a.e;
    }
}
