package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjs {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/core/data/usage/FrecencyProcessor");
    public final anca b;
    public final afke c;
    public final arqr d;
    public Map e;
    public final asgm f = new asgm();
    private final afka g;

    public afjs(anca ancaVar, afke afkeVar, afka afkaVar, arqr arqrVar) {
        this.b = ancaVar;
        this.c = afkeVar;
        this.g = afkaVar;
        this.d = arqrVar;
    }

    public final double a(afjz afjzVar, Instant instant, afiu afiuVar) {
        double d;
        if (d.F(afjzVar.a(), afiuVar)) {
            d = this.g.a;
        } else {
            d = this.g.b;
        }
        Duration.between(afjzVar.b(), instant).getClass();
        return d * Math.pow(0.95d, Math.sqrt(r5.toMillis() / this.g.c.toMillis()) + 1.0d) * 5.0d;
    }

    public final Object b(Iterable iterable, Instant instant, afiu afiuVar, int i, arpe arpeVar) {
        return this.c.c("FrecencyProcessor#computeFrecent", new afjq(this, iterable, instant, afiuVar, i, null), arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[Catch: all -> 0x00af, TRY_ENTER, TryCatch #0 {all -> 0x00af, blocks: (B:12:0x0076, B:15:0x0083, B:16:0x0087, B:18:0x008d, B:19:0x0097, B:21:0x00a2, B:22:0x00a7), top: B:11:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:12:0x0076, B:15:0x0083, B:16:0x0087, B:18:0x008d, B:19:0x0097, B:21:0x00a2, B:22:0x00a7), top: B:11:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2 A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:12:0x0076, B:15:0x0083, B:16:0x0087, B:18:0x008d, B:19:0x0097, B:21:0x00a2, B:22:0x00a7), top: B:11:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.afjz r8, j$.time.Instant r9, defpackage.afiu r10, int r11, defpackage.arpe r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.afjr
            if (r0 == 0) goto L13
            r0 = r12
            afjr r0 = (defpackage.afjr) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            afjr r0 = new afjr
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.c
            arpl r0 = defpackage.arpl.a
            int r1 = r6.e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L44
            if (r1 == r3) goto L40
            if (r1 != r2) goto L38
            double r8 = r6.b
            int r11 = r6.a
            asgm r10 = r6.g
            afjz r0 = r6.h
            afjs r1 = r6.f
            defpackage.aqil.P(r12)
            r12 = r10
            r9 = r8
            r8 = r0
            goto L76
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            defpackage.aqil.P(r12)
            goto L5c
        L44:
            defpackage.aqil.P(r12)
            java.util.Map r12 = r7.e
            if (r12 != 0) goto L5d
            java.util.List r2 = defpackage.aqjn.y(r8)
            r6.e = r3
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r12 = r1.b(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L5c
            return r0
        L5c:
            return r12
        L5d:
            double r9 = r7.a(r8, r9, r10)
            asgm r12 = r7.f
            r6.f = r7
            r6.h = r8
            r6.g = r12
            r6.a = r11
            r6.b = r9
            r6.e = r2
            java.lang.Object r1 = r12.b(r6)
            if (r1 == r0) goto Lb4
            r1 = r7
        L76:
            arqr r0 = r1.d     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r8 = r0.a(r8)     // Catch: java.lang.Throwable -> Laf
            java.util.Map r0 = r1.e     // Catch: java.lang.Throwable -> Laf
            r2 = 0
            java.lang.String r3 = "scores"
            if (r0 != 0) goto L87
            defpackage.arro.b(r3)     // Catch: java.lang.Throwable -> Laf
            r0 = r2
        L87:
            java.lang.Object r4 = r0.get(r8)     // Catch: java.lang.Throwable -> Laf
            if (r4 != 0) goto L97
            afjo r4 = new afjo     // Catch: java.lang.Throwable -> Laf
            r5 = 0
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> Laf
            r0.put(r8, r4)     // Catch: java.lang.Throwable -> Laf
        L97:
            afjo r4 = (defpackage.afjo) r4     // Catch: java.lang.Throwable -> Laf
            double r5 = r4.b     // Catch: java.lang.Throwable -> Laf
            double r5 = r5 + r9
            r4.b = r5     // Catch: java.lang.Throwable -> Laf
            java.util.Map r8 = r1.e     // Catch: java.lang.Throwable -> Laf
            if (r8 != 0) goto La6
            defpackage.arro.b(r3)     // Catch: java.lang.Throwable -> Laf
            goto La7
        La6:
            r2 = r8
        La7:
            artx r8 = r1.d(r2, r11)     // Catch: java.lang.Throwable -> Laf
            r12.d()
            return r8
        Laf:
            r8 = move-exception
            r12.d()
            throw r8
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afjs.c(afjz, j$.time.Instant, afiu, int, arpe):java.lang.Object");
    }

    public final artx d(Map map, int i) {
        return (artx) this.c.d("FrecencyProcessor#topEntityFrecencies", new aems(i, map, 7));
    }
}
