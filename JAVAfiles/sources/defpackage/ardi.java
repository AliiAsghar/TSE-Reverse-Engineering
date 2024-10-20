package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ardi extends aqtr {
    aqzo a;
    public final /* synthetic */ ardr b;

    public ardi(ardr ardrVar) {
        this.b = ardrVar;
    }

    @Override // defpackage.aqtr
    public final aqrt a() {
        return this.b.H;
    }

    @Override // defpackage.aqtr
    public final /* bridge */ /* synthetic */ aqtw b(aqto aqtoVar) {
        this.b.m.c();
        albo.U(!this.b.C, "Channel is being terminated");
        return new aqzj(this.b, aqtoVar);
    }

    @Override // defpackage.aqtr
    public final aqwe c() {
        return this.b.m;
    }

    @Override // defpackage.aqtr
    public final ScheduledExecutorService d() {
        return this.b.j;
    }

    @Override // defpackage.aqtr
    public final void e() {
        this.b.m.c();
        this.b.m.execute(new arbg(this, 17));
    }

    @Override // defpackage.aqtr
    public final void f(aqsd aqsdVar, aqtx aqtxVar) {
        this.b.m.c();
        aqsdVar.getClass();
        this.b.m.execute(new aofo(this, aqtxVar, aqsdVar, 15, (char[]) null));
    }
}
