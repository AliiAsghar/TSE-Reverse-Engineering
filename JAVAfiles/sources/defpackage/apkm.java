package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apkm implements apam {
    private final /* synthetic */ int v;
    public static final apam u = new apkm(20);
    public static final apam t = new apkm(19);
    public static final apam s = new apkm(18);
    public static final apam r = new apkm(17);
    public static final apam q = new apkm(16);
    public static final apam p = new apkm(15);
    public static final apam o = new apkm(14);
    public static final apam n = new apkm(13);
    public static final apam m = new apkm(12);
    public static final apam l = new apkm(11);
    public static final apam k = new apkm(10);
    public static final apam j = new apkm(9);
    public static final apam i = new apkm(8);
    public static final apam h = new apkm(7);
    public static final apam g = new apkm(6);
    public static final apam f = new apkm(5);
    public static final apam e = new apkm(4);
    public static final apam d = new apkm(3);
    public static final apam c = new apkm(2);
    public static final apam b = new apkm(1);
    public static final apam a = new apkm(0);

    private apkm(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
                return a.bb(i2);
            case 1:
                return a.bh(i2);
            case 2:
                return a.aY(i2);
            case 3:
                return a.be(i2);
            case 4:
                switch (i2) {
                    case 0:
                        apakVar = apkn.RCS_PROVISIONING_UNKNOWN_STATE;
                        break;
                    case 1:
                        apakVar = apkn.RCS_PROVISIONING_ENABLED_STATE;
                        break;
                    case 2:
                        apakVar = apkn.RCS_PROVISIONING_DISABLED_STATE;
                        break;
                    case 3:
                        apakVar = apkn.RCS_PROVISIONING_READY_STATE;
                        break;
                    case 4:
                        apakVar = apkn.RCS_PROVISIONING_IN_PROGRESS_STATE;
                        break;
                    case 5:
                        apakVar = apkn.RCS_PROVISIONING_RETRY_STATE;
                        break;
                    case 6:
                        apakVar = apkn.RCS_PROVISIONING_CONFIGURED_STATE;
                        break;
                    case 7:
                        apakVar = apkn.RCS_PROVISIONING_WAITING_FOR_NETWORK_STATE;
                        break;
                    case 8:
                        apakVar = apkn.RCS_PROVISIONING_WAITING_FOR_CONSENT_STATE;
                        break;
                    case 9:
                        apakVar = apkn.RCS_PROVISIONING_WAITING_FOR_CONSTELLATION_CONSENT_STATE;
                        break;
                    case 10:
                        apakVar = apkn.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE;
                        break;
                    case 11:
                        apakVar = apkn.RCS_PROVISIONING_WAITING_FOR_BATTERY_OPTIMIZATION_STATE;
                        break;
                    case 12:
                        apakVar = apkn.RCS_PROVISIONING_WAITING_FOR_TERMS_AND_CONDITIONS_STATE;
                        break;
                    case 13:
                        apakVar = apkn.RCS_PROVISIONING_WAITING_FOR_OTP_STATE;
                        break;
                    case 14:
                        apakVar = apkn.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
                        break;
                    case 15:
                        apakVar = apkn.RCS_PROVISIONING_REQUEST_WITH_HE_STATE;
                        break;
                    case 16:
                        apakVar = apkn.RCS_PROVISIONING_REQUEST_WITH_HE_PROXY_STATE;
                        break;
                    case 17:
                        apakVar = apkn.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE;
                        break;
                    case 18:
                        apakVar = apkn.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE;
                        break;
                    case 19:
                        apakVar = apkn.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE;
                        break;
                    case 20:
                        apakVar = apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE;
                        break;
                    case 21:
                        apakVar = apkn.RCS_PROVISIONING_PROCESS_CONFIGURATION_STATE;
                        break;
                    case 22:
                        apakVar = apkn.RCS_PROVISIONING_VERIFY_OTP_STATE;
                        break;
                    case 23:
                        apakVar = apkn.RCS_PROVISIONING_WAITING_FOR_MANUAL_MSISDN_ENTRY_STATE;
                        break;
                    case 24:
                        apakVar = apkn.RCS_PROVISIONING_REPLAY_REQUEST_STATE;
                        break;
                    case 25:
                        apakVar = apkn.RCS_PROVISIONING_SEND_DISABLE_RCS_STATE;
                        break;
                    case 26:
                        apakVar = apkn.RCS_PROVISIONING_DISABLE_RCS_RETRY_STATE;
                        break;
                    case 27:
                        apakVar = apkn.RCS_PROVISIONING_REPLAY_DISABLE_RCS_REQUEST_STATE;
                        break;
                    case 28:
                        apakVar = apkn.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE;
                        break;
                    case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                        apakVar = apkn.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE;
                        break;
                    case 30:
                        apakVar = apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE;
                        break;
                    case 31:
                        apakVar = apkn.RCS_PROVISIONING_VERIFY_MSISDN_STATE;
                        break;
                    case 32:
                        apakVar = apkn.RCS_PROVISIONING_WAITING_FOR_RCS_DEFAULT_ON_STATE;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 5:
                return a.aW(i2);
            case 6:
                return a.be(i2);
            case 7:
                return a.bc(i2);
            case 8:
                return a.aW(i2);
            case 9:
                return a.bc(i2);
            case 10:
                return a.bb(i2);
            case 11:
                return a.aW(i2);
            case 12:
                if (apli.b(i2) == null) {
                    return false;
                }
                return true;
            case 13:
                return a.aY(i2);
            case 14:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        return true;
                    default:
                        return false;
                }
            case 15:
                return a.aW(i2);
            case 16:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    apakVar = aplo.GROUP_FULL_STATE_UPDATE_NOTIFICATION;
                                }
                            } else {
                                apakVar = aplo.LOCAL_RCS_GROUP_CREATION;
                            }
                        } else {
                            apakVar = aplo.GROUP_EVENT_NOTIFICATION;
                        }
                    } else {
                        apakVar = aplo.GROUP_FULL_STATE_NOTIFICATION;
                    }
                } else {
                    apakVar = aplo.SOURCE_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 17:
                return a.aY(i2);
            case 18:
                if (apne.b(i2) == null) {
                    return false;
                }
                return true;
            case 19:
                if (a.V(i2) == 0) {
                    return false;
                }
                return true;
            default:
                if (apsd.p(i2) == 0) {
                    return false;
                }
                return true;
        }
    }
}
