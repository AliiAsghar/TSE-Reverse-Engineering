package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vfe implements vgq {
    public final long a;
    private final aqfn b;
    private String c = "";
    private long d = 0;

    public vfe(vcc vccVar, aqfn aqfnVar) {
        long longValue;
        this.b = aqfnVar;
        synchronized (vccVar.d) {
            longValue = ((Long) Map.EL.getOrDefault(vccVar.e, aqfnVar, -1L)).longValue();
        }
        this.a = longValue;
    }

    @Override // defpackage.vgq
    public final long a() {
        return this.d;
    }

    @Override // defpackage.vgq
    public final vgp b() {
        return vgp.c;
    }

    @Override // defpackage.vgq
    public final ListenableFuture c(aqgb aqgbVar) {
        aozy createBuilder = aqey.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqfn aqfnVar = this.b;
        apag apagVar = createBuilder.b;
        aqey aqeyVar = (aqey) apagVar;
        aqeyVar.c = aqfnVar;
        aqeyVar.b |= 1;
        long j = this.a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((aqey) createBuilder.b).d = j;
        aqey aqeyVar2 = (aqey) createBuilder.s();
        aozy createBuilder2 = aqew.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aqew aqewVar = (aqew) createBuilder2.b;
        aqeyVar2.getClass();
        apax apaxVar = aqewVar.d;
        if (!apaxVar.c()) {
            aqewVar.d = apag.mutableCopy(apaxVar);
        }
        aqewVar.d.add(aqeyVar2);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aqew aqewVar2 = (aqew) createBuilder2.b;
        aqgbVar.getClass();
        aqewVar2.c = aqgbVar;
        aqewVar2.b |= 1;
        aqew aqewVar3 = (aqew) createBuilder2.s();
        this.c = aqgbVar.c;
        return albo.bI(aqewVar3);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture d(veo veoVar, apbt apbtVar) {
        xzb.l("BugleNetwork", "revoking messages by sender");
        return veoVar.a().d((aqew) apbtVar);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture e(apbt apbtVar) {
        long j;
        aqex aqexVar = (aqex) apbtVar;
        if (aqexVar != null) {
            aqgc aqgcVar = aqexVar.b;
            if (aqgcVar == null) {
                aqgcVar = aqgc.a;
            }
            j = aqgcVar.b;
        } else {
            j = 0;
        }
        this.d = j;
        ListenableFuture bI = albo.bI(aqexVar);
        albo.bR(bI, new ydv(new uhb(11), new uhb(12), 0), andi.a);
        return bI;
    }

    @Override // defpackage.vgq
    public final String f() {
        return "RevokeMessagesRpcHandler";
    }

    @Override // defpackage.vgq
    public final String g() {
        return this.c;
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
