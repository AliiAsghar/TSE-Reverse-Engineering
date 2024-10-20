package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum anhg implements apak {
    UNKNOWN_API_FEATURE(0),
    CALL_INTENT_API_CALL_PHONE_NUMBER(1),
    CALL_INTENT_API_TARGETED_CALL(2),
    CALL_INTENT_API_SELF_CALL(5),
    INTENT_API_OPEN_SETTINGS(3),
    INTENT_API_OPEN_BLOCKED_CONTACTS(4),
    SERVICE_API_GET_REGISTRATION_INFO(6),
    SERVICE_API_GET_REGISTERED_ID_TYPE(7),
    DUO_KIT_REQUESTS(8),
    MEET_API_REQUESTS(9),
    UNRECOGNIZED(-1);

    private final int m;

    anhg(int i) {
        this.m = i;
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
