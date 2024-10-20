package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vfm implements vgq {
    private final String a;
    private String b = "";
    private long c = 0;

    public vfm(String str) {
        this.a = str;
    }

    @Override // defpackage.vgq
    public final long a() {
        return this.c;
    }

    @Override // defpackage.vgq
    public final vgp b() {
        return new vgm(this.a);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture c(aqgb aqgbVar) {
        aozy createBuilder = aqez.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqez aqezVar = (aqez) createBuilder.b;
        aqgbVar.getClass();
        aqezVar.c = aqgbVar;
        aqezVar.b |= 1;
        aqez aqezVar2 = (aqez) createBuilder.s();
        this.b = aqgbVar.c;
        return aktp.ag(aqezVar2);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture d(veo veoVar, apbt apbtVar) {
        aqez aqezVar = (aqez) apbtVar;
        aqar z = veoVar.d().z();
        aqrs aqrsVar = z.a;
        aqux aquxVar = aqas.h;
        if (aquxVar == null) {
            synchronized (aqas.class) {
                aquxVar = aqas.h;
                if (aquxVar == null) {
                    aquu a = aqux.a();
                    a.e = aquw.UNARY;
                    a.a = aqux.c("google.internal.communications.instantmessaging.v1.Registration", "UnregisterGoogleRCS");
                    a.b();
                    aqez aqezVar2 = aqez.a;
                    aozs aozsVar = arkx.a;
                    a.c = new arkw(aqezVar2);
                    a.d = new arkw(aqfa.a);
                    aquxVar = a.a();
                    aqas.h = aquxVar;
                }
            }
        }
        return akul.g(arlj.a(aqrsVar.a(aquxVar, z.b), aqezVar));
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture e(apbt apbtVar) {
        long j;
        aqfa aqfaVar = (aqfa) apbtVar;
        if (aqfaVar != null) {
            aqgc aqgcVar = aqfaVar.b;
            if (aqgcVar == null) {
                aqgcVar = aqgc.a;
            }
            j = aqgcVar.b;
        } else {
            j = 0;
        }
        this.c = j;
        return aktp.ag(aqfaVar);
    }

    @Override // defpackage.vgq
    public final String f() {
        return "UnregisterGoogleRcsHandler";
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
