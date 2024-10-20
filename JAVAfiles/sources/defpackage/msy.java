package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum msy implements apak {
    UNKNOWN_DESTINATION_TYPE(0),
    PHONE_E164(1),
    EMAIL(2),
    BOT(3),
    UNKNOWN_SENDER(4),
    PHONE_SHORT_NO_COUNTRY(5),
    PHONE_SHORT_WITH_COUNTRY(6),
    PHONE_EMERGENCY(7),
    PHONE_LOCAL_WITH_COUNTRY(8),
    PHONE_LOCAL_NO_COUNTRY(9),
    PHONE_NATIONAL(10),
    SATELLITE_ESP(11),
    PENPAL_BOT(12),
    ALPHA_SHORT_NO_COUNTRY(13),
    ALPHA_SHORT_WITH_COUNTRY(14),
    UNRECOGNIZED(-1);

    private final int r;

    msy(int i) {
        this.r = i;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
