package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fj {
    private BroadcastReceiver a;
    final /* synthetic */ fo c;

    public fj(fo foVar) {
        this.c = foVar;
    }

    public abstract IntentFilter a();

    public abstract void b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.c.k.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        c();
        IntentFilter a = a();
        if (a.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = new fi(this);
        }
        fo foVar = this.c;
        foVar.k.registerReceiver(this.a, a);
    }
}
