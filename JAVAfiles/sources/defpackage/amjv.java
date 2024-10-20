package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amjv implements apak {
    UNKNOWN_STATUS(0),
    BINDING_STARTED(1),
    FIRST_DATA_RECEIVED(2),
    ON_COMPLETE(3),
    ON_ERROR(4);

    public final int f;

    amjv(int i) {
        this.f = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
