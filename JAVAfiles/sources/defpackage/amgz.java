package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amgz implements apak {
    UNKNOWN_BUGLE_MMS_FAILURE_CODE(0),
    MMS_ERROR_UNSPECIFIED(1),
    MMS_ERROR_INVALID_APN(2),
    MMS_ERROR_UNABLE_CONNECT_MMS(3),
    MMS_ERROR_HTTP_FAILURE(4),
    MMS_ERROR_IO_ERROR(5),
    MMS_ERROR_RETRY(6),
    MMS_ERROR_CONFIGURATION_ERROR(7),
    MMS_ERROR_NO_DATA_NETWORK(8);

    public final int j;

    amgz(int i) {
        this.j = i;
    }

    public static amgz b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_BUGLE_MMS_FAILURE_CODE;
            case 1:
                return MMS_ERROR_UNSPECIFIED;
            case 2:
                return MMS_ERROR_INVALID_APN;
            case 3:
                return MMS_ERROR_UNABLE_CONNECT_MMS;
            case 4:
                return MMS_ERROR_HTTP_FAILURE;
            case 5:
                return MMS_ERROR_IO_ERROR;
            case 6:
                return MMS_ERROR_RETRY;
            case 7:
                return MMS_ERROR_CONFIGURATION_ERROR;
            case 8:
                return MMS_ERROR_NO_DATA_NETWORK;
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
