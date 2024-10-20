package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum nht implements apak {
    VMT_STATUS_UNKNOWN(0),
    VMT_STATUS_QUEUED(1),
    VMT_STATUS_IN_PROGRESS(2),
    VMT_STATUS_COMPLETE(3),
    VMT_STATUS_ERROR_UNKNOWN(4),
    VMT_STATUS_ERROR_TEMPORARY(5),
    VMT_STATUS_ERROR_PERMANENT(6),
    UNRECOGNIZED(-1);

    private final int j;

    nht(int i2) {
        this.j = i2;
    }

    public static nht b(int i2) {
        switch (i2) {
            case 0:
                return VMT_STATUS_UNKNOWN;
            case 1:
                return VMT_STATUS_QUEUED;
            case 2:
                return VMT_STATUS_IN_PROGRESS;
            case 3:
                return VMT_STATUS_COMPLETE;
            case 4:
                return VMT_STATUS_ERROR_UNKNOWN;
            case 5:
                return VMT_STATUS_ERROR_TEMPORARY;
            case 6:
                return VMT_STATUS_ERROR_PERMANENT;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
