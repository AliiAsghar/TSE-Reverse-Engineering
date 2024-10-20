package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum anhe implements apak {
    ALERT_TYPE_UNKNOWN(0),
    BROWSER_INACTIVE(1),
    BROWSER_INACTIVE_FROM_TIMEOUT(7),
    BROWSER_INACTIVE_FROM_INACTIVITY(8),
    BROWSER_ACTIVE(2),
    MOBILE_DATA_CONNECTION(3),
    MOBILE_WIFI_CONNECTION(4),
    BATTERY_LOW(5),
    BATTERY_RESTORED(6),
    RCS_CONNECTION(9),
    OBSERVER_REGISTERED(10),
    DATABASE_IS_SYNCING(11),
    DATABASE_SYNC_COMPLETED(12),
    DATABASE_SYNC_STARTED(13),
    DATABASE_PARTIAL_SYNC_COMPLETED(14),
    DATABASE_PARTIAL_SYNC_STARTED(15),
    CONTACTS_REFRESH_STARTED(16),
    CONTACTS_REFRESH_COMPLETED(17),
    DISCONNECTED_FROM_SATELLITE(18),
    BR_MESSAGE_RESTORING(19),
    BR_MESSAGE_RESTORE_COMPLETED(20),
    BR_MESSAGE_RESTORE_STARTED(21),
    UNRECOGNIZED(-1);

    private final int y;

    anhe(int i) {
        this.y = i;
    }

    public static anhe b(int i) {
        switch (i) {
            case 0:
                return ALERT_TYPE_UNKNOWN;
            case 1:
                return BROWSER_INACTIVE;
            case 2:
                return BROWSER_ACTIVE;
            case 3:
                return MOBILE_DATA_CONNECTION;
            case 4:
                return MOBILE_WIFI_CONNECTION;
            case 5:
                return BATTERY_LOW;
            case 6:
                return BATTERY_RESTORED;
            case 7:
                return BROWSER_INACTIVE_FROM_TIMEOUT;
            case 8:
                return BROWSER_INACTIVE_FROM_INACTIVITY;
            case 9:
                return RCS_CONNECTION;
            case 10:
                return OBSERVER_REGISTERED;
            case 11:
                return DATABASE_IS_SYNCING;
            case 12:
                return DATABASE_SYNC_COMPLETED;
            case 13:
                return DATABASE_SYNC_STARTED;
            case 14:
                return DATABASE_PARTIAL_SYNC_COMPLETED;
            case 15:
                return DATABASE_PARTIAL_SYNC_STARTED;
            case 16:
                return CONTACTS_REFRESH_STARTED;
            case 17:
                return CONTACTS_REFRESH_COMPLETED;
            case 18:
                return DISCONNECTED_FROM_SATELLITE;
            case 19:
                return BR_MESSAGE_RESTORING;
            case 20:
                return BR_MESSAGE_RESTORE_COMPLETED;
            case 21:
                return BR_MESSAGE_RESTORE_STARTED;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
