package com.google.android.ims.util.common;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RcsIntents {
    public static final String ACTION_CSAPK_INITIALIZED = "rcs.intent.action.csApkInitialized";
    public static final String ACTION_CSLIB_FLAGS_UPDATED = "com.google.android.ims.library.phenotype.UPDATE";
    public static final String ACTION_DEBUG_OPTION_FORCE_CLIENT_TO_UNREGISTER = "rcs.intent.action.forceClientToUnregister";
    public static final String ACTION_DEBUG_OPTION_INCREASE_SESSION_ID = "rcs.intent.action.debugOptionIncreaseSessionId";
    public static final String ACTION_DEBUG_OPTION_RESET_RCS_CONFIG_RESPONSE = "rcs.intent.action.debugOptionResetRcsConfigResponse";
    public static final String ACTION_DEBUG_OPTION_SEND_ERROR_RESULT_FROM_ENGINE = "rcs.intent.action.debugOptionSendErrorResultFromEngine";
    public static final String ACTION_DEFAULT_VOICE_SIM_REMOVED = "rcs.intent.action.defaultVoiceSimRemoved";
    public static final String ACTION_END_USER_CONFIRMATION_ACK = "rcs.intent.action.endUserConfirmationAck";
    public static final String ACTION_END_USER_CONFIRMATION_REQUEST = "rcs.intent.action.endUserConfirmationRequest";
    public static final String ACTION_END_USER_NOTIFICATION_REQUEST = "rcs.intent.action.endUserNotificationRequest";
    public static final String ACTION_FILE_TRANSFER_METADATA_UPDATE = "rcs.intent.action.fileTransferMetadataUpdate";
    public static final String ACTION_INCOMING_CALL_COMPOSER_CONTENT = "com.google.android.ims.action.INCOMING_CALL_COMPOSER_CONTENT";
    public static final String ACTION_INCOMING_CHAT_MESSAGE = "rcs.intent.action.incomingChatMessage";
    public static final String ACTION_INCOMING_CONVERSATION_SUGGESTIONS_MESSAGE = "rcs.intent.action.incomingConversationSuggestionsMessage";
    public static final String ACTION_INCOMING_FILE_TRANSFER = "rcs.intent.action.incomingFileTransfer";
    public static final String ACTION_INCOMING_FILE_TRANSFER_COMPLETED = "rcs.intent.action.incomingFileTransferCompleted";
    public static final String ACTION_INCOMING_FILE_TRANSFER_PREVIEW_UPDATE = "rcs.intent.action.incomingFileTransferPreviewUpdate";
    public static final String ACTION_INCOMING_GROUP_CHAT = "rcs.intent.action.incomingGroupChat";
    public static final String ACTION_JIBE_DEPROVISION = "rcs.intent.action.jibe.deprovision";
    public static final String ACTION_LOCATION_RECEIVED = "rcs.intent.action.locationReceived";
    public static final String ACTION_NEW_EVENT = "rcs.intent.action.newEvent";
    public static final String ACTION_NOTIFY_RECEIVED_CARRIER_TOS_REQUEST = "rcs.intent.action.receivedCarrierTosRequest";
    public static final String ACTION_NOTIFY_RECEIVED_GOOGLE_TOS_REQUEST = "rcs.intent.action.receivedGoogleTosRequest";
    public static final String ACTION_NOTIFY_RECEIVED_LEGAL_FYI_REQUEST = "rcs.intent.action.receivedLegalFyiRequest";
    public static final String ACTION_NOTIFY_RECEIVED_PROVISIONING_WELCOME_MESSAGE = "rcs.intent.action.forwardProvisioningWelcomeMessage";
    public static final String ACTION_NOTIFY_RECEIVED_RCS_PROMO_REQUEST = "rcs.intent.action.receivedRcsPromoRequest";
    public static final String ACTION_NOTIFY_RECEIVED_RCS_SUCCESS_REQUEST = "rcs.intent.action.receivedRcsSuccessRequest";
    public static final String ACTION_PROVISIONING_EVENT = "rcs.intent.action.provisioningEvent";
    public static final String ACTION_RCS_CANCEL_PROVISIONING_WORK = "rcs.intent.action.rcsCancelProvisioningWork";
    public static final String ACTION_RCS_CONFIG_REFRESH = "rcs.intent.action.rcsConfigRefresh";
    public static final String ACTION_RCS_FLAGS_UPDATED = "rcs.intent.action.rcsFlagsUpdated";
    public static final String ACTION_RCS_RECONFIGURATION_REQUIRED = "rcs.intent.action.rcsReconfigurationRequired";
    public static final String ACTION_RCS_RECURRING_METRICS_UPLOAD = "rcs.intent.action.rcsRecurringMetricsUpload";
    public static final String ACTION_RCS_SELF_SERVICE_MESSAGE = "rcs.intent.action.rcsSelfServiceMessage";
    public static final String ACTION_RCS_SIM_REMOVED = "rcs.intent.action.rcsSimRemoved";
    public static final String ACTION_RCS_SIM_SWAP = "rcs.intent.action.rcsSimSwap";
    public static final String ACTION_RCS_SINGLE_REGISTRATION_PROVISIONING_EVENT = "rcs.intent.action.rcsSingleRegistrationProvisioningEvent";
    public static final String ACTION_RCS_SYSTEM_BINDING = "rcs.intent.action.rcsSystemBinding";
    public static final String ACTION_TACHYON_ANONYMOUS_DEVICE_ID = "rcs.intent.action.tachyonAnonymousDeviceId";
    public static final String ACTION_TOGGLE_RCS_MASTER_SWITCH = "rcs.intent.action.TOGGLE_MASTER_SWITCH";
    public static final String EXTRA_ASSOCIATED_SESSION_ID = "rcs.intent.extra.associatedSessionId";
    public static final String EXTRA_BUTTON_NEGATIVE = "rcs.intent.extra.buttonNegative";
    public static final String EXTRA_BUTTON_POSITIVE = "rcs.intent.extra.buttonPositive";
    public static final String EXTRA_CONFIGURE_FOR_TESTING = "rcs.intent.extra.configureForTesting";
    public static final String EXTRA_CONTACT_ID = "rcs.intent.extra.contactId";
    public static final String EXTRA_CONTENT = "rcs.intent.extra.content";
    public static final String EXTRA_CONVERSATION_SUGGESTIONS = "rcs.intent.extra.conversationSuggestions";
    public static final String EXTRA_CUSTOM_HEADERS = "rcs.intent.extra.customHeaders";
    public static final String EXTRA_DELTA = "rcs.intent.extra.delta";
    public static final String EXTRA_EVENT = "rcs.intent.extra.event";
    public static final String EXTRA_EXPIRY = "rcs.intent.extra.expiry";
    public static final String EXTRA_FALLBACK_URL = "rcs.intent.extra.fallbackUrl";
    public static final String EXTRA_FILENAME = "rcs.intent.extra.filename";
    public static final String EXTRA_FILE_TRANSFER_ENCRYPTED_DATA = "rcs.intent.extra.fileTransferEncryptedData";
    public static final String EXTRA_GROUP_INFO = "rcs.intent.extra.groupInfo";
    public static final String EXTRA_INFO = "rcs.intent.extra.info";
    public static final String EXTRA_IS_BLOCKED_USER = "rcs.intent.extra.isBlockedUser";
    public static final String EXTRA_IS_BOT = "rcs.intent.extra.isBot";
    public static final String EXTRA_IS_CONFERENCE = "rcs.intent.extra.isConference";
    public static final String EXTRA_IS_SYSTEM_MESSAGE = "rcs.intent.extra.isSystemMessage";
    public static final String EXTRA_LOCATION = "rcs.intent.extra.location";
    public static final String EXTRA_MENDEL_PACKAGE_NAME = "rcs.intent.extra.mendelPackageName";
    public static final String EXTRA_MESSAGE_ID = "rcs.intent.extra.messageid";
    public static final String EXTRA_PENDING_INTENT = "pendingIntent";
    public static final String EXTRA_PHONE_NUMBER = "rcs.intent.extra.phoneNumber";
    public static final String EXTRA_PIN_REQUIRED = "rcs.intent.extra.pinRequired";
    public static final String EXTRA_PREVIEW_CONTENT_TYPE = "rcs.intent.extra.previewContentType";
    public static final String EXTRA_PREVIEW_DATA = "rcs.intent.extra.previewData";
    public static final String EXTRA_PREVIOUS_SIM_ID = "rcs.intent.extra.PreviousSimId";
    public static final String EXTRA_PROGRESS = "rcs.intent.extra.progress";
    public static final String EXTRA_RAW_FILE_TRANSFER_XML_BYTES = "rcs.intent.extra.rawFileTransferXml";
    public static final String EXTRA_RCS_MASTER_SWITCH_STATE = "rcs.intent.extra.MASTER_SWITCH_STATE";
    public static final String EXTRA_RCS_SELF_SERVICE_MESSAGE = "rcs.intent.extra.rcsSelfServiceMessage";
    public static final String EXTRA_RCS_SELF_SERVICE_MESSAGE_ID = "rcs.intent.extra.rcsSelfServiceMessageId";
    public static final String EXTRA_RECONFIGURATION = "rcs.intent.extra.reset";
    public static final String EXTRA_REFERRER = "rcs.intent.extra.referrer";
    public static final String EXTRA_REMOTE_INSTANCE = "rcs.intent.extra.remoteInstance";
    public static final String EXTRA_REMOTE_USER_MSISDN = "rcs.intent.extra.remoteUserMsisdn";
    public static final String EXTRA_REQUEST_ID = "rcs.intent.extra.requestId";
    public static final String EXTRA_SELF_USER_ID = "rcs.intent.extra.selfuserId";
    public static final String EXTRA_SEND_ERROR_RESULT_FROM_ENGINE = "rcs.intent.extra.sendErrorResultFromEngine";
    public static final String EXTRA_SETUP_VENDOR_IMS = "rcs.intent.extra.setupVendorIms";
    public static final String EXTRA_SIM_ID = "rcs.intent.extra.simId";
    public static final String EXTRA_SIP_ALIAS = "rcs.intent.extra.sipAlias";
    public static final String EXTRA_SIZE = "rcs.intent.extra.size";
    public static final String EXTRA_SMS_PORT = "rcs.intent.extra.smsPort";
    public static final String EXTRA_SPAM_VERDICT = "rcs.intent.extra.spam.verdict";
    public static final String EXTRA_SUBJECT = "rcs.intent.extra.subject";
    public static final String EXTRA_SUBSCRIPTION_ID = "rcs.intent.extra.SUBSCRIPTION_ID";
    public static final String EXTRA_SUB_ID = "rcs.intent.extra.subId";
    public static final String EXTRA_TACHYON_ANONYMOUS_DEVICE_ID = "rcs.intent.extra.tachyonAnonymousDeviceId";
    public static final String EXTRA_TARGET_RCS_MESSAGE_ID = "rcs.intent.extra.targetRcsMessageID";
    public static final String EXTRA_TEXT = "rcs.intent.extra.text";
    public static final String EXTRA_TIMEOUT = "rcs.intent.extra.timeout";
    public static final String EXTRA_TIMESTAMP = "rcs.intent.extra.timestamp";
    public static final String EXTRA_TRACE_ID = "rcs.intent.extra.traceid";
    public static final String EXTRA_USER_ID = "rcs.intent.extra.userId";
    public static final long INVALID_SESSION_ID = -1;
    public static final int RCS_MASTER_SWITCH_DISABLED = 0;
    public static final int RCS_MASTER_SWITCH_ENABLED = 1;
    public static final String START_RCS_SERVICE_INTENT = "com.google.android.ims.JibeService";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean isProvisioningIntentAction(String str) {
        char c;
        switch (str.hashCode()) {
            case -2085229701:
                if (str.equals(ACTION_PROVISIONING_EVENT)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -482560605:
                if (str.equals(ACTION_NOTIFY_RECEIVED_GOOGLE_TOS_REQUEST)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 250542075:
                if (str.equals(ACTION_NOTIFY_RECEIVED_RCS_SUCCESS_REQUEST)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 406935855:
                if (str.equals(ACTION_NOTIFY_RECEIVED_RCS_PROMO_REQUEST)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 615574789:
                if (str.equals(ACTION_NOTIFY_RECEIVED_PROVISIONING_WELCOME_MESSAGE)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0 && c != 1 && c != 2 && c != 3 && c != 4) {
            return false;
        }
        return true;
    }
}
