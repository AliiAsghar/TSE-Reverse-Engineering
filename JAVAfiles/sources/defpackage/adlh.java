package defpackage;

import android.os.Message;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlh extends adll {
    final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlh(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "RequestWithTokenState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        String l;
        super.b();
        this.a.D(apjx.REQUEST_WITH_TOKEN_STAGE);
        Configuration k = this.a.k();
        String f = k.f();
        if (f == null) {
            this.a.D.a("No token exist, Skip request with token", new Object[0]);
            n(this.a.ai, apkn.RCS_PROVISIONING_READY_STATE);
            return;
        }
        adlw adlwVar = this.a;
        if (adlwVar.H) {
            wxb wxbVar = adlwVar.I;
            wxbVar.getClass();
            l = adlwVar.z.m(wxbVar);
        } else {
            l = adlwVar.z.l();
        }
        String str = l;
        int e = this.a.e();
        try {
            admw a = admx.a(apkn.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE, Optional.ofNullable(this.a.r));
            String v = this.a.v();
            this.a.H(v);
            adlw adlwVar2 = this.a;
            adlwVar2.v.d(adlwVar2.s, v, k, str, f, e, adlwVar2.p, adlwVar2.n, a);
            this.a.aD(27);
            this.a.y(a);
            adkf a2 = adkg.a();
            this.a.x(this, a, a2);
            adlw adlwVar3 = this.a;
            if (adlwVar3.al(adlwVar3.n)) {
                adlw adlwVar4 = this.a;
                a2.c(adlwVar4.v.c(adlwVar4.p, adlwVar4.n));
                a2.d(str);
                a2.e = Optional.ofNullable(this.a.r);
                if (((Boolean) adkh.c.a()).booleanValue()) {
                    a.h(3);
                    if (((Boolean) adkh.b.a()).booleanValue()) {
                        adlw adlwVar5 = this.a;
                        a2.d = adlwVar5.v.b(adlwVar5.s, adlwVar5.n);
                        this.a.aH.h(a2.a(), a);
                    }
                } else {
                    adlw adlwVar6 = this.a;
                    if (adlwVar6.ae.c(adlwVar6.n).M) {
                        this.a.aH.i(a2.a(), a);
                    }
                }
            }
            this.a.V(adjj.MSG_SEND_CONFIG_REQUEST, a.a());
        } catch (MalformedURLException e2) {
            this.a.L(apkn.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE);
            this.a.D.e("Request with token failed while building query. %s", advq.URI.c(e2));
            this.a.K(apkn.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE);
            n(this.a.am, apkn.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE);
        }
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_REQUEST_WITH_TOKEN;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE;
    }

    @Override // defpackage.adll
    public final boolean h() {
        return true;
    }

    @Override // defpackage.adll
    public final boolean j() {
        return true;
    }

    @Override // defpackage.admi
    public final boolean k(Message message, adjj adjjVar) {
        this.a.J("RequestWithTokenState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 4) {
            if (ordinal != 46) {
                switch (ordinal) {
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                        this.a.N((HttpURLConnection) message.obj, message.arg2, this);
                        return true;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                        adlw adlwVar = this.a;
                        adlwVar.u.a((HttpURLConnection) message.obj, null, "RequestWithTokenState");
                        adlw adlwVar2 = this.a;
                        adko adkoVar = adlwVar2.x;
                        String str = adlwVar2.n;
                        Configuration f = adkoVar.b.f(str);
                        if (f != null && f.mConfigState == 2) {
                            adkoVar.b.u(str, null);
                        } else {
                            adkoVar.b(str);
                        }
                        adkoVar.a.q(false);
                        adkoVar.a.o(null);
                        adkoVar.a.r("");
                        if (!((acwq) adkoVar.d.b()).a()) {
                            str = adkoVar.c.l();
                        }
                        adkoVar.d(str, "");
                        adkoVar.a.y();
                        this.a.aH(apkn.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE, 403);
                        adlw adlwVar3 = this.a;
                        adlwVar3.ac(adlwVar3.an);
                        return true;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                        adlw adlwVar4 = this.a;
                        adlwVar4.u.a((HttpURLConnection) message.obj, null, "RequestWithTokenState");
                        adlw adlwVar5 = this.a;
                        adlwVar5.x.b(adlwVar5.n);
                        adlw adlwVar6 = this.a;
                        adlwVar6.ac(adlwVar6.ai);
                        return true;
                    default:
                        return super.o(message, adjjVar);
                }
            }
            adlw adlwVar7 = this.a;
            adlwVar7.u.a((HttpURLConnection) message.obj, null, "RequestWithTokenState");
            this.a.aH(apkn.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE, 401);
            if (!aczv.V()) {
                return false;
            }
            this.a.z.p(null);
            adlw adlwVar8 = this.a;
            adlwVar8.ac(adlwVar8.an);
            return true;
        }
        this.a.aI(message.arg1);
        return false;
    }
}
