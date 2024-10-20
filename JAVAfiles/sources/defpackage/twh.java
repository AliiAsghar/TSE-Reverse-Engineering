package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class twh implements vgq {
    private final TachyonCommon$PublicPreKeySets a;
    private final String b;
    private String c = "";
    private long d = 0;

    public twh(TachyonCommon$PublicPreKeySets tachyonCommon$PublicPreKeySets, String str) {
        this.a = tachyonCommon$PublicPreKeySets;
        this.b = str;
    }

    @Override // defpackage.vgq
    public final long a() {
        return this.d;
    }

    @Override // defpackage.vgq
    public final vgp b() {
        return new vgm(this.b);
    }

    @Override // defpackage.vgq
    public final ListenableFuture c(aqgb aqgbVar) {
        aozy createBuilder = aqii.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aqii aqiiVar = (aqii) apagVar;
        aqgbVar.getClass();
        aqiiVar.c = aqgbVar;
        aqiiVar.b |= 1;
        TachyonCommon$PublicPreKeySets tachyonCommon$PublicPreKeySets = this.a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        aqii aqiiVar2 = (aqii) createBuilder.b;
        tachyonCommon$PublicPreKeySets.getClass();
        aqiiVar2.d = tachyonCommon$PublicPreKeySets;
        aqiiVar2.b |= 2;
        aqii aqiiVar3 = (aqii) createBuilder.s();
        this.c = aqgbVar.c;
        return albo.bI(aqiiVar3);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture d(veo veoVar, apbt apbtVar) {
        aqii aqiiVar = (aqii) apbtVar;
        aozy createBuilder = aqfn.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aqfn) createBuilder.b).c = this.b;
        aqar a = veoVar.b((aqfn) createBuilder.s()).a();
        aqrs aqrsVar = a.a;
        aqux aquxVar = aqas.g;
        if (aquxVar == null) {
            synchronized (aqas.class) {
                aquxVar = aqas.g;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("google.internal.communications.instantmessaging.v1.Registration", "SetPreKeys");
                    a2.b();
                    aqii aqiiVar2 = aqii.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(aqiiVar2);
                    a2.d = new arkw(aqij.a);
                    aquxVar = a2.a();
                    aqas.g = aquxVar;
                }
            }
        }
        return akul.g(arlj.a(aqrsVar.a(aquxVar, a.b), aqiiVar));
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture e(apbt apbtVar) {
        long j;
        aqij aqijVar = (aqij) apbtVar;
        if (aqijVar != null) {
            aqgc aqgcVar = aqijVar.b;
            if (aqgcVar == null) {
                aqgcVar = aqgc.a;
            }
            j = aqgcVar.b;
        } else {
            j = 0;
        }
        this.d = j;
        return ancd.f(ancj.f(anee.o(albo.bI(aqijVar)), new tvd(13), andi.a), Throwable.class, new tvd(14), andi.a);
    }

    @Override // defpackage.vgq
    public final String f() {
        return "UploadPreKeysHandler";
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
