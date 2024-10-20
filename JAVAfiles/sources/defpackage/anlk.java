package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anlk extends arpw implements arqr {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ aqfn c;
    final /* synthetic */ anky d;
    final /* synthetic */ int e;
    final /* synthetic */ aogy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anlk(aogy aogyVar, String str, aqfn aqfnVar, int i, anky ankyVar, arpe arpeVar) {
        super(1, arpeVar);
        this.f = aogyVar;
        this.b = str;
        this.c = aqfnVar;
        this.e = i;
        this.d = ankyVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new anlk(this.f, this.b, this.c, this.e, this.d, (arpe) obj).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L31;
     */
    /* JADX WARN: Type inference failed for: r1v8, types: [anjr, java.lang.Object] */
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
            r2 = 1
            defpackage.aqil.P(r8)
            if (r1 == 0) goto Le
            if (r1 == r2) goto L1a
            goto Lb9
        Le:
            aogy r8 = r7.f
            java.lang.String r1 = r7.b
            r7.a = r2
            java.lang.Object r8 = defpackage.aogy.o(r8, r1, r7)
            if (r8 == r0) goto Lbc
        L1a:
            aqfn r1 = r7.c
            int r3 = r7.e
            aqgb r8 = (defpackage.aqgb) r8
            aqdy r4 = defpackage.aqdy.a
            aozy r4 = r4.createBuilder()
            r4.getClass()
            r8.getClass()
            apag r5 = r4.b
            boolean r5 = r5.isMutable()
            if (r5 != 0) goto L37
            r4.u()
        L37:
            apag r5 = r4.b
            aqdy r5 = (defpackage.aqdy) r5
            r5.c = r8
            int r8 = r5.b
            r8 = r8 | r2
            r5.b = r8
            apax r8 = r5.d
            java.util.List r8 = j$.util.DesugarCollections.unmodifiableList(r8)
            r8.getClass()
            r1.getClass()
            apag r8 = r4.b
            boolean r8 = r8.isMutable()
            if (r8 != 0) goto L59
            r4.u()
        L59:
            apag r8 = r4.b
            aqdy r8 = (defpackage.aqdy) r8
            apax r5 = r8.d
            boolean r6 = r5.c()
            if (r6 != 0) goto L6b
            apax r5 = defpackage.apag.mutableCopy(r5)
            r8.d = r5
        L6b:
            apax r8 = r8.d
            r8.add(r1)
            int r8 = r3 + (-1)
            if (r3 == 0) goto Lba
            if (r8 == 0) goto L81
            if (r8 != r2) goto L7b
            r8 = 10
            goto L82
        L7b:
            armm r8 = new armm
            r8.<init>()
            throw r8
        L81:
            r8 = 5
        L82:
            apag r1 = r4.b
            boolean r1 = r1.isMutable()
            if (r1 != 0) goto L8d
            r4.u()
        L8d:
            apag r1 = r4.b
            aqdy r1 = (defpackage.aqdy) r1
            r1.e = r8
            apag r8 = r4.s()
            r8.getClass()
            aogy r1 = r7.f
            anky r2 = r7.d
            aqdy r8 = (defpackage.aqdy) r8
            java.lang.Object r1 = r1.d
            aptx r2 = r2.b()
            r1.a(r2)
            aogy r1 = r7.f
            r2 = 2
            r7.a = r2
            java.lang.Object r1 = r1.f
            ankt r1 = (defpackage.ankt) r1
            java.lang.Object r8 = r1.g(r8, r7)
            if (r8 != r0) goto Lb9
            return r0
        Lb9:
            return r8
        Lba:
            r8 = 0
            throw r8
        Lbc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anlk.b(java.lang.Object):java.lang.Object");
    }
}
