package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahkk {
    public static void a(Context context) {
        try {
            Intent intent = new Intent("com.google.android.primes.action.DEBUG_PRIMES_EVENTS");
            intent.setPackage(context.getPackageName());
            intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/debug/Intents", "startPrimesEventDebugActivity", 35, "Intents.java")).q("PrimesEventActivity not found: primes/debug is not included in the app.");
        }
    }
}
