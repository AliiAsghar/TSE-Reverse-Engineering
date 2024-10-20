package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wbq implements apak {
    ERROR_CAUSE_UNKNOWN(0),
    ERROR_CAUSE_GROUP_TOO_FEW_PARTICIPANTS(1),
    ERROR_CAUSE_GROUP_TOO_MANY_PARTICIPANTS(2),
    ERROR_CAUSE_USER_NOT_A_GROUP_PARTICIPANT(3),
    ERROR_CAUSE_GROUP_SESSION_NOT_FOUND(4),
    ERROR_CAUSE_NOT_AUTHORIZED_TO_RESTART_GROUP(5),
    ERROR_CAUSE_LOW_PRIORITY_MESSAGE_REJECTED(6),
    ERROR_CAUSE_TRANSPORT_INTERNAL_ERROR(7);

    public final int i;

    wbq(int i) {
        this.i = i;
    }

    public static wbq b(int i) {
        switch (i) {
            case 0:
                return ERROR_CAUSE_UNKNOWN;
            case 1:
                return ERROR_CAUSE_GROUP_TOO_FEW_PARTICIPANTS;
            case 2:
                return ERROR_CAUSE_GROUP_TOO_MANY_PARTICIPANTS;
            case 3:
                return ERROR_CAUSE_USER_NOT_A_GROUP_PARTICIPANT;
            case 4:
                return ERROR_CAUSE_GROUP_SESSION_NOT_FOUND;
            case 5:
                return ERROR_CAUSE_NOT_AUTHORIZED_TO_RESTART_GROUP;
            case 6:
                return ERROR_CAUSE_LOW_PRIORITY_MESSAGE_REJECTED;
            case 7:
                return ERROR_CAUSE_TRANSPORT_INTERNAL_ERROR;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
