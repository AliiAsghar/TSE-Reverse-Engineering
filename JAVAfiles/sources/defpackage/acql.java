package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acql extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if (!Objects.isNull(data) && data.toString().equals("package:com.google.android.ims") && !intent.hasExtra("android.intent.extra.DONT_KILL_APP")) {
            advr.k("Received: %s, call System.exit(0) to exit the app", intent.getAction());
            System.exit(0);
        }
    }
}
