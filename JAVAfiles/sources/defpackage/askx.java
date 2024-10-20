package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum askx implements apak {
    UNKNOWN(0),
    STRANGER_DANGER(1),
    USER_MARKED_AS_SPAM(2),
    USER_BLOCKED(3),
    USER_UNBLOCKED(4),
    APP_BLOCKED(5),
    APP_UNBLOCKED(7),
    USER_INITIATED_CONVERSATION(6),
    USER_INVITED_TO_GROUP(8),
    USER_MARKED_AS_NOT_SPAM(9),
    USER_SET_CONTACTS(10),
    USER_ADDED_CONTACTS(11),
    LOOKUP_REGISTRATION(12),
    DEVICE_SPAM_SIGNAL(13),
    UNRECOGNIZED(-1);

    private final int q;

    askx(int i) {
        this.q = i;
    }

    public static askx b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return STRANGER_DANGER;
            case 2:
                return USER_MARKED_AS_SPAM;
            case 3:
                return USER_BLOCKED;
            case 4:
                return USER_UNBLOCKED;
            case 5:
                return APP_BLOCKED;
            case 6:
                return USER_INITIATED_CONVERSATION;
            case 7:
                return APP_UNBLOCKED;
            case 8:
                return USER_INVITED_TO_GROUP;
            case 9:
                return USER_MARKED_AS_NOT_SPAM;
            case 10:
                return USER_SET_CONTACTS;
            case 11:
                return USER_ADDED_CONTACTS;
            case 12:
                return LOOKUP_REGISTRATION;
            case 13:
                return DEVICE_SPAM_SIGNAL;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
