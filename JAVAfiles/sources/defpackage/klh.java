package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klh implements vgq {
    private final apku a;
    private final String b = UUID.randomUUID().toString();
    private String c;
    private long d;

    public klh(apku apkuVar) {
        this.a = apkuVar;
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
    public final /* bridge */ /* synthetic */ ListenableFuture c(aqgb aqgbVar) {
        this.c = aqgbVar.c;
        aozy createBuilder = aqdt.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqdt aqdtVar = (aqdt) createBuilder.b;
        aqgbVar.getClass();
        aqdtVar.f = aqgbVar;
        aqdtVar.b |= 4;
        aozy createBuilder2 = aqfn.a.createBuilder();
        asku askuVar = asku.MESSAGES_DATA_DONATION;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((aqfn) createBuilder2.b).b = askuVar.a();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        ((aqfn) apagVar).c = "dds";
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        ((aqfn) createBuilder2.b).d = "Bugle";
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqdt aqdtVar2 = (aqdt) createBuilder.b;
        aqfn aqfnVar = (aqfn) createBuilder2.s();
        aqfnVar.getClass();
        aqdtVar2.c = aqfnVar;
        aqdtVar2.b |= 1;
        aozy createBuilder3 = aqds.a.createBuilder();
        String str = this.b;
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apag apagVar2 = createBuilder3.b;
        str.getClass();
        ((aqds) apagVar2).c = str;
        aqdq aqdqVar = aqdq.USER;
        if (!apagVar2.isMutable()) {
            createBuilder3.u();
        }
        ((aqds) createBuilder3.b).j = aqdqVar.a();
        aqdr aqdrVar = aqdr.MESSAGES_DATA_DONATION;
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        ((aqds) createBuilder3.b).d = aqdrVar.a();
        aozb byteString = this.a.toByteString();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        ((aqds) createBuilder3.b).e = byteString;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqdt aqdtVar3 = (aqdt) createBuilder.b;
        aqds aqdsVar = (aqds) createBuilder3.s();
        aqdsVar.getClass();
        aqdtVar3.e = aqdsVar;
        aqdtVar3.b |= 2;
        return aktp.ag((aqdt) createBuilder.s());
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture d(veo veoVar, apbt apbtVar) {
        return veoVar.a().e((aqdt) apbtVar);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture e(apbt apbtVar) {
        long j;
        aqdu aqduVar = (aqdu) apbtVar;
        if (aqduVar == null) {
            j = 0;
        } else {
            aqgc aqgcVar = aqduVar.b;
            if (aqgcVar == null) {
                aqgcVar = aqgc.a;
            }
            j = aqgcVar.b;
        }
        this.d = j;
        return aktp.ag(aqduVar);
    }

    @Override // defpackage.vgq
    public final String f() {
        return "DonationRpcHandler";
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
