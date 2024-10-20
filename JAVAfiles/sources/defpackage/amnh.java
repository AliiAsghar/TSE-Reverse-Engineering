package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amnh implements apak {
    UNKNOWN_HEURISTIC(0),
    BUGLE_TELEPHONY_MESSAGE_COUNT_DISCREPANCY(1),
    DRM_TABLE_ENTRY_LOST(2),
    PART_TABLE_ENTRY_LOST(3);

    public final int e;

    amnh(int i) {
        this.e = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
