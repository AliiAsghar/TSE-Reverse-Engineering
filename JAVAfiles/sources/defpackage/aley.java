package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aley implements apak {
    OS(0),
    ARCH(1),
    BOARD_NAME(2),
    PRODUCT_NAME(3),
    SYSTEM_VERSION(4),
    APP_VERSION(10),
    CHANNEL(5),
    BUILD_TYPE(7),
    EXPERIMENT_IDS(9),
    UNRECOGNIZED(-1);

    private final int l;

    aley(int i) {
        this.l = i;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
