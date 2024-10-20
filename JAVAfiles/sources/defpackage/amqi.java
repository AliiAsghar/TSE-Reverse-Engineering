package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amqi implements apak {
    UNKNOWN_COMPOSE_SCREEN_MODE(0),
    COLLAPSED(1),
    EXPANDED(2),
    FULL_SCREEN(3);

    public final int e;

    amqi(int i) {
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
