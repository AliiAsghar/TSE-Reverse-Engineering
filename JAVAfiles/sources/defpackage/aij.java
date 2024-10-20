package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aij extends arpw implements arqv<drp, arpe<? super drp>, Object> {
    long a;
    int b;
    /* synthetic */ long c;
    final /* synthetic */ aii d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aij(aii aiiVar, arpe arpeVar) {
        super(2, arpeVar);
        this.d = aiiVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aij) c(new drp(((drp) obj).a), (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r13.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L14
            long r0 = r13.a
            long r2 = r13.c
            defpackage.aqil.P(r14)
            goto L68
        L14:
            long r1 = r13.a
            long r3 = r13.c
            defpackage.aqil.P(r14)
            goto L4b
        L1c:
            long r3 = r13.c
            defpackage.aqil.P(r14)
            goto L34
        L22:
            defpackage.aqil.P(r14)
            long r4 = r13.c
            aii r14 = r13.d
            cqa r14 = r14.f
            r13.b = r3
            java.lang.Object r14 = r14.e(r4, r13)
            if (r14 == r0) goto L7a
            r3 = r4
        L34:
            drp r14 = (defpackage.drp) r14
            long r5 = r14.a
            long r5 = defpackage.a.Q(r3, r5)
            aii r14 = r13.d
            r13.c = r3
            r13.a = r5
            r13.b = r2
            java.lang.Object r14 = r14.g(r5, r13)
            if (r14 == r0) goto L7a
            r1 = r5
        L4b:
            drp r14 = (defpackage.drp) r14
            long r11 = r14.a
            aii r14 = r13.d
            cqa r5 = r14.f
            long r6 = defpackage.a.Q(r1, r11)
            r13.c = r3
            r13.a = r11
            r14 = 3
            r13.b = r14
            r8 = r11
            r10 = r13
            java.lang.Object r14 = r5.d(r6, r8, r10)
            if (r14 == r0) goto L7a
            r2 = r3
            r0 = r11
        L68:
            drp r14 = (defpackage.drp) r14
            long r4 = r14.a
            long r0 = defpackage.a.Q(r0, r4)
            long r0 = defpackage.a.Q(r2, r0)
            drp r14 = new drp
            r14.<init>(r0)
            return r14
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aij.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        aij aijVar = new aij(this.d, arpeVar);
        aijVar.c = ((drp) obj).a;
        return aijVar;
    }
}
