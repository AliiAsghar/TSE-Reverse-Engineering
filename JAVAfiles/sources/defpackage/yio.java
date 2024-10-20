package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yio {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionTypesFlags");
    private final arml b;

    public yio(armf armfVar) {
        armfVar.getClass();
        this.b = armd.a(new tzt(13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (r2.equals("UNKNOWN") != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Set g(java.lang.String r9) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.List r9 = defpackage.ytd.d(r9)
            java.util.Iterator r9 = r9.iterator()
        Ld:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto Lc4
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            int r2 = r1.length()
            if (r2 <= 0) goto Ld
            r2 = 58
            anna r2 = defpackage.anna.e(r2)     // Catch: java.lang.IllegalArgumentException -> L9b
            java.util.List r2 = r2.c(r1)     // Catch: java.lang.IllegalArgumentException -> L9b
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.IllegalArgumentException -> L9b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.IllegalArgumentException -> L9b
            int r5 = r2.size()     // Catch: java.lang.IllegalArgumentException -> L9b
            r6 = 1
            if (r5 <= r6) goto L83
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.IllegalArgumentException -> L9b
            r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L9b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.IllegalArgumentException -> L9b
            int r5 = r2.hashCode()     // Catch: java.lang.IllegalArgumentException -> L9b
            r7 = 2044801(0x1f3381, float:2.865377E-39)
            r8 = 2
            if (r5 == r7) goto L6b
            r7 = 433141802(0x19d1382a, float:2.1632778E-23)
            if (r5 == r7) goto L62
            r3 = 2013139542(0x77fe1256, float:1.03063695E34)
            if (r5 == r3) goto L58
            goto L75
        L58:
            java.lang.String r3 = "DEVICE"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L75
            r3 = r8
            goto L76
        L62:
            java.lang.String r5 = "UNKNOWN"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L75
            goto L76
        L6b:
            java.lang.String r3 = "BOTH"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L75
            r3 = r6
            goto L76
        L75:
            r3 = -1
        L76:
            if (r3 == 0) goto L83
            if (r3 == r6) goto L83
            if (r3 != r8) goto L7d
            goto L83
        L7d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L9b
            r2.<init>()     // Catch: java.lang.IllegalArgumentException -> L9b
            throw r2     // Catch: java.lang.IllegalArgumentException -> L9b
        L83:
            r4.getClass()     // Catch: java.lang.IllegalArgumentException -> L9b
            aqbc r2 = defpackage.aqbc.c(r4)     // Catch: java.lang.IllegalArgumentException -> L9b
            aqbc r3 = defpackage.aqbc.UNKNOWN_SUGGESTION_TYPE     // Catch: java.lang.IllegalArgumentException -> L9b
            if (r2 == r3) goto L93
            r0.add(r2)     // Catch: java.lang.IllegalArgumentException -> L9b
            goto Ld
        L93:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L9b
            java.lang.String r3 = "Unknown Suggestion Type found"
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L9b
            throw r2     // Catch: java.lang.IllegalArgumentException -> L9b
        L9b:
            r2 = move-exception
            alvi r3 = defpackage.yio.a
            alvw r3 = r3.h()
            alvz r4 = defpackage.alwp.a
            java.lang.String r5 = "Bugle"
            r3.X(r4, r5)
            alvg r3 = (defpackage.alvg) r3
            alvw r2 = r3.g(r2)
            java.lang.String r3 = "parseSuggestionTypes"
            r4 = 171(0xab, float:2.4E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionTypesFlags"
            java.lang.String r6 = "SmartSuggestionTypesFlags.kt"
            alvw r2 = r2.h(r5, r3, r4, r6)
            alvg r2 = (defpackage.alvg) r2
            java.lang.String r3 = "SmartSuggestionConfigUtils: Unknown suggestion type %s"
            r2.t(r3, r1)
            goto Ld
        Lc4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yio.g(java.lang.String):java.util.Set");
    }

    public final boolean a() {
        return f(aqbc.CALENDAR);
    }

    public final boolean b() {
        return f(aqbc.DUO_CALL);
    }

    public final boolean c() {
        return f(aqbc.GIF);
    }

    public final boolean d() {
        return f(aqbc.LOCATION);
    }

    public final boolean e() {
        return f(aqbc.RECENT_IMAGE);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Set, java.lang.Object] */
    public final boolean f(aqbc aqbcVar) {
        if (!h().b.contains(aqbcVar) && !h().a.contains(aqbcVar)) {
            return false;
        }
        return true;
    }

    public final znj h() {
        return (znj) this.b.a();
    }
}
