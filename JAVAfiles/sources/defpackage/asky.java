package defpackage;

import com.google.android.gms.common.internal.IGmsServiceBroker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum asky implements apak {
    UNKNOWN(0),
    UNSPECIFIED(1),
    PREKEY_EXHAUSTED(2),
    INVALID_PHONE_NUMBER(3),
    REGISTRATION_NOT_FOUND(4),
    REGISTRATION_UNAUTHENTICATED(5),
    GROUP_USER_NOT_FOUND(6),
    ACCOUNT_OTHER_GAIA_EXISTS(7),
    SIGN_IN_GAIA_ACCOUNT_NOT_FOUND(9),
    GAIA_ID_REQUIRED(10),
    REQUESTER_ID_UNAUTHENTICATED(11),
    DESTINATION_NOT_FOUND(12),
    DESTINATION_REGISTRATION_NOT_FOUND(29),
    GAIA_PRIMIARY_EMAIL_NOT_FOUND(13),
    GAIA_ID_MISMATCH(14),
    DEST_NOT_PAIRED(15),
    GAIA_ACCOUNT_AT_MOST_ONE_NUMBER_ALLOWED(16),
    TOO_MANY_CONTACT_ACTIONS_IN_REQUEST(17),
    CONTACT_SOURCE_REQUIRED(18),
    CONTACT_SOURCE_NOT_FOUND(19),
    GAIA_EMAIL_MISMATCH(20),
    MULTIPLE_GAIA_ACCOUNTS_FOUND(21),
    UNREGISTER_REGISTRATIONS_PARTIAL_FAILURE(22),
    USER_ID_NOT_OWNED_BY_REGISTRATION(23),
    UNICORN_ACCOUNT_RESTRICTED(24),
    GAIA_ACCOUNT_DOWNGRADED(25),
    TOO_MANY_MUTATIONS_IN_REQUEST(26),
    DASHER_ACCOUNT_RESTRICTED(27),
    CANNOT_ADD_BLOCKER_TO_GROUP(28),
    REG_GAIA_SILENT_PN_NOT_FOUND(30),
    REG_GAIA_SILENT_CONFLICT_GAIA_ONLY(31),
    INVALID_IDENTITY_PROOF(32),
    CANNOT_JOIN_GROUP_WITHOUT_ANY_CONTACT(33),
    NEEDS_RCS_REPROVISION(34),
    GROUP_NOT_FOUND(35),
    USER_NOT_IN_GROUP(36),
    USER_IS_NOT_ADMIN(37),
    AUTO_REG_RESTRICTED_GAIA(38),
    NEEDS_TACHYGRAM_REGISTER(39),
    DESTINATION_NON_RCS(40),
    ADD_PN_RESTRICTED_INELIGIBLE_MIGRATION(41),
    ADD_PN_RESTRICTED_WPS_SYNCED(42),
    ADD_PN_RESTRICTED_WPS_REACHABLE(43),
    UNRECOGNIZED(-1);

    private final int T;

    asky(int i) {
        this.T = i;
    }

    public static asky b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return UNSPECIFIED;
            case 2:
                return PREKEY_EXHAUSTED;
            case 3:
                return INVALID_PHONE_NUMBER;
            case 4:
                return REGISTRATION_NOT_FOUND;
            case 5:
                return REGISTRATION_UNAUTHENTICATED;
            case 6:
                return GROUP_USER_NOT_FOUND;
            case 7:
                return ACCOUNT_OTHER_GAIA_EXISTS;
            case 8:
            default:
                return null;
            case 9:
                return SIGN_IN_GAIA_ACCOUNT_NOT_FOUND;
            case 10:
                return GAIA_ID_REQUIRED;
            case 11:
                return REQUESTER_ID_UNAUTHENTICATED;
            case 12:
                return DESTINATION_NOT_FOUND;
            case 13:
                return GAIA_PRIMIARY_EMAIL_NOT_FOUND;
            case 14:
                return GAIA_ID_MISMATCH;
            case 15:
                return DEST_NOT_PAIRED;
            case 16:
                return GAIA_ACCOUNT_AT_MOST_ONE_NUMBER_ALLOWED;
            case 17:
                return TOO_MANY_CONTACT_ACTIONS_IN_REQUEST;
            case 18:
                return CONTACT_SOURCE_REQUIRED;
            case 19:
                return CONTACT_SOURCE_NOT_FOUND;
            case 20:
                return GAIA_EMAIL_MISMATCH;
            case 21:
                return MULTIPLE_GAIA_ACCOUNTS_FOUND;
            case 22:
                return UNREGISTER_REGISTRATIONS_PARTIAL_FAILURE;
            case 23:
                return USER_ID_NOT_OWNED_BY_REGISTRATION;
            case 24:
                return UNICORN_ACCOUNT_RESTRICTED;
            case 25:
                return GAIA_ACCOUNT_DOWNGRADED;
            case 26:
                return TOO_MANY_MUTATIONS_IN_REQUEST;
            case 27:
                return DASHER_ACCOUNT_RESTRICTED;
            case 28:
                return CANNOT_ADD_BLOCKER_TO_GROUP;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return DESTINATION_REGISTRATION_NOT_FOUND;
            case 30:
                return REG_GAIA_SILENT_PN_NOT_FOUND;
            case 31:
                return REG_GAIA_SILENT_CONFLICT_GAIA_ONLY;
            case 32:
                return INVALID_IDENTITY_PROOF;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                return CANNOT_JOIN_GROUP_WITHOUT_ANY_CONTACT;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                return NEEDS_RCS_REPROVISION;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                return GROUP_NOT_FOUND;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                return USER_NOT_IN_GROUP;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                return USER_IS_NOT_ADMIN;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                return AUTO_REG_RESTRICTED_GAIA;
            case 39:
                return NEEDS_TACHYGRAM_REGISTER;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                return DESTINATION_NON_RCS;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                return ADD_PN_RESTRICTED_INELIGIBLE_MIGRATION;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                return ADD_PN_RESTRICTED_WPS_SYNCED;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                return ADD_PN_RESTRICTED_WPS_REACHABLE;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.T;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
