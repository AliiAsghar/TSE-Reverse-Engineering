package defpackage;

import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aedk implements aedd {
    private static final alvi a = alvi.m("com/google/android/libraries/abuse/hades/moirai/service/DispatchingClassificationService");
    private final aedd b;
    private final aedd c;
    private final ConcurrentHashMap d;
    private final ConcurrentHashMap e;

    public aedk(Optional optional, aeds aedsVar) {
        aedd aeddVar;
        armf armfVar = (armf) arsd.k(optional);
        if (armfVar != null) {
            aeddVar = (aedd) armfVar.b();
        } else {
            aeddVar = null;
        }
        this.b = aedsVar;
        this.c = aeddVar;
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
    }

    private final aedd f(aeda aedaVar) {
        if ((aedaVar instanceof aecz) && ((aecz) aedaVar).f != null) {
            aedd aeddVar = this.c;
            if (aeddVar == null) {
                throw new IllegalStateException("VM unavailable for loading protections");
            }
            return aeddVar;
        }
        return this.b;
    }

    private final Object g(aecj aecjVar, arpe arpeVar) {
        Object c;
        aedd aeddVar = (aedd) this.d.remove(aecjVar);
        if (aeddVar != null && (c = aeddVar.c(aecjVar, arpeVar)) == arpl.a) {
            return c;
        }
        return arnb.a;
    }

    private final asgm h(aecj aecjVar) {
        Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(this.e, aecjVar, new admk(aedh.a, 15));
        computeIfAbsent.getClass();
        return (asgm) computeIfAbsent;
    }

    @Override // defpackage.adzl
    public final Object a(arpe arpeVar) {
        return this.b.a(arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:24:0x0062, B:26:0x006a, B:29:0x0075, B:34:0x00a7, B:35:0x00ae), top: B:23:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[Catch: all -> 0x00af, TRY_ENTER, TryCatch #0 {all -> 0x00af, blocks: (B:24:0x0062, B:26:0x006a, B:29:0x0075, B:34:0x00a7, B:35:0x00ae), top: B:23:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.aedd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.aecj r12, defpackage.aech r13, defpackage.arpe r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.aedf
            if (r0 == 0) goto L13
            r0 = r14
            aedf r0 = (defpackage.aedf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aedf r0 = new aedf
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r12 = r0.a
            asgm r12 = (defpackage.asgm) r12
            defpackage.aqil.P(r14)     // Catch: java.lang.Throwable -> L2f
            goto La3
        L2f:
            r13 = move-exception
            goto Lb2
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3a:
            asgm r12 = r0.g
            aech r13 = r0.f
            aecj r2 = r0.e
            java.lang.Object r4 = r0.a
            aedk r4 = (defpackage.aedk) r4
            defpackage.aqil.P(r14)
            r14 = r12
            r12 = r2
            goto L62
        L4a:
            defpackage.aqil.P(r14)
            asgm r14 = r11.h(r12)
            r0.a = r11
            r0.e = r12
            r0.f = r13
            r0.g = r14
            r0.d = r4
            java.lang.Object r2 = r14.b(r0)
            if (r2 == r1) goto Lb6
            r4 = r11
        L62:
            j$.util.concurrent.ConcurrentHashMap r2 = r4.d     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r2 = r2.get(r12)     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto La7
            aedd r2 = (defpackage.aedd) r2     // Catch: java.lang.Throwable -> Laf
            aedd r4 = r4.b     // Catch: java.lang.Throwable -> Laf
            if (r2 != r4) goto L73
            java.lang.String r4 = "JNI"
            goto L75
        L73:
            java.lang.String r4 = "VM"
        L75:
            alvi r5 = defpackage.aedk.a     // Catch: java.lang.Throwable -> Laf
            alvw r5 = r5.g()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r6 = "com/google/android/libraries/abuse/hades/moirai/service/DispatchingClassificationService"
            java.lang.String r7 = "classify"
            java.lang.String r8 = "DispatchingClassificationService.kt"
            r9 = 73
            alvw r5 = r5.h(r6, r7, r9, r8)     // Catch: java.lang.Throwable -> Laf
            alvg r5 = (defpackage.alvg) r5     // Catch: java.lang.Throwable -> Laf
            java.lang.String r6 = "Classification begins - using backend: %s to classify"
            r5.t(r6, r4)     // Catch: java.lang.Throwable -> Laf
            r0.a = r14     // Catch: java.lang.Throwable -> Laf
            r4 = 0
            r0.e = r4     // Catch: java.lang.Throwable -> Laf
            r0.f = r4     // Catch: java.lang.Throwable -> Laf
            r0.g = r4     // Catch: java.lang.Throwable -> Laf
            r0.d = r3     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r12 = r2.b(r12, r13, r0)     // Catch: java.lang.Throwable -> Laf
            if (r12 != r1) goto La0
            goto Lb6
        La0:
            r10 = r14
            r14 = r12
            r12 = r10
        La3:
            r12.d()
            return r14
        La7:
            java.lang.String r12 = "No backend found for client."
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Laf
            r13.<init>(r12)     // Catch: java.lang.Throwable -> Laf
            throw r13     // Catch: java.lang.Throwable -> Laf
        Laf:
            r12 = move-exception
            r13 = r12
            r12 = r14
        Lb2:
            r12.d()
            throw r13
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aedk.b(aecj, aech, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r4.g(r2, r0) != r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r6v5, types: [arnb, java.lang.Object] */
    @Override // defpackage.aedd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.aecj r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aedg
            if (r0 == 0) goto L13
            r0 = r7
            aedg r0 = (defpackage.aedg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aedg r0 = new aedg
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.a
            asgm r6 = (defpackage.asgm) r6
            defpackage.aqil.P(r7)     // Catch: java.lang.Throwable -> L2e
            goto L6c
        L2e:
            r7 = move-exception
            goto L72
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            asgm r6 = r0.f
            aecj r2 = r0.e
            java.lang.Object r4 = r0.a
            aedk r4 = (defpackage.aedk) r4
            defpackage.aqil.P(r7)
            goto L5c
        L44:
            defpackage.aqil.P(r7)
            asgm r7 = r5.h(r6)
            r0.a = r5
            r0.e = r6
            r0.f = r7
            r0.d = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto L76
            r4 = r5
            r2 = r6
            r6 = r7
        L5c:
            r0.a = r6     // Catch: java.lang.Throwable -> L2e
            r7 = 0
            r0.e = r7     // Catch: java.lang.Throwable -> L2e
            r0.f = r7     // Catch: java.lang.Throwable -> L2e
            r0.d = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r4.g(r2, r0)     // Catch: java.lang.Throwable -> L2e
            if (r7 != r1) goto L6c
            goto L76
        L6c:
            r6.d()
            arnb r6 = defpackage.arnb.a
            return r6
        L72:
            r6.d()
            throw r7
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aedk.c(aecj, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r7 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:24:0x005c, B:26:0x0066, B:28:0x006f), top: B:23:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:24:0x005c, B:26:0x0066, B:28:0x006f), top: B:23:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.aedd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.aecj r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aedi
            if (r0 == 0) goto L13
            r0 = r8
            aedi r0 = (defpackage.aedi) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aedi r0 = new aedi
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.a
            asgm r7 = (defpackage.asgm) r7
            defpackage.aqil.P(r8)     // Catch: java.lang.Throwable -> L2e
            goto L7f
        L2e:
            r8 = move-exception
            goto L87
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            asgm r7 = r0.f
            aecj r2 = r0.e
            java.lang.Object r4 = r0.a
            aedk r4 = (defpackage.aedk) r4
            defpackage.aqil.P(r8)
            r8 = r7
            r7 = r2
            goto L5c
        L46:
            defpackage.aqil.P(r8)
            asgm r8 = r6.h(r7)
            r0.a = r6
            r0.e = r7
            r0.f = r8
            r0.d = r4
            java.lang.Object r2 = r8.b(r0)
            if (r2 == r1) goto L8b
            r4 = r6
        L5c:
            j$.util.concurrent.ConcurrentHashMap r2 = r4.d     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L83
            aedd r2 = (defpackage.aedd) r2     // Catch: java.lang.Throwable -> L83
            if (r2 != 0) goto L6f
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L83
        L6b:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L7f
        L6f:
            r0.a = r8     // Catch: java.lang.Throwable -> L83
            r4 = 0
            r0.e = r4     // Catch: java.lang.Throwable -> L83
            r0.f = r4     // Catch: java.lang.Throwable -> L83
            r0.d = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r7 = r2.d(r7, r0)     // Catch: java.lang.Throwable -> L83
            if (r7 != r1) goto L6b
            goto L8b
        L7f:
            r7.d()
            return r8
        L83:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L87:
            r7.d()
            throw r8
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aedk.d(aecj, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v7, types: [asgm] */
    @Override // defpackage.aedd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.aecj r7, defpackage.aeda r8, defpackage.arpe r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.aedj
            if (r0 == 0) goto L13
            r0 = r9
            aedj r0 = (defpackage.aedj) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            aedj r0 = new aedj
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.d
            arpl r1 = defpackage.arpl.a
            int r2 = r0.f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L69
            if (r2 == r5) goto L57
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r7 = r0.b
            aedd r7 = (defpackage.aedd) r7
            java.lang.Object r8 = r0.a
            asgm r8 = (defpackage.asgm) r8
            aecj r1 = r0.h
            aedk r0 = r0.g
            defpackage.aqil.P(r9)     // Catch: java.lang.Throwable -> L3a
            goto Lb0
        L3a:
            r7 = move-exception
            goto Lbd
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            java.lang.Object r7 = r0.c
            java.lang.Object r8 = r0.b
            asgm r8 = (defpackage.asgm) r8
            java.lang.Object r2 = r0.a
            aeda r2 = (defpackage.aeda) r2
            aecj r4 = r0.h
            aedk r5 = r0.g
            defpackage.aqil.P(r9)     // Catch: java.lang.Throwable -> L3a
            goto L9b
        L57:
            java.lang.Object r7 = r0.b
            asgm r7 = (defpackage.asgm) r7
            java.lang.Object r8 = r0.a
            aeda r8 = (defpackage.aeda) r8
            aecj r2 = r0.h
            aedk r5 = r0.g
            defpackage.aqil.P(r9)
            r9 = r7
            r7 = r2
            goto L81
        L69:
            defpackage.aqil.P(r9)
            asgm r9 = r6.h(r7)
            r0.g = r6
            r0.h = r7
            r0.a = r8
            r0.b = r9
            r0.f = r5
            java.lang.Object r2 = r9.b(r0)
            if (r2 == r1) goto Lc1
            r5 = r6
        L81:
            aedd r2 = r5.f(r8)     // Catch: java.lang.Throwable -> Lbb
            r0.g = r5     // Catch: java.lang.Throwable -> Lbb
            r0.h = r7     // Catch: java.lang.Throwable -> Lbb
            r0.a = r8     // Catch: java.lang.Throwable -> Lbb
            r0.b = r9     // Catch: java.lang.Throwable -> Lbb
            r0.c = r2     // Catch: java.lang.Throwable -> Lbb
            r0.f = r4     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r4 = r5.g(r7, r0)     // Catch: java.lang.Throwable -> Lbb
            if (r4 == r1) goto Lc1
            r4 = r7
            r7 = r2
            r2 = r8
            r8 = r9
        L9b:
            r0.g = r5     // Catch: java.lang.Throwable -> L3a
            r0.h = r4     // Catch: java.lang.Throwable -> L3a
            r0.a = r8     // Catch: java.lang.Throwable -> L3a
            r0.b = r7     // Catch: java.lang.Throwable -> L3a
            r9 = 0
            r0.c = r9     // Catch: java.lang.Throwable -> L3a
            r0.f = r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r9 = r7.e(r4, r2, r0)     // Catch: java.lang.Throwable -> L3a
            if (r9 == r1) goto Lc1
            r1 = r4
            r0 = r5
        Lb0:
            j$.util.concurrent.ConcurrentHashMap r9 = r0.d     // Catch: java.lang.Throwable -> L3a
            r9.put(r1, r7)     // Catch: java.lang.Throwable -> L3a
            r8.d()
            arnb r7 = defpackage.arnb.a
            return r7
        Lbb:
            r7 = move-exception
            r8 = r9
        Lbd:
            r8.d()
            throw r7
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aedk.e(aecj, aeda, arpe):java.lang.Object");
    }

    @Override // defpackage.aebo
    public final Object i(aecz aeczVar, arpe arpeVar) {
        return f(aeczVar).i(aeczVar, arpeVar);
    }
}
