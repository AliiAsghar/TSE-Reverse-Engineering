package defpackage;

import android.os.Message;
import android.os.SystemClock;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adia implements adez, acyg {
    final String a;
    String b;
    private final acnx c;
    private final int d;
    private long f;
    private apiz e = apiz.SIP_REGISTRATION_STATE_UNKNOWN;
    private final AtomicReference g = new AtomicReference();
    private final boolean h = ((Boolean) acyy.b("use_elapsed_time_in_registration_event_logger").a()).booleanValue();

    public adia(String str, int i, acnx acnxVar) {
        this.c = acnxVar;
        this.a = str;
        this.d = i;
    }

    private static apix o(int i) {
        switch (i) {
            case 1:
                return apix.REGISTRATION_EVENT_MESSAGE_SEND_SIP_MESSAGE;
            case 2:
                return apix.REGISTRATION_EVENT_MESSAGE_RECEIVE_SIP_RESPONSE;
            case 3:
                return apix.REGISTRATION_EVENT_MESSAGE_SIP_REQUEST_TIMEOUT;
            case 4:
                return apix.REGISTRATION_EVENT_MESSAGE_CONNECTIVITY_EVENT;
            case 5:
                return apix.REGISTRATION_EVENT_MESSAGE_TRANSPORT_ERROR;
            case 6:
            case 11:
            default:
                return apix.REGISTRATION_EVENT_MESSAGE_UNKNOWN;
            case 7:
                return apix.REGISTRATION_EVENT_MESSAGE_START_REGISTRATION;
            case 8:
                return apix.REGISTRATION_EVENT_MESSAGE_STOP_REGISTRATION;
            case 9:
                return apix.REGISTRATION_EVENT_MESSAGE_REREGISTRATION_REQUIRED;
            case 10:
                return apix.REGISTRATION_EVENT_MESSAGE_DISCOVER_SIP_SERVER;
            case 12:
                return apix.REGISTRATION_EVENT_MESSAGE_CONNECT_TO_SERVER;
            case 13:
                return apix.REGISTRATION_EVENT_MESSAGE_CONNECTED_TO_SERVER;
            case 14:
                return apix.REGISTRATION_EVENT_MESSAGE_REFRESH_TIMEOUT;
            case 15:
                return apix.REGISTRATION_EVENT_MESSAGE_RETRY_TIMEOUT;
            case 16:
                return apix.REGISTRATION_EVENT_MESSAGE_SIM_DETECTED;
            case 17:
                return apix.REGISTRATION_EVENT_MESSAGE_SIM_REMOVED;
            case 18:
                return apix.REGISTRATION_EVENT_MESSAGE_CONNECTION_TIMEOUT;
            case 19:
                return apix.REGISTRATION_EVENT_MESSAGE_CONNECT_TO_SERVER_FAILURE;
        }
    }

    private final void p(int i) {
        aozy createBuilder = apfe.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apfe apfeVar = (apfe) createBuilder.b;
        apfeVar.c = i - 1;
        apfeVar.b |= 16384;
        int i2 = ((adey) this.g.get()).l;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.acyg
    public final void b(acyh acyhVar) {
        char c;
        apiz apizVar;
        long longValue;
        if (acyhVar.a().equals("ReregisteringState")) {
            this.c.e(apiy.SIP_REGISTRATION_EVENT_TYPE_REREGISTERING, this.b);
        } else if (acyhVar.a().equals("DeregisteringState")) {
            this.c.e(apiy.SIP_REGISTRATION_EVENT_TYPE_UNREGISTERING, this.b);
        } else if (acyhVar.a().equals("DeregisteredState")) {
            this.c.e(apiy.SIP_REGISTRATION_EVENT_TYPE_UNREGISTERED, this.b);
        }
        String a = acyhVar.a();
        switch (a.hashCode()) {
            case -1912539026:
                if (a.equals("DeregisteredState")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1744214834:
                if (a.equals("ReadyState")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1625135049:
                if (a.equals("SubscribedState")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1364164455:
                if (a.equals("ConnectingState")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1060655388:
                if (a.equals("StoppedState")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1024214587:
                if (a.equals("ReregisteringState")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -956761710:
                if (a.equals("RegisteringState")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -420991217:
                if (a.equals("RegisteredState")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -146072452:
                if (a.equals("ReregisteredState")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 49896467:
                if (a.equals("DeregisteringState")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 369485162:
                if (a.equals("SubscribingState")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 414054229:
                if (a.equals("DisabledState")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 844560105:
                if (a.equals("RetryState")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1174681192:
                if (a.equals("SimRemovedState")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1346635631:
                if (a.equals("ReconfigurationRequiredState")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1802360855:
                if (a.equals("WaitForNetworkState")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                apizVar = apiz.SIP_REGISTRATION_STOPPED_STATE;
                break;
            case 1:
                apizVar = apiz.SIP_REGISTRATION_READY_STATE;
                break;
            case 2:
                apizVar = apiz.SIP_REGISTRATION_WAIT_FOR_NETWORK_STATE;
                break;
            case 3:
                apizVar = apiz.SIP_REGISTRATION_CONNECTING_STATE;
                break;
            case 4:
                apizVar = apiz.SIP_REGISTRATION_REGISTERING_STATE;
                break;
            case 5:
                apizVar = apiz.SIP_REGISTRATION_REGISTERED_STATE;
                break;
            case 6:
                apizVar = apiz.SIP_REGISTRATION_SUBSCRIBING_STATE;
                break;
            case 7:
                apizVar = apiz.SIP_REGISTRATION_SUBSCRIBED_STATE;
                break;
            case '\b':
                apizVar = apiz.SIP_REGISTRATION_REREGISTERING_STATE;
                break;
            case '\t':
                apizVar = apiz.SIP_REGISTRATION_REREGISTERED_STATE;
                break;
            case '\n':
                apizVar = apiz.SIP_REGISTRATION_DEREGISTERING_STATE;
                break;
            case 11:
                apizVar = apiz.SIP_REGISTRATION_DEREGISTERED_STATE;
                break;
            case '\f':
                apizVar = apiz.SIP_REGISTRATION_RECONFIGURATION_REQUIRED_STATE;
                break;
            case '\r':
                apizVar = apiz.SIP_REGISTRATION_RETRY_STATE;
                break;
            case 14:
                apizVar = apiz.SIP_REGISTRATION_DISABLED_STATE;
                break;
            case 15:
                apizVar = apiz.SIP_REGISTRATION_SIM_REMOVED_STATE;
                break;
            default:
                apizVar = apiz.SIP_REGISTRATION_STATE_UNKNOWN;
                break;
        }
        if (this.h) {
            Object obj = adwn.b.a;
            longValue = SystemClock.elapsedRealtime();
            Long.valueOf(longValue).getClass();
        } else {
            longValue = agkx.W().longValue();
        }
        long j = longValue;
        if (!apiz.SIP_REGISTRATION_STATE_UNKNOWN.equals(this.e)) {
            apiz apizVar2 = apizVar;
            this.c.g(apizVar2, this.e, j - this.f, Optional.of(Integer.valueOf(this.d)), Optional.empty());
        } else {
            this.c.f(apizVar, Optional.empty());
        }
        this.e = apizVar;
        this.f = j;
    }

    @Override // defpackage.acyg
    public final void e(acyh acyhVar, Message message) {
        advr.c("[%s] processed Message %s", acyhVar.a(), message);
        int i = message.what;
        if (i != 101 && i != 4) {
            Object obj = message.obj;
            if (obj instanceof acok) {
                this.c.i(this.a, o(message.what), (acok) obj);
                return;
            }
            if (message.what == 2) {
                if (obj instanceof aioo) {
                    acnx acnxVar = this.c;
                    String str = this.a;
                    apix o = o(message.what);
                    int y = ((aioo) obj).y();
                    aozy createBuilder = apiw.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    apiw apiwVar = (apiw) apagVar;
                    apiwVar.c = o.C;
                    apiwVar.b |= 1;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    apiw apiwVar2 = (apiw) createBuilder.b;
                    apiwVar2.b = 4 | apiwVar2.b;
                    apiwVar2.e = y;
                    apiw apiwVar3 = (apiw) createBuilder.s();
                    aozy createBuilder2 = apja.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar2 = createBuilder2.b;
                    apja apjaVar = (apja) apagVar2;
                    str.getClass();
                    apjaVar.b |= 64;
                    apjaVar.g = str;
                    if (!apagVar2.isMutable()) {
                        createBuilder2.u();
                    }
                    apja apjaVar2 = (apja) createBuilder2.b;
                    apiwVar3.getClass();
                    apjaVar2.f = apiwVar3;
                    apjaVar2.b |= 32;
                    apja apjaVar3 = (apja) createBuilder2.s();
                    advr.o("Logging SIP registration Processed message, message = %s sipResponseCode = %d", o, Integer.valueOf(y));
                    acnxVar.n(apjaVar3);
                    return;
                }
                return;
            }
            if (message.what == 7) {
                acnx acnxVar2 = this.c;
                String str2 = this.a;
                apix o2 = o(message.what);
                int i2 = message.arg1;
                aozy createBuilder3 = apiw.a.createBuilder();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar3 = createBuilder3.b;
                apiw apiwVar4 = (apiw) apagVar3;
                apiwVar4.c = o2.C;
                apiwVar4.b |= 1;
                if (!apagVar3.isMutable()) {
                    createBuilder3.u();
                }
                apiw apiwVar5 = (apiw) createBuilder3.b;
                apiwVar5.b |= 8;
                apiwVar5.f = i2;
                apiw apiwVar6 = (apiw) createBuilder3.s();
                aozy createBuilder4 = apja.a.createBuilder();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                apag apagVar4 = createBuilder4.b;
                apja apjaVar4 = (apja) apagVar4;
                str2.getClass();
                apjaVar4.b |= 64;
                apjaVar4.g = str2;
                if (!apagVar4.isMutable()) {
                    createBuilder4.u();
                }
                apja apjaVar5 = (apja) createBuilder4.b;
                apiwVar6.getClass();
                apjaVar5.f = apiwVar6;
                apjaVar5.b |= 32;
                apja apjaVar6 = (apja) createBuilder4.s();
                advr.o("Logging SIP registration Processed message, message = %s configVersion = %d", o2, Integer.valueOf(i2));
                acnxVar2.n(apjaVar6);
                return;
            }
            this.c.h(this.a, o(message.what));
        }
    }

    @Override // defpackage.adez
    public final void h(adey adeyVar) {
        this.g.set(adeyVar);
    }

    @Override // defpackage.adez
    public final void j(String str) {
        this.b = str;
        this.c.e(apiy.SIP_REGISTRATION_EVENT_TYPE_REGISTERED, str);
        p(2);
    }

    @Override // defpackage.adez
    public final void k(String str) {
        this.b = str;
        this.c.e(apiy.SIP_REGISTRATION_EVENT_TYPE_REGISTERING, str);
    }

    @Override // defpackage.adez
    public final void l() {
        p(3);
    }

    @Override // defpackage.adez
    public final void m() {
        p(3);
    }

    @Override // defpackage.acyg
    public final void a() {
    }

    @Override // defpackage.acyg
    public final void c() {
    }

    @Override // defpackage.acyg
    public final void d() {
    }

    @Override // defpackage.acyg
    public final void f() {
    }

    @Override // defpackage.acyg
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.adez
    public final void i() {
    }

    @Override // defpackage.adez
    public final void n() {
    }
}
