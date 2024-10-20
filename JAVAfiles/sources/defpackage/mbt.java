package defpackage;

import com.google.android.gms.common.internal.IGmsServiceBroker;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum mbt implements apak {
    LOG_SPEC_UNSPECIFIED(0),
    LOG_SPEC_LEGACY_LOGGING(1),
    LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS(2),
    LOG_SPEC_UNIT_TEST_ONLY(3),
    LOG_SPEC_DSDR_EVENTS(4),
    LOG_SPEC_DEFAULT_SUBSCRIPTION_ID_STATUS(5),
    LOG_SPEC_RCS_SETTINGS_UI_EVENTS(6),
    LOG_SPEC_EMOTIFY_EVENTS(7),
    LOG_SPEC_DEFAULT_SUBSCRIPTION_ID_FROM_SOURCES(8),
    LOG_SPEC_XMS_CONFIG_FLAGS(9),
    LOG_SPEC_MEET_CALLING_EVENTS(10),
    LOG_SPEC_DSDR_GROUP_EVENTS(11),
    LOG_SPEC_RCS_PROVISIONING_MANAGER_EVENTS(12),
    LOG_SPEC_VOICE_MOOD_EVENTS(13),
    LOG_SPEC_RCS_PROVISIONING_UI_EVENTS(14),
    LOG_SPEC_MAGIC_COMPOSE_EVENTS(15),
    LOG_SPEC_DOUBLE_TAP_REACT_PROMOTION_EVENTS(16),
    LOG_SPEC_REVOKE_CONSENT_EVENTS(17),
    LOG_SPEC_RCS_LOCAL_IDENTITY_EVENTS(18),
    LOG_SPEC_BARD_EVENTS(19),
    LOG_SPEC_SIM_SUBSCRIPTION_INFO_COMPARISON_LOGGING(20),
    LOG_SPEC_D2D_BACKUP_AND_RESTORE_EVENTS(21),
    LOG_SPEC_REVERSE_TELEPHONY_SYNC_EVENTS(22),
    LOG_SPEC_WELCOME_FLOW_EVENTS(24),
    LOG_SPEC_SELFIE_GIF_EVENTS(25),
    LOG_SPEC_MESSAGE_RECEIVING_NORTHSTAR_EVENTS(26),
    LOG_SPEC_GAIA_SIGN_IN_EVENTS(27),
    LOG_SPEC_DSDR_AVAILABILITY_COMPARISON_EVENTS(28),
    LOG_SPEC_SATELLITE_EVENTS(29),
    LOG_SPEC_MMS_GROUP_UPGRADE_EVENTS(30),
    LOG_SPEC_RESTORE_WORKFLOW_EVENTS(31),
    LOG_SPEC_IS_SIM_LOADED_EVENT(32),
    LOG_SPEC_MY_IDENTITY_EVENTS(33),
    LOG_SPEC_BACKUP_WORKFLOW_EVENTS(34),
    LOG_SPEC_VIDEO_CALLING_EVENT(35),
    LOG_SPEC_TELEPHONY_PERSISTENCE_EVENTS(36),
    LOG_SPEC_MMS_GROUP_EVENT(37),
    LOG_SPEC_OPEN_PENPAL_CHAT_EVENT(38),
    LOG_SPEC_GAIA_REPORT(39),
    LOG_SPEC_MMS_MERGING_EVENT(40),
    LOG_SPEC_FILE_PROCESSING_EVENT(41),
    LOG_SPEC_GROUP_OPERATION_EVENT(42),
    LOG_SPEC_CONVERSATION_SCREEN_EVENTS(43),
    LOG_SPEC_TYCHO_GRPC_EVENTS(44);

    public final int S;

    mbt(int i) {
        this.S = i;
    }

    public static mbt b(int i) {
        switch (i) {
            case 0:
                return LOG_SPEC_UNSPECIFIED;
            case 1:
                return LOG_SPEC_LEGACY_LOGGING;
            case 2:
                return LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS;
            case 3:
                return LOG_SPEC_UNIT_TEST_ONLY;
            case 4:
                return LOG_SPEC_DSDR_EVENTS;
            case 5:
                return LOG_SPEC_DEFAULT_SUBSCRIPTION_ID_STATUS;
            case 6:
                return LOG_SPEC_RCS_SETTINGS_UI_EVENTS;
            case 7:
                return LOG_SPEC_EMOTIFY_EVENTS;
            case 8:
                return LOG_SPEC_DEFAULT_SUBSCRIPTION_ID_FROM_SOURCES;
            case 9:
                return LOG_SPEC_XMS_CONFIG_FLAGS;
            case 10:
                return LOG_SPEC_MEET_CALLING_EVENTS;
            case 11:
                return LOG_SPEC_DSDR_GROUP_EVENTS;
            case 12:
                return LOG_SPEC_RCS_PROVISIONING_MANAGER_EVENTS;
            case 13:
                return LOG_SPEC_VOICE_MOOD_EVENTS;
            case 14:
                return LOG_SPEC_RCS_PROVISIONING_UI_EVENTS;
            case 15:
                return LOG_SPEC_MAGIC_COMPOSE_EVENTS;
            case 16:
                return LOG_SPEC_DOUBLE_TAP_REACT_PROMOTION_EVENTS;
            case 17:
                return LOG_SPEC_REVOKE_CONSENT_EVENTS;
            case 18:
                return LOG_SPEC_RCS_LOCAL_IDENTITY_EVENTS;
            case 19:
                return LOG_SPEC_BARD_EVENTS;
            case 20:
                return LOG_SPEC_SIM_SUBSCRIPTION_INFO_COMPARISON_LOGGING;
            case 21:
                return LOG_SPEC_D2D_BACKUP_AND_RESTORE_EVENTS;
            case 22:
                return LOG_SPEC_REVERSE_TELEPHONY_SYNC_EVENTS;
            case 23:
            default:
                return null;
            case 24:
                return LOG_SPEC_WELCOME_FLOW_EVENTS;
            case 25:
                return LOG_SPEC_SELFIE_GIF_EVENTS;
            case 26:
                return LOG_SPEC_MESSAGE_RECEIVING_NORTHSTAR_EVENTS;
            case 27:
                return LOG_SPEC_GAIA_SIGN_IN_EVENTS;
            case 28:
                return LOG_SPEC_DSDR_AVAILABILITY_COMPARISON_EVENTS;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return LOG_SPEC_SATELLITE_EVENTS;
            case 30:
                return LOG_SPEC_MMS_GROUP_UPGRADE_EVENTS;
            case 31:
                return LOG_SPEC_RESTORE_WORKFLOW_EVENTS;
            case 32:
                return LOG_SPEC_IS_SIM_LOADED_EVENT;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                return LOG_SPEC_MY_IDENTITY_EVENTS;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                return LOG_SPEC_BACKUP_WORKFLOW_EVENTS;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                return LOG_SPEC_VIDEO_CALLING_EVENT;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                return LOG_SPEC_TELEPHONY_PERSISTENCE_EVENTS;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                return LOG_SPEC_MMS_GROUP_EVENT;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                return LOG_SPEC_OPEN_PENPAL_CHAT_EVENT;
            case 39:
                return LOG_SPEC_GAIA_REPORT;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                return LOG_SPEC_MMS_MERGING_EVENT;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                return LOG_SPEC_FILE_PROCESSING_EVENT;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                return LOG_SPEC_GROUP_OPERATION_EVENT;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                return LOG_SPEC_CONVERSATION_SCREEN_EVENTS;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                return LOG_SPEC_TYCHO_GRPC_EVENTS;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.S;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.S);
    }
}
