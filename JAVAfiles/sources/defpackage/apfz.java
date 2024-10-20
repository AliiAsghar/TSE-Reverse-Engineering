package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apfz implements apak {
    RCS_UPTIME_IGNORE_REASON_UNKNOWN(0),
    RCS_UPTIME_IGNORE_NO_VALID_CONFIG(1),
    RCS_UPTIME_IGNORE_NO_NETWORK_CONNECTIVITY(2),
    RCS_UPTIME_IGNORE_NO_SIM(3),
    RCS_UPTIME_IGNORE_DISABLED_VIA_PREFERENCES(4),
    RCS_UPTIME_IGNORE_DEVICE_SHUTDOWN(5),
    RCS_UPTIME_IGNORE_MISSING_PERMISSION(6),
    RCS_UPTIME_IGNORE_BLOCKED_NETWORK(7),
    RCS_UPTIME_IGNORE_SIP_DISABLED_BY_BUGLE(8);

    public final int j;

    apfz(int i) {
        this.j = i;
    }

    public static apfz b(int i) {
        switch (i) {
            case 0:
                return RCS_UPTIME_IGNORE_REASON_UNKNOWN;
            case 1:
                return RCS_UPTIME_IGNORE_NO_VALID_CONFIG;
            case 2:
                return RCS_UPTIME_IGNORE_NO_NETWORK_CONNECTIVITY;
            case 3:
                return RCS_UPTIME_IGNORE_NO_SIM;
            case 4:
                return RCS_UPTIME_IGNORE_DISABLED_VIA_PREFERENCES;
            case 5:
                return RCS_UPTIME_IGNORE_DEVICE_SHUTDOWN;
            case 6:
                return RCS_UPTIME_IGNORE_MISSING_PERMISSION;
            case 7:
                return RCS_UPTIME_IGNORE_BLOCKED_NETWORK;
            case 8:
                return RCS_UPTIME_IGNORE_SIP_DISABLED_BY_BUGLE;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
