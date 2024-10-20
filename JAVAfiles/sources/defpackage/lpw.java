package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpw implements lpp {
    private static final alwo a = alwo.o("BugleNudge");
    private final lpo b;
    private final xnv c;
    private final nei d;
    private final iql e;
    private final vyv f;

    public lpw(lpo lpoVar, nei neiVar, xnv xnvVar, vyv vyvVar, iql iqlVar) {
        neiVar.getClass();
        xnvVar.getClass();
        this.b = lpoVar;
        this.d = neiVar;
        this.c = xnvVar;
        this.f = vyvVar;
        this.e = iqlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
    
        if (r1 == r3) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010d A[LOOP:0: B:27:0x0107->B:29:0x010d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ff -> B:26:0x0101). Please report as a decompilation issue!!! */
    @Override // defpackage.lpp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r19) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpw.a(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
    
        if (defpackage.arnb.a == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v19, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r8) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpw.b(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.Map r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.lpu
            if (r0 == 0) goto L13
            r0 = r8
            lpu r0 = (defpackage.lpu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lpu r0 = new lpu
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3d
            if (r2 == r3) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r7 = r0.a
            lpw r2 = r0.e
            defpackage.aqil.P(r8)
            goto L53
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            lpw r7 = r0.e
            defpackage.aqil.P(r8)
            r2 = r7
            goto L4d
        L3d:
            defpackage.aqil.P(r8)
            nei r8 = r6.d
            r0.e = r6
            r0.d = r3
            java.lang.Object r8 = r8.c(r7, r0)
            if (r8 == r1) goto L7c
            r2 = r6
        L4d:
            alpt r8 = (defpackage.alpt) r8
            java.util.Iterator r7 = r8.iterator()
        L53:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L79
            java.lang.Object r8 = r7.next()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r8
            iql r3 = r2.e
            r8.getClass()
            r0.e = r2
            r0.a = r7
            r0.d = r4
            qhy r5 = defpackage.qhy.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY
            java.lang.Object r8 = r3.c(r8, r4, r5, r0)
            arpl r3 = defpackage.arpl.a
            if (r8 == r3) goto L76
            arnb r8 = defpackage.arnb.a
        L76:
            if (r8 != r1) goto L53
            return r1
        L79:
            arnb r7 = defpackage.arnb.a
            return r7
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpw.c(java.util.Map, arpe):java.lang.Object");
    }
}
