package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum ahqh implements apak {
    DELAY_UNSPECIFIED(0),
    DELAY_10MS(1),
    DELAY_100MS(2),
    DELAY_250MS(3),
    DELAY_500MS(4);

    public final int f;

    ahqh(int i) {
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
