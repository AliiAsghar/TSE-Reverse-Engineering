package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vet implements vgq {
    public final qwe a;
    public String b;
    private final arwe c;
    private final askq d;
    private final vgp e;
    private long f;

    public vet(arwe arweVar, askq askqVar, qwe qweVar, vgp vgpVar) {
        arweVar.getClass();
        askqVar.getClass();
        qweVar.getClass();
        this.c = arweVar;
        this.d = askqVar;
        this.a = qweVar;
        this.e = vgpVar;
        this.b = "";
    }

    @Override // defpackage.vgq
    public final long a() {
        return this.f;
    }

    @Override // defpackage.vgq
    public final vgp b() {
        return this.e;
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture c(aqgb aqgbVar) {
        aqgbVar.getClass();
        this.b = aqgbVar.c;
        aozy createBuilder = aqig.a.createBuilder();
        createBuilder.getClass();
        aojh j = aqaw.j(aqgbVar.toBuilder());
        j.D(this.d);
        aqgb C = j.C();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqig aqigVar = (aqig) createBuilder.b;
        aqigVar.c = C;
        aqigVar.b |= 1;
        apag s = createBuilder.s();
        s.getClass();
        akul ag = aktp.ag((aqig) s);
        ag.getClass();
        return ag;
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture d(veo veoVar, apbt apbtVar) {
        akul c;
        aqig aqigVar = (aqig) apbtVar;
        veoVar.getClass();
        aqigVar.getClass();
        c = qjh.c(this.c, arpj.a, arwf.a, new qka(veoVar, this, aqigVar, (arpe) null, 14));
        return c;
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture e(apbt apbtVar) {
        aqih aqihVar = (aqih) apbtVar;
        aqihVar.getClass();
        aqgc aqgcVar = aqihVar.b;
        if (aqgcVar == null) {
            aqgcVar = aqgc.a;
        }
        this.f = aqgcVar.b;
        akul ag = aktp.ag(aqihVar);
        ag.getClass();
        return ag;
    }

    @Override // defpackage.vgq
    public final String f() {
        return "NetworkTransitionRpcHandlerImpl";
    }

    @Override // defpackage.vgq
    public final String g() {
        return this.b;
    }

    @Override // defpackage.vgq
    public final /* synthetic */ void h(Throwable th) {
        vht.c(this);
    }

    @Override // defpackage.vgq
    public final /* synthetic */ void i() {
        vht.a(this);
    }

    @Override // defpackage.vgq
    public final /* synthetic */ void j() {
        vht.b(this);
    }
}
