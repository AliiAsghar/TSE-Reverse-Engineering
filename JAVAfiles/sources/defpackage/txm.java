package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum txm implements apak {
    UNKNOWN_DECRYPT_STATE(0),
    UNTRUSTED_IDENTITY_KEY(1),
    UNTRUSTED_USER_ID(2),
    FAIL_TO_DECRYPT(3),
    DECRYPT_SUCCESS(4),
    UNRECOGNIZED(-1);

    private final int h;

    txm(int i) {
        this.h = i;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
