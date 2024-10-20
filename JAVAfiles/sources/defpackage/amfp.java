package defpackage;

import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amfp implements apak {
    UNKNOWN_BUGLE_EVENT_TYPE(0),
    BUGLE_APP(1),
    BUGLE_MESSAGE(2),
    BUGLE_CONVERSATION(3),
    BUGLE_PERFORMANCE(4),
    BUGLE_SEARCH(5),
    BUGLE_SETTING(6),
    BUGLE_RECIPIENT_CHIPPIFIED(7),
    BUGLE_USER_AND_DEVICE_INFO(8),
    BUGLE_TRANSCODING(9),
    BUGLE_STICKER_SET(10),
    BUGLE_RCS_PROVISIONING(11),
    BUGLE_P2P_SUGGESTION(12),
    BUGLE_APP_CONFIGURATION(13),
    BUGLE_CONVERSATIONS(14),
    BUGLE_RBM_BUSINESS_INFO(15),
    BUGLE_ANNOTATION(16),
    DITTO_GRPC_MESSAGE(17),
    BUGLE_TELEPHONY_EVENT(18),
    BUGLE_GIF_CHOOSER(19),
    BUGLE_GROUP(20),
    BUGLE_ADD_CONTACT(21),
    DITTO_IMAGE(22),
    BUGLE_CONTACT_BANNER(23),
    BUGLE_REPORT_SPAM(24),
    BUGLE_COMPOSE(25),
    BUGLE_FILE_PREVIEW_CLICK(26),
    BUGLE_CARRIER_METADATA_EMBEDDING(27),
    BUGLE_INDEXING(28),
    BUGLE_PARTICIPANTS_TABLE(29),
    BUGLE_DATABASE(30),
    BUGLE_AUTO_ARCHIVE(31),
    BUGLE_SPAM_DETECTION(32),
    BUGLE_EDIT_CONTACT(33),
    BUGLE_BLOCK_FILE_ATTACH(34),
    BUGLE_ASSISTANT(35),
    BUGLE_CONSENT(36),
    BUGLE_ICING_SEARCH(37),
    BUGLE_CONVERSATION_LATCH_STATUS_CHANGE(38),
    BUGLE_FEDERATED_LEARNING(39),
    BUGLE_MDD_LIB(40),
    BUGLE_VERIFIED_SMS(41),
    BUGLE_HAPPINESS_TRACKING_SURVEY_DOWNLOAD(42),
    BUGLE_SHAKE_TO_REPORT(43),
    BUGLE_SCYTALE_EVENT(44),
    BUGLE_SELECTED_MESSAGES_ACTION(45),
    BUGLE_REMINDER(46),
    DITTO_SESSION_INFO(47),
    DITTO_QR_CODE_PAIRING_EVENT(48),
    BUGLE_TACHYON_TRANSPORT_EVENT(49),
    BUGLE_E2EE_STATE_TRANSITION(50),
    BUGLE_E2EE_LOOKUP_REGISTERED(51),
    BUGLE_E2EE_MESSAGE_RETRY_LIMIT_EXCEEDED(52),
    BUGLE_E2EE_EMPTY_GENERATED_PREKEYS_BUT_PROVISIONED(63),
    BUGLE_CONTACT_PICKER(53),
    BUGLE_MEDIA_VIEWER(54),
    BUGLE_VIDEO_CALL_EVENT(55),
    BUGLE_NOTIFICATION(56),
    BUGLE_E2EE_IDENTITY_VERIFICATION_MESSAGE_DROPPED(57),
    BUGLE_E2EE_ATTACHMENT_FAILED_TO_DECRYPT_USING_OTMK(58),
    BUGLE_WELCOME_EVENT(59),
    DITTO_BINDING_STATUS(60),
    ICING_INDEX_UPDATE_EVENT(61),
    TELEPHONY_DATABASE_EVENT(62),
    TELEPHONY_DATABASE_ACTION_EVENT(116),
    BUGLE_BUSINESS_MESSAGING_EVENT(64),
    BUGLE_ADVANCED_FEEDBACK_EVENT(65),
    BUGLE_REPORT_ISSUE_EVENT(66),
    SPAM_FOLDER_EVENT(68),
    AVAILABILITY_LOG(69),
    SEARCH_QUERY(70),
    HOME_SCREEN(71),
    CONVERSATION_RESOLUTION_EVENT(72),
    BUGLE_MULTI_DEVICE_EVENT(73),
    ICING_INDEX_REBUILD(74),
    RCS_EVENT(75),
    TELEPHONY_WIPEOUT_DETECTOR_EXECUTION_EVENT(76),
    MMS_METADATA_EXPERIMENT(77),
    HADES_SDK_EVENT(78),
    CUSTODIAN_REPORT(79),
    TELEPHONY_REVERSE_SYNC_STARTED_EVENT(80),
    TELEPHONY_REVERSE_SYNC_RESUMED_EVENT(81),
    TELEPHONY_REVERSE_SYNC_COMPLETED_EVENT(82),
    TELEPHONY_REVERSE_SYNC_FAILED_EVENT(83),
    TELEPHONY_REVERSE_SYNC_NOT_ATTEMPTED_EVENT(114),
    DATA_DONATION_EVENT(84),
    PERMISSION_LOCATION_ALLOWED_BY_USER(101),
    PERMISSION_LOCATION_DENIED_BY_USER(102),
    BUGLE_CONTACTS_EVENT(103),
    BUGLE_SUPER_SORT_EVENT(104),
    BUGLE_FOREGROUND_SERVICE_EVENT(105),
    REACTIONS_PROMO_EVENT(106),
    BUGLE_SMART_COMPOSE(107),
    BUGLE_SMART_COMPOSE_MODEL_EVAL(115),
    EXTERNAL_API_SERVICE_CALL_START(108),
    EXTERNAL_API_SERVICE_CALL_END(109),
    EXTERNAL_API_SERVICE_CALL_PENDING(110),
    BUGLE_E2EE_FETCH_PREKEYS_EVENT(112),
    SWITCH_TO_SAMSUNG_MESSAGES_EVENT(113),
    SCHEDULED_SEND_EVENT(117),
    JIBE_SERVICE_CONNECTION(118),
    DATABASE_UPGRADE(119),
    FORWARD_TELEPHONY_SYNC(120),
    RBM_EVENT(121),
    TOGGLE_CHAT_FEATURES_EVENT(122),
    SYNC_TELEPHONY_THREADS(123),
    FUZZY_MATCH_LENGTH(124),
    BUGLE_TABLET_MODE_SWITCH(125),
    RCS_PROVISIONING(126),
    BUGLE_CONVERSATION_MATCHING(127),
    BUGLE_HATS_NEXT_CLIENT_EVENT(128),
    BUGLE_WEAR_GMS_RPC_RELIABILITY(129),
    BUGLE_EXTERNAL_SEARCH_MESSAGE_EVENT(130),
    WEAR_FAILURE_EVENT(131),
    BUGLE_STAR_EVENT(132),
    BUBBLE_SETTING_EVENT(133),
    XSL_REQUEST_EVENT(134),
    PIN_TO_TOP_EVENT(135),
    TACHYGRAM_EVENT(136),
    BUGLE_E2EE_IDENTITY_VERIFICATION_EVENT(137),
    COMPOSE_BOX_HINT_TEXT_FLICKER_EVENT(138),
    BUGLE_MESSAGE_CLASSIFICATION(139),
    BANNER_EVENT(140),
    BUGLE_INTERNET_CONNECTIVITY_CHECK_EVENT(141),
    RCS_CHAT_SESSION_SERVICE(142),
    SPAM_ABUSE_EVENT(143),
    BUGLE_CONVERSATION_CLASSIFICATION(144),
    BUGLE_BIRTHDAY_CONVERSATION_INFO(153),
    BUGLE_BIRTHDAY_SUGGESTION_INFO(155),
    GOOGLE_PHOTOS_CREATE_SHARE_LINK_EVENT(145),
    GOOGLE_PHOTOS_ONBOARDING_EVENT(146),
    GOOGLE_PHOTOS_OPTION_TRAY_EVENT(147),
    RCS_CONTACTS_CALLER_EVENT(148),
    NOTIFICATION_METRICS_EVENT(149),
    BUGLE_GAIA_INTEGRATION_EVENT(150),
    WEAR_USER_AND_DEVICE_INFO(151),
    LIGHTER_EVENT(152),
    BUGLE_YOUTUBE_EVENT(154),
    BUGLE_SMARTS_SILENT_EXCEPTIONS_EVENT(156),
    DUPLICATE_RCS_MESSAGE_ID_EVENT(157),
    WELCOME_FLOW_UI_EVENT(158),
    BUGLE_CONTACTS_BIRTHDAY_COVERAGE_INFO(159),
    BUGLE_CAPABILITIES_EVENT(160),
    WELCOME_FLOW_PAGE_EVENT(161),
    WELCOME_FLOW_RELATED_SUPPRESSION_EVENT(162),
    WELCOME_FLOW_LAUNCH_EVENT(163),
    VMT_SESSION_EVENT(164),
    BUGLE_SMS_CAPABILITY_EVENT(165),
    BUGLE_APP_CONTROL_EVENT(166),
    CONVERSATION_E2EE_STATUS_UPDATE(167),
    PHENOTYPE_FIRST_REREGISTRATION_EVENT(168),
    PROFILE_EVENT(169),
    IN_APP_UPDATE_EVENT(170),
    HOME_SCREEN_METRICS_EVENT(171),
    BUGLE_MOBILE_CONFIGURATION_CLIENT_EVENT(172),
    MMS_GROUP_UPGRADE_ELIGIBILITY_INFO(173),
    BUGLE_WEAR_CONVERSATION_SYNC_EVENT(174),
    CONVERSATION_SCREEN_METRIC_EVENT(175),
    DATABASE_OPERATION(176),
    THREAD_UTILIZATION(177),
    BUGLE_EXPRESS_SIGN_IN_EVENT(178),
    BUGLE_CONVERSATION_READ_STATUS_EVENT(179),
    MODIFIED_BY_EVENT(180),
    BUGLE_CONVERSATION_MERGING_MATCHED_CONVERSATIONS_INFO(181),
    MAGIC_COMPOSE_FEEDBACK(182),
    MAGIC_COMPOSE_CONSENT(184),
    SIM_STATE_TRACKER_EVENT(183),
    BUGLE_CARRIER_CONFIG_MISMATCH_EVENT(185),
    BUGLE_SYSTEM_BACKUP_EVENT(186),
    MAGIC_COMPOSE_ERROR(187),
    MAGIC_COMPOSE_EVENT(188),
    MAGIC_COMPOSE_DISPLAY(189),
    BUGLE_ALARM_DELAY_METRICS_EVENT(190),
    HOME_SCREEN_FIRST_VISIT(191),
    DANGLING_PARTS_EVENT(192),
    MAGIC_COMPOSE_ICON_EVENT(193),
    MAGIC_COMPOSE_SETTING(194),
    SMS_SUBJECT_REPORT_EVENT(195),
    MULTI_SHARE_EVENT(196),
    BUGLE_CMS_DATA_PROVIDER_EVENT(197),
    TOGGLE_RCS_CHATS_EVENT(198),
    EMOTIFY_CREATE_EVENT(199),
    EMOTIFY_IMPRESSION_EVENT(BasePaymentResult.ERROR_REQUEST_FAILED),
    EMOTIFY_MESSAGE_SEND_EVENT(BasePaymentResult.ERROR_REQUEST_TIMEOUT),
    EMOTIFY_DELETE_EVENT(BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED),
    BUGLE_CARRIER_CONFIG_LOAD_LATENCY_EVENT(BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED),
    BUGLE_RCS_GROUP_SELF_PARTICIPANT_INCLUSION(204),
    MEET_CALLING_EVENT(205),
    RCS_PROVISIONING_MANAGER_EVENT(206),
    VOICE_MOOD_EVENT(207),
    BARD_EVENT(208),
    MAGIC_COMPOSE_INPUT_TOKEN_METRIC(209),
    DOUBLE_TAP_REACT_PROMOTION_EVENT(210),
    REVOKE_CONSENT_EVENT(211),
    RCS_LOCAL_IDENTITY_EVENT(212),
    D2D_BACKUP_AND_RESTORE_EVENT(213),
    PARTICIPANTS_TABLE_VALIDATION_EVENT(214),
    GAIA_SIGN_IN_EVENT(215),
    SELFIE_GIF_EVENT(216),
    GAIA_SIGN_IN_STATE(217),
    SATELLITE_EVENT(218),
    MMS_GROUP_UPGRADE_EVENT(219),
    RESTORE_WORKFLOW_EVENT(220),
    BACKUP_WORKFLOW_EVENT(221),
    VIDEO_CALLING_EVENT(222),
    TELEPHONY_PERSISTENCE_EVENT(223),
    MMS_GROUP_EVENT(224),
    OPEN_PENPAL_CHAT_EVENT(225),
    BUGLE_COMPOSE_DISABLED_EVENT(226),
    GAIA_REPORT_EVENT(227),
    MMS_MERGING_EVENT(228),
    BUGLE_FILE_PROCESSING(229),
    CONVERSATION_SCREEN_FIRST_VISIT(230),
    TYCHO_GRPC_EVENT(231);

    public final int dg;

    amfp(int i) {
        this.dg = i;
    }

    public static amfp b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_BUGLE_EVENT_TYPE;
            case 1:
                return BUGLE_APP;
            case 2:
                return BUGLE_MESSAGE;
            case 3:
                return BUGLE_CONVERSATION;
            case 4:
                return BUGLE_PERFORMANCE;
            case 5:
                return BUGLE_SEARCH;
            case 6:
                return BUGLE_SETTING;
            case 7:
                return BUGLE_RECIPIENT_CHIPPIFIED;
            case 8:
                return BUGLE_USER_AND_DEVICE_INFO;
            case 9:
                return BUGLE_TRANSCODING;
            case 10:
                return BUGLE_STICKER_SET;
            case 11:
                return BUGLE_RCS_PROVISIONING;
            case 12:
                return BUGLE_P2P_SUGGESTION;
            case 13:
                return BUGLE_APP_CONFIGURATION;
            case 14:
                return BUGLE_CONVERSATIONS;
            case 15:
                return BUGLE_RBM_BUSINESS_INFO;
            case 16:
                return BUGLE_ANNOTATION;
            case 17:
                return DITTO_GRPC_MESSAGE;
            case 18:
                return BUGLE_TELEPHONY_EVENT;
            case 19:
                return BUGLE_GIF_CHOOSER;
            case 20:
                return BUGLE_GROUP;
            case 21:
                return BUGLE_ADD_CONTACT;
            case 22:
                return DITTO_IMAGE;
            case 23:
                return BUGLE_CONTACT_BANNER;
            case 24:
                return BUGLE_REPORT_SPAM;
            case 25:
                return BUGLE_COMPOSE;
            case 26:
                return BUGLE_FILE_PREVIEW_CLICK;
            case 27:
                return BUGLE_CARRIER_METADATA_EMBEDDING;
            case 28:
                return BUGLE_INDEXING;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return BUGLE_PARTICIPANTS_TABLE;
            case 30:
                return BUGLE_DATABASE;
            case 31:
                return BUGLE_AUTO_ARCHIVE;
            case 32:
                return BUGLE_SPAM_DETECTION;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                return BUGLE_EDIT_CONTACT;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                return BUGLE_BLOCK_FILE_ATTACH;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                return BUGLE_ASSISTANT;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                return BUGLE_CONSENT;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                return BUGLE_ICING_SEARCH;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                return BUGLE_CONVERSATION_LATCH_STATUS_CHANGE;
            case 39:
                return BUGLE_FEDERATED_LEARNING;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                return BUGLE_MDD_LIB;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                return BUGLE_VERIFIED_SMS;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                return BUGLE_HAPPINESS_TRACKING_SURVEY_DOWNLOAD;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                return BUGLE_SHAKE_TO_REPORT;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                return BUGLE_SCYTALE_EVENT;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                return BUGLE_SELECTED_MESSAGES_ACTION;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                return BUGLE_REMINDER;
            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                return DITTO_SESSION_INFO;
            case 48:
                return DITTO_QR_CODE_PAIRING_EVENT;
            case 49:
                return BUGLE_TACHYON_TRANSPORT_EVENT;
            case 50:
                return BUGLE_E2EE_STATE_TRANSITION;
            case 51:
                return BUGLE_E2EE_LOOKUP_REGISTERED;
            case 52:
                return BUGLE_E2EE_MESSAGE_RETRY_LIMIT_EXCEEDED;
            case 53:
                return BUGLE_CONTACT_PICKER;
            case 54:
                return BUGLE_MEDIA_VIEWER;
            case 55:
                return BUGLE_VIDEO_CALL_EVENT;
            case 56:
                return BUGLE_NOTIFICATION;
            case 57:
                return BUGLE_E2EE_IDENTITY_VERIFICATION_MESSAGE_DROPPED;
            case 58:
                return BUGLE_E2EE_ATTACHMENT_FAILED_TO_DECRYPT_USING_OTMK;
            case 59:
                return BUGLE_WELCOME_EVENT;
            case 60:
                return DITTO_BINDING_STATUS;
            case 61:
                return ICING_INDEX_UPDATE_EVENT;
            case 62:
                return TELEPHONY_DATABASE_EVENT;
            case 63:
                return BUGLE_E2EE_EMPTY_GENERATED_PREKEYS_BUT_PROVISIONED;
            case 64:
                return BUGLE_BUSINESS_MESSAGING_EVENT;
            case 65:
                return BUGLE_ADVANCED_FEEDBACK_EVENT;
            case 66:
                return BUGLE_REPORT_ISSUE_EVENT;
            default:
                switch (i) {
                    case 68:
                        return SPAM_FOLDER_EVENT;
                    case 69:
                        return AVAILABILITY_LOG;
                    case 70:
                        return SEARCH_QUERY;
                    case 71:
                        return HOME_SCREEN;
                    case 72:
                        return CONVERSATION_RESOLUTION_EVENT;
                    case 73:
                        return BUGLE_MULTI_DEVICE_EVENT;
                    case 74:
                        return ICING_INDEX_REBUILD;
                    case 75:
                        return RCS_EVENT;
                    case 76:
                        return TELEPHONY_WIPEOUT_DETECTOR_EXECUTION_EVENT;
                    case 77:
                        return MMS_METADATA_EXPERIMENT;
                    case 78:
                        return HADES_SDK_EVENT;
                    case 79:
                        return CUSTODIAN_REPORT;
                    case 80:
                        return TELEPHONY_REVERSE_SYNC_STARTED_EVENT;
                    case 81:
                        return TELEPHONY_REVERSE_SYNC_RESUMED_EVENT;
                    case 82:
                        return TELEPHONY_REVERSE_SYNC_COMPLETED_EVENT;
                    case 83:
                        return TELEPHONY_REVERSE_SYNC_FAILED_EVENT;
                    case 84:
                        return DATA_DONATION_EVENT;
                    default:
                        switch (i) {
                            case 101:
                                return PERMISSION_LOCATION_ALLOWED_BY_USER;
                            case 102:
                                return PERMISSION_LOCATION_DENIED_BY_USER;
                            case 103:
                                return BUGLE_CONTACTS_EVENT;
                            case 104:
                                return BUGLE_SUPER_SORT_EVENT;
                            case 105:
                                return BUGLE_FOREGROUND_SERVICE_EVENT;
                            case 106:
                                return REACTIONS_PROMO_EVENT;
                            case 107:
                                return BUGLE_SMART_COMPOSE;
                            case 108:
                                return EXTERNAL_API_SERVICE_CALL_START;
                            case 109:
                                return EXTERNAL_API_SERVICE_CALL_END;
                            case 110:
                                return EXTERNAL_API_SERVICE_CALL_PENDING;
                            default:
                                switch (i) {
                                    case 112:
                                        return BUGLE_E2EE_FETCH_PREKEYS_EVENT;
                                    case 113:
                                        return SWITCH_TO_SAMSUNG_MESSAGES_EVENT;
                                    case 114:
                                        return TELEPHONY_REVERSE_SYNC_NOT_ATTEMPTED_EVENT;
                                    case 115:
                                        return BUGLE_SMART_COMPOSE_MODEL_EVAL;
                                    case 116:
                                        return TELEPHONY_DATABASE_ACTION_EVENT;
                                    case 117:
                                        return SCHEDULED_SEND_EVENT;
                                    case 118:
                                        return JIBE_SERVICE_CONNECTION;
                                    case 119:
                                        return DATABASE_UPGRADE;
                                    case 120:
                                        return FORWARD_TELEPHONY_SYNC;
                                    case 121:
                                        return RBM_EVENT;
                                    case 122:
                                        return TOGGLE_CHAT_FEATURES_EVENT;
                                    case 123:
                                        return SYNC_TELEPHONY_THREADS;
                                    case 124:
                                        return FUZZY_MATCH_LENGTH;
                                    case 125:
                                        return BUGLE_TABLET_MODE_SWITCH;
                                    case 126:
                                        return RCS_PROVISIONING;
                                    case 127:
                                        return BUGLE_CONVERSATION_MATCHING;
                                    case 128:
                                        return BUGLE_HATS_NEXT_CLIENT_EVENT;
                                    case 129:
                                        return BUGLE_WEAR_GMS_RPC_RELIABILITY;
                                    case 130:
                                        return BUGLE_EXTERNAL_SEARCH_MESSAGE_EVENT;
                                    case 131:
                                        return WEAR_FAILURE_EVENT;
                                    case 132:
                                        return BUGLE_STAR_EVENT;
                                    case 133:
                                        return BUBBLE_SETTING_EVENT;
                                    case 134:
                                        return XSL_REQUEST_EVENT;
                                    case 135:
                                        return PIN_TO_TOP_EVENT;
                                    case 136:
                                        return TACHYGRAM_EVENT;
                                    case 137:
                                        return BUGLE_E2EE_IDENTITY_VERIFICATION_EVENT;
                                    case 138:
                                        return COMPOSE_BOX_HINT_TEXT_FLICKER_EVENT;
                                    case 139:
                                        return BUGLE_MESSAGE_CLASSIFICATION;
                                    case 140:
                                        return BANNER_EVENT;
                                    case 141:
                                        return BUGLE_INTERNET_CONNECTIVITY_CHECK_EVENT;
                                    case 142:
                                        return RCS_CHAT_SESSION_SERVICE;
                                    case 143:
                                        return SPAM_ABUSE_EVENT;
                                    case 144:
                                        return BUGLE_CONVERSATION_CLASSIFICATION;
                                    case 145:
                                        return GOOGLE_PHOTOS_CREATE_SHARE_LINK_EVENT;
                                    case 146:
                                        return GOOGLE_PHOTOS_ONBOARDING_EVENT;
                                    case 147:
                                        return GOOGLE_PHOTOS_OPTION_TRAY_EVENT;
                                    case 148:
                                        return RCS_CONTACTS_CALLER_EVENT;
                                    case 149:
                                        return NOTIFICATION_METRICS_EVENT;
                                    case 150:
                                        return BUGLE_GAIA_INTEGRATION_EVENT;
                                    case 151:
                                        return WEAR_USER_AND_DEVICE_INFO;
                                    case 152:
                                        return LIGHTER_EVENT;
                                    case 153:
                                        return BUGLE_BIRTHDAY_CONVERSATION_INFO;
                                    case 154:
                                        return BUGLE_YOUTUBE_EVENT;
                                    case 155:
                                        return BUGLE_BIRTHDAY_SUGGESTION_INFO;
                                    case 156:
                                        return BUGLE_SMARTS_SILENT_EXCEPTIONS_EVENT;
                                    case 157:
                                        return DUPLICATE_RCS_MESSAGE_ID_EVENT;
                                    case 158:
                                        return WELCOME_FLOW_UI_EVENT;
                                    case 159:
                                        return BUGLE_CONTACTS_BIRTHDAY_COVERAGE_INFO;
                                    case 160:
                                        return BUGLE_CAPABILITIES_EVENT;
                                    case 161:
                                        return WELCOME_FLOW_PAGE_EVENT;
                                    case 162:
                                        return WELCOME_FLOW_RELATED_SUPPRESSION_EVENT;
                                    case 163:
                                        return WELCOME_FLOW_LAUNCH_EVENT;
                                    case 164:
                                        return VMT_SESSION_EVENT;
                                    case 165:
                                        return BUGLE_SMS_CAPABILITY_EVENT;
                                    case 166:
                                        return BUGLE_APP_CONTROL_EVENT;
                                    case 167:
                                        return CONVERSATION_E2EE_STATUS_UPDATE;
                                    case 168:
                                        return PHENOTYPE_FIRST_REREGISTRATION_EVENT;
                                    case 169:
                                        return PROFILE_EVENT;
                                    case 170:
                                        return IN_APP_UPDATE_EVENT;
                                    case 171:
                                        return HOME_SCREEN_METRICS_EVENT;
                                    case 172:
                                        return BUGLE_MOBILE_CONFIGURATION_CLIENT_EVENT;
                                    case 173:
                                        return MMS_GROUP_UPGRADE_ELIGIBILITY_INFO;
                                    case 174:
                                        return BUGLE_WEAR_CONVERSATION_SYNC_EVENT;
                                    case 175:
                                        return CONVERSATION_SCREEN_METRIC_EVENT;
                                    case 176:
                                        return DATABASE_OPERATION;
                                    case 177:
                                        return THREAD_UTILIZATION;
                                    case 178:
                                        return BUGLE_EXPRESS_SIGN_IN_EVENT;
                                    case 179:
                                        return BUGLE_CONVERSATION_READ_STATUS_EVENT;
                                    case 180:
                                        return MODIFIED_BY_EVENT;
                                    case 181:
                                        return BUGLE_CONVERSATION_MERGING_MATCHED_CONVERSATIONS_INFO;
                                    case 182:
                                        return MAGIC_COMPOSE_FEEDBACK;
                                    case 183:
                                        return SIM_STATE_TRACKER_EVENT;
                                    case 184:
                                        return MAGIC_COMPOSE_CONSENT;
                                    case 185:
                                        return BUGLE_CARRIER_CONFIG_MISMATCH_EVENT;
                                    case 186:
                                        return BUGLE_SYSTEM_BACKUP_EVENT;
                                    case 187:
                                        return MAGIC_COMPOSE_ERROR;
                                    case 188:
                                        return MAGIC_COMPOSE_EVENT;
                                    case 189:
                                        return MAGIC_COMPOSE_DISPLAY;
                                    case 190:
                                        return BUGLE_ALARM_DELAY_METRICS_EVENT;
                                    case 191:
                                        return HOME_SCREEN_FIRST_VISIT;
                                    case 192:
                                        return DANGLING_PARTS_EVENT;
                                    case 193:
                                        return MAGIC_COMPOSE_ICON_EVENT;
                                    case 194:
                                        return MAGIC_COMPOSE_SETTING;
                                    case 195:
                                        return SMS_SUBJECT_REPORT_EVENT;
                                    case 196:
                                        return MULTI_SHARE_EVENT;
                                    case 197:
                                        return BUGLE_CMS_DATA_PROVIDER_EVENT;
                                    case 198:
                                        return TOGGLE_RCS_CHATS_EVENT;
                                    case 199:
                                        return EMOTIFY_CREATE_EVENT;
                                    case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                                        return EMOTIFY_IMPRESSION_EVENT;
                                    case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                                        return EMOTIFY_MESSAGE_SEND_EVENT;
                                    case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                                        return EMOTIFY_DELETE_EVENT;
                                    case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                                        return BUGLE_CARRIER_CONFIG_LOAD_LATENCY_EVENT;
                                    case 204:
                                        return BUGLE_RCS_GROUP_SELF_PARTICIPANT_INCLUSION;
                                    case 205:
                                        return MEET_CALLING_EVENT;
                                    case 206:
                                        return RCS_PROVISIONING_MANAGER_EVENT;
                                    case 207:
                                        return VOICE_MOOD_EVENT;
                                    case 208:
                                        return BARD_EVENT;
                                    case 209:
                                        return MAGIC_COMPOSE_INPUT_TOKEN_METRIC;
                                    case 210:
                                        return DOUBLE_TAP_REACT_PROMOTION_EVENT;
                                    case 211:
                                        return REVOKE_CONSENT_EVENT;
                                    case 212:
                                        return RCS_LOCAL_IDENTITY_EVENT;
                                    case 213:
                                        return D2D_BACKUP_AND_RESTORE_EVENT;
                                    case 214:
                                        return PARTICIPANTS_TABLE_VALIDATION_EVENT;
                                    case 215:
                                        return GAIA_SIGN_IN_EVENT;
                                    case 216:
                                        return SELFIE_GIF_EVENT;
                                    case 217:
                                        return GAIA_SIGN_IN_STATE;
                                    case 218:
                                        return SATELLITE_EVENT;
                                    case 219:
                                        return MMS_GROUP_UPGRADE_EVENT;
                                    case 220:
                                        return RESTORE_WORKFLOW_EVENT;
                                    case 221:
                                        return BACKUP_WORKFLOW_EVENT;
                                    case 222:
                                        return VIDEO_CALLING_EVENT;
                                    case 223:
                                        return TELEPHONY_PERSISTENCE_EVENT;
                                    case 224:
                                        return MMS_GROUP_EVENT;
                                    case 225:
                                        return OPEN_PENPAL_CHAT_EVENT;
                                    case 226:
                                        return BUGLE_COMPOSE_DISABLED_EVENT;
                                    case 227:
                                        return GAIA_REPORT_EVENT;
                                    case 228:
                                        return MMS_MERGING_EVENT;
                                    case 229:
                                        return BUGLE_FILE_PROCESSING;
                                    case 230:
                                        return CONVERSATION_SCREEN_FIRST_VISIT;
                                    case 231:
                                        return TYCHO_GRPC_EVENT;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.dg;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.dg);
    }
}
