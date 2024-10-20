package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.UserDevices;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ttc implements vgq {
    private static final xze a = xze.g("BugleEtouffee", "DownloadPreKeysHandler");
    private final ArrayList b;
    private final String c;
    private String d = "";
    private long e = 0;

    public ttc(ArrayList arrayList, String str) {
        this.b = arrayList;
        this.c = str;
    }

    @Override // defpackage.vgq
    public final long a() {
        return this.e;
    }

    @Override // defpackage.vgq
    public final vgp b() {
        return new vgm(this.c);
    }

    @Override // defpackage.vgq
    public final ListenableFuture c(aqgb aqgbVar) {
        aozy createBuilder = aqic.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((aqic) apagVar).e = 3;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        ((aqic) apagVar2).f = 3;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        aqic aqicVar = (aqic) apagVar3;
        aqgbVar.getClass();
        aqicVar.c = aqgbVar;
        aqicVar.b |= 1;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        ((aqic) createBuilder.b).g = false;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UserDevices userDevices = (UserDevices) arrayList.get(i);
            Stream map = Collection.EL.stream(userDevices.getDeviceIds()).map(new tgn(16));
            int i2 = alog.d;
            Iterable iterable = (Iterable) map.collect(alls.a);
            aozy createBuilder2 = aqgg.a.createBuilder();
            aozy createBuilder3 = aqfn.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar4 = createBuilder3.b;
            ((aqfn) apagVar4).d = "RCS";
            asku askuVar = asku.PHONE_NUMBER;
            if (!apagVar4.isMutable()) {
                createBuilder3.u();
            }
            ((aqfn) createBuilder3.b).b = askuVar.a();
            String userId = userDevices.getUserId();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            aqfn aqfnVar = (aqfn) createBuilder3.b;
            userId.getClass();
            aqfnVar.c = userId;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            aqgg aqggVar = (aqgg) createBuilder2.b;
            aqfn aqfnVar2 = (aqfn) createBuilder3.s();
            aqfnVar2.getClass();
            aqggVar.c = aqfnVar2;
            aqggVar.b |= 1;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            aqgg aqggVar2 = (aqgg) createBuilder2.b;
            apax apaxVar = aqggVar2.d;
            if (!apaxVar.c()) {
                aqggVar2.d = apag.mutableCopy(apaxVar);
            }
            aoyj.addAll(iterable, aqggVar2.d);
            aqgg aqggVar3 = (aqgg) createBuilder2.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aqic aqicVar2 = (aqic) createBuilder.b;
            aqggVar3.getClass();
            apax apaxVar2 = aqicVar2.d;
            if (!apaxVar2.c()) {
                aqicVar2.d = apag.mutableCopy(apaxVar2);
            }
            aqicVar2.d.add(aqggVar3);
        }
        this.d = aqgbVar.c;
        return albo.bI((aqic) createBuilder.s());
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture d(veo veoVar, apbt apbtVar) {
        aqic aqicVar = (aqic) apbtVar;
        xyo d = a.d();
        d.H("Sent");
        d.z("GetPreKeyBatchRequest", aqicVar);
        d.q();
        aozy createBuilder = aqfn.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aqfn) createBuilder.b).c = this.c;
        aqar a2 = veoVar.b((aqfn) createBuilder.s()).a();
        aqrs aqrsVar = a2.a;
        aqux aquxVar = aqas.f;
        if (aquxVar == null) {
            synchronized (aqas.class) {
                aquxVar = aqas.f;
                if (aquxVar == null) {
                    aquu a3 = aqux.a();
                    a3.e = aquw.UNARY;
                    a3.a = aqux.c("google.internal.communications.instantmessaging.v1.Registration", "GetPreKeyBatch");
                    a3.b();
                    aqic aqicVar2 = aqic.a;
                    aozs aozsVar = arkx.a;
                    a3.c = new arkw(aqicVar2);
                    a3.d = new arkw(aqif.a);
                    aquxVar = a3.a();
                    aqas.f = aquxVar;
                }
            }
        }
        return akul.g(arlj.a(aqrsVar.a(aquxVar, a2.b), aqicVar));
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture e(apbt apbtVar) {
        long j;
        aqif aqifVar = (aqif) apbtVar;
        if (aqifVar != null) {
            aqgc aqgcVar = aqifVar.b;
            if (aqgcVar == null) {
                aqgcVar = aqgc.a;
            }
            j = aqgcVar.b;
        } else {
            j = 0;
        }
        this.e = j;
        return albo.bI(aqifVar);
    }

    @Override // defpackage.vgq
    public final String f() {
        return "DownloadPreKeysHandler";
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
}
