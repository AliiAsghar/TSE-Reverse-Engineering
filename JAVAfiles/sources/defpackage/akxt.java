package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akxt implements akxq {
    final /* synthetic */ Function a;
    final /* synthetic */ dtq b;

    public akxt(Function function, dtq dtqVar) {
        this.a = function;
        this.b = dtqVar;
    }

    @Override // defpackage.akxq
    public final void a(Throwable th) {
        this.b.d(th);
    }

    @Override // defpackage.akxq
    public final void b(Object obj) {
        Object apply;
        try {
            apply = this.a.apply(obj);
            albo.q((ListenableFuture) apply, new akxs(this.b, Function$CC.identity()), new sp(17));
        } catch (Throwable th) {
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            this.b.d(th);
        }
    }
}
