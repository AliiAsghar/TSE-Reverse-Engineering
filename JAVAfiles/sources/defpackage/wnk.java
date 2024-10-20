package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class wnk extends BroadcastReceiver {
    private volatile boolean fj = false;
    private final Object fk = new Object();

    public void d(Context context) {
        if (!this.fj) {
            synchronized (this.fk) {
                if (!this.fj) {
                    ((wnh) apzj.i(context)).Mg((wng) this);
                    this.fj = true;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        throw null;
    }
}
