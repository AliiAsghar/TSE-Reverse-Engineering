package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amjw implements apam {
    private final /* synthetic */ int v;
    static final apam u = new amjw(20);
    static final apam t = new amjw(19);
    static final apam s = new amjw(18);
    static final apam r = new amjw(17);
    static final apam q = new amjw(16);
    static final apam p = new amjw(15);
    static final apam o = new amjw(14);
    static final apam n = new amjw(13);
    static final apam m = new amjw(12);
    static final apam l = new amjw(11);
    static final apam k = new amjw(10);
    static final apam j = new amjw(9);
    static final apam i = new amjw(8);
    static final apam h = new amjw(7);
    public static final apam g = new amjw(6);
    static final apam f = new amjw(5);
    static final apam e = new amjw(4);
    static final apam d = new amjw(3);
    static final apam c = new amjw(2);
    static final apam b = new amjw(1);
    static final apam a = new amjw(0);

    private amjw(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
                return a.aW(i2);
            case 1:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    apakVar = amjv.ON_ERROR;
                                }
                            } else {
                                apakVar = amjv.ON_COMPLETE;
                            }
                        } else {
                            apakVar = amjv.FIRST_DATA_RECEIVED;
                        }
                    } else {
                        apakVar = amjv.BINDING_STARTED;
                    }
                } else {
                    apakVar = amjv.UNKNOWN_STATUS;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 2:
                return a.aW(i2);
            case 3:
                if (amjy.b(i2) == null) {
                    return false;
                }
                return true;
            case 4:
                return a.aW(i2);
            case 5:
                switch (i2) {
                    case 0:
                        apakVar = amkb.UNKNOWN;
                        break;
                    case 1:
                        apakVar = amkb.SENDERS_IDENTITY_INCORRECT;
                        break;
                    case 2:
                        apakVar = amkb.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED;
                        break;
                    case 3:
                        apakVar = amkb.SENDERS_USER_ID_INCORRECT;
                        break;
                    case 4:
                        apakVar = amkb.TACHYON_DOWNLOAD_FAILED;
                        break;
                    case 5:
                        apakVar = amkb.OTHER_EXCEPTION;
                        break;
                    case 6:
                        apakVar = amkb.SUCCESS;
                        break;
                    case 7:
                        apakVar = amkb.SENDERS_USER_ID_EMPTY;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 6:
                if (amkd.b(i2) == null) {
                    return false;
                }
                return true;
            case 7:
                return a.bf(i2);
            case 8:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    apakVar = amkj.NOT_PROVISIONED_BUT_INITIALIZED;
                                }
                            } else {
                                apakVar = amkj.DISABLED;
                            }
                        } else {
                            apakVar = amkj.NOT_PROVISIONED;
                        }
                    } else {
                        apakVar = amkj.PROVISIONED;
                    }
                } else {
                    apakVar = amkj.UNKNOWN_PROVISIONING_STATE;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 9:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            apakVar = amkk.LOW_PREKEYS;
                        }
                    } else {
                        apakVar = amkk.SUFFICIENT_PREKEYS;
                    }
                } else {
                    apakVar = amkk.UNKNOWN_PREKEY_STATE;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 10:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                apakVar = amkl.REGISTERED_WITH_PREKEYS;
                            }
                        } else {
                            apakVar = amkl.REGISTERED_WITHOUT_PREKEYS;
                        }
                    } else {
                        apakVar = amkl.NOT_REGISTERED;
                    }
                } else {
                    apakVar = amkl.UNKNOWN_TACHYON_STATE;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 11:
                return a.aY(i2);
            case 12:
                return a.aY(i2);
            case 13:
                return a.be(i2);
            case 14:
                return a.bb(i2);
            case 15:
                switch (i2) {
                    case 0:
                        apakVar = amku.UNKNOWN_TRIGGER_SOURCE;
                        break;
                    case 1:
                        apakVar = amku.CREATE_GROUP_CHAT_COMPLETE_CALLBACK;
                        break;
                    case 2:
                        apakVar = amku.GROUP_NOTIFICATION;
                        break;
                    case 3:
                        apakVar = amku.GROUP_NOTIFICATION_VANILLA_RCS;
                        break;
                    case 4:
                        apakVar = amku.INCOMING_IS_COMPOSING;
                        break;
                    case 5:
                        apakVar = amku.INCOMING_GROUP_INVITE_HANDLER;
                        break;
                    case 6:
                        apakVar = amku.INCOMING_FILE_TRANSFER;
                        break;
                    case 7:
                        apakVar = amku.INCOMING_FILE_TRANSFER_VANILLA_RCS;
                        break;
                    case 8:
                        apakVar = amku.INCOMING_MESSAGE;
                        break;
                    case 9:
                        apakVar = amku.RESET_SESSION_ID_EVENT;
                        break;
                    case 10:
                        apakVar = amku.GROUP_SESSION_STARTED_EVENT;
                        break;
                    case 11:
                        apakVar = amku.TACHYGRAM_TO_CHAT_API_INCOMING_MESSAGE_ADAPTER;
                        break;
                    case 12:
                        apakVar = amku.MESSAGE_SENDING_THREAD_ID_VERIFICATION;
                        break;
                    case 13:
                        apakVar = amku.TACHYGRAM_GET_ROUTING_TOKEN;
                        break;
                    case 14:
                        apakVar = amku.GET_OR_CREATE_CONVERSATION_ACTION;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 16:
                return a.bi(i2);
            case 17:
                return a.bf(i2);
            case 18:
                switch (i2) {
                    case 0:
                        apakVar = amlg.UNDEFINED;
                        break;
                    case 1:
                        apakVar = amlg.XMS_MESSAGE_ON_RCS_GROUP;
                        break;
                    case 2:
                        apakVar = amlg.RECIPIENT_LOST_RCS;
                        break;
                    case 3:
                        apakVar = amlg.ATTACHMENT_FAILED_TO_SEND;
                        break;
                    case 4:
                        apakVar = amlg.MESSAGE_TO_NON_ENCRYPTED_RECIPIENT;
                        break;
                    case 5:
                        apakVar = amlg.RECIPIENT_DID_NOT_DECRYPT;
                        break;
                    case 6:
                        apakVar = amlg.ATTACHMENT_PROCESS_FAILED;
                        break;
                    case 7:
                        apakVar = amlg.APP_RESTART;
                        break;
                    case 8:
                        apakVar = amlg.EMERGENCY_NUMBER;
                        break;
                    case 9:
                        apakVar = amlg.CANCELED;
                        break;
                    case 10:
                        apakVar = amlg.SENDING_TIMEOUT;
                        break;
                    case 11:
                        apakVar = amlg.DELIVERY_TIMEOUT;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 19:
                return a.be(i2);
            default:
                return a.aW(i2);
        }
    }
}
