package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fce extends BroadcastReceiver {
    final /* synthetic */ fcf a;

    public fce(fcf fcfVar) {
        this.a = fcfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast()) {
            fcf fcfVar = this.a;
            fcfVar.a(fcb.e(context, intent, fcfVar.g, fcfVar.i));
        }
    }
}
