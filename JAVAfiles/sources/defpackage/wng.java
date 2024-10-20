package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class wng extends wnk {
    private static final alvi fm = alvi.m("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver");
    public armf K;
    public armf L;
    public armf M;
    public armf N;
    public armf O;
    public armf P;
    public armf Q;
    private BroadcastReceiver.PendingResult fn;
    private wni fo;

    private final wni f(ListenableFuture listenableFuture) {
        wni ae = ((znj) this.O.b()).ae(listenableFuture);
        qiu.i(ae.d, new vxb(this, ae, 10, null), (Executor) this.N.b());
        return ae;
    }

    public abstract akrc a();

    public abstract String b();

    public abstract void c(Context context, Intent intent);

    protected int e() {
        return 18;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [armf, java.lang.Object] */
    @Override // defpackage.wnk, android.content.BroadcastReceiver
    public synchronized void onReceive(Context context, Intent intent) {
        boolean z;
        d(context);
        if (TextUtils.isEmpty(intent.getAction())) {
            ((mbl) this.M.b()).e("Bugle.Receiver.NonExportedReceivers.NullActionIntent.Counts", e());
        }
        akrc a = a();
        try {
            if (this.fo == null) {
                z = true;
            } else {
                z = false;
            }
            d.s(z);
            String b = b();
            if (!TextUtils.isEmpty(b)) {
                ((mce) this.K.b()).b(b);
            }
            Collection.EL.forEach((Set) ((wfh) this.L.b()).a.b(), new vwq(this, 18));
            this.fn = null;
            try {
                c(context, intent);
                a.close();
            } finally {
                ((wfh) this.L.b()).f(this, r());
                if (!r()) {
                    alvw d = fm.d();
                    d.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "onReceive", 122, "BugleBroadcastReceiver.java")).t("Immediately completing broadcast of %s", this);
                    t();
                }
            }
        } finally {
        }
    }

    public synchronized void q(String str, ListenableFuture listenableFuture) {
        if (!r()) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            this.fn = goAsync;
            goAsync.getClass();
            this.fo = f(listenableFuture);
            alvw d = fm.d();
            d.X(alwp.a, "Bugle");
            ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "addAsyncWork", 141, "BugleBroadcastReceiver.java")).t("Broadcast of %s is going async", this);
        } else {
            wni wniVar = this.fo;
            wniVar.getClass();
            if (!wniVar.a(listenableFuture)) {
                alvw f = fm.f();
                f.X(alwp.a, "Bugle");
                ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "addAsyncWork", 145, "BugleBroadcastReceiver.java")).q("Creating new dynamicFutureListListener since previous work has completed");
                this.fo = f(listenableFuture);
            }
        }
        alvw d2 = fm.d();
        d2.X(alwp.a, "Bugle");
        ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "addAsyncWork", 150, "BugleBroadcastReceiver.java")).D("Adding %s to broadcast of %s", str, this);
        akrh e = aktp.e("ReceiverAsyncWork");
        try {
            e.b(listenableFuture);
            e.close();
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized boolean r() {
        if (this.fn != null) {
            return true;
        }
        return false;
    }

    public final synchronized void s(wni wniVar) {
        if (this.fo != wniVar) {
            alvi alviVar = fm;
            alvw f = alviVar.f();
            f.X(alwp.a, "Bugle");
            ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "onAsyncWorkComplete", 177, "BugleBroadcastReceiver.java")).q("Ignoring #onAsyncWorkComplete because new work has been added");
            if (((nwi) this.P.b()).a()) {
                alvw i = alviVar.i();
                i.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "onAsyncWorkComplete", 179, "BugleBroadcastReceiver.java")).q("skipping calling pendingResult.finish.  Work was enqueued after the processing of first batch of work was complete.");
                return;
            }
            return;
        }
        alvw d = fm.d();
        d.X(alwp.a, "Bugle");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "onAsyncWorkComplete", 186, "BugleBroadcastReceiver.java")).t("Completing broadcast of %s", this);
        if (((nwh) this.Q.b()).a()) {
            this.fo = null;
            BroadcastReceiver.PendingResult pendingResult = this.fn;
            pendingResult.getClass();
            pendingResult.finish();
            ((wfh) this.L.b()).e(this);
            t();
            return;
        }
        ((wfh) this.L.b()).e(this);
        t();
        this.fo = null;
        BroadcastReceiver.PendingResult pendingResult2 = this.fn;
        pendingResult2.getClass();
        pendingResult2.finish();
    }

    public final void t() {
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            ((mce) this.K.b()).n(b);
        }
    }
}
