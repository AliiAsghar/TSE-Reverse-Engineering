package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoip {
    private final Context a;
    private String b;
    private String c;
    private int d;
    private int e = 0;

    public aoip(Context context) {
        this.a = context;
    }

    private final PackageInfo f(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package ".concat(e.toString()));
            return null;
        }
    }

    private final synchronized void g() {
        PackageInfo f = f(this.a.getPackageName());
        if (f != null) {
            this.b = Integer.toString(f.versionCode);
            this.c = f.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized int a() {
        PackageInfo f;
        if (this.d == 0 && (f = f("com.google.android.gms")) != null) {
            this.d = f.versionCode;
        }
        return this.d;
    }

    final synchronized int b() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") != -1) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                this.e = 2;
                return 2;
            }
            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
            this.e = 2;
            return 2;
        }
        Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
        return 0;
    }

    public final synchronized String c() {
        if (this.b == null) {
            g();
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized String d() {
        if (this.c == null) {
            g();
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        if (b() != 0) {
            return true;
        }
        return false;
    }
}
