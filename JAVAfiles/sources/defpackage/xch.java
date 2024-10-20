package defpackage;

import android.util.Log;
import com.google.android.ims.events.EventHubProxy;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xch implements andy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public xch(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.function.Function] */
    @Override // defpackage.andy
    public final void a(Throwable th) {
        Object O;
        switch (this.b) {
            case 0:
                xyo b = xcj.a.b();
                b.H("Failed executing background startup task:");
                b.H(this.a);
                b.r(th);
                return;
            case 1:
                th.getClass();
                if (th instanceof CancellationException) {
                    ((alvg) qiy.a.a((Level) this.a).g(th).h("com/google/android/apps/messaging/shared/concurrent/FuturesKtKt$logCancellation$1", "onFailure", 208, "FuturesKt.kt")).q("Future was cancelled.");
                    return;
                }
                return;
            case 2:
                this.a.apply(th);
                return;
            case 3:
                advr.i(th, "Failed to send events from proxy %s", EventHubProxy.m221$$Nest$fgetname((EventHubProxy) this.a));
                return;
            case 4:
                return;
            case 5:
                if (th instanceof TimeoutException) {
                    ((alvg) ((alvg) ((alvg) akat.a.i()).g(th)).h("com/google/apps/tiktok/concurrent/AndroidFutures$1", "onFailure", 190, "AndroidFutures.java")).t("exceeded timeout: %s", this.a);
                    return;
                }
                return;
            case 6:
                th.getClass();
                Log.e("MendelPackageState", (String) this.a, th);
                return;
            case 7:
                ((apyu) this.a).b(th);
                return;
            default:
                try {
                    O = Boolean.valueOf(((arvv) this.a).b(th));
                } catch (Throwable th2) {
                    O = aqil.O(th2);
                }
                Throwable c = armq.c(O);
                if (c != null) {
                    arro.m(arpj.a, c);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.andy
    public final void b(Object obj) {
        Object O;
        switch (this.b) {
            case 0:
                xyo a = xcj.a.a();
                a.H("Finished executing background startup task:");
                a.H(this.a);
                a.q();
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                Iterator it = ((Set) ((ajzk) this.a).a.b()).iterator();
                while (it.hasNext()) {
                    Object obj2 = ((asqc) it.next()).a;
                    ListenableFuture bI = albo.bI(null);
                    ((ahiy) obj2).q(bI, "com.google.apps.tiktok.account.data.AllAccounts");
                    akat.c(bI, "AvailableAccountsInvalidatedObserver failed", new Object[0]);
                }
                return;
            case 5:
            case 6:
                return;
            case 7:
                ((apyu) this.a).g(obj);
                return;
            default:
                try {
                    O = Boolean.valueOf(((arxw) this.a).T(obj));
                } catch (Throwable th) {
                    O = aqil.O(th);
                }
                Throwable c = armq.c(O);
                if (c != null) {
                    arro.m(arpj.a, c);
                    return;
                }
                return;
        }
    }
}
