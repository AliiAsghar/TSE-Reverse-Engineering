package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class qko extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    Object d;
    long e;
    int f;
    final /* synthetic */ asai g;
    final /* synthetic */ long h;
    final /* synthetic */ asaj i;
    final /* synthetic */ arqw j;
    private /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qko(asai asaiVar, long j, asaj asajVar, arqw arqwVar, arpe arpeVar) {
        super(2, arpeVar);
        this.g = asaiVar;
        this.h = j;
        this.i = asajVar;
        this.j = arqwVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qko) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00af  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00a6 -> B:4:0x00a7). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            arpl r1 = defpackage.arpl.a
            int r2 = r0.f
            if (r2 == 0) goto L23
            long r2 = r0.e
            java.lang.Object r4 = r0.d
            java.lang.Object r5 = r0.c
            java.lang.Object r6 = r0.b
            java.lang.Object r7 = r0.a
            java.lang.Object r8 = r0.k
            arrz r8 = (defpackage.arrz) r8
            defpackage.aqil.P(r20)
            r10 = r4
            r11 = r5
            r12 = r6
            r13 = r7
            r14 = r8
            r4 = r20
            r5 = r1
            goto La7
        L23:
            defpackage.aqil.P(r20)
            java.lang.Object r2 = r0.k
            arwe r2 = (defpackage.arwe) r2
            arrz r3 = new arrz
            r3.<init>()
            arrx r4 = new arrx
            r4.<init>()
            asai r5 = r0.g
            r6 = 0
            asai r5 = defpackage.armd.u(r5, r6)
            arzw r2 = defpackage.armd.t(r5, r2)
            long r5 = r0.h
            asaj r7 = r0.i
            arqw r8 = r0.j
            r12 = r2
            r14 = r3
            r13 = r4
            r2 = r5
            r11 = r7
            r10 = r8
        L4b:
            asgj r15 = new asgj
            arpi r4 = r19.u()
            r15.<init>(r4)
            asqe r9 = r12.D()
            qkn r8 = new qkn
            r7 = r13
            arrx r7 = (defpackage.arrx) r7
            r16 = 0
            r4 = r8
            r5 = r14
            r6 = r11
            r20 = r7
            r7 = r10
            r17 = r1
            r1 = r8
            r8 = r20
            r18 = r12
            r12 = r9
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9)
            r15.i(r12, r1)
            r1 = r20
            boolean r4 = r1.a
            if (r4 != 0) goto L8d
            int r4 = r14.a
            if (r4 > 0) goto L8d
            lvq r12 = new lvq
            r8 = 0
            r9 = 6
            r4 = r12
            r5 = r10
            r6 = r11
            r7 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            defpackage.arsd.ax(r15, r2, r12)
        L8d:
            r0.k = r14
            r0.a = r13
            r1 = r18
            r0.b = r1
            r0.c = r11
            r0.d = r10
            r0.e = r2
            r4 = 1
            r0.f = r4
            java.lang.Object r4 = defpackage.asgj.c(r15, r0)
            r5 = r17
            if (r4 == r5) goto Lb4
            r12 = r1
        La7:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r1 = r4.booleanValue()
            if (r1 == 0) goto Lb1
            r1 = r5
            goto L4b
        Lb1:
            arnb r1 = defpackage.arnb.a
            return r1
        Lb4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qko.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        qko qkoVar = new qko(this.g, this.h, this.i, this.j, arpeVar);
        qkoVar.k = obj;
        return qkoVar;
    }
}
