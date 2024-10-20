package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aayc extends arpw implements arqv {
    final /* synthetic */ aayd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aayc(aayd aaydVar, arpe arpeVar) {
        super(2, arpeVar);
        this.a = aaydVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aayc) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        aayd aaydVar = this.a;
        boolean z = true;
        if (aczv.x() && aczv.X()) {
            if (((wih) aaydVar.j.b()).a().equals(wiz.TOGGLE_STATE_USER_DISABLED)) {
                aayd.a.m().q("Not showing Legal FYI: Global Toggle User Disabled");
            } else if (((xvu) aaydVar.e.b()).f()) {
                aayd.a.m().q("Not showing Legal FYI: ToS already accepted");
            } else if (!((ykw) aaydVar.d.b()).q("should_show_rcs_default_on_prompt", false)) {
                aayd.a.m().q("Not showing Legal FYI: the show bit is not set");
            } else {
                whk a = aaydVar.k.a();
                if (a.equals(whk.LEGAL_FYI_SEEN)) {
                    aayd.a.m().t("Not showing Legal FYI: consent state is set to %s", a);
                } else {
                    for (adiv adivVar : ((wwn) aaydVar.i.b()).n()) {
                        a.getClass();
                        aouh c = ((vau) aaydVar.h.b()).c(adom.n(adivVar).a);
                        if (!c.t) {
                            aayd.a.m().q("Not showing Legal FYI for SIM: Feature flag is disabled");
                        } else if (!c.n) {
                            aayd.a.m().q("Not showing Legal FYI for SIM: showGoogleTos is false");
                        } else {
                            if (!c.s || a != whk.OOB_CONSENT || !((vrn) aaydVar.f.a()).w(adivVar).equals(amwt.AVAILABLE)) {
                                break;
                            }
                            aayd.a.m().q("Not showing Legal FYI for SIM: already provisioned with OOB flow.");
                        }
                    }
                }
            }
            z = false;
        } else {
            if (((wih) aaydVar.j.b()).a().equals(wiz.TOGGLE_STATE_USER_DISABLED)) {
                aayd.a.m().q("Not showing Legal FYI: Global Toggle User Disabled");
            } else if (!aczv.D()) {
                aayd.a.m().q("Not showing Legal FYI: Feature flag is disabled");
            } else if (!actx.f()) {
                aayd.a.m().q("Not showing Legal FYI: Not RCS eligible");
            } else if (((xvu) aaydVar.e.b()).f()) {
                aayd.a.m().q("Not showing Legal FYI: ToS already accepted");
            } else if (!((ykw) aaydVar.d.b()).q("should_show_rcs_default_on_prompt", false)) {
                aayd.a.m().q("Not showing RCS Default On because the show bit is not set");
            } else {
                whk a2 = aaydVar.k.a();
                if (aczv.G() && a2.equals(whk.OOB_CONSENT)) {
                    vrn vrnVar = (vrn) aaydVar.f.a();
                    String l = ((adtn) aaydVar.g.b()).l();
                    l.getClass();
                    if (vrnVar.w(new adiw(l)).equals(amwt.AVAILABLE)) {
                        aayd.a.m().q("Not showing RCS Default On because user was already provisioned with OOB flow.");
                    }
                }
                if (a2.equals(whk.LEGAL_FYI_SEEN)) {
                    aayd.a.m().t("Not showing RCS Default On because consent state is set: %s", a2);
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new aayc(this.a, arpeVar);
    }
}
