package defpackage;

import com.google.android.gms.common.internal.IGmsServiceBroker;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amlv implements apam {
    static final apam a = new amlv();

    private amlv() {
    }

    @Override // defpackage.apam
    public final boolean a(int i) {
        amlw amlwVar;
        switch (i) {
            case 0:
                amlwVar = amlw.RCS_PROVISIONING_UNKNOWN_INTERACTION;
                break;
            case 1:
                amlwVar = amlw.RCS_PROVISIONING_PROMPT_SEEN;
                break;
            case 2:
                amlwVar = amlw.RCS_PROVISIONING_PROMPT_ACCEPTED;
                break;
            case 3:
                amlwVar = amlw.RCS_PROVISIONING_PROMPT_DECLINED;
                break;
            case 4:
                amlwVar = amlw.RCS_PROVISIONING_PROMPT_TERMS_AND_CONDITION_CLICKED;
                break;
            case 5:
                amlwVar = amlw.RCS_PROVISIONING_PROMPT_PRIVACY_AND_POLICY_CLICKED;
                break;
            case 6:
                amlwVar = amlw.RCS_PROVISIONING_RCS_PROMO_SEEN;
                break;
            case 7:
                amlwVar = amlw.RCS_PROVISIONING_RCS_PROMO_TERM_AND_CONDITION_CLICKED;
                break;
            case 8:
                amlwVar = amlw.RCS_PROVISIONING_RCS_PROMO_ACCEPTED;
                break;
            case 9:
                amlwVar = amlw.RCS_PROVISIONING_RCS_PROMO_DECLINED;
                break;
            case 10:
                amlwVar = amlw.RCS_PROVISIONING_RCS_PROMO_LEARNING_MORE_CLICKED;
                break;
            case 11:
                amlwVar = amlw.RCS_PROVISIONING_BOEW_SEEN;
                break;
            case 12:
                amlwVar = amlw.RCS_PROVISIONING_BOEW_ACCEPTED;
                break;
            case 13:
                amlwVar = amlw.RCS_PROVISIONING_BOEW_REJECTED;
                break;
            case 14:
                amlwVar = amlw.RCS_PROVISIONING_SUCCESS_POPUP_SEEN;
                break;
            case 15:
                amlwVar = amlw.RCS_PROVISIONING_SUCCESS_POPUP_DISMISSED;
                break;
            case 16:
                amlwVar = amlw.RCS_PROVISIONING_SUCCESS_POPUP_IGNORED;
                break;
            case 17:
                amlwVar = amlw.RCS_PROVISIONING_DOUBLE_CHECK_DIALOG_ACCEPTED;
                break;
            case 18:
                amlwVar = amlw.RCS_PROVISIONING_DOUBLE_CHECK_DIALOG_REJECTED;
                break;
            case 19:
                amlwVar = amlw.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_SEEN;
                break;
            case 20:
                amlwVar = amlw.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_ACCEPTED;
                break;
            case 21:
                amlwVar = amlw.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_REJECTED;
                break;
            case 22:
                amlwVar = amlw.RCS_PROVISIONING_MANUAL_MSISDN_COUNTRY_CHANGED;
                break;
            case 23:
                amlwVar = amlw.RCS_PROVISIONING_PROMPT_LEARN_MORE_CLICKED;
                break;
            case 24:
                amlwVar = amlw.RCS_PROVISIONING_BACK_BUTTON_CLICKED;
                break;
            case 25:
                amlwVar = amlw.RCS_PROVISIONING_HOME_BUTTON_CLICKED;
                break;
            case 26:
                amlwVar = amlw.RCS_PROVISIONING_PROMPT_TERMS_SUMMARY_CLICKED;
                break;
            case 27:
                amlwVar = amlw.RCS_PROVISIONING_PROMPT_SUPPRESSED;
                break;
            case 28:
                amlwVar = amlw.RCS_PROVISIONING_PROMPT_ELIGIBLE_FOR_SUPPRESSION;
                break;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                amlwVar = amlw.RCS_PROVISIONING_SETTINGS_CHAT_FEATURES_SCREEN_SEEN;
                break;
            case 30:
                amlwVar = amlw.RCS_PROVISIONING_PROMPT_COUNTERFACTUAL_APPLIED;
                break;
            case 31:
                amlwVar = amlw.RCS_PROVISIONING_PHONE_NUMBER_PROMO_PRESENTED;
                break;
            case 32:
                amlwVar = amlw.RCS_PROVISIONING_PHONE_NUMBER_PROMO_ACCEPTED;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                amlwVar = amlw.RCS_PROVISIONING_PHONE_NUMBER_PROMO_DISMISSED;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                amlwVar = amlw.RCS_PROVISIONING_GOOGLE_TOS_BANNER_PRESENTED;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                amlwVar = amlw.RCS_PROVISIONING_GOOGLE_TOS_BANNER_ACCEPTED;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                amlwVar = amlw.RCS_PROVISIONING_GOOGLE_TOS_BANNER_DISMISSED;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                amlwVar = amlw.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_SEEN;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                amlwVar = amlw.RCS_PROVISIONING_LEGAL_FYI_BANNER_IN_SETTINGS_SEEN;
                break;
            case 39:
                amlwVar = amlw.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_LEARN_MORE_CLICKED;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                amlwVar = amlw.RCS_PROVISIONING_LEGAL_FYI_BANNER_IN_SETTINGS_LEARN_MORE_CLICKED;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                amlwVar = amlw.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_SETTINGS_CLICKED;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                amlwVar = amlw.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_DISMISSED;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                amlwVar = amlw.RCS_PROVISIONING_WELCOME_MESSAGE_SEEN;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                amlwVar = amlw.RCS_PROVISIONING_WELCOME_MESSAGE_ACCEPTED;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                amlwVar = amlw.RCS_PROVISIONING_WELCOME_MESSAGE_SETTINGS_CLICKED;
                break;
            default:
                amlwVar = null;
                break;
        }
        if (amlwVar != null) {
            return true;
        }
        return false;
    }
}
