package defpackage;

import com.android.vcard.VCardConstants;
import com.google.android.gms.common.internal.IGmsServiceBroker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amlo implements apak {
    UNSPECIFIED_REASON(0),
    NO_FAILURE(22),
    BACKUP_ITEM_SKIPPED(80),
    BACKUP_ITEM_SKIPPED_EMPTY(91),
    BACKUP_ITEM_SKIPPED_EXCLUDED(92),
    BACKUP_ITEM_FAILED_REQUEST_VALIDATION(122),
    ACCOUNT_NOT_LINKED(1),
    INTERNAL(2),
    ILLEGAL_ARGUMENT(3),
    ILLEGAL_STATE(4),
    UNSUPPORTED_OPERATION(5),
    NULL_POINTER(6),
    LOCAL_ROW_MISSING(76),
    CMS_DEPENDENCY_MISSING(7),
    CMS_CIPHER_EXCEPTION(8),
    CMS_DECRYPTION_EXCEPTION(9),
    NOTIFICATION_NOT_FOUND(10),
    EXECUTION_EXCEPTION(11),
    SERVER_STATUS_NOT_FOUND(12),
    SERVER_STATUS_INTERNAL(13),
    SERVER_STATUS_ALREADY_EXISTS(14),
    SERVER_STATUS_INVALID_ARGUMENT(15),
    SERVER_STATUS_DEADLINE_EXCEEDED(16),
    SERVER_STATUS_UNAVAILABLE(17),
    SERVER_STATUS_UNAUTHENTICATED(18),
    SERVER_STATUS_FAILED_PRECONDITION(19),
    SERVER_STATUS_PERMISSION_DENIED(20),
    SERVER_STATUS_OTHER(21),
    SERVER_RETURNED_INCOMPLETE_DATA_FOR_BATCH(78),
    EXISTING_ID_LOOKUP_FAILED(79),
    EXISTING_CONVERSATION_ID_LOOKUP_FAILED(116),
    CMS_DEVICE_NOT_ALLOWED(23),
    BACKUP_REACHES_MAX_RETRY(24),
    SQLITE_EXCEPTION(25),
    MESSAGE_MODEL_MISSING(26),
    FREQ_CHANGED_MESSAGE_FIELDS_MISSING(27),
    CMS_ID_SAVE_FAILURE(28),
    CMS_ENTITY_ALREADY_EXISTS(77),
    OPT_IN_STEP_IS_UNSPECIFIED(29),
    OPT_IN_STEP_NOT_FOUND(30),
    OPT_IN_STEP_EXCEEDS_MAX_RETRY(31),
    OPT_OUT_STEP_NOT_FOUND(32),
    OPT_OUT_STEP_IS_UNSPECIFIED(33),
    OPT_OUT_INVALID_FEATURE_STATE(34),
    OPT_OUT_STEP_EXCEEDS_MAX_RETRY(35),
    OPT_IN_INVALID_FEATURE_STATE(36),
    RESTORE_EMPTY_CMS_ID(37),
    RESTORE_CONV_MISSING_RCS_GRP_CONTRIBUTION_ID(38),
    RESTORE_CONV_WRONG_CODE_PATH(39),
    RESTORE_CONV_CONVERSATION_WITH_EMPTY_PARTICIPANTS(40),
    RESTORE_CONV_PARTICIPANT_NOT_FOUND(41),
    RESTORE_CONV_EMPTY_NORMALIZED_DESTINATION(42),
    WORK_ITEM_ID_MISSING(43),
    RESTORE_MSG_EMPTY_TELEPHONY_URI(44),
    RESTORE_MSG_MSG_WITH_TELEPHONY_URI_NOT_FOUND(45),
    RESTORE_MSG_CONVERSATION_MISSING(46),
    RESTORE_MSG_DUPLICATE_MSG_ID_MISSING(47),
    RESTORE_MSG_PARTICIPANT_MISSING(48),
    RESTORE_MSG_SMS_WITH_EMPTY_TEXT(49),
    RESTORE_MSG_MMS_TEXT_WITH_EMPTY_TEXT(50),
    RESTORE_MSG_DELETE_FAILED_AFTER_INSERT(51),
    RESTORE_MSG_DELETE_FAILED_BEFORE_INSERT(52),
    INVALID_PROTO(53),
    BACKUP_KEY_NOT_FOUND(54),
    ENCRYPTION_KEY_NOT_FOUND(55),
    ENCRYPTION_KEY_NOT_FOUND_FROM_CACHE_WHEN_DECRYPT(117),
    ENCRYPTION_KEY_NOT_FOUND_WHEN_CREATE_CACHE(118),
    ENCRYPTION_KEY_NOT_FOUND_INITIAL_BACKUP(119),
    ENCRYPTION_KEY_NOT_FOUND_INCREMENTAL_BACKUP(120),
    MMS_TRANSACTION_ID_FORMAT(56),
    PARTICIPANT_HAS_EMPTY_NORM_DEST(57),
    PARTICIPANT_HAS_EMPTY_NORM_AND_SEND_DEST(58),
    SMS_NOTIFICATION_NOT_FOUND(59),
    MMS_NOTIFICATION_NOT_FOUND(60),
    CONVERSATION_RCS_GROUP_ID_IS_NULL(61),
    OPT_IN_STEP_NOT_HAVE_FEATURE(62),
    OPT_IN_STEP_HAS_UNDEFINED_FEATURE(63),
    RESTORE_MSG_TELEPHONY_INSERT_FAILURE(64),
    OPT_OUT_STEP_NOT_HAVE_FEATURE(65),
    OPT_OUT_STEP_HAS_UNDEFINED_FEATURE(66),
    KEY_SYNC_STEP_NOT_FOUND(67),
    KEY_SYNC_STEP_IS_UNSPECIFIED(68),
    KEY_SYNC_STEP_EXCEEDS_MAX_RETRY(69),
    KEY_SYNC_MORE_THAN_ONE_KEY(70),
    KEY_SYNC_KEY_NOT_READY_BEFORE_SYNC(71),
    KEY_SYNC_NO_HANDLER(72),
    BACKUP_ENCOUNTERED_FORKED_CONVERSATION(73),
    FOUND_NO_SELF_PARTICIPANT(74),
    PARTICIPANT_LIST_DOES_NOT_MATCH_CONVERSATION_ID(75),
    PARTICIPANT_LIST_DOES_NOT_MATCH_CONVERSATION_CORRELATION_ID(115),
    KEY_SYNC_NO_FOLSOM_KEYS(81),
    KEY_SYNC_CANNOT_INSTANTIATE_GMS_CRYPTOR(82),
    KEY_SYNC_NO_BACKUP_KEY(83),
    KEY_SYNC_FAILED_TO_ENCRYPT_BACKUP_KEY(84),
    NO_SQS_STORAGE_QUOTA_FOR_MEDIA(86),
    NO_SQS_STORAGE_QUOTA_FOR_COMPRESSED_IMAGE(87),
    RESTORE_MSG_BUGLEDB_BULK_INSERT_MESSAGE_IDS_FAILURE(88),
    RESTORE_MSG_BUGLEDB_BULK_INSERT_PART_IDS_FAILURE(89),
    RESTORE_MSG_BUGLEDB_BULK_INSERT_PART_IDS_LENGTH_FAILURE(90),
    KEY_D2D_RESTORE_LOCAL_DELETE_FAILURE(93),
    PARTICIPANT_D2D_RESTORE_LOCAL_DELETE_FAILURE(94),
    CONVERSATION_D2D_RESTORE_LOCAL_DELETE_FAILURE(95),
    MESSAGE_D2D_RESTORE_LOCAL_DELETE_FAILURE(96),
    PAGE_TOKEN_CYCLE_EXCEPTION(97),
    STARTED_SIMULTANEOUS_RESTORES(98),
    MEDIA_UPLOAD_SCHEDULER_FIRST_ENQUEUE_FAILED(99),
    MEDIA_UPLOAD_SCHEDULER_RESUME_UPLOADS_FAILED(100),
    MEDIA_UPLOAD_SCHEDULER_RE_ENQUEUE_AFTER_WIFI_CHANGE_FAILED(101),
    MEDIA_UPLOAD_TRANSFER_EXCEPTION_BAD_URL(102),
    MEDIA_UPLOAD_TRANSFER_EXCEPTION_CANCELED(103),
    MEDIA_UPLOAD_TRANSFER_EXCEPTION_REQUEST_BODY_READ_ERROR(104),
    MEDIA_UPLOAD_TRANSFER_EXCEPTION_CONNECTION_ERROR(105),
    MEDIA_UPLOAD_TRANSFER_EXCEPTION_SERVER_ERROR(106),
    MEDIA_UPLOAD_UNKNOWN_ERROR(107),
    MEDIA_UPLOAD_EMPTY_RESPONSE(108),
    MEDIA_UPLOAD_ENCRYPTION_ERROR(109),
    MEDIA_UPLOAD_IMAGE_COMPRESS_ERROR(110),
    MEDIA_UPLOAD_FILE_NOT_FOUND(111),
    MEDIA_UPLOAD_FILE_NOT_FOUND_ORIGINAL(112),
    MEDIA_UPLOAD_FILE_NOT_FOUND_WRITE_SCRATCH_SPACE(113),
    MEDIA_UPLOAD_FILE_NOT_FOUND_READ_SCRATCH_SPACE(114),
    UPDATE_CONVERSATION_ALREADY_EXISTS(121);

    public final int bs;

    amlo(int i) {
        this.bs = i;
    }

    public static amlo b(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED_REASON;
            case 1:
                return ACCOUNT_NOT_LINKED;
            case 2:
                return INTERNAL;
            case 3:
                return ILLEGAL_ARGUMENT;
            case 4:
                return ILLEGAL_STATE;
            case 5:
                return UNSUPPORTED_OPERATION;
            case 6:
                return NULL_POINTER;
            case 7:
                return CMS_DEPENDENCY_MISSING;
            case 8:
                return CMS_CIPHER_EXCEPTION;
            case 9:
                return CMS_DECRYPTION_EXCEPTION;
            case 10:
                return NOTIFICATION_NOT_FOUND;
            case 11:
                return EXECUTION_EXCEPTION;
            case 12:
                return SERVER_STATUS_NOT_FOUND;
            case 13:
                return SERVER_STATUS_INTERNAL;
            case 14:
                return SERVER_STATUS_ALREADY_EXISTS;
            case 15:
                return SERVER_STATUS_INVALID_ARGUMENT;
            case 16:
                return SERVER_STATUS_DEADLINE_EXCEEDED;
            case 17:
                return SERVER_STATUS_UNAVAILABLE;
            case 18:
                return SERVER_STATUS_UNAUTHENTICATED;
            case 19:
                return SERVER_STATUS_FAILED_PRECONDITION;
            case 20:
                return SERVER_STATUS_PERMISSION_DENIED;
            case 21:
                return SERVER_STATUS_OTHER;
            case 22:
                return NO_FAILURE;
            case 23:
                return CMS_DEVICE_NOT_ALLOWED;
            case 24:
                return BACKUP_REACHES_MAX_RETRY;
            case 25:
                return SQLITE_EXCEPTION;
            case 26:
                return MESSAGE_MODEL_MISSING;
            case 27:
                return FREQ_CHANGED_MESSAGE_FIELDS_MISSING;
            case 28:
                return CMS_ID_SAVE_FAILURE;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return OPT_IN_STEP_IS_UNSPECIFIED;
            case 30:
                return OPT_IN_STEP_NOT_FOUND;
            case 31:
                return OPT_IN_STEP_EXCEEDS_MAX_RETRY;
            case 32:
                return OPT_OUT_STEP_NOT_FOUND;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                return OPT_OUT_STEP_IS_UNSPECIFIED;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                return OPT_OUT_INVALID_FEATURE_STATE;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                return OPT_OUT_STEP_EXCEEDS_MAX_RETRY;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                return OPT_IN_INVALID_FEATURE_STATE;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                return RESTORE_EMPTY_CMS_ID;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                return RESTORE_CONV_MISSING_RCS_GRP_CONTRIBUTION_ID;
            case 39:
                return RESTORE_CONV_WRONG_CODE_PATH;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                return RESTORE_CONV_CONVERSATION_WITH_EMPTY_PARTICIPANTS;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                return RESTORE_CONV_PARTICIPANT_NOT_FOUND;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                return RESTORE_CONV_EMPTY_NORMALIZED_DESTINATION;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                return WORK_ITEM_ID_MISSING;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                return RESTORE_MSG_EMPTY_TELEPHONY_URI;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                return RESTORE_MSG_MSG_WITH_TELEPHONY_URI_NOT_FOUND;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                return RESTORE_MSG_CONVERSATION_MISSING;
            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                return RESTORE_MSG_DUPLICATE_MSG_ID_MISSING;
            case 48:
                return RESTORE_MSG_PARTICIPANT_MISSING;
            case 49:
                return RESTORE_MSG_SMS_WITH_EMPTY_TEXT;
            case 50:
                return RESTORE_MSG_MMS_TEXT_WITH_EMPTY_TEXT;
            case 51:
                return RESTORE_MSG_DELETE_FAILED_AFTER_INSERT;
            case 52:
                return RESTORE_MSG_DELETE_FAILED_BEFORE_INSERT;
            case 53:
                return INVALID_PROTO;
            case 54:
                return BACKUP_KEY_NOT_FOUND;
            case 55:
                return ENCRYPTION_KEY_NOT_FOUND;
            case 56:
                return MMS_TRANSACTION_ID_FORMAT;
            case 57:
                return PARTICIPANT_HAS_EMPTY_NORM_DEST;
            case 58:
                return PARTICIPANT_HAS_EMPTY_NORM_AND_SEND_DEST;
            case 59:
                return SMS_NOTIFICATION_NOT_FOUND;
            case 60:
                return MMS_NOTIFICATION_NOT_FOUND;
            case 61:
                return CONVERSATION_RCS_GROUP_ID_IS_NULL;
            case 62:
                return OPT_IN_STEP_NOT_HAVE_FEATURE;
            case 63:
                return OPT_IN_STEP_HAS_UNDEFINED_FEATURE;
            case 64:
                return RESTORE_MSG_TELEPHONY_INSERT_FAILURE;
            case 65:
                return OPT_OUT_STEP_NOT_HAVE_FEATURE;
            case 66:
                return OPT_OUT_STEP_HAS_UNDEFINED_FEATURE;
            case 67:
                return KEY_SYNC_STEP_NOT_FOUND;
            case 68:
                return KEY_SYNC_STEP_IS_UNSPECIFIED;
            case 69:
                return KEY_SYNC_STEP_EXCEEDS_MAX_RETRY;
            case 70:
                return KEY_SYNC_MORE_THAN_ONE_KEY;
            case 71:
                return KEY_SYNC_KEY_NOT_READY_BEFORE_SYNC;
            case 72:
                return KEY_SYNC_NO_HANDLER;
            case 73:
                return BACKUP_ENCOUNTERED_FORKED_CONVERSATION;
            case 74:
                return FOUND_NO_SELF_PARTICIPANT;
            case 75:
                return PARTICIPANT_LIST_DOES_NOT_MATCH_CONVERSATION_ID;
            case 76:
                return LOCAL_ROW_MISSING;
            case 77:
                return CMS_ENTITY_ALREADY_EXISTS;
            case 78:
                return SERVER_RETURNED_INCOMPLETE_DATA_FOR_BATCH;
            case 79:
                return EXISTING_ID_LOOKUP_FAILED;
            case 80:
                return BACKUP_ITEM_SKIPPED;
            case 81:
                return KEY_SYNC_NO_FOLSOM_KEYS;
            case 82:
                return KEY_SYNC_CANNOT_INSTANTIATE_GMS_CRYPTOR;
            case 83:
                return KEY_SYNC_NO_BACKUP_KEY;
            case 84:
                return KEY_SYNC_FAILED_TO_ENCRYPT_BACKUP_KEY;
            case 85:
            default:
                return null;
            case 86:
                return NO_SQS_STORAGE_QUOTA_FOR_MEDIA;
            case 87:
                return NO_SQS_STORAGE_QUOTA_FOR_COMPRESSED_IMAGE;
            case 88:
                return RESTORE_MSG_BUGLEDB_BULK_INSERT_MESSAGE_IDS_FAILURE;
            case 89:
                return RESTORE_MSG_BUGLEDB_BULK_INSERT_PART_IDS_FAILURE;
            case 90:
                return RESTORE_MSG_BUGLEDB_BULK_INSERT_PART_IDS_LENGTH_FAILURE;
            case 91:
                return BACKUP_ITEM_SKIPPED_EMPTY;
            case 92:
                return BACKUP_ITEM_SKIPPED_EXCLUDED;
            case 93:
                return KEY_D2D_RESTORE_LOCAL_DELETE_FAILURE;
            case 94:
                return PARTICIPANT_D2D_RESTORE_LOCAL_DELETE_FAILURE;
            case 95:
                return CONVERSATION_D2D_RESTORE_LOCAL_DELETE_FAILURE;
            case 96:
                return MESSAGE_D2D_RESTORE_LOCAL_DELETE_FAILURE;
            case 97:
                return PAGE_TOKEN_CYCLE_EXCEPTION;
            case 98:
                return STARTED_SIMULTANEOUS_RESTORES;
            case 99:
                return MEDIA_UPLOAD_SCHEDULER_FIRST_ENQUEUE_FAILED;
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return MEDIA_UPLOAD_SCHEDULER_RESUME_UPLOADS_FAILED;
            case 101:
                return MEDIA_UPLOAD_SCHEDULER_RE_ENQUEUE_AFTER_WIFI_CHANGE_FAILED;
            case 102:
                return MEDIA_UPLOAD_TRANSFER_EXCEPTION_BAD_URL;
            case 103:
                return MEDIA_UPLOAD_TRANSFER_EXCEPTION_CANCELED;
            case 104:
                return MEDIA_UPLOAD_TRANSFER_EXCEPTION_REQUEST_BODY_READ_ERROR;
            case 105:
                return MEDIA_UPLOAD_TRANSFER_EXCEPTION_CONNECTION_ERROR;
            case 106:
                return MEDIA_UPLOAD_TRANSFER_EXCEPTION_SERVER_ERROR;
            case 107:
                return MEDIA_UPLOAD_UNKNOWN_ERROR;
            case 108:
                return MEDIA_UPLOAD_EMPTY_RESPONSE;
            case 109:
                return MEDIA_UPLOAD_ENCRYPTION_ERROR;
            case 110:
                return MEDIA_UPLOAD_IMAGE_COMPRESS_ERROR;
            case 111:
                return MEDIA_UPLOAD_FILE_NOT_FOUND;
            case 112:
                return MEDIA_UPLOAD_FILE_NOT_FOUND_ORIGINAL;
            case 113:
                return MEDIA_UPLOAD_FILE_NOT_FOUND_WRITE_SCRATCH_SPACE;
            case 114:
                return MEDIA_UPLOAD_FILE_NOT_FOUND_READ_SCRATCH_SPACE;
            case 115:
                return PARTICIPANT_LIST_DOES_NOT_MATCH_CONVERSATION_CORRELATION_ID;
            case 116:
                return EXISTING_CONVERSATION_ID_LOOKUP_FAILED;
            case 117:
                return ENCRYPTION_KEY_NOT_FOUND_FROM_CACHE_WHEN_DECRYPT;
            case 118:
                return ENCRYPTION_KEY_NOT_FOUND_WHEN_CREATE_CACHE;
            case 119:
                return ENCRYPTION_KEY_NOT_FOUND_INITIAL_BACKUP;
            case 120:
                return ENCRYPTION_KEY_NOT_FOUND_INCREMENTAL_BACKUP;
            case 121:
                return UPDATE_CONVERSATION_ALREADY_EXISTS;
            case 122:
                return BACKUP_ITEM_FAILED_REQUEST_VALIDATION;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.bs;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.bs);
    }
}
