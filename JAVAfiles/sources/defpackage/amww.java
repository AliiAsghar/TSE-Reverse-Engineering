package defpackage;

import com.google.android.gms.common.internal.IGmsServiceBroker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amww implements apak {
    UNDEFINED_TRIGGER_EVENT(0),
    BOOT_COMPLETE(1),
    PACKAGE_REPLACED(2),
    SIP_403_RESPONSE(3),
    APP_STARTUP(4),
    USER_SETTING_ENABLED(5),
    USER_SETTING_DISABLED(6),
    SIM_SWAP(7),
    TACHYON_REPROVISION_ERROR(8),
    CSLIB_PHENOTYPE_UPDATE(9),
    GSERVICE_UPDATE(10),
    DEFAULT_SMS_APP_ENABLED(11),
    DEFAULT_SMS_APP_DISABLED(12),
    RECONFIG_SMS(13),
    SINGLE_REGISTRATION_PROVISIONING_EVENT(14),
    SINGLE_REGISTRATION_CAPABILITY_UPDATE(15),
    OTP_SMS_RECEIVED(16),
    RCS_SYSTEM_BINDING(17),
    SINGLE_REGISTRATION_CONFIGURATION_REMOVED(18),
    SIM_REMOVAL(19),
    MOBILE_CONFIGURATION_UPDATE(20),
    TACHYON_INVALID_IDENTITY_ERROR(21),
    COMPLETE_GOOGLE_TOS(22),
    RCS_PROMO_POPUP_PRESENTER(23),
    TERMS_AND_CONDITIONS_ACCEPTED(24),
    RCS_WELCOME_MESSAGE_ON_SUCCESS(25),
    CARRIER_TOS_POPUP_BOTTOM_SHEET_DIALOG(26),
    DEBUG_UTILS(27),
    BATTERY_OPTIMIZATION_DIALOG(28),
    CONFIGURATION_NOT_VALID(29),
    MANUAL_MSISDN_ENTRY_REQUIRED(30),
    STATE_MACHINE_RETRY(31),
    STATE_MACHINE_REPLAY(32),
    PHONE_NUMBER_INPUT_BOTTOM_SHEET_CANCEL_BUTTON(33),
    PHONE_NUMBER_INPUT_BOTTOM_SHEET_CONTINUE_BUTTON(34),
    PHONE_NUMBER_INPUT_CONTINUE_BUTTON(35),
    RCS_CONFIGURATION_UPDATED(36),
    DECLINED_GOOGLE_TOS(37),
    DECLINED_RCS_IN_WELCOME_ACTIVITY(38),
    RECEIVED_POST_PROVISIONING_INTENT(39),
    FILE_TRANSFER_CREDENTIALS_EXPIRED(40),
    LEGAL_FYI_SEEN(41),
    REPROVISIONING_CAMPAIGN(42),
    USER_SETTING_ENABLED_GLOBAL(43),
    USER_SETTING_DISABLED_GLOBAL(44),
    USER_SETTING_ENABLED_PER_SIM(45),
    USER_SETTING_DISABLED_PER_SIM(46),
    FI_ACTIVATION_COMPLETE(47),
    DEFAULT_CALL_SIM_UPDATE(48),
    DEFAULT_SMS_SIM_UPDATE(49),
    DEFAULT_DATA_SIM_UPDATE(50),
    SERVICE_STATE_CHANGE(51);

    public final int aa;

    amww(int i) {
        this.aa = i;
    }

    public static amww b(int i) {
        switch (i) {
            case 0:
                return UNDEFINED_TRIGGER_EVENT;
            case 1:
                return BOOT_COMPLETE;
            case 2:
                return PACKAGE_REPLACED;
            case 3:
                return SIP_403_RESPONSE;
            case 4:
                return APP_STARTUP;
            case 5:
                return USER_SETTING_ENABLED;
            case 6:
                return USER_SETTING_DISABLED;
            case 7:
                return SIM_SWAP;
            case 8:
                return TACHYON_REPROVISION_ERROR;
            case 9:
                return CSLIB_PHENOTYPE_UPDATE;
            case 10:
                return GSERVICE_UPDATE;
            case 11:
                return DEFAULT_SMS_APP_ENABLED;
            case 12:
                return DEFAULT_SMS_APP_DISABLED;
            case 13:
                return RECONFIG_SMS;
            case 14:
                return SINGLE_REGISTRATION_PROVISIONING_EVENT;
            case 15:
                return SINGLE_REGISTRATION_CAPABILITY_UPDATE;
            case 16:
                return OTP_SMS_RECEIVED;
            case 17:
                return RCS_SYSTEM_BINDING;
            case 18:
                return SINGLE_REGISTRATION_CONFIGURATION_REMOVED;
            case 19:
                return SIM_REMOVAL;
            case 20:
                return MOBILE_CONFIGURATION_UPDATE;
            case 21:
                return TACHYON_INVALID_IDENTITY_ERROR;
            case 22:
                return COMPLETE_GOOGLE_TOS;
            case 23:
                return RCS_PROMO_POPUP_PRESENTER;
            case 24:
                return TERMS_AND_CONDITIONS_ACCEPTED;
            case 25:
                return RCS_WELCOME_MESSAGE_ON_SUCCESS;
            case 26:
                return CARRIER_TOS_POPUP_BOTTOM_SHEET_DIALOG;
            case 27:
                return DEBUG_UTILS;
            case 28:
                return BATTERY_OPTIMIZATION_DIALOG;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return CONFIGURATION_NOT_VALID;
            case 30:
                return MANUAL_MSISDN_ENTRY_REQUIRED;
            case 31:
                return STATE_MACHINE_RETRY;
            case 32:
                return STATE_MACHINE_REPLAY;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                return PHONE_NUMBER_INPUT_BOTTOM_SHEET_CANCEL_BUTTON;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                return PHONE_NUMBER_INPUT_BOTTOM_SHEET_CONTINUE_BUTTON;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                return PHONE_NUMBER_INPUT_CONTINUE_BUTTON;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                return RCS_CONFIGURATION_UPDATED;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                return DECLINED_GOOGLE_TOS;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                return DECLINED_RCS_IN_WELCOME_ACTIVITY;
            case 39:
                return RECEIVED_POST_PROVISIONING_INTENT;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                return FILE_TRANSFER_CREDENTIALS_EXPIRED;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                return LEGAL_FYI_SEEN;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                return REPROVISIONING_CAMPAIGN;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                return USER_SETTING_ENABLED_GLOBAL;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                return USER_SETTING_DISABLED_GLOBAL;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                return USER_SETTING_ENABLED_PER_SIM;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                return USER_SETTING_DISABLED_PER_SIM;
            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                return FI_ACTIVATION_COMPLETE;
            case 48:
                return DEFAULT_CALL_SIM_UPDATE;
            case 49:
                return DEFAULT_SMS_SIM_UPDATE;
            case 50:
                return DEFAULT_DATA_SIM_UPDATE;
            case 51:
                return SERVICE_STATE_CHANGE;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.aa;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.aa);
    }
}
