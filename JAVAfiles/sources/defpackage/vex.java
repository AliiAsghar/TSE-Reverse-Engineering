package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vex implements vgq {
    public final yjy a;
    public final yjr b;
    public final yep c;
    private final anen d;
    private final vcs e;
    private String f = "";
    private long g = 0;
    private final vti h;

    public vex(anen anenVar, vti vtiVar, vcs vcsVar, yjy yjyVar, yjr yjrVar, yep yepVar) {
        this.d = anenVar;
        this.h = vtiVar;
        this.e = vcsVar;
        this.a = yjyVar;
        this.b = yjrVar;
        this.c = yepVar;
    }

    public static aqem k(String str) {
        aozy createBuilder = aqem.a.createBuilder();
        String upperCase = str.toUpperCase(Locale.US);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        upperCase.getClass();
        ((aqem) apagVar).c = upperCase;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((aqem) createBuilder.b).b = a.an(4);
        return (aqem) createBuilder.s();
    }

    public static final ListenableFuture l(veo veoVar, aqen aqenVar) {
        aqar z = veoVar.c().z();
        aqrs aqrsVar = z.a;
        aqux aquxVar = aqas.b;
        if (aquxVar == null) {
            synchronized (aqas.class) {
                aquxVar = aqas.b;
                if (aquxVar == null) {
                    aquu a = aqux.a();
                    a.e = aquw.UNARY;
                    a.a = aqux.c("google.internal.communications.instantmessaging.v1.Registration", "RegisterAnonymous");
                    a.b();
                    aqen aqenVar2 = aqen.a;
                    aozs aozsVar = arkx.a;
                    a.c = new arkw(aqenVar2);
                    a.d = new arkw(aqeo.a);
                    aquxVar = a.a();
                    aqas.b = aquxVar;
                }
            }
        }
        return arlj.a(aqrsVar.a(aquxVar, z.b), aqenVar);
    }

    @Override // defpackage.vgq
    public final long a() {
        return this.g;
    }

    @Override // defpackage.vgq
    public final vgp b() {
        return vgp.b;
    }

    @Override // defpackage.vgq
    public final ListenableFuture c(aqgb aqgbVar) {
        this.f = aqgbVar.c;
        vfl q = this.h.q();
        q.j();
        vcs vcsVar = this.e;
        vcsVar.getClass();
        q.k(new uvp(vcsVar, 17));
        return aktp.Y(q.b(), new uvz(this, aqgbVar, 11), this.d);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture d(veo veoVar, apbt apbtVar) {
        return l(veoVar, (aqen) apbtVar);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture e(apbt apbtVar) {
        long j;
        aqeo aqeoVar = (aqeo) apbtVar;
        if (aqeoVar != null) {
            aqgc aqgcVar = aqeoVar.c;
            if (aqgcVar == null) {
                aqgcVar = aqgc.a;
            }
            j = aqgcVar.b;
        } else {
            j = 0;
        }
        this.g = j;
        return albo.bI(aqeoVar);
    }

    @Override // defpackage.vgq
    public final String f() {
        return "RegisterAnonymousRpcHandler";
    }

    @Override // defpackage.vgq
    public final String g() {
        return this.f;
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
