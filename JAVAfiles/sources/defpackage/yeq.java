package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yeq extends BroadcastReceiver {
    final /* synthetic */ yer a;

    public yeq(yer yerVar) {
        this.a = yerVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && action.equals("com.google.gservices.intent.action.GSERVICES_CHANGED")) {
            yer yerVar = this.a;
            qiu.h(yerVar.e.submit(akto.j(new ybh(yerVar, 3))));
        }
    }
}
