package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import defpackage.ggh;
import defpackage.ggj;
import defpackage.ggk;
import defpackage.nq;
import defpackage.sp;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    static void a(int i, ggj ggjVar) {
        Process.sendSignal(i, 10);
        ggjVar.a(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        Context createDeviceProtectedStorageContext;
        File codeCacheDir;
        Context createDeviceProtectedStorageContext2;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                ggk.b(context, new sp(4), new ggh(this), true);
                return;
            }
            if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        ggh gghVar = new ggh(this);
                        try {
                            ggk.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            ggk.c(gghVar, 10, null);
                            return;
                        } catch (PackageManager.NameNotFoundException e) {
                            ggk.c(gghVar, 7, e);
                            return;
                        }
                    }
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        ggh gghVar2 = new ggh(this);
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        ggk.c(gghVar2, 11, null);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                a(Process.myPid(), new ggh(this));
                return;
            }
            if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                ggh gghVar3 = new ggh(this);
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        createDeviceProtectedStorageContext2 = context.createDeviceProtectedStorageContext();
                        codeCacheDir = createDeviceProtectedStorageContext2.getCacheDir();
                    } else {
                        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                        codeCacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
                    }
                    if (nq.R(codeCacheDir)) {
                        gghVar3.a(14, null);
                        return;
                    } else {
                        gghVar3.a(15, null);
                        return;
                    }
                }
                if ("SAVE_PROFILE".equals(string2)) {
                    a(extras.getInt("EXTRA_PID", Process.myPid()), gghVar3);
                } else {
                    gghVar3.a(16, null);
                }
            }
        }
    }
}
