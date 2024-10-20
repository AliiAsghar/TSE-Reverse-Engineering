package defpackage;

import io.grpc.Status;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arde extends aqsu {
    public final aqsm a;
    private final aqtd b;
    private final aqrs c;
    private final Executor d;
    private final aqux e;
    private aqrr f;
    private aqru g;

    public arde(aqtd aqtdVar, aqrs aqrsVar, Executor executor, aqux aquxVar, aqrr aqrrVar) {
        this.b = aqtdVar;
        this.c = aqrsVar;
        this.e = aquxVar;
        Executor executor2 = aqrrVar.c;
        executor = executor2 != null ? executor2 : executor;
        this.d = executor;
        aqrp a = aqrr.a(aqrrVar);
        a.b = executor;
        this.f = new aqrr(a);
        this.a = aqsm.k();
    }

    @Override // defpackage.aqsu, defpackage.aqru
    public final void a(apsd apsdVar, aqut aqutVar) {
        new aqtu(this.e, aqutVar, this.f, ardr.f);
        asmb a = this.b.a();
        Status status = (Status) a.a;
        if (status.f()) {
            areb b = ((ared) a.b).b(this.e);
            if (b != null) {
                this.f = this.f.e(areb.a, b);
            }
            aqru a2 = this.c.a(this.e, this.f);
            this.g = a2;
            a2.a(apsdVar, aqutVar);
            return;
        }
        this.d.execute(new ardd(this, apsdVar, arcb.b(status)));
        this.g = ardr.g;
    }

    @Override // defpackage.aqvg, defpackage.aqru
    public final void c(String str, Throwable th) {
        aqru aqruVar = this.g;
        if (aqruVar != null) {
            aqruVar.c(str, th);
        }
    }

    @Override // defpackage.aqsu, defpackage.aqvg
    protected final aqru g() {
        return this.g;
    }
}
