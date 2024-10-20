package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amti implements apak {
    COMPOSE_TYPE_UNSPECIFIED(0),
    TEXT(1),
    AUDIO(2),
    VIDEO(3);

    public final int e;

    amti(int i) {
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
