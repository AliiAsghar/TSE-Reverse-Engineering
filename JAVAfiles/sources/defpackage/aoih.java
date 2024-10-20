package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.android.vcard.VCardConfig;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoih {
    private static final Object a = new Object();
    private static aojc b;

    public static acir a(Context context, Intent intent, boolean z) {
        aojc aojcVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (a) {
            if (b == null) {
                b = new aojc(context);
            }
            aojcVar = b;
        }
        int i = 1;
        if (z) {
            if (aois.a().c(context)) {
                synchronized (aoja.b) {
                    aoja.a(context);
                    boolean d = aoja.d(intent);
                    aoja.c(intent, true);
                    if (!d) {
                        aoja.c.a(aoja.a);
                    }
                    aojcVar.a(intent).q(new uyb(intent, 12));
                }
            } else {
                aojcVar.a(intent);
            }
            return actx.s(-1);
        }
        return aojcVar.a(intent).b(new aoil(i), new acca(10));
    }

    public static final acir b(final Intent intent, final Context context, Executor executor) {
        final boolean z;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        if ((intent.getFlags() & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (i >= 26 && !z) {
            return a(context, intent, false);
        }
        return actx.q(executor, new akoo(context, intent, 3)).d(executor, new acig() { // from class: aoig
            @Override // defpackage.acig
            public final Object a(acir acirVar) {
                if (((Integer) acirVar.h()).intValue() != 402) {
                    return acirVar;
                }
                boolean z2 = z;
                return aoih.a(context, intent, z2).b(new aoil(1), new acca(11));
            }
        });
    }
}
