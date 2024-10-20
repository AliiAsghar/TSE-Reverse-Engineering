package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaml extends wna {
    public aksr a;
    private volatile boolean b = false;
    private final Object c = new Object();

    @Override // defpackage.wng
    public final akrc a() {
        return this.a.b("DebugReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return null;
    }

    @Override // defpackage.wnj, defpackage.wnk
    public final void d(Context context) {
        if (!this.b) {
            synchronized (this.c) {
                if (!this.b) {
                    ((aajz) apzj.i(context)).Or(this);
                    this.b = true;
                }
            }
        }
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }

    @Override // defpackage.wna
    public final String f() {
        return null;
    }

    @Override // defpackage.wna
    public final void g(Context context, Intent intent) {
        q("debug future", SettableFuture.create());
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.wnj, defpackage.wng, defpackage.wnk, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        d(context);
        super.onReceive(context, intent);
    }
}
