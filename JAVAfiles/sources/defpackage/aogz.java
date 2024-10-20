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
public final class aogz {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public aogz(alcn alcnVar) {
        this.d = null;
        this.a = 0;
        this.e = null;
        this.b = 0;
        this.c = alcnVar;
    }

    private final PackageInfo e(String str) {
        try {
            return ((Context) this.c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseInstanceId", "Failed to find package ".concat(e.toString()));
            return null;
        }
    }

    private final synchronized void f() {
        PackageInfo e = e(((Context) this.c).getPackageName());
        if (e != null) {
            this.d = Integer.toString(e.versionCode);
            this.e = e.versionName;
        }
    }

    public final synchronized int a() {
        PackageInfo e;
        if (this.a == 0 && (e = e("com.google.android.gms")) != null) {
            this.a = e.versionCode;
        }
        return this.a;
    }

    public final synchronized int b() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = ((Context) this.c).getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") != -1) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                this.b = 2;
                return 2;
            }
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            this.b = 2;
            return 2;
        }
        Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
        return 0;
    }

    public final synchronized String c() {
        if (this.d == null) {
            f();
        }
        return (String) this.d;
    }

    public final synchronized String d() {
        if (this.e == null) {
            f();
        }
        return (String) this.e;
    }

    public aogz(Context context) {
        this.b = 0;
        this.c = context;
    }
}
