package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amgr implements apak {
    UNKNOWN_PRIORITY(0),
    LOW_PRIORITY(1),
    NORMAL_PRIORITY(2),
    HIGH_PRIORITY(3);

    public final int e;

    amgr(int i) {
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
