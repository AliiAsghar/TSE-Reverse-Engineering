package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amgg implements apak {
    UNKNOWN_FORMAT(0),
    NOT_ONE_ON_ONE(1),
    POSSIBLE_SHORT_CODE_DEPRECATED(2),
    EMAIL_ADDRESS(3),
    PHONE_NUMBER_DEPRECATED(4),
    RBM_BOT(5),
    EMERGENCY_NUMBER(6),
    ALPHANUMERIC_SHORT_CODE_WITH_COUNTRY(7),
    ALPHANUMERIC_SHORT_CODE_WITHOUT_COUNTRY(8),
    DIGIT_SHORT_CODE_WITH_COUNTRY(9),
    DIGIT_SHORT_CODE_WITHOUT_COUNTRY(10),
    E164_PHONE_NUMBER(11),
    E164_FORMATTABLE_NATIONAL_PHONE_NUMBER(12),
    NON_E164_FORMATTABLE_LOCAL_NUMBER(13),
    WAP_PUSH_SI(14),
    EMPTY_STRING(15),
    LIGHTER(16),
    PENPAL_BOT(17),
    SATELLITE_ESP(18),
    SATELLITE_ESP_DEMO(19);

    public final int u;

    amgg(int i) {
        this.u = i;
    }

    public static amgg b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return NOT_ONE_ON_ONE;
            case 2:
                return POSSIBLE_SHORT_CODE_DEPRECATED;
            case 3:
                return EMAIL_ADDRESS;
            case 4:
                return PHONE_NUMBER_DEPRECATED;
            case 5:
                return RBM_BOT;
            case 6:
                return EMERGENCY_NUMBER;
            case 7:
                return ALPHANUMERIC_SHORT_CODE_WITH_COUNTRY;
            case 8:
                return ALPHANUMERIC_SHORT_CODE_WITHOUT_COUNTRY;
            case 9:
                return DIGIT_SHORT_CODE_WITH_COUNTRY;
            case 10:
                return DIGIT_SHORT_CODE_WITHOUT_COUNTRY;
            case 11:
                return E164_PHONE_NUMBER;
            case 12:
                return E164_FORMATTABLE_NATIONAL_PHONE_NUMBER;
            case 13:
                return NON_E164_FORMATTABLE_LOCAL_NUMBER;
            case 14:
                return WAP_PUSH_SI;
            case 15:
                return EMPTY_STRING;
            case 16:
                return LIGHTER;
            case 17:
                return PENPAL_BOT;
            case 18:
                return SATELLITE_ESP;
            case 19:
                return SATELLITE_ESP_DEMO;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.u;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.u);
    }
}
