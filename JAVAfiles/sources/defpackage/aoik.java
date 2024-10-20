package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoik {
    public final /* synthetic */ FirebaseMessaging a;
    private final aogn b;
    private boolean c;
    private Boolean d;
    private asqc e;

    public aoik(FirebaseMessaging firebaseMessaging, aogn aognVar) {
        this.a = firebaseMessaging;
        this.b = aognVar;
    }

    final synchronized void a() {
        Boolean bool;
        ApplicationInfo applicationInfo;
        if (!this.c) {
            Context a = this.a.c.a();
            SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                bool = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            } else {
                try {
                    PackageManager packageManager = a.getPackageManager();
                    if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                        bool = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                bool = null;
            }
            this.d = bool;
            if (bool == null) {
                asqc asqcVar = new asqc(this);
                this.e = asqcVar;
                this.b.b(aode.class, asqcVar);
            }
            this.c = true;
        }
    }

    public final synchronized boolean b() {
        boolean a;
        a();
        Boolean bool = this.d;
        if (bool != null) {
            a = bool.booleanValue();
        } else {
            aodi aodiVar = this.a.c;
            aodiVar.g();
            a = ((aoia) aodiVar.e.a()).a();
        }
        return a;
    }
}
