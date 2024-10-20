package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum askz implements apak {
    UNKNOWN(0),
    REGISTER_PUSH_DEPRECATED(1),
    UNREGISTER_PUSH_DEPRECATED(2),
    CHANGE_PROFILE_PUSH(3),
    CHANGE_PRESENCE_PUSH(4),
    REGISTRATION_CHANGE_PUSH_DEPRECATED(5),
    NEED_PRE_KEYS_PUSH(6),
    CROSS_APP_CHANGE_PROFILE_PUSH(7),
    GAIA_ID_INVALID_PUSH(8),
    CHANGE_ACCOUNT_INFO_PUSH(9),
    SET_CONTACTS_PUSH(10),
    ADD_CONTACTS_PUSH(11),
    REMOVE_CONTACTS_PUSH(12),
    BLOCK_USERS_PUSH(13),
    UNBLOCK_USERS_PUSH(14),
    NEED_BLOCKS_SYNC_PUSH(15),
    INVITEE_MESSAGE(16),
    NEW_CONTACT_SOURCES_PUSH(17),
    STATE_UPDATED_PUSH(18),
    NEED_STATE_SYNC_PUSH(19),
    UNRECOGNIZED(-1);

    private final int w;

    askz(int i) {
        this.w = i;
    }

    public static askz b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return REGISTER_PUSH_DEPRECATED;
            case 2:
                return UNREGISTER_PUSH_DEPRECATED;
            case 3:
                return CHANGE_PROFILE_PUSH;
            case 4:
                return CHANGE_PRESENCE_PUSH;
            case 5:
                return REGISTRATION_CHANGE_PUSH_DEPRECATED;
            case 6:
                return NEED_PRE_KEYS_PUSH;
            case 7:
                return CROSS_APP_CHANGE_PROFILE_PUSH;
            case 8:
                return GAIA_ID_INVALID_PUSH;
            case 9:
                return CHANGE_ACCOUNT_INFO_PUSH;
            case 10:
                return SET_CONTACTS_PUSH;
            case 11:
                return ADD_CONTACTS_PUSH;
            case 12:
                return REMOVE_CONTACTS_PUSH;
            case 13:
                return BLOCK_USERS_PUSH;
            case 14:
                return UNBLOCK_USERS_PUSH;
            case 15:
                return NEED_BLOCKS_SYNC_PUSH;
            case 16:
                return INVITEE_MESSAGE;
            case 17:
                return NEW_CONTACT_SOURCES_PUSH;
            case 18:
                return STATE_UPDATED_PUSH;
            case 19:
                return NEED_STATE_SYNC_PUSH;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.w;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
