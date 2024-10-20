package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wne {
    public static final xze a = xze.g("Bugle", "BroadcastReceiverAsyncWorkTracker");
    public final wna b;
    public final Context c;
    public final armf d;
    public final akat e;
    public final aneo f;
    public final mbl g;
    public final mce h;
    public final wni i;
    public mbm j;
    public final wfh k;
    private boolean l = false;
    private final Object m = new Object();
    private final BroadcastReceiver.PendingResult n;
    private final nwj o;

    public wne(Context context, znj znjVar, armf armfVar, akat akatVar, aneo aneoVar, mbl mblVar, mce mceVar, wfh wfhVar, nwj nwjVar, ListenableFuture listenableFuture, BroadcastReceiver.PendingResult pendingResult, wna wnaVar) {
        this.c = context;
        this.d = armfVar;
        this.e = akatVar;
        this.f = aneoVar;
        this.g = mblVar;
        this.h = mceVar;
        this.k = wfhVar;
        this.o = nwjVar;
        this.n = pendingResult;
        this.b = wnaVar;
        this.i = znjVar.ae(listenableFuture);
        b(new vwq(this, 17));
    }

    public final void a() {
        boolean z;
        synchronized (this.m) {
            if (!this.l) {
                z = true;
                this.l = true;
            } else {
                z = false;
            }
        }
        if (z) {
            xyo c = a.c();
            c.H("Acknowledging broadcast of");
            c.H(this.b);
            c.q();
            this.n.finish();
        }
    }

    public final void b(Consumer consumer) {
        Executor executor;
        if (this.o.a()) {
            executor = andi.a;
        } else {
            executor = this.f;
        }
        qiu.i(this.i.d, consumer, executor);
    }

    public final void c() {
        mbm mbmVar = this.j;
        if (mbmVar != null) {
            mbmVar.c();
            this.j = null;
        }
    }

    public final boolean d(ListenableFuture listenableFuture) {
        return this.i.a(akul.g(listenableFuture).h(new whf(20), this.f).e(RuntimeException.class, new whg(this, 19), this.f));
    }

    public final void e(Exception exc) {
        xyo c = a.c();
        c.H("Ending foreground service for broadcast of");
        c.H(this.b);
        c.r(exc);
        c();
        this.g.e("Bugle.Broadcast.ForegroundNotification.Dismiss.Count", 1);
    }
}
