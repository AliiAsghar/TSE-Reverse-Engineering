package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akxs implements akxq {
    final /* synthetic */ dtq a;
    final /* synthetic */ Function b;

    public akxs(dtq dtqVar, Function function) {
        this.a = dtqVar;
        this.b = function;
    }

    @Override // defpackage.akxq
    public final void a(Throwable th) {
        this.a.d(th);
    }

    @Override // defpackage.akxq
    public final void b(Object obj) {
        Object apply;
        try {
            dtq dtqVar = this.a;
            apply = this.b.apply(obj);
            dtqVar.b(apply);
        } catch (Throwable th) {
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            this.a.d(th);
        }
    }
}
