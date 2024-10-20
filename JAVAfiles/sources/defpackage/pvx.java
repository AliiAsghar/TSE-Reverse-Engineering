package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pvx extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        amwx amwxVar = (amwx) obj;
        int ordinal = amwxVar.ordinal();
        if (ordinal != 12) {
            if (ordinal != 14) {
                if (ordinal != 15) {
                    switch (ordinal) {
                        case 0:
                            return qee.UNKNOWN_CAUSE;
                        case 1:
                            return qee.TRANSPORT_GENERIC_ERROR;
                        case 2:
                            return qee.NOT_CONNECTED;
                        case 3:
                            return qee.GROUP_TOO_FEW_PARTICIPANTS;
                        case 4:
                            return qee.GROUP_TOO_MANY_PARTICIPANTS;
                        case 5:
                            return qee.USER_NOT_A_GROUP_PARTICIPANT;
                        case 6:
                            return qee.INVALID_LOCAL_PARTICIPANT;
                        case 7:
                            return qee.INVALID_REMOTE_PARTICIPANT;
                        default:
                            switch (ordinal) {
                                case 19:
                                    return qee.NETWORK_CONNECTION_ERROR;
                                case 20:
                                    return qee.NETWORK_PERMISSION_DENIED;
                                case 21:
                                    return qee.REMOTE_PARTICIPANT_NOT_RCS_CAPABLE;
                                case 22:
                                    return qee.TRANSPORT_UNAVAILABLE;
                                default:
                                    throw new IllegalArgumentException("unknown enum value: ".concat(amwxVar.toString()));
                            }
                    }
                }
                return qee.TRANSPORT_INTERNAL_ERROR;
            }
            return qee.LOW_PRIORITY_MESSAGE_REJECTED;
        }
        return qee.GROUP_NOT_FOUND;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        qee qeeVar = (qee) obj;
        switch (qeeVar) {
            case UNKNOWN_CAUSE:
                return amwx.CHAT_API_ERROR_CAUSE_UNKNOWN;
            case NOT_CONNECTED:
                return amwx.CHAT_API_TRANSPORT_NOT_CONNECTED;
            case GROUP_TOO_FEW_PARTICIPANTS:
                return amwx.CHAT_API_GROUP_TOO_FEW_PARTICIPANTS;
            case GROUP_TOO_MANY_PARTICIPANTS:
                return amwx.CHAT_API_GROUP_TOO_MANY_PARTICIPANTS;
            case USER_NOT_A_GROUP_PARTICIPANT:
                return amwx.CHAT_API_USER_NOT_A_GROUP_PARTICIPANT;
            case TRANSPORT_GENERIC_ERROR:
                return amwx.CHAT_API_GENERIC_TRANSPORT_ERROR;
            case INVALID_LOCAL_PARTICIPANT:
                return amwx.CHAT_API_INVALID_LOCAL_PARTICIPANT;
            case INVALID_REMOTE_PARTICIPANT:
                return amwx.CHAT_API_INVALID_REMOTE_PARTICIPANT;
            case GROUP_NOT_FOUND:
                return amwx.CHAT_API_GROUP_NOT_FOUND;
            case LOW_PRIORITY_MESSAGE_REJECTED:
                return amwx.CHAT_API_LOW_PRIORITY_MESSAGE_REJECTED;
            case TRANSPORT_INTERNAL_ERROR:
                return amwx.CHAT_API_TRANSPORT_INTERNAL_ERROR;
            case REMOTE_PARTICIPANT_NOT_RCS_CAPABLE:
                return amwx.CHAT_API_REMOTE_PARTICIPANT_NOT_RCS_CAPABLE;
            case NETWORK_CONNECTION_ERROR:
                return amwx.CHAT_API_NETWORK_CONNECTION_ERROR;
            case NETWORK_PERMISSION_DENIED:
                return amwx.CHAT_API_NETWORK_PERMISSION_DENIED;
            case TRANSPORT_UNAVAILABLE:
                return amwx.CHAT_API_TRANSPORT_UNAVAILABLE;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(qeeVar.toString()));
        }
    }
}
