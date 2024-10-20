package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablw extends epp {
    private final Semaphore j;
    private final Set k;

    public ablw(Context context, Set set) {
        super(context);
        this.j = new Semaphore(0);
        this.k = set;
    }

    @Override // defpackage.epp
    public final /* bridge */ /* synthetic */ Object a() {
        Iterator it = this.k.iterator();
        if (!it.hasNext()) {
            try {
                this.j.tryAcquire(0, 5L, TimeUnit.SECONDS);
                return null;
            } catch (InterruptedException e) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
                Thread.currentThread().interrupt();
                return null;
            }
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.epr
    public final void l() {
        this.j.drainPermits();
        f();
    }
}
