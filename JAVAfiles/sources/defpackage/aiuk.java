package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiuk implements aiul {
    private static final String a = "aiul";

    @Override // defpackage.aiul
    public final void a(atal atalVar) {
        Context context;
        try {
            Object obj = atalVar.b;
            d.aC(obj, "Context must not be null");
            abqp.c((Context) obj, 11925000);
            long uptimeMillis = SystemClock.uptimeMillis();
            synchronized (achr.a) {
                Context context2 = null;
                if (!achr.b) {
                    try {
                        context = DynamiteModule.c((Context) obj, DynamiteModule.b, "com.google.android.gms.providerinstaller.dynamite").c;
                    } catch (abya e) {
                        Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                        context = null;
                    }
                    if (context != null) {
                        achr.a(context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                        return;
                    }
                }
                boolean z = achr.b;
                Context b = abqp.b((Context) obj);
                if (b != null) {
                    achr.b = true;
                    if (!z) {
                        try {
                            abgj.t(b.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", new acak(Context.class, obj), acak.p(uptimeMillis), acak.p(SystemClock.uptimeMillis()));
                        } catch (Exception e2) {
                            Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e2.toString()));
                        }
                    }
                    context2 = b;
                }
                if (context2 != null) {
                    achr.a(context2, "com.google.android.gms.common.security.ProviderInstallerImpl");
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new abqn(8);
                }
            }
        } catch (abqn e3) {
            Log.e(a, "Attempted to use SSL unpatched. Google Play Services unavailable.", e3);
            abqa.a.c((Context) atalVar.b, e3.a);
            int i = atalVar.a;
            throw new IOException("Blocked unpatched use of SSL stack.", e3);
        } catch (abqo e4) {
            abqa.a.c((Context) atalVar.b, e4.a);
            int i2 = atalVar.a;
            throw new IOException("Attempted to use SSL unpatched. Google Play Services needs update.", e4);
        }
    }
}
