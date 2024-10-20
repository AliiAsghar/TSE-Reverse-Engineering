package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amkl implements apak {
    UNKNOWN_TACHYON_STATE(0),
    NOT_REGISTERED(1),
    REGISTERED_WITHOUT_PREKEYS(2),
    REGISTERED_WITH_PREKEYS(3);

    public final int e;

    amkl(int i) {
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
