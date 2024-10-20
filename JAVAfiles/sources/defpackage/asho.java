package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum asho implements apak {
    UNKNOWN_CLOUD_SYNC_STATUS(0),
    NOT_ENABLED(1),
    ENABLED(2),
    IN_INITIAL_SYNC(3);

    public final int e;

    asho(int i) {
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
