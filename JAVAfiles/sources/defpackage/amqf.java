package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amqf implements apak {
    UNKNOWN_OPENING_STATE(0),
    LOADED(1),
    FAILED_TO_LOAD(2),
    PREVIOUSLY_LOADED(3),
    INTERRUPTED(4);

    public final int f;

    amqf(int i) {
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
