package defpackage;

import android.content.Context;
import android.net.Network;
import android.os.Message;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import j$.util.Optional;
import java.io.IOException;
import java.net.HttpURLConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkz extends adll {
    final /* synthetic */ adlw a;
    private ahjj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adkz(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    private final void q(Message message) {
        adjj adjjVar;
        String headerField;
        int i = message.arg1;
        int i2 = message.arg2;
        adlw adlwVar = this.a;
        apkn n = adlwVar.n();
        String str = adlwVar.r;
        adiw adiwVar = new adiw(adlwVar.n);
        acnz acnzVar = adlwVar.aE;
        aozy builder = acnzVar.j(n, 7, adiwVar).toBuilder();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        Context context = adlwVar.s;
        apjl apjlVar = (apjl) builder.b;
        apjlVar.b |= 4;
        apjlVar.e = i;
        acnzVar.z(context, (apjl) builder.s(), str);
        if ((message.obj instanceof HttpURLConnection) && (headerField = ((HttpURLConnection) message.obj).getHeaderField("x-acs-debug-message")) != null) {
            this.a.D.a("Http response ACS debug message: %s", headerField);
        }
        if (i != 200) {
            if (i != 403) {
                if (i != 405) {
                    if (i != 429) {
                        if (i != 501) {
                            if (i != 511) {
                                if (i != 400) {
                                    if (i != 401) {
                                        if (i != 503) {
                                            if (i != 504) {
                                                adjjVar = adjj.MSG_HTTP_RESPONSE_UNKNOWN;
                                            } else {
                                                adjjVar = adjj.MSG_HTTP_504_GATEWAY_TIMEOUT;
                                            }
                                        } else {
                                            adjjVar = adjj.MSG_HTTP_503_UNAVAILABLE;
                                        }
                                    } else {
                                        adjjVar = adjj.MSG_HTTP_401_UNAUTHORIZED;
                                    }
                                } else {
                                    adjjVar = adjj.MSG_HTTP_400_BAD_REQUEST;
                                }
                            } else {
                                adjjVar = adjj.MSG_HTTP_511_AUTH_REQUIRED;
                            }
                        } else {
                            adjjVar = adjj.MSG_HTTP_501_NOT_SUPPORTED;
                        }
                    } else {
                        adjjVar = adjj.MSG_HTTP_429_TOO_MANY_REQUESTS;
                    }
                } else {
                    adjjVar = adjj.MSG_HTTP_405_METHOD_NOT_ALLOWED;
                }
            } else {
                adjjVar = adjj.MSG_HTTP_403_FORBIDDEN;
            }
        } else {
            adjjVar = adjj.MSG_HTTP_200_OK;
        }
        this.a.W(adjjVar, i, i2, message.obj);
    }

    private final void r(Message message) {
        if (aczv.R()) {
            adlw adlwVar = this.a;
            if (adlwVar.q != message.arg2) {
                adlwVar.D.e("request id: %d, received id: %d, discard exception message", Integer.valueOf(adlwVar.q), Integer.valueOf(message.arg1));
                return;
            }
        }
        adlw adlwVar2 = this.a;
        adlwVar2.ac(adlwVar2.an);
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "InProgressState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        super.b();
        ahjj ahjjVar = new ahjj(this);
        this.b = ahjjVar;
        Object obj = this.a.aG.a;
        ajqh a = advc.a(new adlz(ahjjVar, 0), andi.a);
        a.h(ahjjVar);
        a.i(false);
        ((advd) obj).a(a.g());
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void c() {
        super.c();
        ahjj ahjjVar = this.b;
        if (ahjjVar != null) {
            ((advd) this.a.aG.a).d(ahjjVar);
        }
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_IN_PROGRESS;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_IN_PROGRESS_STATE;
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
        this.a.J("InProgressState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 1) {
            if (ordinal != 4) {
                if (ordinal != 6) {
                    if (ordinal != 9) {
                        if (ordinal != 20) {
                            if (ordinal != 22 && ordinal != 24) {
                                if (ordinal != 40) {
                                    switch (ordinal) {
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                                        case 48:
                                        case 49:
                                        case 50:
                                            break;
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                                            this.a.G(message);
                                            return true;
                                        default:
                                            return super.o(message, adjjVar);
                                    }
                                } else {
                                    this.a.D.d("Received unknown response %d in %s state", Integer.valueOf(message.arg1), this.a.r());
                                }
                                try {
                                } catch (IOException unused) {
                                    this.a.D.e("Error retrieving response code", new Object[0]);
                                }
                                if (aczv.R() && !this.a.aq(message)) {
                                    this.a.A(message);
                                } else {
                                    if (message.obj instanceof HttpURLConnection) {
                                        this.a.aH(apkn.RCS_PROVISIONING_IN_PROGRESS_STATE, ((HttpURLConnection) message.obj).getResponseCode());
                                    }
                                    adlw adlwVar = this.a;
                                    adlwVar.ac(adlwVar.an);
                                    if (message.obj instanceof HttpURLConnection) {
                                        this.a.u.a((HttpURLConnection) message.obj, null, "InProgressState");
                                    }
                                }
                            } else {
                                this.a.aC(apkn.RCS_PROVISIONING_IN_PROGRESS_STATE, 3);
                                r(message);
                                return true;
                            }
                        } else {
                            this.a.q++;
                            if (message.obj instanceof admx) {
                                admx admxVar = (admx) message.obj;
                                adlw adlwVar2 = this.a;
                                final int i = adlwVar2.q;
                                final Optional of = Optional.of(admxVar);
                                int i2 = alog.d;
                                final adlw adlwVar3 = this.a;
                                alog alogVar = alsx.a;
                                final String str = adlwVar3.r;
                                final adiw adiwVar = new adiw(adlwVar3.n);
                                final adks adksVar = adlwVar2.u;
                                final Context context = adlwVar2.s;
                                final adva advaVar = new adva(context, adksVar.b);
                                final Network a = advaVar.a();
                                if (a == null) {
                                    adlwVar3.U(adjj.MSG_MOBILE_NETWORK_NOT_AVAILABLE);
                                } else {
                                    adksVar.a.execute(new Runnable() { // from class: adkr
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            adks.this.d(context, adlwVar3, a, str, i, (admx) of.orElse(null), adiwVar);
                                            advaVar.b();
                                        }
                                    });
                                }
                                adlw adlwVar4 = this.a;
                                adlwVar4.aE.e(adlwVar4.s, adlwVar4.n(), adlwVar4.r, new adiw(adlwVar4.n));
                                return true;
                            }
                            this.a.D.b("Wrong provisioning request message type", new Object[0]);
                            adlw adlwVar5 = this.a;
                            adlwVar5.ac(adlwVar5.an);
                            return true;
                        }
                    } else {
                        r(message);
                        return true;
                    }
                } else {
                    this.a.q++;
                    if (message.obj instanceof admx) {
                        admx admxVar2 = (admx) message.obj;
                        adlw adlwVar6 = this.a;
                        int i3 = adlwVar6.q;
                        Optional of2 = Optional.of(admxVar2);
                        int i4 = alog.d;
                        adlw adlwVar7 = this.a;
                        alog alogVar2 = alsx.a;
                        String str2 = adlwVar7.r;
                        adiw adiwVar2 = new adiw(adlwVar7.n);
                        acyz acyzVar = admf.a;
                        adks adksVar2 = adlwVar6.u;
                        Context context2 = adlwVar6.s;
                        if (adom.i()) {
                            qiu.h(aktp.ai(new adkp(adksVar2, context2, adlwVar7, str2, i3, of2, adiwVar2, 0), adksVar2.a));
                        } else {
                            adksVar2.a.execute(new adkq(adksVar2, context2, adlwVar7, str2, i3, of2, adiwVar2, 0));
                        }
                        adlw adlwVar8 = this.a;
                        adlwVar8.aE.e(adlwVar8.s, adlwVar8.n(), adlwVar8.r, new adiw(adlwVar8.n));
                        return true;
                    }
                    this.a.D.b("Wrong provisioning request message type", new Object[0]);
                    adlw adlwVar9 = this.a;
                    adlwVar9.ac(adlwVar9.an);
                    return true;
                }
            } else if (aczv.R()) {
                if (this.a.aq(message)) {
                    q(message);
                } else {
                    this.a.A(message);
                }
            } else {
                q(message);
            }
            return true;
        }
        this.a.F();
        return true;
    }
}
