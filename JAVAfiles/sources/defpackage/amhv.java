package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amhv implements apak {
    UNKNOWN_UNINITIALIZED_REASON(0),
    UNINITIALIZED_REASON_NO_FAILURE(1),
    UNINITIALIZED_REASON_INTERRUPTED(2),
    UNINITIALIZED_REASON_DISCONNECTED(3),
    UNINITIALIZED_REASON_ENGINE_EXCEPTION(4),
    UNINITIALIZED_REASON_RUNNABLE_EXCEPTION(5),
    UNINITIALIZED_REASON_WEAR(6),
    UNINITIALIZED_REASON_INVALID_REGISTRATION(7),
    UNINITIALIZED_REASON_CONNECTION_TIMEOUT(8);

    public final int j;

    amhv(int i) {
        this.j = i;
    }

    public static amhv b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_UNINITIALIZED_REASON;
            case 1:
                return UNINITIALIZED_REASON_NO_FAILURE;
            case 2:
                return UNINITIALIZED_REASON_INTERRUPTED;
            case 3:
                return UNINITIALIZED_REASON_DISCONNECTED;
            case 4:
                return UNINITIALIZED_REASON_ENGINE_EXCEPTION;
            case 5:
                return UNINITIALIZED_REASON_RUNNABLE_EXCEPTION;
            case 6:
                return UNINITIALIZED_REASON_WEAR;
            case 7:
                return UNINITIALIZED_REASON_INVALID_REGISTRATION;
            case 8:
                return UNINITIALIZED_REASON_CONNECTION_TIMEOUT;
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
