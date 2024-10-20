package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vfa implements vgq {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler");
    public static final vdd b = vdd.a("Bugle.PhoneRegistrationRpc.Response");
    public static final utz c = uuh.i(uuh.b, "tachyon_fail_invalid_rcs_token", true);
    public static final utz d = uuh.i(uuh.b, "skip_rcs_token", false);
    public static final alhr e = albo.D(new ubz(14));
    public final armf f;
    public final wpp g;
    private final vcs h;
    private final anen i;
    private final msk j;
    private final armf k;
    private final vgm l;
    private final armf m;
    private final armf n;
    private final armf o;
    private String p = "";
    private long q = 0;
    private final vti r;
    private final wyp s;

    public vfa(vti vtiVar, vcs vcsVar, anen anenVar, wpp wppVar, wyp wypVar, msk mskVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, vgm vgmVar) {
        this.r = vtiVar;
        this.h = vcsVar;
        this.i = anenVar;
        this.g = wppVar;
        this.s = wypVar;
        this.j = mskVar;
        this.k = armfVar;
        this.l = vgmVar;
        this.o = armfVar5;
        this.m = armfVar2;
        this.n = armfVar3;
        this.f = armfVar4;
    }

    public static akul l(String str) {
        alvw i = a.i();
        i.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "failRegisterRequest", 447, "RegisterPhoneRpcHandler.java")).t("RegisterRequest failed to be created due to %s", str);
        return aktp.af(new aqwb(Status.k.d(new IllegalStateException(str))));
    }

    @Override // defpackage.vgq
    public final long a() {
        return this.q;
    }

    @Override // defpackage.vgq
    public final vgp b() {
        return this.l;
    }

    @Override // defpackage.vgq
    public final ListenableFuture c(final aqgb aqgbVar) {
        alvw g = a.g();
        g.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "createRequest", 188, "RegisterPhoneRpcHandler.java")).t("Phone registration request id: %s", aqgbVar.c);
        this.p = aqgbVar.c;
        vcs vcsVar = this.h;
        msh k = k();
        akul a2 = vcsVar.a(o());
        vfl q = this.r.q();
        q.k(new uvp(a2, 18));
        q.j();
        q.i();
        q.j = Optional.of(o());
        q.h();
        q.g(k, 1);
        q.e(k);
        q.f(k);
        final ListenableFuture b2 = q.b();
        final ListenableFuture submit = this.i.submit(akto.k(new uvp(this, 19)));
        return aktp.as(b2, submit).n(new ancr() { // from class: vey
            @Override // defpackage.ancr
            public final ListenableFuture a() {
                aozy aozyVar = (aozy) albo.bQ(b2);
                String str = (String) albo.bQ(submit);
                aozy createBuilder = aqfn.a.createBuilder();
                asku askuVar = asku.PHONE_NUMBER;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                vfa vfaVar = vfa.this;
                ((aqfn) createBuilder.b).b = askuVar.a();
                String o = vfaVar.o();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                o.getClass();
                ((aqfn) apagVar).c = o;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ((aqfn) createBuilder.b).d = "RCS";
                aqfn aqfnVar = (aqfn) createBuilder.s();
                aozy createBuilder2 = aqes.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                aqgb aqgbVar2 = aqgbVar;
                apag apagVar2 = createBuilder2.b;
                aqes aqesVar = (aqes) apagVar2;
                aqgbVar2.getClass();
                aqesVar.c = aqgbVar2;
                aqesVar.b |= 1;
                if (!apagVar2.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar3 = createBuilder2.b;
                aqes aqesVar2 = (aqes) apagVar3;
                aqfnVar.getClass();
                aqesVar2.d = aqfnVar;
                aqesVar2.b |= 2;
                if (!apagVar3.isMutable()) {
                    createBuilder2.u();
                }
                aqes aqesVar3 = (aqes) createBuilder2.b;
                aqep aqepVar = (aqep) aozyVar.s();
                aqepVar.getClass();
                aqesVar3.e = aqepVar;
                aqesVar3.b |= 4;
                if (((Boolean) vfa.d.e()).booleanValue()) {
                    alvw d2 = vfa.a.d();
                    d2.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "createPhoneRegisterRequest", 320, "RegisterPhoneRpcHandler.java")).q("Configured to omit RCS token");
                    return aktp.ag((aqes) createBuilder2.s());
                }
                if (TextUtils.isEmpty(str)) {
                    alvw d3 = vfa.a.d();
                    d3.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) d3).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "createPhoneRegisterRequest", 324, "RegisterPhoneRpcHandler.java")).q("No RCS token in RegisterRequest");
                    Optional n = vfaVar.n();
                    if (n.isEmpty()) {
                        if (((ofx) vfaVar.f.b()).a()) {
                            vfaVar.p(vez.UNKNOWN_BACKEND_NO_TOKEN);
                            return aktp.ag((aqes) createBuilder2.s());
                        }
                        vfaVar.p(vez.UNKNOWN_BACKEND_NO_TOKEN_BLOCKED);
                        return vfa.l("Missing RCS token for unknown backend");
                    }
                    if (((Boolean) n.get()).booleanValue()) {
                        vfaVar.p(vez.JIBE_NO_TOKEN_BLOCKED);
                        return vfa.l("Missing RCS token for Jibe");
                    }
                    alvw g2 = vfa.a.g();
                    g2.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "buildRequestWithoutIdentityProof", 363, "RegisterPhoneRpcHandler.java")).q("Creating RegisterRequest without RCS token for 3P");
                    vfaVar.p(vez.THIRD_PARTY_NO_TOKEN);
                    return aktp.ag((aqes) createBuilder2.s());
                }
                Optional n2 = vfaVar.n();
                if (n2.isEmpty()) {
                    alvw g3 = vfa.a.g();
                    g3.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "logRcsTokenStatus", 434, "RegisterPhoneRpcHandler.java")).q("Creating RegisterRequest with RCS token. Backend type is unknown.");
                    vfaVar.p(vez.UNKNOWN_BACKEND_HAS_TOKEN);
                } else if (((Boolean) n2.get()).booleanValue()) {
                    alvw g4 = vfa.a.g();
                    g4.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) g4).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "logRcsTokenStatus", 437, "RegisterPhoneRpcHandler.java")).q("Creating RegisterRequest with RCS token for Jibe");
                    vfaVar.p(vez.JIBE_HAS_TOKEN);
                } else {
                    alvw i = vfa.a.i();
                    i.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "logRcsTokenStatus", 441, "RegisterPhoneRpcHandler.java")).q("Creating RegisterRequest with RCS token for 3P");
                    vfaVar.p(vez.THIRD_PARTY_HAS_TOKEN);
                }
                Boolean bool = (Boolean) vfa.c.e();
                boolean booleanValue = bool.booleanValue();
                alvw g5 = vfa.a.g();
                g5.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g5).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "buildRequestWithIdentityProof", 371, "RegisterPhoneRpcHandler.java")).t("Using RCS token in RegisterRequest, failInvalidToken: %b", bool);
                aozy createBuilder3 = aqdp.a.createBuilder();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar4 = createBuilder3.b;
                str.getClass();
                ((aqdp) apagVar4).b = str;
                if (booleanValue) {
                    if (!apagVar4.isMutable()) {
                        createBuilder3.u();
                    }
                    ((aqdp) createBuilder3.b).c = a.ap(3);
                }
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                aqes aqesVar4 = (aqes) createBuilder2.b;
                aqdp aqdpVar = (aqdp) createBuilder3.s();
                aqdpVar.getClass();
                aqesVar4.f = aqdpVar;
                aqesVar4.b |= 64;
                return aktp.ag((aqes) createBuilder2.s());
            }
        }, andi.a);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture d(veo veoVar, apbt apbtVar) {
        aqes aqesVar = (aqes) apbtVar;
        vel D = this.s.D(o());
        aqep aqepVar = aqesVar.e;
        if (aqepVar == null) {
            aqepVar = aqep.a;
        }
        return D.j(vew.k(aqepVar), vew.q(aqepVar), vew.o(aqepVar), vew.p(aqepVar)).i(new ukk((Object) this, (Object) veoVar, (Object) aqesVar, 13, (byte[]) null), this.i);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture e(apbt apbtVar) {
        long j;
        aqet aqetVar = (aqet) apbtVar;
        if (aqetVar != null) {
            aqgc aqgcVar = aqetVar.c;
            if (aqgcVar == null) {
                aqgcVar = aqgc.a;
            }
            j = aqgcVar.b;
        } else {
            j = 0;
        }
        this.q = j;
        return albo.bI(aqetVar);
    }

    @Override // defpackage.vgq
    public final String f() {
        return "RegisterPhoneRpcHandler";
    }

    @Override // defpackage.vgq
    public final String g() {
        return this.p;
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

    public final msh k() {
        return this.j.r(o());
    }

    public final Optional m() {
        armf armfVar = this.n;
        return ((adje) this.m.b()).j(((adae) armfVar.b()).d(o()));
    }

    public final Optional n() {
        Optional m = m();
        if (m.isEmpty()) {
            alvw i = a.i();
            i.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "isJibeBackendOrEmpty", 383, "RegisterPhoneRpcHandler.java")).q("Can not determine backend type due to missing RCS configuration.");
        }
        return m.flatMap(new vbi(20));
    }

    public final String o() {
        vev vevVar = (vev) this.o.b();
        String str = this.l.a;
        vevVar.a(str, 1);
        return str;
    }

    public final void p(vez vezVar) {
        alvw d2 = a.d();
        d2.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "logRcsTokenStatus", 427, "RegisterPhoneRpcHandler.java")).t("RCS token status: %s", vezVar);
        ((mbl) this.k.b()).e("Bugle.PhoneRegistrationRpc.RcsTokenStatus", vezVar.i);
    }
}
