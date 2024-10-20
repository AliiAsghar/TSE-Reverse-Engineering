package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vmg {
    static {
        alwo alwoVar = vmk.a;
    }

    public static akul a(Context context, wng wngVar, Bundle bundle, Intent intent, armf armfVar) {
        return aktp.ah(new rgr(context, bundle, intent, armfVar, wngVar, 4), andi.a);
    }

    public static void b(vco vcoVar, vkv vkvVar) {
        if (vkvVar.b.isEmpty()) {
            ((alwl) ((alwl) vmk.a.i()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageCallbacksModule", "cancelNotification", 178, "IncomingMessageCallbacksModule.java")).q("Missing tag on notification action callback, which should not happen");
        } else {
            vcoVar.u(vkvVar.a, (String) vkvVar.b.get());
        }
    }
}
