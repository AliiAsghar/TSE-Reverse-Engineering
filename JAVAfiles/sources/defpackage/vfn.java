package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vfn implements vgq {
    private final vgm a;
    private String b = "";
    private long c = 0;

    public vfn(vgm vgmVar) {
        this.a = vgmVar;
    }

    @Override // defpackage.vgq
    public final long a() {
        return this.c;
    }

    @Override // defpackage.vgq
    public final vgp b() {
        return this.a;
    }

    @Override // defpackage.vgq
    public final ListenableFuture c(aqgb aqgbVar) {
        this.b = aqgbVar.c;
        aozy createBuilder = aqfb.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aqfb aqfbVar = (aqfb) apagVar;
        aqgbVar.getClass();
        aqfbVar.c = aqgbVar;
        aqfbVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((aqfb) createBuilder.b).d = 1;
        return albo.bI((aqfb) createBuilder.s());
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture d(veo veoVar, apbt apbtVar) {
        aqfb aqfbVar = (aqfb) apbtVar;
        aqar z = veoVar.d().z();
        aqrs aqrsVar = z.a;
        aqux aquxVar = aqas.e;
        if (aquxVar == null) {
            synchronized (aqas.class) {
                aquxVar = aqas.e;
                if (aquxVar == null) {
                    aquu a = aqux.a();
                    a.e = aquw.UNARY;
                    a.a = aqux.c("google.internal.communications.instantmessaging.v1.Registration", "Unregister");
                    a.b();
                    aqfb aqfbVar2 = aqfb.a;
                    aozs aozsVar = arkx.a;
                    a.c = new arkw(aqfbVar2);
                    a.d = new arkw(aqfc.a);
                    aquxVar = a.a();
                    aqas.e = aquxVar;
                }
            }
        }
        return arlj.a(aqrsVar.a(aquxVar, z.b), aqfbVar);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture e(apbt apbtVar) {
        long j;
        aqfc aqfcVar = (aqfc) apbtVar;
        if (aqfcVar != null) {
            aqgc aqgcVar = aqfcVar.b;
            if (aqgcVar == null) {
                aqgcVar = aqgc.a;
            }
            j = aqgcVar.b;
        } else {
            j = 0;
        }
        this.c = j;
        return albo.bI(aqfcVar);
    }

    @Override // defpackage.vgq
    public final String f() {
        return "UnregisterPhoneRpcHandler";
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
