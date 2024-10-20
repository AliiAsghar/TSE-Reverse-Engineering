package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class acbm extends acbk {
    public static void a(Context context, adqg adqgVar) {
        adqgVar.o();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }
}
