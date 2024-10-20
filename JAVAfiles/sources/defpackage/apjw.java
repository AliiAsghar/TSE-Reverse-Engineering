package defpackage;

import com.google.android.gms.common.internal.IGmsServiceBroker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apjw implements apam {
    private final /* synthetic */ int v;
    public static final apam u = new apjw(20);
    public static final apam t = new apjw(19);
    public static final apam s = new apjw(18);
    public static final apam r = new apjw(17);
    public static final apam q = new apjw(16);
    public static final apam p = new apjw(15);
    public static final apam o = new apjw(14);
    public static final apam n = new apjw(13);
    public static final apam m = new apjw(12);
    public static final apam l = new apjw(11);
    public static final apam k = new apjw(10);
    public static final apam j = new apjw(9);
    public static final apam i = new apjw(8);
    static final apam h = new apjw(7);
    static final apam g = new apjw(6);
    static final apam f = new apjw(5);
    static final apam e = new apjw(4);
    static final apam d = new apjw(3);
    static final apam c = new apjw(2);
    static final apam b = new apjw(1);
    static final apam a = new apjw(0);

    private apjw(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
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
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                    case 30:
                    case 31:
                    case 32:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                    case 39:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                        return true;
                    default:
                        return false;
                }
            case 1:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            apakVar = apjq.SMS_CONNECTION_UNAVAILABLE;
                        }
                    } else {
                        apakVar = apjq.SMS_CONNECTION_AVAILABLE;
                    }
                } else {
                    apakVar = apjq.SMS_CONNECTION_AVAILABILITY_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 2:
                if (apjx.b(i2) == null) {
                    return false;
                }
                return true;
            case 3:
                return a.be(i2);
            case 4:
                return a.bb(i2);
            case 5:
                if (a.aM(i2) == 0) {
                    return false;
                }
                return true;
            case 6:
                return a.aY(i2);
            case 7:
                if (a.aM(i2) == 0) {
                    return false;
                }
                return true;
            case 8:
                if (appn.j(i2) == 0) {
                    return false;
                }
                return true;
            case 9:
                return a.be(i2);
            case 10:
                return a.aW(i2);
            case 11:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return true;
                    case 4:
                    default:
                        return false;
                }
            case 12:
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
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                    case 30:
                    case 31:
                    case 32:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                    case 39:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                    case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 72:
                        return true;
                    case 71:
                    default:
                        return false;
                }
            case 13:
                return a.aW(i2);
            case 14:
                return a.bb(i2);
            case 15:
                if (a.W(i2) == 0) {
                    return false;
                }
                return true;
            case 16:
                return a.bb(i2);
            case 17:
                return a.be(i2);
            case 18:
                return a.bb(i2);
            case 19:
                switch (i2) {
                    case 0:
                        apakVar = apkk.CONSENT_REASON_UNKNOWN;
                        break;
                    case 1:
                        apakVar = apkk.SEAMLESS_AUTHORIZED_PROVISIONING_ALLOWED;
                        break;
                    case 2:
                        apakVar = apkk.IMEI_PII_FORMAT_NONE;
                        break;
                    case 3:
                        apakVar = apkk.IMEI_PII_FORMAT_SHORT;
                        break;
                    case 4:
                        apakVar = apkk.IMEI_PII_FORMAT_IGNORED;
                        break;
                    case 5:
                        apakVar = apkk.IMSI_PII_FORMAT_NONE;
                        break;
                    case 6:
                        apakVar = apkk.IMSI_PII_FORMAT_SHORT;
                        break;
                    case 7:
                        apakVar = apkk.IMSI_PII_FORMAT_IGNORED;
                        break;
                    case 8:
                        apakVar = apkk.CONSENT_ALREADY_GRANTED;
                        break;
                    case 9:
                        apakVar = apkk.HE_REQUEST_SUCCESSFUL;
                        break;
                    case 10:
                        apakVar = apkk.GOOGLE_TOS_DISABLED;
                        break;
                    case 11:
                        apakVar = apkk.RCS_DEFAULT_ON_ALREADY_SEEN;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            default:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    apakVar = apkl.RCS_DEFAULT_ON_OOB_CONSENT;
                                }
                            } else {
                                apakVar = apkl.LEGAL_FYI_SEEN;
                            }
                        } else {
                            apakVar = apkl.REVOKE_CONSENT_FROM_SETTINGS;
                        }
                    } else {
                        apakVar = apkl.GOOGLE_TOS_UI;
                    }
                } else {
                    apakVar = apkl.GOOGLE_TOS_CONSENT_SOURCE_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
        }
    }
}
