package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amkk implements apak {
    UNKNOWN_PREKEY_STATE(0),
    SUFFICIENT_PREKEYS(1),
    LOW_PREKEYS(2);

    public final int d;

    amkk(int i) {
        this.d = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
