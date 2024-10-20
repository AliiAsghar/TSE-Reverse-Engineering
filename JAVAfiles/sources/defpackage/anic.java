package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum anic implements apak {
    CMS_DATA_PROVIDER_UNSPECIFIED(0),
    MESSAGE_REPLIES(1),
    MESSAGE_STAR(2),
    MESSAGE_REACTIONS(3),
    READ_REPORTS(4),
    CONVERSATION_PIN(5),
    SCHEDULED_SEND(6),
    USER_REFERENCE(7),
    CUSTOM_THEMES(8),
    MESSAGE_CAPTIONS(9),
    UNRECOGNIZED(-1);

    private final int m;

    anic(int i) {
        this.m = i;
    }

    public static anic b(int i) {
        switch (i) {
            case 0:
                return CMS_DATA_PROVIDER_UNSPECIFIED;
            case 1:
                return MESSAGE_REPLIES;
            case 2:
                return MESSAGE_STAR;
            case 3:
                return MESSAGE_REACTIONS;
            case 4:
                return READ_REPORTS;
            case 5:
                return CONVERSATION_PIN;
            case 6:
                return SCHEDULED_SEND;
            case 7:
                return USER_REFERENCE;
            case 8:
                return CUSTOM_THEMES;
            case 9:
                return MESSAGE_CAPTIONS;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
