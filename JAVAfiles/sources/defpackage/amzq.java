package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amzq implements apak {
    UNKNOWN_SPAM_ERROR(0),
    UNEXPECTED_ERROR_TYPE(1),
    RPC_CANCELLED(2),
    RPC_UNKNOWN(3),
    RPC_INVALID_ARGUMENT(4),
    RPC_DEADLINE_EXCEEDED(5),
    RPC_NOT_FOUND(6),
    RPC_ALREADY_EXISTS(7),
    RPC_PERMISSION_DENIED(8),
    RPC_RESOURCE_EXHAUSTED(9),
    RPC_FAILED_PRECONDITION(10),
    RPC_ABORTED(11),
    RPC_OUT_OF_RANGE(12),
    RPC_UNIMPLEMENTED(13),
    RPC_INTERNAL(14),
    RPC_UNAVAILABLE(15),
    RPC_DATA_LOSS(16),
    RPC_UNAUTHENTICATED(17),
    UNRECOGNIZED(-1);

    private final int u;

    amzq(int i) {
        this.u = i;
    }

    public static amzq b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SPAM_ERROR;
            case 1:
                return UNEXPECTED_ERROR_TYPE;
            case 2:
                return RPC_CANCELLED;
            case 3:
                return RPC_UNKNOWN;
            case 4:
                return RPC_INVALID_ARGUMENT;
            case 5:
                return RPC_DEADLINE_EXCEEDED;
            case 6:
                return RPC_NOT_FOUND;
            case 7:
                return RPC_ALREADY_EXISTS;
            case 8:
                return RPC_PERMISSION_DENIED;
            case 9:
                return RPC_RESOURCE_EXHAUSTED;
            case 10:
                return RPC_FAILED_PRECONDITION;
            case 11:
                return RPC_ABORTED;
            case 12:
                return RPC_OUT_OF_RANGE;
            case 13:
                return RPC_UNIMPLEMENTED;
            case 14:
                return RPC_INTERNAL;
            case 15:
                return RPC_UNAVAILABLE;
            case 16:
                return RPC_DATA_LOSS;
            case 17:
                return RPC_UNAUTHENTICATED;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.u;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
