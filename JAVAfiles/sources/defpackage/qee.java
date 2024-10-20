package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum qee implements apak {
    UNKNOWN_CAUSE(0),
    NOT_CONNECTED(1),
    GROUP_TOO_FEW_PARTICIPANTS(2),
    GROUP_TOO_MANY_PARTICIPANTS(3),
    USER_NOT_A_GROUP_PARTICIPANT(4),
    TRANSPORT_GENERIC_ERROR(5),
    INVALID_LOCAL_PARTICIPANT(6),
    INVALID_REMOTE_PARTICIPANT(7),
    GROUP_NOT_FOUND(8),
    LOW_PRIORITY_MESSAGE_REJECTED(9),
    TRANSPORT_INTERNAL_ERROR(10),
    REMOTE_PARTICIPANT_NOT_RCS_CAPABLE(11),
    NETWORK_CONNECTION_ERROR(16),
    NETWORK_PERMISSION_DENIED(17),
    TRANSPORT_UNAVAILABLE(18);

    public final int p;

    qee(int i) {
        this.p = i;
    }

    public static qee b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CAUSE;
            case 1:
                return NOT_CONNECTED;
            case 2:
                return GROUP_TOO_FEW_PARTICIPANTS;
            case 3:
                return GROUP_TOO_MANY_PARTICIPANTS;
            case 4:
                return USER_NOT_A_GROUP_PARTICIPANT;
            case 5:
                return TRANSPORT_GENERIC_ERROR;
            case 6:
                return INVALID_LOCAL_PARTICIPANT;
            case 7:
                return INVALID_REMOTE_PARTICIPANT;
            case 8:
                return GROUP_NOT_FOUND;
            case 9:
                return LOW_PRIORITY_MESSAGE_REJECTED;
            case 10:
                return TRANSPORT_INTERNAL_ERROR;
            case 11:
                return REMOTE_PARTICIPANT_NOT_RCS_CAPABLE;
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                return null;
            case 16:
                return NETWORK_CONNECTION_ERROR;
            case 17:
                return NETWORK_PERMISSION_DENIED;
            case 18:
                return TRANSPORT_UNAVAILABLE;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
