package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ysc extends arpw implements arqv {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ysj d;
    final /* synthetic */ boolean e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysc(ysj ysjVar, boolean z, arpe arpeVar) {
        super(2, arpeVar);
        this.d = ysjVar;
        this.e = z;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ysc) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        apzi apziVar;
        aquc aqucVar;
        Object n;
        apzi apziVar2;
        aqgb aqgbVar;
        arwl arwlVar;
        Object n2;
        aqgb aqgbVar2;
        aqfn aqfnVar;
        apzi apziVar3;
        arpl arplVar = arpl.a;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                aqfnVar = (aqfn) this.b;
                aqgbVar2 = (aqgb) this.a;
                apziVar3 = (apzi) this.f;
                aqil.P(obj);
                n2 = obj;
                return new ysb(apziVar3, aqgbVar2, aqfnVar, (aqge) n2);
            }
            aqgbVar = (aqgb) this.b;
            apzi apziVar4 = (apzi) this.a;
            arwl arwlVar2 = (arwl) this.f;
            aqil.P(obj);
            arwlVar = arwlVar2;
            apziVar2 = apziVar4;
            n = obj;
        } else {
            aqil.P(obj);
            arwe arweVar = (arwe) this.f;
            ysa ysaVar = (ysa) this.d.e.b();
            synchronized (ysaVar.e) {
                if (ysaVar.d == null) {
                    try {
                        vcv vcvVar = (vcv) ysaVar.c.b();
                        synchronized (vcvVar.u) {
                            aqucVar = vcvVar.t;
                            if (aqucVar == null) {
                                alvw d = vcv.a.d();
                                d.X(alwp.a, "BugleNetwork");
                                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getTachyonSpamChannel", 308, "GrpcChannelManager.java")).q("Creating Tachyon Spam gRPC Channel");
                                aqucVar = vcvVar.a((String) vcv.d.e(), vcvVar.f(7));
                                vcvVar.t = aqucVar;
                            }
                        }
                        ysaVar.d = (apzi) ((apzi) apzi.g(new wci(7), aqucVar)).i(new arll(((vcv) ysaVar.c.b()).d(), 0));
                    } catch (Exception e) {
                        ((alvg) ((alvg) ysa.a.i()).g(e).h("com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamAbuseStub", "getAbuseStub", 36, "TachyonSpamAbuseStub.kt")).q("Cannot create stub for spam tachyon grpc");
                        apziVar = null;
                    }
                }
                apzi apziVar5 = ysaVar.d;
                apziVar5.getClass();
                apziVar = (apzi) apziVar5.h(((Number) ysa.b.e()).intValue(), TimeUnit.SECONDS);
            }
            if (apziVar == null) {
                return null;
            }
            aozy S = ((wpp) this.d.h.b()).S("Bugle");
            aqgb aqgbVar3 = (aqgb) S.b;
            String str = aqgbVar3.c;
            str.getClass();
            aqfn aqfnVar2 = aqgbVar3.g;
            if (aqfnVar2 == null) {
                aqfnVar2 = aqfn.a;
            }
            if (aqfnVar2 != null) {
                if (str.length() > 0) {
                    apag s = S.s();
                    s.getClass();
                    aqgb aqgbVar4 = (aqgb) s;
                    arwl I = arrn.I(arweVar, null, null, new jmw(this.d, this.e, (arpe) null, 9), 3);
                    arwl I2 = arrn.I(arweVar, null, null, new jmw(this.d, this.e, (arpe) null, 10, (byte[]) null), 3);
                    this.f = I2;
                    this.a = apziVar;
                    this.b = aqgbVar4;
                    this.c = 1;
                    n = I.n(this);
                    if (n != arplVar) {
                        apziVar2 = apziVar;
                        aqgbVar = aqgbVar4;
                        arwlVar = I2;
                    }
                    return arplVar;
                }
                throw new IllegalStateException("Check failed.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        aqfn aqfnVar3 = (aqfn) n;
        this.f = apziVar2;
        this.a = aqgbVar;
        this.b = aqfnVar3;
        this.c = 2;
        n2 = arwlVar.n(this);
        if (n2 != arplVar) {
            aqgbVar2 = aqgbVar;
            aqfnVar = aqfnVar3;
            apziVar3 = apziVar2;
            return new ysb(apziVar3, aqgbVar2, aqfnVar, (aqge) n2);
        }
        return arplVar;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        ysc yscVar = new ysc(this.d, this.e, arpeVar);
        yscVar.f = obj;
        return yscVar;
    }
}
