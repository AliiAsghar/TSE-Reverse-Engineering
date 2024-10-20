package defpackage;

import android.os.Message;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import j$.util.Optional;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adld extends adll {
    final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adld(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "RequestWithHeState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        super.b();
        this.a.D(apjx.REQUEST_WITH_HE_STAGE);
        adlw adlwVar = this.a;
        adnt adntVar = adlwVar.A;
        Optional p = adlwVar.p();
        if (!adntVar.i(adntVar.e(p))) {
            adntVar.s(new abes(9), p);
        }
        try {
            String v = this.a.v();
            this.a.aD(27);
            this.a.H(v);
            admw a = admx.a(apkn.RCS_PROVISIONING_REQUEST_WITH_HE_STATE, Optional.ofNullable(this.a.r));
            a.d(v);
            aozy i = a.i();
            if (!i.b.isMutable()) {
                i.u();
            }
            apig apigVar = (apig) i.b;
            apig apigVar2 = apig.a;
            v.getClass();
            apigVar.b |= 2;
            apigVar.d = v;
            this.a.V(adjj.MSG_SEND_CONFIG_REQUEST_OVER_MOBILE_NETWORK, a.a());
        } catch (MalformedURLException e) {
            this.a.L(apkn.RCS_PROVISIONING_REQUEST_WITH_HE_STATE);
            this.a.D.e("Failed to request with header enrichment when building query. %s", advq.URI.c(e));
            this.a.K(apkn.RCS_PROVISIONING_REQUEST_WITH_HE_STATE);
            n(this.a.af, apkn.RCS_PROVISIONING_ENABLED_STATE);
        }
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_REQUEST_WITH_HE;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_REQUEST_WITH_HE_STATE;
    }

    @Override // defpackage.adll
    public final boolean h() {
        return true;
    }

    @Override // defpackage.adll
    public final boolean i() {
        return false;
    }

    @Override // defpackage.adll
    public final boolean j() {
        return true;
    }

    @Override // defpackage.admi
    public final boolean k(Message message, adjj adjjVar) {
        this.a.J("RequestWithHeState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 4) {
            if (ordinal != 24) {
                if (ordinal != 21) {
                    if (ordinal != 22) {
                        switch (ordinal) {
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                            case 48:
                            case 49:
                            case 50:
                                adlw adlwVar = this.a;
                                adlwVar.u.c(adlwVar.s, adlwVar.n, (HttpURLConnection) message.obj);
                                break;
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                                HttpURLConnection httpURLConnection = (HttpURLConnection) message.obj;
                                adlw adlwVar2 = this.a;
                                adlwVar2.aE.d(adlwVar2.s, apkn.RCS_PROVISIONING_REQUEST_WITH_HE_STATE, adlwVar2.r, new adiw(adlwVar2.n), apkk.HE_REQUEST_SUCCESSFUL);
                                adlw adlwVar3 = this.a;
                                adlwVar3.ac(adlwVar3.ar);
                                this.a.u.a(httpURLConnection, null, "RequestWithHeState");
                                adlw adlwVar4 = this.a;
                                adlwVar4.u.c(adlwVar4.s, adlwVar4.n, httpURLConnection);
                                return true;
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                                HttpURLConnection httpURLConnection2 = (HttpURLConnection) message.obj;
                                adlw adlwVar5 = this.a;
                                adlwVar5.ac(adlwVar5.am);
                                this.a.u.a((HttpURLConnection) message.obj, null, "RequestWithHeState");
                                adlw adlwVar6 = this.a;
                                adlwVar6.u.c(adlwVar6.s, adlwVar6.n, httpURLConnection2);
                                return true;
                        }
                        return super.o(message, adjjVar);
                    }
                    this.a.aD(34);
                    return false;
                }
                this.a.aD(33);
                adlw adlwVar7 = this.a;
                adlwVar7.ac(adlwVar7.am);
                return true;
            }
            this.a.aD(32);
            adlw adlwVar8 = this.a;
            adlwVar8.ac(adlwVar8.am);
            this.a.u.a((HttpURLConnection) message.obj, null, "RequestWithHeState");
            return true;
        }
        this.a.aI(message.arg1);
        return false;
    }
}
