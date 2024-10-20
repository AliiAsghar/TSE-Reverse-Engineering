package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum anft implements apak {
    UNKNOWN(0),
    ACTIVE(1),
    ARCHIVED(2),
    DELETED(3),
    KEEP_ARCHIVED(4),
    SPAM_FOLDER(5),
    BLOCKED_FOLDER(6),
    CROSS_COUNTRY_FOLDER(7),
    UNRECOGNIZED(-1);

    private final int k;

    anft(int i) {
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
