package defpackage;

import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import j$.util.Optional;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlo extends adll {
    String a;
    final /* synthetic */ adlw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlo(adlw adlwVar) {
        super(adlwVar);
        this.b = adlwVar;
    }

    private final void q() {
        adlw adlwVar = this.b;
        adlwVar.z.t(adlwVar.n, wgk.a);
    }

    private final void r(String str) {
        try {
            admw a = admx.a(apkn.RCS_PROVISIONING_VERIFY_OTP_STATE, Optional.ofNullable(this.b.r));
            this.b.aD(27);
            String v = this.b.v();
            this.b.H(v);
            Optional of = Optional.of(a);
            advr.o("Using OTP authenticated config server query", new Object[0]);
            admw admwVar = (admw) of.orElse(aday.b());
            Uri.Builder buildUpon = Uri.parse(v).buildUpon();
            aozy i = admwVar.i();
            if (!i.b.isMutable()) {
                i.u();
            }
            apig apigVar = (apig) i.b;
            apig apigVar2 = apig.a;
            v.getClass();
            apigVar.b |= 2;
            apigVar.d = v;
            String str2 = (String) aduv.e.d();
            if (!TextUtils.isEmpty(str2)) {
                buildUpon.appendQueryParameter("provision_id", str2);
                admwVar.c("provision_id", str2);
            }
            buildUpon.appendQueryParameter("OTP", str);
            admwVar.c("OTP", str);
            admwVar.d(aday.c(buildUpon.build().toString()));
            List w = this.b.w();
            if (w.isEmpty()) {
                adlw adlwVar = this.b;
                acnz acnzVar = adlwVar.aE;
                acnzVar.z(adlwVar.s, acnzVar.j(apkn.RCS_PROVISIONING_VERIFY_OTP_STATE, 11, new adiw(adlwVar.n)), adlwVar.r);
                adlw adlwVar2 = this.b;
                adlwVar2.ac(adlwVar2.an);
                return;
            }
            a.b("Cookie", adjn.a(w));
            adlw adlwVar3 = this.b;
            if (adlwVar3.ae.c(adlwVar3.n).M) {
                adkf a2 = adkg.a();
                a2.e = Optional.ofNullable(this.b.r);
                adlw.ax(a2, w);
                this.b.aH.i(a2.a(), a);
            }
            this.b.V(adjj.MSG_SEND_CONFIG_REQUEST, a.a());
        } catch (MalformedURLException e) {
            adlw adlwVar4 = this.b;
            adlwVar4.az(adjj.MSG_EXCEPTION_CAUGHT, adlwVar4.q);
            this.b.L(apkn.RCS_PROVISIONING_VERIFY_OTP_STATE);
            this.b.D.e("Failed to verify OTP. When building query %s", advq.URI.c(e));
            this.b.K(apkn.RCS_PROVISIONING_VERIFY_OTP_STATE);
        }
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "VerifyOtpState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        adlw adlwVar = this.b;
        this.a = adlwVar.t(adlwVar.s, adlwVar.n);
        super.b();
        this.b.D(apjx.VERIFY_OTP_STAGE);
        String str = this.a;
        if (str != null && str.equals("ReadyState")) {
            adlw adlwVar2 = this.b;
            wgk c = adlwVar2.z.c(adlwVar2.n);
            if ((c.b & 1) != 0) {
                r(c.c);
            }
        }
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_VERIFY_OTP;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_VERIFY_OTP_STATE;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0021. Please report as an issue. */
    @Override // defpackage.admi
    public final boolean k(Message message, adjj adjjVar) {
        this.b.J("VerifyOtpState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 4) {
            if (ordinal != 22) {
                if (ordinal != 24) {
                    if (ordinal != 29) {
                        switch (ordinal) {
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                            case 48:
                            case 49:
                            case 50:
                                break;
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                                q();
                                adlw adlwVar = this.b;
                                adlwVar.Q(adlwVar.s, adlwVar.n, null);
                                this.b.N((HttpURLConnection) message.obj, message.arg2, this);
                                return true;
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                                q();
                                break;
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                                return false;
                            default:
                                return super.o(message, adjjVar);
                        }
                    } else {
                        r(adlw.s(message));
                        return true;
                    }
                }
                this.b.aD(32);
                adlw adlwVar2 = this.b;
                adlwVar2.Q(adlwVar2.s, adlwVar2.n, null);
                return false;
            }
            this.b.aD(34);
            this.b.aD(32);
            adlw adlwVar22 = this.b;
            adlwVar22.Q(adlwVar22.s, adlwVar22.n, null);
            return false;
        }
        this.b.aI(message.arg1);
        return false;
    }
}
