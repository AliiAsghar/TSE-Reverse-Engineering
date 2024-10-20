package defpackage;

import j$.time.Instant;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjq extends arpw implements arqr {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    final /* synthetic */ afjs f;
    final /* synthetic */ Iterable g;
    final /* synthetic */ Instant h;
    final /* synthetic */ afiu i;
    final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afjq(afjs afjsVar, Iterable iterable, Instant instant, afiu afiuVar, int i, arpe arpeVar) {
        super(1, arpeVar);
        this.f = afjsVar;
        this.g = iterable;
        this.h = instant;
        this.i = afiuVar;
        this.j = i;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new afjq(this.f, this.g, this.h, this.i, this.j, (arpe) obj).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        if (r9 == false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:5:0x0062, B:7:0x0066, B:9:0x006a, B:11:0x0072, B:13:0x007e, B:14:0x0084, B:19:0x006e), top: B:4:0x0062 }] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r8.e
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/libraries/compose/core/data/usage/FrecencyProcessor$computeFrecent$2"
            java.lang.String r4 = "FrecencyProcessor.kt"
            if (r1 == 0) goto L18
            int r0 = r8.d
            java.lang.Object r1 = r8.c
            java.lang.Object r5 = r8.b
            java.lang.Object r6 = r8.a
            defpackage.aqil.P(r9)
            goto L62
        L18:
            defpackage.aqil.P(r9)
            afjs r9 = r8.f
            java.lang.Iterable r1 = r8.g
            j$.time.Instant r5 = r8.h
            afiu r6 = r8.i
            afjp r7 = new afjp
            r7.<init>(r1, r9, r5, r6)
            afke r9 = r9.c
            java.lang.String r1 = "FrecencyProcessor#computeFrecencyScores"
            java.lang.Object r9 = r9.d(r1, r7)
            r6 = r9
            java.util.Map r6 = (java.util.Map) r6
            alvi r9 = defpackage.afjs.a
            alvw r9 = r9.e()
            r1 = 55
            alvw r9 = r9.h(r3, r2, r1, r4)
            alvg r9 = (defpackage.alvg) r9
            int r1 = r6.size()
            java.lang.String r5 = "Number of scores: %x"
            r9.r(r5, r1)
            afjs r1 = r8.f
            int r9 = r8.j
            r8.a = r6
            asgm r5 = r1.f
            r8.b = r5
            r8.c = r1
            r8.d = r9
            r7 = 1
            r8.e = r7
            java.lang.Object r7 = r5.b(r8)
            if (r7 == r0) goto Lb6
            r0 = r9
        L62:
            boolean r9 = r6 instanceof java.util.Map     // Catch: java.lang.Throwable -> Laf
            if (r9 == 0) goto L6e
            boolean r9 = r6 instanceof defpackage.arse     // Catch: java.lang.Throwable -> Laf
            if (r9 == 0) goto L72
            boolean r9 = r6 instanceof defpackage.arsi     // Catch: java.lang.Throwable -> Laf
            if (r9 != 0) goto L72
        L6e:
            java.util.Map r6 = defpackage.aqjn.s(r6)     // Catch: java.lang.Throwable -> Laf
        L72:
            r9 = r1
            afjs r9 = (defpackage.afjs) r9     // Catch: java.lang.Throwable -> Laf
            r9.e = r6     // Catch: java.lang.Throwable -> Laf
            r9 = r1
            afjs r9 = (defpackage.afjs) r9     // Catch: java.lang.Throwable -> Laf
            java.util.Map r9 = r9.e     // Catch: java.lang.Throwable -> Laf
            if (r9 != 0) goto L84
            java.lang.String r9 = "scores"
            defpackage.arro.b(r9)     // Catch: java.lang.Throwable -> Laf
            r9 = 0
        L84:
            afjs r1 = (defpackage.afjs) r1     // Catch: java.lang.Throwable -> Laf
            artx r9 = r1.d(r9, r0)     // Catch: java.lang.Throwable -> Laf
            asgm r5 = (defpackage.asgm) r5
            r5.d()
            alvi r0 = defpackage.afjs.a
            alvw r0 = r0.e()
            r1 = 62
            alvw r0 = r0.h(r3, r2, r1, r4)
            alvg r0 = (defpackage.alvg) r0
            java.util.Iterator r1 = r9.a()
            boolean r1 = r1.hasNext()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "Has computed frecents: %b"
            r0.t(r2, r1)
            return r9
        Laf:
            r9 = move-exception
            asgm r5 = (defpackage.asgm) r5
            r5.d()
            throw r9
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afjq.b(java.lang.Object):java.lang.Object");
    }
}
