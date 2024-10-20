package defpackage;

import io.grpc.Status;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arig extends apzj {
    final /* synthetic */ arxm d;
    final /* synthetic */ arzj e;
    final /* synthetic */ aqvr f;
    final /* synthetic */ asmb g;
    private boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arig(arxm arxmVar, arzj arzjVar, aqvr aqvrVar, asmb asmbVar) {
        super(null);
        this.d = arxmVar;
        this.e = arzjVar;
        this.f = aqvrVar;
        this.g = asmbVar;
        this.h = true;
    }

    @Override // defpackage.apzj
    public final void a() {
        arwi.x(this.d, "Cancellation received from client", null);
    }

    @Override // defpackage.apzj
    public final void c() {
        this.e.e(null);
    }

    @Override // defpackage.apzj
    public final void d(Object obj) {
        if (this.h) {
            Object c = this.e.c(obj);
            this.h = arzn.c(c);
            if (c instanceof arzm) {
                Throwable b = arzn.b(c);
                if (!(b instanceof CancellationException)) {
                    throw Status.m.withDescription("onMessage should never be called when requestsChannel is unready").d(b).asException();
                }
            }
        }
        if (!this.h) {
            this.f.d(1);
        }
    }

    @Override // defpackage.apzj
    public final void e() {
        this.g.l();
    }
}
