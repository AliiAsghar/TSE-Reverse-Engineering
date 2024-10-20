package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apjx implements apak {
    UNKNOWN_PROVISIONING_STAGE(0),
    ENABLED_STAGE(1),
    GOOGLE_TOS_STAGE(2),
    BATTERY_OPT_EXEMPTION_STAGE(3),
    READY_STAGE(4),
    REQUEST_WITH_HE_STAGE(5),
    REQUEST_WITH_IMSI_STAGE(6),
    CARRIER_CONSENT_REQUEST_STAGE(7),
    REQUEST_WITH_MSISDN_STAGE(8),
    MANUAL_MSISDN_ENTRY_STAGE(9),
    WAITING_FOR_OTP_STAGE(10),
    VERIFY_OTP_STAGE(11),
    PROCESS_CONFIGURATION_STAGE(12),
    TERMS_AND_CONDITIONS_STAGE(13),
    CONFIGURED_STAGE(14),
    RETRY_STAGE(15),
    REQUEST_WITH_TOKEN_STAGE(16),
    SEND_DISABLE_RCS_STAGE(17),
    DISABLED_STAGE(18),
    SET_GOOGLE_TOS_CONSENT_STAGE(19),
    GET_GOOGLE_TOS_CONSENT_STAGE(20),
    REQUEST_WITH_MSISDN_TOKEN_STAGE(21),
    VERIFY_MSISDN_STAGE(22),
    RCS_DEFAULT_ON_STAGE(23);

    public final int y;

    apjx(int i) {
        this.y = i;
    }

    public static apjx b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PROVISIONING_STAGE;
            case 1:
                return ENABLED_STAGE;
            case 2:
                return GOOGLE_TOS_STAGE;
            case 3:
                return BATTERY_OPT_EXEMPTION_STAGE;
            case 4:
                return READY_STAGE;
            case 5:
                return REQUEST_WITH_HE_STAGE;
            case 6:
                return REQUEST_WITH_IMSI_STAGE;
            case 7:
                return CARRIER_CONSENT_REQUEST_STAGE;
            case 8:
                return REQUEST_WITH_MSISDN_STAGE;
            case 9:
                return MANUAL_MSISDN_ENTRY_STAGE;
            case 10:
                return WAITING_FOR_OTP_STAGE;
            case 11:
                return VERIFY_OTP_STAGE;
            case 12:
                return PROCESS_CONFIGURATION_STAGE;
            case 13:
                return TERMS_AND_CONDITIONS_STAGE;
            case 14:
                return CONFIGURED_STAGE;
            case 15:
                return RETRY_STAGE;
            case 16:
                return REQUEST_WITH_TOKEN_STAGE;
            case 17:
                return SEND_DISABLE_RCS_STAGE;
            case 18:
                return DISABLED_STAGE;
            case 19:
                return SET_GOOGLE_TOS_CONSENT_STAGE;
            case 20:
                return GET_GOOGLE_TOS_CONSENT_STAGE;
            case 21:
                return REQUEST_WITH_MSISDN_TOKEN_STAGE;
            case 22:
                return VERIFY_MSISDN_STAGE;
            case 23:
                return RCS_DEFAULT_ON_STAGE;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.y;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.y);
    }
}
