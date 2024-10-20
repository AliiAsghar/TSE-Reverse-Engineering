package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abnl implements alhr {
    private final /* synthetic */ int a;

    public /* synthetic */ abnl(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r1.importance >= 400) goto L18;
     */
    @Override // defpackage.alhr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get() {
        /*
            r7 = this;
            java.lang.String r0 = "PhenotypeProcessReaper"
            int r1 = r7.a
            r2 = 1
            switch(r1) {
                case 0: goto La4;
                case 1: goto L9f;
                case 2: goto L9a;
                case 3: goto L95;
                case 4: goto L90;
                case 5: goto L89;
                case 6: goto L85;
                case 7: goto L80;
                case 8: goto L7b;
                case 9: goto L60;
                case 10: goto L5a;
                case 11: goto L4b;
                case 12: goto L1c;
                case 13: goto L17;
                case 14: goto L11;
                default: goto L8;
            }
        L8:
            alhr r0 = defpackage.anig.a
            java.lang.String r0 = "libscytale_v2_jni.so"
            java.lang.String r0 = defpackage.amcw.a(r0)
            return r0
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L17:
            aiyg r0 = com.google.android.libraries.subscriptions.restore.G1Restore.defaultConfig()
            return r0
        L1c:
            android.app.ActivityManager$RunningAppProcessInfo r1 = new android.app.ActivityManager$RunningAppProcessInfo
            r1.<init>()
            r3 = 0
            android.app.ActivityManager.getMyMemoryState(r1)     // Catch: java.lang.RuntimeException -> L3f
            int r4 = r1.importance
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Memory state is: "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.i(r0, r4)
            int r0 = r1.importance
            r1 = 400(0x190, float:5.6E-43)
            if (r0 < r1) goto L45
            goto L46
        L3f:
            r1 = move-exception
            java.lang.String r2 = "Failed to retrieve memory state, not killing process."
            android.util.Log.w(r0, r2, r1)
        L45:
            r2 = r3
        L46:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L4b:
            acra r0 = new acra
            r1 = 6
            r0.<init>(r1)
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r0)
            aneo r0 = defpackage.albo.bC(r0)
            return r0
        L5a:
            asjb r0 = new asjb
            r0.<init>()
            return r0
        L60:
            boolean r0 = android.app.ActivityManager.isUserAMonkey()
            if (r0 == 0) goto L67
            goto L76
        L67:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L72
            boolean r2 = android.app.ActivityManager.isRunningInTestHarness()
            goto L76
        L72:
            boolean r2 = defpackage.aei$$ExternalSyntheticApiModelOutline0.m28m()
        L76:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L7b:
            algw r0 = defpackage.ahpl.a()
            return r0
        L80:
            java.lang.Boolean r0 = defpackage.a.by()
            return r0
        L85:
            java.lang.ThreadLocal r0 = defpackage.agoz.a
            r0 = 0
            return r0
        L89:
            java.lang.String r0 = "com/google/android/libraries/concurrent/monitoring/ThreadMonitoring"
            alvi r0 = defpackage.alvi.m(r0)
            return r0
        L90:
            abjc r0 = defpackage.aduv.a()
            return r0
        L95:
            java.lang.Boolean r0 = defpackage.a.bz()
            return r0
        L9a:
            java.lang.Boolean r0 = defpackage.a.bz()
            return r0
        L9f:
            java.lang.Boolean r0 = defpackage.a.bz()
            return r0
        La4:
            java.lang.Boolean r0 = defpackage.a.bz()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abnl.get():java.lang.Object");
    }
}
