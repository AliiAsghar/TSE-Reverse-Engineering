package defpackage;

import android.os.Message;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgt implements acyg {
    final String a;
    private final acnx b;
    private apiz c = apiz.SIP_REGISTRATION_STATE_UNKNOWN;
    private long d;

    public adgt(String str, acnx acnxVar) {
        this.b = acnxVar;
        this.a = "SR-".concat(String.valueOf(str));
    }

    private static apix h(int i) {
        switch (i) {
            case 1:
                return apix.REGISTRATION_EVENT_MESSAGE_CONNECTION_CREATED;
            case 2:
                return apix.REGISTRATION_EVENT_MESSAGE_CONFIGURED;
            case 3:
                return apix.REGISTRATION_EVENT_MESSAGE_START_REGISTRATION;
            case 4:
                return apix.REGISTRATION_EVENT_MESSAGE_STOP_REGISTRATION;
            case 5:
                return apix.REGISTRATION_EVENT_MESSAGE_ACTIVATE;
            case 6:
                return apix.REGISTRATION_EVENT_MESSAGE_DEACTIVATE;
            case 7:
                return apix.REGISTRATION_EVENT_MESSAGE_REGISTRATION_FAILED;
            case 8:
                return apix.REGISTRATION_EVENT_MESSAGE_CONNECTION_DESTROYED;
            case 9:
                return apix.REGISTRATION_EVENT_MESSAGE_PUBLISH_200OK_RESPONSE;
            case 10:
                return apix.REGISTRATION_EVENT_MESSAGE_PUBLISH_FAILED_RESPONSE;
            case 11:
            case 12:
            case 13:
            case 14:
            default:
                return apix.REGISTRATION_EVENT_MESSAGE_UNKNOWN;
            case 15:
                return apix.REGISTRATION_EVENT_MESSAGE_RETRY_TIMEOUT;
            case 16:
                return apix.REGISTRATION_EVENT_MESSAGE_REGISTER_TIMEOUT;
            case 17:
                return apix.REGISTRATION_EVENT_MESSAGE_PUBLISH_TIMEOUT;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.acyg
    public final void b(acyh acyhVar) {
        char c;
        apiz apizVar;
        if (acyhVar.a().equals("RegisteringState")) {
            this.b.d(apiy.SIP_REGISTRATION_EVENT_TYPE_REGISTERING);
        } else if (acyhVar.a().equals("RegisteredState")) {
            this.b.d(apiy.SIP_REGISTRATION_EVENT_TYPE_REGISTERED);
        } else if (acyhVar.a().equals("DeregisteringState")) {
            this.b.d(apiy.SIP_REGISTRATION_EVENT_TYPE_UNREGISTERING);
        } else if (acyhVar.a().equals("InactiveState") || acyhVar.a().equals("TerminatedState")) {
            this.b.d(apiy.SIP_REGISTRATION_EVENT_TYPE_UNREGISTERED);
        }
        String a = acyhVar.a();
        switch (a.hashCode()) {
            case -1364164455:
                if (a.equals("ConnectingState")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -956761710:
                if (a.equals("RegisteringState")) {
                    c = 2;
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
            case -397999261:
                if (a.equals("PublishedState")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -317727730:
                if (a.equals("TerminatedState")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -256263219:
                if (a.equals("InitialState")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -216642939:
                if (a.equals("ReceiveFeatureTagsState")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 49896467:
                if (a.equals("DeregisteringState")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 308196038:
                if (a.equals("InactiveState")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 844560105:
                if (a.equals("RetryState")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 951960926:
                if (a.equals("ReceiveConfigurationState")) {
                    c = 3;
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
                apizVar = apiz.SIP_REGISTRATION_CONNECTING_STATE;
                break;
            case 2:
                apizVar = apiz.SIP_REGISTRATION_REGISTERING_STATE;
                break;
            case 3:
                apizVar = apiz.SIP_REGISTRATION_RECEIVE_CONFIGURATION_STATE;
                break;
            case 4:
                apizVar = apiz.SIP_REGISTRATION_RECEIVE_FEATURE_TAGS_STATE;
                break;
            case 5:
                apizVar = apiz.SIP_REGISTRATION_REGISTERED_STATE;
                break;
            case 6:
                apizVar = apiz.SIP_REGISTRATION_DEREGISTERING_STATE;
                break;
            case 7:
                apizVar = apiz.SIP_REGISTRATION_INACTIVE_STATE;
                break;
            case '\b':
                apizVar = apiz.SIP_REGISTRATION_TERMINATED_STATE;
                break;
            case '\t':
                apizVar = apiz.SIP_REGISTRATION_RETRY_STATE;
                break;
            case '\n':
                apizVar = apiz.SIP_REGISTRATION_PUBLISHED_STATE;
                break;
            default:
                apizVar = apiz.SIP_REGISTRATION_STATE_UNKNOWN;
                break;
        }
        long longValue = agkx.W().longValue();
        if (!apiz.SIP_REGISTRATION_STATE_UNKNOWN.equals(this.c)) {
            long j = longValue - this.d;
            acnx acnxVar = this.b;
            apiz apizVar2 = this.c;
            String str = this.a;
            acnxVar.g(apizVar, apizVar2, j, Optional.empty(), Optional.of(str));
        } else {
            this.b.f(apizVar, Optional.of(this.a));
        }
        this.c = apizVar;
        this.d = longValue;
    }

    @Override // defpackage.acyg
    public final void e(acyh acyhVar, Message message) {
        advr.c("[%s] processed Message %s", acyhVar.a(), message);
        if (message.what == 101) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof acok) {
            this.b.i(this.a, h(message.what), (acok) obj);
        } else {
            this.b.h(this.a, h(message.what));
        }
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
}
