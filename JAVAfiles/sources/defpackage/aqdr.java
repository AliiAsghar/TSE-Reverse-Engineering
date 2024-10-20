package defpackage;

import com.google.android.gms.common.internal.IGmsServiceBroker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aqdr implements apak {
    UNKNOWN(0),
    MESSAGE_ACK(1),
    FIREBALL(2),
    TACHYON(3),
    BASIC(4),
    GROUP(5),
    DEPRECATED_CALL_CONTROLLER(6),
    USERDATA(7),
    MESSAGE_RECEIPT(8),
    SECURE(9),
    PREKEY_SECURE(10),
    RCS_MESSAGE(11),
    SYSTEM_MESSAGE(12),
    MATCHSTICK(13),
    WIREBALL(14),
    SECURE_GROUP_KEY_DISTRIBUTION(15),
    ENGAGEMENT_NOTIFICATION(16),
    COMMON_MEDIA_MESSAGE(17),
    FIREBALL_MESSAGE_ANNOTATION(18),
    DITTO(19),
    SECURE_ONE_TIME_KEY(20),
    DUO_STATE_SYNC_MESSAGE(21),
    GROUP_CALL_STATE(22),
    BUGLE_AGENT(23),
    LIGHTER_MESSAGE(24),
    DUO_UPLOAD_LOGS_MESSAGE(25),
    DUO_GROUP_KEY_DISTRIBUTION(26),
    AQUARIUS_MESSAGE(27),
    CLOUDCAST_MESSAGE(28),
    CHROMOTING_MESSAGE(29),
    DUO_PRECALL(30),
    DUO_MEDIA_CAPTURE_MESSAGE(31),
    DUO_GROUP_KEY_REQUEST(32),
    BUGLE_PUSH(33),
    CMS_NOTIFICATION(34),
    DUO_MESSAGE(35),
    TACHYGRAM_MESSAGE(36),
    MOMENT_MEDIA_MESSAGE(37),
    DUO_IN_CALL_CAPS_CHANGE_MESSAGE(38),
    COMMSSUITE_NOTIFICATION(39),
    MESSAGES_DATA_DONATION(40),
    EXO_MESSAGE(41),
    TINCAN_MESSAGE(42),
    CMS_RPC_MESSAGE(43),
    TACHYGRAM_CONTROL_MESSAGE(44),
    UNRECOGNIZED(-1);

    private final int V;

    aqdr(int i) {
        this.V = i;
    }

    public static aqdr b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return MESSAGE_ACK;
            case 2:
                return FIREBALL;
            case 3:
                return TACHYON;
            case 4:
                return BASIC;
            case 5:
                return GROUP;
            case 6:
                return DEPRECATED_CALL_CONTROLLER;
            case 7:
                return USERDATA;
            case 8:
                return MESSAGE_RECEIPT;
            case 9:
                return SECURE;
            case 10:
                return PREKEY_SECURE;
            case 11:
                return RCS_MESSAGE;
            case 12:
                return SYSTEM_MESSAGE;
            case 13:
                return MATCHSTICK;
            case 14:
                return WIREBALL;
            case 15:
                return SECURE_GROUP_KEY_DISTRIBUTION;
            case 16:
                return ENGAGEMENT_NOTIFICATION;
            case 17:
                return COMMON_MEDIA_MESSAGE;
            case 18:
                return FIREBALL_MESSAGE_ANNOTATION;
            case 19:
                return DITTO;
            case 20:
                return SECURE_ONE_TIME_KEY;
            case 21:
                return DUO_STATE_SYNC_MESSAGE;
            case 22:
                return GROUP_CALL_STATE;
            case 23:
                return BUGLE_AGENT;
            case 24:
                return LIGHTER_MESSAGE;
            case 25:
                return DUO_UPLOAD_LOGS_MESSAGE;
            case 26:
                return DUO_GROUP_KEY_DISTRIBUTION;
            case 27:
                return AQUARIUS_MESSAGE;
            case 28:
                return CLOUDCAST_MESSAGE;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return CHROMOTING_MESSAGE;
            case 30:
                return DUO_PRECALL;
            case 31:
                return DUO_MEDIA_CAPTURE_MESSAGE;
            case 32:
                return DUO_GROUP_KEY_REQUEST;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                return BUGLE_PUSH;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                return CMS_NOTIFICATION;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                return DUO_MESSAGE;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                return TACHYGRAM_MESSAGE;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                return MOMENT_MEDIA_MESSAGE;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                return DUO_IN_CALL_CAPS_CHANGE_MESSAGE;
            case 39:
                return COMMSSUITE_NOTIFICATION;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                return MESSAGES_DATA_DONATION;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                return EXO_MESSAGE;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                return TINCAN_MESSAGE;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                return CMS_RPC_MESSAGE;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                return TACHYGRAM_CONTROL_MESSAGE;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.V;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
