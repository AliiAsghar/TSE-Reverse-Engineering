package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzv {
    private static final String a = gsy.b("PackageManagerHelper");

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        defpackage.gsy.a().c(defpackage.gzv.a, "Skipping component enablement for " + r8.getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r7, java.lang.Class r8, boolean r9) {
        /*
            java.lang.String r0 = "disabled"
            java.lang.String r1 = "enabled"
            java.lang.String r2 = "Skipping component enablement for "
            r3 = 1
            java.lang.String r4 = r8.getName()     // Catch: java.lang.Exception -> L77
            android.content.pm.PackageManager r5 = r7.getPackageManager()     // Catch: java.lang.Exception -> L77
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch: java.lang.Exception -> L77
            r6.<init>(r7, r4)     // Catch: java.lang.Exception -> L77
            int r4 = r5.getComponentEnabledSetting(r6)     // Catch: java.lang.Exception -> L77
            r5 = 0
            if (r4 != 0) goto L1c
            goto L1f
        L1c:
            if (r4 != r3) goto L1f
            r5 = r3
        L1f:
            if (r9 != r5) goto L3b
            gsy r7 = defpackage.gsy.a()     // Catch: java.lang.Exception -> L77
            java.lang.String r4 = defpackage.gzv.a     // Catch: java.lang.Exception -> L77
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L77
            r5.<init>(r2)     // Catch: java.lang.Exception -> L77
            java.lang.String r2 = r8.getName()     // Catch: java.lang.Exception -> L77
            r5.append(r2)     // Catch: java.lang.Exception -> L77
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Exception -> L77
            r7.c(r4, r2)     // Catch: java.lang.Exception -> L77
            return
        L3b:
            android.content.pm.PackageManager r2 = r7.getPackageManager()     // Catch: java.lang.Exception -> L77
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Exception -> L77
            java.lang.String r5 = r8.getName()     // Catch: java.lang.Exception -> L77
            r4.<init>(r7, r5)     // Catch: java.lang.Exception -> L77
            if (r3 == r9) goto L4c
            r7 = 2
            goto L4d
        L4c:
            r7 = r3
        L4d:
            r2.setComponentEnabledSetting(r4, r7, r3)     // Catch: java.lang.Exception -> L77
            gsy r7 = defpackage.gsy.a()     // Catch: java.lang.Exception -> L77
            java.lang.String r2 = defpackage.gzv.a     // Catch: java.lang.Exception -> L77
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L77
            r4.<init>()     // Catch: java.lang.Exception -> L77
            java.lang.String r5 = r8.getName()     // Catch: java.lang.Exception -> L77
            r4.append(r5)     // Catch: java.lang.Exception -> L77
            java.lang.String r5 = " "
            r4.append(r5)     // Catch: java.lang.Exception -> L77
            if (r9 == 0) goto L6b
            r5 = r1
            goto L6c
        L6b:
            r5 = r0
        L6c:
            r4.append(r5)     // Catch: java.lang.Exception -> L77
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L77
            r7.c(r2, r4)     // Catch: java.lang.Exception -> L77
            return
        L77:
            r7 = move-exception
            gsy r2 = defpackage.gsy.a()
            java.lang.String r4 = defpackage.gzv.a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = r8.getName()
            r5.append(r8)
            java.lang.String r8 = "could not be "
            r5.append(r8)
            if (r3 == r9) goto L92
            goto L93
        L92:
            r0 = r1
        L93:
            r5.append(r0)
            java.lang.String r8 = r5.toString()
            r2.d(r4, r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gzv.a(android.content.Context, java.lang.Class, boolean):void");
    }
}
