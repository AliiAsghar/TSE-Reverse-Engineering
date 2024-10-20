package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aodh extends BroadcastReceiver {
    public static final AtomicReference a = new AtomicReference();
    private final Context b;

    public aodh(Context context) {
        this.b = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (aodi.a) {
            Iterator it = aodi.b.values().iterator();
            while (it.hasNext()) {
                ((aodi) it.next()).h();
            }
        }
        this.b.unregisterReceiver(this);
    }
}
