package defpackage;

import android.os.IBinder;
import com.google.android.ims.events.EventHubProxy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrn implements IBinder.DeathRecipient {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ acrn(ahaf ahafVar, int i) {
        this.b = i;
        this.a = ahafVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        String str;
        if (this.b == 0) {
            str = ((EventHubProxy) this.a).b;
            advr.c("Process has died: %s", str);
            ((EventHubProxy) this.a).j = null;
            ((EventHubProxy) this.a).c = false;
            return;
        }
        Object obj = this.a;
        synchronized (obj) {
            ((ahaf) obj).e = null;
        }
    }

    public acrn(EventHubProxy eventHubProxy, int i) {
        this.b = i;
        this.a = eventHubProxy;
    }
}
