package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apjb implements apam {
    private final /* synthetic */ int v;
    static final apam u = new apjb(20);
    static final apam t = new apjb(19);
    static final apam s = new apjb(18);
    static final apam r = new apjb(17);
    static final apam q = new apjb(16);
    static final apam p = new apjb(15);
    static final apam o = new apjb(14);
    static final apam n = new apjb(13);
    static final apam m = new apjb(12);
    static final apam l = new apjb(11);
    static final apam k = new apjb(10);
    static final apam j = new apjb(9);
    static final apam i = new apjb(8);
    static final apam h = new apjb(7);
    static final apam g = new apjb(6);
    static final apam f = new apjb(5);
    static final apam e = new apjb(4);
    static final apam d = new apjb(3);
    static final apam c = new apjb(2);
    static final apam b = new apjb(1);
    static final apam a = new apjb(0);

    private apjb(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
                return a.bf(i2);
            case 1:
                switch (i2) {
                    case 0:
                        apakVar = apiz.SIP_REGISTRATION_STATE_UNKNOWN;
                        break;
                    case 1:
                        apakVar = apiz.SIP_REGISTRATION_STOPPED_STATE;
                        break;
                    case 2:
                        apakVar = apiz.SIP_REGISTRATION_READY_STATE;
                        break;
                    case 3:
                        apakVar = apiz.SIP_REGISTRATION_WAIT_FOR_NETWORK_STATE;
                        break;
                    case 4:
                        apakVar = apiz.SIP_REGISTRATION_CONNECTING_STATE;
                        break;
                    case 5:
                        apakVar = apiz.SIP_REGISTRATION_REGISTERING_STATE;
                        break;
                    case 6:
                        apakVar = apiz.SIP_REGISTRATION_REGISTERED_STATE;
                        break;
                    case 7:
                        apakVar = apiz.SIP_REGISTRATION_SUBSCRIBING_STATE;
                        break;
                    case 8:
                        apakVar = apiz.SIP_REGISTRATION_SUBSCRIBED_STATE;
                        break;
                    case 9:
                        apakVar = apiz.SIP_REGISTRATION_REREGISTERING_STATE;
                        break;
                    case 10:
                        apakVar = apiz.SIP_REGISTRATION_REREGISTERED_STATE;
                        break;
                    case 11:
                        apakVar = apiz.SIP_REGISTRATION_DEREGISTERING_STATE;
                        break;
                    case 12:
                        apakVar = apiz.SIP_REGISTRATION_DEREGISTERED_STATE;
                        break;
                    case 13:
                        apakVar = apiz.SIP_REGISTRATION_RECONFIGURATION_REQUIRED_STATE;
                        break;
                    case 14:
                        apakVar = apiz.SIP_REGISTRATION_RETRY_STATE;
                        break;
                    case 15:
                        apakVar = apiz.SIP_REGISTRATION_DISABLED_STATE;
                        break;
                    case 16:
                        apakVar = apiz.SIP_REGISTRATION_SIM_REMOVED_STATE;
                        break;
                    case 17:
                        apakVar = apiz.SIP_REGISTRATION_RECEIVE_CONFIGURATION_STATE;
                        break;
                    case 18:
                        apakVar = apiz.SIP_REGISTRATION_RECEIVE_FEATURE_TAGS_STATE;
                        break;
                    case 19:
                        apakVar = apiz.SIP_REGISTRATION_INACTIVE_STATE;
                        break;
                    case 20:
                        apakVar = apiz.SIP_REGISTRATION_TERMINATED_STATE;
                        break;
                    case 21:
                        apakVar = apiz.SIP_REGISTRATION_PUBLISHED_STATE;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 2:
                if (apjc.b(i2) == null) {
                    return false;
                }
                return true;
            case 3:
                return a.bb(i2);
            case 4:
                return a.aW(i2);
            case 5:
                switch (i2) {
                    case 0:
                        apakVar = apje.SOCKET_FAILURE_UNKNOWN;
                        break;
                    case 1:
                        apakVar = apje.SOCKET_FAILURE_UNABLE_TO_OPEN;
                        break;
                    case 2:
                        apakVar = apje.SOCKET_FAILURE_READ_TIMEOUT;
                        break;
                    case 3:
                        apakVar = apje.SOCKET_FAILURE_WRITE_TIMEOUT;
                        break;
                    case 4:
                        apakVar = apje.SOCKET_FAILURE_HOST_VERIFICATION_FAILED;
                        break;
                    case 5:
                        apakVar = apje.SOCKET_FAILURE_READ_ERROR;
                        break;
                    case 6:
                        apakVar = apje.SOCKET_FAILURE_WRITE_ERROR;
                        break;
                    case 7:
                        apakVar = apje.SOCKET_FAILURE_UNABLE_TO_CLOSE;
                        break;
                    case 8:
                        apakVar = apje.SOCKET_FAILURE_TLS_HANDSHAKE_FAILED;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 6:
                return a.aY(i2);
            case 7:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                apakVar = apjf.SOCKET_PROTOCOL_TYPE_TLS;
                            }
                        } else {
                            apakVar = apjf.SOCKET_PROTOCOL_TYPE_TCP;
                        }
                    } else {
                        apakVar = apjf.SOCKET_PROTOCOL_TYPE_UDP;
                    }
                } else {
                    apakVar = apjf.SOCKET_PROTOCOL_TYPE_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 8:
                return a.bj(i2);
            case 9:
                return a.bf(i2);
            case 10:
                return a.aW(i2);
            case 11:
                return a.aW(i2);
            case 12:
                return a.bi(i2);
            case 13:
                return a.bc(i2);
            case 14:
                return a.aY(i2);
            case 15:
                return a.aY(i2);
            case 16:
                return a.bi(i2);
            case 17:
                return a.be(i2);
            case 18:
                if (apjo.b(i2) == null) {
                    return false;
                }
                return true;
            case 19:
                return a.aY(i2);
            default:
                if (apjp.b(i2) == null) {
                    return false;
                }
                return true;
        }
    }
}
