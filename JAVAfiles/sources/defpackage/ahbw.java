package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Bundle;
import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahbw {
    private static final alvi a = alvi.m("com/google/android/libraries/inputmethod/webdebugbridge/util/WebDebugBridgeUtil");

    public static ahbq a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("result");
        if (string == null) {
            ((alvg) ((alvg) a.i()).h("com/google/android/libraries/inputmethod/webdebugbridge/util/WebDebugBridgeUtil", "getResponseFromBundle", 89, "WebDebugBridgeUtil.java")).q("There's no result in the WDB response.");
            return null;
        }
        try {
            return (ahbq) apag.parseFrom(ahbq.a, amcn.e.k(string), aozs.a());
        } catch (apba unused) {
            ((alvg) ((alvg) a.i()).h("com/google/android/libraries/inputmethod/webdebugbridge/util/WebDebugBridgeUtil", "getResponseFromBundle", 96, "WebDebugBridgeUtil.java")).q("The result in the WDB response is not a valid proto.");
            return null;
        }
    }

    public static Bundle b(Context context, String str, ahbo ahboVar) {
        String str2;
        ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(str);
        if (acquireUnstableContentProviderClient == null) {
            ((alvg) ((alvg) a.i()).h("com/google/android/libraries/inputmethod/webdebugbridge/util/WebDebugBridgeUtil", "sendRequestForBundle", 59, "WebDebugBridgeUtil.java")).q("Fail to get content provider client.");
            return null;
        }
        if (ahboVar != null) {
            str2 = Base64.encodeToString(ahboVar.toByteArray(), 3);
        } else {
            str2 = null;
        }
        Bundle call = acquireUnstableContentProviderClient.call("9003", str2, null);
        acquireUnstableContentProviderClient.release();
        if (call == null) {
            ((alvg) ((alvg) a.i()).h("com/google/android/libraries/inputmethod/webdebugbridge/util/WebDebugBridgeUtil", "sendRequestForBundle", 77, "WebDebugBridgeUtil.java")).q("The response bundle is null.");
        }
        return call;
    }
}
