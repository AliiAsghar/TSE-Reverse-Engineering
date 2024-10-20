package com.google.android.ims.receiver.sip;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.acok;
import defpackage.adod;
import defpackage.adtd;
import defpackage.adtw;
import defpackage.aduu;
import defpackage.advr;
import defpackage.egl;
import defpackage.xyl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DebugOptionsReceiver extends adtd<Void> {
    private static boolean a = false;
    private static final DebugOptionsReceiver b = new DebugOptionsReceiver();
    private static adod c;
    private static aduu d;

    public static synchronized void a(Context context, adod adodVar, aduu aduuVar) {
        synchronized (DebugOptionsReceiver.class) {
            if (!a) {
                egl.h(context, b, new IntentFilter(RcsIntents.ACTION_DEBUG_OPTION_INCREASE_SESSION_ID));
                c = adodVar;
                d = aduuVar;
                a = true;
            }
        }
    }

    public static synchronized void b(Context context) {
        synchronized (DebugOptionsReceiver.class) {
            if (a) {
                context.unregisterReceiver(b);
                c = null;
                d = null;
                a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adtd
    public final /* bridge */ /* synthetic */ void c(Context context, Intent intent) {
        char c2;
        xyl.l(intent);
        String action = intent.getAction();
        if (action == null) {
            advr.q("Null action. Ignoring debug option intent.", new Object[0]);
            return;
        }
        advr.c("Processing debug action %s", action);
        int hashCode = action.hashCode();
        if (hashCode != -1534316517) {
            if (hashCode != -1263275559) {
                if (hashCode == 976675763 && action.equals(RcsIntents.ACTION_DEBUG_OPTION_SEND_ERROR_RESULT_FROM_ENGINE)) {
                    c2 = 1;
                }
                c2 = 65535;
            } else {
                if (action.equals(RcsIntents.ACTION_DEBUG_OPTION_INCREASE_SESSION_ID)) {
                    c2 = 0;
                }
                c2 = 65535;
            }
        } else {
            if (action.equals(RcsIntents.ACTION_DEBUG_OPTION_FORCE_CLIENT_TO_UNREGISTER)) {
                c2 = 2;
            }
            c2 = 65535;
        }
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 != 2) {
                    advr.k("Unknown debug action: %s", action);
                    return;
                }
                adod adodVar = c;
                if (adodVar != null) {
                    adodVar.stop(acok.DEBUG_OPTIONS_FORCED_UNREGISTER);
                    return;
                }
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra(RcsIntents.EXTRA_SEND_ERROR_RESULT_FROM_ENGINE, false);
            aduu aduuVar = d;
            if (aduuVar != null) {
                aduuVar.p(booleanExtra);
                return;
            }
            return;
        }
        long longExtra = intent.getLongExtra(RcsIntents.EXTRA_DELTA, 50000L);
        aduu aduuVar2 = d;
        if (aduuVar2 != null) {
            advr.c("Increasing session ID by %d", Long.valueOf(longExtra));
            aduuVar2.k(longExtra);
        }
    }

    @Override // defpackage.adtd
    public final boolean e(Context context, Intent intent) {
        synchronized (DebugOptionsReceiver.class) {
            advr.c("Received debug action %s", intent.getAction());
            if (adtw.e(context, intent)) {
                return true;
            }
            advr.q("Caller not trusted, dropping Debug Options intent: %s", intent);
            return false;
        }
    }
}
