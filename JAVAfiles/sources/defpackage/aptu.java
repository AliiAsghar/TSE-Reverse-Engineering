package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aptu implements apak {
    TACHYGRAM_ERROR_UNSPECIFIED(0),
    TACHYGRAM_ERROR_CANCELLED(1),
    TACHYGRAM_ERROR_UNKNOWN(2),
    TACHYGRAM_ERROR_INVALID_ARGUMENT(3),
    TACHYGRAM_ERROR_DEADLINE_EXCEEDED(4),
    TACHYGRAM_ERROR_NOT_FOUND(5),
    TACHYGRAM_ERROR_ALREADY_EXISTS(6),
    TACHYGRAM_ERROR_PERMISSION_DENIED(7),
    TACHYGRAM_ERROR_RESOURCE_EXHAUSTED(8),
    TACHYGRAM_ERROR_FAILED_PRECONDITION(9),
    TACHYGRAM_ERROR_ABORTED(10),
    TACHYGRAM_ERROR_OUT_OF_RANGE(11),
    TACHYGRAM_ERROR_UNIMPLEMENTED(12),
    TACHYGRAM_ERROR_INTERNAL(13),
    TACHYGRAM_ERROR_UNAVAILABLE(14),
    TACHYGRAM_ERROR_DATA_LOSS(15),
    TACHYGRAM_ERROR_UNAUTHENTICATED(16),
    TACHYGRAM_ERROR_TACHYGRAM_INTERNAL(17),
    UNRECOGNIZED(-1);

    private final int u;

    aptu(int i) {
        this.u = i;
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
