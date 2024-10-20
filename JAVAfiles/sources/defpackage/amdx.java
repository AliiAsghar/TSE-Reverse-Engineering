package defpackage;

import com.android.vcard.VCardConstants;
import com.google.android.gms.common.internal.IGmsServiceBroker;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amdx implements apam {
    static final apam a = new amdx();

    private amdx() {
    }

    @Override // defpackage.apam
    public final boolean a(int i) {
        amdy amdyVar;
        switch (i) {
            case -1:
                amdyVar = amdy.TEST_ACTION;
                break;
            case 0:
                amdyVar = amdy.UNKNOWN;
                break;
            case 1:
                amdyVar = amdy.GET_OR_CREATE_CONVERSATION_ACTION;
                break;
            case 2:
                amdyVar = amdy.UPDATE_CONVERSATION_INTERACTIVE_TIMESTAMP_ACTION;
                break;
            case 3:
                amdyVar = amdy.HANDLE_ASSISTANT_REQUESTION_TIMEOUT_ACTION;
                break;
            case 4:
                amdyVar = amdy.REPORT_SPAM_ACTION;
                break;
            case 5:
                amdyVar = amdy.SEND_MESSAGE_ACTION;
                break;
            case 6:
                amdyVar = amdy.READ_DRAFT_ACTION;
                break;
            case 7:
                amdyVar = amdy.HANDLE_LOW_STORAGE_ACTION;
                break;
            case 8:
                amdyVar = amdy.TWINNED_STATUS_CHANGE_ACTION;
                break;
            case 9:
                amdyVar = amdy.PROCESS_USER_ALERT_ACTION;
                break;
            case 10:
                amdyVar = amdy.UPDATE_ATTACHMENT_AFTER_RESIZING_ACTION;
                break;
            case 11:
                amdyVar = amdy.CHANGE_PARTICIPANTS_ACTION;
                break;
            case 12:
                amdyVar = amdy.MIGRATE_BLOCKED_CONTACTS_ACTION;
                break;
            case 13:
                amdyVar = amdy.FIXUP_MESSAGES_ON_STARTUP_ACTION;
                break;
            case 14:
                amdyVar = amdy.DELETE_MESSAGE_ACTION;
                break;
            case 15:
                amdyVar = amdy.REPORT_TO_SPAM_SERVICE_ACTION;
                break;
            case 16:
                amdyVar = amdy.INITIAL_ETOUFFEE_PROVISIONING;
                break;
            case 17:
                amdyVar = amdy.PARTICIPANT_BLOCK_STATUS_REFRESH_ACTION;
                break;
            case 18:
                amdyVar = amdy.RECEIVE_MMS_MESSAGE_ACTION;
                break;
            case 19:
                amdyVar = amdy.PROCESS_INCOMING_RCS_FILE_TRANSFER_COMPLETED_ACTION;
                break;
            case 20:
                amdyVar = amdy.LOG_SCOOBY_METADATA_ACTION;
                break;
            case 21:
                amdyVar = amdy.SEND_MESSAGE_TO_CONVERSATION_OR_PARTICIPANTS_ACTION;
                break;
            case 22:
                amdyVar = amdy.UPDATE_PARTICIPANT_COLOR_ACTION;
                break;
            case 23:
                amdyVar = amdy.PARTICIPANT_FULL_REFRESH_ACTION;
                break;
            case 24:
                amdyVar = amdy.CLEAR_SESSION_IDS_ACTION;
                break;
            case 25:
                amdyVar = amdy.UPDATE_CONVERSATION_ADD_CONTACT_BANNER_STATUS_ACTION;
                break;
            case 26:
                amdyVar = amdy.PROCESS_SETTINGS_UPDATE_ACTION;
                break;
            case 27:
                amdyVar = amdy.UPDATE_CLOUD_SYNC_MESSAGE_ACTION;
                break;
            case 28:
                amdyVar = amdy.CREATE_P2P_CONVERSATION_TRAINING_EXAMPLE_ACTION;
                break;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                amdyVar = amdy.RECEIVE_SMS_MESSAGE_ACTION;
                break;
            case 30:
            default:
                amdyVar = null;
                break;
            case 31:
                amdyVar = amdy.RECEIVE_RCS_FILE_TRANSFER_ACTION;
                break;
            case 32:
                amdyVar = amdy.INSERT_ENRICHED_CALL_ENTRY_ACTION;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                amdyVar = amdy.REQUEST_MORE_MESSAGES_ACTION;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                amdyVar = amdy.UPDATE_PARTICIPANT_SPAM_STATUS_ACTION;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                amdyVar = amdy.PAUSE_RCS_FILE_TRANSFER_ACTION;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                amdyVar = amdy.RESUME_RCS_FILE_TRANSFER_ACTION;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                amdyVar = amdy.REFRESH_NOTIFICATION_IF_OTP_FOUND_ACTION;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                amdyVar = amdy.SYNC_NOTIFICATION_CHANNEL_ACTION;
                break;
            case 39:
                amdyVar = amdy.EXPIRE_WAP_PUSH_SI_MESSAGE_ACTION;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                amdyVar = amdy.ADD_MEMBERS_TO_RCS_CONVERSATION_ACTION;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                amdyVar = amdy.INITIATE_CLIENT_SIDE_FALLBACK_ACTION;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                amdyVar = amdy.REQUEST_MESSAGE_DECORATOR_ACTION;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                amdyVar = amdy.RECURRING_TELEMETRY_UPLOADER_ACTION;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                amdyVar = amdy.FORWARD_INCOMING_TYPING_INDICATOR_TO_TACHYON_ACTION;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                amdyVar = amdy.UPDATE_CONVERSATION_XMS_LATCH_ACTION;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                amdyVar = amdy.PROCESS_PENDING_MESSAGES_ACTION;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                amdyVar = amdy.GET_FRECENT_CONVERSATIONS_ACTION;
                break;
            case 48:
                amdyVar = amdy.PROCESS_FILE_TRANSFER_METADATA_UPDATE_ACTION;
                break;
            case 49:
                amdyVar = amdy.CHECK_PHONE_CONFIG_ACTION;
                break;
            case 50:
                amdyVar = amdy.MARK_AS_READ_ACTION;
                break;
            case 51:
                amdyVar = amdy.GET_MEDIA_DURATION_ACTION;
                break;
            case 52:
                amdyVar = amdy.LEAVE_RCS_CONVERSATION_ACTION;
                break;
            case 53:
                amdyVar = amdy.RECEIVE_CLOUD_SYNC_MESSAGE_ACTION;
                break;
            case 54:
                amdyVar = amdy.SYNC_MESSAGES_ACTION;
                break;
            case 55:
                amdyVar = amdy.LEGACY_GROUP_PROTOCOL_SWITCH_ACTION;
                break;
            case 56:
                amdyVar = amdy.UPDATE_RBM_BOT_PARTICIPANT_ACTION;
                break;
            case 57:
                amdyVar = amdy.DELETE_CONVERSATION_ACTION;
                break;
            case 58:
                amdyVar = amdy.MARK_CONVERSATION_NOT_YET_DELIVERED_ACTION;
                break;
            case 59:
                amdyVar = amdy.PROCESS_FILE_TRANSFER_ACTION;
                break;
            case 60:
                amdyVar = amdy.DOWNLOAD_MMS_ACTION;
                break;
            case 61:
                amdyVar = amdy.RECEIVE_RCS_MESSAGE_ACTION;
                break;
            case 62:
                amdyVar = amdy.RECEIVE_RBM_PAYMENT_RECEIPT_ACTION;
                break;
            case 63:
                amdyVar = amdy.FALLBACK_TO_XMS_ACTION;
                break;
            case 64:
                amdyVar = amdy.RBM_GET_MEDIA_DURATION_ACTION;
                break;
            case 65:
                amdyVar = amdy.UPDATE_CONVERSATION_OPEN_COUNT_ACTION;
                break;
            case 66:
                amdyVar = amdy.LOG_TELEPHONY_DATABASE_ACTION;
                break;
            case 67:
                amdyVar = amdy.CLEAR_CLOUD_SYNC_MESSAGES_ACTION;
                break;
            case 68:
                amdyVar = amdy.UPDATE_PARTICIPANT_RCS_AVAILABLE_ACTION;
                break;
            case 69:
                amdyVar = amdy.SYNC_TELEPHONY_THREADS_ACTION;
                break;
            case 70:
                amdyVar = amdy.UPDATE_MESSAGE_PART_SIZE_ACTION;
                break;
            case 71:
                amdyVar = amdy.WAIT_FOR_RCS_SERVICE_CONNECTION_ACTION;
                break;
            case 72:
                amdyVar = amdy.COMMMIT_PHENOTYPE_ACTION;
                break;
            case 73:
                amdyVar = amdy.MARK_AS_NOTIFIED_ACTION;
                break;
            case 74:
                amdyVar = amdy.PROCESS_PENDING_REVOCATIONS_ACTION;
                break;
            case 75:
                amdyVar = amdy.RECEIVE_WAP_PUSH_SI_MESSAGE_ACTION;
                break;
            case 76:
                amdyVar = amdy.SANITIZE_PARTICIPANTS_ACTION;
                break;
            case 77:
                amdyVar = amdy.UPLOAD_ATTACHMENTS_TO_BLOBSTORE_ACTION;
                break;
            case 78:
                amdyVar = amdy.UPDATE_CONVERSATION_ARCHIVE_STATUS_ACTION;
                break;
            case 79:
                amdyVar = amdy.DELETE_SCRATCH_FILE_ACTION;
                break;
            case 80:
                amdyVar = amdy.CLEAN_TELEPHONY_RAW_MESSAGES_ACTION;
                break;
            case 81:
                amdyVar = amdy.PAIRED_DESKTOP_SCAN_ACTION;
                break;
            case 82:
                amdyVar = amdy.UPDATE_DESTINATION_BLOCKED_ACTION;
                break;
            case 83:
                amdyVar = amdy.RELOAD_CEQUINT_PARTICIPANT_ACTION;
                break;
            case 84:
                amdyVar = amdy.INSERT_NEW_MESSAGE_ACTION;
                break;
            case 85:
                amdyVar = amdy.WRITE_WATCH_VERSION_ACTION;
                break;
            case 86:
                amdyVar = amdy.RECEIVE_CONVERSATION_SUGGESTIONS_ACTION;
                break;
            case 87:
                amdyVar = amdy.WRITE_DRAFT_MESSAGE_ACTION;
                break;
            case 88:
                amdyVar = amdy.PROCESS_REVOCATION_SENT_ACTION;
                break;
            case 89:
                amdyVar = amdy.REQUEST_P2P_CONVERSATION_SUGGESTIONS_ACTION;
                break;
            case 90:
                amdyVar = amdy.REMOVE_SELF_NUMBER_FROM_CONVERSATIONS_ACTION;
                break;
            case 91:
                amdyVar = amdy.DEFER_BACKGROUND_WORK_ACTION;
                break;
            case 92:
                amdyVar = amdy.UPDATE_RCS_FILE_TRANSFER_PREVIEW_ACTION;
                break;
            case 93:
                amdyVar = amdy.REQUEST_LINK_PREVIEW_ACTION;
                break;
            case 94:
                amdyVar = amdy.PROCESS_CONVERSATION_PARTICIPANTS_UPDATE_ACTION;
                break;
            case 95:
                amdyVar = amdy.PROCESS_CONVERSATION_UPDATE_ACTION;
                break;
            case 96:
                amdyVar = amdy.PROCESS_MESSAGE_UPDATE_ACTION;
                break;
            case 97:
                amdyVar = amdy.DUMP_DATABASE_ACTION;
                break;
            case 98:
                amdyVar = amdy.PROCESS_RCS_DELIVERY_REPORT_ACTION;
                break;
            case 99:
                amdyVar = amdy.CHECK_WEARABLE_APP_VERSION_ACTION;
                break;
            case VCardConstants.DEFAULT_PREF /* 100 */:
                amdyVar = amdy.SETUP_EXPRESSIVE_STICKERS_ACTION;
                break;
            case 101:
                amdyVar = amdy.PROCESS_DOWNLOADED_MMS_ACTION;
                break;
            case 102:
                amdyVar = amdy.PROCESS_SENT_MESSAGE_ACTION;
                break;
            case 103:
                amdyVar = amdy.UPDATE_CONVERSATION_SPAM_DISMISS_STATUS_ACTION;
                break;
            case 104:
                amdyVar = amdy.PROCESS_DELIVERY_REPORT_ACTION;
                break;
            case 105:
                amdyVar = amdy.SET_DITTO_SESSION_INACTIVE_ACTION;
                break;
            case 106:
                amdyVar = amdy.PROCESS_EXPRESSIVE_STICKER_FAVORITE_ACTION;
                break;
            case 107:
                amdyVar = amdy.REPLACE_SMS_MESSAGE_ACTION;
                break;
            case 108:
                amdyVar = amdy.SEND_REPORT_ACTION;
                break;
            case 109:
                amdyVar = amdy.UPDATE_CONVERSATION_OPTIONS_ACTION;
                break;
            case 110:
                amdyVar = amdy.UPDATE_CONTACT_DISAMBIGUATION_ACTION;
                break;
            case 111:
                amdyVar = amdy.FILL_PART_SIZE_ACTION;
                break;
            case 112:
                amdyVar = amdy.RESEND_MESSAGE_ACTION;
                break;
            case 113:
                amdyVar = amdy.CHECK_ACTIVE_DESKTOP_IS_ALIVE_ACTION;
                break;
            case 114:
                amdyVar = amdy.REDOWNLOAD_MESSAGE_ACTION;
                break;
            case 115:
                amdyVar = amdy.FIX_CONVERSATION_TYPE_ACTION;
                break;
            case 116:
                amdyVar = amdy.NO_CONFIRMATION_MESSAGE_SEND_ACTION;
                break;
            case 117:
                amdyVar = amdy.FAILED_REPORT_ACTION;
                break;
            case 118:
                amdyVar = amdy.PROCESS_EXPRESSIVE_STICKER_ATTACHMENT_ACTION;
                break;
            case 119:
                amdyVar = amdy.SELF_PARTICIPANTS_REFRESH_ACTION;
                break;
            case 120:
                amdyVar = amdy.UPDATE_UNREAD_COUNTER_ACTION;
                break;
            case 121:
                amdyVar = amdy.REFRESH_STATEFUL_NOTIFICATIONS_ACTION;
                break;
            case 122:
                amdyVar = amdy.SYNC_DATA_TO_WEARABLE_APP_ACTION;
                break;
            case 123:
                amdyVar = amdy.GENERIC_WORKER_QUEUE_ACTION;
                break;
            case 124:
                amdyVar = amdy.REBUILD_SHORTCUTS_ACTION;
                break;
            case 125:
                amdyVar = amdy.PROCESS_TELEPHONY_CHANGE_ACTION;
                break;
            case 126:
                amdyVar = amdy.COUNTRY_CODE_DETECTOR_ACTION;
                break;
            case 127:
                amdyVar = amdy.ENSURE_CONNECTIVITY_STABILIZED_ACTION;
                break;
            case 128:
                amdyVar = amdy.GET_RCS_AVAILABLE_ACTION;
                break;
            case 129:
                amdyVar = amdy.UPLOAD_KEYS_ACTION;
                break;
            case 130:
                amdyVar = amdy.LOG_MESSAGE_SENT_OR_RECEIVED;
                break;
            case 131:
                amdyVar = amdy.INSERT_RCS_MESSAGE_IN_TELEPHONY_ACTION;
                break;
            case 132:
                amdyVar = amdy.RESET_GROUP_RCS_SESSION_ID_ACTION;
                break;
            case 133:
                amdyVar = amdy.HANDLE_INCOMING_RCS_GROUP_CHAT_INVITATION_ACTION;
                break;
            case 134:
                amdyVar = amdy.INITIALIZE_P2P_CONVERSATION_TRAINING_ACTION;
                break;
            case 135:
                amdyVar = amdy.MIGRATE_RCS_CONFERENCE_INFO_INTO_BUGLE_DB_ACTION;
                break;
            case 136:
                amdyVar = amdy.HANDLE_RCS_GROUP_NOTIFY_UPDATE_ACTION;
                break;
            case 137:
                amdyVar = amdy.DO_NOTHING_ACTION;
                break;
        }
        if (amdyVar != null) {
            return true;
        }
        return false;
    }
}
