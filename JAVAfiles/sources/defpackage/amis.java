package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amis implements apak {
    UNKNOWN_TYPE(0),
    RCS(1),
    C11N(2),
    NOT_SET_YET(3),
    C11N_RCS(4);

    public final int f;

    amis(int i) {
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
