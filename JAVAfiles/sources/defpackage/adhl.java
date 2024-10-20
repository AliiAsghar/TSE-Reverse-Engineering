package defpackage;

import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhl extends adhd {
    final /* synthetic */ adhw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adhl(adhw adhwVar) {
        super(adhwVar);
        this.b = adhwVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "RegisteredState";
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final void b() {
        ailh ailhVar;
        super.b();
        this.b.E.c();
        adhw adhwVar = this.b;
        if (adhwVar.l) {
            aior aiorVar = adhwVar.v;
            String str = adhwVar.w;
            if (aiorVar != null && str != null) {
                ajqc a = adfp.a();
                a.m(aiorVar.e());
                a.a = str;
                if (aiorVar.n()) {
                    ailhVar = ailh.TLS;
                } else if (aiorVar.m()) {
                    ailhVar = ailh.TCP;
                } else {
                    ailhVar = ailh.UDP;
                }
                a.n(ailhVar);
                a.l(aiorVar.a());
                a.k(this.b.A);
                this.b.q.a = a.j();
            } else {
                advr.h(adhwVar.m, "SipTransport or Public User Identity is null.", new Object[0]);
                adhw adhwVar2 = this.b;
                adhwVar2.w(adhwVar2.ac);
                return;
            }
        }
        adhw adhwVar3 = this.b;
        aijw aijwVar = adhwVar3.t;
        if (aijwVar != null) {
            advp advpVar = adhwVar3.m;
            String ag = albo.ag(aijwVar.a);
            advr.d(advpVar, "Notify Registered. CallId=%s", ag);
            adhwVar3.N.execute(new adhc(adhwVar3, ag, 1, null));
            adhwVar3.N.execute(new adha(adhwVar3, 5));
            adhw adhwVar4 = this.b;
            adhwVar4.p.e(adhwVar4.x, adhwVar4.A);
        }
        this.b.K();
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final void c() {
        super.c();
        adhw adhwVar = this.b;
        adhwVar.z();
        adhwVar.p(14);
        this.b.I.c();
        adhw adhwVar2 = this.b;
        if (adhwVar2.l) {
            adhwVar2.q.c();
        }
        adhw adhwVar3 = this.b;
        acok acokVar = adhwVar3.B;
        advr.d(adhwVar3.m, "Notify Terminated. reason=%s", acokVar);
        adhwVar3.N.execute(new adha(adhwVar3, 3));
        adhwVar3.N.execute(new acaj(adhwVar3, acokVar, 20));
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 4) {
            if (i != 5) {
                if (i != 8 && i != 9) {
                    if (i != 14) {
                        if (i != 17) {
                            if (i != 21) {
                                return super.e(message);
                            }
                            advr.r(this.b.m, "Network is lost.", new Object[0]);
                            this.b.O();
                            this.b.N(acok.NETWORK_ERROR);
                            adhw adhwVar = this.b;
                            adhwVar.w(adhwVar.ad);
                            return true;
                        }
                        this.b.N(acok.SIM_REMOVED);
                        adhw adhwVar2 = this.b;
                        adhwVar2.w(adhwVar2.ac);
                        return true;
                    }
                    adhw adhwVar3 = this.b;
                    adhwVar3.w(adhwVar3.aa);
                    return true;
                }
                this.b.N(message.obj);
                adhw adhwVar4 = this.b;
                advr.d(adhwVar4.m, "Deregistering. reason=%s", adhwVar4.B);
                if (!acok.NETWORK_ERROR.equals(message.obj) && !acok.NO_RETRY_NO_DEREGISTER_FOR_TEST.equals(message.obj)) {
                    adhw adhwVar5 = this.b;
                    adhwVar5.w(adhwVar5.ac);
                    return true;
                }
                adhw adhwVar6 = this.b;
                adhwVar6.w(adhwVar6.ad);
                return true;
            }
            Bundle bundle = (Bundle) message.obj;
            this.b.C(bundle.getString("transport_id"), (Throwable) bundle.getSerializable("transport_error_cause"));
            return true;
        }
        int i2 = message.arg1;
        NetworkInfo networkInfo = (NetworkInfo) message.obj;
        adhw adhwVar7 = this.a;
        if (adhwVar7.l) {
            advr.d(adhwVar7.m, "Using network callback for connectivity detection, ignore Connectivity Events.", new Object[0]);
        } else {
            advr.p(adhwVar7.m, "state=%d activeNetworkInfo=%s:", Integer.valueOf(i2), networkInfo);
            if (((Boolean) adhw.h.a()).booleanValue() || networkInfo != null) {
                if (i2 == 1) {
                    if (networkInfo != null) {
                        this.a.al.h();
                        adey f = this.a.al.f();
                        if (f == null) {
                            advr.l(this.a.m, "No network for RCS.", new Object[0]);
                            this.a.N(acok.NETWORK_ERROR);
                            adhw adhwVar8 = this.a;
                            adhwVar8.w(adhwVar8.ad);
                        } else if (f.l != super.f()) {
                            advr.l(this.a.m, "Preferred network changed. Re-registering.", new Object[0]);
                            this.a.s(9, acok.NETWORK_CHANGE);
                        }
                    }
                } else if (networkInfo == null || super.f() == networkInfo.getType()) {
                    advr.l(this.a.m, "Network is lost. type:%d", Integer.valueOf(super.f()));
                    this.a.N(acok.NETWORK_ERROR);
                    adhw adhwVar9 = this.a;
                    adhwVar9.w(adhwVar9.ad);
                }
            }
        }
        return true;
    }
}
