package defpackage;

import com.google.android.gms.common.internal.IGmsServiceBroker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amvm implements apak {
    UNKNOWN(0),
    SELECTED_DEFAULT_SMS_APP(1),
    APP_STARTUP_RESUME_SYNC(2),
    TELEPHONY_CHANGE(3),
    SYNC_TELEPHONY_THREADS_FOUND_OBSOLETE_THREADS(4),
    SYNC_TELEPHONY_THREADS_FORCE_FULL_SYNC(5),
    SYNC_TELEPHONY_THREADS_RESUME_SYNC(6),
    DATABASE_CREATED(7),
    CUSTOM_UPGRADE_STEP_UPGRADE_TO_VERSION_12003(8),
    HUAWEI_SMS_RESTORE(9),
    SAMSUNG_TELEPHONY_RESTORE(10),
    GOOGLE_ONE_RESTORE(11),
    PARTIAL_SYNC(12),
    SPOT_SYNC(13),
    IMMEDIATE_SYNC(14),
    TELEPHONY_OBSERVER_REGISTERED(15),
    SMS_RELEASE_STORAGE(16),
    EARLIER_MESSAGES_OUT_OF_SYNC(17),
    QUEUED_SYNC(18),
    OLDER_MESSAGES_OUT_OF_SYNC(19),
    RECENT_MESSAGES_OUT_OF_SYNC(20),
    PRE_N_DATA_MODEL_INIT(21),
    TELEPHONY_CHANGE_NULL_URI(22),
    TELEPHONY_CHANGE_TOO_MANY_CHANGES(23),
    SECONDARY_USER_SYNC(24),
    EMPTY_CONVERSATION_LIST_VIEW(25),
    DEBUG_UTILS_DELETE_ALL_CONVERSATIONS(26),
    DATA_MODEL_INIT_MICRO_APP(27),
    TELEPHONY_MESSAGES_OBSERVER(28),
    DATABASE_UPGRADE_RESYNC(29),
    LG_TELEPHONY_RESTORE(30),
    CUSTOM_UPGRADE_STEP_UPGRADE_TO_VERSION_59090(31),
    TOO_MANY_SPOT_SYNCS(32),
    REDESIGN_FLAG_FLIP(33),
    DEBUG_UTILS(101),
    FAKE_MESSAGE_GENERATOR(102),
    TEST(103),
    OTHER(104);

    public final int M;

    amvm(int i) {
        this.M = i;
    }

    public static amvm b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return SELECTED_DEFAULT_SMS_APP;
            case 2:
                return APP_STARTUP_RESUME_SYNC;
            case 3:
                return TELEPHONY_CHANGE;
            case 4:
                return SYNC_TELEPHONY_THREADS_FOUND_OBSOLETE_THREADS;
            case 5:
                return SYNC_TELEPHONY_THREADS_FORCE_FULL_SYNC;
            case 6:
                return SYNC_TELEPHONY_THREADS_RESUME_SYNC;
            case 7:
                return DATABASE_CREATED;
            case 8:
                return CUSTOM_UPGRADE_STEP_UPGRADE_TO_VERSION_12003;
            case 9:
                return HUAWEI_SMS_RESTORE;
            case 10:
                return SAMSUNG_TELEPHONY_RESTORE;
            case 11:
                return GOOGLE_ONE_RESTORE;
            case 12:
                return PARTIAL_SYNC;
            case 13:
                return SPOT_SYNC;
            case 14:
                return IMMEDIATE_SYNC;
            case 15:
                return TELEPHONY_OBSERVER_REGISTERED;
            case 16:
                return SMS_RELEASE_STORAGE;
            case 17:
                return EARLIER_MESSAGES_OUT_OF_SYNC;
            case 18:
                return QUEUED_SYNC;
            case 19:
                return OLDER_MESSAGES_OUT_OF_SYNC;
            case 20:
                return RECENT_MESSAGES_OUT_OF_SYNC;
            case 21:
                return PRE_N_DATA_MODEL_INIT;
            case 22:
                return TELEPHONY_CHANGE_NULL_URI;
            case 23:
                return TELEPHONY_CHANGE_TOO_MANY_CHANGES;
            case 24:
                return SECONDARY_USER_SYNC;
            case 25:
                return EMPTY_CONVERSATION_LIST_VIEW;
            case 26:
                return DEBUG_UTILS_DELETE_ALL_CONVERSATIONS;
            case 27:
                return DATA_MODEL_INIT_MICRO_APP;
            case 28:
                return TELEPHONY_MESSAGES_OBSERVER;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return DATABASE_UPGRADE_RESYNC;
            case 30:
                return LG_TELEPHONY_RESTORE;
            case 31:
                return CUSTOM_UPGRADE_STEP_UPGRADE_TO_VERSION_59090;
            case 32:
                return TOO_MANY_SPOT_SYNCS;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                return REDESIGN_FLAG_FLIP;
            default:
                switch (i) {
                    case 101:
                        return DEBUG_UTILS;
                    case 102:
                        return FAKE_MESSAGE_GENERATOR;
                    case 103:
                        return TEST;
                    case 104:
                        return OTHER;
                    default:
                        return null;
                }
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.M;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.M);
    }
}
