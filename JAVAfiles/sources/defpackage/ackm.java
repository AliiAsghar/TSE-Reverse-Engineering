package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ackm extends acda {
    final /* synthetic */ acko a;
    private boolean b;
    private final ackl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ackm(acko ackoVar, Looper looper) {
        super(looper);
        this.a = ackoVar;
        this.c = new ackl();
    }

    private final synchronized void c() {
        if (this.b) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            Log.v("WearableLS", "bindService: ".concat(String.valueOf(String.valueOf(this.a.F))));
        }
        acko ackoVar = this.a;
        ackoVar.bindService(ackoVar.H, this.c, 1);
        this.b = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acda
    public final void a(Message message) {
        c();
        try {
            super.a(message);
            if (!hasMessages(0)) {
                b("dispatch");
            }
        } catch (Throwable th) {
            if (!hasMessages(0)) {
                b("dispatch");
            }
            throw th;
        }
    }

    public final synchronized void b(String str) {
        if (!this.b) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            Log.v("WearableLS", "unbindService: " + str + ", " + String.valueOf(this.a.F));
        }
        try {
            this.a.unbindService(this.c);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.b = false;
    }
}
