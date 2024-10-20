package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class wna extends wnj {
    private static final xze a = xze.g("Bugle", "AsyncBroadcastReceiver");
    public andr D;
    public armf E;
    public aneo F;
    public armf G;
    public armf H;
    public ahmv J;
    private wne c;
    private final Object b = new Object();
    public boolean I = false;

    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    @Override // defpackage.wng
    public final void c(final Context context, final Intent intent) {
        if (!h(context, intent)) {
            return;
        }
        final long a2 = ((xnv) this.G.b()).a();
        synchronized (this.b) {
            akrh e = aktp.e("ReceiverDoInBackground");
            try {
                ListenableFuture b = this.D.b(akto.c(new ancr() { // from class: wmz
                    @Override // defpackage.ancr
                    public final ListenableFuture a() {
                        wna wnaVar = wna.this;
                        String fB = wnaVar.fB();
                        if (!TextUtils.isEmpty(fB)) {
                            ((mbl) wnaVar.H.b()).g(fB, ((xnv) wnaVar.G.b()).a() - a2);
                        }
                        return wnaVar.j(context, intent);
                    }
                }), (Executor) this.E.b());
                e.b(b);
                e.close();
                wne wneVar = this.c;
                if (wneVar != null && wneVar.d(b)) {
                    xyo a3 = a.a();
                    a3.H("Adding new broadcast to existing asyncWorkTracker of receiver:");
                    a3.H(this);
                    a3.q();
                } else {
                    xze xzeVar = a;
                    xyo a4 = xzeVar.a();
                    a4.H("Creating new tracker for");
                    a4.H(this);
                    a4.q();
                    BroadcastReceiver.PendingResult goAsync = goAsync();
                    ahmv ahmvVar = this.J;
                    Context context2 = (Context) ahmvVar.g.b();
                    context2.getClass();
                    znj znjVar = (znj) ahmvVar.c.b();
                    znjVar.getClass();
                    ?? r4 = ahmvVar.h;
                    akat akatVar = (akat) ahmvVar.e.b();
                    akatVar.getClass();
                    aneo aneoVar = (aneo) ahmvVar.b.b();
                    aneoVar.getClass();
                    mbl mblVar = (mbl) ahmvVar.a.b();
                    mblVar.getClass();
                    mce mceVar = (mce) ahmvVar.d.b();
                    mceVar.getClass();
                    wfh wfhVar = (wfh) ahmvVar.f.b();
                    wfhVar.getClass();
                    nwj nwjVar = (nwj) ahmvVar.i.b();
                    nwjVar.getClass();
                    b.getClass();
                    goAsync.getClass();
                    wne wneVar2 = new wne(context2, znjVar, r4, akatVar, aneoVar, mblVar, mceVar, wfhVar, nwjVar, b, goAsync, this);
                    this.c = wneVar2;
                    if (i(intent)) {
                        long longValue = ((Long) wnf.b.e()).longValue();
                        qiu.h(this.F.schedule(akto.j(new uju(this, wneVar2, context, intent, 5, null)), longValue, TimeUnit.MILLISECONDS));
                        xyo a5 = xzeVar.a();
                        a5.H("Scheduled foreground service launch in");
                        a5.G(longValue);
                        a5.H("milliseconds");
                        a5.q();
                    }
                }
            } finally {
            }
        }
    }

    public abstract String f();

    /* JADX INFO: Access modifiers changed from: protected */
    public String fB() {
        return null;
    }

    protected boolean h(Context context, Intent intent) {
        return true;
    }

    public boolean i(Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public akul j(Context context, Intent intent) {
        return aktp.ah(new vri((Object) this, (Object) context, (Object) intent, 6, (char[]) null), (Executor) this.E.b());
    }

    public String k(Context context, Intent intent) {
        return null;
    }

    @Override // defpackage.wng
    public final synchronized void q(String str, ListenableFuture listenableFuture) {
        if (this.I) {
            super.q(str, listenableFuture);
            return;
        }
        synchronized (this.b) {
            xyo a2 = a.a();
            a2.H("Adding");
            a2.H(str);
            a2.H("to broadcast of");
            a2.H(this);
            a2.q();
            akrh e = aktp.e("ReceiverAsyncWork");
            try {
                wne wneVar = this.c;
                wneVar.getClass();
                e.b(listenableFuture);
                albo.U(wneVar.d(listenableFuture), "Cannot call addAsyncWork if all async work is complete.");
                e.close();
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wng
    public final synchronized boolean r() {
        boolean z;
        if (this.I) {
            return super.r();
        }
        synchronized (this.b) {
            wne wneVar = this.c;
            z = false;
            if (wneVar != null && !wneVar.i.d.isDone()) {
                z = true;
            }
        }
        return z;
    }

    public void g(Context context, Intent intent) {
    }
}
