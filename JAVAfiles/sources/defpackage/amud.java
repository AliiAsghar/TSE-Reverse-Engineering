package defpackage;

import com.google.android.gms.common.internal.IGmsServiceBroker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amud implements apam {
    private final /* synthetic */ int v;
    static final apam u = new amud(20);
    static final apam t = new amud(19);
    static final apam s = new amud(18);
    static final apam r = new amud(17);
    static final apam q = new amud(16);
    static final apam p = new amud(15);
    static final apam o = new amud(14);
    public static final apam n = new amud(13);
    static final apam m = new amud(12);
    static final apam l = new amud(11);
    static final apam k = new amud(10);
    static final apam j = new amud(9);
    static final apam i = new amud(8);
    static final apam h = new amud(7);
    static final apam g = new amud(6);
    static final apam f = new amud(5);
    static final apam e = new amud(4);
    static final apam d = new amud(3);
    static final apam c = new amud(2);
    static final apam b = new amud(1);
    static final apam a = new amud(0);

    private amud(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
                return a.aY(i2);
            case 1:
                return a.bb(i2);
            case 2:
                return a.bc(i2);
            case 3:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            apakVar = amue.NOISE_CANCELLATION_STATE_DISABLED;
                        }
                    } else {
                        apakVar = amue.NOISE_CANCELLATION_STATE_ENABLED;
                    }
                } else {
                    apakVar = amue.NOISE_CANCELLATION_STATE_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 4:
                return a.aY(i2);
            case 5:
                return a.aY(i2);
            case 6:
                return a.aW(i2);
            case 7:
                return a.aW(i2);
            case 8:
                return a.bh(i2);
            case 9:
                return a.aW(i2);
            case 10:
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
                        return true;
                    default:
                        return false;
                }
            case 11:
                return a.aX(i2);
            case 12:
                switch (i2) {
                    case 0:
                        apakVar = amui.UNKNOWN_RESULT_STATUS;
                        break;
                    case 1:
                        apakVar = amui.SUCCESS_CACHE;
                        break;
                    case 2:
                        apakVar = amui.SUCCESS;
                        break;
                    case 3:
                        apakVar = amui.STATUS_CODE_NOT_MAPPED;
                        break;
                    case 4:
                        apakVar = amui.GMS_ERROR;
                        break;
                    case 5:
                        apakVar = amui.TARGET_NODE_NOT_CONNECTED;
                        break;
                    case 6:
                        apakVar = amui.DUPLICATE_LISTENER;
                        break;
                    case 7:
                        apakVar = amui.UNKNOWN_LISTENER;
                        break;
                    case 8:
                        apakVar = amui.DATA_ITEM_TOO_LARGE;
                        break;
                    case 9:
                        apakVar = amui.INVALID_TARGET_NODE;
                        break;
                    case 10:
                        apakVar = amui.ASSET_UNAVAILABLE;
                        break;
                    case 11:
                        apakVar = amui.DUPLICATE_CAPABILITY;
                        break;
                    case 12:
                        apakVar = amui.UNKNOWN_CAPABILITY;
                        break;
                    case 13:
                        apakVar = amui.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED;
                        break;
                    case 14:
                        apakVar = amui.UNSUPPORTED_BY_TARGET_NODE;
                        break;
                    case 15:
                        apakVar = amui.SIGN_IN_REQUIRED;
                        break;
                    case 16:
                        apakVar = amui.INVALID_ACCOUNT;
                        break;
                    case 17:
                        apakVar = amui.RESOLUTION_REQUIRED;
                        break;
                    case 18:
                        apakVar = amui.NETWORK_ERROR;
                        break;
                    case 19:
                        apakVar = amui.INTERNAL_ERROR;
                        break;
                    case 20:
                        apakVar = amui.DEVELOPER_ERROR;
                        break;
                    case 21:
                        apakVar = amui.INTERRUPTED;
                        break;
                    case 22:
                        apakVar = amui.TIMEOUT;
                        break;
                    case 23:
                        apakVar = amui.CANCELED;
                        break;
                    case 24:
                        apakVar = amui.API_NOT_CONNECTED;
                        break;
                    case 25:
                        apakVar = amui.DEAD_CLIENT;
                        break;
                    case 26:
                        apakVar = amui.REMOTE_EXCEPTION;
                        break;
                    case 27:
                        apakVar = amui.CONNECTION_SUSPENDED_DURING_CALL;
                        break;
                    case 28:
                        apakVar = amui.RECONNECTION_TIMED_OUT_DURING_UPDATE;
                        break;
                    case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                        apakVar = amui.RECONNECTION_TIMED_OUT;
                        break;
                    case 30:
                        apakVar = amui.CLIENT_FAILURE;
                        break;
                    case 31:
                        apakVar = amui.TASK_TIMEOUT;
                        break;
                    case 32:
                        apakVar = amui.FEATURE_UNSUPPORTED;
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                        apakVar = amui.REMOTE_ERROR;
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                        apakVar = amui.REMOTE_PARSE_ERROR;
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                        apakVar = amui.REMOTE_EXECUTION_TIMEOUT;
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                        apakVar = amui.REMOTE_INVALID_PARAMETER;
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                        apakVar = amui.RESPONSE_PARSE_ERROR;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 13:
                if (amuk.b(i2) == null) {
                    return false;
                }
                return true;
            case 14:
                if (a.aR(i2) == 0) {
                    return false;
                }
                return true;
            case 15:
                return a.aW(i2);
            case 16:
                return a.be(i2);
            case 17:
                return a.bk(i2);
            case 18:
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
                        return true;
                    default:
                        return false;
                }
            case 19:
                if (i2 != 102 && i2 != 103) {
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
                            break;
                        default:
                            return false;
                    }
                }
                return true;
            default:
                return a.aY(i2);
        }
    }
}
