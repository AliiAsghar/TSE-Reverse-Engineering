package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.gsy;
import defpackage.gsz;
import defpackage.gvf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = gsy.b("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        gsy.a().c(a, "Requesting diagnostics");
        try {
            gvf.ar(context).i(new gsz(DiagnosticsWorker.class).j());
        } catch (IllegalStateException e) {
            gsy.a();
            Log.e(a, "WorkManager is not initialized", e);
        }
    }
}
