package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aptr implements apak {
    ERROR_RECOVERY_TYPE_UNSPECIFIED(0),
    ERROR_NO_RETRY(1),
    ERROR_RETRY_IMMEDIATE(2),
    ERROR_RETRY_REFRESH_REGISTRATION(3),
    ERROR_RETRY_NEEDS_REPROVISION(4),
    ERROR_RETRY_NEEDS_GROUP_RECREATION(5),
    ERROR_REMOVE_SELF_FROM_GROUP(6),
    ERROR_DESTINATION_NOT_TACHYGRAM(7),
    UNRECOGNIZED(-1);

    private final int k;

    aptr(int i) {
        this.k = i;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
