package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amwt implements apak {
    INVALID_PRE_KOTO(0),
    BUGLE_LOADING_AVAILABILITY_IN_PROGRESS(1),
    DISABLED_VIA_GSERVICES(2),
    DOGFOOD_SETUP_PENDING(3),
    DISABLED_FROM_PREFERENCES(4),
    DISABLED_NOT_DEFAULT_SMS_APP(5),
    DISABLED_REMOTELY(6),
    AVAILABLE(7),
    DISABLED_OLD_RCS_SERVICE_VERSION(8),
    DISABLED_SIM_ABSENT(9),
    CARRIER_SETUP_PENDING(10),
    DISABLED_MULTI_SLOT_DEVICE(11),
    DISABLED_FOR_FI(12),
    BUGLE_LOADING_AVAILABILITY_EXCEPTION(13),
    DISABLED_LEGACY_CLIENT_ENABLED(14),
    DISABLED_NO_PERMISSIONS(15),
    CARRIER_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING(16),
    DOGFOOD_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING(17),
    DISABLED_TERMS_AND_CONDITIONS_REJECTED(18),
    SUBJECT_TO_BATTERY_OPTIMIZATIONS(19),
    UNKNOWN_PEV2_DISABLED(20),
    DISABLED_WAITING_FOR_PHENOTYPE(21),
    DISABLED_STUB_PROVISIONING_ENGINE(22),
    DISABLED_VIA_FLAGS(23),
    DISABLED_BY_EMM(24),
    DISABLED_FOR_SECONDARY_USER(25),
    DISABLED_VIA_RCS_CONFIG_CHAT_AUTH(26),
    DISABLED_BY_PROVISIONING_RULE(27),
    DISABLED_FOR_WEAR(28),
    DISABLED_AUTOMATIC_PROVISIONING_RULE(29);

    public final int E;

    amwt(int i) {
        this.E = i;
    }

    public static amwt b(int i) {
        switch (i) {
            case 0:
                return INVALID_PRE_KOTO;
            case 1:
                return BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
            case 2:
                return DISABLED_VIA_GSERVICES;
            case 3:
                return DOGFOOD_SETUP_PENDING;
            case 4:
                return DISABLED_FROM_PREFERENCES;
            case 5:
                return DISABLED_NOT_DEFAULT_SMS_APP;
            case 6:
                return DISABLED_REMOTELY;
            case 7:
                return AVAILABLE;
            case 8:
                return DISABLED_OLD_RCS_SERVICE_VERSION;
            case 9:
                return DISABLED_SIM_ABSENT;
            case 10:
                return CARRIER_SETUP_PENDING;
            case 11:
                return DISABLED_MULTI_SLOT_DEVICE;
            case 12:
                return DISABLED_FOR_FI;
            case 13:
                return BUGLE_LOADING_AVAILABILITY_EXCEPTION;
            case 14:
                return DISABLED_LEGACY_CLIENT_ENABLED;
            case 15:
                return DISABLED_NO_PERMISSIONS;
            case 16:
                return CARRIER_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING;
            case 17:
                return DOGFOOD_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING;
            case 18:
                return DISABLED_TERMS_AND_CONDITIONS_REJECTED;
            case 19:
                return SUBJECT_TO_BATTERY_OPTIMIZATIONS;
            case 20:
                return UNKNOWN_PEV2_DISABLED;
            case 21:
                return DISABLED_WAITING_FOR_PHENOTYPE;
            case 22:
                return DISABLED_STUB_PROVISIONING_ENGINE;
            case 23:
                return DISABLED_VIA_FLAGS;
            case 24:
                return DISABLED_BY_EMM;
            case 25:
                return DISABLED_FOR_SECONDARY_USER;
            case 26:
                return DISABLED_VIA_RCS_CONFIG_CHAT_AUTH;
            case 27:
                return DISABLED_BY_PROVISIONING_RULE;
            case 28:
                return DISABLED_FOR_WEAR;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return DISABLED_AUTOMATIC_PROVISIONING_RULE;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.E;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.E);
    }
}
