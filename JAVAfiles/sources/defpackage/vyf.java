package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vyf implements akcq {
    public static final utz a = uuh.f(uuh.b, "rcs_limbo_messages_resolver_worker_frequency_hours", 6);
    private final armf b;

    public vyf(armf armfVar) {
        this.b = armfVar;
    }

    @Override // defpackage.akcy
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return akec.c();
    }

    @Override // defpackage.akcq, defpackage.akcy
    public final ListenableFuture b(WorkerParameters workerParameters) {
        akul g;
        vyd vydVar = (vyd) this.b.b();
        if (((okv) vydVar.s.b()).a()) {
            g = akul.g(((adjc) vydVar.r.b()).g());
        } else {
            g = akul.g(aneh.a);
        }
        int i = 14;
        return g.i(new vek(vydVar, i), vydVar.g).i(new vek(vydVar, 15), vydVar.g).h(new vsw(i), andi.a);
    }
}
