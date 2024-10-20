package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqq {
    private static abqq b;
    private static volatile Set c;
    private static volatile Set d;
    public final Context a;
    private volatile String e;

    public abqq(Context context) {
        this.a = context.getApplicationContext();
    }

    public static abqq c(Context context) {
        abhg.m(context);
        synchronized (abqq.class) {
            if (b == null) {
                abqk.c(context);
                b = new abqq(context);
            }
        }
        return b;
    }

    static final abqg e(PackageInfo packageInfo, abqg... abqgVarArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            abqh abqhVar = new abqh(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < abqgVarArr.length; i++) {
                if (abqgVarArr[i].equals(abqhVar)) {
                    return abqgVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L2a
            if (r4 == 0) goto L28
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = r1
            goto L2a
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = r0
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = r4
        L2b:
            if (r4 == 0) goto L49
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L49
            if (r5 == 0) goto L3a
            abqg[] r4 = defpackage.abqj.a
            abqg r4 = e(r2, r4)
            goto L46
        L3a:
            abqg[] r4 = new defpackage.abqg[r0]
            abqg[] r5 = defpackage.abqj.a
            r5 = r5[r1]
            r4[r1] = r5
            abqg r4 = e(r2, r4)
        L46:
            if (r4 == 0) goto L49
            return r0
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abqq.f(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0124  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.abqm a(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abqq.a(java.lang.String):abqm");
    }

    public final abqm b(int i) {
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        abqm abqmVar = null;
        if (packagesForUid != null && (packagesForUid.length) != 0) {
            for (String str : packagesForUid) {
                abqmVar = a(str);
                if (abqmVar.b) {
                    return abqmVar;
                }
            }
            abhg.m(abqmVar);
            return abqmVar;
        }
        return new abqm(false, "no pkgs", null);
    }

    public final boolean d(int i) {
        abqm b2 = b(i);
        b2.b();
        return b2.b;
    }
}
