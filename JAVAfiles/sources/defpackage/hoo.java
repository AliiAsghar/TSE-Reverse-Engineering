package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoo {
    final Map a;
    public final ReferenceQueue b;
    public volatile boolean c;
    public volatile hom d;

    public hoo() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new hol());
        this.a = new HashMap();
        this.b = new ReferenceQueue();
        newSingleThreadExecutor.execute(new gtq(this, 9, null));
    }

    public final synchronized hpn a(hne hneVar) {
        hon honVar = (hon) this.a.get(hneVar);
        if (honVar == null) {
            return null;
        }
        hpn hpnVar = (hpn) honVar.get();
        if (hpnVar == null) {
            c(honVar);
        }
        return hpnVar;
    }

    public final synchronized void b(hne hneVar, hpn hpnVar) {
        hon honVar = (hon) this.a.put(hneVar, new hon(hneVar, hpnVar, this.b));
        if (honVar != null) {
            honVar.a();
        }
    }

    public final void c(hon honVar) {
        synchronized (this) {
            this.a.remove(honVar.a);
            if (honVar.b) {
                hpt hptVar = honVar.c;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(hne hneVar) {
        hon honVar = (hon) this.a.remove(hneVar);
        if (honVar != null) {
            honVar.a();
        }
    }
}
