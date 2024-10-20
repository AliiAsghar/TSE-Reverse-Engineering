package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vfo implements vgq {
    private final String a;
    private final vgm b;
    private final armf c;
    private String d = "";
    private long e = 0;

    public vfo(armf armfVar, vgm vgmVar, String str) {
        this.c = armfVar;
        this.b = vgmVar;
        this.a = str;
    }

    @Override // defpackage.vgq
    public final long a() {
        return this.e;
    }

    @Override // defpackage.vgq
    public final vgp b() {
        return this.b;
    }

    @Override // defpackage.vgq
    public final ListenableFuture c(aqgb aqgbVar) {
        xzb.c("Bugle", "Verify request Id: ".concat(String.valueOf(aqgbVar.c)));
        this.d = aqgbVar.c;
        aozy createBuilder = aqfe.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aqfe aqfeVar = (aqfe) apagVar;
        aqgbVar.getClass();
        aqfeVar.c = aqgbVar;
        aqfeVar.b |= 1;
        String str = this.a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        aqfe aqfeVar2 = (aqfe) createBuilder.b;
        str.getClass();
        aqfeVar2.d = str;
        return albo.bI((aqfe) createBuilder.s());
    }

    @Override // defpackage.vgq
    public final String f() {
        return "VerifyRpcHandler";
    }

    @Override // defpackage.vgq
    public final String g() {
        return this.d;
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

    @Override // defpackage.vgq
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture d(veo veoVar, aqfe aqfeVar) {
        aqar a = veoVar.b(yyb.cI(((psq) this.c.b()).c(this.b.a))).a();
        aqrs aqrsVar = a.a;
        aqux aquxVar = aqas.d;
        if (aquxVar == null) {
            synchronized (aqas.class) {
                aquxVar = aqas.d;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("google.internal.communications.instantmessaging.v1.Registration", "Verify");
                    a2.b();
                    aqfe aqfeVar2 = aqfe.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(aqfeVar2);
                    a2.d = new arkw(aqff.a);
                    aquxVar = a2.a();
                    aqas.d = aquxVar;
                }
            }
        }
        return akul.g(arlj.a(aqrsVar.a(aquxVar, a.b), aqfeVar));
    }

    @Override // defpackage.vgq
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture e(aqff aqffVar) {
        long j;
        if (aqffVar != null) {
            aqgc aqgcVar = aqffVar.c;
            if (aqgcVar == null) {
                aqgcVar = aqgc.a;
            }
            j = aqgcVar.b;
        } else {
            j = 0;
        }
        this.e = j;
        return albo.bI(aqffVar);
    }
}
