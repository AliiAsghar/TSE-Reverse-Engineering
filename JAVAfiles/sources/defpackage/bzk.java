package defpackage;

import defpackage.bzj;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzk extends arrp implements arqr<Throwable, arnb> {
    final /* synthetic */ bzj a;
    final /* synthetic */ Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzk(bzj bzjVar, Throwable th) {
        super(1);
        this.a = bzjVar;
        this.b = th;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Throwable th = this.b;
        Throwable th2 = (Throwable) obj;
        bzj bzjVar = this.a;
        synchronized (bzjVar.d) {
            if (th != null) {
                if (th2 != null) {
                    if (true == (th2 instanceof CancellationException)) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        armd.c(th, th2);
                    }
                }
            } else {
                th = null;
            }
            bzjVar.f = th;
            bzjVar.n.f(bzj.d.a);
        }
        return arnb.a;
    }
}
