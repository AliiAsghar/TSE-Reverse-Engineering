package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amwm implements apam {
    private final /* synthetic */ int v;
    static final apam u = new amwm(20);
    static final apam t = new amwm(19);
    static final apam s = new amwm(18);
    public static final apam r = new amwm(17);
    static final apam q = new amwm(16);
    static final apam p = new amwm(15);
    static final apam o = new amwm(14);
    static final apam n = new amwm(13);
    static final apam m = new amwm(12);
    static final apam l = new amwm(11);
    static final apam k = new amwm(10);
    static final apam j = new amwm(9);
    static final apam i = new amwm(8);
    public static final apam h = new amwm(7);
    static final apam g = new amwm(6);
    public static final apam f = new amwm(5);
    static final apam e = new amwm(4);
    static final apam d = new amwm(3);
    static final apam c = new amwm(2);
    static final apam b = new amwm(1);
    static final apam a = new amwm(0);

    private amwm(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
                return a.bb(i2);
            case 1:
                return a.be(i2);
            case 2:
                return a.bf(i2);
            case 3:
                return a.be(i2);
            case 4:
                return a.aW(i2);
            case 5:
                if (amwt.b(i2) == null) {
                    return false;
                }
                return true;
            case 6:
                return a.bg(i2);
            case 7:
                if (amww.b(i2) == null) {
                    return false;
                }
                return true;
            case 8:
                return a.bk(i2);
            case 9:
                switch (i2) {
                    case 0:
                        apakVar = amwx.CHAT_API_ERROR_CAUSE_UNKNOWN;
                        break;
                    case 1:
                        apakVar = amwx.CHAT_API_GENERIC_TRANSPORT_ERROR;
                        break;
                    case 2:
                        apakVar = amwx.CHAT_API_TRANSPORT_NOT_CONNECTED;
                        break;
                    case 3:
                        apakVar = amwx.CHAT_API_GROUP_TOO_FEW_PARTICIPANTS;
                        break;
                    case 4:
                        apakVar = amwx.CHAT_API_GROUP_TOO_MANY_PARTICIPANTS;
                        break;
                    case 5:
                        apakVar = amwx.CHAT_API_USER_NOT_A_GROUP_PARTICIPANT;
                        break;
                    case 6:
                        apakVar = amwx.CHAT_API_INVALID_LOCAL_PARTICIPANT;
                        break;
                    case 7:
                        apakVar = amwx.CHAT_API_INVALID_REMOTE_PARTICIPANT;
                        break;
                    case 8:
                        apakVar = amwx.CHAT_API_INVALID_FILE_UPLOAD_RESULT;
                        break;
                    case 9:
                        apakVar = amwx.CHAT_API_SERIALIZATION_ERROR;
                        break;
                    case 10:
                        apakVar = amwx.CHAT_API_NO_RCS_SUBSCRIPTION;
                        break;
                    case 11:
                        apakVar = amwx.CHAT_API_UPLOAD_START_FAILED;
                        break;
                    case 12:
                        apakVar = amwx.CHAT_API_GROUP_NOT_FOUND;
                        break;
                    case 13:
                        apakVar = amwx.CHAT_API_EMPTY_CHAT_MESSAGE;
                        break;
                    case 14:
                        apakVar = amwx.CHAT_API_LOW_PRIORITY_MESSAGE_REJECTED;
                        break;
                    case 15:
                        apakVar = amwx.CHAT_API_TRANSPORT_INTERNAL_ERROR;
                        break;
                    case 16:
                        apakVar = amwx.CHAT_API_TRANSPORT_ILLEGAL_ARGUMENTS;
                        break;
                    case 17:
                        apakVar = amwx.CHAT_API_INVALID_CONVERSATION_ID;
                        break;
                    case 18:
                        apakVar = amwx.CHAT_API_INVALID_CONFERENCE_URI;
                        break;
                    case 19:
                        apakVar = amwx.CHAT_API_NETWORK_CONNECTION_ERROR;
                        break;
                    case 20:
                        apakVar = amwx.CHAT_API_NETWORK_PERMISSION_DENIED;
                        break;
                    case 21:
                        apakVar = amwx.CHAT_API_REMOTE_PARTICIPANT_NOT_RCS_CAPABLE;
                        break;
                    case 22:
                        apakVar = amwx.CHAT_API_TRANSPORT_UNAVAILABLE;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 10:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    apakVar = amwy.CHAT_API_FAILED_PERMANENTLY;
                                }
                            } else {
                                apakVar = amwy.CHAT_API_FAILED_TRANSIENTLY;
                            }
                        } else {
                            apakVar = amwy.CHAT_API_PENDING;
                        }
                    } else {
                        apakVar = amwy.CHAT_API_OK;
                    }
                } else {
                    apakVar = amwy.CHAT_API_UNKNOWN;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 11:
                return a.aW(i2);
            case 12:
                return a.aW(i2);
            case 13:
                return a.aY(i2);
            case 14:
                return a.bh(i2);
            case 15:
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
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        return true;
                    case 16:
                    default:
                        return false;
                }
            case 16:
                return a.aW(i2);
            case 17:
                if (amxo.b(i2) == null) {
                    return false;
                }
                return true;
            case 18:
                return a.aW(i2);
            case 19:
                switch (i2) {
                    case 0:
                        apakVar = amxr.UNDEFINED_EVENT;
                        break;
                    case 1:
                        apakVar = amxr.REQUEST_BUGLE_DATABASE_RESTORE;
                        break;
                    case 2:
                        apakVar = amxr.REQUEST_ATTACHMENTS_RESTORE;
                        break;
                    case 3:
                        apakVar = amxr.COMPLETE_RESTORE;
                        break;
                    case 4:
                        apakVar = amxr.DO_COMPLETE_RESTORE;
                        break;
                    case 5:
                        apakVar = amxr.DO_BUGLE_DATABASE_RESTORE;
                        break;
                    case 6:
                        apakVar = amxr.DO_ATTACHMENTS_RESTORE;
                        break;
                    case 7:
                        apakVar = amxr.REQUEST_RESTORE_AFTER_APP_UPDATE;
                        break;
                    case 8:
                        apakVar = amxr.INITIALIZE_RESTORE_WORKFLOW;
                        break;
                    case 9:
                        apakVar = amxr.CLEAN_UP;
                        break;
                    case 10:
                        apakVar = amxr.COMPLETE_FROM_STALLED_RESTORE;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            default:
                return a.be(i2);
        }
    }
}
