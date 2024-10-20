package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class actu extends BroadcastReceiver {
    final /* synthetic */ actw a;

    public actu(actw actwVar) {
        this.a = actwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (this.a) {
            if (!this.a.e()) {
                advr.q("LocalAlarmTimer is inactive, ignoring alarm (%s)!", intent.getAction());
                return;
            }
            String action = intent.getAction();
            actv actvVar = this.a.a;
            if (actvVar != null && actvVar.b.equals(action)) {
                actw actwVar = this.a;
                Thread thread = actwVar.a.a;
                actwVar.c();
                thread.start();
            } else {
                advr.q("Warning, unexpected alarm (%s) for %s", action, this.a.a);
            }
        }
    }
}
