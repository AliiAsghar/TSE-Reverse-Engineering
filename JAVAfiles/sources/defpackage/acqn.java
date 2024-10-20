package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqn extends BroadcastReceiver {
    public final List a = new ArrayList();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            new acqm(this).execute(new Void[0]);
        }
    }
}
