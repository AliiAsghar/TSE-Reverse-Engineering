package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class giq extends arpw implements arqv {
    int a;
    final /* synthetic */ giw b;
    final /* synthetic */ int[] c;
    final /* synthetic */ String[] d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giq(giw giwVar, int[] iArr, String[] strArr, arpe arpeVar) {
        super(2, arpeVar);
        this.b = giwVar;
        this.c = iArr;
        this.d = strArr;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((giq) c((asaj) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (defpackage.arro.q((defpackage.arpi) r8, r5, r7) != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r8 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0075, code lost:
    
        if (r3.g(r4, r7) != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
    
        return r0;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r7.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            java.lang.Object r1 = r7.e
            asaj r1 = (defpackage.asaj) r1
            defpackage.aqil.P(r8)
            goto L5a
        L15:
            defpackage.aqil.P(r8)     // Catch: java.lang.Throwable -> L19
            goto L78
        L19:
            r8 = move-exception
            goto L7e
        L1b:
            java.lang.Object r1 = r7.e
            asaj r1 = (defpackage.asaj) r1
            defpackage.aqil.P(r8)
            goto L45
        L23:
            defpackage.aqil.P(r8)
            java.lang.Object r8 = r7.e
            r1 = r8
            asaj r1 = (defpackage.asaj) r1
            giw r8 = r7.b
            int[] r5 = r7.c
            akju r8 = r8.c
            boolean r8 = r8.c(r5)
            if (r8 == 0) goto L5a
            giw r8 = r7.b
            r7.e = r1
            r7.a = r4
            gid r8 = r8.a
            java.lang.Object r8 = defpackage.gvf.bA(r8, r7)
            if (r8 == r0) goto L77
        L45:
            giw r4 = r7.b
            arpi r8 = (defpackage.arpi) r8
            eie r5 = new eie
            r6 = 11
            r5.<init>(r4, r2, r6)
            r7.e = r1
            r7.a = r3
            java.lang.Object r8 = defpackage.arro.q(r8, r5, r7)
            if (r8 == r0) goto L77
        L5a:
            arsb r8 = new arsb     // Catch: java.lang.Throwable -> L19
            r8.<init>()     // Catch: java.lang.Throwable -> L19
            giw r3 = r7.b     // Catch: java.lang.Throwable -> L19
            ghw r3 = r3.d     // Catch: java.lang.Throwable -> L19
            gip r4 = new gip     // Catch: java.lang.Throwable -> L19
            java.lang.String[] r5 = r7.d     // Catch: java.lang.Throwable -> L19
            int[] r6 = r7.c     // Catch: java.lang.Throwable -> L19
            r4.<init>(r8, r1, r5, r6)     // Catch: java.lang.Throwable -> L19
            r7.e = r2     // Catch: java.lang.Throwable -> L19
            r8 = 3
            r7.a = r8     // Catch: java.lang.Throwable -> L19
            java.lang.Object r8 = r3.g(r4, r7)     // Catch: java.lang.Throwable -> L19
            if (r8 != r0) goto L78
        L77:
            return r0
        L78:
            armj r8 = new armj     // Catch: java.lang.Throwable -> L19
            r8.<init>()     // Catch: java.lang.Throwable -> L19
            throw r8     // Catch: java.lang.Throwable -> L19
        L7e:
            giw r0 = r7.b
            int[] r1 = r7.c
            akju r0 = r0.c
            r0.d(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.giq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        giq giqVar = new giq(this.b, this.c, this.d, arpeVar);
        giqVar.e = obj;
        return giqVar;
    }
}
