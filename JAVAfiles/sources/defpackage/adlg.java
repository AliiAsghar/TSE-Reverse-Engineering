package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;
import java.net.MalformedURLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlg extends adll {
    final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlg(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    private final void q(String str) {
        this.a.D.d("Building config request with MSISDN token", new Object[0]);
        this.a.aD(27);
        try {
            String v = this.a.v();
            Configuration k = this.a.k();
            adlw adlwVar = this.a;
            adlx adlxVar = adlwVar.v;
            adnw a = adlxVar.a(adlwVar.s, adlwVar.p, adlwVar.n);
            Object obj = adlxVar.b;
            advr.o("Using MSISDN Token authenticated config server query", new Object[0]);
            admw b = aday.b();
            aozy i = b.i();
            if (!i.b.isMutable()) {
                i.u();
            }
            apig apigVar = (apig) i.b;
            apig apigVar2 = apig.a;
            v.getClass();
            apigVar.b |= 2;
            apigVar.d = v;
            b.a = Optional.of("provision");
            b.h(3);
            b.b("rcs_msisdn_token", str);
            b.d(aday.c(((aday) obj).z(v, k, a, new adtl(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE), b).build().toString()));
            b.g(apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE);
            String str2 = this.a.r;
            if (str2 != null) {
                b.e(str2);
            }
            adkf a2 = adkg.a();
            this.a.x(this, b, a2);
            adlw adlwVar2 = this.a;
            String str3 = adlwVar2.n;
            if (((Boolean) adkh.a.a()).booleanValue() || adlwVar2.ae.c(str3).M) {
                adlw adlwVar3 = this.a;
                String c = adlwVar3.v.c(adlwVar3.p, adlwVar3.n);
                a2.a = str;
                a2.c(c);
                a2.e = Optional.ofNullable(this.a.r);
                if (((Boolean) adkh.a.a()).booleanValue()) {
                    adlw adlwVar4 = this.a;
                    a2.d = adlwVar4.v.b(adlwVar4.s, adlwVar4.n);
                    this.a.aH.h(a2.a(), b);
                } else {
                    adlw adlwVar5 = this.a;
                    if (adlwVar5.ae.c(adlwVar5.n).M) {
                        this.a.aH.i(a2.a(), b);
                    }
                }
            }
            this.a.D.a("Msisdn token config request ready. Scheduling config request message", new Object[0]);
            this.a.V(adjj.MSG_SEND_CONFIG_REQUEST, b.a());
        } catch (MalformedURLException e) {
            adlw adlwVar6 = this.a;
            adlwVar6.az(adjj.MSG_EXCEPTION_CAUGHT, adlwVar6.q);
            this.a.L(apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE);
            this.a.D.e("Failed to request with msisdn token when building query. %s", advq.URI.c(e));
            this.a.K(apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE);
        }
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "RequestWithMsisdnTokenState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        super.b();
        this.a.D(apjx.REQUEST_WITH_MSISDN_TOKEN_STAGE);
        this.a.D.a("Waiting for message with msisdn token", new Object[0]);
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_REQUEST_WITH_MSISDN_TOKEN;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE;
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

    /* JADX WARN: Removed duplicated region for block: B:49:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017c  */
    @Override // defpackage.admi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(android.os.Message r9, defpackage.adjj r10) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adlg.k(android.os.Message, adjj):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.adll
    public final boolean m() {
        Optional empty;
        adlw adlwVar = this.a;
        try {
            empty = Optional.of(adlwVar.z.b.i("msisdn_token_for_sim_".concat(String.valueOf(adlwVar.n)), "", "bugle"));
        } catch (adux e) {
            advr.j(e, adnk.a, "Error while retrieving MSISDN token from bugle storage", new Object[0]);
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            if (TextUtils.isEmpty(empty.get())) {
                this.a.D.e("Not replaying UPI request. Token exists, but is empty", new Object[0]);
                return false;
            }
            this.a.D.d("Replaying UPI request with existing token", new Object[0]);
            this.a.B(adjj.MSG_VERIFY_NUMBER_SUCCESS, empty.get());
            return true;
        }
        this.a.D.a("Not replaying UPI request. Token not set", new Object[0]);
        return false;
    }
}
