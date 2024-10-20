package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahjq extends BroadcastReceiver {
    final /* synthetic */ ahjv a;

    public ahjq(ahjv ahjvVar) {
        this.a = ahjvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            this.a.f();
        }
    }
}
