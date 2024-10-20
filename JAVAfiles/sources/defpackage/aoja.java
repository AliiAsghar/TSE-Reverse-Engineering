package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoja {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();
    public static acie c;

    public static void a(Context context) {
        if (c == null) {
            acie acieVar = new acie(context);
            c = acieVar;
            synchronized (acieVar.a) {
                acieVar.c = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (b) {
            if (c != null && d(intent)) {
                c(intent, false);
                acie acieVar = c;
                if (acieVar.f.decrementAndGet() < 0) {
                    acex acexVar = acie.h;
                    acex.d("%s release without a matched acquire!", acieVar.d);
                }
                synchronized (acieVar.a) {
                    acieVar.d();
                    if (acieVar.e.containsKey(null)) {
                        arjs arjsVar = (arjs) acieVar.e.get(null);
                        if (arjsVar != null) {
                            int i = arjsVar.a - 1;
                            arjsVar.a = i;
                            if (i == 0) {
                                acieVar.e.remove(null);
                            }
                        }
                    } else {
                        Log.w("WakeLock", acieVar.d + " counter does not exist");
                    }
                    acieVar.e();
                }
            }
        }
    }

    public static void c(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }
}
