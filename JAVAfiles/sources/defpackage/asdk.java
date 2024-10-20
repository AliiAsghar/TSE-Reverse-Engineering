package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class asdk extends asdj {
    public final asai d;

    public asdk(asai asaiVar, arpi arpiVar, int i, int i2) {
        super(arpiVar, i, i2);
        this.d = asaiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r5 == defpackage.arpl.a) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r5 == defpackage.arpl.a) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r5 == defpackage.arpl.a) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0061, code lost:
    
        return defpackage.arnb.a;
     */
    @Override // defpackage.asdj, defpackage.asai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.asaj r5, defpackage.arpe r6) {
        /*
            r4 = this;
            int r0 = r4.b
            r1 = -3
            if (r0 != r1) goto L56
            arpi r0 = r6.u()
            arpi r1 = r4.a
            arpi r1 = defpackage.arwa.a(r0, r1)
            boolean r2 = defpackage.d.F(r1, r0)
            if (r2 == 0) goto L1e
            java.lang.Object r5 = r4.g(r5, r6)
            arpl r6 = defpackage.arpl.a
            if (r5 != r6) goto L5f
            goto L5e
        L1e:
            akty r2 = defpackage.arpf.k
            arpg r2 = r1.get(r2)
            akty r3 = defpackage.arpf.k
            arpg r0 = r0.get(r3)
            boolean r0 = defpackage.d.F(r2, r0)
            if (r0 == 0) goto L56
            arpi r0 = r6.u()
            boolean r2 = r5 instanceof defpackage.asec
            if (r2 != 0) goto L42
            boolean r2 = r5 instanceof defpackage.asdx
            if (r2 != 0) goto L42
            asef r2 = new asef
            r2.<init>(r5, r0)
            r5 = r2
        L42:
            akgp r0 = new akgp
            r2 = 0
            r3 = 7
            r0.<init>(r4, r2, r3)
            java.lang.Object r2 = defpackage.asfq.a(r1)
            java.lang.Object r5 = defpackage.arrn.O(r1, r5, r2, r0, r6)
            arpl r6 = defpackage.arpl.a
            if (r5 != r6) goto L5f
            goto L5e
        L56:
            java.lang.Object r5 = defpackage.asdj.h(r4, r5, r6)
            arpl r6 = defpackage.arpl.a
            if (r5 != r6) goto L5f
        L5e:
            return r5
        L5f:
            arnb r5 = defpackage.arnb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asdk.a(asaj, arpe):java.lang.Object");
    }

    @Override // defpackage.asdj
    public final Object b(arzu arzuVar, arpe arpeVar) {
        Object g = g(new asec(arzuVar), arpeVar);
        if (g == arpl.a) {
            return g;
        }
        return arnb.a;
    }

    public abstract Object g(asaj asajVar, arpe arpeVar);

    @Override // defpackage.asdj
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
