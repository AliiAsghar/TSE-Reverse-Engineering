package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amlx implements apak {
    PROVISIONING_UI_TYPE_UNKNOWN(0),
    PROVISIONING_UI_TYPE_RCS_PROMO(1),
    PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO(2),
    PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_M2(3),
    PROVISIONING_UI_TYPE_GOOGLE_TOS_FROM_SETTINGS(4),
    PROVISIONING_UI_TYPE_MANUAL_MSISDN_ENTRY(5),
    PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST(6),
    PROVISIONING_UI_TYPE_WELCOME_CHAT_FEATURES(7),
    PROVISIONING_UI_TYPE_MANUAL_MSISDN_ENTRY_V2(8),
    PROVISIONING_UI_TYPE_STREAMLINED_PHONE_NUMBER_INPUT(9),
    PROVISIONING_UI_TYPE_SETTINGS_CHAT_FEATURES(10),
    PROVISIONING_UI_TYPE_CARRIER_TOS_PROMO(11),
    PROVISIONING_UI_TYPE_RCS_SUCCESS(12),
    PROVISIONING_UI_TYPE_PHONE_NUMBER_PROMO_BOTTOMSHEET(13),
    PROVISIONING_UI_TYPE_PHONE_NUMBER_PROMO_BANNER(14),
    PROVISIONING_UI_TYPE_GOOGLE_TOS_BANNER(15),
    PROVISIONING_UI_TYPE_LEGAL_FYI(16),
    PROVISIONING_UI_TYPE_RCS_DEFAULT_ON_OOB(17),
    PROVISIONING_UI_TYPE_WELCOME_MESSAGE(18);

    public final int t;

    amlx(int i) {
        this.t = i;
    }

    public static amlx b(int i) {
        switch (i) {
            case 0:
                return PROVISIONING_UI_TYPE_UNKNOWN;
            case 1:
                return PROVISIONING_UI_TYPE_RCS_PROMO;
            case 2:
                return PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO;
            case 3:
                return PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_M2;
            case 4:
                return PROVISIONING_UI_TYPE_GOOGLE_TOS_FROM_SETTINGS;
            case 5:
                return PROVISIONING_UI_TYPE_MANUAL_MSISDN_ENTRY;
            case 6:
                return PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST;
            case 7:
                return PROVISIONING_UI_TYPE_WELCOME_CHAT_FEATURES;
            case 8:
                return PROVISIONING_UI_TYPE_MANUAL_MSISDN_ENTRY_V2;
            case 9:
                return PROVISIONING_UI_TYPE_STREAMLINED_PHONE_NUMBER_INPUT;
            case 10:
                return PROVISIONING_UI_TYPE_SETTINGS_CHAT_FEATURES;
            case 11:
                return PROVISIONING_UI_TYPE_CARRIER_TOS_PROMO;
            case 12:
                return PROVISIONING_UI_TYPE_RCS_SUCCESS;
            case 13:
                return PROVISIONING_UI_TYPE_PHONE_NUMBER_PROMO_BOTTOMSHEET;
            case 14:
                return PROVISIONING_UI_TYPE_PHONE_NUMBER_PROMO_BANNER;
            case 15:
                return PROVISIONING_UI_TYPE_GOOGLE_TOS_BANNER;
            case 16:
                return PROVISIONING_UI_TYPE_LEGAL_FYI;
            case 17:
                return PROVISIONING_UI_TYPE_RCS_DEFAULT_ON_OOB;
            case 18:
                return PROVISIONING_UI_TYPE_WELCOME_MESSAGE;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.t;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.t);
    }
}
