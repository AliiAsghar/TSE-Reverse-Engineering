package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayk extends arpv implements arqv<cqg, arpe<? super arnb>, Object> {
    Object a;
    int b;
    final /* synthetic */ ays c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayk(ays aysVar, arpe arpeVar) {
        super(arpeVar);
        this.c = aysVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayk) c((cqg) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0043 -> B:5:0x0046). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r11.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L14
            java.lang.Object r1 = r11.a
            java.lang.Object r3 = r11.d
            cqg r3 = (defpackage.cqg) r3
            defpackage.aqil.P(r12)
            goto L46
        L14:
            java.lang.Object r1 = r11.d
            cqg r1 = (defpackage.cqg) r1
            defpackage.aqil.P(r12)
            goto L2e
        L1c:
            defpackage.aqil.P(r12)
            java.lang.Object r12 = r11.d
            r1 = r12
            cqg r1 = (defpackage.cqg) r1
            r11.d = r1
            r11.b = r3
            java.lang.Object r12 = defpackage.aik.j(r1, r11, r2)
            if (r12 == r0) goto L74
        L2e:
            ays r3 = r11.c
            crc r12 = (defpackage.crc) r12
            long r4 = r12.c
            r3.f()
            r3 = r1
            r1 = r12
        L39:
            r11.d = r3
            r11.a = r1
            r11.b = r2
            java.lang.Object r12 = defpackage.cqf.a(r3, r11)
            if (r12 != r0) goto L46
            return r0
        L46:
            cqq r12 = (defpackage.cqq) r12
            java.util.List r12 = r12.a
            int r4 = r12.size()
            r5 = 0
        L4f:
            if (r5 >= r4) goto L6c
            java.lang.Object r6 = r12.get(r5)
            crc r6 = (defpackage.crc) r6
            long r7 = r6.a
            r9 = r1
            crc r9 = (defpackage.crc) r9
            long r9 = r9.a
            boolean r7 = defpackage.a.bB(r7, r9)
            if (r7 == 0) goto L69
            boolean r6 = r6.d
            if (r6 == 0) goto L69
            goto L39
        L69:
            int r5 = r5 + 1
            goto L4f
        L6c:
            ays r12 = r11.c
            r12.e()
            arnb r12 = defpackage.arnb.a
            return r12
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        ayk aykVar = new ayk(this.c, arpeVar);
        aykVar.d = obj;
        return aykVar;
    }
}
