package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.ParcelUuid;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mad {
    private final Context c;
    private static final xze b = xze.g("Bugle", "BugReportUtil");
    public static final utz a = uuh.i(uuh.b, "enable_bug_report_capture", false);

    public mad(Context context) {
        this.c = context;
    }

    public final void a(String str) {
        if (!((Boolean) a.e()).booleanValue()) {
            b.q("Bug report capture is disabled via phenotype flag");
            return;
        }
        Intent intent = new Intent("com.google.android.apps.scone.connectivitymonitor.action.BUGREPORT");
        intent.setClassName("com.google.android.apps.scone", "com.google.android.apps.scone.connectivitymonitor.CMBroadCastReceiver");
        intent.putExtra("com.google.android.apps.scone.connectivitymonitor.extra.APP_NAME", "Google Messaging");
        intent.putExtra("com.google.android.apps.scone.connectivitymonitor.extra.DESCRIPTION", "Bug report reason: ".concat(str));
        intent.putExtra("com.google.android.apps.scone.connectivitymonitor.extra.EVENT_ID", ParcelUuid.fromString(UUID.randomUUID().toString()));
        this.c.sendBroadcast(intent);
    }
}
