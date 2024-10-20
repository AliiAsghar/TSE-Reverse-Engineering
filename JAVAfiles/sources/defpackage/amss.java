package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amss implements apak {
    UNKNOWN_REASON(0),
    SELF_NOT_ACTIVE_UPGRADER(1),
    CONVERSATION_NOT_ACTIVE(2),
    ACTIVE_SELF_NOT_FOUND(3),
    MAX_GROUP_SIZE_EXCEEDED(4),
    SELF_NOT_RCS_CAPABLE(5),
    SELF_NOT_REGISTERED(6),
    PARTICIPANT_NOT_RCS_CAPABLE(7),
    PARTICIPANT_NOT_UPGRADE_CAPABLE(8),
    REMOTE_PARTICIPANT_NOT_NORMALIZED(9),
    GROUP_SIZE_TOO_LARGE(10),
    PARTICIPANT_NOT_GOOGLE_MESSAGES(11),
    DUPLICATE_RCS_GROUP_EXISTS(12),
    SELF_IDENTITY_IN_PARTICIPANTS(13);

    public final int o;

    amss(int i) {
        this.o = i;
    }

    public static amss b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_REASON;
            case 1:
                return SELF_NOT_ACTIVE_UPGRADER;
            case 2:
                return CONVERSATION_NOT_ACTIVE;
            case 3:
                return ACTIVE_SELF_NOT_FOUND;
            case 4:
                return MAX_GROUP_SIZE_EXCEEDED;
            case 5:
                return SELF_NOT_RCS_CAPABLE;
            case 6:
                return SELF_NOT_REGISTERED;
            case 7:
                return PARTICIPANT_NOT_RCS_CAPABLE;
            case 8:
                return PARTICIPANT_NOT_UPGRADE_CAPABLE;
            case 9:
                return REMOTE_PARTICIPANT_NOT_NORMALIZED;
            case 10:
                return GROUP_SIZE_TOO_LARGE;
            case 11:
                return PARTICIPANT_NOT_GOOGLE_MESSAGES;
            case 12:
                return DUPLICATE_RCS_GROUP_EXISTS;
            case 13:
                return SELF_IDENTITY_IN_PARTICIPANTS;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
