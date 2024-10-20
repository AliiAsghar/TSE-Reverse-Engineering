package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atem {
    private static final String a = "atem";
    private static atel b;

    private atem() {
    }

    public static atel a(Context context, atei ateiVar) {
        atel atelVar;
        ServiceInfo serviceInfo;
        Bundle bundle;
        Bundle bundle2;
        synchronized (atem.class) {
            if (b == null && Build.VERSION.SDK_INT >= 30) {
                boolean z = true;
                if (ateiVar != atei.CRONET_SOURCE_PLATFORM && ateiVar != atei.CRONET_SOURCE_PLAY_SERVICES) {
                    z = false;
                }
                Context applicationContext = context.getApplicationContext();
                synchronized (aten.a) {
                    if (applicationContext != aten.b) {
                        try {
                            serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                            serviceInfo = null;
                        }
                        if (serviceInfo != null && serviceInfo.metaData != null) {
                            bundle = serviceInfo.metaData;
                        } else {
                            bundle = new Bundle();
                        }
                        aten.c = bundle;
                        aten.b = applicationContext;
                    }
                    bundle2 = aten.c;
                }
                if (bundle2.getBoolean("android.net.http.EnableTelemetry", z)) {
                    try {
                        b = new atfq();
                    } catch (Exception e) {
                        Log.e(a, "Exception creating an instance of CronetLoggerImpl", e);
                    }
                }
            }
            if (b == null) {
                b = new atfi();
            }
            atelVar = b;
        }
        return atelVar;
    }
}
