package defpackage;

import android.os.Message;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlf extends adll {
    final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlf(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    private final void q(apjo apjoVar) {
        adlw adlwVar = this.a;
        adnt adntVar = adlwVar.A;
        Optional p = adlwVar.p();
        if (adntVar.i(adntVar.e(p))) {
            return;
        }
        adntVar.r(new adnn(apjoVar, 2), adntVar.e(p));
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "RequestWithMsisdnState";
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x027e  */
    @Override // defpackage.adll, defpackage.acyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adlf.b():void");
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_REQUEST_WITH_MSISDN;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE;
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
        Optional empty;
        this.a.J("RequestWithMsisdnState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 4) {
            if (ordinal != 7) {
                if (ordinal != 22) {
                    if (ordinal != 24) {
                        InputStream inputStream = null;
                        if (ordinal != 46) {
                            switch (ordinal) {
                                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) message.obj;
                                    int i = message.arg2;
                                    try {
                                        try {
                                            try {
                                                inputStream = httpURLConnection.getInputStream();
                                                this.a.B(adjj.MSG_CONFIG_DOC, this.a.aK.x(inputStream));
                                                adlw adlwVar = this.a;
                                                adlwVar.F.c(adlwVar.n);
                                                adlw adlwVar2 = this.a;
                                                adlwVar2.ac(adlwVar2.az);
                                            } catch (adna e) {
                                                this.a.az(adjj.MSG_EXCEPTION_CAUGHT, i);
                                                this.a.aC(apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE, 4);
                                                this.a.D.f(e, "Failed to parse configuration.", new Object[0]);
                                                this.a.K(apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE);
                                            }
                                        } finally {
                                            this.a.u.a(httpURLConnection, inputStream, "RequestWithMsisdnState");
                                        }
                                    } catch (IOException unused) {
                                        adlw adlwVar3 = this.a;
                                        adlwVar3.u.c(adlwVar3.s, adlwVar3.n, httpURLConnection);
                                        adlw adlwVar4 = this.a;
                                        adlwVar4.F.c(adlwVar4.n);
                                        adlw adlwVar5 = this.a;
                                        adlwVar5.ac(adlwVar5.ap);
                                    }
                                    return true;
                                case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) message.obj;
                                    InputStream errorStream = httpURLConnection2.getErrorStream();
                                    Configuration configuration = new Configuration();
                                    configuration.mType = 2;
                                    configuration.mValiditySecs = 0;
                                    configuration.mVersion = 0;
                                    adlw adlwVar6 = this.a;
                                    adlwVar6.z.u(adlwVar6.n, configuration);
                                    this.a.u.a(httpURLConnection2, errorStream, "RequestWithMsisdnState");
                                    this.a.aH(apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE, 403);
                                    adlw adlwVar7 = this.a;
                                    adlwVar7.ac(adlwVar7.ag);
                                    return true;
                                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                                    adlw adlwVar8 = this.a;
                                    String str = adlwVar8.n;
                                    HttpURLConnection httpURLConnection3 = (HttpURLConnection) message.obj;
                                    if ("?1".equals(httpURLConnection3.getHeaderField("DEVICE_THROTTLED"))) {
                                        adki adkiVar = adlwVar8.F;
                                        wgi b = adkiVar.b.b(str);
                                        Optional b2 = adkiVar.b(b);
                                        if (b2.isPresent() && (((wgh) b2.get()).b & 2) == 0) {
                                            String headerField = httpURLConnection3.getHeaderField("Retry-After");
                                            ((alwl) ((alwl) adki.a.g()).h("com/google/android/ims/provisioning/engine/ForcePhoneNumberVerificationUtil", "getRetryAfterTimestamp", 151, "ForcePhoneNumberVerificationUtil.java")).t("Force verification request otp throttled. Retry-after value: %s", headerField);
                                            if (albo.ah(headerField)) {
                                                empty = Optional.empty();
                                            } else {
                                                try {
                                                    empty = Optional.of(apds.c(Integer.parseInt(headerField)));
                                                } catch (NumberFormatException e2) {
                                                    ((alwl) ((alwl) ((alwl) adki.a.h()).g(e2)).h("com/google/android/ims/provisioning/engine/ForcePhoneNumberVerificationUtil", "getRetryAfterTimestamp", 160, "ForcePhoneNumberVerificationUtil.java")).t("Exception parsing Retry-After field: %s", headerField);
                                                    empty = Optional.empty();
                                                }
                                            }
                                            adkiVar.b.r(str, adkiVar.a(b, wgf.OTP_FORCE_VERIFICATION_THROTTLED, empty));
                                            ((alwl) ((alwl) adki.a.g()).h("com/google/android/ims/provisioning/engine/ForcePhoneNumberVerificationUtil", "handleIfThrottledResponse", 142, "ForcePhoneNumberVerificationUtil.java")).q("Received throttled response for force verification request. Storing record.");
                                        }
                                    }
                                    if (this.a.ae()) {
                                        adlw adlwVar9 = this.a;
                                        adlwVar9.G.b(adlwVar9.n, apjo.SIM, adlwVar9.r, wgf.OTP_THROTTLED);
                                    }
                                    break;
                                case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                                    return false;
                                default:
                                    return super.o(message, adjjVar);
                            }
                        } else {
                            this.a.u.a((HttpURLConnection) message.obj, null, "RequestWithMsisdnState");
                            this.a.aH(apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE, 401);
                            if (!aczv.V()) {
                                return false;
                            }
                            this.a.z.p(null);
                            adlw adlwVar10 = this.a;
                            adlwVar10.ac(adlwVar10.an);
                            return true;
                        }
                    } else {
                        this.a.aD(32);
                        return false;
                    }
                } else {
                    this.a.aD(34);
                    return false;
                }
            } else {
                this.a.C(adlw.av(message), message.arg1, message.arg2, message.obj);
                advh.i(this.a.s);
                return true;
            }
        } else {
            this.a.aI(message.arg1);
            return false;
        }
    }
}
