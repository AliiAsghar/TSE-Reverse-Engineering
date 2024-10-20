package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wfn implements apak {
    FI_MULTI_SYNC_STATUS_UNSPECIFIED(0),
    FI_MULTI_SYNC_STATUS_ENABLED(1),
    FI_MULTI_SYNC_STATUS_DISABLED(2),
    UNRECOGNIZED(-1);

    public static final apal e = new whn(1);
    private final int g;

    wfn(int i) {
        this.g = i;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
