package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aphm implements apak {
    UNKNOWN_SERVICE(0),
    UNEXPECTED_SERVICE(1),
    CPM_SESSION_SERVICE(2),
    CPM_PAGER_MODE_SERVICE(3),
    CPM_LARGE_MESSAGE_MODE_SERVICE(4);

    public final int f;

    aphm(int i) {
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
